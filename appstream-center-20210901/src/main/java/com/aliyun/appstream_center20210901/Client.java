// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "appstream-center";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
     * <p>Sets the execution time settings for an OTA upgrade.</p>
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
     * <p>Sets the execution time settings for an OTA upgrade.</p>
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
     * <p>This operation manages user authorization for an app instance group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization relationships of other applications in the app instance group. To authorize users for the entire app instance group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The app instance group is created, and <strong>the application specified by AppId is deployed in the image used by the app instance group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The app instance group <strong>is not added to an active app instance group set</strong>. App instance groups added to a set cannot be authorized individually and must be authorized through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the app instance group belongs is an AD workspace, <strong>UserMeta must be specified</strong>, the value of <code>UserMeta.Type</code> must be <code>ad</code>, and the value of <code>UserMeta.AdDomain</code> must be the same as the AD domain bound to the workspace.</li>
     * <li>If the app instance group has been authorized through a user group and mixed authorization of users and user groups is not supported, you cannot authorize individual users. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>Specify at least one of AuthorizeUserIds and UnAuthorizeUserIds</strong>, or specify both. If both are empty, no authorization relationships are changed when you invoke this operation.</li>
     * <li>When adding authorization, the sum of the current number of authorized users for the application and the number of newly added users cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorization is not subject to the quota limit.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the app instance group ID (AppInstanceGroupId) and the application IDs of the applications deployed in the app instance group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or whose authorization is to be removed.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users will receive a notification email. Generally, it takes about 2 minutes for the changes to take effect on the terminal.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Adds or removes authorized users for a specified application deployed in an app instance group. Only authorized users can access the application.</p>
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
     * <p>This operation manages user authorization for an app instance group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization relationships of other applications in the app instance group. To authorize users for the entire app instance group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The app instance group is created, and <strong>the application specified by AppId is deployed in the image used by the app instance group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The app instance group <strong>is not added to an active app instance group set</strong>. App instance groups added to a set cannot be authorized individually and must be authorized through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the app instance group belongs is an AD workspace, <strong>UserMeta must be specified</strong>, the value of <code>UserMeta.Type</code> must be <code>ad</code>, and the value of <code>UserMeta.AdDomain</code> must be the same as the AD domain bound to the workspace.</li>
     * <li>If the app instance group has been authorized through a user group and mixed authorization of users and user groups is not supported, you cannot authorize individual users. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>Specify at least one of AuthorizeUserIds and UnAuthorizeUserIds</strong>, or specify both. If both are empty, no authorization relationships are changed when you invoke this operation.</li>
     * <li>When adding authorization, the sum of the current number of authorized users for the application and the number of newly added users cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorization is not subject to the quota limit.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the app instance group ID (AppInstanceGroupId) and the application IDs of the applications deployed in the app instance group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or whose authorization is to be removed.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users will receive a notification email. Generally, it takes about 2 minutes for the changes to take effect on the terminal.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Adds or removes authorized users for a specified application deployed in an app instance group. Only authorized users can access the application.</p>
     * 
     * @param request AuthorizeUsersForAppRequest
     * @return AuthorizeUsersForAppResponse
     */
    public AuthorizeUsersForAppResponse authorizeUsersForApp(AuthorizeUsersForAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeUsersForAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures third-party channels for multiple agent runtimes in batches, supports delivering different channel configurations to different runtimes, and returns the configuration result for each configuration item.</p>
     * 
     * @param request BatchConfigRuntimeChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchConfigRuntimeChannelResponse
     */
    public BatchConfigRuntimeChannelResponse batchConfigRuntimeChannelWithOptions(BatchConfigRuntimeChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            body.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            body.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelConfigs)) {
            body.put("ChannelConfigs", request.channelConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            body.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchConfigRuntimeChannel"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchConfigRuntimeChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures third-party channels for multiple agent runtimes in batches, supports delivering different channel configurations to different runtimes, and returns the configuration result for each configuration item.</p>
     * 
     * @param request BatchConfigRuntimeChannelRequest
     * @return BatchConfigRuntimeChannelResponse
     */
    public BatchConfigRuntimeChannelResponse batchConfigRuntimeChannel(BatchConfigRuntimeChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchConfigRuntimeChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create model templates in batches under a model provider template in the Wuying Agent Management Center. This allows you to add multiple models at a time and specify one of them as the default model. Existing models are automatically skipped to prevent duplicate model creation. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you use this API.</p>
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
     * <p>You can create model templates in batches under a model provider template in the Wuying Agent Management Center. This allows you to add multiple models at a time and specify one of them as the default model. Existing models are automatically skipped to prevent duplicate model creation. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you use this API.</p>
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
     * <p>Before you call this operation, make sure that the parent image is available and an available image distribution record exists in the creation region.</p>
     * <ol>
     * <li>Call ListImage to obtain the parent image ID.</li>
     * <li>Specify the creation mode, cloud disk capacity, and resource type, and then call this operation.</li>
     * <li>Save the returned ImageId, VersionId, and TaskId.</li>
     * <li>Call GetTask to query the creation progress. <strong>A successful request does not indicate that the image creation is complete.</strong></li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom image based on an existing image and starts an image creation task.</p>
     * 
     * @param tmpReq BuilderImageByParentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuilderImageByParentResponse
     */
    public BuilderImageByParentResponse builderImageByParentWithOptions(BuilderImageByParentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BuilderImageByParentShrinkRequest request = new BuilderImageByParentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.propertyMap)) {
            request.propertyMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.propertyMap, "PropertyMap", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            body.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distro)) {
            body.put("Distro", request.distro);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverIdList)) {
            body.put("DriverIdList", request.driverIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCreateMode)) {
            body.put("ImageCreateMode", request.imageCreateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            body.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            body.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentImageId)) {
            body.put("ParentImageId", request.parentImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.performanceType)) {
            body.put("PerformanceType", request.performanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyMapShrink)) {
            body.put("PropertyMap", request.propertyMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceList)) {
            body.put("ResourceList", request.resourceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            body.put("RunMode", request.runMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            body.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            body.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdList)) {
            body.put("VSwitchIdList", request.vSwitchIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            body.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuilderImageByParent"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuilderImageByParentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the parent image is available and an available image distribution record exists in the creation region.</p>
     * <ol>
     * <li>Call ListImage to obtain the parent image ID.</li>
     * <li>Specify the creation mode, cloud disk capacity, and resource type, and then call this operation.</li>
     * <li>Save the returned ImageId, VersionId, and TaskId.</li>
     * <li>Call GetTask to query the creation progress. <strong>A successful request does not indicate that the image creation is complete.</strong></li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom image based on an existing image and starts an image creation task.</p>
     * 
     * @param request BuilderImageByParentRequest
     * @return BuilderImageByParentResponse
     */
    public BuilderImageByParentResponse builderImageByParent(BuilderImageByParentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.builderImageByParentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call <code>ListAgentInstanceMemory</code> to query the target instance ID and the associated user. <strong>Verify the instance and user before clearing the memory.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Clears the memory of a specified agent instance.</p>
     * 
     * @param request ClearAgentInstanceMemoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearAgentInstanceMemoryResponse
     */
    public ClearAgentInstanceMemoryResponse clearAgentInstanceMemoryWithOptions(ClearAgentInstanceMemoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentInstanceId)) {
            body.put("AgentInstanceId", request.agentInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearAgentInstanceMemory"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearAgentInstanceMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call <code>ListAgentInstanceMemory</code> to query the target instance ID and the associated user. <strong>Verify the instance and user before clearing the memory.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Clears the memory of a specified agent instance.</p>
     * 
     * @param request ClearAgentInstanceMemoryRequest
     * @return ClearAgentInstanceMemoryResponse
     */
    public ClearAgentInstanceMemoryResponse clearAgentInstanceMemory(ClearAgentInstanceMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearAgentInstanceMemoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can assign a model group to the resource group to which agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center belong. The assigned model group serves as the inference engine for agents in the resource group to execute tasks.
     * If an agent runtime is configured with a model group and its resource group is also configured with a model group, the model group bound to the resource group takes effect. That is, the resource group settings take precedence over the agent runtime settings.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The ResourceGroupId parameter in this operation specifically refers to the WUYING Enterprise Edition resource group ID, which starts with rg-. This resource group is managed by the WUYING Enterprise Edition control service and must be created before you deploy agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent. You do not need to and cannot create it by using the API of this service. Although the account-level resource group ID in Alibaba Cloud Resource Manager also starts with rg-, it does not belong to WUYING resource groups and cannot be passed as this parameter.</li>
     * <li>Before you call this operation, obtain an existing WUYING resource group ID by using one of the following methods:<ul>
     * <li>Call the DescribeResourceGroups operation of WUYING Cloud Desktop eds-user (API version 2021-03-08). The ResourceGroup[].ResourceGroupId field in the response is the resource group ID required for this parameter. You can set the ResourceClassification request parameter to DesktopAgent and filter agent resource groups by AgentType (JVSClaw or HermesAgent). The AliyunResourceGroupId field in the response is the resource group ID of Alibaba Cloud Resource Manager and cannot be used in this operation.</li>
     * <li>Call the GetRuntimeModelConfig operation of this service. The Data.ResourceGroupId field in the response is the WUYING resource group ID to which the specified agent runtime currently belongs. If the runtime does not belong to any resource group, this field is null.</li>
     * <li>When you call the ListDesktopAgentRuntime operation of this service, you can use the ResourceGroupId request parameter to filter agent runtimes by resource group to confirm which runtimes are included in a specific resource group.</li>
     * </ul>
     * </li>
     * <li>The ListModelTemplateResourceGroup operation returns only the resource groups that have been authorized for a specified model group. It cannot be used to discover resource groups that have not been authorized for any model group.
     * Make sure that you are fully familiar with the operations and usage of the WUYING Agent Management Center before you use this operation.</li>
     * </ul>
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
     * <p>You can assign a model group to the resource group to which agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center belong. The assigned model group serves as the inference engine for agents in the resource group to execute tasks.
     * If an agent runtime is configured with a model group and its resource group is also configured with a model group, the model group bound to the resource group takes effect. That is, the resource group settings take precedence over the agent runtime settings.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The ResourceGroupId parameter in this operation specifically refers to the WUYING Enterprise Edition resource group ID, which starts with rg-. This resource group is managed by the WUYING Enterprise Edition control service and must be created before you deploy agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent. You do not need to and cannot create it by using the API of this service. Although the account-level resource group ID in Alibaba Cloud Resource Manager also starts with rg-, it does not belong to WUYING resource groups and cannot be passed as this parameter.</li>
     * <li>Before you call this operation, obtain an existing WUYING resource group ID by using one of the following methods:<ul>
     * <li>Call the DescribeResourceGroups operation of WUYING Cloud Desktop eds-user (API version 2021-03-08). The ResourceGroup[].ResourceGroupId field in the response is the resource group ID required for this parameter. You can set the ResourceClassification request parameter to DesktopAgent and filter agent resource groups by AgentType (JVSClaw or HermesAgent). The AliyunResourceGroupId field in the response is the resource group ID of Alibaba Cloud Resource Manager and cannot be used in this operation.</li>
     * <li>Call the GetRuntimeModelConfig operation of this service. The Data.ResourceGroupId field in the response is the WUYING resource group ID to which the specified agent runtime currently belongs. If the runtime does not belong to any resource group, this field is null.</li>
     * <li>When you call the ListDesktopAgentRuntime operation of this service, you can use the ResourceGroupId request parameter to filter agent runtimes by resource group to confirm which runtimes are included in a specific resource group.</li>
     * </ul>
     * </li>
     * <li>The ListModelTemplateResourceGroup operation returns only the resource groups that have been authorized for a specified model group. It cannot be used to discover resource groups that have not been authorized for any model group.
     * Make sure that you are fully familiar with the operations and usage of the WUYING Agent Management Center before you use this operation.</li>
     * </ul>
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
     * <p>You can configure third-party channels for agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended agent communication methods in addition to the AgentIM channel.
     * Before you call this operation, make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures third-party channels for agent runtimes.</p>
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
     * <p>You can configure third-party channels for agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended agent communication methods in addition to the AgentIM channel.
     * Before you call this operation, make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures third-party channels for agent runtimes.</p>
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
     * <p>You can authorize model groups for agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center to serve as inference engines for agent task execution.
     * Before you call this operation, make sure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the model group for agent runtime resources.</p>
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
     * <p>You can authorize model groups for agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center to serve as inference engines for agent task execution.
     * Before you call this operation, make sure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the model group for agent runtime resources.</p>
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
     * <p>Only custom images and community images manageable by the current account are supported. If VersionId is omitted, the current active version of the image is used. If specified, it must belong to the image corresponding to ImageId.
     * Call ListImage first to select an image. After creation, save the returned AppId, AppVersionId, ImageId, and VersionId. To dissociate the application, call UnbindApp.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application and binds the application to a specified image version.</p>
     * 
     * @param request CreateAndBindAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndBindAppResponse
     */
    public CreateAndBindAppResponse createAndBindAppWithOptions(CreateAndBindAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIconUrl)) {
            body.put("AppIconUrl", request.appIconUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originAppType)) {
            body.put("OriginAppType", request.originAppType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlSuffix)) {
            body.put("UrlSuffix", request.urlSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndBindApp"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndBindAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only custom images and community images manageable by the current account are supported. If VersionId is omitted, the current active version of the image is used. If specified, it must belong to the image corresponding to ImageId.
     * Call ListImage first to select an image. After creation, save the returned AppId, AppVersionId, ImageId, and VersionId. To dissociate the application, call UnbindApp.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application and binds the application to a specified image version.</p>
     * 
     * @param request CreateAndBindAppRequest
     * @return CreateAndBindAppResponse
     */
    public CreateAndBindAppResponse createAndBindApp(CreateAndBindAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAndBindAppWithOptions(request, runtime);
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
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>Prepare an available office network, image, and specifications in the target business region, and ensure that the account has the corresponding browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. You must set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot be both non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>You must explicitly set <code>SubPayType</code> to <code>mau</code>. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>You do not need to specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful API response does not indicate that the browser resources are ready.</strong> After creation, query the status of the browser group and use it only after confirming that it is connectable.
     * This operation creates a new cloud browser group and does not require a delivery group to be created in advance.</p>
     * <h2>Example descriptions</h2>
     * <p>Field examples are used to demonstrate how to specify values. Replace resource identifiers with the actual values under the current account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field is not required. When calling the API, omit the corresponding parameter and do not pass the <code>-</code> character.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud browser group billed by monthly active users (MAU).</p>
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
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>Prepare an available office network, image, and specifications in the target business region, and ensure that the account has the corresponding browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. You must set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot be both non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>You must explicitly set <code>SubPayType</code> to <code>mau</code>. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>You do not need to specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful API response does not indicate that the browser resources are ready.</strong> After creation, query the status of the browser group and use it only after confirming that it is connectable.
     * This operation creates a new cloud browser group and does not require a delivery group to be created in advance.</p>
     * <h2>Example descriptions</h2>
     * <p>Field examples are used to demonstrate how to specify values. Replace resource identifiers with the actual values under the current account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field is not required. When calling the API, omit the corresponding parameter and do not pass the <code>-</code> character.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud browser group billed by monthly active users (MAU).</p>
     * 
     * @param request CreateBrowserInstanceGroupRequest
     * @return CreateBrowserInstanceGroupResponse
     */
    public CreateBrowserInstanceGroupResponse createBrowserInstanceGroup(CreateBrowserInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBrowserInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates an export task and returns the task ID and initial status. The exported file is not returned synchronously.
     * After the task is created, save TaskId and call DescribeExportTasks to query the task status and progress. The recommended polling interval is 5 to 10 seconds. When the status is FINISHED, use the DownloadUrl in the latest query result to download the XLSX file. When the status is FAILED, check ErrorMsg and stop polling.
     * The task is valid for 24 hours after creation. The download URL has an independent signature validity period of up to 1 hour, which does not exceed the remaining validity period of the task. Query the latest URL before downloading. You cannot obtain a valid download URL after the task expires.
     * The WUYING server list export only accepts the filter fields listed in QueryParamJson. Pagination is controlled by the server. A single task can export up to 100,000 records. The cloud browser bookmarks and URL whitelist exports export the complete list of the target delivery group. This is not affected by the list search terms or the current page. The ownership and product type of the delivery group are verified before execution. Data is read in pages during execution, and no consistent snapshot is provided. A successful creation does not guarantee that subsequent verification, query, or file generation will succeed.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous export task to export the WUYING server list, user usage report, cloud browser bookmarks, or URL whitelist.</p>
     * 
     * @param request CreateExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTaskWithOptions(CreateExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportFields)) {
            body.put("ExportFields", request.exportFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryParamJson)) {
            body.put("QueryParamJson", request.queryParamJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExportTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates an export task and returns the task ID and initial status. The exported file is not returned synchronously.
     * After the task is created, save TaskId and call DescribeExportTasks to query the task status and progress. The recommended polling interval is 5 to 10 seconds. When the status is FINISHED, use the DownloadUrl in the latest query result to download the XLSX file. When the status is FAILED, check ErrorMsg and stop polling.
     * The task is valid for 24 hours after creation. The download URL has an independent signature validity period of up to 1 hour, which does not exceed the remaining validity period of the task. Query the latest URL before downloading. You cannot obtain a valid download URL after the task expires.
     * The WUYING server list export only accepts the filter fields listed in QueryParamJson. Pagination is controlled by the server. A single task can export up to 100,000 records. The cloud browser bookmarks and URL whitelist exports export the complete list of the target delivery group. This is not affected by the list search terms or the current page. The ownership and product type of the delivery group are verified before execution. Data is read in pages during execution, and no consistent snapshot is provided. A successful creation does not guarantee that subsequent verification, query, or file generation will succeed.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous export task to export the WUYING server list, user usage report, cloud browser bookmarks, or URL whitelist.</p>
     * 
     * @param request CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTask(CreateExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom image from a deployed WUYING instance to quickly create more WUYING instances with the same configurations and avoid repeated environment configurations.</p>
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
     * <p>Creates a custom image from a deployed WUYING instance to quickly create more WUYING instances with the same configurations and avoid repeated environment configurations.</p>
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
     * <p>Creates a new image by debugging a delivery group.</p>
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
     * <p>Creates a new image by debugging a delivery group.</p>
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
     * <p>You can create a model creation provider template under the model templates in the Wuying Agent Management Center to configure the connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that agents can invoke. The created model provider template is automatically associated with the specified model template. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you use this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model creation provider template.</p>
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
     * <p>You can create a model creation provider template under the model templates in the Wuying Agent Management Center to configure the connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that agents can invoke. The created model provider template is automatically associated with the specified model template. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you use this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model creation provider template.</p>
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
     * <p>You can create a model creation group in the Wuying Agent Management Center to manage the model service providers and model scopes that can be invoked by agents. After creation, you can attach the model creation group to a cloud computer as the inference engine configuration for agents to execute nodes. Ensure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a template for model creation.</p>
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
     * <p>You can create a model creation group in the Wuying Agent Management Center to manage the model service providers and model scopes that can be invoked by agents. After creation, you can attach the model creation group to a cloud computer as the inference engine configuration for agents to execute nodes. Ensure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a template for model creation.</p>
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
     * <p>Creates one or more workstations.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Determine the region where the workstation is located and specify BizRegionId. You can call ListZones to query the zones in the region. This operation does not return the office network ID.</li>
     * <li>Call ListImage to query the images applicable to the target workstation and obtain the ImageId.</li>
     * <li>Call ListNodeInstanceType to query the workstation specifications available for purchase in the target region, obtain the ServerInstanceType, and confirm that the specification supports the selected billing method.</li>
     * <li>To specify an office network, specify the OfficeSiteId available for the current account in the target region. If this parameter is not specified, the service attempts to reuse or create a default office network. Prepare a workstation logon password Password that meets the requirements. The image ID, specification, and office network ID cannot be used interchangeably.
     * <a href="~~ListZones~~">ListZones</a>
     * <a href="~~ListImage~~">ListImage</a>
     * <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a></li>
     * </ol>
     * <h3>Billing parameters</h3>
     * <ul>
     * <li>To use the subscription billing method, set ChargeType to PrePaid and specify both Period and PeriodUnit. Set SubPayType to prePaid. If SubPayType is not specified, the system selects the corresponding value based on the billing method.</li>
     * <li>The combination of Period and PeriodUnit specifies the subscription duration. For example, 1 and Month indicate a subscription duration of one month. The available subscription periods must comply with the sales rules of the target workstation specification.</li>
     * </ul>
     * <h3>Creation results and subsequent operations</h3>
     * <p><strong>A returned workstation ID does not indicate that the resource has been created.</strong> If AutoPay is set to false and the order is unpaid, the returned WuyingServerIdList contains the workstation IDs pre-allocated for this order, and the actual workstations are not yet created. Pay the order corresponding to the returned OrderId first, and then call ListWuyingServer to query the resources and their status. Do not use these IDs to perform deletion or other resource operations before the resources are actually created.
     * To associate the workstation with a virtual node pool, you must prepare an existing VirtualNodePoolId under the current account. This operation only associates existing node pools and does not create virtual node pools.
     * <a href="~~ListWuyingServer~~">ListWuyingServer</a></p>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more workstations.</p>
     * 
     * @param tmpReq CreateWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWuyingServerResponse
     */
    public CreateWuyingServerResponse createWuyingServerWithOptions(CreateWuyingServerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWuyingServerShrinkRequest request = new CreateWuyingServerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelConfig)) {
            request.modelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelConfig, "ModelConfig", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfigShrink)) {
            body.put("ModelConfig", request.modelConfigShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
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
     * <p>Creates one or more workstations.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Determine the region where the workstation is located and specify BizRegionId. You can call ListZones to query the zones in the region. This operation does not return the office network ID.</li>
     * <li>Call ListImage to query the images applicable to the target workstation and obtain the ImageId.</li>
     * <li>Call ListNodeInstanceType to query the workstation specifications available for purchase in the target region, obtain the ServerInstanceType, and confirm that the specification supports the selected billing method.</li>
     * <li>To specify an office network, specify the OfficeSiteId available for the current account in the target region. If this parameter is not specified, the service attempts to reuse or create a default office network. Prepare a workstation logon password Password that meets the requirements. The image ID, specification, and office network ID cannot be used interchangeably.
     * <a href="~~ListZones~~">ListZones</a>
     * <a href="~~ListImage~~">ListImage</a>
     * <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a></li>
     * </ol>
     * <h3>Billing parameters</h3>
     * <ul>
     * <li>To use the subscription billing method, set ChargeType to PrePaid and specify both Period and PeriodUnit. Set SubPayType to prePaid. If SubPayType is not specified, the system selects the corresponding value based on the billing method.</li>
     * <li>The combination of Period and PeriodUnit specifies the subscription duration. For example, 1 and Month indicate a subscription duration of one month. The available subscription periods must comply with the sales rules of the target workstation specification.</li>
     * </ul>
     * <h3>Creation results and subsequent operations</h3>
     * <p><strong>A returned workstation ID does not indicate that the resource has been created.</strong> If AutoPay is set to false and the order is unpaid, the returned WuyingServerIdList contains the workstation IDs pre-allocated for this order, and the actual workstations are not yet created. Pay the order corresponding to the returned OrderId first, and then call ListWuyingServer to query the resources and their status. Do not use these IDs to perform deletion or other resource operations before the resources are actually created.
     * To associate the workstation with a virtual node pool, you must prepare an existing VirtualNodePoolId under the current account. This operation only associates existing node pools and does not create virtual node pools.
     * <a href="~~ListWuyingServer~~">ListWuyingServer</a></p>
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
     * <p><em>Confirm the deletion scope first.</em>*</p>
     * <ul>
     * <li>If both ImageId and VersionId are specified: only dissociates the adaptation from the specified image version.</li>
     * <li>If ImageId and VersionId are not both specified: initiates the adaptation deletion process. The adaptation cannot be deleted if it is still referenced by multiple images. If the application has other adaptations, it cannot be deleted together with the application.
     * <strong>AdaptorId, AppVersionId, and AppId must be provided at the same time and correspond to the same application adaptation.</strong> Verify these identifiers through the application and image query results first.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified application adaptation or dissociates the adaptation from a specified image version.</p>
     * 
     * @param request DeleteAdaptorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAdaptorResponse
     */
    public DeleteAdaptorResponse deleteAdaptorWithOptions(DeleteAdaptorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptorId)) {
            body.put("AdaptorId", request.adaptorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAdaptor"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdaptorResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Confirm the deletion scope first.</em>*</p>
     * <ul>
     * <li>If both ImageId and VersionId are specified: only dissociates the adaptation from the specified image version.</li>
     * <li>If ImageId and VersionId are not both specified: initiates the adaptation deletion process. The adaptation cannot be deleted if it is still referenced by multiple images. If the application has other adaptations, it cannot be deleted together with the application.
     * <strong>AdaptorId, AppVersionId, and AppId must be provided at the same time and correspond to the same application adaptation.</strong> Verify these identifiers through the application and image query results first.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified application adaptation or dissociates the adaptation from a specified image version.</p>
     * 
     * @param request DeleteAdaptorRequest
     * @return DeleteAdaptorResponse
     */
    public DeleteAdaptorResponse deleteAdaptor(DeleteAdaptorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAdaptorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>You must disassociate all images from the target application or version before deletion.</em>*</p>
     * <ol>
     * <li>Call ListApp to obtain the AppId and confirm whether the application can be deleted.</li>
     * <li>Use UnbindApp or DeleteAdaptor to disassociate the related images.</li>
     * <li>Specify AppVersionId to delete a single application version, or omit this parameter to delete the entire application.
     * After an application version is deleted, if the application has no other valid adapters, the application record is also deleted.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified application version. If the version ID is omitted, deletes the entire application and its adapters.</p>
     * 
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>You must disassociate all images from the target application or version before deletion.</em>*</p>
     * <ol>
     * <li>Call ListApp to obtain the AppId and confirm whether the application can be deleted.</li>
     * <li>Use UnbindApp or DeleteAdaptor to disassociate the related images.</li>
     * <li>Specify AppVersionId to delete a single application version, or omit this parameter to delete the entire application.
     * After an application version is deleted, if the application has no other valid adapters, the application record is also deleted.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified application version. If the version ID is omitted, deletes the entire application and its adapters.</p>
     * 
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not support deleting delivery groups that use subscription resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource-based pay-as-you-go delivery group.</p>
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
     * <p>Deletes a resource-based pay-as-you-go delivery group.</p>
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
     * <p>Only instances in the initializing or idle state can be deleted. This API operation is available only to specific customers.</p>
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
     * <p>Only instances in the initializing or idle state can be deleted. This API operation is available only to specific customers.</p>
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
     * <li>You can only delete custom images that you own.</li>
     * <li>For images used in the WUYING Cloud Computer Pool, WUYING Cloud App, and WUYING Workstation product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING cloud desktop template references the image, the template is also deleted when you delete the image.</li>
     * <li>If the image is available in multiple regions, deleting the image removes it from all regions.</li>
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
     * <li>You can only delete custom images that you own.</li>
     * <li>For images used in the WUYING Cloud Computer Pool, WUYING Cloud App, and WUYING Workstation product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING cloud desktop template references the image, the template is also deleted when you delete the image.</li>
     * <li>If the image is available in multiple regions, deleting the image removes it from all regions.</li>
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
     * <p>Deletes a model template created under a model provider template. After the model template is deleted, the system triggers a configuration refresh for the associated model groups.</p>
     * <h3>Before you begin</h3>
     * <p><strong>The model to be deleted cannot be the default model of any associated model group.</strong> If it is still set as the default model, the invocation failed and LlmTemplate.IsDefaultModel is returned.
     * For model groups that allow modifying the default model, proceed as follows:</p>
     * <ol>
     * <li>Confirm the ProviderTemplateId of the model to be deleted and the ModelTemplateId that sets it as the default model.</li>
     * <li>Invoke <a href="~~BatchCreateLlmTemplates~~">BatchCreateLlmTemplates</a> to create another active model under the same provider template and set IsDefaultModel to true for the new model. Specify the model group for which you want to switch the default model by using ModelTemplateId.</li>
     * <li>Confirm that the default model has been switched for all relevant model groups, and then invoke this operation by using the LlmTemplateId of the original model. Switching the default model for only one group does not remove the restriction on the original default model for other groups.
     * When you invoke BatchCreateLlmTemplates, if a model group does not have default model Settings and you do not explicitly specify one in the current request, the service sets the first model in the list as the default model. Therefore, if you create only one model for the first time, it may become the default model even if you set IsDefaultModel to false, and it cannot be directly deleted. The default model for the Common model group is fixed and cannot be modified by using the preceding method.
     * Models that are under system administration and cannot be modified, as well as models that are not available to customers, cannot be deleted by invoking this operation. A model is not necessarily deletable just because it is not the default model.</li>
     * </ol>
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
     * <p>Deletes a model template created under a model provider template. After the model template is deleted, the system triggers a configuration refresh for the associated model groups.</p>
     * <h3>Before you begin</h3>
     * <p><strong>The model to be deleted cannot be the default model of any associated model group.</strong> If it is still set as the default model, the invocation failed and LlmTemplate.IsDefaultModel is returned.
     * For model groups that allow modifying the default model, proceed as follows:</p>
     * <ol>
     * <li>Confirm the ProviderTemplateId of the model to be deleted and the ModelTemplateId that sets it as the default model.</li>
     * <li>Invoke <a href="~~BatchCreateLlmTemplates~~">BatchCreateLlmTemplates</a> to create another active model under the same provider template and set IsDefaultModel to true for the new model. Specify the model group for which you want to switch the default model by using ModelTemplateId.</li>
     * <li>Confirm that the default model has been switched for all relevant model groups, and then invoke this operation by using the LlmTemplateId of the original model. Switching the default model for only one group does not remove the restriction on the original default model for other groups.
     * When you invoke BatchCreateLlmTemplates, if a model group does not have default model Settings and you do not explicitly specify one in the current request, the service sets the first model in the list as the default model. Therefore, if you create only one model for the first time, it may become the default model even if you set IsDefaultModel to false, and it cannot be directly deleted. The default model for the Common model group is fixed and cannot be modified by using the preceding method.
     * Models that are under system administration and cannot be modified, as well as models that are not available to customers, cannot be deleted by invoking this operation. A model is not necessarily deletable just because it is not the default model.</li>
     * </ol>
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
     * <p>You can delete model provider templates that are created under model templates in the Wuying Agent Management Center. Before you delete a template, make sure that the model provider is not the provider of the default model and is not a system-preset provider, such as the Wuying credit package. After the template is deleted, its associated models and key configurations are also cleared.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
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
     * <p>You can delete model provider templates that are created under model templates in the Wuying Agent Management Center. Before you delete a template, make sure that the model provider is not the provider of the default model and is not a system-preset provider, such as the Wuying credit package. After the template is deleted, its associated models and key configurations are also cleared.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
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
     * <p>You can delete a model group created in the Wuying Agent Management Center. Before deletion, ensure that the template is not authorized for any resources. Otherwise, the deletion fails. After the model group is deleted, the model providers and models in the model group are also removed.
     * Before you use this API operation, ensure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
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
     * <p>You can delete a model group created in the Wuying Agent Management Center. Before deletion, ensure that the template is not authorized for any resources. Otherwise, the deletion fails. After the model group is deleted, the model providers and models in the model group are also removed.
     * Before you use this API operation, ensure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
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
     * <p>Deletes a workstation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workstation.</p>
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
     * <p>Deletes a workstation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workstation.</p>
     * 
     * @param request DeleteWuyingServerRequest
     * @return DeleteWuyingServerResponse
     */
    public DeleteWuyingServerResponse deleteWuyingServer(DeleteWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Specify the region where SLS is deployed and at least one product delivery scope.</li>
     * <li>Specify either <code>ProjectName</code> or <code>ExistedProjectName</code>. If you use an existing project, make sure that it belongs to the current account and is located in the specified region.</li>
     * <li>Only one enabled delivery configuration can exist for the same account and product type. Before you call this operation, you can call <code>DescribeSlsDeliveryConfig</code> to query existing configurations. If an enabled configuration already exists, calling this operation again returns <code>SlsDeliveryAlreadyExists</code>.</li>
     * </ul>
     * <h2>Configuration management</h2>
     * <ul>
     * <li>This operation is used to configure delivery, not to query logs.</li>
     * <li>To pause delivery, call <code>StopDeliveryConfig</code>. Stopping delivery does not delete the delivery configuration.</li>
     * <li>To reconfigure the delivery destination or rebuild the configuration, query and delete the corresponding old configuration by calling <code>DeleteDeliveryConfig</code> before you call this operation. Deleting a delivery configuration does not delete the SLS project or Logstore.</li>
     * <li>Do not treat repeated calls for an existing configuration as update or resume operations. After the call, you can call <code>DescribeSlsDeliveryConfig</code> to confirm the configuration status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures operation log delivery for specified products and writes the logs to a Simple Log Service (SLS) project and Logstore of the current account.</p>
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
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Specify the region where SLS is deployed and at least one product delivery scope.</li>
     * <li>Specify either <code>ProjectName</code> or <code>ExistedProjectName</code>. If you use an existing project, make sure that it belongs to the current account and is located in the specified region.</li>
     * <li>Only one enabled delivery configuration can exist for the same account and product type. Before you call this operation, you can call <code>DescribeSlsDeliveryConfig</code> to query existing configurations. If an enabled configuration already exists, calling this operation again returns <code>SlsDeliveryAlreadyExists</code>.</li>
     * </ul>
     * <h2>Configuration management</h2>
     * <ul>
     * <li>This operation is used to configure delivery, not to query logs.</li>
     * <li>To pause delivery, call <code>StopDeliveryConfig</code>. Stopping delivery does not delete the delivery configuration.</li>
     * <li>To reconfigure the delivery destination or rebuild the configuration, query and delete the corresponding old configuration by calling <code>DeleteDeliveryConfig</code> before you call this operation. Deleting a delivery configuration does not delete the SLS project or Logstore.</li>
     * <li>Do not treat repeated calls for an existing configuration as update or resume operations. After the call, you can call <code>DescribeSlsDeliveryConfig</code> to confirm the configuration status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures operation log delivery for specified products and writes the logs to a Simple Log Service (SLS) project and Logstore of the current account.</p>
     * 
     * @param request DeliverToUserSlsRequest
     * @return DeliverToUserSlsResponse
     */
    public DeliverToUserSlsResponse deliverToUserSls(DeliverToUserSlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deliverToUserSlsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the resource and session events of the current account. Both <code>StartTime</code> and <code>EndTime</code> must be specified, and the time range is inclusive. The service only retrieves logs from 30 days before the call time to the current time, so events outside this window are not returned. If multiple filter parameters are specified, the intersection of the conditions is applied. The results are returned in descending order of the event log time. To use page number-based pagination, specify <code>PageSize</code> and <code>PageNumber</code>. The current version does not use <code>MaxResults</code> and <code>NextToken</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource and session events of the current account within the last 30 days by using paging.</p>
     * 
     * @param request DescribeEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            body.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberEniIp)) {
            body.put("MemberEniIp", request.memberEniIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvents"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the resource and session events of the current account. Both <code>StartTime</code> and <code>EndTime</code> must be specified, and the time range is inclusive. The service only retrieves logs from 30 days before the call time to the current time, so events outside this window are not returned. If multiple filter parameters are specified, the intersection of the conditions is applied. The results are returned in descending order of the event log time. To use page number-based pagination, specify <code>PageSize</code> and <code>PageNumber</code>. The current version does not use <code>MaxResults</code> and <code>NextToken</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource and session events of the current account within the last 30 days by using paging.</p>
     * 
     * @param request DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls this operation to query the export tasks under the current Alibaba Cloud account by page to obtain the task status, execution progress, export file names, and download URLs. Export tasks are created by CreateExportTask. This operation only reads task information and does not create, modify, or retry tasks.
     * The query results are returned in descending order of task creation time, with the most recently created tasks listed first. Only tasks in the INIT, RUNNING, FINISHED, and FAILED states are returned. Tasks marked as EXPIRED are not included in the results.
     * When polling a single task by TaskId, set PageNumber to 1 and PageSize to 1, set the polling interval to 5 to 10 seconds, and stop polling after the task enters the FINISHED or FAILED state.
     * A task is valid for 24 hours after creation and is marked as expired by a background task after 25 hours. Therefore, within the 24- to 25-hour window, a FINISHED task may still be queried, but its DownloadUrl is empty. After a task is marked as expired, the query result is an empty array.
     * If the query result is an empty array, it may be because there are no visible tasks under the current account, the task type does not match, the page number is out of bounds, or the tasks have expired. This operation always returns an array structure and does not return an error when the query result is empty.
     * The DownloadUrl is an OSS pre-signed URL. The default maximum validity period is 1 hour and does not exceed the remaining validity period of the task. The server automatically refreshes the URL when it is about to expire. Use the URL returned by the most recent query for downloading and do not cache the initially returned URL for a long time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution status, progress, and download URLs of export tasks by page.</p>
     * 
     * @param request DescribeExportTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExportTasksResponse
     */
    public DescribeExportTasksResponse describeExportTasksWithOptions(DescribeExportTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExportTasks"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls this operation to query the export tasks under the current Alibaba Cloud account by page to obtain the task status, execution progress, export file names, and download URLs. Export tasks are created by CreateExportTask. This operation only reads task information and does not create, modify, or retry tasks.
     * The query results are returned in descending order of task creation time, with the most recently created tasks listed first. Only tasks in the INIT, RUNNING, FINISHED, and FAILED states are returned. Tasks marked as EXPIRED are not included in the results.
     * When polling a single task by TaskId, set PageNumber to 1 and PageSize to 1, set the polling interval to 5 to 10 seconds, and stop polling after the task enters the FINISHED or FAILED state.
     * A task is valid for 24 hours after creation and is marked as expired by a background task after 25 hours. Therefore, within the 24- to 25-hour window, a FINISHED task may still be queried, but its DownloadUrl is empty. After a task is marked as expired, the query result is an empty array.
     * If the query result is an empty array, it may be because there are no visible tasks under the current account, the task type does not match, the page number is out of bounds, or the tasks have expired. This operation always returns an array structure and does not return an error when the query result is empty.
     * The DownloadUrl is an OSS pre-signed URL. The default maximum validity period is 1 hour and does not exceed the remaining validity period of the task. The server automatically refreshes the URL when it is about to expire. Use the URL returned by the most recent query for downloading and do not cache the initially returned URL for a long time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution status, progress, and download URLs of export tasks by page.</p>
     * 
     * @param request DescribeExportTasksRequest
     * @return DescribeExportTasksResponse
     */
    public DescribeExportTasksResponse describeExportTasks(DescribeExportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Alibaba Cloud accounts with which the current image is shared.</p>
     * 
     * @param request DescribeShareImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeShareImageResponse
     */
    public DescribeShareImageResponse describeShareImageWithOptions(DescribeShareImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeShareImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeShareImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Alibaba Cloud accounts with which the current image is shared.</p>
     * 
     * @param request DescribeShareImageRequest
     * @return DescribeShareImageResponse
     */
    public DescribeShareImageResponse describeShareImage(DescribeShareImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShareImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Query description</h2>
     * <ul>
     * <li>Queries existing delivery configurations under the current account. This operation does not create or modify configurations.</li>
     * <li>You can filter configurations by SLS region, project name, Logstore name, and product type. If multiple conditions are specified, they take effect together.</li>
     * <li>If no filter conditions are specified, all delivery configurations under the current account are queried. If no configurations match the conditions, an empty list is returned.</li>
     * <li>The returned results are displayed hierarchically by project, Logstore, and delivery scope.</li>
     * </ul>
     * <h2>Example description</h2>
     * <p>The examples of names and retention periods are used to demonstrate the format. Refer to the actual configurations. The retention period examples do not represent default values or upper limits.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Simple Log Service (SLS) delivery configurations of the current account.</p>
     * 
     * @param request DescribeSlsDeliveryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsDeliveryConfigResponse
     */
    public DescribeSlsDeliveryConfigResponse describeSlsDeliveryConfigWithOptions(DescribeSlsDeliveryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            query.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            query.put("SlsRegionId", request.slsRegionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryScopes)) {
            bodyFlat.put("DeliveryScopes", request.deliveryScopes);
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
            new TeaPair("action", "DescribeSlsDeliveryConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsDeliveryConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Query description</h2>
     * <ul>
     * <li>Queries existing delivery configurations under the current account. This operation does not create or modify configurations.</li>
     * <li>You can filter configurations by SLS region, project name, Logstore name, and product type. If multiple conditions are specified, they take effect together.</li>
     * <li>If no filter conditions are specified, all delivery configurations under the current account are queried. If no configurations match the conditions, an empty list is returned.</li>
     * <li>The returned results are displayed hierarchically by project, Logstore, and delivery scope.</li>
     * </ul>
     * <h2>Example description</h2>
     * <p>The examples of names and retention periods are used to demonstrate the format. Refer to the actual configurations. The retention period examples do not represent default values or upper limits.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Simple Log Service (SLS) delivery configurations of the current account.</p>
     * 
     * @param request DescribeSlsDeliveryConfigRequest
     * @return DescribeSlsDeliveryConfigResponse
     */
    public DescribeSlsDeliveryConfigResponse describeSlsDeliveryConfig(DescribeSlsDeliveryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsDeliveryConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When querying a specified target, specify either the app instance group ID or the app instance group set ID. When querying a set, the rules of the primary app instance group are returned. You can use the query results as a reference for modifying rules, and then call SetUserProfilePathRules to submit the complete rule list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the system default path rules, or the user profile roaming rules for a specified app instance group or app instance group set.</p>
     * 
     * @param request DescribeUserProfilePathRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserProfilePathRulesResponse
     */
    public DescribeUserProfilePathRulesResponse describeUserProfilePathRulesWithOptions(DescribeUserProfilePathRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            body.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserProfilePathRules"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserProfilePathRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When querying a specified target, specify either the app instance group ID or the app instance group set ID. When querying a set, the rules of the primary app instance group are returned. You can use the query results as a reference for modifying rules, and then call SetUserProfilePathRules to submit the complete rule list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the system default path rules, or the user profile roaming rules for a specified app instance group or app instance group set.</p>
     * 
     * @param request DescribeUserProfilePathRulesRequest
     * @return DescribeUserProfilePathRulesResponse
     */
    public DescribeUserProfilePathRulesResponse describeUserProfilePathRules(DescribeUserProfilePathRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserProfilePathRulesWithOptions(request, runtime);
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
     * <p>Queries the elastic IP address (EIP) information of a Wuying workstation.</p>
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
     * <p>Queries the elastic IP address (EIP) information of a Wuying workstation.</p>
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
     * <p>Confirms the successful verification of an image or application build.</p>
     * 
     * @param request FinishValidateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishValidateResponse
     */
    public FinishValidateResponse finishValidateWithOptions(FinishValidateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishValidate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishValidateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Confirms the successful verification of an image or application build.</p>
     * 
     * @param request FinishValidateRequest
     * @return FinishValidateResponse
     */
    public FinishValidateResponse finishValidate(FinishValidateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishValidateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of runtimes of a specified type under the current Alibaba Cloud account, grouped by agent platform and agent provider. The statistics include the total number of runtimes, the number of runtimes without a configured model, the number of runtimes without a configured channel, the number of risky runtimes, and the number of expired runtimes.</p>
     * 
     * @param request GetAgentRuntimeStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentRuntimeStatisticResponse
     */
    public GetAgentRuntimeStatisticResponse getAgentRuntimeStatisticWithOptions(GetAgentRuntimeStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            query.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentRuntimeStatistic"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentRuntimeStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of runtimes of a specified type under the current Alibaba Cloud account, grouped by agent platform and agent provider. The statistics include the total number of runtimes, the number of runtimes without a configured model, the number of runtimes without a configured channel, the number of risky runtimes, and the number of expired runtimes.</p>
     * 
     * @param request GetAgentRuntimeStatisticRequest
     * @return GetAgentRuntimeStatisticResponse
     */
    public GetAgentRuntimeStatisticResponse getAgentRuntimeStatistic(GetAgentRuntimeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentRuntimeStatisticWithOptions(request, runtime);
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
     * <p>Before calling this operation, you must create a task, and the creation or validation resources corresponding to the task must be available.</p>
     * <ol>
     * <li>Obtain the TaskId and actual TaskType from the response of the task creation operation or GetTask.</li>
     * <li>Specify ResourceType to obtain the connection information for the creation or validation environment.</li>
     * <li>Use the returned authorization code together with the user, resource group, and application identifiers in the same response for connection.
     * The authorization code is a sensitive connection credential. Do not record it in public documents or logs. When specifying AppId, you must also specify the matching AppVersionId.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection authorization code and required resource information for an existing image or application creation task.</p>
     * 
     * @param request GetAuthCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthCodeResponse
     */
    public GetAuthCodeResponse getAuthCodeWithOptions(GetAuthCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthCode"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, you must create a task, and the creation or validation resources corresponding to the task must be available.</p>
     * <ol>
     * <li>Obtain the TaskId and actual TaskType from the response of the task creation operation or GetTask.</li>
     * <li>Specify ResourceType to obtain the connection information for the creation or validation environment.</li>
     * <li>Use the returned authorization code together with the user, resource group, and application identifiers in the same response for connection.
     * The authorization code is a sensitive connection credential. Do not record it in public documents or logs. When specifying AppId, you must also specify the matching AppVersionId.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection authorization code and required resource information for an existing image or application creation task.</p>
     * 
     * @param request GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    public GetAuthCodeResponse getAuthCode(GetAuthCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes the query usage for the monthly active user (MAU) billing scenario.</p>
     * <h2>Before you begin</h2>
     * <p>Obtain the ID of the cloud browser group within the current account. You can call the ListBrowserInstanceGroup operation to obtain the ID.</p>
     * <h2>Response content</h2>
     * <p>Returns the current configuration, status, and authorization statistics of the browser group. The bookmark and website access lists in the details return up to 20 entries each. To query the complete lists, call the ListBrowserBookmarks and ListBrowserRestrictedURLs operations, respectively.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After reading the returned status, perform connection or management operations that match the status.</p>
     * <h2>Example description</h2>
     * <p>In the examples, a hyphen (-) indicates that the field is not applicable to the current scenario or is not returned. It is not an actual string returned by the operation. The examples of common resource IDs are masked. Use the actual query results.</p>
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
     * <p>Obtain the ID of the cloud browser group within the current account. You can call the ListBrowserInstanceGroup operation to obtain the ID.</p>
     * <h2>Response content</h2>
     * <p>Returns the current configuration, status, and authorization statistics of the browser group. The bookmark and website access lists in the details return up to 20 entries each. To query the complete lists, call the ListBrowserBookmarks and ListBrowserRestrictedURLs operations, respectively.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After reading the returned status, perform connection or management operations that match the status.</p>
     * <h2>Example description</h2>
     * <p>In the examples, a hyphen (-) indicates that the field is not applicable to the current scenario or is not returned. It is not an actual string returned by the operation. The examples of common resource IDs are masked. Use the actual query results.</p>
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
     * This API operation may require multiple calls (at least one) to finally obtain the connection credentials.
     * The first call assigns an application instance to the specified convenience user and starts the application. If a ticket is returned, it indicates that the result is obtained synchronously. If a startup task ID (TaskId) is returned, subsequent calls are required.
     * For subsequent calls, you must pass the TaskId parameter in the request parameters to query whether the task is completed. When the returned task status (TaskStatus) is Finished, the connection credentials (Ticket) are returned at the same time.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before you call this operation, make sure that a delivery group is created and authorized for the user:</li>
     * <li><ol>
     * <li>The API operation used to create a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the documentation for the corresponding API operation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup API operation to query the list of delivery groups. If the corresponding delivery group is not found, check whether the delivery group is created or whether the authentication credentials used belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API operation used to authorize a delivery group for a user is AuthorizeInstanceGroup. For more information about the parameters, see the documentation for the corresponding API operation.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection credentials for a cloud application.</p>
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
     * This API operation may require multiple calls (at least one) to finally obtain the connection credentials.
     * The first call assigns an application instance to the specified convenience user and starts the application. If a ticket is returned, it indicates that the result is obtained synchronously. If a startup task ID (TaskId) is returned, subsequent calls are required.
     * For subsequent calls, you must pass the TaskId parameter in the request parameters to query whether the task is completed. When the returned task status (TaskStatus) is Finished, the connection credentials (Ticket) are returned at the same time.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before you call this operation, make sure that a delivery group is created and authorized for the user:</li>
     * <li><ol>
     * <li>The API operation used to create a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the documentation for the corresponding API operation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup API operation to query the list of delivery groups. If the corresponding delivery group is not found, check whether the delivery group is created or whether the authentication credentials used belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API operation used to authorize a delivery group for a user is AuthorizeInstanceGroup. For more information about the parameters, see the documentation for the corresponding API operation.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection credentials for a cloud application.</p>
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
     * <p>Queries the effective versions of an image in various regions by ImageId. If a image version is configured in the same region, the image version is returned first. You can specify BizRegionId to limit the query to a specific region. The returned results are also constrained by the product type and the regions visible to the account. To query the details of a specific version, call GetImageById.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the effective versions of an image in various regions, along with its applications, distribution configurations, and tags.</p>
     * 
     * @param request GetEffectiveImageByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEffectiveImageByIdResponse
     */
    public GetEffectiveImageByIdResponse getEffectiveImageByIdWithOptions(GetEffectiveImageByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentLocale)) {
            body.put("ContentLocale", request.contentLocale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFilter)) {
            body.put("IgnoreFilter", request.ignoreFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showHidden)) {
            body.put("ShowHidden", request.showHidden);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEffectiveImageById"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEffectiveImageByIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the effective versions of an image in various regions by ImageId. If a image version is configured in the same region, the image version is returned first. You can specify BizRegionId to limit the query to a specific region. The returned results are also constrained by the product type and the regions visible to the account. To query the details of a specific version, call GetImageById.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the effective versions of an image in various regions, along with its applications, distribution configurations, and tags.</p>
     * 
     * @param request GetEffectiveImageByIdRequest
     * @return GetEffectiveImageByIdResponse
     */
    public GetEffectiveImageByIdResponse getEffectiveImageById(GetEffectiveImageByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEffectiveImageByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Visitor information is filled in by visitors on the lead capture page when they execute a cloud flow. Therefore, the usage of cloud applications does not generate visitor information.</p>
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
     * <p>Visitor information is filled in by visitors on the lead capture page when they execute a cloud flow. Therefore, the usage of cloud applications does not generate visitor information.</p>
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
     * <p>You must specify at least one of ImageId and VersionId. If only ImageId is specified, the online version is queried. If VersionId is specified, the specified version is queried. If both parameters are specified, VersionId must belong to the specified image. To query the effective version in each region, call GetEffectiveImageById.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the image details, adapted applications, and region distribution information based on the image ID or version ID.</p>
     * 
     * @param request GetImageByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageByIdResponse
     */
    public GetImageByIdResponse getImageByIdWithOptions(GetImageByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFilter)) {
            body.put("IgnoreFilter", request.ignoreFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showHidden)) {
            body.put("ShowHidden", request.showHidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageById"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageByIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must specify at least one of ImageId and VersionId. If only ImageId is specified, the online version is queried. If VersionId is specified, the specified version is queried. If both parameters are specified, VersionId must belong to the specified image. To query the effective version in each region, call GetEffectiveImageById.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the image details, adapted applications, and region distribution information based on the image ID or version ID.</p>
     * 
     * @param request GetImageByIdRequest
     * @return GetImageByIdResponse
     */
    public GetImageByIdResponse getImageById(GetImageByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the region distribution status of an image by ImageId. If VersionId is not specified, the online version is queried. If VersionId is specified, the specified version is queried. Returns the non-deleted region distribution records and the list of corresponding region IDs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution regions, distribution status, and progress of an image version.</p>
     * 
     * @param request GetImageDistributeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageDistributeInfoResponse
     */
    public GetImageDistributeInfoResponse getImageDistributeInfoWithOptions(GetImageDistributeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageDistributeInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageDistributeInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the region distribution status of an image by ImageId. If VersionId is not specified, the online version is queried. If VersionId is specified, the specified version is queried. Returns the non-deleted region distribution records and the list of corresponding region IDs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution regions, distribution status, and progress of an image version.</p>
     * 
     * @param request GetImageDistributeInfoRequest
     * @return GetImageDistributeInfoResponse
     */
    public GetImageDistributeInfoResponse getImageDistributeInfo(GetImageDistributeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageDistributeInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of a specified model provider template in the Wuying Agent Management Center, including the provider name, description, and connection configuration list.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
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
     * <p>You can query the details of a specified model provider template in the Wuying Agent Management Center, including the provider name, description, and connection configuration list.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
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
     * <b>description</b> :
     * <p>Call this operation to retrieve the credentials and connection information required for a client to establish an MQTT connection.</p>
     * <ol>
     * <li>Use <code>MqttUsername</code> and <code>MqttPassword</code> as the username and password when connecting the MQTT client.</li>
     * <li>Use <code>MqttEndpoint</code> as the connection endpoint. If the client meets the required VPC network access conditions, you can use <code>MqttVPCEndpoint</code>. <code>MqttInstanceId</code> is used for token authentication, and <code>MqttGroupId</code> is used to concatenate the MQTT ClientId.</li>
     * <li>Distinguish between publish and subscribe topics based on the <code>topic</code>, <code>type</code>, and <code>permission</code> fields of each item in <code>TopicList</code>. <code>W</code> indicates publish permission, and <code>R</code> indicates subscribe permission.</li>
     * <li><code>ExpireTimeStamp</code> is the UNIX timestamp in milliseconds when the password expires. Credentials may be reused. Retrieve new credentials based on the expiration time returned in the response.
     * The device identity and request IDs in the documentation are demo data. The domain name uses the <code>example.com</code> sample domain. Credentials and instance identity are sample or desensitized values. These examples cannot be used directly for actual connections.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the authentication credentials, access endpoints, and topic list required for a client to establish an MQTT connection.</p>
     * 
     * @param tmpReq GetMqttTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMqttTicketResponse
     */
    public GetMqttTicketResponse getMqttTicketWithOptions(GetMqttTicketRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMqttTicketShrinkRequest request = new GetMqttTicketShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            body.put("Properties", request.propertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMqttTicket"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMqttTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this operation to retrieve the credentials and connection information required for a client to establish an MQTT connection.</p>
     * <ol>
     * <li>Use <code>MqttUsername</code> and <code>MqttPassword</code> as the username and password when connecting the MQTT client.</li>
     * <li>Use <code>MqttEndpoint</code> as the connection endpoint. If the client meets the required VPC network access conditions, you can use <code>MqttVPCEndpoint</code>. <code>MqttInstanceId</code> is used for token authentication, and <code>MqttGroupId</code> is used to concatenate the MQTT ClientId.</li>
     * <li>Distinguish between publish and subscribe topics based on the <code>topic</code>, <code>type</code>, and <code>permission</code> fields of each item in <code>TopicList</code>. <code>W</code> indicates publish permission, and <code>R</code> indicates subscribe permission.</li>
     * <li><code>ExpireTimeStamp</code> is the UNIX timestamp in milliseconds when the password expires. Credentials may be reused. Retrieve new credentials based on the expiration time returned in the response.
     * The device identity and request IDs in the documentation are demo data. The domain name uses the <code>example.com</code> sample domain. Credentials and instance identity are sample or desensitized values. These examples cannot be used directly for actual connections.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the authentication credentials, access endpoints, and topic list required for a client to establish an MQTT connection.</p>
     * 
     * @param request GetMqttTicketRequest
     * @return GetMqttTicketResponse
     */
    public GetMqttTicketResponse getMqttTicket(GetMqttTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMqttTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an over-the-air update task, including upgradable versions and release notes.</p>
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
     * <p>Queries the details of an over-the-air update task, including upgradable versions and release notes.</p>
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
     * <p>Queries the model settings of resource groups.</p>
     * 
     * @param request GetResourceGroupAgentModelSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupAgentModelSettingsResponse
     */
    public GetResourceGroupAgentModelSettingsResponse getResourceGroupAgentModelSettingsWithOptions(GetResourceGroupAgentModelSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupAgentModelSettings"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupAgentModelSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the model settings of resource groups.</p>
     * 
     * @param request GetResourceGroupAgentModelSettingsRequest
     * @return GetResourceGroupAgentModelSettingsResponse
     */
    public GetResourceGroupAgentModelSettingsResponse getResourceGroupAgentModelSettings(GetResourceGroupAgentModelSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupAgentModelSettingsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the resource scale-out price for an existing delivery group. A successful call returns only a quote and does not create an order or add nodes.
     * <strong>Before you call this operation, verify the following conditions:</strong></p>
     * <ul>
     * <li>The delivery group belongs to the current account and is located in a supported region in the Chinese mainland.</li>
     * <li>The product type is WUYING Cloud App or Cloud Browser, and the billing method is subscription and purchased by node. This operation does not apply to browser groups that use the pay-as-you-go billing method or are billed by monthly active users (MAU).</li>
     * <li>The order status of the delivery group is normal, a resource node pool is associated, and no paid but ineffective renewal or scale-in orders exist.</li>
     * <li>The target total number of nodes is greater than the current number of purchased nodes and does not exceed the node quota for the account in the corresponding region, product, and billing method.
     * <strong>Parameter relationships:</strong></li>
     * <li>ProductType, AppInstanceGroupId, and Amount are all required parameters and must be specified at the same time.</li>
     * <li>ProductType must match the product corresponding to AppInstanceGroupId.</li>
     * <li><strong>Amount is the total number of nodes after the scale-out, not the number of nodes added in this operation.</strong> The region, node specifications, and billing method are determined by the existing delivery group and do not need to be passed separately.
     * <strong>Call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Confirm the target delivery group and the current number of purchased nodes. For cloud app Common scenarios, you can first invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListAppInstanceGroup">ListAppInstanceGroup</a> to obtain the identity, and then invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to query the configuration and NodePool.NodeAmount.</li>
     * <li>Invoke this operation with the same product type, delivery group identity, and target total number of nodes to read the price, coupons, and price calculation rules.</li>
     * <li>After confirming the quote, if you need to execute the scale-out, you can invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ModifyNodePoolAmount">ModifyNodePoolAmount</a> and fill in the target total number in NodePool.NodeAmount as required by the operation. <strong>A successful price inquiry does not mean that an order has been created or the scale-out has been completed.</strong>
     * <strong>Example scenario:</strong>
     * If a cloud app delivery group currently has 1 purchased subscription node and the target is to scale out to 2 nodes, set ProductType to CloudApp, AppInstanceGroupId to the ID of the delivery group, and Amount to 2. Replace the masked resource ID with the actual value under the current account. The example quantity does not represent a default value or quota limit. The price example only illustrates the relationship between the original price, discount amount, and discounted price, and does not represent the fixed selling price of the specification.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the price and discount information required to scale out a subscription delivery group to a specified total number of nodes.</p>
     * 
     * @param request GetResourceModifyPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceModifyPriceResponse
     */
    public GetResourceModifyPriceResponse getResourceModifyPriceWithOptions(GetResourceModifyPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

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
            new TeaPair("action", "GetResourceModifyPrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceModifyPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the resource scale-out price for an existing delivery group. A successful call returns only a quote and does not create an order or add nodes.
     * <strong>Before you call this operation, verify the following conditions:</strong></p>
     * <ul>
     * <li>The delivery group belongs to the current account and is located in a supported region in the Chinese mainland.</li>
     * <li>The product type is WUYING Cloud App or Cloud Browser, and the billing method is subscription and purchased by node. This operation does not apply to browser groups that use the pay-as-you-go billing method or are billed by monthly active users (MAU).</li>
     * <li>The order status of the delivery group is normal, a resource node pool is associated, and no paid but ineffective renewal or scale-in orders exist.</li>
     * <li>The target total number of nodes is greater than the current number of purchased nodes and does not exceed the node quota for the account in the corresponding region, product, and billing method.
     * <strong>Parameter relationships:</strong></li>
     * <li>ProductType, AppInstanceGroupId, and Amount are all required parameters and must be specified at the same time.</li>
     * <li>ProductType must match the product corresponding to AppInstanceGroupId.</li>
     * <li><strong>Amount is the total number of nodes after the scale-out, not the number of nodes added in this operation.</strong> The region, node specifications, and billing method are determined by the existing delivery group and do not need to be passed separately.
     * <strong>Call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Confirm the target delivery group and the current number of purchased nodes. For cloud app Common scenarios, you can first invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListAppInstanceGroup">ListAppInstanceGroup</a> to obtain the identity, and then invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to query the configuration and NodePool.NodeAmount.</li>
     * <li>Invoke this operation with the same product type, delivery group identity, and target total number of nodes to read the price, coupons, and price calculation rules.</li>
     * <li>After confirming the quote, if you need to execute the scale-out, you can invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ModifyNodePoolAmount">ModifyNodePoolAmount</a> and fill in the target total number in NodePool.NodeAmount as required by the operation. <strong>A successful price inquiry does not mean that an order has been created or the scale-out has been completed.</strong>
     * <strong>Example scenario:</strong>
     * If a cloud app delivery group currently has 1 purchased subscription node and the target is to scale out to 2 nodes, set ProductType to CloudApp, AppInstanceGroupId to the ID of the delivery group, and Amount to 2. Replace the masked resource ID with the actual value under the current account. The example quantity does not represent a default value or quota limit. The price example only illustrates the relationship between the original price, discount amount, and discounted price, and does not represent the fixed selling price of the specification.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the price and discount information required to scale out a subscription delivery group to a specified total number of nodes.</p>
     * 
     * @param request GetResourceModifyPriceRequest
     * @return GetResourceModifyPriceResponse
     */
    public GetResourceModifyPriceResponse getResourceModifyPrice(GetResourceModifyPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceModifyPriceWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>This operation queries the maximum quantity quota. It does not query the used quota, remaining quota, or real-time resource inventory.
     * <strong>Parameter relationships:</strong></p>
     * <ul>
     * <li><code>ResourceType</code> and <code>ProductType</code> are required.</li>
     * <li><code>BizRegionId</code> and <code>ChargeType</code> are optional query conditions and can be specified at the same time. They must be consistent with subsequent purchase or authorization operations.</li>
     * <li>If the region or billing method is omitted, the general quota for the corresponding dimension is queried. The quotas of different regions or billing methods are not added together.</li>
     * <li>If multiple quotas apply at the same time, the larger limit is returned.
     * <strong>Call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Select the resource type, product, business region, and billing method of the payer based on subsequent business needs.</li>
     * <li>Invoke this operation to read <code>Data</code>. Query <code>AppInstanceGroup</code> before creating a delivery group, query <code>AppAuthUser</code> before authorizing an authorized user, and query <code>PoolNodeAmount</code> before purchasing or scaling out nodes.</li>
     * <li>Query the current usage in combination with resources, and then verify the current operation through subsequent creation, authorization, or scale-out operations. <strong>This query does not reserve quotas or guarantee the success of subsequent purchases.</strong>
     * <code>Data=2147483647</code> indicates that no smaller quota limit is obtained in this query. It does not mean that the physical inventory is unlimited.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum quantity quota applicable to the current account for a specified product, resource type, business region, and billing method.</p>
     * 
     * @param request GetResourceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceQuotaResponse
     */
    public GetResourceQuotaResponse getResourceQuotaWithOptions(GetResourceQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceQuota"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the maximum quantity quota. It does not query the used quota, remaining quota, or real-time resource inventory.
     * <strong>Parameter relationships:</strong></p>
     * <ul>
     * <li><code>ResourceType</code> and <code>ProductType</code> are required.</li>
     * <li><code>BizRegionId</code> and <code>ChargeType</code> are optional query conditions and can be specified at the same time. They must be consistent with subsequent purchase or authorization operations.</li>
     * <li>If the region or billing method is omitted, the general quota for the corresponding dimension is queried. The quotas of different regions or billing methods are not added together.</li>
     * <li>If multiple quotas apply at the same time, the larger limit is returned.
     * <strong>Call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Select the resource type, product, business region, and billing method of the payer based on subsequent business needs.</li>
     * <li>Invoke this operation to read <code>Data</code>. Query <code>AppInstanceGroup</code> before creating a delivery group, query <code>AppAuthUser</code> before authorizing an authorized user, and query <code>PoolNodeAmount</code> before purchasing or scaling out nodes.</li>
     * <li>Query the current usage in combination with resources, and then verify the current operation through subsequent creation, authorization, or scale-out operations. <strong>This query does not reserve quotas or guarantee the success of subsequent purchases.</strong>
     * <code>Data=2147483647</code> indicates that no smaller quota limit is obtained in this query. It does not mean that the physical inventory is unlimited.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum quantity quota applicable to the current account for a specified product, resource type, business region, and billing method.</p>
     * 
     * @param request GetResourceQuotaRequest
     * @return GetResourceQuotaResponse
     */
    public GetResourceQuotaResponse getResourceQuota(GetResourceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the renewal price of WUYING cloud application resources.</p>
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
     * <p>Queries the renewal price of WUYING cloud application resources.</p>
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
     * <p>You can query the third-party channel configuration status for agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before calling this operation, make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the third-party channel configurations for agent runtimes.</p>
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
     * <p>You can query the third-party channel configuration status for agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before calling this operation, make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the third-party channel configurations for agent runtimes.</p>
     * 
     * @param request GetRuntimeChannelRequest
     * @return GetRuntimeChannelResponse
     */
    public GetRuntimeChannelResponse getRuntimeChannel(GetRuntimeChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuntimeChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the QR code configuration process for a specific channel on a specified runtime, including the process status, QR code content, and the URL of the QR code configuration page.</p>
     * 
     * @param request GetRuntimeChannelQrCodeDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuntimeChannelQrCodeDetailResponse
     */
    public GetRuntimeChannelQrCodeDetailResponse getRuntimeChannelQrCodeDetailWithOptions(GetRuntimeChannelQrCodeDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
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
            new TeaPair("action", "GetRuntimeChannelQrCodeDetail"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuntimeChannelQrCodeDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the QR code configuration process for a specific channel on a specified runtime, including the process status, QR code content, and the URL of the QR code configuration page.</p>
     * 
     * @param request GetRuntimeChannelQrCodeDetailRequest
     * @return GetRuntimeChannelQrCodeDetailResponse
     */
    public GetRuntimeChannelQrCodeDetailResponse getRuntimeChannelQrCodeDetail(GetRuntimeChannelQrCodeDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuntimeChannelQrCodeDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of the model configuration currently bound to a specified cloud desktop in the Wuying Agent Management Center, including the model group, model provider list, and associated model information. When the risk information mode is enabled, you can also identify discrepancies between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the model configuration details of a cloud desktop.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            query.put("RuntimeId", request.runtimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            query.put("RuntimeType", request.runtimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartModel)) {
            query.put("SmartModel", request.smartModel);
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
     * <p>You can query the details of the model configuration currently bound to a specified cloud desktop in the Wuying Agent Management Center, including the model group, model provider list, and associated model information. When the risk information mode is enabled, you can also identify discrepancies between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the model configuration details of a cloud desktop.</p>
     * 
     * @param request GetRuntimeModelConfigRequest
     * @return GetRuntimeModelConfigResponse
     */
    public GetRuntimeModelConfigResponse getRuntimeModelConfig(GetRuntimeModelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuntimeModelConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supports two query methods:</p>
     * <ul>
     * <li><strong>By task ID</strong>: Pass TaskId. This method takes precedence over resource information queries.</li>
     * <li><strong>By resource</strong>: Omit TaskId, and pass EntityId, EntityType, and TaskCategory. You can use EntityVersionId to specify the resource version.
     * The API returns the current task status and recorded step information. Determine the overall task result based on Status. The success of a single step does not mean the entire task is successful. You can call ListTaskStep to query the names and categories of image creation and application adaptation steps.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a task by task ID, or by resource information and task category.</p>
     * 
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityVersionId)) {
            body.put("EntityVersionId", request.entityVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCategory)) {
            body.put("TaskCategory", request.taskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-09-01"),
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
     * <p>Supports two query methods:</p>
     * <ul>
     * <li><strong>By task ID</strong>: Pass TaskId. This method takes precedence over resource information queries.</li>
     * <li><strong>By resource</strong>: Omit TaskId, and pass EntityId, EntityType, and TaskCategory. You can use EntityVersionId to specify the resource version.
     * The API returns the current task status and recorded step information. Determine the overall task result based on Status. The success of a single step does not mean the entire task is successful. You can call ListTaskStep to query the names and categories of image creation and application adaptation steps.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a task by task ID, or by resource information and task category.</p>
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
     * <p>Specify the agent provider, business platform, and business type corresponding to the configuration. After modification, you can use the same combination to query whether the configuration has been updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tenant-level memory configurations of the current account by agent provider, business platform, and business type.</p>
     * 
     * @param request GetTenantMemoryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTenantMemoryConfigResponse
     */
    public GetTenantMemoryConfigResponse getTenantMemoryConfigWithOptions(GetTenantMemoryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentInstanceId)) {
            body.put("AgentInstanceId", request.agentInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            body.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            body.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTenantMemoryConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTenantMemoryConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Specify the agent provider, business platform, and business type corresponding to the configuration. After modification, you can use the same combination to query whether the configuration has been updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tenant-level memory configurations of the current account by agent provider, business platform, and business type.</p>
     * 
     * @param request GetTenantMemoryConfigRequest
     * @return GetTenantMemoryConfigResponse
     */
    public GetTenantMemoryConfigResponse getTenantMemoryConfig(GetTenantMemoryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTenantMemoryConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>FileType currently supports only TASK. Use the returned OSS endpoint, bucket, file directory, and temporary credentials to upload files. After the file is uploaded, you can pass the complete OSS object path to ImportImage. Expiration is not supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS endpoint, directory, and STS temporary credentials required to upload image task files.</p>
     * 
     * @param request GetUploadInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadInfoResponse
     */
    public GetUploadInfoResponse getUploadInfoWithOptions(GetUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>FileType currently supports only TASK. Use the returned OSS endpoint, bucket, file directory, and temporary credentials to upload files. After the file is uploaded, you can pass the complete OSS object path to ImportImage. Expiration is not supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS endpoint, directory, and STS temporary credentials required to upload image task files.</p>
     * 
     * @param request GetUploadInfoRequest
     * @return GetUploadInfoResponse
     */
    public GetUploadInfoResponse getUploadInfo(GetUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, only ProductType=CloudDesktop is supported. Upload the image file first, and then pass its OSS object path to initiate the import. You can call GetUploadInfo to obtain upload credentials. After the API returns the image and version IDs, you can call GetImageById or GetImageDistributeInfo to query the creation and distribution status. A successful response indicates that the import request has been accepted, not that the image is already available.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports an image file from Object Storage Service (OSS) as a custom Cloud Desktop image and returns the image ID and version ID.</p>
     * 
     * @param request ImportImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportImageResponse
     */
    public ImportImageResponse importImageWithOptions(ImportImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bootMode)) {
            body.put("BootMode", request.bootMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSecurityCheck)) {
            body.put("EnableSecurityCheck", request.enableSecurityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCategory)) {
            body.put("GpuCategory", request.gpuCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverType)) {
            body.put("GpuDriverType", request.gpuDriverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            body.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectPath)) {
            body.put("OssObjectPath", request.ossObjectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            body.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            body.put("SystemDiskSize", request.systemDiskSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, only ProductType=CloudDesktop is supported. Upload the image file first, and then pass its OSS object path to initiate the import. You can call GetUploadInfo to obtain upload credentials. After the API returns the image and version IDs, you can call GetImageById or GetImageDistributeInfo to query the creation and distribution status. A successful response indicates that the import request has been accepted, not that the image is already available.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports an image file from Object Storage Service (OSS) as a custom Cloud Desktop image and returns the image ID and version ID.</p>
     * 
     * @param request ImportImageRequest
     * @return ImportImageResponse
     */
    public ImportImageResponse importImage(ImportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Filter by Agent provider, business platform, business type, end user, and instance memory switch as needed. Retain the filter conditions and increment the page number when navigating to the next page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the memory configurations, memory statistics, and backup summaries of agent instances for the current account in a paged manner.</p>
     * 
     * @param request ListAgentInstanceMemoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentInstanceMemoryResponse
     */
    public ListAgentInstanceMemoryResponse listAgentInstanceMemoryWithOptions(ListAgentInstanceMemoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedEndUserIds)) {
            query.put("ExcludedEndUserIds", request.excludedEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryStatuses)) {
            query.put("MemoryStatuses", request.memoryStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            query.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentInstanceMemory"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentInstanceMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Filter by Agent provider, business platform, business type, end user, and instance memory switch as needed. Retain the filter conditions and increment the page number when navigating to the next page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the memory configurations, memory statistics, and backup summaries of agent instances for the current account in a paged manner.</p>
     * 
     * @param request ListAgentInstanceMemoryRequest
     * @return ListAgentInstanceMemoryResponse
     */
    public ListAgentInstanceMemoryResponse listAgentInstanceMemory(ListAgentInstanceMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentInstanceMemoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a deduplicated list of version numbers of undeleted agent instances under a specified tenant, aggregated by agent provider and optionally filtered by agent platform. The results are returned in ascending order of version numbers.</p>
     * 
     * @param request ListAgentInstanceVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentInstanceVersionsResponse
     */
    public ListAgentInstanceVersionsResponse listAgentInstanceVersionsWithOptions(ListAgentInstanceVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentInstanceVersions"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentInstanceVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a deduplicated list of version numbers of undeleted agent instances under a specified tenant, aggregated by agent provider and optionally filtered by agent platform. The results are returned in ascending order of version numbers.</p>
     * 
     * @param request ListAgentInstanceVersionsRequest
     * @return ListAgentInstanceVersionsResponse
     */
    public ListAgentInstanceVersionsResponse listAgentInstanceVersions(ListAgentInstanceVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentInstanceVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When multiple filter conditions are specified, they take effect together. AppName supports contains matching. If a single-value filter and the corresponding list filter are specified at the same time, the intersection is used. To avoid empty results, specify only one of them.
     * If PageSize is omitted, the default value is 10. We recommend that you start from page 1 and query page by page until the number of retrieved records reaches the value of Count. Before you delete an application, check the Deletable field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries valid applications of the current account by using paging based on conditions such as the application ID, name, type, and associated product.</p>
     * 
     * @param tmpReq ListAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppResponse
     */
    public ListAppResponse listAppWithOptions(ListAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAppShrinkRequest request = new ListAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizTypeList)) {
            request.bizTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizTypeList, "BizTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productTypeList)) {
            request.productTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productTypeList, "ProductTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypeListShrink)) {
            body.put("BizTypeList", request.bizTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originAppType)) {
            body.put("OriginAppType", request.originAppType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productTypeListShrink)) {
            body.put("ProductTypeList", request.productTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAppType)) {
            body.put("SubAppType", request.subAppType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApp"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>When multiple filter conditions are specified, they take effect together. AppName supports contains matching. If a single-value filter and the corresponding list filter are specified at the same time, the intersection is used. To avoid empty results, specify only one of them.
     * If PageSize is omitted, the default value is 10. We recommend that you start from page 1 and query page by page until the number of retrieved records reaches the value of Count. Before you delete an application, check the Deletable field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries valid applications of the current account by using paging based on conditions such as the application ID, name, type, and associated product.</p>
     * 
     * @param request ListAppRequest
     * @return ListAppResponse
     */
    public ListAppResponse listApp(ListAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of multiple app instance groups that meet the specified conditions.</p>
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
     * <p>Queries the details of multiple app instance groups that meet the specified conditions.</p>
     * 
     * @param request ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    public ListAppInstanceGroupResponse listAppInstanceGroup(ListAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to select session specifications and does not create resources. The returned scope is affected by the available specifications and business region of the account. An empty result does not indicate a request failure.
     * <strong>Filtering and pagination:</strong></p>
     * <ul>
     * <li><code>ProductType</code> is required. Explicitly specify <code>BizRegionId</code>, <code>PageNumber</code>, and <code>PageSize</code>.</li>
     * <li>If <code>BizRegionId</code> is not provided, the region of the current request is used. You can call <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListRegions">ListRegions</a> to obtain the business region.</li>
     * <li>You can specify both <code>AppInstanceType</code> and <code>AppInstanceTypeList</code>. In this case, only the specifications that meet both conditions are returned. No priority override exists. The list can contain up to 100 items.</li>
     * <li>The specification family, CPU, memory, GPU memory, operating system, and category conditions are filtered by intersection. The union is not automatically applied.</li>
     * <li>Pass <code>PageNumber</code> starting from 1. Use <code>TotalCount</code>, <code>PageSize</code>, and <code>PageNumber</code> to continue pagination until all matching results are read.
     * <strong>Inventory and subsequent calls:</strong></li>
     * <li>Inventory is queried only when <code>QueryInventory=true</code>. If inventory information is not obtained, you cannot determine that the inventory is 0.</li>
     * <li>The inventory is the current query result and does not represent a successful reservation.</li>
     * <li>After obtaining <code>AppInstanceType</code>, you can query the price based on the session specification parameter requirements of <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetResourcePrice">GetResourcePrice</a>.</li>
     * <li>The current query does not use <code>AppCenterImageId</code> to filter specifications. Do not use this parameter to determine the compatibility between images and specifications.
     * Field examples are used to demonstrate how to fill in the fields. The existence of example specifications in the selected region or account is not guaranteed. The GPU count field does not currently provide values. Use the GPU memory field to understand the specifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on the available session specifications for the current account based on the product, region, operating system, and specification conditions, returning results through paging.</p>
     * 
     * @param request ListAppInstanceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstanceTypeResponse
     */
    public ListAppInstanceTypeResponse listAppInstanceTypeWithOptions(ListAppInstanceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            query.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceType)) {
            query.put("AppInstanceType", request.appInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceTypeFamily)) {
            query.put("AppInstanceTypeFamily", request.appInstanceTypeFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceTypeList)) {
            query.put("AppInstanceTypeList", request.appInstanceTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuMemory)) {
            query.put("GpuMemory", request.gpuMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
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

        if (!com.aliyun.teautil.Common.isUnset(request.queryInventory)) {
            query.put("QueryInventory", request.queryInventory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstanceType"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstanceTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to select session specifications and does not create resources. The returned scope is affected by the available specifications and business region of the account. An empty result does not indicate a request failure.
     * <strong>Filtering and pagination:</strong></p>
     * <ul>
     * <li><code>ProductType</code> is required. Explicitly specify <code>BizRegionId</code>, <code>PageNumber</code>, and <code>PageSize</code>.</li>
     * <li>If <code>BizRegionId</code> is not provided, the region of the current request is used. You can call <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListRegions">ListRegions</a> to obtain the business region.</li>
     * <li>You can specify both <code>AppInstanceType</code> and <code>AppInstanceTypeList</code>. In this case, only the specifications that meet both conditions are returned. No priority override exists. The list can contain up to 100 items.</li>
     * <li>The specification family, CPU, memory, GPU memory, operating system, and category conditions are filtered by intersection. The union is not automatically applied.</li>
     * <li>Pass <code>PageNumber</code> starting from 1. Use <code>TotalCount</code>, <code>PageSize</code>, and <code>PageNumber</code> to continue pagination until all matching results are read.
     * <strong>Inventory and subsequent calls:</strong></li>
     * <li>Inventory is queried only when <code>QueryInventory=true</code>. If inventory information is not obtained, you cannot determine that the inventory is 0.</li>
     * <li>The inventory is the current query result and does not represent a successful reservation.</li>
     * <li>After obtaining <code>AppInstanceType</code>, you can query the price based on the session specification parameter requirements of <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetResourcePrice">GetResourcePrice</a>.</li>
     * <li>The current query does not use <code>AppCenterImageId</code> to filter specifications. Do not use this parameter to determine the compatibility between images and specifications.
     * Field examples are used to demonstrate how to fill in the fields. The existence of example specifications in the selected region or account is not guaranteed. The GPU count field does not currently provide values. Use the GPU memory field to understand the specifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on the available session specifications for the current account based on the product, region, operating system, and specification conditions, returning results through paging.</p>
     * 
     * @param request ListAppInstanceTypeRequest
     * @return ListAppInstanceTypeResponse
     */
    public ListAppInstanceTypeResponse listAppInstanceType(ListAppInstanceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstanceTypeWithOptions(request, runtime);
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
     * <p>This operation queries the list of app instance groups to which a specified user (EndUserId) has been granted <strong>app instance group-level authorization</strong>. It returns the basic information of each app instance group (such as ID, name, status, region, creation time, and expiration time) and the list of applications deployed in the app instance group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only app instance groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized for individual applications through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only app instance groups whose product type matches ProductType and that are not deleted are returned. If no applications are deployed in the app instance group image, the app instance group is not returned.</li>
     * <li>The results are sorted in descending order based on the update time of the authorization records. The most recently authorized or modified app instance groups are ranked first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation is called to authorize the app instance group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId uses <strong>exact match</strong> based on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName use <strong>fuzzy match</strong> (a hit occurs if the string is contained). If multiple filter conditions are specified, all conditions must be met.</li>
     * <li>PageNumber starts from 1. Valid values for PageSize: 1 to 100.</li>
     * <li>If the user does not have any app instance groups with authorization that meet the conditional requirements, the operation returns a normal response: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the app instance group to the user.</li>
     * <li>Call this operation to query the app instance groups authorized for the user and the applications deployed in the app instance groups.</li>
     * <li>To obtain the application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation based on the returned AppInstanceGroupId and the AppId in Apps.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the app instance groups for which a specified user has obtained access permissions through app instance group-level authorization, and supports fuzzy filtering by app instance group ID, app instance group name, application ID, and application name.</p>
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
     * <p>This operation queries the list of app instance groups to which a specified user (EndUserId) has been granted <strong>app instance group-level authorization</strong>. It returns the basic information of each app instance group (such as ID, name, status, region, creation time, and expiration time) and the list of applications deployed in the app instance group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only app instance groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized for individual applications through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only app instance groups whose product type matches ProductType and that are not deleted are returned. If no applications are deployed in the app instance group image, the app instance group is not returned.</li>
     * <li>The results are sorted in descending order based on the update time of the authorization records. The most recently authorized or modified app instance groups are ranked first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation is called to authorize the app instance group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId uses <strong>exact match</strong> based on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName use <strong>fuzzy match</strong> (a hit occurs if the string is contained). If multiple filter conditions are specified, all conditions must be met.</li>
     * <li>PageNumber starts from 1. Valid values for PageSize: 1 to 100.</li>
     * <li>If the user does not have any app instance groups with authorization that meet the conditional requirements, the operation returns a normal response: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the app instance group to the user.</li>
     * <li>Call this operation to query the app instance groups authorized for the user and the applications deployed in the app instance groups.</li>
     * <li>To obtain the application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation based on the returned AppInstanceGroupId and the AppId in Apps.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the app instance groups for which a specified user has obtained access permissions through app instance group-level authorization, and supports fuzzy filtering by app instance group ID, app instance group name, application ID, and application name.</p>
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
     * <p>This operation queries the applications authorized for a specified user at the application level. <strong>It returns only the records of applications authorized for the user at the application level</strong> (for example, authorization completed by calling the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). Authorization granted for an entire app instance group by calling the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation is not included in the response.
     * The response is deduplicated by the combination of app instance group and application. Each record corresponds to an application within an app instance group.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The user exists in the current account. If the user does not exist, the error code User.NotFound is returned. You can call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</li>
     * <li>The app instance group to which the application belongs has been created, and the application has been authorized for the user at the application level. If no application-level authorization has been performed, an empty application list is returned.</li>
     * </ul>
     * <h2>Metric description</h2>
     * <ul>
     * <li><strong>EndUserId and ProductType are required.</strong> Set ProductType to CloudApp, which indicates WUYING Cloud App.</li>
     * <li>AppInstanceGroupId, AppId, AppInstanceGroupName, and AppName are optional filter conditions. Fuzzy match is used for all these parameters, and they can be used in any combination. If all of them are omitted, all application-level authorization records for the user are returned.</li>
     * <li>Use PageNumber and PageSize for paging. PageNumber starts from 1, and the valid values for PageSize range from 1 to 100. You can determine whether to continue the query based on the returned TotalCount.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the app instance group ID (AppInstanceGroupId) and the application IDs (AppId in the Apps list) of the applications deployed in the app instance group.</li>
     * <li>Call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize the applications for the target user.</li>
     * <li>Call this operation to query the applications authorized for the user.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the applications for which a specified user has obtained access permissions through application authorization, and supports fuzzy filtering by app instance group ID, app instance group name, application ID, or application name.</p>
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
     * <p>This operation queries the applications authorized for a specified user at the application level. <strong>It returns only the records of applications authorized for the user at the application level</strong> (for example, authorization completed by calling the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). Authorization granted for an entire app instance group by calling the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation is not included in the response.
     * The response is deduplicated by the combination of app instance group and application. Each record corresponds to an application within an app instance group.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The user exists in the current account. If the user does not exist, the error code User.NotFound is returned. You can call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</li>
     * <li>The app instance group to which the application belongs has been created, and the application has been authorized for the user at the application level. If no application-level authorization has been performed, an empty application list is returned.</li>
     * </ul>
     * <h2>Metric description</h2>
     * <ul>
     * <li><strong>EndUserId and ProductType are required.</strong> Set ProductType to CloudApp, which indicates WUYING Cloud App.</li>
     * <li>AppInstanceGroupId, AppId, AppInstanceGroupName, and AppName are optional filter conditions. Fuzzy match is used for all these parameters, and they can be used in any combination. If all of them are omitted, all application-level authorization records for the user are returned.</li>
     * <li>Use PageNumber and PageSize for paging. PageNumber starts from 1, and the valid values for PageSize range from 1 to 100. You can determine whether to continue the query based on the returned TotalCount.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the app instance group ID (AppInstanceGroupId) and the application IDs (AppId in the Apps list) of the applications deployed in the app instance group.</li>
     * <li>Call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize the applications for the target user.</li>
     * <li>Call this operation to query the applications authorized for the user.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the applications for which a specified user has obtained access permissions through application authorization, and supports fuzzy filtering by app instance group ID, app instance group name, application ID, or application name.</p>
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
     * <p>Queries the user groups authorized for an app instance group.</p>
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
     * <p>Queries the user groups authorized for an app instance group.</p>
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
     * <p>This operation queries the currently authorized users of a specified app instance group (AppInstanceGroupId) or app instance group set (AppInstanceGroupSetId). It returns the username, account type, email address, phone number, and the authorization mode of the app instance group to which each user belongs.</p>
     * <ul>
     * <li>This operation returns <strong>authorization relationships</strong>, which does not indicate that the users are currently online or have established connections.</li>
     * <li>In the Cloud Browser product, an app instance group is a cloud browser group, and the app instance group ID is the browser group ID.
     * The return scope depends on the authorization mode of the app instance group (the AuthMode response parameter):</li>
     * <li>When the authorization mode is <code>App</code> (application authorization) or <code>AppInstanceGroup</code> (app instance group authorization): returns the users authorized by app instance group through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation and the users authorized by application through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If AppId is specified, only the users <strong>specifically authorized for this application</strong> are returned.</li>
     * <li>When the authorization mode is <code>Session</code> (session authorization): returns the users who are granted persistent sessions, and lists all persistent session IDs granted to each user in AppInstancePersistentIds. If AppInstancePersistentId is specified, only the users granted this session are returned.</li>
     * <li>When querying by app instance group set: returns the users authorized to the set. The AppInstanceGroupId response parameter is the primary app instance group ID of the set, and AppInstanceGroupSetId is the ID of the queried set.
     * When querying by app instance group, the results are sorted in descending order of authorization time, with the most recently authorized users listed first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target app instance group or app instance group set has been created, belongs to the current account, and its product type matches ProductType. Otherwise, a resource not found error code is returned.</li>
     * <li>Users have been authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If no users have been authorized, the operation returns a normal response with Users as an empty list and TotalCount as 0.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType, PageNumber, and PageSize are required</strong>. If the value of ProductType is invalid, the <code>ProductTypeInvalid</code> error code is returned.</li>
     * <li><strong>You must specify either AppInstanceGroupId or AppInstanceGroupSetId, but not both</strong>. If both are specified or neither is specified, the <code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code> error code is returned.</li>
     * <li><strong>AppId and AppInstancePersistentId are not supported when querying by app instance group set</strong>. If either is specified, the <code>InvalidParameter.AppId</code> or <code>InvalidParameter.AppInstancePersistentId</code> error code is returned.</li>
     * <li>EndUserId performs <strong>exact match</strong> by username, and UserIdFuzzy performs <strong>fuzzy match</strong> by username (a hit occurs if the username contains the keyword). Both can be specified at the same time, and both conditions must be met.</li>
     * <li>PageNumber starts from 1. The value range of PageSize is 1 to 100.</li>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, TotalCount is the <strong>number of authorization records</strong> that meet the conditions. If the same user has multiple authorization records (for example, authorized for multiple applications), the user is merged into one in Users. Therefore, the number of users returned on the current page may be less than PageSize. Use TotalCount to determine whether to continue paging. When the authorization mode is <code>Session</code>, TotalCount is the number of deduplicated users.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID. For cloud browser groups, call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</li>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize by app instance group, or call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize by application.</li>
     * <li>Call this operation to query the authorized users. To remove authorization, pass the returned EndUserId to the UnAuthorizeUserIds parameter of the preceding authorization operations.</li>
     * </ol>
     * <h2>Error codes</h2>
     * <ul>
     * <li><code>ProductTypeInvalid</code>: The value of ProductType is invalid.</li>
     * <li><code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code>: Both AppInstanceGroupId and AppInstanceGroupSetId are specified, or neither is specified.</li>
     * <li><code>InvalidParameter.AppId</code>: AppId is specified when querying by app instance group set.</li>
     * <li><code>InvalidParameter.AppInstancePersistentId</code>: AppInstancePersistentId is specified when querying by app instance group set.</li>
     * <li><code>InvalidAppInstanceGroupSpecItem.NotFound</code>: The app instance group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidBrowserInstanceGroup.NotFound</code>: When ProductType is <code>CloudBrowser</code>, the cloud browser group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidAppInstanceGroupSet.NotFound</code>: The app instance group set does not exist, does not belong to the current account, the product type does not match, or there is no available primary app instance group in the set.</li>
     * <li><code>InvalidAppInstanceGroupSet.ActivationFailed</code>: The app instance group set is not in an available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the authorized user list of a specified app instance group or app instance group set, and supports exact or fuzzy filtering by username.</p>
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
     * <p>This operation queries the currently authorized users of a specified app instance group (AppInstanceGroupId) or app instance group set (AppInstanceGroupSetId). It returns the username, account type, email address, phone number, and the authorization mode of the app instance group to which each user belongs.</p>
     * <ul>
     * <li>This operation returns <strong>authorization relationships</strong>, which does not indicate that the users are currently online or have established connections.</li>
     * <li>In the Cloud Browser product, an app instance group is a cloud browser group, and the app instance group ID is the browser group ID.
     * The return scope depends on the authorization mode of the app instance group (the AuthMode response parameter):</li>
     * <li>When the authorization mode is <code>App</code> (application authorization) or <code>AppInstanceGroup</code> (app instance group authorization): returns the users authorized by app instance group through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation and the users authorized by application through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If AppId is specified, only the users <strong>specifically authorized for this application</strong> are returned.</li>
     * <li>When the authorization mode is <code>Session</code> (session authorization): returns the users who are granted persistent sessions, and lists all persistent session IDs granted to each user in AppInstancePersistentIds. If AppInstancePersistentId is specified, only the users granted this session are returned.</li>
     * <li>When querying by app instance group set: returns the users authorized to the set. The AppInstanceGroupId response parameter is the primary app instance group ID of the set, and AppInstanceGroupSetId is the ID of the queried set.
     * When querying by app instance group, the results are sorted in descending order of authorization time, with the most recently authorized users listed first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target app instance group or app instance group set has been created, belongs to the current account, and its product type matches ProductType. Otherwise, a resource not found error code is returned.</li>
     * <li>Users have been authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If no users have been authorized, the operation returns a normal response with Users as an empty list and TotalCount as 0.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType, PageNumber, and PageSize are required</strong>. If the value of ProductType is invalid, the <code>ProductTypeInvalid</code> error code is returned.</li>
     * <li><strong>You must specify either AppInstanceGroupId or AppInstanceGroupSetId, but not both</strong>. If both are specified or neither is specified, the <code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code> error code is returned.</li>
     * <li><strong>AppId and AppInstancePersistentId are not supported when querying by app instance group set</strong>. If either is specified, the <code>InvalidParameter.AppId</code> or <code>InvalidParameter.AppInstancePersistentId</code> error code is returned.</li>
     * <li>EndUserId performs <strong>exact match</strong> by username, and UserIdFuzzy performs <strong>fuzzy match</strong> by username (a hit occurs if the username contains the keyword). Both can be specified at the same time, and both conditions must be met.</li>
     * <li>PageNumber starts from 1. The value range of PageSize is 1 to 100.</li>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, TotalCount is the <strong>number of authorization records</strong> that meet the conditions. If the same user has multiple authorization records (for example, authorized for multiple applications), the user is merged into one in Users. Therefore, the number of users returned on the current page may be less than PageSize. Use TotalCount to determine whether to continue paging. When the authorization mode is <code>Session</code>, TotalCount is the number of deduplicated users.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID. For cloud browser groups, call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</li>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize by app instance group, or call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize by application.</li>
     * <li>Call this operation to query the authorized users. To remove authorization, pass the returned EndUserId to the UnAuthorizeUserIds parameter of the preceding authorization operations.</li>
     * </ol>
     * <h2>Error codes</h2>
     * <ul>
     * <li><code>ProductTypeInvalid</code>: The value of ProductType is invalid.</li>
     * <li><code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code>: Both AppInstanceGroupId and AppInstanceGroupSetId are specified, or neither is specified.</li>
     * <li><code>InvalidParameter.AppId</code>: AppId is specified when querying by app instance group set.</li>
     * <li><code>InvalidParameter.AppInstancePersistentId</code>: AppInstancePersistentId is specified when querying by app instance group set.</li>
     * <li><code>InvalidAppInstanceGroupSpecItem.NotFound</code>: The app instance group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidBrowserInstanceGroup.NotFound</code>: When ProductType is <code>CloudBrowser</code>, the cloud browser group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidAppInstanceGroupSet.NotFound</code>: The app instance group set does not exist, does not belong to the current account, the product type does not match, or there is no available primary app instance group in the set.</li>
     * <li><code>InvalidAppInstanceGroupSet.ActivationFailed</code>: The app instance group set is not in an available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the authorized user list of a specified app instance group or app instance group set, and supports exact or fuzzy filtering by username.</p>
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
     * <p>Queries the binding information between users and resources.</p>
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
     * <p>Queries the binding information between users and resources.</p>
     * 
     * @param request ListBindInfoRequest
     * @return ListBindInfoResponse
     */
    public ListBindInfoResponse listBindInfo(ListBindInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of bookmarks under a specified cloud browser group or delivery group set by using paging.</p>
     * 
     * @param request ListBrowserBookmarksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBrowserBookmarksResponse
     */
    public ListBrowserBookmarksResponse listBrowserBookmarksWithOptions(ListBrowserBookmarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupId)) {
            query.put("BrowserInstanceGroupId", request.browserInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupSetId)) {
            query.put("BrowserInstanceGroupSetId", request.browserInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
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
            new TeaPair("action", "ListBrowserBookmarks"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBrowserBookmarksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of bookmarks under a specified cloud browser group or delivery group set by using paging.</p>
     * 
     * @param request ListBrowserBookmarksRequest
     * @return ListBrowserBookmarksResponse
     */
    public ListBrowserBookmarksResponse listBrowserBookmarks(ListBrowserBookmarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBrowserBookmarksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to use queries in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. You can specify only one value for status filtering at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> to perform a paged query. Use the returned <code>TotalCount</code> to determine whether to query the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> by using the returned identity.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> in the examples only indicates that the current scenario does not apply or the field is not returned. It is not a character string actually returned by the API operation. Common resource identity examples are masked. Use the actual query results when you use them.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries cloud browser groups and their current status by using paging.</p>
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
     * <p>This topic describes how to use queries in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. You can specify only one value for status filtering at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> to perform a paged query. Use the returned <code>TotalCount</code> to determine whether to query the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> by using the returned identity.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> in the examples only indicates that the current scenario does not apply or the field is not returned. It is not a character string actually returned by the API operation. Common resource identity examples are masked. Use the actual query results when you use them.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries cloud browser groups and their current status by using paging.</p>
     * 
     * @param request ListBrowserInstanceGroupRequest
     * @return ListBrowserInstanceGroupResponse
     */
    public ListBrowserInstanceGroupResponse listBrowserInstanceGroup(ListBrowserInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBrowserInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Invoke this operation to perform a paging query on the list of access restriction URLs (Restricted URLs) configured for a cloud browser delivery group or delivery group set to view the details of the URLs configured in the current access control policy.
     * You must specify either BrowserInstanceGroupId or BrowserInstanceGroupSetId, but not both. If you specify BrowserInstanceGroupId, the restricted URLs for the delivery group are queried. If you specify BrowserInstanceGroupSetId, the restricted URLs for the delivery group set are queried. Specifying both or neither returns a parameter error.
     * You can use Keyword to filter restricted URLs by using a case-insensitive include match. If this parameter is not specified, all restricted URLs are returned. Pagination is controlled by PageNumber and PageSize. Valid values for PageSize: 1 to 200. Default value: 200. Default value for PageNumber: 0. If the value is less than 1, the first page is returned. In the response, TotalCount indicates the total number of records that meet the filter conditions, and Data contains the records on the current page. If no data is found, an empty array is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the list of access restriction URLs configured for a specified browser delivery group or delivery group set.</p>
     * 
     * @param request ListBrowserRestrictedURLsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBrowserRestrictedURLsResponse
     */
    public ListBrowserRestrictedURLsResponse listBrowserRestrictedURLsWithOptions(ListBrowserRestrictedURLsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupId)) {
            query.put("BrowserInstanceGroupId", request.browserInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupSetId)) {
            query.put("BrowserInstanceGroupSetId", request.browserInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
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
            new TeaPair("action", "ListBrowserRestrictedURLs"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBrowserRestrictedURLsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Invoke this operation to perform a paging query on the list of access restriction URLs (Restricted URLs) configured for a cloud browser delivery group or delivery group set to view the details of the URLs configured in the current access control policy.
     * You must specify either BrowserInstanceGroupId or BrowserInstanceGroupSetId, but not both. If you specify BrowserInstanceGroupId, the restricted URLs for the delivery group are queried. If you specify BrowserInstanceGroupSetId, the restricted URLs for the delivery group set are queried. Specifying both or neither returns a parameter error.
     * You can use Keyword to filter restricted URLs by using a case-insensitive include match. If this parameter is not specified, all restricted URLs are returned. Pagination is controlled by PageNumber and PageSize. Valid values for PageSize: 1 to 200. Default value: 200. Default value for PageNumber: 0. If the value is less than 1, the first page is returned. In the response, TotalCount indicates the total number of records that meet the filter conditions, and Data contains the records on the current page. If no data is found, an empty array is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the list of access restriction URLs configured for a specified browser delivery group or delivery group set.</p>
     * 
     * @param request ListBrowserRestrictedURLsRequest
     * @return ListBrowserRestrictedURLsResponse
     */
    public ListBrowserRestrictedURLsResponse listBrowserRestrictedURLs(ListBrowserRestrictedURLsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBrowserRestrictedURLsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this operation to query the execution results of a command invocation (InvocationId) across persistent sessions. This allows you to track the execution status and obtain the command output. The InvocationId is the command execution ID returned when you call RunAppInstanceCommand to deliver a command.
     * Currently, only WuyingServer is supported for ProductType. You must specify at least one of AppInstanceGroupIds and AppInstanceGroupId. If both are specified, AppInstanceGroupIds takes precedence. When AppInstanceGroupIds is specified, you can pass up to 200 delivery group IDs, and these delivery groups must be in the same region. If any delivery group does not exist, a delivery group not found error is returned. If the delivery groups are in different regions, a region mismatch error is returned. When only AppInstanceGroupId is specified, the command execution results under this delivery group are queried.
     * You can use AppInstancePersistentIds to query the execution results of only specified persistent sessions. When AppInstanceGroupIds is specified, only persistent sessions that belong to these delivery groups are retained. If no matching persistent sessions are found, an empty list is returned and TotalCount is 0. For pagination, use PageNumber and PageSize. MaxResults and NextToken do not take effect currently.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution results of commands delivered by RunAppInstanceCommand in persistent sessions, including the execution status, start and end times, and command output.</p>
     * 
     * @param request ListCommandInvocationResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommandInvocationResultsResponse
     */
    public ListCommandInvocationResultsResponse listCommandInvocationResultsWithOptions(ListCommandInvocationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupIds)) {
            body.put("AppInstanceGroupIds", request.appInstanceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentIds)) {
            body.put("AppInstancePersistentIds", request.appInstancePersistentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationId)) {
            body.put("InvocationId", request.invocationId);
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
            new TeaPair("action", "ListCommandInvocationResults"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommandInvocationResultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this operation to query the execution results of a command invocation (InvocationId) across persistent sessions. This allows you to track the execution status and obtain the command output. The InvocationId is the command execution ID returned when you call RunAppInstanceCommand to deliver a command.
     * Currently, only WuyingServer is supported for ProductType. You must specify at least one of AppInstanceGroupIds and AppInstanceGroupId. If both are specified, AppInstanceGroupIds takes precedence. When AppInstanceGroupIds is specified, you can pass up to 200 delivery group IDs, and these delivery groups must be in the same region. If any delivery group does not exist, a delivery group not found error is returned. If the delivery groups are in different regions, a region mismatch error is returned. When only AppInstanceGroupId is specified, the command execution results under this delivery group are queried.
     * You can use AppInstancePersistentIds to query the execution results of only specified persistent sessions. When AppInstanceGroupIds is specified, only persistent sessions that belong to these delivery groups are retained. If no matching persistent sessions are found, an empty list is returned and TotalCount is 0. For pagination, use PageNumber and PageSize. MaxResults and NextToken do not take effect currently.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution results of commands delivered by RunAppInstanceCommand in persistent sessions, including the execution status, start and end times, and command output.</p>
     * 
     * @param request ListCommandInvocationResultsRequest
     * @return ListCommandInvocationResultsResponse
     */
    public ListCommandInvocationResultsResponse listCommandInvocationResults(ListCommandInvocationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommandInvocationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of desktop Agent runtimes.</p>
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
     * <p>Queries a list of desktop Agent runtimes.</p>
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
     * <p>Supports filtering by image ID, name, status, type, package type, operating system, business line, product type, and protocol type. Multiple filter conditions take effect simultaneously, and the results are returned in descending order of image creation time. Returns the basic information and version identifiers of images. To obtain specific version and region distribution information, call ListImage.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query to retrieve the basic information of images, including the image name, type, status, and version identity, with paging support.</p>
     * 
     * @param request ListImageBaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageBaseInfoResponse
     */
    public ListImageBaseInfoResponse listImageBaseInfoWithOptions(ListImageBaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            body.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageBaseInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageBaseInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Supports filtering by image ID, name, status, type, package type, operating system, business line, product type, and protocol type. Multiple filter conditions take effect simultaneously, and the results are returned in descending order of image creation time. Returns the basic information and version identifiers of images. To obtain specific version and region distribution information, call ListImage.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query to retrieve the basic information of images, including the image name, type, status, and version identity, with paging support.</p>
     * 
     * @param request ListImageBaseInfoRequest
     * @return ListImageBaseInfoResponse
     */
    public ListImageBaseInfoResponse listImageBaseInfo(ListImageBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImageBaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the built-in tags supported by images.</p>
     * 
     * @param request ListImageTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageTagsResponse
     */
    public ListImageTagsResponse listImageTagsWithOptions(ListImageTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
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
            new TeaPair("action", "ListImageTags"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the built-in tags supported by images.</p>
     * 
     * @param request ListImageTagsRequest
     * @return ListImageTagsResponse
     */
    public ListImageTagsResponse listImageTags(ListImageTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImageTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use paging to query the list of model templates under a model provider template in the Wuying Agent Management Center. You can filter the results by model group ID, model provider template ID, model template ID, and model encoding. When you query by model group, the default model is automatically pinned to the top.
     * Before you call this operation, make sure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of LLM templates.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
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
     * <p>You can use paging to query the list of model templates under a model provider template in the Wuying Agent Management Center. You can filter the results by model group ID, model provider template ID, model template ID, and model encoding. When you query by model group, the default model is automatically pinned to the top.
     * Before you call this operation, make sure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of LLM templates.</p>
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
     * <p>Queries a list of model provider endpoints.</p>
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
     * <p>Queries a list of model provider endpoints.</p>
     * 
     * @param request ListModelProviderEndpointsRequest
     * @return ListModelProviderEndpointsResponse
     */
    public ListModelProviderEndpointsResponse listModelProviderEndpoints(ListModelProviderEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelProviderEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available LLM model codes for a specified model provider. Supports filtering by LLM code, model brand, recommended tier, and recommendation status, and returns model information such as the model name, description, release time, features, inference modality, pricing, credit multiplier, and risk type.</p>
     * 
     * @param request ListModelProviderLlmCodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelProviderLlmCodesResponse
     */
    public ListModelProviderLlmCodesResponse listModelProviderLlmCodesWithOptions(ListModelProviderLlmCodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmCode)) {
            query.put("LlmCode", request.llmCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelBrands)) {
            query.put("ModelBrands", request.modelBrands);
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

        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            query.put("ProviderTemplateId", request.providerTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommended)) {
            query.put("Recommended", request.recommended);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommendedLevels)) {
            query.put("RecommendedLevels", request.recommendedLevels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelProviderLlmCodes"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelProviderLlmCodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available LLM model codes for a specified model provider. Supports filtering by LLM code, model brand, recommended tier, and recommendation status, and returns model information such as the model name, description, release time, features, inference modality, pricing, credit multiplier, and risk type.</p>
     * 
     * @param request ListModelProviderLlmCodesRequest
     * @return ListModelProviderLlmCodesResponse
     */
    public ListModelProviderLlmCodesResponse listModelProviderLlmCodes(ListModelProviderLlmCodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelProviderLlmCodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use paging to query the list of model provider templates under a specified model group in the Wuying Agent Management Center. You can filter the templates by provider name, model group ID, and provider template ID. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of model provider templates.</p>
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
     * <p>You can use paging to query the list of model provider templates under a specified model group in the Wuying Agent Management Center. You can filter the templates by provider name, model group ID, and provider template ID. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of model provider templates.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.gpuSpec)) {
            query.put("GpuSpec", request.gpuSpec);
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

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:ListPublishedAppInstanceGroup permission.
     * Only delivery groups that are in the published state and have deployed applications in their images are included in the query results. This operation only queries information. It does not create delivery groups, assign users, or grant application access permissions.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify ProductType, PageNumber, and PageSize.</strong> The page number starts from 1, and the number of entries per page ranges from 1 to 100.</li>
     * <li>AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all support fuzzy match. You can specify them individually or in combination. If multiple conditions are specified, all conditions must be met. If both AppId and AppName are specified, they must be met by the same application.</li>
     * <li>If an optional filter parameter is not specified or an empty string is specified, the condition is not used for filtering. The query results are sorted in descending order of the delivery group creation time. A delivery group is not returned multiple times even if it contains multiple matched applications.</li>
     * <li>ExcludeUserId is used to exclude delivery groups for which all applications have been directly authorized to a specified user. It cannot be used to determine whether the user has no access permissions at all.</li>
     * <li>AppId and AppName only filter delivery groups and <strong>do not limit the returned Apps list to the matched applications</strong>.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Initiate a query with PageNumber=1 and the required PageSize. For Wuying Cloud App scenarios, set ProductType=CloudApp.</li>
     * <li>Read AppInstanceGroupModels. To retrieve the next page, keep the product type and filter conditions unchanged and increment PageNumber. If no delivery groups match the conditions, the total count is 0 and the list is empty. If the page number exceeds the range of the current results, the list may also be empty, but the total count still indicates the total number of all matched delivery groups.</li>
     * <li>To obtain the details of a single delivery group, pass the complete AppInstanceGroupId returned and the same ProductType to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The desensitized identity in the examples is used to demonstrate the format. Replace it with your actual identity when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries published delivery groups and their application information for a specified product type under the current Alibaba Cloud account by page, and supports filtering by delivery group, application, and user authorization status.</p>
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:ListPublishedAppInstanceGroup permission.
     * Only delivery groups that are in the published state and have deployed applications in their images are included in the query results. This operation only queries information. It does not create delivery groups, assign users, or grant application access permissions.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify ProductType, PageNumber, and PageSize.</strong> The page number starts from 1, and the number of entries per page ranges from 1 to 100.</li>
     * <li>AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all support fuzzy match. You can specify them individually or in combination. If multiple conditions are specified, all conditions must be met. If both AppId and AppName are specified, they must be met by the same application.</li>
     * <li>If an optional filter parameter is not specified or an empty string is specified, the condition is not used for filtering. The query results are sorted in descending order of the delivery group creation time. A delivery group is not returned multiple times even if it contains multiple matched applications.</li>
     * <li>ExcludeUserId is used to exclude delivery groups for which all applications have been directly authorized to a specified user. It cannot be used to determine whether the user has no access permissions at all.</li>
     * <li>AppId and AppName only filter delivery groups and <strong>do not limit the returned Apps list to the matched applications</strong>.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Initiate a query with PageNumber=1 and the required PageSize. For Wuying Cloud App scenarios, set ProductType=CloudApp.</li>
     * <li>Read AppInstanceGroupModels. To retrieve the next page, keep the product type and filter conditions unchanged and increment PageNumber. If no delivery groups match the conditions, the total count is 0 and the list is empty. If the page number exceeds the range of the current results, the list may also be empty, but the total count still indicates the total number of all matched delivery groups.</li>
     * <li>To obtain the details of a single delivery group, pass the complete AppInstanceGroupId returned and the same ProductType to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The desensitized identity in the examples is used to demonstrate the format. Replace it with your actual identity when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries published delivery groups and their application information for a specified product type under the current Alibaba Cloud account by page, and supports filtering by delivery group, application, and user authorization status.</p>
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
     * <h2>Prerequisites</h2>
     * <p>To call this operation as a RAM user or by using STS credentials, you must have the <code>appstreaming:ListPublishedApps</code> permission.
     * Only applications deployed in the images of published delivery groups are returned in the query results. This operation only queries information. It does not create delivery groups, nor does it grant or revoke application access permissions.</p>
     * <h2>Return granularity</h2>
     * <p>Results are returned item by item based on the &quot;delivery group + application&quot; combination. If the same application is deployed in multiple published delivery groups, multiple records are returned. <code>TotalCount</code> also counts the number of combinations. The list is sorted in descending order of the creation time of the associated delivery groups.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> The page number starts from <code>1</code>, and the number of entries per page ranges from <code>1</code> to <code>100</code>. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned, respectively.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can specify them individually or in combination. If multiple conditions are specified, all conditions must be met.</li>
     * <li>If an optional filter parameter is not specified or an empty string is passed, filtering is not performed based on this condition.</li>
     * <li><code>ExcludeUserId</code> is used to exclude applications that have been authorized for a specified user on a per-application basis, making it easier to filter out applications that can still be authorized for the user. <strong>Access permissions obtained through overall delivery group authorization or user groups are not evaluated by this condition.</strong></li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Initiate a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud App scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>Apps</code>. To retrieve the next page, keep the product type and filter conditions unchanged and increment <code>PageNumber</code>. If no matching results are found, <code>TotalCount</code> is <code>0</code> and <code>Apps</code> is an empty list. If the page number exceeds the result range, <code>Apps</code> may also be empty, but <code>TotalCount</code> still indicates the total number of matching records.</li>
     * <li>When you need to grant authorization to a user for an application on a per-application basis, pass the returned <code>AppInstanceGroupId</code>, <code>AppId</code>, and the same <code>ProductType</code> to <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a>. To view delivery group details, pass <code>AppInstanceGroupId</code> and <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identity in the examples is used to demonstrate the format. Replace it with your actual identity when you invoke the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on applications deployed in published delivery groups of a specified product type under the current Alibaba Cloud account. Returns each application along with its delivery group and the number of users granted authorization for the application. Supports filtering by delivery group, application, and user authorization status.</p>
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
     * <h2>Prerequisites</h2>
     * <p>To call this operation as a RAM user or by using STS credentials, you must have the <code>appstreaming:ListPublishedApps</code> permission.
     * Only applications deployed in the images of published delivery groups are returned in the query results. This operation only queries information. It does not create delivery groups, nor does it grant or revoke application access permissions.</p>
     * <h2>Return granularity</h2>
     * <p>Results are returned item by item based on the &quot;delivery group + application&quot; combination. If the same application is deployed in multiple published delivery groups, multiple records are returned. <code>TotalCount</code> also counts the number of combinations. The list is sorted in descending order of the creation time of the associated delivery groups.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> The page number starts from <code>1</code>, and the number of entries per page ranges from <code>1</code> to <code>100</code>. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned, respectively.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can specify them individually or in combination. If multiple conditions are specified, all conditions must be met.</li>
     * <li>If an optional filter parameter is not specified or an empty string is passed, filtering is not performed based on this condition.</li>
     * <li><code>ExcludeUserId</code> is used to exclude applications that have been authorized for a specified user on a per-application basis, making it easier to filter out applications that can still be authorized for the user. <strong>Access permissions obtained through overall delivery group authorization or user groups are not evaluated by this condition.</strong></li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Initiate a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud App scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>Apps</code>. To retrieve the next page, keep the product type and filter conditions unchanged and increment <code>PageNumber</code>. If no matching results are found, <code>TotalCount</code> is <code>0</code> and <code>Apps</code> is an empty list. If the page number exceeds the result range, <code>Apps</code> may also be empty, but <code>TotalCount</code> still indicates the total number of matching records.</li>
     * <li>When you need to grant authorization to a user for an application on a per-application basis, pass the returned <code>AppInstanceGroupId</code>, <code>AppId</code>, and the same <code>ProductType</code> to <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a>. To view delivery group details, pass <code>AppInstanceGroupId</code> and <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identity in the examples is used to demonstrate the format. Replace it with your actual identity when you invoke the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on applications deployed in published delivery groups of a specified product type under the current Alibaba Cloud account. Returns each application along with its delivery group and the number of users granted authorization for the application. Supports filtering by delivery group, application, and user authorization status.</p>
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
     * <p>The returned results are affected by the available region configurations of the account and the product type. If ProductType is omitted, the query is performed based on CloudApp.
     * This operation returns the regions available for image services. You cannot use this information to determine whether a specific image has been distributed to these regions. Before you create or distribute an image based on a parent image, you must also check the region information of the destination image.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of region IDs available for image services under a specified product for the current account.</p>
     * 
     * @param request ListRegionIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionIdResponse
     */
    public ListRegionIdResponse listRegionIdWithOptions(ListRegionIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegionId"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>The returned results are affected by the available region configurations of the account and the product type. If ProductType is omitted, the query is performed based on CloudApp.
     * This operation returns the regions available for image services. You cannot use this information to determine whether a specific image has been distributed to these regions. Before you create or distribute an image based on a parent image, you must also check the region information of the destination image.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of region IDs available for image services under a specified product for the current account.</p>
     * 
     * @param request ListRegionIdRequest
     * @return ListRegionIdResponse
     */
    public ListRegionIdResponse listRegionId(ListRegionIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionIdWithOptions(request, runtime);
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
     * <p>Queries the number of associated templates, cloud desktops, and cloud desktop pools.</p>
     * 
     * @param request ListRelatedResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRelatedResourceResponse
     */
    public ListRelatedResourceResponse listRelatedResourceWithOptions(ListRelatedResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
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
            new TeaPair("action", "ListRelatedResource"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRelatedResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of associated templates, cloud desktops, and cloud desktop pools.</p>
     * 
     * @param request ListRelatedResourceRequest
     * @return ListRelatedResourceResponse
     */
    public ListRelatedResourceResponse listRelatedResource(ListRelatedResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRelatedResourceWithOptions(request, runtime);
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
     * <p>This operation follows the Alibaba Cloud tagging specification and is used to query tags bound to Wuying Cloud App delivery groups. You can view the tags bound to resources by resource ID, or filter resources bound to specified tags by tag keys and values.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>A delivery group is created. You can obtain the delivery group ID by calling the ListAppInstanceGroup operation.</li>
     * <li>Tags are bound to the delivery group. You can bind tags by calling the TagResources operation, or bind them in the console or Tag service.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ResourceType is required</strong>. Only <code>APPINSTANCEGROUP</code> (delivery group) is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</li>
     * <li><strong>You must specify at least one of ResourceId.N and Tag.N</strong>. If neither is specified, the error code <code>MissingParameter.ResourceIdsOrTags</code> is returned.<ul>
     * <li>If only ResourceId.N is specified: all tags bound to these resources are returned.</li>
     * <li>If only Tag.N is specified: all resources bound to the specified tags and their matched tags are returned.</li>
     * <li>If both are specified: only records of the specified resources bound to the specified tags are returned.</li>
     * </ul>
     * </li>
     * <li>Tag.N.Key is required. If it is empty, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned. Tag.N.Value is optional. If it is not specified, the value corresponding to the tag key is not limited.</li>
     * <li>Multiple Tag.N parameters have an AND relationship. A resource is returned only if it is bound to all specified tags.</li>
     * </ul>
     * <h2>Response description</h2>
     * <ul>
     * <li>The response returns one record for each resource and tag key-value pair. If a resource is bound to multiple tags, multiple records are returned.</li>
     * <li>TotalCount indicates the number of records returned in the current request.</li>
     * <li>This operation returns all matched results at once. An empty NextToken in the response indicates that no more data is available.</li>
     * </ul>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Call ListAppInstanceGroup to obtain the delivery group ID.</li>
     * <li>Call TagResources to bind tags to the delivery group.</li>
     * <li>Call this operation to query the binding relationships by resource ID or tag condition.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to one or more delivery groups, or filters delivery groups that are bound to specified tags by tag keys and values.</p>
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
     * <p>This operation follows the Alibaba Cloud tagging specification and is used to query tags bound to Wuying Cloud App delivery groups. You can view the tags bound to resources by resource ID, or filter resources bound to specified tags by tag keys and values.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>A delivery group is created. You can obtain the delivery group ID by calling the ListAppInstanceGroup operation.</li>
     * <li>Tags are bound to the delivery group. You can bind tags by calling the TagResources operation, or bind them in the console or Tag service.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ResourceType is required</strong>. Only <code>APPINSTANCEGROUP</code> (delivery group) is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</li>
     * <li><strong>You must specify at least one of ResourceId.N and Tag.N</strong>. If neither is specified, the error code <code>MissingParameter.ResourceIdsOrTags</code> is returned.<ul>
     * <li>If only ResourceId.N is specified: all tags bound to these resources are returned.</li>
     * <li>If only Tag.N is specified: all resources bound to the specified tags and their matched tags are returned.</li>
     * <li>If both are specified: only records of the specified resources bound to the specified tags are returned.</li>
     * </ul>
     * </li>
     * <li>Tag.N.Key is required. If it is empty, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned. Tag.N.Value is optional. If it is not specified, the value corresponding to the tag key is not limited.</li>
     * <li>Multiple Tag.N parameters have an AND relationship. A resource is returned only if it is bound to all specified tags.</li>
     * </ul>
     * <h2>Response description</h2>
     * <ul>
     * <li>The response returns one record for each resource and tag key-value pair. If a resource is bound to multiple tags, multiple records are returned.</li>
     * <li>TotalCount indicates the number of records returned in the current request.</li>
     * <li>This operation returns all matched results at once. An empty NextToken in the response indicates that no more data is available.</li>
     * </ul>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Call ListAppInstanceGroup to obtain the delivery group ID.</li>
     * <li>Call TagResources to bind tags to the delivery group.</li>
     * <li>Call this operation to query the binding relationships by resource ID or tag condition.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to one or more delivery groups, or filters delivery groups that are bound to specified tags by tag keys and values.</p>
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
     * <p>Returns application adaptation steps when Type is set to ADAPTOR, and image creation steps when Type is set to IMAGE.
     * This operation returns step definitions, not the actual progress of a specific task. Read the step definitions first, and then display the task progress based on the current step and step status returned by GetTask. The step sets vary across different task types. Do not use the step index as the completion percentage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the step identifiers, step categories, and interaction methods for application adaptation or image creation tasks.</p>
     * 
     * @param request ListTaskStepRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskStepResponse
     */
    public ListTaskStepResponse listTaskStepWithOptions(ListTaskStepRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskStep"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskStepResponse());
    }

    /**
     * <b>description</b> :
     * <p>Returns application adaptation steps when Type is set to ADAPTOR, and image creation steps when Type is set to IMAGE.
     * This operation returns step definitions, not the actual progress of a specific task. Read the step definitions first, and then display the task progress based on the current step and step status returned by GetTask. The step sets vary across different task types. Do not use the step index as the completion percentage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the step identifiers, step categories, and interaction methods for application adaptation or image creation tasks.</p>
     * 
     * @param request ListTaskStepRequest
     * @return ListTaskStepResponse
     */
    public ListTaskStepResponse listTaskStep(ListTaskStepRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskStepWithOptions(request, runtime);
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
     * <p>Retrieves the list of WUYING workstations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of workstations.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            body.put("ModelName", request.modelName);
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
     * <p>Retrieves the list of WUYING workstations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of workstations.</p>
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
     * <p>Queries the workload templates available for existing virtual node pools under the current account.</p>
     * <h3>Prerequisites and invocation sequence</h3>
     * <p><strong>You must provide a valid virtual node pool ID that exists under the current account. Querying templates does not require the node pool to be attached to a workstation.</strong></p>
     * <ol>
     * <li>If you already have a node pool ID, you can directly pass it as <code>VirtualNodePoolId</code> to invoke this operation.</li>
     * <li>If a workstation is already associated with a node pool, you can also invoke <a href="~~ListWuyingServer~~">ListWuyingServer</a> to obtain a non-empty <code>VirtualNodePoolId</code> from the corresponding record. This is one way to obtain the ID, but it is not a mandatory step for querying templates.</li>
     * <li>If an empty ID is returned, do not use this value to continue querying. You must obtain a valid node pool ID under the current account before invoking this operation. Do not use a workstation ID, cluster ID, the character string <code>null</code>, or a self-constructed ID.
     * This operation does not create node pools. <a href="~~CreateWuyingServer~~">CreateWuyingServer</a> only associates existing node pools and does not support automatic creation of node pools. If the node pool does not exist or does not belong to the current account, <code>InvalidParameter.VirtualNodePoolId</code> is returned.</li>
     * </ol>
     * <h3>Response</h3>
     * <p>Returns the first 100 records sorted by template configuration order. The template content is Base64-encoded after UTF-8 encoding. You must perform Base64 decoding before use. The current version does not use <code>MaxResults</code> and <code>NextToken</code> for pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Wuying workstation workload templates available for a specified virtual node pool.</p>
     * 
     * @param request ListWuyingServerWorkloadTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWuyingServerWorkloadTemplateResponse
     */
    public ListWuyingServerWorkloadTemplateResponse listWuyingServerWorkloadTemplateWithOptions(ListWuyingServerWorkloadTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodePoolId)) {
            query.put("VirtualNodePoolId", request.virtualNodePoolId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWuyingServerWorkloadTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWuyingServerWorkloadTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the workload templates available for existing virtual node pools under the current account.</p>
     * <h3>Prerequisites and invocation sequence</h3>
     * <p><strong>You must provide a valid virtual node pool ID that exists under the current account. Querying templates does not require the node pool to be attached to a workstation.</strong></p>
     * <ol>
     * <li>If you already have a node pool ID, you can directly pass it as <code>VirtualNodePoolId</code> to invoke this operation.</li>
     * <li>If a workstation is already associated with a node pool, you can also invoke <a href="~~ListWuyingServer~~">ListWuyingServer</a> to obtain a non-empty <code>VirtualNodePoolId</code> from the corresponding record. This is one way to obtain the ID, but it is not a mandatory step for querying templates.</li>
     * <li>If an empty ID is returned, do not use this value to continue querying. You must obtain a valid node pool ID under the current account before invoking this operation. Do not use a workstation ID, cluster ID, the character string <code>null</code>, or a self-constructed ID.
     * This operation does not create node pools. <a href="~~CreateWuyingServer~~">CreateWuyingServer</a> only associates existing node pools and does not support automatic creation of node pools. If the node pool does not exist or does not belong to the current account, <code>InvalidParameter.VirtualNodePoolId</code> is returned.</li>
     * </ol>
     * <h3>Response</h3>
     * <p>Returns the first 100 records sorted by template configuration order. The template content is Base64-encoded after UTF-8 encoding. You must perform Base64 decoding before use. The current version does not use <code>MaxResults</code> and <code>NextToken</code> for pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Wuying workstation workload templates available for a specified virtual node pool.</p>
     * 
     * @param request ListWuyingServerWorkloadTemplateRequest
     * @return ListWuyingServerWorkloadTemplateResponse
     */
    public ListWuyingServerWorkloadTemplateResponse listWuyingServerWorkloadTemplate(ListWuyingServerWorkloadTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWuyingServerWorkloadTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation returns a list of available zone IDs that can be selected by the current Alibaba Cloud account based on the region, product type, and operating system type. A typical use case is to confirm which zones are available before creating a resource that requires a specified vSwitch, and then select a vSwitch located in one of these zones.
     * This operation only queries information. It does not create resources or incur fees.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:ListAppInstanceType permission. If you do not have the required permissions, the error code Forbidden.NoPermission is returned.</li>
     * <li><strong>ProductType, BizRegionId, and OsType are all required.</strong> If any of these parameters is missing, empty, or has an unrecognized value, the error code InvalidParameter.ValueInvalid is returned.</li>
     * <li>BizRegionId must be a region ID supported by App Streaming. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * <li>Call this operation by using the region ID, target product type, and operating system type, and then read the returned ListZonesModel.Zones.</li>
     * <li>When you create a resource and need to specify a vSwitch, select a vSwitch located in one of the returned zones. For example, pass the corresponding vSwitch ID when you call <a href="~~CreateAppInstanceGroup~~">CreateAppInstanceGroup</a> or <a href="~~CreateWuyingServer~~">CreateWuyingServer</a>.
     * The returned list of available zones is determined by the available resources in the current region and may change over time. Query the list in real time before creating resources instead of caching the list for a long time.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of available zone IDs for a specified product type and operating system type in a specified region.</p>
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
     * <h2>Usage notes</h2>
     * <p>This operation returns a list of available zone IDs that can be selected by the current Alibaba Cloud account based on the region, product type, and operating system type. A typical use case is to confirm which zones are available before creating a resource that requires a specified vSwitch, and then select a vSwitch located in one of these zones.
     * This operation only queries information. It does not create resources or incur fees.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:ListAppInstanceType permission. If you do not have the required permissions, the error code Forbidden.NoPermission is returned.</li>
     * <li><strong>ProductType, BizRegionId, and OsType are all required.</strong> If any of these parameters is missing, empty, or has an unrecognized value, the error code InvalidParameter.ValueInvalid is returned.</li>
     * <li>BizRegionId must be a region ID supported by App Streaming. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * <li>Call this operation by using the region ID, target product type, and operating system type, and then read the returned ListZonesModel.Zones.</li>
     * <li>When you create a resource and need to specify a vSwitch, select a vSwitch located in one of the returned zones. For example, pass the corresponding vSwitch ID when you call <a href="~~CreateAppInstanceGroup~~">CreateAppInstanceGroup</a> or <a href="~~CreateWuyingServer~~">CreateWuyingServer</a>.
     * The returned list of available zones is determined by the available resources in the current region and may change over time. Query the list in real time before creating resources instead of caching the list for a long time.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of available zone IDs for a specified product type and operating system type in a specified region.</p>
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
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have a scheduled scaling policy enabled. It can be called successfully only outside the scaling time windows specified in the scheduled scaling policy.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Logs off all sessions under a pay-as-you-go delivery group that has a scheduled scaling policy enabled.</p>
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
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have a scheduled scaling policy enabled. It can be called successfully only outside the scaling time windows specified in the scheduled scaling policy.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Logs off all sessions under a pay-as-you-go delivery group that has a scheduled scaling policy enabled.</p>
     * 
     * @param request LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    public LogOffAllSessionsInAppInstanceGroupResponse logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.logOffAllSessionsInAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call <code>ListAgentInstanceMemory</code> to obtain the target instance IDs. The server validates all instances in the request before updating the memory settings. After the update, you can query the memory settings of the instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the memory feature for the specified agent instances.</p>
     * 
     * @param request ModifyAgentInstanceMemoryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAgentInstanceMemoryConfigResponse
     */
    public ModifyAgentInstanceMemoryConfigResponse modifyAgentInstanceMemoryConfigWithOptions(ModifyAgentInstanceMemoryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentInstanceIds)) {
            body.put("AgentInstanceIds", request.agentInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAgentInstanceMemoryConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAgentInstanceMemoryConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call <code>ListAgentInstanceMemory</code> to obtain the target instance IDs. The server validates all instances in the request before updating the memory settings. After the update, you can query the memory settings of the instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the memory feature for the specified agent instances.</p>
     * 
     * @param request ModifyAgentInstanceMemoryConfigRequest
     * @return ModifyAgentInstanceMemoryConfigResponse
     */
    public ModifyAgentInstanceMemoryConfigResponse modifyAgentInstanceMemoryConfig(ModifyAgentInstanceMemoryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAgentInstanceMemoryConfigWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>This operation converts the billing method, which may create an order and trigger subsequent billing changes. <strong>A successful response or a returned task ID does not indicate that the new billing method has taken effect.</strong>
     * <strong>Prerequisites:</strong></p>
     * <ul>
     * <li>The resources belong to the current account, and the product and business region match the request. Only one app instance group can be specified per request.</li>
     * <li>The target billing method must be different from the current one, and the target resource specifications must support the corresponding sales and Billable methods.</li>
     * <li>App instance groups that have been added to a valid collection cannot have their Billable methods converted individually.</li>
     * <li>Multiple app instance groups created in the same batch of orders cannot have their Billable methods converted separately.
     * <strong>Parameter relationships and call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Query the resource details first to confirm the product, business region, and current <code>ChargeType</code>. You can use <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to query cloud app instance groups.</li>
     * <li>Explicitly specify the target <code>ChargeType</code>. If you need to purchase a subscription, specify the purchase duration by combining <code>Period</code> and <code>PeriodUnit</code>. The period combination must comply with the sales rules currently supported by the resource.</li>
     * <li>Set <code>AutoPay</code> based on whether automatic payment is allowed. If auto-renewal is involved, explicitly set <code>AutoRenew</code>.</li>
     * <li>After the call, save the returned <code>AppInstanceGroupModel.TaskId</code>. If there are unpaid orders, complete the payment first, and then query the resource details again to confirm that the billing method has been changed.
     * This operation does not accept an expiration time parameter. Do not pass the expiration time from other operations into this request. The task examples only illustrate the purpose of the ID and do not define a fixed prefix or length for actual task IDs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of a specified app instance group to the target billing method and returns the ID of the billing conversion task to be created.</p>
     * 
     * @param tmpReq ModifyAppInstanceGroupChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppInstanceGroupChargeTypeResponse
     */
    public ModifyAppInstanceGroupChargeTypeResponse modifyAppInstanceGroupChargeTypeWithOptions(ModifyAppInstanceGroupChargeTypeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppInstanceGroupChargeTypeShrinkRequest request = new ModifyAppInstanceGroupChargeTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appInstanceGroupIds)) {
            request.appInstanceGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appInstanceGroupIds, "AppInstanceGroupIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupIdsShrink)) {
            body.put("AppInstanceGroupIds", request.appInstanceGroupIdsShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppInstanceGroupChargeType"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppInstanceGroupChargeTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation converts the billing method, which may create an order and trigger subsequent billing changes. <strong>A successful response or a returned task ID does not indicate that the new billing method has taken effect.</strong>
     * <strong>Prerequisites:</strong></p>
     * <ul>
     * <li>The resources belong to the current account, and the product and business region match the request. Only one app instance group can be specified per request.</li>
     * <li>The target billing method must be different from the current one, and the target resource specifications must support the corresponding sales and Billable methods.</li>
     * <li>App instance groups that have been added to a valid collection cannot have their Billable methods converted individually.</li>
     * <li>Multiple app instance groups created in the same batch of orders cannot have their Billable methods converted separately.
     * <strong>Parameter relationships and call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Query the resource details first to confirm the product, business region, and current <code>ChargeType</code>. You can use <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to query cloud app instance groups.</li>
     * <li>Explicitly specify the target <code>ChargeType</code>. If you need to purchase a subscription, specify the purchase duration by combining <code>Period</code> and <code>PeriodUnit</code>. The period combination must comply with the sales rules currently supported by the resource.</li>
     * <li>Set <code>AutoPay</code> based on whether automatic payment is allowed. If auto-renewal is involved, explicitly set <code>AutoRenew</code>.</li>
     * <li>After the call, save the returned <code>AppInstanceGroupModel.TaskId</code>. If there are unpaid orders, complete the payment first, and then query the resource details again to confirm that the billing method has been changed.
     * This operation does not accept an expiration time parameter. Do not pass the expiration time from other operations into this request. The task examples only illustrate the purpose of the ID and do not define a fixed prefix or length for actual task IDs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of a specified app instance group to the target billing method and returns the ID of the billing conversion task to be created.</p>
     * 
     * @param request ModifyAppInstanceGroupChargeTypeRequest
     * @return ModifyAppInstanceGroupChargeTypeResponse
     */
    public ModifyAppInstanceGroupChargeTypeResponse modifyAppInstanceGroupChargeType(ModifyAppInstanceGroupChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppInstanceGroupChargeTypeWithOptions(request, runtime);
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
     * <p>Modifies the properties of a Wuying cloud browser.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the properties of a Wuying cloud browser.</p>
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
     * <p>Modifies the properties of a Wuying cloud browser.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the properties of a Wuying cloud browser.</p>
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
     * <p>Shares an image with other WUYING users or cancels the sharing of an image.</p>
     * 
     * @param request ModifyShareImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyShareImageResponse
     */
    public ModifyShareImageResponse modifyShareImageWithOptions(ModifyShareImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addAccount)) {
            body.put("AddAccount", request.addAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeAccount)) {
            body.put("RemoveAccount", request.removeAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyShareImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyShareImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Shares an image with other WUYING users or cancels the sharing of an image.</p>
     * 
     * @param request ModifyShareImageRequest
     * @return ModifyShareImageResponse
     */
    public ModifyShareImageResponse modifyShareImage(ModifyShareImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyShareImageWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p><em>Modifying the switch status also updates existing instances that have the corresponding memory feature configured under the same business combination.</em>* After the modification, call <code>GetTenantMemoryConfig</code> and pass the same provider, platform, and business type to verify the configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the tenant-level memory configuration for the current account based on the agent provider, business platform, and business type.</p>
     * 
     * @param request ModifyTenantMemoryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantMemoryConfigResponse
     */
    public ModifyTenantMemoryConfigResponse modifyTenantMemoryConfigWithOptions(ModifyTenantMemoryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            body.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            body.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantMemoryConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantMemoryConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Modifying the switch status also updates existing instances that have the corresponding memory feature configured under the same business combination.</em>* After the modification, call <code>GetTenantMemoryConfig</code> and pass the same provider, platform, and business type to verify the configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the tenant-level memory configuration for the current account based on the agent provider, business platform, and business type.</p>
     * 
     * @param request ModifyTenantMemoryConfigRequest
     * @return ModifyTenantMemoryConfigResponse
     */
    public ModifyTenantMemoryConfigResponse modifyTenantMemoryConfig(ModifyTenantMemoryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantMemoryConfigWithOptions(request, runtime);
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
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The workstation is created and belongs to the current account.</li>
     * <li>When you modify the specifications, the resource must be in the Deployed, Published Successfully, or Maintenance Failed state. The target specifications must be available in the region where the resource is located and compatible with the operating system and existing resource configurations.</li>
     * <li>Conversion between CPU specifications and GPU specifications is not supported.</li>
     * </ul>
     * <h2>Post-processing</h2>
     * <p>A successful response does not indicate that the specification change is complete. If the generated order is unpaid, complete the payment first, and then query the workstation status and specifications to confirm the change result.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the specifications of an existing WUYING workstation.</p>
     * 
     * @param request ModifyWuyingServerSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWuyingServerSpecResponse
     */
    public ModifyWuyingServerSpecResponse modifyWuyingServerSpecWithOptions(ModifyWuyingServerSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.afterStatus)) {
            body.put("AfterStatus", request.afterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverInstanceType)) {
            body.put("ServerInstanceType", request.serverInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWuyingServerSpec"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWuyingServerSpecResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The workstation is created and belongs to the current account.</li>
     * <li>When you modify the specifications, the resource must be in the Deployed, Published Successfully, or Maintenance Failed state. The target specifications must be available in the region where the resource is located and compatible with the operating system and existing resource configurations.</li>
     * <li>Conversion between CPU specifications and GPU specifications is not supported.</li>
     * </ul>
     * <h2>Post-processing</h2>
     * <p>A successful response does not indicate that the specification change is complete. If the generated order is unpaid, complete the payment first, and then query the workstation status and specifications to confirm the change result.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the specifications of an existing WUYING workstation.</p>
     * 
     * @param request ModifyWuyingServerSpecRequest
     * @return ModifyWuyingServerSpecResponse
     */
    public ModifyWuyingServerSpecResponse modifyWuyingServerSpec(ModifyWuyingServerSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWuyingServerSpecWithOptions(request, runtime);
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
     * <p>Queries the delivery group ID, name, and status in delivery group reports. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the business region, and then call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the delivery group. AppInstanceGroupId matches the exact ID, and AppInstanceGroupName filters by inclusion. If multiple filter conditions are specified at the same time, the intersection is used. When filtering by date, StatDate specifies a single day, and StartDate and EndDate must be specified in pairs to represent a closed interval. If both a single day and an interval are specified, the results must meet both conditions. Before using EndUserId, make sure that the user has a valid authorization relationship.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries delivery group reports by region, delivery group, status, user authorization relationship, or statistical date.</p>
     * 
     * @param request QueryAppInstanceGroupReportListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAppInstanceGroupReportListResponse
     */
    public QueryAppInstanceGroupReportListResponse queryAppInstanceGroupReportListWithOptions(QueryAppInstanceGroupReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            body.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDate)) {
            body.put("StatDate", request.statDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppInstanceGroupReportList"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppInstanceGroupReportListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the delivery group ID, name, and status in delivery group reports. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the business region, and then call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the delivery group. AppInstanceGroupId matches the exact ID, and AppInstanceGroupName filters by inclusion. If multiple filter conditions are specified at the same time, the intersection is used. When filtering by date, StatDate specifies a single day, and StartDate and EndDate must be specified in pairs to represent a closed interval. If both a single day and an interval are specified, the results must meet both conditions. Before using EndUserId, make sure that the user has a valid authorization relationship.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries delivery group reports by region, delivery group, status, user authorization relationship, or statistical date.</p>
     * 
     * @param request QueryAppInstanceGroupReportListRequest
     * @return QueryAppInstanceGroupReportListResponse
     */
    public QueryAppInstanceGroupReportListResponse queryAppInstanceGroupReportList(QueryAppInstanceGroupReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppInstanceGroupReportListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries connection statistical reports. Before you invoke this operation, you can invoke <a href="~~ListRegions~~">ListRegions</a> and <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the <code>BizRegionId</code> and <code>AppInstanceGroupId</code> parameters. The <code>ProductType</code>, <code>StartDate</code>, and <code>EndDate</code> parameters are required for server-side validation. The statistical interval is <code>[StartDate, EndDate)</code>, which includes the start time but excludes the end time. Results are returned by page, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of successful connections, the number of failed connections, the success rate, and the average connection duration within a specified time range.</p>
     * 
     * @param request QueryConnectionReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConnectionReportResponse
     */
    public QueryConnectionReportResponse queryConnectionReportWithOptions(QueryConnectionReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConnectionReport"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConnectionReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries connection statistical reports. Before you invoke this operation, you can invoke <a href="~~ListRegions~~">ListRegions</a> and <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the <code>BizRegionId</code> and <code>AppInstanceGroupId</code> parameters. The <code>ProductType</code>, <code>StartDate</code>, and <code>EndDate</code> parameters are required for server-side validation. The statistical interval is <code>[StartDate, EndDate)</code>, which includes the start time but excludes the end time. Results are returned by page, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of successful connections, the number of failed connections, the success rate, and the average connection duration within a specified time range.</p>
     * 
     * @param request QueryConnectionReportRequest
     * @return QueryConnectionReportResponse
     */
    public QueryConnectionReportResponse queryConnectionReport(QueryConnectionReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConnectionReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the daily active user (DAU) report. StartDate and EndDate are required. The date range is inclusive and cannot exceed 180 days. If ProductType is not specified or cannot be recognized, the query defaults to <code>CloudApp</code>. You can use BizRegionId and AppInstanceGroupId to narrow down the scope. If neither is specified, the query returns aggregated data for all business regions. Results are returned in pages, with a maximum of 1,500 records per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of daily active users and streaming daily active users by date.</p>
     * 
     * @param request QueryDauReportDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDauReportDataResponse
     */
    public QueryDauReportDataResponse queryDauReportDataWithOptions(QueryDauReportDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDauReportData"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDauReportDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the daily active user (DAU) report. StartDate and EndDate are required. The date range is inclusive and cannot exceed 180 days. If ProductType is not specified or cannot be recognized, the query defaults to <code>CloudApp</code>. You can use BizRegionId and AppInstanceGroupId to narrow down the scope. If neither is specified, the query returns aggregated data for all business regions. Results are returned in pages, with a maximum of 1,500 records per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of daily active users and streaming daily active users by date.</p>
     * 
     * @param request QueryDauReportDataRequest
     * @return QueryDauReportDataResponse
     */
    public QueryDauReportDataResponse queryDauReportData(QueryDauReportDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDauReportDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the monthly active user (MAU) report. ProductType, StartDate, and EndDate are required for server-side validation, and the time span cannot exceed 60 months. The API returns statistical values by month. To adapt to offline data generated on the next day, the last month in the query range uses the day before EndDate as the statistical cutoff date. Results are returned by page, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of monthly active users for each month within a specified time range.</p>
     * 
     * @param request QueryMauReportDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMauReportDataResponse
     */
    public QueryMauReportDataResponse queryMauReportDataWithOptions(QueryMauReportDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMauReportData"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMauReportDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the monthly active user (MAU) report. ProductType, StartDate, and EndDate are required for server-side validation, and the time span cannot exceed 60 months. The API returns statistical values by month. To adapt to offline data generated on the next day, the last month in the query range uses the day before EndDate as the statistical cutoff date. Results are returned by page, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of monthly active users for each month within a specified time range.</p>
     * 
     * @param request QueryMauReportDataRequest
     * @return QueryMauReportDataResponse
     */
    public QueryMauReportDataResponse queryMauReportData(QueryMauReportDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMauReportDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The caller must have the RAM permissions for the corresponding API operation. The query scope is limited to the model usage of the specified business for the current account. The returned results depend on the generated statistical data and do not indicate that every call is counted in real time.</p>
     * <h2>Time and missing data</h2>
     * <p>Time boundaries are uniformly based on Asia/Shanghai (UTC+8). For a custom range, set <code>StatDateType</code> to <code>1d</code> and specify both <code>StartDate</code> and <code>EndDate</code>. The range includes both the start and end dates, and the maximum span is 90 days. If statistical data is unavailable for some dates, only the existing data within the range is aggregated.
     * If no statistical results are available for <code>24h</code> or <code>1d</code> queries without specified dates, the summary API returns zero values and the list API returns an empty list. <strong>This does not mean that no actual calls were made.</strong> If no statistical results are available for other windows or custom date ranges, metrics or lists may be empty. Do not treat empty values as zeros.</p>
     * <h2>Combined calls</h2>
     * <p>You can call <a href="~~QueryModelUsageInfo~~">QueryModelUsageInfo</a> to obtain summary metrics and <a href="~~QueryModelUsageList~~">QueryModelUsageList</a> to obtain model details. Both API operations can be called independently. When comparing summary and detail data, <code>BizType</code>, <code>StatDateType</code>, <code>StartDate</code>, <code>EndDate</code>, and <code>ModelType</code> must be consistent. <code>Keyword</code> applies only to the detail API. Details filtered by keywords cannot be directly compared with unfiltered summary results.</p>
     * <h2>Request example combinations</h2>
     * <p>In the parameter table, <code>StatDateType=1d</code>, <code>StartDate=2026-08-01</code>, and <code>EndDate=2026-08-07</code> indicate querying the cumulative usage from August 1 to August 7, 2026 (inclusive), in the Asia/Shanghai (UTC+8) time zone. To query the last 7 days, change the value to <code>StatDateType=1w</code> and omit both date parameters.
     * The number of calls, points, and model information in the examples are used to illustrate field meanings. They do not represent the actual usage of the current account and do not constitute a commitment to model specifications or pricing. The actual usage and available model information are subject to the API response.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of invoked models, total number of calls, and consumed points by business type, statistical window, and model type.</p>
     * 
     * @param request QueryModelUsageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModelUsageInfoResponse
     */
    public QueryModelUsageInfoResponse queryModelUsageInfoWithOptions(QueryModelUsageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDateType)) {
            query.put("StatDateType", request.statDateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModelUsageInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModelUsageInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The caller must have the RAM permissions for the corresponding API operation. The query scope is limited to the model usage of the specified business for the current account. The returned results depend on the generated statistical data and do not indicate that every call is counted in real time.</p>
     * <h2>Time and missing data</h2>
     * <p>Time boundaries are uniformly based on Asia/Shanghai (UTC+8). For a custom range, set <code>StatDateType</code> to <code>1d</code> and specify both <code>StartDate</code> and <code>EndDate</code>. The range includes both the start and end dates, and the maximum span is 90 days. If statistical data is unavailable for some dates, only the existing data within the range is aggregated.
     * If no statistical results are available for <code>24h</code> or <code>1d</code> queries without specified dates, the summary API returns zero values and the list API returns an empty list. <strong>This does not mean that no actual calls were made.</strong> If no statistical results are available for other windows or custom date ranges, metrics or lists may be empty. Do not treat empty values as zeros.</p>
     * <h2>Combined calls</h2>
     * <p>You can call <a href="~~QueryModelUsageInfo~~">QueryModelUsageInfo</a> to obtain summary metrics and <a href="~~QueryModelUsageList~~">QueryModelUsageList</a> to obtain model details. Both API operations can be called independently. When comparing summary and detail data, <code>BizType</code>, <code>StatDateType</code>, <code>StartDate</code>, <code>EndDate</code>, and <code>ModelType</code> must be consistent. <code>Keyword</code> applies only to the detail API. Details filtered by keywords cannot be directly compared with unfiltered summary results.</p>
     * <h2>Request example combinations</h2>
     * <p>In the parameter table, <code>StatDateType=1d</code>, <code>StartDate=2026-08-01</code>, and <code>EndDate=2026-08-07</code> indicate querying the cumulative usage from August 1 to August 7, 2026 (inclusive), in the Asia/Shanghai (UTC+8) time zone. To query the last 7 days, change the value to <code>StatDateType=1w</code> and omit both date parameters.
     * The number of calls, points, and model information in the examples are used to illustrate field meanings. They do not represent the actual usage of the current account and do not constitute a commitment to model specifications or pricing. The actual usage and available model information are subject to the API response.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of invoked models, total number of calls, and consumed points by business type, statistical window, and model type.</p>
     * 
     * @param request QueryModelUsageInfoRequest
     * @return QueryModelUsageInfoResponse
     */
    public QueryModelUsageInfoResponse queryModelUsageInfo(QueryModelUsageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryModelUsageInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The calling identity must have the RAM permissions for the corresponding API operation. The query scope is limited to the model usage of the specified business under the current account. The returned results depend on the generated statistical data and do not represent that every call has been counted in real time.</p>
     * <h2>Time and missing data</h2>
     * <p>Time boundaries are uniformly based on Asia/Shanghai (UTC+8). To use a custom range, set StatDateType to 1d and specify both StartDate and EndDate. The range includes both the start and end dates, with a maximum span of 90 days. If statistical data is unavailable for some dates, only the existing data within the range is aggregated.
     * When no date is specified for 24h or 1d queries and no statistical results are available, the aggregation API returns zero values and the list API returns an empty list. <strong>This does not mean that no actual calls were made.</strong> For other windows or custom date ranges where no statistical results are available, metrics or lists may be empty. Do not treat empty values as zeros.</p>
     * <h2>Combined calls</h2>
     * <p>You can call <a href="~~QueryModelUsageInfo~~">QueryModelUsageInfo</a> to obtain aggregated metrics and <a href="~~QueryModelUsageList~~">QueryModelUsageList</a> to obtain model details. Both API operations can be called independently. When comparing aggregated and detailed data, BizType, StatDateType, StartDate, EndDate, and ModelType must remain consistent. Keyword applies only to the detail API. Details filtered by keyword cannot be directly compared with unfiltered aggregated results.</p>
     * <h2>Pagination and metrics</h2>
     * <p>Start with PageNumber=1 and increment the page number as needed, keeping other filter conditions and sorting methods consistent. The model list may include models that have historical usage but zero calls within the current query range. All ratio fields are returned as decimals between 0 and 1. An empty metric indicates that it is incalculable or the data is unavailable, which is not equivalent to zero.
     * When new statistical data is continuously generated, the count and sorting of different pagination requests may change. When comparing totals and details, ensure that the query conditions are consistent and consider the data update time difference between the two requests.</p>
     * <h2>Request example combinations</h2>
     * <p>In the parameter table, StatDateType=1d, StartDate=2026-08-01, and EndDate=2026-08-07 indicate querying the cumulative usage from August 1 to August 7, 2026 (inclusive), in the Asia/Shanghai (UTC+8) time zone. To query the last 7 days, change to StatDateType=1w and omit both date parameters.
     * The call counts, points, and model information in the examples are used to illustrate field meanings. They do not represent the actual usage of the current account and do not constitute a commitment to model specifications or pricing. Actual usage and available model information are subject to the API response. Custom date queries do not provide TtftP95Ms. The example details show only some fields. Unshown fields do not necessarily return empty values.</p>
     * <h2>Missing statistical records for a single model</h2>
     * <p>If a model already in the model list has no active statistical records within the selected statistical range, CallCount, FailureCount, and PointsConsumption return 0. The input and output point ratios, success rate, cache hit rate, and time to first token latency are empty. In this case, you cannot determine that the model has no actual invoke operations based solely on the zero values.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the invoke count, consumed points, success rate, and time to first token latency for each model by using paging, filtered by business type, statistical window, and model type.</p>
     * 
     * @param request QueryModelUsageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModelUsageListResponse
     */
    public QueryModelUsageListResponse queryModelUsageListWithOptions(QueryModelUsageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDateType)) {
            query.put("StatDateType", request.statDateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModelUsageList"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModelUsageListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The calling identity must have the RAM permissions for the corresponding API operation. The query scope is limited to the model usage of the specified business under the current account. The returned results depend on the generated statistical data and do not represent that every call has been counted in real time.</p>
     * <h2>Time and missing data</h2>
     * <p>Time boundaries are uniformly based on Asia/Shanghai (UTC+8). To use a custom range, set StatDateType to 1d and specify both StartDate and EndDate. The range includes both the start and end dates, with a maximum span of 90 days. If statistical data is unavailable for some dates, only the existing data within the range is aggregated.
     * When no date is specified for 24h or 1d queries and no statistical results are available, the aggregation API returns zero values and the list API returns an empty list. <strong>This does not mean that no actual calls were made.</strong> For other windows or custom date ranges where no statistical results are available, metrics or lists may be empty. Do not treat empty values as zeros.</p>
     * <h2>Combined calls</h2>
     * <p>You can call <a href="~~QueryModelUsageInfo~~">QueryModelUsageInfo</a> to obtain aggregated metrics and <a href="~~QueryModelUsageList~~">QueryModelUsageList</a> to obtain model details. Both API operations can be called independently. When comparing aggregated and detailed data, BizType, StatDateType, StartDate, EndDate, and ModelType must remain consistent. Keyword applies only to the detail API. Details filtered by keyword cannot be directly compared with unfiltered aggregated results.</p>
     * <h2>Pagination and metrics</h2>
     * <p>Start with PageNumber=1 and increment the page number as needed, keeping other filter conditions and sorting methods consistent. The model list may include models that have historical usage but zero calls within the current query range. All ratio fields are returned as decimals between 0 and 1. An empty metric indicates that it is incalculable or the data is unavailable, which is not equivalent to zero.
     * When new statistical data is continuously generated, the count and sorting of different pagination requests may change. When comparing totals and details, ensure that the query conditions are consistent and consider the data update time difference between the two requests.</p>
     * <h2>Request example combinations</h2>
     * <p>In the parameter table, StatDateType=1d, StartDate=2026-08-01, and EndDate=2026-08-07 indicate querying the cumulative usage from August 1 to August 7, 2026 (inclusive), in the Asia/Shanghai (UTC+8) time zone. To query the last 7 days, change to StatDateType=1w and omit both date parameters.
     * The call counts, points, and model information in the examples are used to illustrate field meanings. They do not represent the actual usage of the current account and do not constitute a commitment to model specifications or pricing. Actual usage and available model information are subject to the API response. Custom date queries do not provide TtftP95Ms. The example details show only some fields. Unshown fields do not necessarily return empty values.</p>
     * <h2>Missing statistical records for a single model</h2>
     * <p>If a model already in the model list has no active statistical records within the selected statistical range, CallCount, FailureCount, and PointsConsumption return 0. The input and output point ratios, success rate, cache hit rate, and time to first token latency are empty. In this case, you cannot determine that the model has no actual invoke operations based solely on the zero values.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the invoke count, consumed points, success rate, and time to first token latency for each model by using paging, filtered by business type, statistical window, and model type.</p>
     * 
     * @param request QueryModelUsageListRequest
     * @return QueryModelUsageListResponse
     */
    public QueryModelUsageListResponse queryModelUsageList(QueryModelUsageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryModelUsageListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries network round-trip time (RTT) reports. ProductType, StartDate, and EndDate are required for server-side validation. The statistical interval is [StartDate, EndDate). The minimum, maximum, and average RTT values are measured in milliseconds. The low-RTT threshold is determined by the report statistical caliber, and the current API operation does not return this threshold. Results are returned in pages, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries network RTT and low-RTT user statistics within a specified time range.</p>
     * 
     * @param request QueryNetworkRttReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryNetworkRttReportResponse
     */
    public QueryNetworkRttReportResponse queryNetworkRttReportWithOptions(QueryNetworkRttReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNetworkRttReport"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNetworkRttReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries network round-trip time (RTT) reports. ProductType, StartDate, and EndDate are required for server-side validation. The statistical interval is [StartDate, EndDate). The minimum, maximum, and average RTT values are measured in milliseconds. The low-RTT threshold is determined by the report statistical caliber, and the current API operation does not return this threshold. Results are returned in pages, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries network RTT and low-RTT user statistics within a specified time range.</p>
     * 
     * @param request QueryNetworkRttReportRequest
     * @return QueryNetworkRttReportResponse
     */
    public QueryNetworkRttReportResponse queryNetworkRttReport(QueryNetworkRttReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryNetworkRttReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries node quantity reports. StartDate, EndDate, and StatDateType are required. The query span limit is determined by the statistical granularity: up to 1 day for <code>1m</code> and <code>30m</code>, up to 15 days for <code>6h</code>, and up to 180 days for <code>1d</code>. Both the start and end boundaries are included in the query range. Results are returned in pages, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of nodes, the number of subscription nodes, and the number of pay-as-you-go nodes by statistical granularity.</p>
     * 
     * @param request QueryNodeReportDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryNodeReportDataResponse
     */
    public QueryNodeReportDataResponse queryNodeReportDataWithOptions(QueryNodeReportDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDateType)) {
            body.put("StatDateType", request.statDateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNodeReportData"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNodeReportDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries node quantity reports. StartDate, EndDate, and StatDateType are required. The query span limit is determined by the statistical granularity: up to 1 day for <code>1m</code> and <code>30m</code>, up to 15 days for <code>6h</code>, and up to 180 days for <code>1d</code>. Both the start and end boundaries are included in the query range. Results are returned in pages, with a maximum of 1,500 entries per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of nodes, the number of subscription nodes, and the number of pay-as-you-go nodes by statistical granularity.</p>
     * 
     * @param request QueryNodeReportDataRequest
     * @return QueryNodeReportDataResponse
     */
    public QueryNodeReportDataResponse queryNodeReportData(QueryNodeReportDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryNodeReportDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this operation to query the session count trend data for the current Alibaba Cloud account on a specified date. The data consists of offline statistical results organized by day and returns the session counts at various time points on that date.
     * The returned results are aggregated in 10-minute intervals. Each data point is identified by an hour (Hh, values 00-23) and a minute (Mi, values 00, 10, 20, 30, 40, 50) representing a time point, and SessionCntMi is the aggregated session count within the 10-minute interval for that time point. The results are sorted in ascending order by hour and minute.
     * You can specify a business region by using BizRegionId and filter by delivery group by using AppInstanceGroupId. If neither parameter is provided, the aggregated session data for all regions and all delivery groups under the current account is returned. The actual region used to filter session data is determined by BizRegionId.
     * StatDate is the statistical date in the yyyyMMdd format. If this parameter is not provided, the data for yesterday is queried by default. Only dates within the last 90 days are supported. If there is no session data on the specified date, an empty list is returned and the return code is NO_DATA.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the session count trend at various time points on a specified date, returned in 10-minute intervals.</p>
     * 
     * @param request QuerySessionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySessionDataResponse
     */
    public QuerySessionDataResponse querySessionDataWithOptions(QuerySessionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDate)) {
            body.put("StatDate", request.statDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySessionData"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySessionDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this operation to query the session count trend data for the current Alibaba Cloud account on a specified date. The data consists of offline statistical results organized by day and returns the session counts at various time points on that date.
     * The returned results are aggregated in 10-minute intervals. Each data point is identified by an hour (Hh, values 00-23) and a minute (Mi, values 00, 10, 20, 30, 40, 50) representing a time point, and SessionCntMi is the aggregated session count within the 10-minute interval for that time point. The results are sorted in ascending order by hour and minute.
     * You can specify a business region by using BizRegionId and filter by delivery group by using AppInstanceGroupId. If neither parameter is provided, the aggregated session data for all regions and all delivery groups under the current account is returned. The actual region used to filter session data is determined by BizRegionId.
     * StatDate is the statistical date in the yyyyMMdd format. If this parameter is not provided, the data for yesterday is queried by default. Only dates within the last 90 days are supported. If there is no session data on the specified date, an empty list is returned and the return code is NO_DATA.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the session count trend at various time points on a specified date, returned in 10-minute intervals.</p>
     * 
     * @param request QuerySessionDataRequest
     * @return QuerySessionDataResponse
     */
    public QuerySessionDataResponse querySessionData(QuerySessionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySessionDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries session quantity reports. <code>StartDate</code>, <code>EndDate</code>, and <code>StatDateType</code> are required. The query span limit is determined by the statistical granularity: up to 1 day for <code>1m</code> and <code>30m</code>, up to 15 days for <code>6h</code>, and up to 180 days for <code>1d</code>. Both the start and end boundaries are included in the query range. Results are returned in pages, with a maximum of 1,500 records per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of sessions, connected sessions, and streaming sessions by statistical granularity.</p>
     * 
     * @param request QuerySessionReportDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySessionReportDataResponse
     */
    public QuerySessionReportDataResponse querySessionReportDataWithOptions(QuerySessionReportDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDateType)) {
            body.put("StatDateType", request.statDateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySessionReportData"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySessionReportDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries session quantity reports. <code>StartDate</code>, <code>EndDate</code>, and <code>StatDateType</code> are required. The query span limit is determined by the statistical granularity: up to 1 day for <code>1m</code> and <code>30m</code>, up to 15 days for <code>6h</code>, and up to 180 days for <code>1d</code>. Both the start and end boundaries are included in the query range. Results are returned in pages, with a maximum of 1,500 records per page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of sessions, connected sessions, and streaming sessions by statistical granularity.</p>
     * 
     * @param request QuerySessionReportDataRequest
     * @return QuerySessionReportDataResponse
     */
    public QuerySessionReportDataResponse querySessionReportData(QuerySessionReportDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySessionReportDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the application usage of a specified user on an hourly basis. StartDate and EndDate use the yyyyMMdd format. If either parameter is not provided, it defaults to yesterday. Both dates must be within the last 90 days, and the start date cannot be later than the end date. The query range includes the start and end dates. UserId must be set to the ID of the user to be queried. A maximum of the top five applications by usage duration are returned for each hour.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the cumulative duration of application usage by a specified user on an hourly basis and returns the top five applications for each hour.</p>
     * 
     * @param request QueryUserAppUsageAggregateByHourRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserAppUsageAggregateByHourResponse
     */
    public QueryUserAppUsageAggregateByHourResponse queryUserAppUsageAggregateByHourWithOptions(QueryUserAppUsageAggregateByHourRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserAppUsageAggregateByHour"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserAppUsageAggregateByHourResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the application usage of a specified user on an hourly basis. StartDate and EndDate use the yyyyMMdd format. If either parameter is not provided, it defaults to yesterday. Both dates must be within the last 90 days, and the start date cannot be later than the end date. The query range includes the start and end dates. UserId must be set to the ID of the user to be queried. A maximum of the top five applications by usage duration are returned for each hour.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the cumulative duration of application usage by a specified user on an hourly basis and returns the top five applications for each hour.</p>
     * 
     * @param request QueryUserAppUsageAggregateByHourRequest
     * @return QueryUserAppUsageAggregateByHourResponse
     */
    public QueryUserAppUsageAggregateByHourResponse queryUserAppUsageAggregateByHour(QueryUserAppUsageAggregateByHourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserAppUsageAggregateByHourWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the ranking of application usage duration for a specified user within a statistical range. <code>StartDate</code> and <code>EndDate</code> use the <code>yyyyMMdd</code> format. If either parameter is not provided, it defaults to yesterday. Both dates must be within the last 90 days, and the start date cannot be later than the end date. The query range includes the start and end dates. <code>UserId</code> must be set to the ID of the user to be queried. The results are sorted in descending order of cumulative application usage duration.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the ranking of cumulative application usage duration for a specified user within a date range.</p>
     * 
     * @param request QueryUserAppUsageTimeRankRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserAppUsageTimeRankResponse
     */
    public QueryUserAppUsageTimeRankResponse queryUserAppUsageTimeRankWithOptions(QueryUserAppUsageTimeRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserAppUsageTimeRank"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserAppUsageTimeRankResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the ranking of application usage duration for a specified user within a statistical range. <code>StartDate</code> and <code>EndDate</code> use the <code>yyyyMMdd</code> format. If either parameter is not provided, it defaults to yesterday. Both dates must be within the last 90 days, and the start date cannot be later than the end date. The query range includes the start and end dates. <code>UserId</code> must be set to the ID of the user to be queried. The results are sorted in descending order of cumulative application usage duration.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the ranking of cumulative application usage duration for a specified user within a date range.</p>
     * 
     * @param request QueryUserAppUsageTimeRankRequest
     * @return QueryUserAppUsageTimeRankResponse
     */
    public QueryUserAppUsageTimeRankResponse queryUserAppUsageTimeRank(QueryUserAppUsageTimeRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserAppUsageTimeRankWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries user usage reports. <strong><code>ProductType</code>, <code>StartDate</code>, and <code>EndDate</code> are all required.</strong> The interval between the start and end times calculated by full months must not exceed 60 months.
     * The query aggregates data within the closed interval of calendar days between the start and end dates. Statistics for the same user under the same app instance group are merged. The results are paginated in descending order of cumulative usage duration, with a maximum of 1,500 records per page. You can combine <code>ConnectionStatus</code>, <code>UserId</code>, <code>BizRegionId</code>, and <code>AppInstanceGroupId</code> for filtering.</p>
     * <h3>Response handling</h3>
     * <p>A successful response may not contain <code>Code</code> and <code>Message</code>. Do not require these two fields to be <code>200</code> and <code>success</code> respectively. When no matching records are found, the response can normally return <code>Count=0</code> and an empty <code>UserUsageReportDataModel</code> list. This does not indicate a request failure.
     * Example of a successful response when no matching records are found (HTTP status code: 200):</p>
     * <pre><code class="language-json">{
     *   &quot;RequestId&quot;: &quot;01A1F2C3-572F-544E-880D-B0E347E3DCB3&quot;,
     *   &quot;PageSize&quot;: 1,
     *   &quot;PageNumber&quot;: 1,
     *   &quot;Count&quot;: 0,
     *   &quot;UserUsageReportDataModel&quot;: []
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the connection status, last connection time, cumulative usage duration, and session persistence duration of users.</p>
     * 
     * @param request QueryUserUsageReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserUsageReportResponse
     */
    public QueryUserUsageReportResponse queryUserUsageReportWithOptions(QueryUserUsageReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionStatus)) {
            body.put("ConnectionStatus", request.connectionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserUsageReport"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserUsageReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries user usage reports. <strong><code>ProductType</code>, <code>StartDate</code>, and <code>EndDate</code> are all required.</strong> The interval between the start and end times calculated by full months must not exceed 60 months.
     * The query aggregates data within the closed interval of calendar days between the start and end dates. Statistics for the same user under the same app instance group are merged. The results are paginated in descending order of cumulative usage duration, with a maximum of 1,500 records per page. You can combine <code>ConnectionStatus</code>, <code>UserId</code>, <code>BizRegionId</code>, and <code>AppInstanceGroupId</code> for filtering.</p>
     * <h3>Response handling</h3>
     * <p>A successful response may not contain <code>Code</code> and <code>Message</code>. Do not require these two fields to be <code>200</code> and <code>success</code> respectively. When no matching records are found, the response can normally return <code>Count=0</code> and an empty <code>UserUsageReportDataModel</code> list. This does not indicate a request failure.
     * Example of a successful response when no matching records are found (HTTP status code: 200):</p>
     * <pre><code class="language-json">{
     *   &quot;RequestId&quot;: &quot;01A1F2C3-572F-544E-880D-B0E347E3DCB3&quot;,
     *   &quot;PageSize&quot;: 1,
     *   &quot;PageNumber&quot;: 1,
     *   &quot;Count&quot;: 0,
     *   &quot;UserUsageReportDataModel&quot;: []
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the connection status, last connection time, cumulative usage duration, and session persistence duration of users.</p>
     * 
     * @param request QueryUserUsageReportRequest
     * @return QueryUserUsageReportResponse
     */
    public QueryUserUsageReportResponse queryUserUsageReport(QueryUserUsageReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserUsageReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for the resources to which agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent belong in the Wuying Agent Management Center. These model groups serve as inference engines for agents in the resource groups to execute tasks.
     * If an agent runtime is configured with a model group and its resource group is also configured with a model group, the model group bound to the resource group takes effect. That is, the resource group settings take precedence over the agent runtime settings.
     * When you remove the model group from the resource group to which the agent runtime belongs, the model group configured for the agent runtime automatically takes effect.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a model group from resource groups.</p>
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
     * <p>You can authorize model groups for the resources to which agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent belong in the Wuying Agent Management Center. These model groups serve as inference engines for agents in the resource groups to execute tasks.
     * If an agent runtime is configured with a model group and its resource group is also configured with a model group, the model group bound to the resource group takes effect. That is, the resource group settings take precedence over the agent runtime settings.
     * When you remove the model group from the resource group to which the agent runtime belongs, the model group configured for the agent runtime automatically takes effect.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a model group from resource groups.</p>
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
     * <p>You can call this operation to remove the specific third-party channel configuration for agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. After the configuration is removed, the agent cannot use the third-party channel for conversations.
     * Make sure that you are fully familiar with the operations and usage of the WUYING Agent Management Center before you call this operation.
     * Before you begin:</p>
     * <ul>
     * <li>The RuntimeIds passed to this operation must be agent runtimes that are managed by the WUYING Agent Management Center. The cloud desktops that host these runtimes must be created by calling API operations such as CreateDesktop of Elastic Desktop Service (EDS). Cross-product call chain example: CreateDesktop → ListDesktops → use DesktopId as RuntimeIds.</li>
     * <li>OpenClaw scenario: RuntimeIds are cloud desktop IDs in the format of ecd-xxxx, which are the DesktopId values returned by the ListDesktops operation of EDS.</li>
     * <li>JVS Computer and Hermes Agent scenarios: RuntimeIds are the corresponding JVS IDs in the format of jvs-xxxx. The cloud desktops that host these runtimes are also created by calling API operations such as CreateDesktop of EDS.</li>
     * <li>You can call the ListDesktopAgentRuntime operation of this product to query the agent runtimes managed by the WUYING Agent Management Center. If the query result is empty, the corresponding cloud desktop is not managed. In this case, you must first call the CreateDesktop operation of EDS to create the cloud desktop. The WUYING Agent Management Center automatically manages the cloud desktop after it receives the desktop lifecycle event. After that, you can call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the third-party channel configuration for an agent runtime.</p>
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
     * <p>You can call this operation to remove the specific third-party channel configuration for agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. After the configuration is removed, the agent cannot use the third-party channel for conversations.
     * Make sure that you are fully familiar with the operations and usage of the WUYING Agent Management Center before you call this operation.
     * Before you begin:</p>
     * <ul>
     * <li>The RuntimeIds passed to this operation must be agent runtimes that are managed by the WUYING Agent Management Center. The cloud desktops that host these runtimes must be created by calling API operations such as CreateDesktop of Elastic Desktop Service (EDS). Cross-product call chain example: CreateDesktop → ListDesktops → use DesktopId as RuntimeIds.</li>
     * <li>OpenClaw scenario: RuntimeIds are cloud desktop IDs in the format of ecd-xxxx, which are the DesktopId values returned by the ListDesktops operation of EDS.</li>
     * <li>JVS Computer and Hermes Agent scenarios: RuntimeIds are the corresponding JVS IDs in the format of jvs-xxxx. The cloud desktops that host these runtimes are also created by calling API operations such as CreateDesktop of EDS.</li>
     * <li>You can call the ListDesktopAgentRuntime operation of this product to query the agent runtimes managed by the WUYING Agent Management Center. If the query result is empty, the corresponding cloud desktop is not managed. In this case, you must first call the CreateDesktop operation of EDS to create the cloud desktop. The WUYING Agent Management Center automatically manages the cloud desktop after it receives the desktop lifecycle event. After that, you can call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the third-party channel configuration for an agent runtime.</p>
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
     * <p>You can remove a model group from agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. When an agent runtime resource needs to change its model group, you must first call this operation to remove the authorization relationship between the agent runtime resource and the original model group.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes the model group from agent runtime resources.</p>
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
     * <p>You can remove a model group from agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. When an agent runtime resource needs to change its model group, you must first call this operation to remove the authorization relationship between the agent runtime resource and the original model group.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes the model group from agent runtime resources.</p>
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
     * <p>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing methods and pricing</a> of WUYING Cloud App before you call this operation.</p>
     * <blockquote>
     * <p>Before you begin:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state and the ChargeType parameter must be set to PrePaid.</li>
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
     * <p>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing methods and pricing</a> of WUYING Cloud App before you call this operation.</p>
     * <blockquote>
     * <p>Before you begin:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state and the ChargeType parameter must be set to PrePaid.</li>
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
     * <b>description</b> :
     * <p>This operation expands the disks of a WUYING workstation.</p>
     * 
     * <b>summary</b> : 
     * <p>Expands the system cloud disk or user data cloud disk of an Enterprise Edition WUYING workstation and returns the related order information.</p>
     * 
     * @param tmpReq ResizeWuyingServerDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResizeWuyingServerDiskResponse
     */
    public ResizeWuyingServerDiskResponse resizeWuyingServerDiskWithOptions(ResizeWuyingServerDiskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResizeWuyingServerDiskShrinkRequest request = new ResizeWuyingServerDiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataDiskList)) {
            request.dataDiskListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataDiskList, "DataDiskList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskListShrink)) {
            body.put("DataDiskList", request.dataDiskListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskNewSize)) {
            body.put("SystemDiskNewSize", request.systemDiskNewSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResizeWuyingServerDisk"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResizeWuyingServerDiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation expands the disks of a WUYING workstation.</p>
     * 
     * <b>summary</b> : 
     * <p>Expands the system cloud disk or user data cloud disk of an Enterprise Edition WUYING workstation and returns the related order information.</p>
     * 
     * @param request ResizeWuyingServerDiskRequest
     * @return ResizeWuyingServerDiskResponse
     */
    public ResizeWuyingServerDiskResponse resizeWuyingServerDisk(ResizeWuyingServerDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resizeWuyingServerDiskWithOptions(request, runtime);
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableRestartRetry)) {
            query.put("EnableRestartRetry", request.enableRestartRetry);
        }

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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>Issues Cloud Assistant commands to persistent sessions in WUYING Workspace delivery groups. Currently, ProductType supports only WuyingServer and CommandType supports only CloudAssistantCmd. Specifying other values returns a parameter error.
     * The delivery scope supports two methods:</p>
     * <ul>
     * <li>Single delivery group: Specify the delivery group by using AppInstanceGroupId. You can also specify persistent sessions in the delivery group by using AppInstancePersistentId or AppInstancePersistentIds.</li>
     * <li>Multiple delivery groups in the same region: Specify a list of delivery groups by using AppInstanceGroupIds. The command is executed on all persistent sessions in each delivery group in the list. All delivery groups must belong to the same region. Otherwise, InvalidRegion.NotMatch is returned. If any delivery group does not exist or none of the delivery groups have persistent sessions, InvalidAppInstanceGroup.NotFound is returned.
     * You must specify at least one of AppInstanceGroupIds and AppInstanceGroupId. If both are specified, AppInstanceGroupIds takes precedence.
     * This operation only issues commands, which are executed asynchronously in sessions. Regardless of whether the command is issued to one or multiple delivery groups, only one command execution ID (InvocationId) is returned. You can use this ID to call ListCommandInvocationResults to query the execution status and output on each session.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Issues Cloud Assistant commands to persistent sessions in WUYING Workspace delivery groups, supports batch issuance to a single delivery group or multiple delivery groups in the same region, and returns the command execution ID.</p>
     * 
     * @param request RunAppInstanceCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunAppInstanceCommandResponse
     */
    public RunAppInstanceCommandResponse runAppInstanceCommandWithOptions(RunAppInstanceCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupIds)) {
            body.put("AppInstanceGroupIds", request.appInstanceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentIds)) {
            body.put("AppInstancePersistentIds", request.appInstancePersistentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            body.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandParam)) {
            body.put("CommandParam", request.commandParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandType)) {
            body.put("CommandType", request.commandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runScriptType)) {
            body.put("RunScriptType", request.runScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunAppInstanceCommand"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunAppInstanceCommandResponse());
    }

    /**
     * <b>description</b> :
     * <p>Issues Cloud Assistant commands to persistent sessions in WUYING Workspace delivery groups. Currently, ProductType supports only WuyingServer and CommandType supports only CloudAssistantCmd. Specifying other values returns a parameter error.
     * The delivery scope supports two methods:</p>
     * <ul>
     * <li>Single delivery group: Specify the delivery group by using AppInstanceGroupId. You can also specify persistent sessions in the delivery group by using AppInstancePersistentId or AppInstancePersistentIds.</li>
     * <li>Multiple delivery groups in the same region: Specify a list of delivery groups by using AppInstanceGroupIds. The command is executed on all persistent sessions in each delivery group in the list. All delivery groups must belong to the same region. Otherwise, InvalidRegion.NotMatch is returned. If any delivery group does not exist or none of the delivery groups have persistent sessions, InvalidAppInstanceGroup.NotFound is returned.
     * You must specify at least one of AppInstanceGroupIds and AppInstanceGroupId. If both are specified, AppInstanceGroupIds takes precedence.
     * This operation only issues commands, which are executed asynchronously in sessions. Regardless of whether the command is issued to one or multiple delivery groups, only one command execution ID (InvocationId) is returned. You can use this ID to call ListCommandInvocationResults to query the execution status and output on each session.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Issues Cloud Assistant commands to persistent sessions in WUYING Workspace delivery groups, supports batch issuance to a single delivery group or multiple delivery groups in the same region, and returns the command execution ID.</p>
     * 
     * @param request RunAppInstanceCommandRequest
     * @return RunAppInstanceCommandResponse
     */
    public RunAppInstanceCommandResponse runAppInstanceCommand(RunAppInstanceCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runAppInstanceCommandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation to initiate the third-party channel QR code configuration process in batches for managed cloud desktop runtimes in the Wuying Agent Management Center. The system generates a QR code configuration page URL for each runtime and notifies the authorized user of the runtime by email and SMS. The user can complete the channel configuration by opening the page and scanning the QR code.
     * Usage notes:</p>
     * <ul>
     * <li>Currently, only CloudDesktop is supported for RuntimeType. You can specify up to 200 runtime IDs in a single request.</li>
     * <li>Each runtime must have one and only one authorized user. Otherwise, the sending result for the runtime returns the error code Runtime.UserNotSupported.</li>
     * <li>The taskId in the QR code configuration page URL is valid for 1 hour. After it expires, you must call this API operation again to initiate the process.</li>
     * <li>If the sending fails for some runtimes, the API operation still returns a success response overall. Check the Success, Code, and Message fields for each runtime in Data. If the sending fails for all runtimes, the API operation returns a failure response. If the error codes for all runtimes are the same, that error code is returned. Otherwise, SendQrCodeConfigMessage.SendFailed is returned.</li>
     * <li>Email and SMS notifications are sent on a best-effort basis. Notification failures do not affect the API response. After initiation, you can call GetRuntimeChannelQrCodeDetail to query the details of the QR code configuration process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates the third-party channel QR code configuration process in batches for specified cloud desktop runtimes, generates QR code configuration page URLs, and notifies the authorized users of the runtimes by email and SMS.</p>
     * 
     * @param request SendRuntimeQrCodeConfigChannelMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendRuntimeQrCodeConfigChannelMessageResponse
     */
    public SendRuntimeQrCodeConfigChannelMessageResponse sendRuntimeQrCodeConfigChannelMessageWithOptions(SendRuntimeQrCodeConfigChannelMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SendRuntimeQrCodeConfigChannelMessage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendRuntimeQrCodeConfigChannelMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation to initiate the third-party channel QR code configuration process in batches for managed cloud desktop runtimes in the Wuying Agent Management Center. The system generates a QR code configuration page URL for each runtime and notifies the authorized user of the runtime by email and SMS. The user can complete the channel configuration by opening the page and scanning the QR code.
     * Usage notes:</p>
     * <ul>
     * <li>Currently, only CloudDesktop is supported for RuntimeType. You can specify up to 200 runtime IDs in a single request.</li>
     * <li>Each runtime must have one and only one authorized user. Otherwise, the sending result for the runtime returns the error code Runtime.UserNotSupported.</li>
     * <li>The taskId in the QR code configuration page URL is valid for 1 hour. After it expires, you must call this API operation again to initiate the process.</li>
     * <li>If the sending fails for some runtimes, the API operation still returns a success response overall. Check the Success, Code, and Message fields for each runtime in Data. If the sending fails for all runtimes, the API operation returns a failure response. If the error codes for all runtimes are the same, that error code is returned. Otherwise, SendQrCodeConfigMessage.SendFailed is returned.</li>
     * <li>Email and SMS notifications are sent on a best-effort basis. Notification failures do not affect the API response. After initiation, you can call GetRuntimeChannelQrCodeDetail to query the details of the QR code configuration process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates the third-party channel QR code configuration process in batches for specified cloud desktop runtimes, generates QR code configuration page URLs, and notifies the authorized users of the runtimes by email and SMS.</p>
     * 
     * @param request SendRuntimeQrCodeConfigChannelMessageRequest
     * @return SendRuntimeQrCodeConfigChannelMessageResponse
     */
    public SendRuntimeQrCodeConfigChannelMessageResponse sendRuntimeQrCodeConfigChannelMessage(SendRuntimeQrCodeConfigChannelMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRuntimeQrCodeConfigChannelMessageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>First, call <code>DescribeUserProfilePathRules</code> to query the target rules, and then submit the complete list of rules that you want to retain. <strong>The submission overwrites the existing rules of the target. Passing an empty array or omitting the rule list sets the target rules to an empty list.</strong> When a set ID is used, the rules apply to the members of the set. After the rules are configured, you can call the query operation to verify the settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets user data roaming path rules for an app instance group or an app instance group set.</p>
     * 
     * @param request SetUserProfilePathRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserProfilePathRulesResponse
     */
    public SetUserProfilePathRulesResponse setUserProfilePathRulesWithOptions(SetUserProfilePathRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            body.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProfilePathRules)) {
            body.put("UserProfilePathRules", request.userProfilePathRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProfileRuleType)) {
            body.put("UserProfileRuleType", request.userProfileRuleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserProfilePathRules"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserProfilePathRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>First, call <code>DescribeUserProfilePathRules</code> to query the target rules, and then submit the complete list of rules that you want to retain. <strong>The submission overwrites the existing rules of the target. Passing an empty array or omitting the rule list sets the target rules to an empty list.</strong> When a set ID is used, the rules apply to the members of the set. After the rules are configured, you can call the query operation to verify the settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets user data roaming path rules for an app instance group or an app instance group set.</p>
     * 
     * @param request SetUserProfilePathRulesRequest
     * @return SetUserProfilePathRulesResponse
     */
    public SetUserProfilePathRulesResponse setUserProfilePathRules(SetUserProfilePathRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserProfilePathRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an image creation task for an existing image version, or resumes an existing creation task.</p>
     * 
     * @param request StartTaskForCreateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTaskForCreateImageResponse
     */
    public StartTaskForCreateImageResponse startTaskForCreateImageWithOptions(StartTaskForCreateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageCreateMode)) {
            body.put("ImageCreateMode", request.imageCreateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jumpStep)) {
            body.put("JumpStep", request.jumpStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.performanceType)) {
            body.put("PerformanceType", request.performanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceList)) {
            body.put("ResourceList", request.resourceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryType)) {
            body.put("RetryType", request.retryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            body.put("RunMode", request.runMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            body.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstanceId)) {
            body.put("SubInstanceId", request.subInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            body.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTaskForCreateImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTaskForCreateImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an image creation task for an existing image version, or resumes an existing creation task.</p>
     * 
     * @param request StartTaskForCreateImageRequest
     * @return StartTaskForCreateImageResponse
     */
    public StartTaskForCreateImageResponse startTaskForCreateImage(StartTaskForCreateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTaskForCreateImageWithOptions(request, runtime);
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
     * <p>Starts one or more workstations.</p>
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
     * <p>Starts one or more workstations.</p>
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
     * <p>Confirms the completion of image creation.</p>
     * 
     * @param request SubmitImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImageResponse
     */
    public SubmitImageResponse submitImageWithOptions(SubmitImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionList)) {
            body.put("DestinationRegionList", request.destinationRegionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Confirms the completion of image creation.</p>
     * 
     * @param request SubmitImageRequest
     * @return SubmitImageResponse
     */
    public SubmitImageResponse submitImage(SubmitImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and binds tags to cloud resources, and updates the values of existing tags.</p>
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
     * <p>Creates and binds tags to cloud resources, and updates the values of existing tags.</p>
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the <code>appstreaming:TagResources</code> permission.
     * The resources to which you want to bind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only app instance group resources</strong>. You must set ResourceType to <code>APPINSTANCEGROUP</code>. You can obtain the app instance group ID by calling <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a>.</p>
     * <h2>Tag rules</h2>
     * <ul>
     * <li>A single request can bind up to <strong>20 tags</strong> to up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li>A tag key must be 1 to 128 characters in length, and a tag value must be 0 to 256 characters in length. Both are case-sensitive.</li>
     * <li>A tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive). Neither tag keys nor tag values can contain <code>http://</code> or <code>https://</code>.</li>
     * <li>Tag keys in the same request cannot be duplicate. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>A tag key on a resource can correspond to only one tag value. If the tag key already exists on the resource, the tag value is updated to the new value.</li>
     * <li>A single resource can be bound to up to 20 custom tags. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified app instance group does not exist or does not belong to the current account, the entire request fails</strong>, and the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned. No tags are bound to any resources.</li>
     * <li>If the binding is successful, the response contains only RequestId and does not return tag details.</li>
     * <li>If multiple resources are specified and the binding fails for only some of the resources, the operation still returns a success response, and the response does not contain failure details. Call ListTagResources to verify the binding results. If only one resource is specified and the binding fails, the operation directly returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the IDs of the app instance groups to which you want to bind tags.</li>
     * <li>Call this operation and specify ResourceType=<code>APPINSTANCEGROUP</code>, ResourceId.N, and Tag.N.Key/Tag.N.Value.</li>
     * <li>To view the tags bound to a resource, call ListTagResources. To unbind tags, call UntagResources.
     * The masked identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates and binds tags to specified app instance groups according to Alibaba Cloud tag specifications. If a tag with the same key already exists on a resource, the tag value is updated to the value specified in the current request. Currently, only the app instance group (<code>APPINSTANCEGROUP</code>) resource type is supported.</p>
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the <code>appstreaming:TagResources</code> permission.
     * The resources to which you want to bind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only app instance group resources</strong>. You must set ResourceType to <code>APPINSTANCEGROUP</code>. You can obtain the app instance group ID by calling <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a>.</p>
     * <h2>Tag rules</h2>
     * <ul>
     * <li>A single request can bind up to <strong>20 tags</strong> to up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li>A tag key must be 1 to 128 characters in length, and a tag value must be 0 to 256 characters in length. Both are case-sensitive.</li>
     * <li>A tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive). Neither tag keys nor tag values can contain <code>http://</code> or <code>https://</code>.</li>
     * <li>Tag keys in the same request cannot be duplicate. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>A tag key on a resource can correspond to only one tag value. If the tag key already exists on the resource, the tag value is updated to the new value.</li>
     * <li>A single resource can be bound to up to 20 custom tags. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified app instance group does not exist or does not belong to the current account, the entire request fails</strong>, and the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned. No tags are bound to any resources.</li>
     * <li>If the binding is successful, the response contains only RequestId and does not return tag details.</li>
     * <li>If multiple resources are specified and the binding fails for only some of the resources, the operation still returns a success response, and the response does not contain failure details. Call ListTagResources to verify the binding results. If only one resource is specified and the binding fails, the operation directly returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the IDs of the app instance groups to which you want to bind tags.</li>
     * <li>Call this operation and specify ResourceType=<code>APPINSTANCEGROUP</code>, ResourceId.N, and Tag.N.Key/Tag.N.Value.</li>
     * <li>To view the tags bound to a resource, call ListTagResources. To unbind tags, call UntagResources.
     * The masked identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates and binds tags to specified app instance groups according to Alibaba Cloud tag specifications. If a tag with the same key already exists on a resource, the tag value is updated to the value specified in the current request. Currently, only the app instance group (<code>APPINSTANCEGROUP</code>) resource type is supported.</p>
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
     * <p>Disassociates secondary private IP addresses from a development host.</p>
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
     * <p>Disassociates secondary private IP addresses from a development host.</p>
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
     * <b>description</b> :
     * <p>Only custom images and community images manageable by the current account are supported. If VersionId is omitted, the current active version is used. If specified, the version must belong to the image specified by ImageId.
     * Verify the association between the applications and the version through image query results before submitting AppIdList. <strong>Disassociating an application does not delete the application record.</strong> To delete an application, call DeleteApp.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates multiple applications from a specified image version.</p>
     * 
     * @param request UnbindAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAppResponse
     */
    public UnbindAppResponse unbindAppWithOptions(UnbindAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            bodyFlat.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindApp"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only custom images and community images manageable by the current account are supported. If VersionId is omitted, the current active version is used. If specified, the version must belong to the image specified by ImageId.
     * Verify the association between the applications and the version through image query results before submitting AppIdList. <strong>Disassociating an application does not delete the application record.</strong> To delete an application, call DeleteApp.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates multiple applications from a specified image version.</p>
     * 
     * @param request UnbindAppRequest
     * @return UnbindAppResponse
     */
    public UnbindAppResponse unbindApp(UnbindAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates tags from cloud resources.</p>
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
     * <p>Dissociates tags from cloud resources.</p>
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:UntagResources permission.
     * The resources from which you want to remove tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only app instance group resources</strong>. You must set ResourceType to APPINSTANCEGROUP. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID, and call the <a href="~~ListTagResources~~">ListTagResources</a> operation to query the tags bound to the resources.</p>
     * <h2>metric description</h2>
     * <ul>
     * <li>A single request can remove labels from up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li><strong>You must specify at least one of TagKey.N and All</strong>: If neither is specified, or if TagKey.N is not specified and All is set to false, the error code InvalidParameter.TagKeyListOrAll is returned.<ul>
     * <li>If TagKey.N is specified: Only the labels corresponding to these label keys are removed. A maximum of 20 label keys can be specified in a single request. In this case, the All parameter is ignored.</li>
     * <li>If TagKey.N is not specified and All is set to true: All custom labels on the resources are removed, including Wuying system labels that start with <code>System/</code> and are attached by calling the <a href="~~TagResources~~">TagResources</a> operation.</li>
     * </ul>
     * </li>
     * <li>If a specified label key does not exist on a resource, the label key is skipped and no fault is returned.</li>
     * <li>Label keys that start with <code>System/</code> are Wuying system labels. Only System/Scheduler/GRAYSCALE and System/Scheduler/STOP_NEW_USER_CONNECTION are supported. If you specify other label keys that start with <code>System/</code>, the error code InvalidTagPolicy.KeyInvalid or InvalidTag.SystemKeyNotAllow is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified app instance group does not exist or does not belong to the current account, the entire request fails</strong>, and the error code InvalidAppInstanceGroup.NotFound is returned. No tags are removed from any resources.</li>
     * <li>If tags are successfully removed, the response contains only RequestId and does not return tag details.</li>
     * <li>If multiple resources are specified and tags are removed from only some of the resources, the operation still returns a success response, and the response does not contain failure details. You can call the <a href="~~ListTagResources~~">ListTagResources</a> operation to verify the tag removal results. If only one resource is specified and tag removal fails, the operation directly returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID. To confirm the tag keys bound to the resources, call the <a href="~~ListTagResources~~">ListTagResources</a> operation.</li>
     * <li>Call this operation, set ResourceType to APPINSTANCEGROUP, specify ResourceId.N, and specify TagKey.N or set All to true to indicate the tags to be removed.</li>
     * <li>To bind tags again, call the <a href="~~TagResources~~">TagResources</a> operation.
     * The desensitized identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from the specified Wuying app instance groups according to Alibaba Cloud tag specifications. You can remove specific tags by tag key, or remove all custom tags from the resources at once by setting All to true without specifying tag keys. Currently, only the app instance group (APPINSTANCEGROUP) resource type is supported.</p>
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:UntagResources permission.
     * The resources from which you want to remove tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only app instance group resources</strong>. You must set ResourceType to APPINSTANCEGROUP. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID, and call the <a href="~~ListTagResources~~">ListTagResources</a> operation to query the tags bound to the resources.</p>
     * <h2>metric description</h2>
     * <ul>
     * <li>A single request can remove labels from up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li><strong>You must specify at least one of TagKey.N and All</strong>: If neither is specified, or if TagKey.N is not specified and All is set to false, the error code InvalidParameter.TagKeyListOrAll is returned.<ul>
     * <li>If TagKey.N is specified: Only the labels corresponding to these label keys are removed. A maximum of 20 label keys can be specified in a single request. In this case, the All parameter is ignored.</li>
     * <li>If TagKey.N is not specified and All is set to true: All custom labels on the resources are removed, including Wuying system labels that start with <code>System/</code> and are attached by calling the <a href="~~TagResources~~">TagResources</a> operation.</li>
     * </ul>
     * </li>
     * <li>If a specified label key does not exist on a resource, the label key is skipped and no fault is returned.</li>
     * <li>Label keys that start with <code>System/</code> are Wuying system labels. Only System/Scheduler/GRAYSCALE and System/Scheduler/STOP_NEW_USER_CONNECTION are supported. If you specify other label keys that start with <code>System/</code>, the error code InvalidTagPolicy.KeyInvalid or InvalidTag.SystemKeyNotAllow is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified app instance group does not exist or does not belong to the current account, the entire request fails</strong>, and the error code InvalidAppInstanceGroup.NotFound is returned. No tags are removed from any resources.</li>
     * <li>If tags are successfully removed, the response contains only RequestId and does not return tag details.</li>
     * <li>If multiple resources are specified and tags are removed from only some of the resources, the operation still returns a success response, and the response does not contain failure details. You can call the <a href="~~ListTagResources~~">ListTagResources</a> operation to verify the tag removal results. If only one resource is specified and tag removal fails, the operation directly returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID. To confirm the tag keys bound to the resources, call the <a href="~~ListTagResources~~">ListTagResources</a> operation.</li>
     * <li>Call this operation, set ResourceType to APPINSTANCEGROUP, specify ResourceId.N, and specify TagKey.N or set All to true to indicate the tags to be removed.</li>
     * <li>To bind tags again, call the <a href="~~TagResources~~">TagResources</a> operation.
     * The desensitized identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from the specified Wuying app instance groups according to Alibaba Cloud tag specifications. You can remove specific tags by tag key, or remove all custom tags from the resources at once by setting All to true without specifying tag keys. Currently, only the app instance group (APPINSTANCEGROUP) resource type is supported.</p>
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
     * <p>The AdaptorId must correspond to a valid application adapter manageable by the current account. Pass only the configurations that need to be modified in this request.
     * SilenceParam is used for application startup parameters. UserConfig is used for application runtime configurations. <strong>This operation does not support modifying application scripts or executable file paths through AppScript or ExecuteFileAddress. Do not pass these two parameters.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the runtime parameters, optimization configurations, and user configurations of a specified application adapter.</p>
     * 
     * @param tmpReq UpdateAdaptorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAdaptorResponse
     */
    public UpdateAdaptorResponse updateAdaptorWithOptions(UpdateAdaptorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAdaptorShrinkRequest request = new UpdateAdaptorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userConfig)) {
            request.userConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userConfig, "UserConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptorId)) {
            body.put("AdaptorId", request.adaptorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appScript)) {
            body.put("AppScript", request.appScript);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeFileAddress)) {
            body.put("ExecuteFileAddress", request.executeFileAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optimizeParam)) {
            body.put("OptimizeParam", request.optimizeParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceParam)) {
            body.put("SilenceParam", request.silenceParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConfigShrink)) {
            body.put("UserConfig", request.userConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAdaptor"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdaptorResponse());
    }

    /**
     * <b>description</b> :
     * <p>The AdaptorId must correspond to a valid application adapter manageable by the current account. Pass only the configurations that need to be modified in this request.
     * SilenceParam is used for application startup parameters. UserConfig is used for application runtime configurations. <strong>This operation does not support modifying application scripts or executable file paths through AppScript or ExecuteFileAddress. Do not pass these two parameters.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the runtime parameters, optimization configurations, and user configurations of a specified application adapter.</p>
     * 
     * @param request UpdateAdaptorRequest
     * @return UpdateAdaptorResponse
     */
    public UpdateAdaptorResponse updateAdaptor(UpdateAdaptorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAdaptorWithOptions(request, runtime);
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
     * <p>You can only modify images that are owned by the current account and allow modifications. Shared images cannot be modified.
     * You must provide at least one of ImageId and VersionId. If both are provided, they must point to the same image. If VersionId is omitted, the current effective version of the image is used. Passing a non-empty AdaptorIdList updates the application adapter associations of the selected version based on the complete list. Make sure to include the adapters that you want to retain.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, version information, and associated application adapters of an image.</p>
     * 
     * @param request UpdateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptorIdList)) {
            body.put("AdaptorIdList", request.adaptorIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distro)) {
            body.put("Distro", request.distro);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            body.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can only modify images that are owned by the current account and allow modifications. Shared images cannot be modified.
     * You must provide at least one of ImageId and VersionId. If both are provided, they must point to the same image. If VersionId is omitted, the current effective version of the image is used. Passing a non-empty AdaptorIdList updates the application adapter associations of the selected version based on the complete list. Make sure to include the adapters that you want to retain.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, version information, and associated application adapters of an image.</p>
     * 
     * @param request UpdateImageRequest
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The task must exist before you call this operation, and the corresponding creation resource and resource node must be available. The TaskType must match the actual type of the task. <strong>This operation does not support modifying the task step, image version, or destination region by using TaskStep, VersionId, or BizRegionId. Do not pass these three parameters.</strong> A successful request only indicates that the status update call is completed. To query the final status of the task, call GetTask.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a status update request for an existing image creation task to the corresponding creation resource.</p>
     * 
     * @param request UpdateImageTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageTaskResponse
     */
    public UpdateImageTaskResponse updateImageTaskWithOptions(UpdateImageTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStep)) {
            body.put("TaskStep", request.taskStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>The task must exist before you call this operation, and the corresponding creation resource and resource node must be available. The TaskType must match the actual type of the task. <strong>This operation does not support modifying the task step, image version, or destination region by using TaskStep, VersionId, or BizRegionId. Do not pass these three parameters.</strong> A successful request only indicates that the status update call is completed. To query the final status of the task, call GetTask.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a status update request for an existing image creation task to the corresponding creation resource.</p>
     * 
     * @param request UpdateImageTaskRequest
     * @return UpdateImageTaskResponse
     */
    public UpdateImageTaskResponse updateImageTask(UpdateImageTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageTaskWithOptions(request, runtime);
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

    /**
     * <b>summary</b> : 
     * <p>Validates the LLM template configuration.</p>
     * 
     * @param request ValidateLlmTemplateConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateLlmTemplateConfigResponse
     */
    public ValidateLlmTemplateConfigResponse validateLlmTemplateConfigWithOptions(ValidateLlmTemplateConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            query.put("ProviderTemplateId", request.providerTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateLlmTemplateConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateLlmTemplateConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the LLM template configuration.</p>
     * 
     * @param request ValidateLlmTemplateConfigRequest
     * @return ValidateLlmTemplateConfigResponse
     */
    public ValidateLlmTemplateConfigResponse validateLlmTemplateConfig(ValidateLlmTemplateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateLlmTemplateConfigWithOptions(request, runtime);
    }
}
