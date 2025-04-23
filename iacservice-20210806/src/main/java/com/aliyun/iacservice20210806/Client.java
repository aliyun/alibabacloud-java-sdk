// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806;

import com.aliyun.tea.*;
import com.aliyun.iacservice20210806.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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
     * <p>将参数集关联资源</p>
     * 
     * @param request AssociateParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateParameterSetResponse
     */
    public AssociateParameterSetResponse associateParameterSetWithOptions(AssociateParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameterSetIds)) {
            body.put("parameterSetIds", request.parameterSetIds);
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
            new TeaPair("action", "AssociateParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/operations/associate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateParameterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将参数集关联资源</p>
     * 
     * @param request AssociateParameterSetRequest
     * @return AssociateParameterSetResponse
     */
    public AssociateParameterSetResponse associateParameterSet(AssociateParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.associateParameterSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将消息发布者挂载到任务</p>
     * 
     * @param request AttachRabbitmqPublisherRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachRabbitmqPublisherResponse
     */
    public AttachRabbitmqPublisherResponse attachRabbitmqPublisherWithOptions(String publisherId, AttachRabbitmqPublisherRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachRabbitmqPublisher"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers/" + com.aliyun.openapiutil.Client.getEncodeParam(publisherId) + "/attach"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachRabbitmqPublisherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将消息发布者挂载到任务</p>
     * 
     * @param request AttachRabbitmqPublisherRequest
     * @return AttachRabbitmqPublisherResponse
     */
    public AttachRabbitmqPublisherResponse attachRabbitmqPublisher(String publisherId, AttachRabbitmqPublisherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachRabbitmqPublisherWithOptions(publisherId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消执行</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelProjectBuildResponse
     */
    public CancelProjectBuildResponse cancelProjectBuildWithOptions(String projectId, String projectBuildId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelProjectBuild"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/build/" + com.aliyun.openapiutil.Client.getEncodeParam(projectBuildId) + "/cancel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelProjectBuildResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消执行</p>
     * @return CancelProjectBuildResponse
     */
    public CancelProjectBuildResponse cancelProjectBuild(String projectId, String projectBuildId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelProjectBuildWithOptions(projectId, projectBuildId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消RAM策略导出任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRamPolicyExportTaskResponse
     */
    public CancelRamPolicyExportTaskResponse cancelRamPolicyExportTaskWithOptions(String ramPolicyExportTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRamPolicyExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + "/cancel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRamPolicyExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消RAM策略导出任务</p>
     * @return CancelRamPolicyExportTaskResponse
     */
    public CancelRamPolicyExportTaskResponse cancelRamPolicyExportTask(String ramPolicyExportTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRamPolicyExportTaskWithOptions(ramPolicyExportTaskId, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
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
     * <p>校验资源名称</p>
     * 
     * @param request CheckResourceNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResourceNameResponse
     */
    public CheckResourceNameResponse checkResourceNameWithOptions(CheckResourceNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResourceName"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/check/name"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验资源名称</p>
     * 
     * @param request CheckResourceNameRequest
     * @return CheckResourceNameResponse
     */
    public CheckResourceNameResponse checkResourceName(CheckResourceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkResourceNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆分组</p>
     * 
     * @param request CloneGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneGroupResponse
     */
    public CloneGroupResponse cloneGroupWithOptions(String groupId, CloneGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            body.put("resourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneGroup"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆分组</p>
     * 
     * @param request CloneGroupRequest
     * @return CloneGroupResponse
     */
    public CloneGroupResponse cloneGroup(String groupId, CloneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆模版</p>
     * 
     * @param request CloneModuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneModuleResponse
     */
    public CloneModuleResponse cloneModuleWithOptions(CloneModuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            body.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleSource)) {
            body.put("moduleSource", request.moduleSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            body.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneModule"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modules/operations/clone"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆模版</p>
     * 
     * @param request CloneModuleRequest
     * @return CloneModuleResponse
     */
    public CloneModuleResponse cloneModule(CloneModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneModuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建共享</p>
     * 
     * @param request CreateAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthorizationResponse
     */
    public CreateAuthorizationResponse createAuthorizationWithOptions(CreateAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("dueTime", request.dueTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorization"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/authorizations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建共享</p>
     * 
     * @param request CreateAuthorizationRequest
     * @return CreateAuthorizationResponse
     */
    public CreateAuthorizationResponse createAuthorization(CreateAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthorizationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Explorer任务</p>
     * 
     * @param request CreateExplorerTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExplorerTaskResponse
     */
    public CreateExplorerTaskResponse createExplorerTaskWithOptions(CreateExplorerTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.initModuleState)) {
            body.put("InitModuleState", request.initModuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("TerraformVersion", request.terraformVersion);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.skipPropertyValidation)) {
            body.put("skipPropertyValidation", request.skipPropertyValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerValue)) {
            body.put("triggerValue", request.triggerValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExplorerTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExplorerTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Explorer任务</p>
     * 
     * @param request CreateExplorerTaskRequest
     * @return CreateExplorerTaskResponse
     */
    public CreateExplorerTaskResponse createExplorerTask(CreateExplorerTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExplorerTaskWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("executeType", request.executeType);
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
     * <p>创建模版</p>
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
     * <p>创建模版</p>
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
     * <p>创建模版版本</p>
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
     * <p>创建模版版本</p>
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
     * <p>创建参数集</p>
     * 
     * @param request CreateParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateParameterSetResponse
     */
    public CreateParameterSetResponse createParameterSetWithOptions(CreateParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateParameterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建参数集</p>
     * 
     * @param request CreateParameterSetRequest
     * @return CreateParameterSetResponse
     */
    public CreateParameterSetResponse createParameterSet(CreateParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createParameterSetWithOptions(request, headers, runtime);
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
     * <p>构建项目批次</p>
     * 
     * @param request CreateProjectBuildRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectBuildResponse
     */
    public CreateProjectBuildResponse createProjectBuildWithOptions(String projectId, CreateProjectBuildRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectBuildAction)) {
            body.put("projectBuildAction", request.projectBuildAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            body.put("taskIds", request.taskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskPolicies)) {
            body.put("taskPolicies", request.taskPolicies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectBuild"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/build"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectBuildResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>构建项目批次</p>
     * 
     * @param request CreateProjectBuildRequest
     * @return CreateProjectBuildResponse
     */
    public CreateProjectBuildResponse createProjectBuild(String projectId, CreateProjectBuildRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectBuildWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建消息发布者</p>
     * 
     * @param request CreateRabbitmqPublisherRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRabbitmqPublisherResponse
     */
    public CreateRabbitmqPublisherResponse createRabbitmqPublisherWithOptions(CreateRabbitmqPublisherRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            body.put("exchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeType)) {
            body.put("exchangeType", request.exchangeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("hostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("virtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRabbitmqPublisher"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRabbitmqPublisherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建消息发布者</p>
     * 
     * @param request CreateRabbitmqPublisherRequest
     * @return CreateRabbitmqPublisherResponse
     */
    public CreateRabbitmqPublisherResponse createRabbitmqPublisher(CreateRabbitmqPublisherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRabbitmqPublisherWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建RAM策略导出任务</p>
     * 
     * @param request CreateRamPolicyExportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRamPolicyExportTaskResponse
     */
    public CreateRamPolicyExportTaskResponse createRamPolicyExportTaskWithOptions(CreateRamPolicyExportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationAccountIds)) {
            body.put("authorizationAccountIds", request.authorizationAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationActions)) {
            body.put("authorizationActions", request.authorizationActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRegionIds)) {
            body.put("authorizationRegionIds", request.authorizationRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRamPolicyExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRamPolicyExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建RAM策略导出任务</p>
     * 
     * @param request CreateRamPolicyExportTaskRequest
     * @return CreateRamPolicyExportTaskResponse
     */
    public CreateRamPolicyExportTaskResponse createRamPolicyExportTask(CreateRamPolicyExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRamPolicyExportTaskWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.configPath)) {
            body.put("configPath", request.configPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRules)) {
            body.put("excludeRules", request.excludeRules);
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

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskBackend)) {
            body.put("taskBackend", request.taskBackend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerValue)) {
            body.put("triggerValue", request.triggerValue);
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
     * <p>删除共享</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthorizationResponse
     */
    public DeleteAuthorizationResponse deleteAuthorizationWithOptions(String authorizationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthorization"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/authorizations/" + com.aliyun.openapiutil.Client.getEncodeParam(authorizationId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除共享</p>
     * @return DeleteAuthorizationResponse
     */
    public DeleteAuthorizationResponse deleteAuthorization(String authorizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAuthorizationWithOptions(authorizationId, headers, runtime);
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
     * <p>删除模版</p>
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
     * <p>删除模版</p>
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModule(String moduleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModuleWithOptions(moduleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除参数集</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteParameterSetResponse
     */
    public DeleteParameterSetResponse deleteParameterSetWithOptions(String parameterSetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/" + com.aliyun.openapiutil.Client.getEncodeParam(parameterSetId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteParameterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除参数集</p>
     * @return DeleteParameterSetResponse
     */
    public DeleteParameterSetResponse deleteParameterSet(String parameterSetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteParameterSetWithOptions(parameterSetId, headers, runtime);
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
     * <p>删除消息发布者</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRabbitmqPublisherResponse
     */
    public DeleteRabbitmqPublisherResponse deleteRabbitmqPublisherWithOptions(String publisherId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRabbitmqPublisher"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers/" + com.aliyun.openapiutil.Client.getEncodeParam(publisherId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRabbitmqPublisherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除消息发布者</p>
     * @return DeleteRabbitmqPublisherResponse
     */
    public DeleteRabbitmqPublisherResponse deleteRabbitmqPublisher(String publisherId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRabbitmqPublisherWithOptions(publisherId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除RAM策略导出任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRamPolicyExportTaskResponse
     */
    public DeleteRamPolicyExportTaskResponse deleteRamPolicyExportTaskWithOptions(String ramPolicyExportTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRamPolicyExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRamPolicyExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除RAM策略导出任务</p>
     * @return DeleteRamPolicyExportTaskResponse
     */
    public DeleteRamPolicyExportTaskResponse deleteRamPolicyExportTask(String ramPolicyExportTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRamPolicyExportTaskWithOptions(ramPolicyExportTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除RAM策略导出任务版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRamPolicyExportTaskVersionResponse
     */
    public DeleteRamPolicyExportTaskVersionResponse deleteRamPolicyExportTaskVersionWithOptions(String ramPolicyExportTaskId, String exportVersion, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRamPolicyExportTaskVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(exportVersion) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRamPolicyExportTaskVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除RAM策略导出任务版本</p>
     * @return DeleteRamPolicyExportTaskVersionResponse
     */
    public DeleteRamPolicyExportTaskVersionResponse deleteRamPolicyExportTaskVersion(String ramPolicyExportTaskId, String exportVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRamPolicyExportTaskVersionWithOptions(ramPolicyExportTaskId, exportVersion, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除任务</p>
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
     * <p>删除任务</p>
     * @return DeleteResourceExportTaskResponse
     */
    public DeleteResourceExportTaskResponse deleteResourceExportTask(String exportTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceExportTaskWithOptions(exportTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景化测试任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSceneTestingTaskResponse
     */
    public DeleteSceneTestingTaskResponse deleteSceneTestingTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSceneTestingTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sceneTestingTask/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneTestingTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景化测试任务</p>
     * @return DeleteSceneTestingTaskResponse
     */
    public DeleteSceneTestingTaskResponse deleteSceneTestingTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSceneTestingTaskWithOptions(taskId, headers, runtime);
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
     * <p>将消息发布者从任务上卸载</p>
     * 
     * @param request DetachRabbitmqPublisherRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachRabbitmqPublisherResponse
     */
    public DetachRabbitmqPublisherResponse detachRabbitmqPublisherWithOptions(String publisherId, DetachRabbitmqPublisherRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachRabbitmqPublisher"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers/" + com.aliyun.openapiutil.Client.getEncodeParam(publisherId) + "/detach"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachRabbitmqPublisherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将消息发布者从任务上卸载</p>
     * 
     * @param request DetachRabbitmqPublisherRequest
     * @return DetachRabbitmqPublisherResponse
     */
    public DetachRabbitmqPublisherResponse detachRabbitmqPublisher(String publisherId, DetachRabbitmqPublisherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detachRabbitmqPublisherWithOptions(publisherId, request, headers, runtime);
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
     * <p>解除参数集关联资源关系</p>
     * 
     * @param request DissociateParameterSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateParameterSetResponse
     */
    public DissociateParameterSetResponse dissociateParameterSetWithOptions(DissociateParameterSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameterSetIds)) {
            body.put("parameterSetIds", request.parameterSetIds);
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
            new TeaPair("action", "DissociateParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/operations/dissociate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateParameterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除参数集关联资源关系</p>
     * 
     * @param request DissociateParameterSetRequest
     * @return DissociateParameterSetResponse
     */
    public DissociateParameterSetResponse dissociateParameterSet(DissociateParameterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dissociateParameterSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行RAM策略导出任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteRamPolicyExportTaskResponse
     */
    public ExecuteRamPolicyExportTaskResponse executeRamPolicyExportTaskWithOptions(String ramPolicyExportTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteRamPolicyExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + "/execute"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteRamPolicyExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行RAM策略导出任务</p>
     * @return ExecuteRamPolicyExportTaskResponse
     */
    public ExecuteRamPolicyExportTaskResponse executeRamPolicyExportTask(String ramPolicyExportTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeRamPolicyExportTaskWithOptions(ramPolicyExportTaskId, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
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
     * <p>查询Explorer任务详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExplorerTaskResponse
     */
    public GetExplorerTaskResponse getExplorerTaskWithOptions(String explorerTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExplorerTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerTask/" + com.aliyun.openapiutil.Client.getEncodeParam(explorerTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExplorerTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Explorer任务详情</p>
     * @return GetExplorerTaskResponse
     */
    public GetExplorerTaskResponse getExplorerTask(String explorerTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExplorerTaskWithOptions(explorerTaskId, headers, runtime);
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
     * <p>获取模版详情</p>
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
     * <p>获取模版详情</p>
     * @return GetModuleResponse
     */
    public GetModuleResponse getModule(String moduleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModuleWithOptions(moduleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模版版本详情</p>
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
     * <p>模版版本详情</p>
     * @return GetModuleVersionResponse
     */
    public GetModuleVersionResponse getModuleVersion(String moduleId, String moduleVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModuleVersionWithOptions(moduleId, moduleVersion, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>参数集详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParameterSetResponse
     */
    public GetParameterSetResponse getParameterSetWithOptions(String parameterSetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParameterSet"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/" + com.aliyun.openapiutil.Client.getEncodeParam(parameterSetId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParameterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>参数集详情</p>
     * @return GetParameterSetResponse
     */
    public GetParameterSetResponse getParameterSet(String parameterSetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getParameterSetWithOptions(parameterSetId, headers, runtime);
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
     * <p>项目批次概览</p>
     * 
     * @param request GetProjectBuildContextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectBuildContextResponse
     */
    public GetProjectBuildContextResponse getProjectBuildContextWithOptions(String projectId, String projectBuildId, GetProjectBuildContextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isPassAssertCheck)) {
            query.put("isPassAssertCheck", request.isPassAssertCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectBuildContext"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/build/" + com.aliyun.openapiutil.Client.getEncodeParam(projectBuildId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectBuildContextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>项目批次概览</p>
     * 
     * @param request GetProjectBuildContextRequest
     * @return GetProjectBuildContextResponse
     */
    public GetProjectBuildContextResponse getProjectBuildContext(String projectId, String projectBuildId, GetProjectBuildContextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectBuildContextWithOptions(projectId, projectBuildId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取消息发布者详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRabbitmqPublisherResponse
     */
    public GetRabbitmqPublisherResponse getRabbitmqPublisherWithOptions(String publisherId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRabbitmqPublisher"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers/" + com.aliyun.openapiutil.Client.getEncodeParam(publisherId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRabbitmqPublisherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取消息发布者详情</p>
     * @return GetRabbitmqPublisherResponse
     */
    public GetRabbitmqPublisherResponse getRabbitmqPublisher(String publisherId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRabbitmqPublisherWithOptions(publisherId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRamPolicyExportTaskResponse
     */
    public GetRamPolicyExportTaskResponse getRamPolicyExportTaskWithOptions(String ramPolicyExportTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRamPolicyExportTask"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRamPolicyExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务详情</p>
     * @return GetRamPolicyExportTaskResponse
     */
    public GetRamPolicyExportTaskResponse getRamPolicyExportTask(String ramPolicyExportTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRamPolicyExportTaskWithOptions(ramPolicyExportTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务版本详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRamPolicyExportTaskVersionResponse
     */
    public GetRamPolicyExportTaskVersionResponse getRamPolicyExportTaskVersionWithOptions(String ramPolicyExportTaskId, String exportVersion, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRamPolicyExportTaskVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(exportVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRamPolicyExportTaskVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务版本详情</p>
     * @return GetRamPolicyExportTaskVersionResponse
     */
    public GetRamPolicyExportTaskVersionResponse getRamPolicyExportTaskVersion(String ramPolicyExportTaskId, String exportVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRamPolicyExportTaskVersionWithOptions(ramPolicyExportTaskId, exportVersion, headers, runtime);
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
     * <p>查询分组优先级详情</p>
     * 
     * @param request GetTaskPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskPolicyResponse
     */
    public GetTaskPolicyResponse getTaskPolicyWithOptions(String groupId, GetTaskPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskPolicy"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/task/policy/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组优先级详情</p>
     * 
     * @param request GetTaskPolicyRequest
     * @return GetTaskPolicyResponse
     */
    public GetTaskPolicyResponse getTaskPolicy(String groupId, GetTaskPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskPolicyWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取共享列表</p>
     * 
     * @param request ListAuthorizationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationsResponse
     */
    public ListAuthorizationsResponse listAuthorizationsWithOptions(ListAuthorizationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationId)) {
            query.put("authorizationId", request.authorizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationType)) {
            query.put("authorizationType", request.authorizationType);
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
            new TeaPair("action", "ListAuthorizations"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/authorizations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取共享列表</p>
     * 
     * @param request ListAuthorizationsRequest
     * @return ListAuthorizationsResponse
     */
    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthorizationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>terraform版本</p>
     * 
     * @param request ListAvailableTerraformVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableTerraformVersionsResponse
     */
    public ListAvailableTerraformVersionsResponse listAvailableTerraformVersionsWithOptions(ListAvailableTerraformVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("keyWord", request.keyWord);
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
            new TeaPair("action", "ListAvailableTerraformVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/version/terraform"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableTerraformVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>terraform版本</p>
     * 
     * @param request ListAvailableTerraformVersionsRequest
     * @return ListAvailableTerraformVersionsResponse
     */
    public ListAvailableTerraformVersionsResponse listAvailableTerraformVersions(ListAvailableTerraformVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableTerraformVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举Explorer任务</p>
     * 
     * @param request ListExplorerTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExplorerTasksResponse
     */
    public ListExplorerTasksResponse listExplorerTasksWithOptions(String explorerTaskId, ListExplorerTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResult)) {
            query.put("maxResult", request.maxResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            query.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExplorerTasks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExplorerTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举Explorer任务</p>
     * 
     * @param request ListExplorerTasksRequest
     * @return ListExplorerTasksResponse
     */
    public ListExplorerTasksResponse listExplorerTasks(String explorerTaskId, ListExplorerTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExplorerTasksWithOptions(explorerTaskId, request, headers, runtime);
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
     * <p>模版版本列表</p>
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
     * <p>模版版本列表</p>
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
     * <p>列举模版</p>
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeModuleIds)) {
            request.excludeModuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeModuleIds, "excludeModuleIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeModuleIdsShrink)) {
            query.put("excludeModuleIds", request.excludeModuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
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
     * <p>列举模版</p>
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
     * <p>关联到资源的参数集列表</p>
     * 
     * @param request ListParameterSetRelationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParameterSetRelationResponse
     */
    public ListParameterSetRelationResponse listParameterSetRelationWithOptions(ListParameterSetRelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListParameterSetRelation"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/operations/relation"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParameterSetRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关联到资源的参数集列表</p>
     * 
     * @param request ListParameterSetRelationRequest
     * @return ListParameterSetRelationResponse
     */
    public ListParameterSetRelationResponse listParameterSetRelation(ListParameterSetRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParameterSetRelationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>参数集列表</p>
     * 
     * @param request ListParameterSetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParameterSetsResponse
     */
    public ListParameterSetsResponse listParameterSetsWithOptions(ListParameterSetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListParameterSets"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParameterSetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>参数集列表</p>
     * 
     * @param request ListParameterSetsRequest
     * @return ListParameterSetsResponse
     */
    public ListParameterSetsResponse listParameterSets(ListParameterSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParameterSetsWithOptions(request, headers, runtime);
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
     * <p>项目批次列表</p>
     * 
     * @param request ListProjectBuildsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectBuildsResponse
     */
    public ListProjectBuildsResponse listProjectBuildsWithOptions(String projectId, ListProjectBuildsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectBuildAction)) {
            query.put("projectBuildAction", request.projectBuildAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectBuilds"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/build"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectBuildsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>项目批次列表</p>
     * 
     * @param request ListProjectBuildsRequest
     * @return ListProjectBuildsResponse
     */
    public ListProjectBuildsResponse listProjectBuilds(String projectId, ListProjectBuildsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectBuildsWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取消息发布者列表</p>
     * 
     * @param request ListRabbitmqPublishersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRabbitmqPublishersResponse
     */
    public ListRabbitmqPublishersResponse listRabbitmqPublishersWithOptions(ListRabbitmqPublishersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListRabbitmqPublishers"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRabbitmqPublishersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取消息发布者列表</p>
     * 
     * @param request ListRabbitmqPublishersRequest
     * @return ListRabbitmqPublishersResponse
     */
    public ListRabbitmqPublishersResponse listRabbitmqPublishers(ListRabbitmqPublishersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRabbitmqPublishersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务版本列表</p>
     * 
     * @param request ListRamPolicyExportTaskVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRamPolicyExportTaskVersionsResponse
     */
    public ListRamPolicyExportTaskVersionsResponse listRamPolicyExportTaskVersionsWithOptions(String ramPolicyExportTaskId, ListRamPolicyExportTaskVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListRamPolicyExportTaskVersions"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRamPolicyExportTaskVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务版本列表</p>
     * 
     * @param request ListRamPolicyExportTaskVersionsRequest
     * @return ListRamPolicyExportTaskVersionsResponse
     */
    public ListRamPolicyExportTaskVersionsResponse listRamPolicyExportTaskVersions(String ramPolicyExportTaskId, ListRamPolicyExportTaskVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRamPolicyExportTaskVersionsWithOptions(ramPolicyExportTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务列表</p>
     * 
     * @param request ListRamPolicyExportTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRamPolicyExportTasksResponse
     */
    public ListRamPolicyExportTasksResponse listRamPolicyExportTasksWithOptions(ListRamPolicyExportTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            query.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            query.put("moduleVersion", request.moduleVersion);
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
            new TeaPair("action", "ListRamPolicyExportTasks"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRamPolicyExportTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RAM策略导出任务列表</p>
     * 
     * @param request ListRamPolicyExportTasksRequest
     * @return ListRamPolicyExportTasksResponse
     */
    public ListRamPolicyExportTasksResponse listRamPolicyExportTasks(ListRamPolicyExportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRamPolicyExportTasksWithOptions(request, headers, runtime);
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
     * <p>资源列表</p>
     * 
     * @param request ListResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceValue)) {
            query.put("sourceValue", request.sourceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("specType", request.specType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resources/stateparser"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源列表</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(request, headers, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeTaskIds)) {
            request.excludeTaskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeTaskIds, "excludeTaskIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTaskIdsShrink)) {
            query.put("excludeTaskIds", request.excludeTaskIdsShrink);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTerraformProviderVersionsResponse());
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
     * <p>移除导出任务版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveResourceExportTaskVersionResponse
     */
    public RemoveResourceExportTaskVersionResponse removeResourceExportTaskVersionWithOptions(String exportTaskId, String exportVersion, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveResourceExportTaskVersion"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/exportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(exportTaskId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(exportVersion) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveResourceExportTaskVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除导出任务版本</p>
     * @return RemoveResourceExportTaskVersionResponse
     */
    public RemoveResourceExportTaskVersionResponse removeResourceExportTaskVersion(String exportTaskId, String exportVersion) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeResourceExportTaskVersionWithOptions(exportTaskId, exportVersion, headers, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2021-08-06"),
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
     * <p>更新共享</p>
     * 
     * @param request UpdateAuthorizationAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationAttributeResponse
     */
    public UpdateAuthorizationAttributeResponse updateAuthorizationAttributeWithOptions(String authorizationId, UpdateAuthorizationAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("dueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/authorizations/" + com.aliyun.openapiutil.Client.getEncodeParam(authorizationId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新共享</p>
     * 
     * @param request UpdateAuthorizationAttributeRequest
     * @return UpdateAuthorizationAttributeResponse
     */
    public UpdateAuthorizationAttributeResponse updateAuthorizationAttribute(String authorizationId, UpdateAuthorizationAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAuthorizationAttributeWithOptions(authorizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改Explorer任务</p>
     * 
     * @param request UpdateExplorerTaskAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExplorerTaskAttributeResponse
     */
    public UpdateExplorerTaskAttributeResponse updateExplorerTaskAttributeWithOptions(String explorerTaskId, UpdateExplorerTaskAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoApply)) {
            body.put("autoApply", request.autoApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.explorerTaskName)) {
            body.put("explorerTaskName", request.explorerTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleId)) {
            body.put("moduleId", request.moduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleVersion)) {
            body.put("moduleVersion", request.moduleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformProviderVersion)) {
            body.put("terraformProviderVersion", request.terraformProviderVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExplorerTaskAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/explorerTask/" + com.aliyun.openapiutil.Client.getEncodeParam(explorerTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExplorerTaskAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改Explorer任务</p>
     * 
     * @param request UpdateExplorerTaskAttributeRequest
     * @return UpdateExplorerTaskAttributeResponse
     */
    public UpdateExplorerTaskAttributeResponse updateExplorerTaskAttribute(String explorerTaskId, UpdateExplorerTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExplorerTaskAttributeWithOptions(explorerTaskId, request, headers, runtime);
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
     * <p>更新模版</p>
     * 
     * @param request UpdateModuleAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModuleAttributeResponse
     */
    public UpdateModuleAttributeResponse updateModuleAttributeWithOptions(String moduleId, UpdateModuleAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
     * <p>更新模版</p>
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
     * <p>更新参数集</p>
     * 
     * @param request UpdateParameterSetAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateParameterSetAttributeResponse
     */
    public UpdateParameterSetAttributeResponse updateParameterSetAttributeWithOptions(String parameterSetId, UpdateParameterSetAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateParameterSetAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/parameterSets/" + com.aliyun.openapiutil.Client.getEncodeParam(parameterSetId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateParameterSetAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新参数集</p>
     * 
     * @param request UpdateParameterSetAttributeRequest
     * @return UpdateParameterSetAttributeResponse
     */
    public UpdateParameterSetAttributeResponse updateParameterSetAttribute(String parameterSetId, UpdateParameterSetAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateParameterSetAttributeWithOptions(parameterSetId, request, headers, runtime);
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
     * <p>更新消息发布者</p>
     * 
     * @param request UpdateRabbitmqPublisherAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRabbitmqPublisherAttributeResponse
     */
    public UpdateRabbitmqPublisherAttributeResponse updateRabbitmqPublisherAttributeWithOptions(String publisherId, UpdateRabbitmqPublisherAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            body.put("exchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeType)) {
            body.put("exchangeType", request.exchangeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRabbitmqPublisherAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/publishers/" + com.aliyun.openapiutil.Client.getEncodeParam(publisherId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRabbitmqPublisherAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新消息发布者</p>
     * 
     * @param request UpdateRabbitmqPublisherAttributeRequest
     * @return UpdateRabbitmqPublisherAttributeResponse
     */
    public UpdateRabbitmqPublisherAttributeResponse updateRabbitmqPublisherAttribute(String publisherId, UpdateRabbitmqPublisherAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRabbitmqPublisherAttributeWithOptions(publisherId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改RAM策略导出任务</p>
     * 
     * @param request UpdateRamPolicyExportTaskAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRamPolicyExportTaskAttributeResponse
     */
    public UpdateRamPolicyExportTaskAttributeResponse updateRamPolicyExportTaskAttributeWithOptions(String ramPolicyExportTaskId, UpdateRamPolicyExportTaskAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationAccountIds)) {
            body.put("authorizationAccountIds", request.authorizationAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationActions)) {
            body.put("authorizationActions", request.authorizationActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRegionIds)) {
            body.put("authorizationRegionIds", request.authorizationRegionIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            body.put("ramRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRamPolicyExportTaskAttribute"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ramPolicyExportTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(ramPolicyExportTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRamPolicyExportTaskAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改RAM策略导出任务</p>
     * 
     * @param request UpdateRamPolicyExportTaskAttributeRequest
     * @return UpdateRamPolicyExportTaskAttributeResponse
     */
    public UpdateRamPolicyExportTaskAttributeResponse updateRamPolicyExportTaskAttribute(String ramPolicyExportTaskId, UpdateRamPolicyExportTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRamPolicyExportTaskAttributeWithOptions(ramPolicyExportTaskId, request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.configPath)) {
            body.put("configPath", request.configPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRules)) {
            body.put("excludeRules", request.excludeRules);
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

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
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

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVersion)) {
            body.put("terraformVersion", request.terraformVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerStrategy)) {
            body.put("triggerStrategy", request.triggerStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerValue)) {
            body.put("triggerValue", request.triggerValue);
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
     * <p>修改分组优先级配置</p>
     * 
     * @param request UpdateTaskPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskPolicyResponse
     */
    public UpdateTaskPolicyResponse updateTaskPolicyWithOptions(String groupId, UpdateTaskPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskPolicies)) {
            body.put("taskPolicies", request.taskPolicies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskPolicy"),
            new TeaPair("version", "2021-08-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/group/task/policy/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改分组优先级配置</p>
     * 
     * @param request UpdateTaskPolicyRequest
     * @return UpdateTaskPolicyResponse
     */
    public UpdateTaskPolicyResponse updateTaskPolicy(String groupId, UpdateTaskPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTaskPolicyWithOptions(groupId, request, headers, runtime);
    }
}
