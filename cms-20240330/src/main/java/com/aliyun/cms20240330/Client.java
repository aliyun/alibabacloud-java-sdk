// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330;

import com.aliyun.tea.*;
import com.aliyun.cms20240330.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>修改资源所属资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourcegroup"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改资源所属资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Used to create a site monitoring task</p>
     * 
     * <b>summary</b> : 
     * <p>Install the access component, representing a single access attempt</p>
     * 
     * @param request CreateAddonReleaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAddonReleaseResponse
     */
    public CreateAddonReleaseResponse createAddonReleaseWithOptions(String policyId, CreateAddonReleaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            body.put("addonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            body.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityRules)) {
            body.put("entityRules", request.entityRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("envType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentAddonReleaseId)) {
            body.put("parentAddonReleaseId", request.parentAddonReleaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            body.put("releaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.values)) {
            body.put("values", request.values);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAddonRelease"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/addon-releases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAddonReleaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Used to create a site monitoring task</p>
     * 
     * <b>summary</b> : 
     * <p>Install the access component, representing a single access attempt</p>
     * 
     * @param request CreateAddonReleaseRequest
     * @return CreateAddonReleaseResponse
     */
    public CreateAddonReleaseResponse createAddonRelease(String policyId, CreateAddonReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAddonReleaseWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Aggregation Task Group</p>
     * 
     * @param request CreateAggTaskGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAggTaskGroupResponse
     */
    public CreateAggTaskGroupResponse createAggTaskGroupWithOptions(String instanceId, CreateAggTaskGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.overrideIfExists)) {
            query.put("overrideIfExists", request.overrideIfExists);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggTaskGroupConfig)) {
            body.put("aggTaskGroupConfig", request.aggTaskGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggTaskGroupConfigType)) {
            body.put("aggTaskGroupConfigType", request.aggTaskGroupConfigType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggTaskGroupName)) {
            body.put("aggTaskGroupName", request.aggTaskGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpr)) {
            body.put("cronExpr", request.cronExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delay)) {
            body.put("delay", request.delay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            body.put("fromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRetries)) {
            body.put("maxRetries", request.maxRetries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRunTimeInSeconds)) {
            body.put("maxRunTimeInSeconds", request.maxRunTimeInSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.precheckString)) {
            body.put("precheckString", request.precheckString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMode)) {
            body.put("scheduleMode", request.scheduleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimeExpr)) {
            body.put("scheduleTimeExpr", request.scheduleTimeExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPrometheusId)) {
            body.put("targetPrometheusId", request.targetPrometheusId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            body.put("toTime", request.toTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggTaskGroup"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/agg-task-groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggTaskGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Aggregation Task Group</p>
     * 
     * @param request CreateAggTaskGroupRequest
     * @return CreateAggTaskGroupResponse
     */
    public CreateAggTaskGroupResponse createAggTaskGroup(String instanceId, CreateAggTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAggTaskGroupWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建业务链路</p>
     * 
     * @param request CreateBizTraceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBizTraceResponse
     */
    public CreateBizTraceResponse createBizTraceWithOptions(CreateBizTraceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfig)) {
            body.put("advancedConfig", request.advancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTraceCode)) {
            body.put("bizTraceCode", request.bizTraceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTraceName)) {
            body.put("bizTraceName", request.bizTraceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            body.put("ruleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBizTrace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bizTrace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBizTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建业务链路</p>
     * 
     * @param request CreateBizTraceRequest
     * @return CreateBizTraceResponse
     */
    public CreateBizTraceResponse createBizTrace(CreateBizTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBizTraceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建对话</p>
     * 
     * @param request CreateChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatResponse
     */
    public CreateChatResponse createChatWithOptions(CreateChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeName)) {
            body.put("digitalEmployeeName", request.digitalEmployeeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadId)) {
            body.put("threadId", request.threadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChat"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建对话</p>
     * 
     * @param request CreateChatRequest
     * @return CreateChatResponse
     */
    public CreateChatResponse createChat(CreateChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建云资源中心</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudResourceResponse
     */
    public CreateCloudResourceResponse createCloudResourceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudResource"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cloudresource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建云资源中心</p>
     * @return CreateCloudResourceResponse
     */
    public CreateCloudResourceResponse createCloudResource() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCloudResourceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建DigitalEmployee</p>
     * 
     * @param request CreateDigitalEmployeeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDigitalEmployeeResponse
     */
    public CreateDigitalEmployeeResponse createDigitalEmployeeWithOptions(CreateDigitalEmployeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            body.put("defaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledges)) {
            body.put("knowledges", request.knowledges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("roleArn", request.roleArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDigitalEmployee"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建DigitalEmployee</p>
     * 
     * @param request CreateDigitalEmployeeRequest
     * @return CreateDigitalEmployeeResponse
     */
    public CreateDigitalEmployeeResponse createDigitalEmployee(CreateDigitalEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalEmployeeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create storage related to EntityStore</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEntityStoreResponse
     */
    public CreateEntityStoreResponse createEntityStoreWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEntityStore"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/entitystore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEntityStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create storage related to EntityStore</p>
     * @return CreateEntityStoreResponse
     */
    public CreateEntityStoreResponse createEntityStore(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEntityStoreWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface is used to support users in creating event integration.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Access Center Policy</p>
     * 
     * @param request CreateIntegrationPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntegrationPolicyResponse
     */
    public CreateIntegrationPolicyResponse createIntegrationPolicyWithOptions(CreateIntegrationPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityGroup)) {
            body.put("entityGroup", request.entityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("policyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("policyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntegrationPolicy"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntegrationPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This interface is used to support users in creating event integration.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Access Center Policy</p>
     * 
     * @param request CreateIntegrationPolicyRequest
     * @return CreateIntegrationPolicyResponse
     */
    public CreateIntegrationPolicyResponse createIntegrationPolicy(CreateIntegrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIntegrationPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a Prometheus monitoring instance</p>
     * 
     * @param request CreatePrometheusInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusInstanceResponse
     */
    public CreatePrometheusInstanceResponse createPrometheusInstanceWithOptions(CreatePrometheusInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.archiveDuration)) {
            body.put("archiveDuration", request.archiveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFreeReadPolicy)) {
            body.put("authFreeReadPolicy", request.authFreeReadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFreeWritePolicy)) {
            body.put("authFreeWritePolicy", request.authFreeWritePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeRead)) {
            body.put("enableAuthFreeRead", request.enableAuthFreeRead);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeWrite)) {
            body.put("enableAuthFreeWrite", request.enableAuthFreeWrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthToken)) {
            body.put("enableAuthToken", request.enableAuthToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceName)) {
            body.put("prometheusInstanceName", request.prometheusInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageDuration)) {
            body.put("storageDuration", request.storageDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrometheusInstance"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a Prometheus monitoring instance</p>
     * 
     * @param request CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    public CreatePrometheusInstanceResponse createPrometheusInstance(CreatePrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrometheusInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Used to create a site monitoring task</p>
     * 
     * <b>summary</b> : 
     * <p>Create Prometheus View</p>
     * 
     * @param request CreatePrometheusViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusViewResponse
     */
    public CreatePrometheusViewResponse createPrometheusViewWithOptions(CreatePrometheusViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authFreeReadPolicy)) {
            body.put("authFreeReadPolicy", request.authFreeReadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeRead)) {
            body.put("enableAuthFreeRead", request.enableAuthFreeRead);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthToken)) {
            body.put("enableAuthToken", request.enableAuthToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstances)) {
            body.put("prometheusInstances", request.prometheusInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusViewName)) {
            body.put("prometheusViewName", request.prometheusViewName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrometheusView"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-views"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusViewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Used to create a site monitoring task</p>
     * 
     * <b>summary</b> : 
     * <p>Create Prometheus View</p>
     * 
     * @param request CreatePrometheusViewRequest
     * @return CreatePrometheusViewResponse
     */
    public CreatePrometheusViewResponse createPrometheusView(CreatePrometheusViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrometheusViewWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create a Prometheus monitoring virtual instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Prometheus Monitoring Instance</p>
     * 
     * @param request CreatePrometheusVirtualInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusVirtualInstanceResponse
     */
    public CreatePrometheusVirtualInstanceResponse createPrometheusVirtualInstanceWithOptions(CreatePrometheusVirtualInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrometheusVirtualInstance"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/virtual-instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusVirtualInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create a Prometheus monitoring virtual instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Prometheus Monitoring Instance</p>
     * 
     * @param request CreatePrometheusVirtualInstanceRequest
     * @return CreatePrometheusVirtualInstanceResponse
     */
    public CreatePrometheusVirtualInstanceResponse createPrometheusVirtualInstance(CreatePrometheusVirtualInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrometheusVirtualInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Service</p>
     * 
     * @param request CreateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createServiceWithOptions(String workspace, CreateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            body.put("serviceStatus", request.serviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/service"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Service</p>
     * 
     * @param request CreateServiceRequest
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(String workspace, CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用可观测实例</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceObservabilityResponse
     */
    public CreateServiceObservabilityResponse createServiceObservabilityWithOptions(String workspace, String type, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceObservability"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/service-observability/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceObservabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用可观测实例</p>
     * @return CreateServiceObservabilityResponse
     */
    public CreateServiceObservabilityResponse createServiceObservability(String workspace, String type) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceObservabilityWithOptions(workspace, type, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建会话</p>
     * 
     * @param request CreateThreadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateThreadResponse
     */
    public CreateThreadResponse createThreadWithOptions(String name, CreateThreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThread"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建会话</p>
     * 
     * @param request CreateThreadRequest
     * @return CreateThreadResponse
     */
    public CreateThreadResponse createThread(String name, CreateThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createThreadWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Ticket</p>
     * 
     * @param request CreateTicketRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenExpirationTime)) {
            query.put("accessTokenExpirationTime", request.accessTokenExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("expirationTime", request.expirationTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tickets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Ticket</p>
     * 
     * @param request CreateTicketRequest
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTicketWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create Umodel configuration in the specified workspace</p>
     * 
     * <b>summary</b> : 
     * <p>Create Umodel configuration</p>
     * 
     * @param request CreateUmodelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUmodelResponse
     */
    public CreateUmodelResponse createUmodelWithOptions(String workspace, CreateUmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create Umodel configuration in the specified workspace</p>
     * 
     * <b>summary</b> : 
     * <p>Create Umodel configuration</p>
     * 
     * @param request CreateUmodelRequest
     * @return CreateUmodelResponse
     */
    public CreateUmodelResponse createUmodel(String workspace, CreateUmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUmodelWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete addon release information</p>
     * 
     * @param request DeleteAddonReleaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAddonReleaseResponse
     */
    public DeleteAddonReleaseResponse deleteAddonReleaseWithOptions(String policyId, DeleteAddonReleaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("addonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            query.put("releaseName", request.releaseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAddonRelease"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/addon-releases"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAddonReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete addon release information</p>
     * 
     * @param request DeleteAddonReleaseRequest
     * @return DeleteAddonReleaseResponse
     */
    public DeleteAddonReleaseResponse deleteAddonRelease(String policyId, DeleteAddonReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAddonReleaseWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Aggregation Task Group</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAggTaskGroupResponse
     */
    public DeleteAggTaskGroupResponse deleteAggTaskGroupWithOptions(String instanceId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAggTaskGroup"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/agg-task-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAggTaskGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Aggregation Task Group</p>
     * @return DeleteAggTaskGroupResponse
     */
    public DeleteAggTaskGroupResponse deleteAggTaskGroup(String instanceId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAggTaskGroupWithOptions(instanceId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除业务链路</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBizTraceResponse
     */
    public DeleteBizTraceResponse deleteBizTraceWithOptions(String bizTraceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBizTrace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bizTrace/" + com.aliyun.openapiutil.Client.getEncodeParam(bizTraceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除业务链路</p>
     * @return DeleteBizTraceResponse
     */
    public DeleteBizTraceResponse deleteBizTrace(String bizTraceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBizTraceWithOptions(bizTraceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除云资源中心</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudResourceResponse
     */
    public DeleteCloudResourceResponse deleteCloudResourceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudResource"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cloudresource"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除云资源中心</p>
     * @return DeleteCloudResourceResponse
     */
    public DeleteCloudResourceResponse deleteCloudResource() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCloudResourceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除DigitalEmployee</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDigitalEmployeeResponse
     */
    public DeleteDigitalEmployeeResponse deleteDigitalEmployeeWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDigitalEmployee"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除DigitalEmployee</p>
     * @return DeleteDigitalEmployeeResponse
     */
    public DeleteDigitalEmployeeResponse deleteDigitalEmployee(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDigitalEmployeeWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete EntityStore related storage</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEntityStoreResponse
     */
    public DeleteEntityStoreResponse deleteEntityStoreWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEntityStore"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/entitystore"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEntityStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete EntityStore related storage</p>
     * @return DeleteEntityStoreResponse
     */
    public DeleteEntityStoreResponse deleteEntityStore(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEntityStoreWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Access Center Policy</p>
     * 
     * @param request DeleteIntegrationPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIntegrationPolicyResponse
     */
    public DeleteIntegrationPolicyResponse deleteIntegrationPolicyWithOptions(String policyId, DeleteIntegrationPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIntegrationPolicy"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIntegrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Access Center Policy</p>
     * 
     * @param request DeleteIntegrationPolicyRequest
     * @return DeleteIntegrationPolicyResponse
     */
    public DeleteIntegrationPolicyResponse deleteIntegrationPolicy(String policyId, DeleteIntegrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIntegrationPolicyWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete a Prometheus instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete prom instance</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusInstanceResponse
     */
    public DeletePrometheusInstanceResponse deletePrometheusInstanceWithOptions(String prometheusInstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusInstance"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusInstanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete a Prometheus instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete prom instance</p>
     * @return DeletePrometheusInstanceResponse
     */
    public DeletePrometheusInstanceResponse deletePrometheusInstance(String prometheusInstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePrometheusInstanceWithOptions(prometheusInstanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete prometheus view instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete prometheus view instance</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrometheusViewResponse
     */
    public DeletePrometheusViewResponse deletePrometheusViewWithOptions(String prometheusViewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrometheusView"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-views/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusViewId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrometheusViewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete prometheus view instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete prometheus view instance</p>
     * @return DeletePrometheusViewResponse
     */
    public DeletePrometheusViewResponse deletePrometheusView(String prometheusViewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePrometheusViewWithOptions(prometheusViewId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Service</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteServiceWithOptions(String workspace, String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/service/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Service</p>
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(String workspace, String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(workspace, serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除会话</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteThreadResponse
     */
    public DeleteThreadResponse deleteThreadWithOptions(String name, String threadId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteThread"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除会话</p>
     * @return DeleteThreadResponse
     */
    public DeleteThreadResponse deleteThread(String name, String threadId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteThreadWithOptions(name, threadId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete the Umodel under the specified workspace</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Umodel configuration information</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUmodelResponse
     */
    public DeleteUmodelResponse deleteUmodelWithOptions(String workspace, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete the Umodel under the specified workspace</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Umodel configuration information</p>
     * @return DeleteUmodelResponse
     */
    public DeleteUmodelResponse deleteUmodel(String workspace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUmodelWithOptions(workspace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Umodel配置信息</p>
     * 
     * @param request DeleteUmodelCommonSchemaRefRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUmodelCommonSchemaRefResponse
     */
    public DeleteUmodelCommonSchemaRefResponse deleteUmodelCommonSchemaRefWithOptions(String workspace, DeleteUmodelCommonSchemaRefRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUmodelCommonSchemaRef"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/common-schema-ref"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUmodelCommonSchemaRefResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Umodel配置信息</p>
     * 
     * @param request DeleteUmodelCommonSchemaRefRequest
     * @return DeleteUmodelCommonSchemaRefResponse
     */
    public DeleteUmodelCommonSchemaRefResponse deleteUmodelCommonSchemaRef(String workspace, DeleteUmodelCommonSchemaRefRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUmodelCommonSchemaRefWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete the Umodel Data under a specified workspace</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Umodel Elements</p>
     * 
     * @param request DeleteUmodelDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUmodelDataResponse
     */
    public DeleteUmodelDataResponse deleteUmodelDataWithOptions(String workspace, DeleteUmodelDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            query.put("kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUmodelData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/data"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUmodelDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete the Umodel Data under a specified workspace</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Umodel Elements</p>
     * 
     * @param request DeleteUmodelDataRequest
     * @return DeleteUmodelDataResponse
     */
    public DeleteUmodelDataResponse deleteUmodelData(String workspace, DeleteUmodelDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUmodelDataWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Workspace</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Workspace</p>
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域信息列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域信息列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插件详情(Addon)</p>
     * 
     * @param request GetAddonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAddonResponse
     */
    public GetAddonResponse getAddonWithOptions(String addonName, GetAddonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddon"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addons/" + com.aliyun.openapiutil.Client.getEncodeParam(addonName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>插件详情(Addon)</p>
     * 
     * @param request GetAddonRequest
     * @return GetAddonResponse
     */
    public GetAddonResponse getAddon(String addonName, GetAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddonWithOptions(addonName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插件schema详情(Addon)</p>
     * 
     * @param request GetAddonCodeTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAddonCodeTemplateResponse
     */
    public GetAddonCodeTemplateResponse getAddonCodeTemplateWithOptions(String addonName, GetAddonCodeTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentType)) {
            query.put("environmentType", request.environmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddonCodeTemplate"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addons/" + com.aliyun.openapiutil.Client.getEncodeParam(addonName) + "/alert-code-template"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddonCodeTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>插件schema详情(Addon)</p>
     * 
     * @param request GetAddonCodeTemplateRequest
     * @return GetAddonCodeTemplateResponse
     */
    public GetAddonCodeTemplateResponse getAddonCodeTemplate(String addonName, GetAddonCodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddonCodeTemplateWithOptions(addonName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check addon release (view connection status)</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAddonReleaseResponse
     */
    public GetAddonReleaseResponse getAddonReleaseWithOptions(String releaseName, String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddonRelease"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/addon-releases/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddonReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Check addon release (view connection status)</p>
     * @return GetAddonReleaseResponse
     */
    public GetAddonReleaseResponse getAddonRelease(String releaseName, String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddonReleaseWithOptions(releaseName, policyId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插件schema详情(Addon)</p>
     * 
     * @param request GetAddonSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAddonSchemaResponse
     */
    public GetAddonSchemaResponse getAddonSchemaWithOptions(String addonName, GetAddonSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentType)) {
            query.put("environmentType", request.environmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddonSchema"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addons/" + com.aliyun.openapiutil.Client.getEncodeParam(addonName) + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddonSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>插件schema详情(Addon)</p>
     * 
     * @param request GetAddonSchemaRequest
     * @return GetAddonSchemaResponse
     */
    public GetAddonSchemaResponse getAddonSchema(String addonName, GetAddonSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddonSchemaWithOptions(addonName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the aggregation task group</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggTaskGroupResponse
     */
    public GetAggTaskGroupResponse getAggTaskGroupWithOptions(String instanceId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggTaskGroup"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/agg-task-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggTaskGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the aggregation task group</p>
     * @return GetAggTaskGroupResponse
     */
    public GetAggTaskGroupResponse getAggTaskGroup(String instanceId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAggTaskGroupWithOptions(instanceId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务链路</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBizTraceResponse
     */
    public GetBizTraceResponse getBizTraceWithOptions(String bizTraceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBizTrace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bizTrace/" + com.aliyun.openapiutil.Client.getEncodeParam(bizTraceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务链路</p>
     * @return GetBizTraceResponse
     */
    public GetBizTraceResponse getBizTrace(String bizTraceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBizTraceWithOptions(bizTraceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源中心</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudResourceResponse
     */
    public GetCloudResourceResponse getCloudResourceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudResource"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cloudresource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源中心</p>
     * @return GetCloudResourceResponse
     */
    public GetCloudResourceResponse getCloudResource() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCloudResourceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源中心数据</p>
     * 
     * @param request GetCloudResourceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudResourceDataResponse
     */
    public GetCloudResourceDataResponse getCloudResourceDataWithOptions(GetCloudResourceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudResourceData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cloudresource/data"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudResourceDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源中心数据</p>
     * 
     * @param request GetCloudResourceDataRequest
     * @return GetCloudResourceDataResponse
     */
    public GetCloudResourceDataResponse getCloudResourceData(GetCloudResourceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCloudResourceDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云监控开通状态</p>
     * 
     * @param request GetCmsServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCmsServiceResponse
     */
    public GetCmsServiceResponse getCmsServiceWithOptions(GetCmsServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCmsService"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cmsservice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCmsServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取云监控开通状态</p>
     * 
     * @param request GetCmsServiceRequest
     * @return GetCmsServiceResponse
     */
    public GetCmsServiceResponse getCmsService(GetCmsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCmsServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DigitalEmployee</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDigitalEmployeeResponse
     */
    public GetDigitalEmployeeResponse getDigitalEmployeeWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDigitalEmployee"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DigitalEmployee</p>
     * @return GetDigitalEmployeeResponse
     */
    public GetDigitalEmployeeResponse getDigitalEmployee(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDigitalEmployeeWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get EntityStore related storage information</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEntityStoreResponse
     */
    public GetEntityStoreResponse getEntityStoreWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityStore"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/entitystore"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get EntityStore related storage information</p>
     * @return GetEntityStoreResponse
     */
    public GetEntityStoreResponse getEntityStore(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEntityStoreWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the entity and relationship data under a specified Workspace, returning the entity data within a certain time range (the returned result is transmitted after compression).</p>
     * 
     * @param request GetEntityStoreDataRequest
     * @param headers GetEntityStoreDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEntityStoreDataResponse
     */
    public GetEntityStoreDataResponse getEntityStoreDataWithOptions(String workspace, GetEntityStoreDataRequest request, GetEntityStoreDataHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("to", request.to);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("acceptEncoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityStoreData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/entitiesAndRelations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityStoreDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the entity and relationship data under a specified Workspace, returning the entity data within a certain time range (the returned result is transmitted after compression).</p>
     * 
     * @param request GetEntityStoreDataRequest
     * @return GetEntityStoreDataResponse
     */
    public GetEntityStoreDataResponse getEntityStoreData(String workspace, GetEntityStoreDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetEntityStoreDataHeaders headers = new GetEntityStoreDataHeaders();
        return this.getEntityStoreDataWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of access center policies</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntegrationPolicyResponse
     */
    public GetIntegrationPolicyResponse getIntegrationPolicyWithOptions(String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntegrationPolicy"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntegrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of access center policies</p>
     * @return GetIntegrationPolicyResponse
     */
    public GetIntegrationPolicyResponse getIntegrationPolicy(String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIntegrationPolicyWithOptions(policyId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入中心在CS的版本</p>
     * 
     * @param request GetIntegrationVersionForCSRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntegrationVersionForCSResponse
     */
    public GetIntegrationVersionForCSResponse getIntegrationVersionForCSWithOptions(GetIntegrationVersionForCSRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("clusterType", request.clusterType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntegrationVersionForCS"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-version/cs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntegrationVersionForCSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入中心在CS的版本</p>
     * 
     * @param request GetIntegrationVersionForCSRequest
     * @return GetIntegrationVersionForCSResponse
     */
    public GetIntegrationVersionForCSResponse getIntegrationVersionForCS(GetIntegrationVersionForCSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIntegrationVersionForCSWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve details of a Prometheus instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the instance in a specified environment</p>
     * 
     * @param request GetPrometheusInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusInstanceResponse
     */
    public GetPrometheusInstanceResponse getPrometheusInstanceWithOptions(String prometheusInstanceId, GetPrometheusInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusInstance"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusInstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieve details of a Prometheus instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the instance in a specified environment</p>
     * 
     * @param request GetPrometheusInstanceRequest
     * @return GetPrometheusInstanceResponse
     */
    public GetPrometheusInstanceResponse getPrometheusInstance(String prometheusInstanceId, GetPrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPrometheusInstanceWithOptions(prometheusInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定环境实例</p>
     * 
     * @param request GetPrometheusUserSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusUserSettingResponse
     */
    public GetPrometheusUserSettingResponse getPrometheusUserSettingWithOptions(GetPrometheusUserSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusUserSetting"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-user-setting"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusUserSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定环境实例</p>
     * 
     * @param request GetPrometheusUserSettingRequest
     * @return GetPrometheusUserSettingResponse
     */
    public GetPrometheusUserSettingResponse getPrometheusUserSetting(GetPrometheusUserSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPrometheusUserSettingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query a specified Prometheus view instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a specified Prometheus view instance</p>
     * 
     * @param request GetPrometheusViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrometheusViewResponse
     */
    public GetPrometheusViewResponse getPrometheusViewWithOptions(String prometheusViewId, GetPrometheusViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrometheusView"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-views/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusViewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrometheusViewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query a specified Prometheus view instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a specified Prometheus view instance</p>
     * 
     * @param request GetPrometheusViewRequest
     * @return GetPrometheusViewResponse
     */
    public GetPrometheusViewResponse getPrometheusView(String prometheusViewId, GetPrometheusViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPrometheusViewWithOptions(prometheusViewId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Service</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceResponse
     */
    public GetServiceResponse getServiceWithOptions(String workspace, String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/service/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Service</p>
     * @return GetServiceResponse
     */
    public GetServiceResponse getService(String workspace, String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(workspace, serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Application Observability Instance</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceObservabilityResponse
     */
    public GetServiceObservabilityResponse getServiceObservabilityWithOptions(String workspace, String type, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceObservability"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/service-observability/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceObservabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Application Observability Instance</p>
     * @return GetServiceObservabilityResponse
     */
    public GetServiceObservabilityResponse getServiceObservability(String workspace, String type) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceObservabilityWithOptions(workspace, type, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetThreadResponse
     */
    public GetThreadResponse getThreadWithOptions(String name, String threadId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThread"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话</p>
     * @return GetThreadResponse
     */
    public GetThreadResponse getThread(String name, String threadId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getThreadWithOptions(name, threadId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话数据</p>
     * 
     * @param request GetThreadDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetThreadDataResponse
     */
    public GetThreadDataResponse getThreadDataWithOptions(String name, String threadId, GetThreadDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThreadData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + "/data"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThreadDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话数据</p>
     * 
     * @param request GetThreadDataRequest
     * @return GetThreadDataResponse
     */
    public GetThreadDataResponse getThreadData(String name, String threadId, GetThreadDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getThreadDataWithOptions(name, threadId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Get Umodel configuration information</p>
     * 
     * <b>summary</b> : 
     * <p>Get Umodel configuration information</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUmodelResponse
     */
    public GetUmodelResponse getUmodelWithOptions(String workspace, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Get Umodel configuration information</p>
     * 
     * <b>summary</b> : 
     * <p>Get Umodel configuration information</p>
     * @return GetUmodelResponse
     */
    public GetUmodelResponse getUmodel(String workspace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUmodelWithOptions(workspace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Umodel配置信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUmodelCommonSchemaRefResponse
     */
    public GetUmodelCommonSchemaRefResponse getUmodelCommonSchemaRefWithOptions(String workspace, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUmodelCommonSchemaRef"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/common-schema-ref"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUmodelCommonSchemaRefResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Umodel配置信息</p>
     * @return GetUmodelCommonSchemaRefResponse
     */
    public GetUmodelCommonSchemaRefResponse getUmodelCommonSchemaRef(String workspace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUmodelCommonSchemaRefWithOptions(workspace, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Find Umodel</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve associated Umodel graph data</p>
     * 
     * @param request GetUmodelDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUmodelDataResponse
     */
    public GetUmodelDataResponse getUmodelDataWithOptions(String workspace, GetUmodelDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("method", request.method);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUmodelData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/graph"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUmodelDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Find Umodel</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve associated Umodel graph data</p>
     * 
     * @param request GetUmodelDataRequest
     * @return GetUmodelDataResponse
     */
    public GetUmodelDataResponse getUmodelData(String workspace, GetUmodelDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUmodelDataWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Workspace</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Workspace</p>
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the list of access configurations</p>
     * 
     * <b>summary</b> : 
     * <p>List of addon releases</p>
     * 
     * @param request ListAddonReleasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonReleasesResponse
     */
    public ListAddonReleasesResponse listAddonReleasesWithOptions(String policyId, ListAddonReleasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("addonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentAddonReleaseId)) {
            query.put("parentAddonReleaseId", request.parentAddonReleaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddonReleases"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/addon-releases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonReleasesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the list of access configurations</p>
     * 
     * <b>summary</b> : 
     * <p>List of addon releases</p>
     * 
     * @param request ListAddonReleasesRequest
     * @return ListAddonReleasesResponse
     */
    public ListAddonReleasesResponse listAddonReleases(String policyId, ListAddonReleasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAddonReleasesWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新版接入中心产品列表(分组)</p>
     * 
     * @param request ListAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddonsWithOptions(ListAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regexp)) {
            query.put("regexp", request.regexp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddons"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addons"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新版接入中心产品列表(分组)</p>
     * 
     * @param request ListAddonsRequest
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddons(ListAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAddonsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List Aggregation Task Groups</p>
     * 
     * @param tmpReq ListAggTaskGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggTaskGroupsResponse
     */
    public ListAggTaskGroupsResponse listAggTaskGroupsWithOptions(String instanceId, ListAggTaskGroupsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAggTaskGroupsShrinkRequest request = new ListAggTaskGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterAggTaskGroupIds)) {
            query.put("filterAggTaskGroupIds", request.filterAggTaskGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterAggTaskGroupNames)) {
            query.put("filterAggTaskGroupNames", request.filterAggTaskGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPrometheusId)) {
            query.put("targetPrometheusId", request.targetPrometheusId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggTaskGroups"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/agg-task-groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggTaskGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List Aggregation Task Groups</p>
     * 
     * @param request ListAggTaskGroupsRequest
     * @return ListAggTaskGroupsResponse
     */
    public ListAggTaskGroupsResponse listAggTaskGroups(String instanceId, ListAggTaskGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAggTaskGroupsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Alert Actions</p>
     * 
     * @param tmpReq ListAlertActionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertActionsResponse
     */
    public ListAlertActionsResponse listAlertActionsWithOptions(ListAlertActionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlertActionsShrinkRequest request = new ListAlertActionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertActionIds)) {
            request.alertActionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertActionIds, "alertActionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertActionIdsShrink)) {
            query.put("alertActionIds", request.alertActionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertActionName)) {
            query.put("alertActionName", request.alertActionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertActions"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alertActions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertActionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Alert Actions</p>
     * 
     * @param request ListAlertActionsRequest
     * @return ListAlertActionsResponse
     */
    public ListAlertActionsResponse listAlertActions(ListAlertActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertActionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>业务链路列表</p>
     * 
     * @param request ListBizTracesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBizTracesResponse
     */
    public ListBizTracesResponse listBizTracesWithOptions(ListBizTracesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBizTraces"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bizTraces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizTracesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>业务链路列表</p>
     * 
     * @param request ListBizTracesRequest
     * @return ListBizTracesResponse
     */
    public ListBizTracesResponse listBizTraces(ListBizTracesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBizTracesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源DigitalEmployee</p>
     * 
     * @param request ListDigitalEmployeesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDigitalEmployeesResponse
     */
    public ListDigitalEmployeesResponse listDigitalEmployeesWithOptions(ListDigitalEmployeesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.employeeType)) {
            query.put("employeeType", request.employeeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDigitalEmployees"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDigitalEmployeesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源DigitalEmployee</p>
     * 
     * @param request ListDigitalEmployeesRequest
     * @return ListDigitalEmployeesResponse
     */
    public ListDigitalEmployeesResponse listDigitalEmployees(ListDigitalEmployeesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDigitalEmployeesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query integration list</p>
     * 
     * <b>summary</b> : 
     * <p>Query Access Center Policy List Information</p>
     * 
     * @param tmpReq ListIntegrationPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPoliciesResponse
     */
    public ListIntegrationPoliciesResponse listIntegrationPoliciesWithOptions(ListIntegrationPoliciesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListIntegrationPoliciesShrinkRequest request = new ListIntegrationPoliciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("addonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindResourceId)) {
            query.put("bindResourceId", request.bindResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityGroupIds)) {
            query.put("entityGroupIds", request.entityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterRegionIds)) {
            query.put("filterRegionIds", request.filterRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("policyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("policyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceId)) {
            query.put("prometheusInstanceId", request.prometheusInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicies"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query integration list</p>
     * 
     * <b>summary</b> : 
     * <p>Query Access Center Policy List Information</p>
     * 
     * @param request ListIntegrationPoliciesRequest
     * @return ListIntegrationPoliciesResponse
     */
    public ListIntegrationPoliciesResponse listIntegrationPolicies(ListIntegrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPoliciesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略addon列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyAddonsResponse
     */
    public ListIntegrationPolicyAddonsResponse listIntegrationPolicyAddonsWithOptions(String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyAddons"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/addons"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略addon列表</p>
     * @return ListIntegrationPolicyAddonsResponse
     */
    public ListIntegrationPolicyAddonsResponse listIntegrationPolicyAddons(String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyAddonsWithOptions(policyId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取接入中心策略的存储要求信息</p>
     * 
     * @param request ListIntegrationPolicyCollectorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyCollectorsResponse
     */
    public ListIntegrationPolicyCollectorsResponse listIntegrationPolicyCollectorsWithOptions(String policyId, ListIntegrationPolicyCollectorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonReleaseName)) {
            query.put("addonReleaseName", request.addonReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectorType)) {
            query.put("collectorType", request.collectorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyCollectors"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/collectors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyCollectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取接入中心策略的存储要求信息</p>
     * 
     * @param request ListIntegrationPolicyCollectorsRequest
     * @return ListIntegrationPolicyCollectorsResponse
     */
    public ListIntegrationPolicyCollectorsResponse listIntegrationPolicyCollectors(String policyId, ListIntegrationPolicyCollectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyCollectorsWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get storage requirement information for the access center policy</p>
     * 
     * @param request ListIntegrationPolicyCustomScrapeJobRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyCustomScrapeJobRulesResponse
     */
    public ListIntegrationPolicyCustomScrapeJobRulesResponse listIntegrationPolicyCustomScrapeJobRulesWithOptions(String policyId, ListIntegrationPolicyCustomScrapeJobRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonReleaseName)) {
            query.put("addonReleaseName", request.addonReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptYaml)) {
            query.put("encryptYaml", request.encryptYaml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyCustomScrapeJobRules"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/custom-scrape-job-rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyCustomScrapeJobRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get storage requirement information for the access center policy</p>
     * 
     * @param request ListIntegrationPolicyCustomScrapeJobRulesRequest
     * @return ListIntegrationPolicyCustomScrapeJobRulesResponse
     */
    public ListIntegrationPolicyCustomScrapeJobRulesResponse listIntegrationPolicyCustomScrapeJobRules(String policyId, ListIntegrationPolicyCustomScrapeJobRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyCustomScrapeJobRulesWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This article provides an example of querying the alarm template list. The result shows that there are 2 alarm templates in the list, which are <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Policy Dashboard List</p>
     * 
     * @param request ListIntegrationPolicyDashboardsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyDashboardsResponse
     */
    public ListIntegrationPolicyDashboardsResponse listIntegrationPolicyDashboardsWithOptions(String policyId, ListIntegrationPolicyDashboardsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("addonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyDashboards"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/dashboards"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyDashboardsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This article provides an example of querying the alarm template list. The result shows that there are 2 alarm templates in the list, which are <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Policy Dashboard List</p>
     * 
     * @param request ListIntegrationPolicyDashboardsRequest
     * @return ListIntegrationPolicyDashboardsResponse
     */
    public ListIntegrationPolicyDashboardsResponse listIntegrationPolicyDashboards(String policyId, ListIntegrationPolicyDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyDashboardsWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This article provides an example to query the alarm template list. The result shows that there are 2 alarm templates in the alarm template list, which are <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Get PodMonitor Resources of Access Center Policy</p>
     * 
     * @param request ListIntegrationPolicyPodMonitorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyPodMonitorsResponse
     */
    public ListIntegrationPolicyPodMonitorsResponse listIntegrationPolicyPodMonitorsWithOptions(String policyId, ListIntegrationPolicyPodMonitorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonReleaseName)) {
            query.put("addonReleaseName", request.addonReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptYaml)) {
            query.put("encryptYaml", request.encryptYaml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyPodMonitors"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/pod-monitors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyPodMonitorsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This article provides an example to query the alarm template list. The result shows that there are 2 alarm templates in the alarm template list, which are <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Get PodMonitor Resources of Access Center Policy</p>
     * 
     * @param request ListIntegrationPolicyPodMonitorsRequest
     * @return ListIntegrationPolicyPodMonitorsResponse
     */
    public ListIntegrationPolicyPodMonitorsResponse listIntegrationPolicyPodMonitors(String policyId, ListIntegrationPolicyPodMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyPodMonitorsWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取接入中心策略的存储要求信息</p>
     * 
     * @param request ListIntegrationPolicyServiceMonitorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyServiceMonitorsResponse
     */
    public ListIntegrationPolicyServiceMonitorsResponse listIntegrationPolicyServiceMonitorsWithOptions(String policyId, ListIntegrationPolicyServiceMonitorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonReleaseName)) {
            query.put("addonReleaseName", request.addonReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptYaml)) {
            query.put("encryptYaml", request.encryptYaml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyServiceMonitors"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/service-monitors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyServiceMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取接入中心策略的存储要求信息</p>
     * 
     * @param request ListIntegrationPolicyServiceMonitorsRequest
     * @return ListIntegrationPolicyServiceMonitorsResponse
     */
    public ListIntegrationPolicyServiceMonitorsResponse listIntegrationPolicyServiceMonitors(String policyId, ListIntegrationPolicyServiceMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyServiceMonitorsWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During the effective period of the policy, all alarms within the application group will no longer send notifications.</p>
     * <p>This article provides an example of creating a pause alarm notification policy <code>PauseNotify</code> for the application group <code>7301****</code>. This application group will pause alarms from <code>1622949300000</code> to <code>1623208500000</code> (Beijing Time <code>2021-06-06 11:15:00</code> to <code>2021-06-09 11:15:00</code>).</p>
     * 
     * <b>summary</b> : 
     * <p>Get Storage Requirements Information for Access Center Policy</p>
     * 
     * @param request ListIntegrationPolicyStorageRequirementsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationPolicyStorageRequirementsResponse
     */
    public ListIntegrationPolicyStorageRequirementsResponse listIntegrationPolicyStorageRequirementsWithOptions(String policyId, ListIntegrationPolicyStorageRequirementsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("addonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addonReleaseName)) {
            query.put("addonReleaseName", request.addonReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("storageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationPolicyStorageRequirements"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/storage-requirements"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationPolicyStorageRequirementsResponse());
    }

    /**
     * <b>description</b> :
     * <p>During the effective period of the policy, all alarms within the application group will no longer send notifications.</p>
     * <p>This article provides an example of creating a pause alarm notification policy <code>PauseNotify</code> for the application group <code>7301****</code>. This application group will pause alarms from <code>1622949300000</code> to <code>1623208500000</code> (Beijing Time <code>2021-06-06 11:15:00</code> to <code>2021-06-09 11:15:00</code>).</p>
     * 
     * <b>summary</b> : 
     * <p>Get Storage Requirements Information for Access Center Policy</p>
     * 
     * @param request ListIntegrationPolicyStorageRequirementsRequest
     * @return ListIntegrationPolicyStorageRequirementsResponse
     */
    public ListIntegrationPolicyStorageRequirementsResponse listIntegrationPolicyStorageRequirements(String policyId, ListIntegrationPolicyStorageRequirementsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationPolicyStorageRequirementsWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Get the list of Prometheus instance dashboards.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Prometheus Instance Dashboard List</p>
     * 
     * @param request ListPrometheusDashboardsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusDashboardsResponse
     */
    public ListPrometheusDashboardsResponse listPrometheusDashboardsWithOptions(String prometheusInstanceId, ListPrometheusDashboardsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("aliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusDashboards"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusInstanceId) + "/dashboards"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusDashboardsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Get the list of Prometheus instance dashboards.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Prometheus Instance Dashboard List</p>
     * 
     * @param request ListPrometheusDashboardsRequest
     * @return ListPrometheusDashboardsResponse
     */
    public ListPrometheusDashboardsResponse listPrometheusDashboards(String prometheusInstanceId, ListPrometheusDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrometheusDashboardsWithOptions(prometheusInstanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Get the list of Prometheus instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of Prometheus instance information</p>
     * 
     * @param tmpReq ListPrometheusInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusInstancesResponse
     */
    public ListPrometheusInstancesResponse listPrometheusInstancesWithOptions(ListPrometheusInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPrometheusInstancesShrinkRequest request = new ListPrometheusInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterRegionIds)) {
            query.put("filterRegionIds", request.filterRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceIds)) {
            query.put("prometheusInstanceIds", request.prometheusInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceName)) {
            query.put("prometheusInstanceName", request.prometheusInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusInstances"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Get the list of Prometheus instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of Prometheus instance information</p>
     * 
     * @param request ListPrometheusInstancesRequest
     * @return ListPrometheusInstancesResponse
     */
    public ListPrometheusInstancesResponse listPrometheusInstances(ListPrometheusInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrometheusInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve a list of Prometheus view instance information.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a list of Prometheus view instance information</p>
     * 
     * @param tmpReq ListPrometheusViewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusViewsResponse
     */
    public ListPrometheusViewsResponse listPrometheusViewsWithOptions(ListPrometheusViewsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPrometheusViewsShrinkRequest request = new ListPrometheusViewsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterRegionIds)) {
            query.put("filterRegionIds", request.filterRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusViewIds)) {
            query.put("prometheusViewIds", request.prometheusViewIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusViewName)) {
            query.put("prometheusViewName", request.prometheusViewName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusViews"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-views"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusViewsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieve a list of Prometheus view instance information.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a list of Prometheus view instance information</p>
     * 
     * @param request ListPrometheusViewsRequest
     * @return ListPrometheusViewsResponse
     */
    public ListPrometheusViewsResponse listPrometheusViews(ListPrometheusViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrometheusViewsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Used for creating a site monitoring task</p>
     * 
     * <b>summary</b> : 
     * <p>Get Prometheus Virtual Instance</p>
     * 
     * @param request ListPrometheusVirtualInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrometheusVirtualInstancesResponse
     */
    public ListPrometheusVirtualInstancesResponse listPrometheusVirtualInstancesWithOptions(ListPrometheusVirtualInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrometheusVirtualInstances"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/virtual-instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrometheusVirtualInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Used for creating a site monitoring task</p>
     * 
     * <b>summary</b> : 
     * <p>Get Prometheus Virtual Instance</p>
     * 
     * @param request ListPrometheusVirtualInstancesRequest
     * @return ListPrometheusVirtualInstancesResponse
     */
    public ListPrometheusVirtualInstancesResponse listPrometheusVirtualInstances(ListPrometheusVirtualInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrometheusVirtualInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List Resource Services</p>
     * 
     * @param tmpReq ListServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
    public ListServicesResponse listServicesWithOptions(String workspace, ListServicesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListServicesShrinkRequest request = new ListServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List Resource Services</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(String workspace, ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查标签接口</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查标签接口</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出会话</p>
     * 
     * @param tmpReq ListThreadsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListThreadsResponse
     */
    public ListThreadsResponse listThreadsWithOptions(String name, ListThreadsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListThreadsShrinkRequest request = new ListThreadsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadId)) {
            query.put("threadId", request.threadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListThreads"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/threads"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListThreadsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出会话</p>
     * 
     * @param request ListThreadsRequest
     * @return ListThreadsResponse
     */
    public ListThreadsResponse listThreads(String name, ListThreadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listThreadsWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Workspace List</p>
     * 
     * @param tmpReq ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkspacesShrinkRequest request = new ListWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workspaceNameList)) {
            request.workspaceNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workspaceNameList, "workspaceNameList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("workspaceName", request.workspaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceNameListShrink)) {
            query.put("workspaceNameList", request.workspaceNameListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Workspace List</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Workspace</p>
     * 
     * @param request PutWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutWorkspaceResponse
     */
    public PutWorkspaceResponse putWorkspaceWithOptions(String workspaceName, PutWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            body.put("slsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutWorkspace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Workspace</p>
     * 
     * @param request PutWorkspaceRequest
     * @return PutWorkspaceResponse
     */
    public PutWorkspaceResponse putWorkspace(String workspaceName, PutWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putWorkspaceWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打标签接口</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打标签接口</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删标签接口</p>
     * 
     * @param tmpReq UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKey)) {
            request.tagKeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKey, "tagKey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyShrink)) {
            query.put("tagKey", request.tagKeyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删标签接口</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrade Access Component</p>
     * 
     * @param request UpdateAddonReleaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAddonReleaseResponse
     */
    public UpdateAddonReleaseResponse updateAddonReleaseWithOptions(String releaseName, String policyId, UpdateAddonReleaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonVersion)) {
            body.put("addonVersion", request.addonVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityRules)) {
            body.put("entityRules", request.entityRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.values)) {
            body.put("values", request.values);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAddonRelease"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + "/addon-releases/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAddonReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrade Access Component</p>
     * 
     * @param request UpdateAddonReleaseRequest
     * @return UpdateAddonReleaseResponse
     */
    public UpdateAddonReleaseResponse updateAddonRelease(String releaseName, String policyId, UpdateAddonReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAddonReleaseWithOptions(releaseName, policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Apply Aggregation Task Group</p>
     * 
     * @param request UpdateAggTaskGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAggTaskGroupResponse
     */
    public UpdateAggTaskGroupResponse updateAggTaskGroupWithOptions(String instanceId, String groupId, UpdateAggTaskGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggTaskGroupConfig)) {
            body.put("aggTaskGroupConfig", request.aggTaskGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggTaskGroupConfigType)) {
            body.put("aggTaskGroupConfigType", request.aggTaskGroupConfigType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggTaskGroupName)) {
            body.put("aggTaskGroupName", request.aggTaskGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpr)) {
            body.put("cronExpr", request.cronExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delay)) {
            body.put("delay", request.delay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            body.put("fromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRetries)) {
            body.put("maxRetries", request.maxRetries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRunTimeInSeconds)) {
            body.put("maxRunTimeInSeconds", request.maxRunTimeInSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.precheckString)) {
            body.put("precheckString", request.precheckString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMode)) {
            body.put("scheduleMode", request.scheduleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimeExpr)) {
            body.put("scheduleTimeExpr", request.scheduleTimeExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPrometheusId)) {
            body.put("targetPrometheusId", request.targetPrometheusId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            body.put("toTime", request.toTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggTaskGroup"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/agg-task-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggTaskGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Apply Aggregation Task Group</p>
     * 
     * @param request UpdateAggTaskGroupRequest
     * @return UpdateAggTaskGroupResponse
     */
    public UpdateAggTaskGroupResponse updateAggTaskGroup(String instanceId, String groupId, UpdateAggTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAggTaskGroupWithOptions(instanceId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Aggregation Task Group Status</p>
     * 
     * @param request UpdateAggTaskGroupStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAggTaskGroupStatusResponse
     */
    public UpdateAggTaskGroupStatusResponse updateAggTaskGroupStatusWithOptions(String instanceId, String groupId, UpdateAggTaskGroupStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggTaskGroupStatus"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/agg-task-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/status"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggTaskGroupStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Aggregation Task Group Status</p>
     * 
     * @param request UpdateAggTaskGroupStatusRequest
     * @return UpdateAggTaskGroupStatusResponse
     */
    public UpdateAggTaskGroupStatusResponse updateAggTaskGroupStatus(String instanceId, String groupId, UpdateAggTaskGroupStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAggTaskGroupStatusWithOptions(instanceId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改业务链路</p>
     * 
     * @param request UpdateBizTraceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBizTraceResponse
     */
    public UpdateBizTraceResponse updateBizTraceWithOptions(String bizTraceId, UpdateBizTraceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfig)) {
            body.put("advancedConfig", request.advancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTraceName)) {
            body.put("bizTraceName", request.bizTraceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            body.put("ruleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBizTrace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bizTrace/" + com.aliyun.openapiutil.Client.getEncodeParam(bizTraceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizTraceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改业务链路</p>
     * 
     * @param request UpdateBizTraceRequest
     * @return UpdateBizTraceResponse
     */
    public UpdateBizTraceResponse updateBizTrace(String bizTraceId, UpdateBizTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBizTraceWithOptions(bizTraceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateDigitalEmployee</p>
     * 
     * @param request UpdateDigitalEmployeeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDigitalEmployeeResponse
     */
    public UpdateDigitalEmployeeResponse updateDigitalEmployeeWithOptions(String name, UpdateDigitalEmployeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            body.put("defaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledges)) {
            body.put("knowledges", request.knowledges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("roleArn", request.roleArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDigitalEmployee"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateDigitalEmployee</p>
     * 
     * @param request UpdateDigitalEmployeeRequest
     * @return UpdateDigitalEmployeeResponse
     */
    public UpdateDigitalEmployeeResponse updateDigitalEmployee(String name, UpdateDigitalEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDigitalEmployeeWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the specified policy</p>
     * 
     * @param request UpdateIntegrationPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIntegrationPolicyResponse
     */
    public UpdateIntegrationPolicyResponse updateIntegrationPolicyWithOptions(String integrationPolicyId, UpdateIntegrationPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feePackage)) {
            body.put("feePackage", request.feePackage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("policyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIntegrationPolicy"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(integrationPolicyId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIntegrationPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the specified policy</p>
     * 
     * @param request UpdateIntegrationPolicyRequest
     * @return UpdateIntegrationPolicyResponse
     */
    public UpdateIntegrationPolicyResponse updateIntegrationPolicy(String integrationPolicyId, UpdateIntegrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIntegrationPolicyWithOptions(integrationPolicyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新通知策略</p>
     * 
     * @param request UpdateNotifyStrategyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNotifyStrategyResponse
     */
    public UpdateNotifyStrategyResponse updateNotifyStrategyWithOptions(String notifyStrategyId, UpdateNotifyStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNotifyStrategy"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notifyStrategies/" + com.aliyun.openapiutil.Client.getEncodeParam(notifyStrategyId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNotifyStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新通知策略</p>
     * 
     * @param request UpdateNotifyStrategyRequest
     * @return UpdateNotifyStrategyResponse
     */
    public UpdateNotifyStrategyResponse updateNotifyStrategy(String notifyStrategyId, UpdateNotifyStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNotifyStrategyWithOptions(notifyStrategyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Update Prometheus instance information.</p>
     * 
     * <b>summary</b> : 
     * <p>Update Prometheus instance information</p>
     * 
     * @param request UpdatePrometheusInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusInstanceResponse
     */
    public UpdatePrometheusInstanceResponse updatePrometheusInstanceWithOptions(String prometheusInstanceId, UpdatePrometheusInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.archiveDuration)) {
            body.put("archiveDuration", request.archiveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFreeReadPolicy)) {
            body.put("authFreeReadPolicy", request.authFreeReadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFreeWritePolicy)) {
            body.put("authFreeWritePolicy", request.authFreeWritePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeRead)) {
            body.put("enableAuthFreeRead", request.enableAuthFreeRead);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeWrite)) {
            body.put("enableAuthFreeWrite", request.enableAuthFreeWrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthToken)) {
            body.put("enableAuthToken", request.enableAuthToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceName)) {
            body.put("prometheusInstanceName", request.prometheusInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageDuration)) {
            body.put("storageDuration", request.storageDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusInstance"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusInstanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Update Prometheus instance information.</p>
     * 
     * <b>summary</b> : 
     * <p>Update Prometheus instance information</p>
     * 
     * @param request UpdatePrometheusInstanceRequest
     * @return UpdatePrometheusInstanceResponse
     */
    public UpdatePrometheusInstanceResponse updatePrometheusInstance(String prometheusInstanceId, UpdatePrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrometheusInstanceWithOptions(prometheusInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Prom实例信息</p>
     * 
     * @param request UpdatePrometheusUserSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusUserSettingResponse
     */
    public UpdatePrometheusUserSettingResponse updatePrometheusUserSettingWithOptions(String settingKey, UpdatePrometheusUserSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.settingValue)) {
            query.put("settingValue", request.settingValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusUserSetting"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-user-setting/" + com.aliyun.openapiutil.Client.getEncodeParam(settingKey) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusUserSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Prom实例信息</p>
     * 
     * @param request UpdatePrometheusUserSettingRequest
     * @return UpdatePrometheusUserSettingResponse
     */
    public UpdatePrometheusUserSettingResponse updatePrometheusUserSetting(String settingKey, UpdatePrometheusUserSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrometheusUserSettingWithOptions(settingKey, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Update Prometheus view instance information.</p>
     * 
     * <b>summary</b> : 
     * <p>Update Prometheus view instance information</p>
     * 
     * @param request UpdatePrometheusViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrometheusViewResponse
     */
    public UpdatePrometheusViewResponse updatePrometheusViewWithOptions(String prometheusViewId, UpdatePrometheusViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authFreeReadPolicy)) {
            body.put("authFreeReadPolicy", request.authFreeReadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeRead)) {
            body.put("enableAuthFreeRead", request.enableAuthFreeRead);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthToken)) {
            body.put("enableAuthToken", request.enableAuthToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstances)) {
            body.put("prometheusInstances", request.prometheusInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusViewName)) {
            body.put("prometheusViewName", request.prometheusViewName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrometheusView"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-views/" + com.aliyun.openapiutil.Client.getEncodeParam(prometheusViewId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrometheusViewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Update Prometheus view instance information.</p>
     * 
     * <b>summary</b> : 
     * <p>Update Prometheus view instance information</p>
     * 
     * @param request UpdatePrometheusViewRequest
     * @return UpdatePrometheusViewResponse
     */
    public UpdatePrometheusViewResponse updatePrometheusView(String prometheusViewId, UpdatePrometheusViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrometheusViewWithOptions(prometheusViewId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Service</p>
     * 
     * @param request UpdateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateServiceWithOptions(String workspace, String serviceId, UpdateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            body.put("serviceStatus", request.serviceStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/service/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Service</p>
     * 
     * @param request UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(String workspace, String serviceId, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(workspace, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新订阅</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscriptionWithOptions(String subscriptionId, UpdateSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            query.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscription"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/subscriptions/" + com.aliyun.openapiutil.Client.getEncodeParam(subscriptionId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新订阅</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(String subscriptionId, UpdateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSubscriptionWithOptions(subscriptionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话</p>
     * 
     * @param request UpdateThreadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateThreadResponse
     */
    public UpdateThreadResponse updateThreadWithOptions(String name, String threadId, UpdateThreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateThread"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话</p>
     * 
     * @param request UpdateThreadRequest
     * @return UpdateThreadResponse
     */
    public UpdateThreadResponse updateThread(String name, String threadId, UpdateThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThreadWithOptions(name, threadId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Update Umodel configuration information</p>
     * 
     * <b>summary</b> : 
     * <p>Update Umodel configuration information</p>
     * 
     * @param request UpdateUmodelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUmodelResponse
     */
    public UpdateUmodelResponse updateUmodelWithOptions(String workspace, UpdateUmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Update Umodel configuration information</p>
     * 
     * <b>summary</b> : 
     * <p>Update Umodel configuration information</p>
     * 
     * @param request UpdateUmodelRequest
     * @return UpdateUmodelResponse
     */
    public UpdateUmodelResponse updateUmodel(String workspace, UpdateUmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUmodelWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Umodel配置信息</p>
     * 
     * @param request UpsertUmodelCommonSchemaRefRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertUmodelCommonSchemaRefResponse
     */
    public UpsertUmodelCommonSchemaRefResponse upsertUmodelCommonSchemaRefWithOptions(String workspace, UpsertUmodelCommonSchemaRefRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertUmodelCommonSchemaRef"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/common-schema-ref"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertUmodelCommonSchemaRefResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Umodel配置信息</p>
     * 
     * @param request UpsertUmodelCommonSchemaRefRequest
     * @return UpsertUmodelCommonSchemaRefResponse
     */
    public UpsertUmodelCommonSchemaRefResponse upsertUmodelCommonSchemaRef(String workspace, UpsertUmodelCommonSchemaRefRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upsertUmodelCommonSchemaRefWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Write Umodel Elements</p>
     * 
     * @param request UpsertUmodelDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertUmodelDataResponse
     */
    public UpsertUmodelDataResponse upsertUmodelDataWithOptions(String workspace, UpsertUmodelDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("method", request.method);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elements)) {
            body.put("elements", request.elements);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertUmodelData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/data"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertUmodelDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Write Umodel Elements</p>
     * 
     * @param request UpsertUmodelDataRequest
     * @return UpsertUmodelDataResponse
     */
    public UpsertUmodelDataResponse upsertUmodelData(String workspace, UpsertUmodelDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upsertUmodelDataWithOptions(workspace, request, headers, runtime);
    }
}
