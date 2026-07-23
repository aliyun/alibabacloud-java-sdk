// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520;

import com.aliyun.tea.*;
import com.aliyun.agentloop20260520.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-zhangjiakou", "agentloop.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "agentloop.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "agentloop.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "agentloop.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agentloop.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "agentloop.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "agentloop.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing", "agentloop.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "agentloop.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentloop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Appends structured data rows to a specified dataset without requiring the client to construct SQL statements.</p>
     * 
     * @param request AddDatasetDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDatasetDataResponse
     */
    public AddDatasetDataResponse addDatasetDataWithOptions(String agentSpace, String datasetName, AddDatasetDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataArray)) {
            body.put("dataArray", request.dataArray);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDatasetData"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetName) + "/rows"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDatasetDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Appends structured data rows to a specified dataset without requiring the client to construct SQL statements.</p>
     * 
     * @param request AddDatasetDataRequest
     * @return AddDatasetDataResponse
     */
    public AddDatasetDataResponse addDatasetData(String agentSpace, String datasetName, AddDatasetDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDatasetDataWithOptions(agentSpace, datasetName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a pipeline run.</p>
     * 
     * @param request CancelPipelineRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPipelineRunResponse
     */
    public CancelPipelineRunResponse cancelPipelineRunWithOptions(String agentSpace, String pipelineName, String runId, CancelPipelineRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPipelineRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/runs/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + "/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPipelineRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a pipeline run.</p>
     * 
     * @param request CancelPipelineRunRequest
     * @return CancelPipelineRunResponse
     */
    public CancelPipelineRunResponse cancelPipelineRun(String agentSpace, String pipelineName, String runId, CancelPipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelPipelineRunWithOptions(agentSpace, pipelineName, runId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an AgentSpace.</p>
     * 
     * @param request CreateAgentSpaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentSpaceResponse
     */
    public CreateAgentSpaceResponse createAgentSpaceWithOptions(CreateAgentSpaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            body.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmsWorkspace)) {
            body.put("cmsWorkspace", request.cmsWorkspace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trajectoryStoreEnabled)) {
            body.put("trajectoryStoreEnabled", request.trajectoryStoreEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentSpace"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentSpaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an AgentSpace.</p>
     * 
     * @param request CreateAgentSpaceRequest
     * @return CreateAgentSpaceResponse
     */
    public CreateAgentSpaceResponse createAgentSpace(CreateAgentSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentSpaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a context store.</p>
     * 
     * @param request CreateContextStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextStoreResponse
     */
    public CreateContextStoreResponse createContextStoreWithOptions(String agentSpace, CreateContextStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreName)) {
            body.put("contextStoreName", request.contextStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextType)) {
            body.put("contextType", request.contextType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextStore"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a context store.</p>
     * 
     * @param request CreateContextStoreRequest
     * @return CreateContextStoreResponse
     */
    public CreateContextStoreResponse createContextStore(String agentSpace, CreateContextStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContextStoreWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key.</p>
     * 
     * @param request CreateContextStoreAPIKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextStoreAPIKeyResponse
     */
    public CreateContextStoreAPIKeyResponse createContextStoreAPIKeyWithOptions(String agentSpace, String contextStoreName, CreateContextStoreAPIKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextStoreAPIKey"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + "/apikey"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextStoreAPIKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key.</p>
     * 
     * @param request CreateContextStoreAPIKeyRequest
     * @return CreateContextStoreAPIKeyResponse
     */
    public CreateContextStoreAPIKeyResponse createContextStoreAPIKey(String agentSpace, String contextStoreName, CreateContextStoreAPIKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContextStoreAPIKeyWithOptions(agentSpace, contextStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset.</p>
     * 
     * @param request CreateDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDatasetWithOptions(String agentSpace, CreateDatasetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("datasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataset"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset.</p>
     * 
     * @param request CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(String agentSpace, CreateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatasetWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the CreateEvaluationTask operation to create an evaluation task in a specified AgentSpace. The server verifies AgentSpace permissions, initializes evaluation result storage, checks the uniqueness of the task name, and asynchronously creates and executes an EvaluationRun based on <code>taskMode</code> and <code>runStrategies</code>.
     * This operation is applicable to running built-in or custom evaluators on Trace, Dataset, or SLS Log data. It supports two execution strategies: historical backfill and continuous evaluation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an evaluation task.</p>
     * 
     * @param request CreateEvaluationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEvaluationTaskResponse
     */
    public CreateEvaluationTaskResponse createEvaluationTaskWithOptions(String agentSpace, CreateEvaluationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFilter)) {
            body.put("dataFilter", request.dataFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("dataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluators)) {
            body.put("evaluators", request.evaluators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runStrategies)) {
            body.put("runStrategies", request.runStrategies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskMode)) {
            body.put("taskMode", request.taskMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEvaluationTask"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEvaluationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls the CreateEvaluationTask operation to create an evaluation task in a specified AgentSpace. The server verifies AgentSpace permissions, initializes evaluation result storage, checks the uniqueness of the task name, and asynchronously creates and executes an EvaluationRun based on <code>taskMode</code> and <code>runStrategies</code>.
     * This operation is applicable to running built-in or custom evaluators on Trace, Dataset, or SLS Log data. It supports two execution strategies: historical backfill and continuous evaluation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an evaluation task.</p>
     * 
     * @param request CreateEvaluationTaskRequest
     * @return CreateEvaluationTaskResponse
     */
    public CreateEvaluationTaskResponse createEvaluationTask(String agentSpace, CreateEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvaluationTaskWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an evaluator.</p>
     * 
     * @param request CreateEvaluatorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEvaluatorResponse
     */
    public CreateEvaluatorResponse createEvaluatorWithOptions(String agentSpace, CreateEvaluatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            body.put("metricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            body.put("properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionDescription)) {
            body.put("versionDescription", request.versionDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEvaluator"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluators/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEvaluatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an evaluator.</p>
     * 
     * @param request CreateEvaluatorRequest
     * @return CreateEvaluatorResponse
     */
    public CreateEvaluatorResponse createEvaluator(String agentSpace, CreateEvaluatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvaluatorWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an evaluator skill.</p>
     * 
     * @param request CreateEvaluatorSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEvaluatorSkillResponse
     */
    public CreateEvaluatorSkillResponse createEvaluatorSkillWithOptions(String name, CreateEvaluatorSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            body.put("skillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEvaluatorSkill"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluator/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEvaluatorSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an evaluator skill.</p>
     * 
     * @param request CreateEvaluatorSkillRequest
     * @return CreateEvaluatorSkillResponse
     */
    public CreateEvaluatorSkillResponse createEvaluatorSkill(String name, CreateEvaluatorSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEvaluatorSkillWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls CreateExperimentPlan to create an experiment plan under a specified AgentSpace. Use this operation to define the configuration of an offline or online experiment, including the data source, optional evaluators, and experiment groups required for online experiments. After the plan is created, call CreateExperimentRun to start execution.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an experiment plan.</p>
     * 
     * @param request CreateExperimentPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentPlanResponse
     */
    public CreateExperimentPlanResponse createExperimentPlanWithOptions(String agentSpace, CreateExperimentPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluators)) {
            body.put("evaluators", request.evaluators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentType)) {
            body.put("experimentType", request.experimentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experiments)) {
            body.put("experiments", request.experiments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            body.put("planName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.querySql)) {
            body.put("querySql", request.querySql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedItemIds)) {
            body.put("selectedItemIds", request.selectedItemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentPlan"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/plans"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls CreateExperimentPlan to create an experiment plan under a specified AgentSpace. Use this operation to define the configuration of an offline or online experiment, including the data source, optional evaluators, and experiment groups required for online experiments. After the plan is created, call CreateExperimentRun to start execution.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an experiment plan.</p>
     * 
     * @param request CreateExperimentPlanRequest
     * @return CreateExperimentPlanResponse
     */
    public CreateExperimentPlanResponse createExperimentPlan(String agentSpace, CreateExperimentPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentPlanWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls CreateExperimentRun to initiate an experiment execution based on an existing experiment plan. For online experiments, you typically only need to pass <code>experimentPlanId</code>. For offline experiments, you need to pass <code>offlineExperiments</code> (1 to 5 items).</p>
     * 
     * <b>summary</b> : 
     * <p>Executes an experiment.</p>
     * 
     * @param request CreateExperimentRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentRunResponse
     */
    public CreateExperimentRunResponse createExperimentRunWithOptions(String agentSpace, CreateExperimentRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.completedAt)) {
            body.put("completedAt", request.completedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.completedTasks)) {
            body.put("completedTasks", request.completedTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executedAt)) {
            body.put("executedAt", request.executedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentPlanId)) {
            body.put("experimentPlanId", request.experimentPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failedTasks)) {
            body.put("failedTasks", request.failedTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offlineExperiments)) {
            body.put("offlineExperiments", request.offlineExperiments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("recordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalTasks)) {
            body.put("totalTasks", request.totalTasks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentruns/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/execute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls CreateExperimentRun to initiate an experiment execution based on an existing experiment plan. For online experiments, you typically only need to pass <code>experimentPlanId</code>. For offline experiments, you need to pass <code>offlineExperiments</code> (1 to 5 items).</p>
     * 
     * <b>summary</b> : 
     * <p>Executes an experiment.</p>
     * 
     * @param request CreateExperimentRunRequest
     * @return CreateExperimentRunResponse
     */
    public CreateExperimentRunResponse createExperimentRun(String agentSpace, CreateExperimentRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentRunWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pipeline.</p>
     * 
     * @param request CreatePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipelineWithOptions(String agentSpace, CreatePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executePolicy)) {
            body.put("executePolicy", request.executePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipeline)) {
            body.put("pipeline", request.pipeline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineName)) {
            body.put("pipelineName", request.pipelineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sink)) {
            body.put("sink", request.sink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pipeline.</p>
     * 
     * @param request CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipeline(String agentSpace, CreatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an AgentSpace.</p>
     * 
     * @param request DeleteAgentSpaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentSpaceResponse
     */
    public DeleteAgentSpaceResponse deleteAgentSpaceWithOptions(String agentSpace, DeleteAgentSpaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteCmsWorkspace)) {
            query.put("deleteCmsWorkspace", request.deleteCmsWorkspace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteMseNamespace)) {
            query.put("deleteMseNamespace", request.deleteMseNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteSlsProject)) {
            query.put("deleteSlsProject", request.deleteSlsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentSpace"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentSpaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an AgentSpace.</p>
     * 
     * @param request DeleteAgentSpaceRequest
     * @return DeleteAgentSpaceResponse
     */
    public DeleteAgentSpaceResponse deleteAgentSpace(String agentSpace, DeleteAgentSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentSpaceWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a context store.</p>
     * 
     * @param request DeleteContextStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextStoreResponse
     */
    public DeleteContextStoreResponse deleteContextStoreWithOptions(String agentSpace, String contextStoreName, DeleteContextStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextStore"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a context store.</p>
     * 
     * @param request DeleteContextStoreRequest
     * @return DeleteContextStoreResponse
     */
    public DeleteContextStoreResponse deleteContextStore(String agentSpace, String contextStoreName, DeleteContextStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContextStoreWithOptions(agentSpace, contextStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API key.</p>
     * 
     * @param request DeleteContextStoreAPIKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextStoreAPIKeyResponse
     */
    public DeleteContextStoreAPIKeyResponse deleteContextStoreAPIKeyWithOptions(String agentSpace, String contextStoreName, String name, DeleteContextStoreAPIKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextStoreAPIKey"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + "/apikey/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextStoreAPIKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API key.</p>
     * 
     * @param request DeleteContextStoreAPIKeyRequest
     * @return DeleteContextStoreAPIKeyResponse
     */
    public DeleteContextStoreAPIKeyResponse deleteContextStoreAPIKey(String agentSpace, String contextStoreName, String name, DeleteContextStoreAPIKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContextStoreAPIKeyWithOptions(agentSpace, contextStoreName, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
     * @param request DeleteDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDatasetWithOptions(String agentSpace, String datasetName, DeleteDatasetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataset"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
     * @param request DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDataset(String agentSpace, String datasetName, DeleteDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatasetWithOptions(agentSpace, datasetName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluation run.</p>
     * 
     * @param request DeleteEvaluationRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEvaluationRunResponse
     */
    public DeleteEvaluationRunResponse deleteEvaluationRunWithOptions(String agentSpace, String taskId, String runId, DeleteEvaluationRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEvaluationRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/run/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEvaluationRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluation run.</p>
     * 
     * @param request DeleteEvaluationRunRequest
     * @return DeleteEvaluationRunResponse
     */
    public DeleteEvaluationRunResponse deleteEvaluationRun(String agentSpace, String taskId, String runId, DeleteEvaluationRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEvaluationRunWithOptions(agentSpace, taskId, runId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluation task.</p>
     * 
     * @param request DeleteEvaluationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEvaluationTaskResponse
     */
    public DeleteEvaluationTaskResponse deleteEvaluationTaskWithOptions(String agentSpace, String taskId, DeleteEvaluationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEvaluationTask"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluation task.</p>
     * 
     * @param request DeleteEvaluationTaskRequest
     * @return DeleteEvaluationTaskResponse
     */
    public DeleteEvaluationTaskResponse deleteEvaluationTask(String agentSpace, String taskId, DeleteEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEvaluationTaskWithOptions(agentSpace, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluator.</p>
     * 
     * @param request DeleteEvaluatorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEvaluatorResponse
     */
    public DeleteEvaluatorResponse deleteEvaluatorWithOptions(String agentSpace, String name, DeleteEvaluatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEvaluator"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluators/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEvaluatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluator.</p>
     * 
     * @param request DeleteEvaluatorRequest
     * @return DeleteEvaluatorResponse
     */
    public DeleteEvaluatorResponse deleteEvaluator(String agentSpace, String name, DeleteEvaluatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEvaluatorWithOptions(agentSpace, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluator skill.</p>
     * 
     * @param request DeleteEvaluatorSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEvaluatorSkillResponse
     */
    public DeleteEvaluatorSkillResponse deleteEvaluatorSkillWithOptions(String name, String skillName, DeleteEvaluatorSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEvaluatorSkill"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluator/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEvaluatorSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an evaluator skill.</p>
     * 
     * @param request DeleteEvaluatorSkillRequest
     * @return DeleteEvaluatorSkillResponse
     */
    public DeleteEvaluatorSkillResponse deleteEvaluatorSkill(String name, String skillName, DeleteEvaluatorSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEvaluatorSkillWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls DeleteExperimentPlan to delete a specified experiment plan. After deletion, no new executions can be initiated based on this plan. Existing experiment records can still be queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an experiment plan.</p>
     * 
     * @param request DeleteExperimentPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentPlanResponse
     */
    public DeleteExperimentPlanResponse deleteExperimentPlanWithOptions(String agentSpace, String planId, DeleteExperimentPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentPlan"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls DeleteExperimentPlan to delete a specified experiment plan. After deletion, no new executions can be initiated based on this plan. Existing experiment records can still be queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an experiment plan.</p>
     * 
     * @param request DeleteExperimentPlanRequest
     * @return DeleteExperimentPlanResponse
     */
    public DeleteExperimentPlanResponse deleteExperimentPlan(String agentSpace, String planId, DeleteExperimentPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentPlanWithOptions(agentSpace, planId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls DeleteExperimentRun to delete a specified experiment run record. Deleting the record does not delete the experiment plan to which it belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an experiment record.</p>
     * 
     * @param request DeleteExperimentRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentRunResponse
     */
    public DeleteExperimentRunResponse deleteExperimentRunWithOptions(String agentSpace, String recordId, DeleteExperimentRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentruns/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/records/" + com.aliyun.openapiutil.Client.getEncodeParam(recordId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls DeleteExperimentRun to delete a specified experiment run record. Deleting the record does not delete the experiment plan to which it belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an experiment record.</p>
     * 
     * @param request DeleteExperimentRunRequest
     * @return DeleteExperimentRunResponse
     */
    public DeleteExperimentRunResponse deleteExperimentRun(String agentSpace, String recordId, DeleteExperimentRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentRunWithOptions(agentSpace, recordId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a pipeline.</p>
     * 
     * @param request DeletePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipelineWithOptions(String agentSpace, String pipelineName, DeletePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a pipeline.</p>
     * 
     * @param request DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipeline(String agentSpace, String pipelineName, DeletePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions.</p>
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2026-05-20"),
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
     * <p>Queries regions.</p>
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
     * <p>Executes a query statement.</p>
     * 
     * @param request ExecuteQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteQueryResponse
     */
    public ExecuteQueryResponse executeQueryWithOptions(String agentSpace, String datasetName, ExecuteQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            body.put("length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxOutputLength)) {
            body.put("maxOutputLength", request.maxOutputLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteQuery"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetName) + "/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a query statement.</p>
     * 
     * @param request ExecuteQueryRequest
     * @return ExecuteQueryResponse
     */
    public ExecuteQueryResponse executeQuery(String agentSpace, String datasetName, ExecuteQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeQueryWithOptions(agentSpace, datasetName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an AgentSpace.</p>
     * 
     * @param request GetAgentSpaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSpaceResponse
     */
    public GetAgentSpaceResponse getAgentSpaceWithOptions(String agentSpace, GetAgentSpaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSpace"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSpaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an AgentSpace.</p>
     * 
     * @param request GetAgentSpaceRequest
     * @return GetAgentSpaceResponse
     */
    public GetAgentSpaceResponse getAgentSpace(String agentSpace, GetAgentSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentSpaceWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a context store.</p>
     * 
     * @param request GetContextStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextStoreResponse
     */
    public GetContextStoreResponse getContextStoreWithOptions(String agentSpace, String contextStoreName, GetContextStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextStore"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a context store.</p>
     * 
     * @param request GetContextStoreRequest
     * @return GetContextStoreResponse
     */
    public GetContextStoreResponse getContextStore(String agentSpace, String contextStoreName, GetContextStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContextStoreWithOptions(agentSpace, contextStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves an API key.</p>
     * 
     * @param request GetContextStoreAPIKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextStoreAPIKeyResponse
     */
    public GetContextStoreAPIKeyResponse getContextStoreAPIKeyWithOptions(String agentSpace, String contextStoreName, String name, GetContextStoreAPIKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextStoreAPIKey"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + "/apikey/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextStoreAPIKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves an API key.</p>
     * 
     * @param request GetContextStoreAPIKeyRequest
     * @return GetContextStoreAPIKeyResponse
     */
    public GetContextStoreAPIKeyResponse getContextStoreAPIKey(String agentSpace, String contextStoreName, String name, GetContextStoreAPIKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContextStoreAPIKeyWithOptions(agentSpace, contextStoreName, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a dataset.</p>
     * 
     * @param request GetDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDatasetWithOptions(String agentSpace, String datasetName, GetDatasetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataset"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a dataset.</p>
     * 
     * @param request GetDatasetRequest
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDataset(String agentSpace, String datasetName, GetDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasetWithOptions(agentSpace, datasetName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluation run.</p>
     * 
     * @param request GetEvaluationRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEvaluationRunResponse
     */
    public GetEvaluationRunResponse getEvaluationRunWithOptions(String agentSpace, String taskId, String runId, GetEvaluationRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvaluationRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/run/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEvaluationRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluation run.</p>
     * 
     * @param request GetEvaluationRunRequest
     * @return GetEvaluationRunResponse
     */
    public GetEvaluationRunResponse getEvaluationRun(String agentSpace, String taskId, String runId, GetEvaluationRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEvaluationRunWithOptions(agentSpace, taskId, runId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluation task.</p>
     * 
     * @param request GetEvaluationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEvaluationTaskResponse
     */
    public GetEvaluationTaskResponse getEvaluationTaskWithOptions(String agentSpace, String taskId, GetEvaluationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvaluationTask"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluation task.</p>
     * 
     * @param request GetEvaluationTaskRequest
     * @return GetEvaluationTaskResponse
     */
    public GetEvaluationTaskResponse getEvaluationTask(String agentSpace, String taskId, GetEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEvaluationTaskWithOptions(agentSpace, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluator.</p>
     * 
     * @param request GetEvaluatorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEvaluatorResponse
     */
    public GetEvaluatorResponse getEvaluatorWithOptions(String agentSpace, String name, GetEvaluatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvaluator"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluators/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEvaluatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluator.</p>
     * 
     * @param request GetEvaluatorRequest
     * @return GetEvaluatorResponse
     */
    public GetEvaluatorResponse getEvaluator(String agentSpace, String name, GetEvaluatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEvaluatorWithOptions(agentSpace, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluator skill.</p>
     * 
     * @param request GetEvaluatorSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEvaluatorSkillResponse
     */
    public GetEvaluatorSkillResponse getEvaluatorSkillWithOptions(String name, String skillName, GetEvaluatorSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvaluatorSkill"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluator/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEvaluatorSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an evaluator skill.</p>
     * 
     * @param request GetEvaluatorSkillRequest
     * @return GetEvaluatorSkillResponse
     */
    public GetEvaluatorSkillResponse getEvaluatorSkill(String name, String skillName, GetEvaluatorSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEvaluatorSkillWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the GetExperimentPlan operation to query the complete configuration of a specified experiment plan, including experiment groups, data sources, evaluators, and timestamps.</p>
     * 
     * <b>summary</b> : 
     * <p>Query an experiment plan</p>
     * 
     * @param request GetExperimentPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentPlanResponse
     */
    public GetExperimentPlanResponse getExperimentPlanWithOptions(String agentSpace, String planId, GetExperimentPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentPlan"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls the GetExperimentPlan operation to query the complete configuration of a specified experiment plan, including experiment groups, data sources, evaluators, and timestamps.</p>
     * 
     * <b>summary</b> : 
     * <p>Query an experiment plan</p>
     * 
     * @param request GetExperimentPlanRequest
     * @return GetExperimentPlanResponse
     */
    public GetExperimentPlanResponse getExperimentPlan(String agentSpace, String planId, GetExperimentPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentPlanWithOptions(agentSpace, planId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls GetExperimentRun to query the details of a specific experiment run record, including the status, progress, configuration snapshot, and associated evaluation task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an experiment run record.</p>
     * 
     * @param request GetExperimentRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentRunResponse
     */
    public GetExperimentRunResponse getExperimentRunWithOptions(String agentSpace, String recordId, GetExperimentRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentruns/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/records/" + com.aliyun.openapiutil.Client.getEncodeParam(recordId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls GetExperimentRun to query the details of a specific experiment run record, including the status, progress, configuration snapshot, and associated evaluation task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an experiment run record.</p>
     * 
     * @param request GetExperimentRunRequest
     * @return GetExperimentRunResponse
     */
    public GetExperimentRunResponse getExperimentRun(String agentSpace, String recordId, GetExperimentRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentRunWithOptions(agentSpace, recordId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a CI/CD pipeline.</p>
     * 
     * @param request GetPipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipelineWithOptions(String agentSpace, String pipelineName, GetPipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a CI/CD pipeline.</p>
     * 
     * @param request GetPipelineRequest
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipeline(String agentSpace, String pipelineName, GetPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a single pipeline run.</p>
     * 
     * @param request GetPipelineRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineRunResponse
     */
    public GetPipelineRunResponse getPipelineRunWithOptions(String agentSpace, String pipelineName, String runId, GetPipelineRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/runs/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a single pipeline run.</p>
     * 
     * @param request GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    public GetPipelineRunResponse getPipelineRun(String agentSpace, String pipelineName, String runId, GetPipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineRunWithOptions(agentSpace, pipelineName, runId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries pipeline run statistics.</p>
     * 
     * @param request GetPipelineStatsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineStatsResponse
     */
    public GetPipelineStatsResponse getPipelineStatsWithOptions(String agentSpace, String pipelineName, GetPipelineStatsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineStats"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/stats"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries pipeline run statistics.</p>
     * 
     * @param request GetPipelineStatsRequest
     * @return GetPipelineStatsResponse
     */
    public GetPipelineStatsResponse getPipelineStats(String agentSpace, String pipelineName, GetPipelineStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineStatsWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AgentSpaces.</p>
     * 
     * @param request ListAgentSpacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSpacesResponse
     */
    public ListAgentSpacesResponse listAgentSpacesWithOptions(ListAgentSpacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentSpaces"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSpacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AgentSpaces.</p>
     * 
     * @param request ListAgentSpacesRequest
     * @return ListAgentSpacesResponse
     */
    public ListAgentSpacesResponse listAgentSpaces(ListAgentSpacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentSpacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of API keys.</p>
     * 
     * @param request ListContextStoreAPIKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextStoreAPIKeysResponse
     */
    public ListContextStoreAPIKeysResponse listContextStoreAPIKeysWithOptions(String agentSpace, String contextStoreName, ListContextStoreAPIKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListContextStoreAPIKeys"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + "/apikey"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextStoreAPIKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of API keys.</p>
     * 
     * @param request ListContextStoreAPIKeysRequest
     * @return ListContextStoreAPIKeysResponse
     */
    public ListContextStoreAPIKeysResponse listContextStoreAPIKeys(String agentSpace, String contextStoreName, ListContextStoreAPIKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContextStoreAPIKeysWithOptions(agentSpace, contextStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of context stores.</p>
     * 
     * @param request ListContextStoresRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextStoresResponse
     */
    public ListContextStoresResponse listContextStoresWithOptions(String agentSpace, ListContextStoresRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreName)) {
            query.put("contextStoreName", request.contextStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextType)) {
            query.put("contextType", request.contextType);
        }

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
            new TeaPair("action", "ListContextStores"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextStoresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of context stores.</p>
     * 
     * @param request ListContextStoresRequest
     * @return ListContextStoresResponse
     */
    public ListContextStoresResponse listContextStores(String agentSpace, ListContextStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContextStoresWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets.</p>
     * 
     * @param request ListDatasetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasetsWithOptions(String agentSpace, ListDatasetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("datasetName", request.datasetName);
        }

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
            new TeaPair("action", "ListDatasets"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets.</p>
     * 
     * @param request ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasets(String agentSpace, ListDatasetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatasetsWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of evaluation runs.</p>
     * 
     * @param request ListEvaluationRunsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluationRunsResponse
     */
    public ListEvaluationRunsResponse listEvaluationRunsWithOptions(String agentSpace, String taskId, ListEvaluationRunsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runType)) {
            query.put("runType", request.runType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluationRuns"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/runs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluationRunsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of evaluation runs.</p>
     * 
     * @param request ListEvaluationRunsRequest
     * @return ListEvaluationRunsResponse
     */
    public ListEvaluationRunsResponse listEvaluationRuns(String agentSpace, String taskId, ListEvaluationRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEvaluationRunsWithOptions(agentSpace, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of evaluation tasks.</p>
     * 
     * @param request ListEvaluationTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluationTasksResponse
     */
    public ListEvaluationTasksResponse listEvaluationTasksWithOptions(ListEvaluationTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("dataType", request.dataType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskMode)) {
            query.put("taskMode", request.taskMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluationTasks"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of evaluation tasks.</p>
     * 
     * @param request ListEvaluationTasksRequest
     * @return ListEvaluationTasksResponse
     */
    public ListEvaluationTasksResponse listEvaluationTasks(ListEvaluationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEvaluationTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the skill list of an evaluator.</p>
     * 
     * @param request ListEvaluatorSkillsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluatorSkillsResponse
     */
    public ListEvaluatorSkillsResponse listEvaluatorSkillsWithOptions(String name, ListEvaluatorSkillsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

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
            new TeaPair("action", "ListEvaluatorSkills"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluator/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skills"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluatorSkillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the skill list of an evaluator.</p>
     * 
     * @param request ListEvaluatorSkillsRequest
     * @return ListEvaluatorSkillsResponse
     */
    public ListEvaluatorSkillsResponse listEvaluatorSkills(String name, ListEvaluatorSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEvaluatorSkillsWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of evaluators.</p>
     * 
     * @param request ListEvaluatorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluatorsResponse
     */
    public ListEvaluatorsResponse listEvaluatorsWithOptions(ListEvaluatorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
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

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluators"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluators"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluatorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of evaluators.</p>
     * 
     * @param request ListEvaluatorsRequest
     * @return ListEvaluatorsResponse
     */
    public ListEvaluatorsResponse listEvaluators(ListEvaluatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEvaluatorsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls ListExperimentPlans to query the list of experiment plans under a specified AgentSpace for the current account. Supports fuzzy match by plan name, filtering by status, and pagination using <code>offset</code>/<code>limit</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of experiment plans.</p>
     * 
     * @param request ListExperimentPlansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentPlansResponse
     */
    public ListExperimentPlansResponse listExperimentPlansWithOptions(String agentSpace, ListExperimentPlansRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("planName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperimentPlans"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/plans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentPlansResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls ListExperimentPlans to query the list of experiment plans under a specified AgentSpace for the current account. Supports fuzzy match by plan name, filtering by status, and pagination using <code>offset</code>/<code>limit</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of experiment plans.</p>
     * 
     * @param request ListExperimentPlansRequest
     * @return ListExperimentPlansResponse
     */
    public ListExperimentPlansResponse listExperimentPlans(String agentSpace, ListExperimentPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentPlansWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls ListExperimentRuns to query experiment run records under a specified AgentSpace for the current account. You can filter results by status, dataset, plan name, or experiment name, and use <code>page</code>/<code>pageSize</code> for pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of experiment run records.</p>
     * 
     * @param request ListExperimentRunsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentRunsResponse
     */
    public ListExperimentRunsResponse listExperimentRunsWithOptions(String agentSpace, ListExperimentRunsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentName)) {
            query.put("experimentName", request.experimentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("planName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperimentRuns"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentruns/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/records"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentRunsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls ListExperimentRuns to query experiment run records under a specified AgentSpace for the current account. You can filter results by status, dataset, plan name, or experiment name, and use <code>page</code>/<code>pageSize</code> for pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of experiment run records.</p>
     * 
     * @param request ListExperimentRunsRequest
     * @return ListExperimentRunsResponse
     */
    public ListExperimentRunsResponse listExperimentRuns(String agentSpace, ListExperimentRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentRunsWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution history list of a pipeline.</p>
     * 
     * @param request ListPipelineRunsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRunsWithOptions(String agentSpace, String pipelineName, ListPipelineRunsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("triggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineRuns"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/runs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRunsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution history list of a pipeline.</p>
     * 
     * @param request ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRuns(String agentSpace, String pipelineName, ListPipelineRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRunsWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists CI/CD pipelines.</p>
     * 
     * @param request ListPipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelinesWithOptions(String agentSpace, ListPipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineName)) {
            query.put("pipelineName", request.pipelineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleStatus)) {
            query.put("scheduleStatus", request.scheduleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("scheduleType", request.scheduleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelines"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists CI/CD pipelines.</p>
     * 
     * @param request ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(String agentSpace, ListPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses a pipeline.</p>
     * 
     * @param request PausePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PausePipelineResponse
     */
    public PausePipelineResponse pausePipelineWithOptions(String agentSpace, String pipelineName, PausePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PausePipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/pause"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PausePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses a pipeline.</p>
     * 
     * @param request PausePipelineRequest
     * @return PausePipelineResponse
     */
    public PausePipelineResponse pausePipeline(String agentSpace, String pipelineName, PausePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pausePipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>agentSpace</strong> must be an AgentSpace instance that has been created under the current account.</li>
     * <li><strong>source.type</strong> currently supports only the <code>logstore</code> type. The <code>logstore.project</code> and <code>logstore.logstore</code> must be authorized within the AgentSpace and located in the same region.</li>
     * <li><strong>pipeline.nodes</strong> must contain at least one node of the <code>Source</code> type and cannot be empty.</li>
     * <li><strong>fromTime</strong> and <strong>toTime</strong> are UNIX timestamps in seconds. <strong>fromTime</strong> must be less than <strong>toTime</strong>.</li>
     * <li>A maximum of 5 records are returned, and internal system fields of the data source are automatically filtered out.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Previews a pipeline. Without creating pipeline resources, performs a trial query based on the specified data source, node orchestration, and time range, and returns a small number of sample data records for authenticating parameter settings and previewing processing results.</p>
     * 
     * @param request PreviewPipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewPipelineResponse
     */
    public PreviewPipelineResponse previewPipelineWithOptions(String agentSpace, PreviewPipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            body.put("fromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipeline)) {
            body.put("pipeline", request.pipeline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            body.put("toTime", request.toTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewPipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/preview"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewPipelineResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>agentSpace</strong> must be an AgentSpace instance that has been created under the current account.</li>
     * <li><strong>source.type</strong> currently supports only the <code>logstore</code> type. The <code>logstore.project</code> and <code>logstore.logstore</code> must be authorized within the AgentSpace and located in the same region.</li>
     * <li><strong>pipeline.nodes</strong> must contain at least one node of the <code>Source</code> type and cannot be empty.</li>
     * <li><strong>fromTime</strong> and <strong>toTime</strong> are UNIX timestamps in seconds. <strong>fromTime</strong> must be less than <strong>toTime</strong>.</li>
     * <li>A maximum of 5 records are returned, and internal system fields of the data source are automatically filtered out.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Previews a pipeline. Without creating pipeline resources, performs a trial query based on the specified data source, node orchestration, and time range, and returns a small number of sample data records for authenticating parameter settings and previewing processing results.</p>
     * 
     * @param request PreviewPipelineRequest
     * @return PreviewPipelineResponse
     */
    public PreviewPipelineResponse previewPipeline(String agentSpace, PreviewPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewPipelineWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a pipeline.</p>
     * 
     * @param request ResumePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumePipelineResponse
     */
    public ResumePipelineResponse resumePipelineWithOptions(String agentSpace, String pipelineName, ResumePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumePipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a pipeline.</p>
     * 
     * @param request ResumePipelineRequest
     * @return ResumePipelineResponse
     */
    public ResumePipelineResponse resumePipeline(String agentSpace, String pipelineName, ResumePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumePipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Manually triggers a pipeline execution.</p>
     * 
     * @param request RunPipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunPipelineResponse
     */
    public RunPipelineResponse runPipelineWithOptions(String agentSpace, String pipelineName, RunPipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            body.put("fromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            body.put("toTime", request.toTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunPipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunPipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Manually triggers a pipeline execution.</p>
     * 
     * @param request RunPipelineRequest
     * @return RunPipelineResponse
     */
    public RunPipelineResponse runPipeline(String agentSpace, String pipelineName, RunPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runPipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches contexts.</p>
     * 
     * @param request SearchContextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchContextResponse
     */
    public SearchContextResponse searchContextWithOptions(String agentSpace, String contextStoreName, SearchContextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatted)) {
            body.put("formatted", request.formatted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retrievalOption)) {
            body.put("retrievalOption", request.retrievalOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            body.put("threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchContext"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + "/context/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchContextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches contexts.</p>
     * 
     * @param request SearchContextRequest
     * @return SearchContextResponse
     */
    public SearchContextResponse searchContext(String agentSpace, String contextStoreName, SearchContextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchContextWithOptions(agentSpace, contextStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a pipeline.</p>
     * 
     * @param request TerminatePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminatePipelineResponse
     */
    public TerminatePipelineResponse terminatePipelineWithOptions(String agentSpace, String pipelineName, TerminatePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminatePipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + "/terminate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a pipeline.</p>
     * 
     * @param request TerminatePipelineRequest
     * @return TerminatePipelineResponse
     */
    public TerminatePipelineResponse terminatePipeline(String agentSpace, String pipelineName, TerminatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.terminatePipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an AgentSpace.</p>
     * 
     * @param request UpdateAgentSpaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentSpaceResponse
     */
    public UpdateAgentSpaceResponse updateAgentSpaceWithOptions(String agentSpace, UpdateAgentSpaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cmsWorkspace)) {
            body.put("cmsWorkspace", request.cmsWorkspace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentSpace"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentSpaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an AgentSpace.</p>
     * 
     * @param request UpdateAgentSpaceRequest
     * @return UpdateAgentSpaceResponse
     */
    public UpdateAgentSpaceResponse updateAgentSpace(String agentSpace, UpdateAgentSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentSpaceWithOptions(agentSpace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a context store.</p>
     * 
     * @param request UpdateContextStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextStoreResponse
     */
    public UpdateContextStoreResponse updateContextStoreWithOptions(String agentSpace, String contextStoreName, UpdateContextStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextType)) {
            body.put("contextType", request.contextType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextStore"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/contextstore/" + com.aliyun.openapiutil.Client.getEncodeParam(contextStoreName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a context store.</p>
     * 
     * @param request UpdateContextStoreRequest
     * @return UpdateContextStoreResponse
     */
    public UpdateContextStoreResponse updateContextStore(String agentSpace, String contextStoreName, UpdateContextStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContextStoreWithOptions(agentSpace, contextStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a dataset.</p>
     * 
     * @param request UpdateDatasetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDatasetWithOptions(String agentSpace, String datasetName, UpdateDatasetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataset"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/dataset/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a dataset.</p>
     * 
     * @param request UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDataset(String agentSpace, String datasetName, UpdateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatasetWithOptions(agentSpace, datasetName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluation run.</p>
     * 
     * @param request UpdateEvaluationRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEvaluationRunResponse
     */
    public UpdateEvaluationRunResponse updateEvaluationRunWithOptions(String agentSpace, String taskId, String runId, UpdateEvaluationRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateEvaluationRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/run/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEvaluationRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluation run.</p>
     * 
     * @param request UpdateEvaluationRunRequest
     * @return UpdateEvaluationRunResponse
     */
    public UpdateEvaluationRunResponse updateEvaluationRun(String agentSpace, String taskId, String runId, UpdateEvaluationRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEvaluationRunWithOptions(agentSpace, taskId, runId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluation task.</p>
     * 
     * @param request UpdateEvaluationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEvaluationTaskResponse
     */
    public UpdateEvaluationTaskResponse updateEvaluationTaskWithOptions(String agentSpace, String taskId, UpdateEvaluationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFilter)) {
            body.put("dataFilter", request.dataFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluators)) {
            body.put("evaluators", request.evaluators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runStrategies)) {
            body.put("runStrategies", request.runStrategies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEvaluationTask"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluation-task/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluation task.</p>
     * 
     * @param request UpdateEvaluationTaskRequest
     * @return UpdateEvaluationTaskResponse
     */
    public UpdateEvaluationTaskResponse updateEvaluationTask(String agentSpace, String taskId, UpdateEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEvaluationTaskWithOptions(agentSpace, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluator.</p>
     * 
     * @param request UpdateEvaluatorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEvaluatorResponse
     */
    public UpdateEvaluatorResponse updateEvaluatorWithOptions(String agentSpace, String name, UpdateEvaluatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            body.put("properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionDescription)) {
            body.put("versionDescription", request.versionDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEvaluator"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluators/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEvaluatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluator.</p>
     * 
     * @param request UpdateEvaluatorRequest
     * @return UpdateEvaluatorResponse
     */
    public UpdateEvaluatorResponse updateEvaluator(String agentSpace, String name, UpdateEvaluatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEvaluatorWithOptions(agentSpace, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluator skill.</p>
     * 
     * @param request UpdateEvaluatorSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEvaluatorSkillResponse
     */
    public UpdateEvaluatorSkillResponse updateEvaluatorSkillWithOptions(String name, String skillName, UpdateEvaluatorSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEvaluatorSkill"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/evaluator/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEvaluatorSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an evaluator skill.</p>
     * 
     * @param request UpdateEvaluatorSkillRequest
     * @return UpdateEvaluatorSkillResponse
     */
    public UpdateEvaluatorSkillResponse updateEvaluatorSkill(String name, String skillName, UpdateEvaluatorSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEvaluatorSkillWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls UpdateExperimentPlan to update a specified experiment plan. Fields that are not passed remain unchanged. Only plans created by the current account can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an experiment plan.</p>
     * 
     * @param request UpdateExperimentPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentPlanResponse
     */
    public UpdateExperimentPlanResponse updateExperimentPlanWithOptions(String agentSpace, String planId, UpdateExperimentPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetProject)) {
            body.put("datasetProject", request.datasetProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluators)) {
            body.put("evaluators", request.evaluators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentType)) {
            body.put("experimentType", request.experimentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experiments)) {
            body.put("experiments", request.experiments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            body.put("planName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.querySql)) {
            body.put("querySql", request.querySql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedItemIds)) {
            body.put("selectedItemIds", request.selectedItemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentPlan"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls UpdateExperimentPlan to update a specified experiment plan. Fields that are not passed remain unchanged. Only plans created by the current account can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an experiment plan.</p>
     * 
     * @param request UpdateExperimentPlanRequest
     * @return UpdateExperimentPlanResponse
     */
    public UpdateExperimentPlanResponse updateExperimentPlan(String agentSpace, String planId, UpdateExperimentPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentPlanWithOptions(agentSpace, planId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls UpdateExperimentRun to update the name, status, and task counts of an experiment record. Fields that are not specified remain unchanged. Typical sequence for offline experiments: running → progress writeback → completed.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an experiment run.</p>
     * 
     * @param request UpdateExperimentRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentRunResponse
     */
    public UpdateExperimentRunResponse updateExperimentRunWithOptions(String agentSpace, String recordId, UpdateExperimentRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.completedAt)) {
            body.put("completedAt", request.completedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.completedTasks)) {
            body.put("completedTasks", request.completedTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executedAt)) {
            body.put("executedAt", request.executedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failedTasks)) {
            body.put("failedTasks", request.failedTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("recordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalTasks)) {
            body.put("totalTasks", request.totalTasks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentRun"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentruns/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/records/" + com.aliyun.openapiutil.Client.getEncodeParam(recordId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls UpdateExperimentRun to update the name, status, and task counts of an experiment record. Fields that are not specified remain unchanged. Typical sequence for offline experiments: running → progress writeback → completed.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an experiment run.</p>
     * 
     * @param request UpdateExperimentRunRequest
     * @return UpdateExperimentRunResponse
     */
    public UpdateExperimentRunResponse updateExperimentRun(String agentSpace, String recordId, UpdateExperimentRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentRunWithOptions(agentSpace, recordId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a pipeline.</p>
     * 
     * @param request UpdatePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipelineWithOptions(String agentSpace, String pipelineName, UpdatePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executePolicy)) {
            body.put("executePolicy", request.executePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipeline)) {
            body.put("pipeline", request.pipeline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sink)) {
            body.put("sink", request.sink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipeline"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentspace/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpace) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a pipeline.</p>
     * 
     * @param request UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipeline(String agentSpace, String pipelineName, UpdatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }
}
