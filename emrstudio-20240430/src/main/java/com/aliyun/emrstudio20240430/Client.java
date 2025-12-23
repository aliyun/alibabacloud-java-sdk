// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430;

import com.aliyun.tea.*;
import com.aliyun.emrstudio20240430.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("emrstudio", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建工作流</p>
     * 
     * @param request CreateWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflowWithOptions(String projectId, CreateWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertGroupId)) {
            query.put("alertGroupId", request.alertGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertStrategy)) {
            query.put("alertStrategy", request.alertStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpr)) {
            query.put("cronExpr", request.cronExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionType)) {
            query.put("executionType", request.executionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failureStrategy)) {
            query.put("failureStrategy", request.failureStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            query.put("parentDirectoryId", request.parentDirectoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleEndTime)) {
            query.put("scheduleEndTime", request.scheduleEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleStartTime)) {
            query.put("scheduleStartTime", request.scheduleStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleState)) {
            query.put("scheduleState", request.scheduleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDefinitionJson)) {
            query.put("taskDefinitionJson", request.taskDefinitionJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRelationJson)) {
            query.put("taskRelationJson", request.taskRelationJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("timeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstancePriority)) {
            query.put("workflowInstancePriority", request.workflowInstancePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowParams)) {
            query.put("workflowParams", request.workflowParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskDefinitionJsonValue)) {
            body.put("taskDefinitionJsonValue", request.taskDefinitionJsonValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRelationJsonValue)) {
            body.put("taskRelationJsonValue", request.taskRelationJsonValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkflow"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作流</p>
     * 
     * @param request CreateWorkflowRequest
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(String projectId, CreateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkflowWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作流</p>
     * 
     * @param request DeleteWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflowWithOptions(String projectId, String workflowId, DeleteWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflow"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作流</p>
     * 
     * @param request DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(String projectId, String workflowId, DeleteWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkflowWithOptions(projectId, workflowId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取id关联信息</p>
     * 
     * @param request DescribeIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIdResponse
     */
    public DescribeIdResponse describeIdWithOptions(DescribeIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeId"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/relatedIds"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取id关联信息</p>
     * 
     * @param request DescribeIdRequest
     * @return DescribeIdResponse
     */
    public DescribeIdResponse describeId(DescribeIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取手动任务定义</p>
     * 
     * @param request DescribeManualTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeManualTaskResponse
     */
    public DescribeManualTaskResponse describeManualTaskWithOptions(String projectId, String manualTaskId, DescribeManualTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeManualTask"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/manualTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(manualTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeManualTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取手动任务定义</p>
     * 
     * @param request DescribeManualTaskRequest
     * @return DescribeManualTaskResponse
     */
    public DescribeManualTaskResponse describeManualTask(String projectId, String manualTaskId, DescribeManualTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeManualTaskWithOptions(projectId, manualTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取手动任务实例</p>
     * 
     * @param request DescribeManualTaskInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeManualTaskInstanceResponse
     */
    public DescribeManualTaskInstanceResponse describeManualTaskInstanceWithOptions(String manualTaskInstanceId, String projectId, DescribeManualTaskInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeManualTaskInstance"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/manualTaskInstances/" + com.aliyun.openapiutil.Client.getEncodeParam(manualTaskInstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeManualTaskInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取手动任务实例</p>
     * 
     * @param request DescribeManualTaskInstanceRequest
     * @return DescribeManualTaskInstanceResponse
     */
    public DescribeManualTaskInstanceResponse describeManualTaskInstance(String manualTaskInstanceId, String projectId, DescribeManualTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeManualTaskInstanceWithOptions(manualTaskInstanceId, projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目详情</p>
     * 
     * @param request DescribeProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectResponse
     */
    public DescribeProjectResponse describeProjectWithOptions(String projectId, DescribeProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProject"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目详情</p>
     * 
     * @param request DescribeProjectRequest
     * @return DescribeProjectResponse
     */
    public DescribeProjectResponse describeProject(String projectId, DescribeProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeProjectWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务定义</p>
     * 
     * @param request DescribeTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTaskWithOptions(String workflowId, String projectId, String taskId, DescribeTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTask"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务定义</p>
     * 
     * @param request DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTask(String workflowId, String projectId, String taskId, DescribeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskWithOptions(workflowId, projectId, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务实例</p>
     * 
     * @param request DescribeTaskInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskInstanceResponse
     */
    public DescribeTaskInstanceResponse describeTaskInstanceWithOptions(String projectId, String workflowInstanceId, String taskInstanceId, DescribeTaskInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskInstance"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowInstanceId) + "/taskInstances/" + com.aliyun.openapiutil.Client.getEncodeParam(taskInstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务实例</p>
     * 
     * @param request DescribeTaskInstanceRequest
     * @return DescribeTaskInstanceResponse
     */
    public DescribeTaskInstanceResponse describeTaskInstance(String projectId, String workflowInstanceId, String taskInstanceId, DescribeTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskInstanceWithOptions(projectId, workflowInstanceId, taskInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流详情</p>
     * 
     * @param request DescribeWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWorkflowResponse
     */
    public DescribeWorkflowResponse describeWorkflowWithOptions(String projectId, String workflowId, DescribeWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWorkflow"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流详情</p>
     * 
     * @param request DescribeWorkflowRequest
     * @return DescribeWorkflowResponse
     */
    public DescribeWorkflowResponse describeWorkflow(String projectId, String workflowId, DescribeWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWorkflowWithOptions(projectId, workflowId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流实例详情</p>
     * 
     * @param request DescribeWorkflowInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWorkflowInstanceResponse
     */
    public DescribeWorkflowInstanceResponse describeWorkflowInstanceWithOptions(String projectId, String workflowInstanceId, DescribeWorkflowInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWorkflowInstance"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflowInstances/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowInstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWorkflowInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流实例详情</p>
     * 
     * @param request DescribeWorkflowInstanceRequest
     * @return DescribeWorkflowInstanceResponse
     */
    public DescribeWorkflowInstanceResponse describeWorkflowInstance(String projectId, String workflowInstanceId, DescribeWorkflowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWorkflowInstanceWithOptions(projectId, workflowInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的日志</p>
     * 
     * @param request GetInstanceLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceLogResponse
     */
    public GetInstanceLogResponse getInstanceLogWithOptions(String projectId, String instanceId, GetInstanceLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipLineNum)) {
            query.put("skipLineNum", request.skipLineNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceLog"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的日志</p>
     * 
     * @param request GetInstanceLogRequest
     * @return GetInstanceLogResponse
     */
    public GetInstanceLogResponse getInstanceLog(String projectId, String instanceId, GetInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceLogWithOptions(projectId, instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询告警组列表</p>
     * 
     * @param request ListAlertGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertGroupsResponse
     */
    public ListAlertGroupsResponse listAlertGroupsWithOptions(String projectId, ListAlertGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertGroups"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/alert-groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询告警组列表</p>
     * 
     * @param request ListAlertGroupsRequest
     * @return ListAlertGroupsResponse
     */
    public ListAlertGroupsResponse listAlertGroups(String projectId, ListAlertGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertGroupsWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取手动任务实例列表</p>
     * 
     * @param request ListManualTaskInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManualTaskInstancesResponse
     */
    public ListManualTaskInstancesResponse listManualTaskInstancesWithOptions(String projectId, ListManualTaskInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManualTaskInstances"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/manualTaskInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManualTaskInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取手动任务实例列表</p>
     * 
     * @param request ListManualTaskInstancesRequest
     * @return ListManualTaskInstancesResponse
     */
    public ListManualTaskInstancesResponse listManualTaskInstances(String projectId, ListManualTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listManualTaskInstancesWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询手动任务定义列表</p>
     * 
     * @param request ListManualTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManualTasksResponse
     */
    public ListManualTasksResponse listManualTasksWithOptions(String projectId, ListManualTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManualTasks"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/manualTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManualTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询手动任务定义列表</p>
     * 
     * @param request ListManualTasksRequest
     * @return ListManualTasksResponse
     */
    public ListManualTasksResponse listManualTasks(String projectId, ListManualTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listManualTasksWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目详情</p>
     * 
     * @param request ListProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目详情</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询调度资源组列表</p>
     * 
     * @param request ListResourceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("resourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupType)) {
            query.put("resourceGroupType", request.resourceGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/resourcegroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询调度资源组列表</p>
     * 
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务实例列表</p>
     * 
     * @param request ListTaskInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskInstancesResponse
     */
    public ListTaskInstancesResponse listTaskInstancesWithOptions(String projectId, ListTaskInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            query.put("workflowInstanceId", request.workflowInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskInstances"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/taskInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务实例列表</p>
     * 
     * @param request ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    public ListTaskInstancesResponse listTaskInstances(String projectId, ListTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTaskInstancesWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务定义列表</p>
     * 
     * @param request ListTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(String projectId, ListTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("workflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务定义列表</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(String projectId, ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作流目录列表</p>
     * 
     * @param request ListWorkflowDirectoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowDirectoriesResponse
     */
    public ListWorkflowDirectoriesResponse listWorkflowDirectoriesWithOptions(String projectId, ListWorkflowDirectoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            query.put("parentDirectoryId", request.parentDirectoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowDirectories"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/directories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowDirectoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作流目录列表</p>
     * 
     * @param request ListWorkflowDirectoriesRequest
     * @return ListWorkflowDirectoriesResponse
     */
    public ListWorkflowDirectoriesResponse listWorkflowDirectories(String projectId, ListWorkflowDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkflowDirectoriesWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流实例列表</p>
     * 
     * @param request ListWorkflowInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowInstancesResponse
     */
    public ListWorkflowInstancesResponse listWorkflowInstancesWithOptions(String projectId, ListWorkflowInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("workflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowInstances"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflowInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流实例列表</p>
     * 
     * @param request ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    public ListWorkflowInstancesResponse listWorkflowInstances(String projectId, ListWorkflowInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkflowInstancesWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流列表</p>
     * 
     * @param request ListWorkflowsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflowsWithOptions(String projectId, ListWorkflowsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchVal)) {
            query.put("searchVal", request.searchVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflows"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流列表</p>
     * 
     * @param request ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(String projectId, ListWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkflowsWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>操作工作流实例</p>
     * 
     * @param request OperateWorkflowInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateWorkflowInstanceResponse
     */
    public OperateWorkflowInstanceResponse operateWorkflowInstanceWithOptions(String projectId, OperateWorkflowInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.execType)) {
            body.put("execType", request.execType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            body.put("workflowInstanceId", request.workflowInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateWorkflowInstance"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/executors/execute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateWorkflowInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>操作工作流实例</p>
     * 
     * @param request OperateWorkflowInstanceRequest
     * @return OperateWorkflowInstanceResponse
     */
    public OperateWorkflowInstanceResponse operateWorkflowInstance(String projectId, OperateWorkflowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateWorkflowInstanceWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行工作流</p>
     * 
     * @param request RunWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunWorkflowResponse
     */
    public RunWorkflowResponse runWorkflowWithOptions(String projectId, RunWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertGroupId)) {
            query.put("alertGroupId", request.alertGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertStrategy)) {
            query.put("alertStrategy", request.alertStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complementDependentMode)) {
            query.put("complementDependentMode", request.complementDependentMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execType)) {
            query.put("execType", request.execType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedParallelismNumber)) {
            query.put("expectedParallelismNumber", request.expectedParallelismNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failureStrategy)) {
            query.put("failureStrategy", request.failureStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            query.put("runMode", request.runMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("scheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startParams)) {
            query.put("startParams", request.startParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("workflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstancePriority)) {
            query.put("workflowInstancePriority", request.workflowInstancePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunWorkflow"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/executors/run-workflow"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运行工作流</p>
     * 
     * @param request RunWorkflowRequest
     * @return RunWorkflowResponse
     */
    public RunWorkflowResponse runWorkflow(String projectId, RunWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runWorkflowWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作流</p>
     * 
     * @param request UpdateWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflowWithOptions(String projectId, String workflowId, UpdateWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertGroupId)) {
            query.put("alertGroupId", request.alertGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertStrategy)) {
            query.put("alertStrategy", request.alertStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpr)) {
            query.put("cronExpr", request.cronExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionType)) {
            query.put("executionType", request.executionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failureStrategy)) {
            query.put("failureStrategy", request.failureStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            query.put("parentDirectoryId", request.parentDirectoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleEndTime)) {
            query.put("scheduleEndTime", request.scheduleEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleStartTime)) {
            query.put("scheduleStartTime", request.scheduleStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleState)) {
            query.put("scheduleState", request.scheduleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDefinitionJson)) {
            query.put("taskDefinitionJson", request.taskDefinitionJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRelationJson)) {
            query.put("taskRelationJson", request.taskRelationJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("timeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstancePriority)) {
            query.put("workflowInstancePriority", request.workflowInstancePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowParams)) {
            query.put("workflowParams", request.workflowParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskDefinitionJsonValue)) {
            body.put("taskDefinitionJsonValue", request.taskDefinitionJsonValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRelationJsonValue)) {
            body.put("taskRelationJsonValue", request.taskRelationJsonValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflow"),
            new TeaPair("version", "2024-04-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/workflows/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作流</p>
     * 
     * @param request UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(String projectId, String workflowId, UpdateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkflowWithOptions(projectId, workflowId, request, headers, runtime);
    }
}
