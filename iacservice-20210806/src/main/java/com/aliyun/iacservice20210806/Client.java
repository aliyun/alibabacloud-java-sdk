// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806;

import com.aliyun.tea.*;
import com.aliyun.iacservice20210806.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iacservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>新增共享账号信息</p>
     * 
     * @param request AddSharedAccountsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSharedAccountsResponse
     */
    public AddSharedAccountsResponse addSharedAccountsWithOptions(AddSharedAccountsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            body.put("accountIds", request.accountIds);
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
            new TeaPair("action", "AddSharedAccounts"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sharedAccounts"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSharedAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增共享账号信息</p>
     * 
     * @param request AddSharedAccountsRequest
     * @return AddSharedAccountsResponse
     */
    public AddSharedAccountsResponse addSharedAccounts(AddSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSharedAccountsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分组关联</p>
     * 
     * @param request AssociateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateGroupResponse
     */
    public AssociateGroupResponse associateGroupWithOptions(String groupId, AssociateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/associate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分组关联</p>
     * 
     * @param request AssociateGroupRequest
     * @return AssociateGroupResponse
     */
    public AssociateGroupResponse associateGroup(String groupId, AssociateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.associateGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消资源导出任务</p>
     * 
     * @param request CancelResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelResourceExportTaskResponse
     */
    public CancelResourceExportTaskResponse cancelResourceExportTaskWithOptions(String exportTaskId, CancelResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/cancel/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelResourceExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消资源导出任务</p>
     * 
     * @param request CancelResourceExportTaskRequest
     * @return CancelResourceExportTaskResponse
     */
    public CancelResourceExportTaskResponse cancelResourceExportTask(String exportTaskId, CancelResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建分组</p>
     * 
     * @param request CreateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTrigger)) {
            body.put("autoTrigger", request.autoTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forcedSetting)) {
            body.put("forcedSetting", request.forcedSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            body.put("notifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyOperationTypes)) {
            body.put("notifyOperationTypes", request.notifyOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportField)) {
            body.put("reportExportField", request.reportExportField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportPath)) {
            body.put("reportExportPath", request.reportExportPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            body.put("triggerConfig", request.triggerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerResourceType)) {
            body.put("triggerResourceType", request.triggerResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建分组</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建作业</p>
     * 
     * @param request CreateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(String taskId, CreateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCommand)) {
            body.put("subCommand", request.subCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建作业</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(String taskId, CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模板</p>
     * 
     * @param request CreateModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModuleResponse
     */
    public CreateModuleResponse createModuleWithOptions(CreateModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statePath)) {
            body.put("statePath", request.statePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStrategy)) {
            body.put("versionStrategy", request.versionStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模板</p>
     * 
     * @param request CreateModuleRequest
     * @return CreateModuleResponse
     */
    public CreateModuleResponse createModule(CreateModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模板版本</p>
     * 
     * @param request CreateModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModuleVersionResponse
     */
    public CreateModuleVersionResponse createModuleVersionWithOptions(String moduleId, CreateModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模板版本</p>
     * 
     * @param request CreateModuleVersionRequest
     * @return CreateModuleVersionResponse
     */
    public CreateModuleVersionResponse createModuleVersion(String moduleId, CreateModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModuleVersionWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建RegistryModule</p>
     * 
     * @param request CreateRegistryModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRegistryModuleResponse
     */
    public CreateRegistryModuleResponse createRegistryModuleWithOptions(CreateRegistryModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            body.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRegistryModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建RegistryModule</p>
     * 
     * @param request CreateRegistryModuleRequest
     * @return CreateRegistryModuleResponse
     */
    public CreateRegistryModuleResponse createRegistryModule(CreateRegistryModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRegistryModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param request CreateRegistryNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRegistryNamespaceResponse
     */
    public CreateRegistryNamespaceResponse createRegistryNamespaceWithOptions(CreateRegistryNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainer)) {
            body.put("maintainer", request.maintainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("namespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRegistryNamespace"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRegistryNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param request CreateRegistryNamespaceRequest
     * @return CreateRegistryNamespaceResponse
     */
    public CreateRegistryNamespaceResponse createRegistryNamespace(CreateRegistryNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRegistryNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建导出任务</p>
     * 
     * @param request CreateResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceExportTaskResponse
     */
    public CreateResourceExportTaskResponse createResourceExportTaskWithOptions(CreateResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportToModule)) {
            body.put("exportToModule", request.exportToModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRules)) {
            body.put("includeRules", request.includeRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建导出任务</p>
     * 
     * @param request CreateResourceExportTaskRequest
     * @return CreateResourceExportTaskResponse
     */
    public CreateResourceExportTaskResponse createResourceExportTask(CreateResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceExportTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoApply)) {
            body.put("autoApply", request.autoApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initModuleState)) {
            body.put("initModuleState", request.initModuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            body.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            body.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionStrategy)) {
            body.put("protectionStrategy", request.protectionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPropertyValidation)) {
            body.put("skipPropertyValidation", request.skipPropertyValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskBackend)) {
            body.put("taskBackend", request.taskBackend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除分组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除分组</p>
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupWithOptions(groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模板</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModuleWithOptions(String moduleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模板</p>
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModule(String moduleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModuleWithOptions(moduleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String projectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String projectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(projectId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除RegistryModule</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistryModuleResponse
     */
    public DeleteRegistryModuleResponse deleteRegistryModuleWithOptions(String namespaceName, String moduleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistryModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除RegistryModule</p>
     * @return DeleteRegistryModuleResponse
     */
    public DeleteRegistryModuleResponse deleteRegistryModule(String namespaceName, String moduleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryModuleWithOptions(namespaceName, moduleName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除RegistryModule版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistryModuleVersionResponse
     */
    public DeleteRegistryModuleVersionResponse deleteRegistryModuleVersionWithOptions(String namespaceName, String moduleName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistryModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistryModuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除RegistryModule版本</p>
     * @return DeleteRegistryModuleVersionResponse
     */
    public DeleteRegistryModuleVersionResponse deleteRegistryModuleVersion(String namespaceName, String moduleName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryModuleVersionWithOptions(namespaceName, moduleName, version, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistryNamespaceResponse
     */
    public DeleteRegistryNamespaceResponse deleteRegistryNamespaceWithOptions(String namespaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistryNamespace"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistryNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * @return DeleteRegistryNamespaceResponse
     */
    public DeleteRegistryNamespaceResponse deleteRegistryNamespace(String namespaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryNamespaceWithOptions(namespaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源导出任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceExportTaskResponse
     */
    public DeleteResourceExportTaskResponse deleteResourceExportTaskWithOptions(String exportTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源导出任务</p>
     * @return DeleteResourceExportTaskResponse
     */
    public DeleteResourceExportTaskResponse deleteResourceExportTask(String exportTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceExportTaskWithOptions(exportTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务</p>
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消关联分组</p>
     * 
     * @param request DissociateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateGroupResponse
     */
    public DissociateGroupResponse dissociateGroupWithOptions(String projectId, String groupId, DissociateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/dissociate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消关联分组</p>
     * 
     * @param request DissociateGroupRequest
     * @return DissociateGroupResponse
     */
    public DissociateGroupResponse dissociateGroup(String projectId, String groupId, DissociateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dissociateGroupWithOptions(projectId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行RegistryModule</p>
     * 
     * @param request ExecuteRegistryModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteRegistryModuleResponse
     */
    public ExecuteRegistryModuleResponse executeRegistryModuleWithOptions(String namespaceName, String moduleName, ExecuteRegistryModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + "/execution"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteRegistryModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行RegistryModule</p>
     * 
     * @param request ExecuteRegistryModuleRequest
     * @return ExecuteRegistryModuleResponse
     */
    public ExecuteRegistryModuleResponse executeRegistryModule(String namespaceName, String moduleName, ExecuteRegistryModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeRegistryModuleWithOptions(namespaceName, moduleName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行资源导出任务</p>
     * 
     * @param request ExecuteResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteResourceExportTaskResponse
     */
    public ExecuteResourceExportTaskResponse executeResourceExportTaskWithOptions(String exportTaskId, ExecuteResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/execute/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteResourceExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行资源导出任务</p>
     * 
     * @param request ExecuteResourceExportTaskRequest
     * @return ExecuteResourceExportTaskResponse
     */
    public ExecuteResourceExportTaskResponse executeResourceExportTask(String exportTaskId, ExecuteResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行TerraformApply</p>
     * 
     * @param request ExecuteTerraformApplyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTerraformApplyResponse
     */
    public ExecuteTerraformApplyResponse executeTerraformApplyWithOptions(ExecuteTerraformApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateId)) {
            body.put("stateId", request.stateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTerraformApply"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTerraformApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行TerraformApply</p>
     * 
     * @param request ExecuteTerraformApplyRequest
     * @return ExecuteTerraformApplyResponse
     */
    public ExecuteTerraformApplyResponse executeTerraformApply(ExecuteTerraformApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTerraformApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行TerraformDestroy</p>
     * 
     * @param request ExecuteTerraformDestroyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTerraformDestroyResponse
     */
    public ExecuteTerraformDestroyResponse executeTerraformDestroyWithOptions(ExecuteTerraformDestroyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateId)) {
            body.put("stateId", request.stateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTerraformDestroy"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/destroy"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTerraformDestroyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行TerraformDestroy</p>
     * 
     * @param request ExecuteTerraformDestroyRequest
     * @return ExecuteTerraformDestroyResponse
     */
    public ExecuteTerraformDestroyResponse executeTerraformDestroy(ExecuteTerraformDestroyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTerraformDestroyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行TerraformPlan</p>
     * 
     * @param request ExecuteTerraformPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTerraformPlanResponse
     */
    public ExecuteTerraformPlanResponse executeTerraformPlanWithOptions(ExecuteTerraformPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateId)) {
            body.put("stateId", request.stateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTerraformPlan"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/plan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTerraformPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行TerraformPlan</p>
     * 
     * @param request ExecuteTerraformPlanRequest
     * @return ExecuteTerraformPlanResponse
     */
    public ExecuteTerraformPlanResponse executeTerraformPlan(ExecuteTerraformPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTerraformPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成模板</p>
     * 
     * @param request GenerateModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateModuleResponse
     */
    public GenerateModuleResponse generateModuleWithOptions(GenerateModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generateSource)) {
            body.put("generateSource", request.generateSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syntax)) {
            body.put("syntax", request.syntax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformResourceType)) {
            body.put("terraformResourceType", request.terraformResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorer/generate/module"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GenerateModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成模板</p>
     * 
     * @param request GenerateModuleRequest
     * @return GenerateModuleResponse
     */
    public GenerateModuleResponse generateModule(GenerateModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Terraform运行结果</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecuteStateResponse
     */
    public GetExecuteStateResponse getExecuteStateWithOptions(String stateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecuteState"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/execution/" + com.aliyun.openapiutil.Client.getEncodeParam(stateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecuteStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Terraform运行结果</p>
     * @return GetExecuteStateResponse
     */
    public GetExecuteStateResponse getExecuteState(String stateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExecuteStateWithOptions(stateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组</p>
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupWithOptions(groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>作业详情</p>
     * 
     * @param request GetJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String taskId, String jobId, GetJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>作业详情</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String taskId, String jobId, GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(taskId, jobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模板详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModuleResponse
     */
    public GetModuleResponse getModuleWithOptions(String moduleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模板详情</p>
     * @return GetModuleResponse
     */
    public GetModuleResponse getModule(String moduleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModuleWithOptions(moduleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模板版本详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModuleVersionResponse
     */
    public GetModuleVersionResponse getModuleVersionWithOptions(String moduleId, String moduleVersion, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模板版本详情</p>
     * @return GetModuleVersionResponse
     */
    public GetModuleVersionResponse getModuleVersion(String moduleId, String moduleVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModuleVersionWithOptions(moduleId, moduleVersion, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String projectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目</p>
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String projectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(projectId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistryModuleResponse
     */
    public GetRegistryModuleResponse getRegistryModuleWithOptions(String namespaceName, String moduleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistryModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistryModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule信息</p>
     * @return GetRegistryModuleResponse
     */
    public GetRegistryModuleResponse getRegistryModule(String namespaceName, String moduleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryModuleWithOptions(namespaceName, moduleName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule版本信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistryModuleVersionResponse
     */
    public GetRegistryModuleVersionResponse getRegistryModuleVersionWithOptions(String namespaceName, String moduleName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistryModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistryModuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule版本信息</p>
     * @return GetRegistryModuleVersionResponse
     */
    public GetRegistryModuleVersionResponse getRegistryModuleVersion(String namespaceName, String moduleName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryModuleVersionWithOptions(namespaceName, moduleName, version, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistryNamespaceResponse
     */
    public GetRegistryNamespaceResponse getRegistryNamespaceWithOptions(String namespaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistryNamespace"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistryNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间信息</p>
     * @return GetRegistryNamespaceResponse
     */
    public GetRegistryNamespaceResponse getRegistryNamespace(String namespaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegistryNamespaceWithOptions(namespaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出任务详情</p>
     * 
     * @param request GetResourceExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceExportTaskResponse
     */
    public GetResourceExportTaskResponse getResourceExportTaskWithOptions(String exportTaskId, GetResourceExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportVersion)) {
            query.put("exportVersion", request.exportVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出任务详情</p>
     * 
     * @param request GetResourceExportTaskRequest
     * @return GetResourceExportTaskResponse
     */
    public GetResourceExportTaskResponse getResourceExportTask(String exportTaskId, GetResourceExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceExportTaskWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源类型信息</p>
     * 
     * @param request GetResourceTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceTypeWithOptions(String resourceType, GetResourceTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterReadOnly)) {
            query.put("filterReadOnly", request.filterReadOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            query.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceType"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceType/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetResourceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源类型信息</p>
     * 
     * @param request GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceType(String resourceType, GetResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceTypeWithOptions(resourceType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务详情</p>
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本示例列表</p>
     * 
     * @param request ListExplorerRegistryModuleExamplesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    public ListExplorerRegistryModuleExamplesResponse listExplorerRegistryModuleExamplesWithOptions(ListExplorerRegistryModuleExamplesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exampleName)) {
            query.put("exampleName", request.exampleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            query.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerRegistryModuleExamples"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerRegistryModule/example"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListExplorerRegistryModuleExamplesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本示例列表</p>
     * 
     * @param request ListExplorerRegistryModuleExamplesRequest
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    public ListExplorerRegistryModuleExamplesResponse listExplorerRegistryModuleExamples(ListExplorerRegistryModuleExamplesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerRegistryModuleExamplesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本列表</p>
     * 
     * @param request ListExplorerRegistryModuleVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    public ListExplorerRegistryModuleVersionsResponse listExplorerRegistryModuleVersionsWithOptions(ListExplorerRegistryModuleVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            query.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerRegistryModuleVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerRegistryModule/version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListExplorerRegistryModuleVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Explorer的egistryModule版本列表</p>
     * 
     * @param request ListExplorerRegistryModuleVersionsRequest
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    public ListExplorerRegistryModuleVersionsResponse listExplorerRegistryModuleVersions(ListExplorerRegistryModuleVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerRegistryModuleVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Explorer的Registry Module列表</p>
     * 
     * @param request ListExplorerRegistryModulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerRegistryModulesResponse
     */
    public ListExplorerRegistryModulesResponse listExplorerRegistryModulesWithOptions(ListExplorerRegistryModulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerRegistryModules"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerRegistryModule"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListExplorerRegistryModulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Explorer的Registry Module列表</p>
     * 
     * @param request ListExplorerRegistryModulesRequest
     * @return ListExplorerRegistryModulesResponse
     */
    public ListExplorerRegistryModulesResponse listExplorerRegistryModules(ListExplorerRegistryModulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerRegistryModulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组列表</p>
     * 
     * @param tmpReq ListGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroupWithOptions(ListGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGroupShrinkRequest request = new ListGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组列表</p>
     * 
     * @param request ListGroupRequest
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroup(ListGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>作业列表</p>
     * 
     * @param request ListJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(String taskId, ListJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("jobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>作业列表</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(String taskId, ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模板版本列表</p>
     * 
     * @param request ListModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModuleVersionResponse
     */
    public ListModuleVersionResponse listModuleVersionWithOptions(String moduleId, ListModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模板版本列表</p>
     * 
     * @param request ListModuleVersionRequest
     * @return ListModuleVersionResponse
     */
    public ListModuleVersionResponse listModuleVersion(String moduleId, ListModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModuleVersionWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举模板</p>
     * 
     * @param tmpReq ListModulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModulesResponse
     */
    public ListModulesResponse listModulesWithOptions(ListModulesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModulesShrinkRequest request = new ListModulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModules"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举模板</p>
     * 
     * @param request ListModulesRequest
     * @return ListModulesResponse
     */
    public ListModulesResponse listModules(ListModulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>所有产品列表</p>
     * 
     * @param request ListProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTerraformer)) {
            query.put("supportTerraformer", request.supportTerraformer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            query.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>所有产品列表</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目列表</p>
     * 
     * @param tmpReq ListProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectShrinkRequest request = new ListProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目列表</p>
     * 
     * @param request ListProjectRequest
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule版本列表</p>
     * 
     * @param request ListRegistryModuleVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistryModuleVersionsResponse
     */
    public ListRegistryModuleVersionsResponse listRegistryModuleVersionsWithOptions(ListRegistryModuleVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistryModuleVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistryModuleVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule版本列表</p>
     * 
     * @param request ListRegistryModuleVersionsRequest
     * @return ListRegistryModuleVersionsResponse
     */
    public ListRegistryModuleVersionsResponse listRegistryModuleVersions(ListRegistryModuleVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryModuleVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule列表</p>
     * 
     * @param request ListRegistryModulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistryModulesResponse
     */
    public ListRegistryModulesResponse listRegistryModulesWithOptions(ListRegistryModulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistryModules"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistryModulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RegistryModule列表</p>
     * 
     * @param request ListRegistryModulesRequest
     * @return ListRegistryModulesResponse
     */
    public ListRegistryModulesResponse listRegistryModules(ListRegistryModulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryModulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间列表</p>
     * 
     * @param request ListRegistryNamespacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistryNamespacesResponse
     */
    public ListRegistryNamespacesResponse listRegistryNamespacesWithOptions(ListRegistryNamespacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistryNamespaces"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistryNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间列表</p>
     * 
     * @param request ListRegistryNamespacesRequest
     * @return ListRegistryNamespacesResponse
     */
    public ListRegistryNamespacesResponse listRegistryNamespaces(ListRegistryNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegistryNamespacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务版本列表</p>
     * 
     * @param request ListResourceExportTaskVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceExportTaskVersionsResponse
     */
    public ListResourceExportTaskVersionsResponse listResourceExportTaskVersionsWithOptions(String exportTaskId, ListResourceExportTaskVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportVersion)) {
            query.put("exportVersion", request.exportVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceExportTaskVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + "/exportVersions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceExportTaskVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务版本列表</p>
     * 
     * @param request ListResourceExportTaskVersionsRequest
     * @return ListResourceExportTaskVersionsResponse
     */
    public ListResourceExportTaskVersionsResponse listResourceExportTaskVersions(String exportTaskId, ListResourceExportTaskVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceExportTaskVersionsWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出任务列表</p>
     * 
     * @param request ListResourceExportTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceExportTasksResponse
     */
    public ListResourceExportTasksResponse listResourceExportTasksWithOptions(ListResourceExportTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskId)) {
            query.put("exportTaskId", request.exportTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceExportTasks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceExportTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出任务列表</p>
     * 
     * @param request ListResourceExportTasksRequest
     * @return ListResourceExportTasksResponse
     */
    public ListResourceExportTasksResponse listResourceExportTasks(ListResourceExportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceExportTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源类型列表</p>
     * 
     * @param tmpReq ListResourceTypesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypesWithOptions(ListResourceTypesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceTypesShrinkRequest request = new ListResourceTypesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.terraformResourceTypes)) {
            request.terraformResourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.terraformResourceTypes, "terraformResourceTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subcategory)) {
            query.put("subcategory", request.subcategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTerraformer)) {
            query.put("supportTerraformer", request.supportTerraformer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            query.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformResourceTypesShrink)) {
            query.put("terraformResourceTypes", request.terraformResourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourceTypes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListResourceTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源类型列表</p>
     * 
     * @param request ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceTypesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param tmpReq ListTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            query.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks"),
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
     * <p>任务列表</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>terraformProvider版本</p>
     * 
     * @param request ListTerraformProviderVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTerraformProviderVersionsResponse
     */
    public ListTerraformProviderVersionsResponse listTerraformProviderVersionsWithOptions(ListTerraformProviderVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usage)) {
            query.put("usage", request.usage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTerraformProviderVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/version/terraform/provider"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListTerraformProviderVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>terraformProvider版本</p>
     * 
     * @param request ListTerraformProviderVersionsRequest
     * @return ListTerraformProviderVersionsResponse
     */
    public ListTerraformProviderVersionsResponse listTerraformProviderVersions(ListTerraformProviderVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTerraformProviderVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>支持状态文件的资源导入和移除</p>
     * 
     * @param request ManageTerraformStateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageTerraformStateResponse
     */
    public ManageTerraformStateResponse manageTerraformStateWithOptions(ManageTerraformStateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importResourceId)) {
            body.put("importResourceId", request.importResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdentifier)) {
            body.put("resourceIdentifier", request.resourceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageTerraformState"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraformState/manage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageTerraformStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>支持状态文件的资源导入和移除</p>
     * 
     * @param request ManageTerraformStateRequest
     * @return ManageTerraformStateResponse
     */
    public ManageTerraformStateResponse manageTerraformState(ManageTerraformStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.manageTerraformStateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>控制作业</p>
     * 
     * @param request OperateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateJobResponse
     */
    public OperateJobResponse operateJobWithOptions(String taskId, String jobId, String operationType, OperateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateJob"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/operation/" + com.aliyun.openapiutil.Client.getEncodeParam(operationType) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>控制作业</p>
     * 
     * @param request OperateJobRequest
     * @return OperateJobResponse
     */
    public OperateJobResponse operateJob(String taskId, String jobId, String operationType, OperateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateJobWithOptions(taskId, jobId, operationType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布RegistryModule版本</p>
     * 
     * @param request PublishRegistryModuleVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRegistryModuleVersionResponse
     */
    public PublishRegistryModuleVersionResponse publishRegistryModuleVersionWithOptions(PublishRegistryModuleVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            body.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("namespaceName", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRegistryModuleVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModuleVersion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRegistryModuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布RegistryModule版本</p>
     * 
     * @param request PublishRegistryModuleVersionRequest
     * @return PublishRegistryModuleVersionResponse
     */
    public PublishRegistryModuleVersionResponse publishRegistryModuleVersion(PublishRegistryModuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishRegistryModuleVersionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除共享账号信息</p>
     * 
     * @param tmpReq RemoveSharedAccountsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSharedAccountsResponse
     */
    public RemoveSharedAccountsResponse removeSharedAccountsWithOptions(RemoveSharedAccountsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveSharedAccountsShrinkRequest request = new RemoveSharedAccountsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "accountIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("accountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSharedAccounts"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sharedAccounts"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSharedAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除共享账号信息</p>
     * 
     * @param request RemoveSharedAccountsRequest
     * @return RemoveSharedAccountsResponse
     */
    public RemoveSharedAccountsResponse removeSharedAccounts(RemoveSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeSharedAccountsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改ExplorerModule</p>
     * 
     * @param request UpdateExplorerModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExplorerModuleAttributeResponse
     */
    public UpdateExplorerModuleAttributeResponse updateExplorerModuleAttributeWithOptions(String explorerModuleId, UpdateExplorerModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExplorerModuleAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerModule/" + com.aliyun.openapiutil.Client.getEncodeParam(explorerModuleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExplorerModuleAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改ExplorerModule</p>
     * 
     * @param request UpdateExplorerModuleAttributeRequest
     * @return UpdateExplorerModuleAttributeResponse
     */
    public UpdateExplorerModuleAttributeResponse updateExplorerModuleAttribute(String explorerModuleId, UpdateExplorerModuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExplorerModuleAttributeWithOptions(explorerModuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改分组</p>
     * 
     * @param request UpdateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(String groupId, UpdateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTrigger)) {
            body.put("autoTrigger", request.autoTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forcedSetting)) {
            body.put("forcedSetting", request.forcedSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            body.put("notifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyOperationTypes)) {
            body.put("notifyOperationTypes", request.notifyOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportField)) {
            body.put("reportExportField", request.reportExportField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportExportPath)) {
            body.put("reportExportPath", request.reportExportPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            body.put("triggerConfig", request.triggerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerResourceType)) {
            body.put("triggerResourceType", request.triggerResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改分组</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(String groupId, UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新模板</p>
     * 
     * @param request UpdateModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModuleAttributeResponse
     */
    public UpdateModuleAttributeResponse updateModuleAttributeWithOptions(String moduleId, UpdateModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statePath)) {
            body.put("statePath", request.statePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStrategy)) {
            body.put("versionStrategy", request.versionStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModuleAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModuleAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新模板</p>
     * 
     * @param request UpdateModuleAttributeRequest
     * @return UpdateModuleAttributeResponse
     */
    public UpdateModuleAttributeResponse updateModuleAttribute(String moduleId, UpdateModuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModuleAttributeWithOptions(moduleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改项目</p>
     * 
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(String projectId, UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改项目</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(String projectId, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改RegistryModule</p>
     * 
     * @param request UpdateRegistryModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegistryModuleAttributeResponse
     */
    public UpdateRegistryModuleAttributeResponse updateRegistryModuleAttributeWithOptions(String namespaceName, String moduleName, UpdateRegistryModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegistryModuleAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryModule/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(moduleName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegistryModuleAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改RegistryModule</p>
     * 
     * @param request UpdateRegistryModuleAttributeRequest
     * @return UpdateRegistryModuleAttributeResponse
     */
    public UpdateRegistryModuleAttributeResponse updateRegistryModuleAttribute(String namespaceName, String moduleName, UpdateRegistryModuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegistryModuleAttributeWithOptions(namespaceName, moduleName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改工作空间</p>
     * 
     * @param request UpdateRegistryNamespaceAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    public UpdateRegistryNamespaceAttributeResponse updateRegistryNamespaceAttributeWithOptions(String namespaceName, UpdateRegistryNamespaceAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acl)) {
            body.put("acl", request.acl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegistryNamespaceAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/registryNamespace/" + com.aliyun.openapiutil.Client.getEncodeParam(namespaceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegistryNamespaceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改工作空间</p>
     * 
     * @param request UpdateRegistryNamespaceAttributeRequest
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    public UpdateRegistryNamespaceAttributeResponse updateRegistryNamespaceAttribute(String namespaceName, UpdateRegistryNamespaceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegistryNamespaceAttributeWithOptions(namespaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新导出任务</p>
     * 
     * @param request UpdateResourceExportTaskAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceExportTaskAttributeResponse
     */
    public UpdateResourceExportTaskAttributeResponse updateResourceExportTaskAttributeWithOptions(String exportTaskId, UpdateResourceExportTaskAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportToModule)) {
            body.put("exportToModule", request.exportToModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRules)) {
            body.put("includeRules", request.includeRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceExportTaskAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceExportTaskAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新导出任务</p>
     * 
     * @param request UpdateResourceExportTaskAttributeRequest
     * @return UpdateResourceExportTaskAttributeResponse
     */
    public UpdateResourceExportTaskAttributeResponse updateResourceExportTaskAttribute(String exportTaskId, UpdateResourceExportTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceExportTaskAttributeWithOptions(exportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改任务</p>
     * 
     * @param request UpdateTaskAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskAttributeResponse
     */
    public UpdateTaskAttributeResponse updateTaskAttributeWithOptions(String taskId, UpdateTaskAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoApply)) {
            body.put("autoApply", request.autoApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDestroy)) {
            body.put("autoDestroy", request.autoDestroy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfo)) {
            body.put("groupInfo", request.groupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initModuleState)) {
            body.put("initModuleState", request.initModuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            body.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionStrategy)) {
            body.put("protectionStrategy", request.protectionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPropertyValidation)) {
            body.put("skipPropertyValidation", request.skipPropertyValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改任务</p>
     * 
     * @param request UpdateTaskAttributeRequest
     * @return UpdateTaskAttributeResponse
     */
    public UpdateTaskAttributeResponse updateTaskAttribute(String taskId, UpdateTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTaskAttributeWithOptions(taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模版预检</p>
     * 
     * @param request ValidateModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateModuleResponse
     */
    public ValidateModuleResponse validateModuleWithOptions(ValidateModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeMap)) {
            body.put("codeMap", request.codeMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePath)) {
            body.put("sourcePath", request.sourcePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/module/validation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模版预检</p>
     * 
     * @param request ValidateModuleRequest
     * @return ValidateModuleResponse
     */
    public ValidateModuleResponse validateModule(ValidateModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateModuleWithOptions(request, headers, runtime);
    }
}
