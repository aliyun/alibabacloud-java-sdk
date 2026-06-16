// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520;

import com.aliyun.tea.*;
import com.aliyun.agentloop20260520.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
     * <p>给记忆库中增加数据</p>
     * 
     * @param request AddMem0MemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMem0MemoriesResponse
     */
    public AddMem0MemoriesResponse addMem0MemoriesWithOptions(AddMem0MemoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMem0Memories"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/memories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new AddMem0MemoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>给记忆库中增加数据</p>
     * 
     * @param request AddMem0MemoriesRequest
     * @return AddMem0MemoriesResponse
     */
    public AddMem0MemoriesResponse addMem0Memories(AddMem0MemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMem0MemoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建AgentSpace</p>
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
     * <p>创建AgentSpace</p>
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
     * <p>创建上下文库</p>
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
     * <p>创建上下文库</p>
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
     * <p>创建 API Key</p>
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
     * <p>创建 API Key</p>
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
     * <p>创建数据集</p>
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
     * <p>创建数据集</p>
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
     * <b>summary</b> : 
     * <p>删除AgentSpace</p>
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
     * <p>删除AgentSpace</p>
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
     * <p>删除上下文库</p>
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
     * <p>删除上下文库</p>
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
     * <p>删除 API Key</p>
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
     * <p>删除 API Key</p>
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
     * <p>删除数据集</p>
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
     * <p>删除数据集</p>
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
     * <p>批量删除记忆</p>
     * 
     * @param tmpReq DeleteMem0MemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMem0MemoriesResponse
     */
    public DeleteMem0MemoriesResponse deleteMem0MemoriesWithOptions(DeleteMem0MemoriesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteMem0MemoriesShrinkRequest request = new DeleteMem0MemoriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metadata)) {
            request.metadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metadata, "metadata", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("app_id", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreId)) {
            query.put("context_store_id", request.contextStoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadataShrink)) {
            query.put("metadata", request.metadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("project_id", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("run_id", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMem0Memories"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/memories"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new DeleteMem0MemoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除记忆</p>
     * 
     * @param request DeleteMem0MemoriesRequest
     * @return DeleteMem0MemoriesResponse
     */
    public DeleteMem0MemoriesResponse deleteMem0Memories(DeleteMem0MemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMem0MemoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除记忆</p>
     * 
     * @param request DeleteMem0MemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMem0MemoryResponse
     */
    public DeleteMem0MemoryResponse deleteMem0MemoryWithOptions(String memoryId, DeleteMem0MemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreId)) {
            query.put("context_store_id", request.contextStoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("project_id", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMem0Memory"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new DeleteMem0MemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除记忆</p>
     * 
     * @param request DeleteMem0MemoryRequest
     * @return DeleteMem0MemoryResponse
     */
    public DeleteMem0MemoryResponse deleteMem0Memory(String memoryId, DeleteMem0MemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMem0MemoryWithOptions(memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线</p>
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
     * <p>删除流水线</p>
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
     * <p>查询Regions</p>
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
     * <p>查询Regions</p>
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
     * <p>执行查询语句</p>
     * 
     * @param request ExecuteQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteQueryResponse
     */
    public ExecuteQueryResponse executeQueryWithOptions(String agentSpace, String datasetName, ExecuteQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
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
     * <p>执行查询语句</p>
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
     * <p>查询AgentSpace</p>
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
     * <p>查询AgentSpace</p>
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
     * <p>查询上下文库</p>
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
     * <p>查询上下文库</p>
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
     * <p>获取 API Key</p>
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
     * <p>获取 API Key</p>
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
     * <p>查询数据集</p>
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
     * <p>查询数据集</p>
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
     * <p>查询记忆库数据</p>
     * 
     * @param request GetMem0MemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMem0MemoriesResponse
     */
    public GetMem0MemoriesResponse getMem0MemoriesWithOptions(GetMem0MemoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreId)) {
            query.put("context_store_id", request.contextStoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGraph)) {
            query.put("enable_graph", request.enableGraph);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("project_id", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMem0Memories"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/memories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetMem0MemoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询记忆库数据</p>
     * 
     * @param request GetMem0MemoriesRequest
     * @return GetMem0MemoriesResponse
     */
    public GetMem0MemoriesResponse getMem0Memories(GetMem0MemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMem0MemoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询记忆</p>
     * 
     * @param request GetMem0MemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMem0MemoryResponse
     */
    public GetMem0MemoryResponse getMem0MemoryWithOptions(String memoryId, GetMem0MemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreId)) {
            query.put("context_store_id", request.contextStoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("project_id", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMem0Memory"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetMem0MemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询记忆</p>
     * 
     * @param request GetMem0MemoryRequest
     * @return GetMem0MemoryResponse
     */
    public GetMem0MemoryResponse getMem0Memory(String memoryId, GetMem0MemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMem0MemoryWithOptions(memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流水线</p>
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
     * <p>查询流水线</p>
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
     * <p>查询AgentSpace列表</p>
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
     * <p>查询AgentSpace列表</p>
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
     * <p>获取 API Key 列表</p>
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
     * <p>获取 API Key 列表</p>
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
     * <p>查询上下文库列表</p>
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
     * <p>查询上下文库列表</p>
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
     * <p>查询数据集列表</p>
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
     * <p>查询数据集列表</p>
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
     * <p>查询流水线列表</p>
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
     * <p>查询流水线列表</p>
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
     * <p>搜索上下文</p>
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
     * <p>搜索上下文</p>
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
     * <p>查询记忆库内容</p>
     * 
     * @param request SearchMem0MemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMem0MemoriesResponse
     */
    public SearchMem0MemoriesResponse searchMem0MemoriesWithOptions(SearchMem0MemoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreId)) {
            query.put("context_store_id", request.contextStoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGraph)) {
            query.put("enable_graph", request.enableGraph);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("project_id", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMem0Memories"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/memories/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new SearchMem0MemoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询记忆库内容</p>
     * 
     * @param request SearchMem0MemoriesRequest
     * @return SearchMem0MemoriesResponse
     */
    public SearchMem0MemoriesResponse searchMem0Memories(SearchMem0MemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMem0MemoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新AgentSpace</p>
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
     * <p>更新AgentSpace</p>
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
     * <p>修改上下文库配置</p>
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
     * <p>修改上下文库配置</p>
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
     * <p>更新数据集</p>
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
     * <p>更新数据集</p>
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
     * <p>修改记忆</p>
     * 
     * @param request UpdateMem0MemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMem0MemoryResponse
     */
    public UpdateMem0MemoryResponse updateMem0MemoryWithOptions(String memoryId, UpdateMem0MemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpace)) {
            query.put("agentSpace", request.agentSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextStoreId)) {
            query.put("context_store_id", request.contextStoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("project_id", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMem0Memory"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new UpdateMem0MemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改记忆</p>
     * 
     * @param request UpdateMem0MemoryRequest
     * @return UpdateMem0MemoryResponse
     */
    public UpdateMem0MemoryResponse updateMem0Memory(String memoryId, UpdateMem0MemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMem0MemoryWithOptions(memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线</p>
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
     * <p>更新流水线</p>
     * 
     * @param request UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipeline(String agentSpace, String pipelineName, UpdatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineWithOptions(agentSpace, pipelineName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验 Mem0 / ContextStore API Key</p>
     * 
     * @param request ValidateMem0APIKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateMem0APIKeyResponse
     */
    public ValidateMem0APIKeyResponse validateMem0APIKeyWithOptions(ValidateMem0APIKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ValidateMem0APIKey"),
            new TeaPair("version", "2026-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/ping"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ValidateMem0APIKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验 Mem0 / ContextStore API Key</p>
     * 
     * @param request ValidateMem0APIKeyRequest
     * @return ValidateMem0APIKeyResponse
     */
    public ValidateMem0APIKeyResponse validateMem0APIKey(ValidateMem0APIKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateMem0APIKeyWithOptions(request, headers, runtime);
    }
}
