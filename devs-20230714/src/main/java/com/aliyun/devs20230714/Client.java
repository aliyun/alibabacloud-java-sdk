// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714;

import com.aliyun.tea.*;
import com.aliyun.devs20230714.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("devs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>激活身份绑定,完成OAuth授权</p>
     * 
     * @param request ActivateConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateConnectionResponse
     */
    public ActivateConnectionResponse activateConnectionWithOptions(String name, ActivateConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            body.put("credential", request.credential);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateConnection"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/connections/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/activate"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ActivateConnectionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>激活身份绑定,完成OAuth授权</p>
     * 
     * @param request ActivateConnectionRequest
     * @return ActivateConnectionResponse
     */
    public ActivateConnectionResponse activateConnection(String name, ActivateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateConnectionWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消流水线</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPipelineResponse
     */
    public CancelPipelineResponse cancelPipelineWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPipeline"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/cancel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CancelPipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>取消流水线</p>
     * @return CancelPipelineResponse
     */
    public CancelPipelineResponse cancelPipeline(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelPipelineWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTaskWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/cancel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CancelTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>取消任务</p>
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建交付物存储</p>
     * 
     * @param request CreateArtifactRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArtifactResponse
     */
    public CreateArtifactResponse createArtifactWithOptions(CreateArtifactRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArtifact"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/artifacts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建交付物存储</p>
     * 
     * @param request CreateArtifactRequest
     * @return CreateArtifactResponse
     */
    public CreateArtifactResponse createArtifact(CreateArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createArtifactWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建环境</p>
     * 
     * @param request CreateEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironmentWithOptions(String projectName, CreateEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvironment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvironmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateEnvironmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建环境</p>
     * 
     * @param request CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(String projectName, CreateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流水线</p>
     * 
     * @param request CreatePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipelineWithOptions(CreatePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipeline"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/pipelines"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建流水线</p>
     * 
     * @param request CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineWithOptions(request, headers, runtime);
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
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProjectResponse());
        }

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
     * <p>创建任务</p>
     * 
     * @param request CreateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTaskResponse());
        }

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
     * <p>删除交付物</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteArtifactResponse
     */
    public DeleteArtifactResponse deleteArtifactWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteArtifact"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/artifacts/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除交付物</p>
     * @return DeleteArtifactResponse
     */
    public DeleteArtifactResponse deleteArtifact(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteArtifactWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除身份绑定</p>
     * 
     * @param request DeleteConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnectionWithOptions(String name, DeleteConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteConnection"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/connections/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteConnectionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除身份绑定</p>
     * 
     * @param request DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(String name, DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConnectionWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除环境</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironmentWithOptions(String projectName, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteEnvironmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除环境</p>
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(String projectName, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentWithOptions(projectName, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String name, DeleteProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String name, DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手动触发环境部署</p>
     * 
     * @param request DeployEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployEnvironmentResponse
     */
    public DeployEnvironmentResponse deployEnvironmentWithOptions(String projectName, String name, DeployEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployEnvironment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/deploy"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeployEnvironmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeployEnvironmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>手动触发环境部署</p>
     * 
     * @param request DeployEnvironmentRequest
     * @return DeployEnvironmentResponse
     */
    public DeployEnvironmentResponse deployEnvironment(String projectName, String name, DeployEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployEnvironmentWithOptions(projectName, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取交付物的zip包临时下载地址url</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchArtifactDownloadUrlResponse
     */
    public FetchArtifactDownloadUrlResponse fetchArtifactDownloadUrlWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchArtifactDownloadUrl"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/artifacts/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/fetchCode"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FetchArtifactDownloadUrlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FetchArtifactDownloadUrlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取交付物的zip包临时下载地址url</p>
     * @return FetchArtifactDownloadUrlResponse
     */
    public FetchArtifactDownloadUrlResponse fetchArtifactDownloadUrl(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fetchArtifactDownloadUrlWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取交付物临时上传的bucket、object和临时sts</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchArtifactTempBucketTokenResponse
     */
    public FetchArtifactTempBucketTokenResponse fetchArtifactTempBucketTokenWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchArtifactTempBucketToken"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/artifacts/action/fetchTempBucketToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FetchArtifactTempBucketTokenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FetchArtifactTempBucketTokenResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取交付物临时上传的bucket、object和临时sts</p>
     * @return FetchArtifactTempBucketTokenResponse
     */
    public FetchArtifactTempBucketTokenResponse fetchArtifactTempBucketToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fetchArtifactTempBucketTokenWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询身份绑定中的凭证信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchConnectionCredentialResponse
     */
    public FetchConnectionCredentialResponse fetchConnectionCredentialWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchConnectionCredential"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/connections/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/fetchCredential"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FetchConnectionCredentialResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FetchConnectionCredentialResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询身份绑定中的凭证信息</p>
     * @return FetchConnectionCredentialResponse
     */
    public FetchConnectionCredentialResponse fetchConnectionCredential(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fetchConnectionCredentialWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询交付物</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactResponse
     */
    public GetArtifactResponse getArtifactWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifact"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/artifacts/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询交付物</p>
     * @return GetArtifactResponse
     */
    public GetArtifactResponse getArtifact(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getArtifactWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取环境信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnvironmentResponse
     */
    public GetEnvironmentResponse getEnvironmentWithOptions(String projectName, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetEnvironmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取环境信息</p>
     * @return GetEnvironmentResponse
     */
    public GetEnvironmentResponse getEnvironment(String projectName, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(projectName, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询环境部署信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnvironmentDeploymentResponse
     */
    public GetEnvironmentDeploymentResponse getEnvironmentDeploymentWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironmentDeployment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/environmentdeployments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentDeploymentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetEnvironmentDeploymentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询环境部署信息</p>
     * @return GetEnvironmentDeploymentResponse
     */
    public GetEnvironmentDeploymentResponse getEnvironmentDeployment(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentDeploymentWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流水线</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipelineWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipeline"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询流水线</p>
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipeline(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询项目</p>
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询仓库绑定</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepositoryWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepository"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/repositories/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询仓库绑定</p>
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepository(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务部署信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceDeploymentResponse
     */
    public GetServiceDeploymentResponse getServiceDeploymentWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceDeployment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/servicedeployments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceDeploymentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetServiceDeploymentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询服务部署信息</p>
     * @return GetServiceDeploymentResponse
     */
    public GetServiceDeploymentResponse getServiceDeployment(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceDeploymentWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询任务</p>
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询身份绑定</p>
     * 
     * @param tmpReq ListConnectionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnectionsWithOptions(ListConnectionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListConnectionsShrinkRequest request = new ListConnectionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "labelSelector", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            query.put("labelSelector", request.labelSelectorShrink);
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
            new TeaPair("action", "ListConnections"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/connections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListConnectionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量查询身份绑定</p>
     * 
     * @param request ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConnectionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询环境列表</p>
     * 
     * @param tmpReq ListEnvironmentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironmentsWithOptions(String projectName, ListEnvironmentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListEnvironmentsShrinkRequest request = new ListEnvironmentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "labelSelector", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            query.put("labelSelector", request.labelSelectorShrink);
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
            new TeaPair("action", "ListEnvironments"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListEnvironmentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询环境列表</p>
     * 
     * @param request ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(String projectName, ListEnvironmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(projectName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询流水线</p>
     * 
     * @param tmpReq ListPipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelinesWithOptions(ListPipelinesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPipelinesShrinkRequest request = new ListPipelinesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "labelSelector", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            query.put("labelSelector", request.labelSelectorShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelines"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/pipelines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelinesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelinesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量查询流水线</p>
     * 
     * @param request ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询项目</p>
     * 
     * @param tmpReq ListProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "labelSelector", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            query.put("labelSelector", request.labelSelectorShrink);
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
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量查询项目</p>
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
     * <p>批量查询服务部署信息</p>
     * 
     * @param tmpReq ListServiceDeploymentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceDeploymentsResponse
     */
    public ListServiceDeploymentsResponse listServiceDeploymentsWithOptions(ListServiceDeploymentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListServiceDeploymentsShrinkRequest request = new ListServiceDeploymentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "labelSelector", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            query.put("labelSelector", request.labelSelectorShrink);
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
            new TeaPair("action", "ListServiceDeployments"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/servicedeployments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceDeploymentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListServiceDeploymentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量查询服务部署信息</p>
     * 
     * @param request ListServiceDeploymentsRequest
     * @return ListServiceDeploymentsResponse
     */
    public ListServiceDeploymentsResponse listServiceDeployments(ListServiceDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceDeploymentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询任务</p>
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSelector)) {
            request.labelSelectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSelector, "labelSelector", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelSelectorShrink)) {
            query.put("labelSelector", request.labelSelectorShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTasksResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量查询任务</p>
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
     * <p>预览环境变更信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewEnvironmentResponse
     */
    public PreviewEnvironmentResponse previewEnvironmentWithOptions(String projectName, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewEnvironment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewEnvironmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PreviewEnvironmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>预览环境变更信息</p>
     * @return PreviewEnvironmentResponse
     */
    public PreviewEnvironmentResponse previewEnvironment(String projectName, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewEnvironmentWithOptions(projectName, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新交付物</p>
     * 
     * @param request PutArtifactRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutArtifactResponse
     */
    public PutArtifactResponse putArtifactWithOptions(String name, PutArtifactRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutArtifact"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/artifacts/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PutArtifactResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PutArtifactResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新交付物</p>
     * 
     * @param request PutArtifactRequest
     * @return PutArtifactResponse
     */
    public PutArtifactResponse putArtifact(String name, PutArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putArtifactWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线状态</p>
     * 
     * @param request PutPipelineStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutPipelineStatusResponse
     */
    public PutPipelineStatusResponse putPipelineStatusWithOptions(String name, PutPipelineStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutPipelineStatus"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/status"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PutPipelineStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PutPipelineStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线状态</p>
     * 
     * @param request PutPipelineStatusRequest
     * @return PutPipelineStatusResponse
     */
    public PutPipelineStatusResponse putPipelineStatus(String name, PutPipelineStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putPipelineStatusWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新替换任务状态</p>
     * 
     * @param request PutTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutTaskStatusResponse
     */
    public PutTaskStatusResponse putTaskStatusWithOptions(String name, PutTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutTaskStatus"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/status"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PutTaskStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PutTaskStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新替换任务状态</p>
     * 
     * @param request PutTaskStatusRequest
     * @return PutTaskStatusResponse
     */
    public PutTaskStatusResponse putTaskStatus(String name, PutTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putTaskStatusWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解析模板中的服务、变量配置</p>
     * 
     * @param request RenderServicesByTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenderServicesByTemplateResponse
     */
    public RenderServicesByTemplateResponse renderServicesByTemplateWithOptions(RenderServicesByTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("projectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNameChanges)) {
            body.put("serviceNameChanges", request.serviceNameChanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableValues)) {
            body.put("variableValues", request.variableValues);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderServicesByTemplate"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/templates/action/renderServices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RenderServicesByTemplateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RenderServicesByTemplateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>解析模板中的服务、变量配置</p>
     * 
     * @param request RenderServicesByTemplateRequest
     * @return RenderServicesByTemplateResponse
     */
    public RenderServicesByTemplateResponse renderServicesByTemplate(RenderServicesByTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renderServicesByTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>确认并继续执行任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTaskResponse
     */
    public ResumeTaskResponse resumeTaskWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeTask"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/resume"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResumeTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>确认并继续执行任务</p>
     * @return ResumeTaskResponse
     */
    public ResumeTaskResponse resumeTask(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeTaskWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重试执行任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryTaskResponse
     */
    public RetryTaskResponse retryTaskWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryTask"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/retry"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RetryTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RetryTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>重试执行任务</p>
     * @return RetryTaskResponse
     */
    public RetryTaskResponse retryTask(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryTaskWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开始执行流水线</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPipelineResponse
     */
    public StartPipelineResponse startPipelineWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPipeline"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartPipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartPipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>开始执行流水线</p>
     * @return StartPipelineResponse
     */
    public StartPipelineResponse startPipeline(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startPipelineWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开始执行任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTaskResponse
     */
    public StartTaskResponse startTaskWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTask"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/start"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>开始执行任务</p>
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTaskWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新环境（局部更新）</p>
     * 
     * @param request UpdateEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvironmentResponse
     */
    public UpdateEnvironmentResponse updateEnvironmentWithOptions(String projectName, String name, UpdateEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironment"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateEnvironmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新环境（局部更新）</p>
     * 
     * @param request UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    public UpdateEnvironmentResponse updateEnvironment(String projectName, String name, UpdateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentWithOptions(projectName, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新替换应用</p>
     * 
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(String name, UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2023-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-07-14/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新替换应用</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(String name, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(name, request, headers, runtime);
    }
}
