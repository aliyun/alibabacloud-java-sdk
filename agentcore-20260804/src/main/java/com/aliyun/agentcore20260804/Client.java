// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804;

import com.aliyun.tea.*;
import com.aliyun.agentcore20260804.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentcore", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Writes messages or text to a memory store. By default, sync is set to true, which means the operation synchronously waits for extraction and returns only memories (an empty array is allowed). If sync is set to false, the operation returns only a taskId, which you can query by calling GetMemoryTask.</p>
     * 
     * <b>summary</b> : 
     * <p>Writes messages or text to a memory store. By default, sync is set to true, which means the operation synchronously waits for extraction and returns only memories (an empty array is allowed). If sync is set to false, the operation returns only a taskId, which you can query by calling GetMemoryTask.</p>
     * 
     * @param tmpReq AddMemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMemoriesResponse
     */
    public AddMemoriesResponse addMemoriesWithOptions(String workspaceId, String memoryStoreName, AddMemoriesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddMemoriesShrinkRequest request = new AddMemoriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMemories"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMemoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Writes messages or text to a memory store. By default, sync is set to true, which means the operation synchronously waits for extraction and returns only memories (an empty array is allowed). If sync is set to false, the operation returns only a taskId, which you can query by calling GetMemoryTask.</p>
     * 
     * <b>summary</b> : 
     * <p>Writes messages or text to a memory store. By default, sync is set to true, which means the operation synchronously waits for extraction and returns only memories (an empty array is allowed). If sync is set to false, the operation returns only a taskId, which you can query by calling GetMemoryTask.</p>
     * 
     * @param request AddMemoriesRequest
     * @return AddMemoriesResponse
     */
    public AddMemoriesResponse addMemories(String workspaceId, String memoryStoreName, AddMemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMemoriesWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple models in a specified workspace. If any model is in use, the entire batch request fails.</p>
     * 
     * @param tmpReq BatchDeleteModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteModelsResponse
     */
    public BatchDeleteModelsResponse batchDeleteModelsWithOptions(String workspaceId, BatchDeleteModelsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteModelsShrinkRequest request = new BatchDeleteModelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteModels"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models/actions/batch-delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple models in a specified workspace. If any model is in use, the entire batch request fails.</p>
     * 
     * @param request BatchDeleteModelsRequest
     * @return BatchDeleteModelsResponse
     */
    public BatchDeleteModelsResponse batchDeleteModels(String workspaceId, BatchDeleteModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteModelsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Uploads skill ZIP packages in batches through OSS and returns the processing result for each skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads skill ZIP packages in batches through OSS and returns the processing result for each skill.</p>
     * 
     * @param tmpReq BatchUploadSkillsViaOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUploadSkillsViaOssResponse
     */
    public BatchUploadSkillsViaOssResponse batchUploadSkillsViaOssWithOptions(String workspaceId, BatchUploadSkillsViaOssRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUploadSkillsViaOssShrinkRequest request = new BatchUploadSkillsViaOssShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUploadSkillsViaOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skill-actions/batch-upload-via-oss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUploadSkillsViaOssResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Uploads skill ZIP packages in batches through OSS and returns the processing result for each skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads skill ZIP packages in batches through OSS and returns the processing result for each skill.</p>
     * 
     * @param request BatchUploadSkillsViaOssRequest
     * @return BatchUploadSkillsViaOssResponse
     */
    public BatchUploadSkillsViaOssResponse batchUploadSkillsViaOss(String workspaceId, BatchUploadSkillsViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUploadSkillsViaOssWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disables template usage constraints. After the conversion, the MCP retains its source and tags, but no longer appears on the usage page.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts an MCP to free-edit mode.</p>
     * 
     * @param request ConvertMcpToFreeEditRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertMcpToFreeEditResponse
     */
    public ConvertMcpToFreeEditResponse convertMcpToFreeEditWithOptions(String workspaceId, String mcpServerId, ConvertMcpToFreeEditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertMcpToFreeEdit"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + "/convert-to-free-edit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertMcpToFreeEditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disables template usage constraints. After the conversion, the MCP retains its source and tags, but no longer appears on the usage page.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts an MCP to free-edit mode.</p>
     * 
     * @param request ConvertMcpToFreeEditRequest
     * @return ConvertMcpToFreeEditResponse
     */
    public ConvertMcpToFreeEditResponse convertMcpToFreeEdit(String workspaceId, String mcpServerId, ConvertMcpToFreeEditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.convertMcpToFreeEditWithOptions(workspaceId, mcpServerId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible ServiceEndpoint.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible ServiceEndpoint.</p>
     * 
     * @param tmpReq CreateAgentIMChannelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentIMChannelResponse
     */
    public CreateAgentIMChannelResponse createAgentIMChannelWithOptions(String workspaceId, String agentId, CreateAgentIMChannelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentIMChannelShrinkRequest request = new CreateAgentIMChannelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentIMChannel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/im-channels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentIMChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible ServiceEndpoint.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible ServiceEndpoint.</p>
     * 
     * @param request CreateAgentIMChannelRequest
     * @return CreateAgentIMChannelResponse
     */
    public CreateAgentIMChannelResponse createAgentIMChannel(String workspaceId, String agentId, CreateAgentIMChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentIMChannelWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates an AgentSpec in a specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentSpec in a specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * @param tmpReq CreateAgentSpecRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentSpecResponse
     */
    public CreateAgentSpecResponse createAgentSpecWithOptions(String workspaceId, CreateAgentSpecRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentSpecShrinkRequest request = new CreateAgentSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentSpec"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentSpecResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates an AgentSpec in a specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentSpec in a specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * @param request CreateAgentSpecRequest
     * @return CreateAgentSpecResponse
     */
    public CreateAgentSpecResponse createAgentSpec(String workspaceId, CreateAgentSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentSpecWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist and must not have a draft currently being edited.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist and must not have a draft currently being edited.</p>
     * 
     * @param tmpReq CreateAgentSpecVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentSpecVersionResponse
     */
    public CreateAgentSpecVersionResponse createAgentSpecVersionWithOptions(String workspaceId, String agentSpecName, CreateAgentSpecVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentSpecVersionShrinkRequest request = new CreateAgentSpecVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentSpecVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentSpecVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist and must not have a draft currently being edited.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist and must not have a draft currently being edited.</p>
     * 
     * @param request CreateAgentSpecVersionRequest
     * @return CreateAgentSpecVersionResponse
     */
    public CreateAgentSpecVersionResponse createAgentSpecVersion(String workspaceId, String agentSpecName, CreateAgentSpecVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentSpecVersionWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a credential in a workspace for authentication of services such as Connector.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a credential in a specified workspace for authentication when an agent accesses external services. Currently, only the apiKey type is supported. The credential content is passed as a JSON string through credentialMetadata and can only be queried in a desensitized format after it is written.</p>
     * 
     * @param tmpReq CreateCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredentialWithOptions(String workspaceId, CreateCredentialRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCredentialShrinkRequest request = new CreateCredentialShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/credentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a credential in a workspace for authentication of services such as Connector.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a credential in a specified workspace for authentication when an agent accesses external services. Currently, only the apiKey type is supported. The credential content is passed as a JSON string through credentialMetadata and can only be queried in a desensitized format after it is written.</p>
     * 
     * @param request CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredential(String workspaceId, CreateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCredentialWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, prepare a writable workspace, a RAM role ARN, a container image or code package, and runtime configurations. You must specify name, artifact, roleArn, and runtime. The runtime parameter must include both compute and sessionPolicy.
     * In container mode, use artifact.container and specify artifact.port. The image must have the required access permissions and be accessible over the network allowed by the workspace.
     * In code package pattern, specify artifact.port, and the sourceUri, languageRuntime, and entrypoint of artifact.code. Do not specify container at the same time. Dependencies must be packaged by the user. ZIP and TAR.GZ formats are supported. The compressed package size cannot exceed 500,000,000 bytes. You can call ListAgentCodeRuntimes to query the runtime environment identity. The sourceUri parameter supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including signed URLs. For local files, call GetAgentCodePackageUploadUrl to obtain an upload URL, upload the file directly, and then commit the returned sourceUri.
     * When you submit a new code package source, the backend rechecks the read permissions, object, and size. The configuration is saved only after the transfer succeeds. If the transfer fails, the configuration is not saved. Saved fixed packages can be reused. Set the client timeout to 210 seconds for code package requests. Archive integrity and secure decompression are checked at startup. A successful acceptance does not mean that the agent is ready to run.
     * The creation process is asynchronous. A successful response indicates that the request is accepted. You can use the returned agentId to call GetCustomAgent and check the latestVersionStatus, latestExecutionError, and status corresponding to latestSpecVersion to confirm the deployment result. After the deployment is ready, you can call CreateServiceEndpoint to configure the access endpoint.
     * The clientToken parameter does not provide idempotency guarantees. Do not rely on this parameter to prevent duplicate requests. The healthyThreshold parameter for health checks does not take effect. Omit this parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom agent in a specified workspace. Container image and code package deployments are supported. The creation process is asynchronous. You can call GetCustomAgent to query the deployment result.</p>
     * 
     * @param tmpReq CreateCustomAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomAgentResponse
     */
    public CreateCustomAgentResponse createCustomAgentWithOptions(String workspaceId, CreateCustomAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCustomAgentShrinkRequest request = new CreateCustomAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-agents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, prepare a writable workspace, a RAM role ARN, a container image or code package, and runtime configurations. You must specify name, artifact, roleArn, and runtime. The runtime parameter must include both compute and sessionPolicy.
     * In container mode, use artifact.container and specify artifact.port. The image must have the required access permissions and be accessible over the network allowed by the workspace.
     * In code package pattern, specify artifact.port, and the sourceUri, languageRuntime, and entrypoint of artifact.code. Do not specify container at the same time. Dependencies must be packaged by the user. ZIP and TAR.GZ formats are supported. The compressed package size cannot exceed 500,000,000 bytes. You can call ListAgentCodeRuntimes to query the runtime environment identity. The sourceUri parameter supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including signed URLs. For local files, call GetAgentCodePackageUploadUrl to obtain an upload URL, upload the file directly, and then commit the returned sourceUri.
     * When you submit a new code package source, the backend rechecks the read permissions, object, and size. The configuration is saved only after the transfer succeeds. If the transfer fails, the configuration is not saved. Saved fixed packages can be reused. Set the client timeout to 210 seconds for code package requests. Archive integrity and secure decompression are checked at startup. A successful acceptance does not mean that the agent is ready to run.
     * The creation process is asynchronous. A successful response indicates that the request is accepted. You can use the returned agentId to call GetCustomAgent and check the latestVersionStatus, latestExecutionError, and status corresponding to latestSpecVersion to confirm the deployment result. After the deployment is ready, you can call CreateServiceEndpoint to configure the access endpoint.
     * The clientToken parameter does not provide idempotency guarantees. Do not rely on this parameter to prevent duplicate requests. The healthyThreshold parameter for health checks does not take effect. Omit this parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom agent in a specified workspace. Container image and code package deployments are supported. The creation process is asynchronous. You can call GetCustomAgent to query the deployment result.</p>
     * 
     * @param request CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    public CreateCustomAgentResponse createCustomAgent(String workspaceId, CreateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an external agent in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an external agent in a specified workspace.</p>
     * 
     * @param tmpReq CreateExternalAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExternalAgentResponse
     */
    public CreateExternalAgentResponse createExternalAgentWithOptions(String workspaceId, CreateExternalAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateExternalAgentShrinkRequest request = new CreateExternalAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExternalAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExternalAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an external agent in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an external agent in a specified workspace.</p>
     * 
     * @param request CreateExternalAgentRequest
     * @return CreateExternalAgentResponse
     */
    public CreateExternalAgentResponse createExternalAgent(String workspaceId, CreateExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExternalAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates the Bootstrap token and CMS configuration required to onboard a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates the Bootstrap token and CMS configuration required to onboard a specified external agent.</p>
     * 
     * @param request CreateExternalAgentBootstrapTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExternalAgentBootstrapTokenResponse
     */
    public CreateExternalAgentBootstrapTokenResponse createExternalAgentBootstrapTokenWithOptions(String workspaceId, String agentId, CreateExternalAgentBootstrapTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("networkType", request.networkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExternalAgentBootstrapToken"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/bootstrap/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExternalAgentBootstrapTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates the Bootstrap token and CMS configuration required to onboard a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates the Bootstrap token and CMS configuration required to onboard a specified external agent.</p>
     * 
     * @param request CreateExternalAgentBootstrapTokenRequest
     * @return CreateExternalAgentBootstrapTokenResponse
     */
    public CreateExternalAgentBootstrapTokenResponse createExternalAgentBootstrapToken(String workspaceId, String agentId, CreateExternalAgentBootstrapTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExternalAgentBootstrapTokenWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>A workspace can be bound to only one external identity provider. The identityProviderType parameter supports DingTalk, Feishu, and CustomSSO. CustomSSO only initializes the shared user pool. Do not pass non-empty metadata, and do not pass true for loginEnabled or syncEnabled. By default, both switches are turned off. Protocols and SAML configurations are saved by calling UpdateIdentityProvider. SCIM is configured through a separate API. Saving SAML first is not required. After the request is accepted and CONFIGURED is returned, call GetIdentityProvider and wait for the user pool initialization to complete. READY only indicates that the resource is ready, not that SAML is configured. If the same CustomSSO binding is in the CONFIGURED or READY state, the existing binding may be returned. Not all states can be treated as repeatedly creatable.
     * For DingTalk, appKey, appSecret, and corpId are required in metadata. For Feishu, appId and appSecret are required. The vendor login switch is enabled by default. The synchronization switch is disabled by default. When synchronization is enabled, encryptKey and verificationToken are also required. The vendor syncOnBind and syncScope parameters retain the existing department-based synchronization definitions. Do not use these vendor pull parameters to replace SCIM configurations during CustomSSO initialization.</p>
     * <h2>Requests and examples</h2>
     * <p>POST /workspaces/{workspaceId}/identity-providers
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. The ws-example, URL, certificate, and token in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/identity-providers
     * {&quot;identityProviderType&quot;: &quot;CustomSSO&quot;}
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false,
     *     &quot;status&quot;: &quot;CONFIGURED&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call failure to an upstream service may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 409 IdentityProviderAlreadyBound: An external binding already exists. Query and reuse the correct binding first. Do not automatically unbind the entire binding. Asynchronous initialization failure does not equal HTTP request failure. You must continue to query the status.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds an external identity provider to a specified workspace for single sign-on and organization member synchronization of workspace users. A maximum of one external identity provider can be bound to each workspace. The binding is an asynchronous operation. After the API returns, you can query the status by calling GetIdentityProvider to track the progress.</p>
     * 
     * @param tmpReq CreateIdentityProviderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProviderWithOptions(String workspaceId, CreateIdentityProviderRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIdentityProviderShrinkRequest request = new CreateIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityProvider"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>A workspace can be bound to only one external identity provider. The identityProviderType parameter supports DingTalk, Feishu, and CustomSSO. CustomSSO only initializes the shared user pool. Do not pass non-empty metadata, and do not pass true for loginEnabled or syncEnabled. By default, both switches are turned off. Protocols and SAML configurations are saved by calling UpdateIdentityProvider. SCIM is configured through a separate API. Saving SAML first is not required. After the request is accepted and CONFIGURED is returned, call GetIdentityProvider and wait for the user pool initialization to complete. READY only indicates that the resource is ready, not that SAML is configured. If the same CustomSSO binding is in the CONFIGURED or READY state, the existing binding may be returned. Not all states can be treated as repeatedly creatable.
     * For DingTalk, appKey, appSecret, and corpId are required in metadata. For Feishu, appId and appSecret are required. The vendor login switch is enabled by default. The synchronization switch is disabled by default. When synchronization is enabled, encryptKey and verificationToken are also required. The vendor syncOnBind and syncScope parameters retain the existing department-based synchronization definitions. Do not use these vendor pull parameters to replace SCIM configurations during CustomSSO initialization.</p>
     * <h2>Requests and examples</h2>
     * <p>POST /workspaces/{workspaceId}/identity-providers
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. The ws-example, URL, certificate, and token in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/identity-providers
     * {&quot;identityProviderType&quot;: &quot;CustomSSO&quot;}
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false,
     *     &quot;status&quot;: &quot;CONFIGURED&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call failure to an upstream service may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 409 IdentityProviderAlreadyBound: An external binding already exists. Query and reuse the correct binding first. Do not automatically unbind the entire binding. Asynchronous initialization failure does not equal HTTP request failure. You must continue to query the status.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds an external identity provider to a specified workspace for single sign-on and organization member synchronization of workspace users. A maximum of one external identity provider can be bound to each workspace. The binding is an asynchronous operation. After the API returns, you can query the status by calling GetIdentityProvider to track the progress.</p>
     * 
     * @param request CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProvider(String workspaceId, CreateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentityProviderWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Issues a new credential explicitly. This requires an available shared pool and the AgentIdentity SCIM reception to be Enabled. This operation does not automatically enable reception. If it is not enabled, call prepare first. Returns the configuration, credential summary, and the current token. The limit of a maximum of two credentials is enforced by AgentIdentity. An existing available token does not prevent users from explicitly creating a second one. Old credentials are not automatically revoked, and no extended rotation process is provided.
     * The token is returned only once and cannot be retrieved again in subsequent list and query operations. Do not automatically retry the issuance. If the response is lost, check the list first to verify whether it has been created. Creating a credential does not enable AC syncEnabled, start a full user import, or switch SAML logon. Deleting an old token should be performed explicitly after the user confirms the actual usage of the external provisioning system.</p>
     * <h2>Request and examples</h2>
     * <p>POST /workspaces/{workspaceId}/scim-provisioning/credentials
     * Call conventions: Call the operation in the region of the target workspace, using an AK/STS identity that has permissions for the identity source resources of the corresponding workspace. The ws-example, URL, certificate, and token in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameter content of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log the key. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/scim-provisioning/credentials
     * No business request body.
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;configuration&quot;: {
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;baseUrl&quot;: &quot;https://example.com/scim/v2&quot;
     *     },
     *     &quot;credential&quot;: {
     *       &quot;credentialId&quot;: &quot;credential-example&quot;,
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;expireTime&quot;: &quot;&lt;Upstream expiration time&gt;&quot;
     *     },
     *     &quot;token&quot;: &quot;&lt;Newly issued token for the current request&gt;&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that there is no binding of the matching type. Synchronous calls to the upstream may fail and return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 400 LimitExceeded.ScimCredential: A maximum of two credentials are allowed. Delete one before you can continue to create. 400 InvalidParameter: Reception is not enabled or the shared pool is unavailable. Do not retry quota errors as system failures.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>After creation, securely save the token that is returned only once and configure it in the external provisioning system. Existing tokens remain valid. Only DeleteIdentityProviderSCIMCredential revokes the specified credential. Do not automatically retry when the response is lost. Call ListIdentityProviderSCIMCredentials to check first. This operation does not provide automatic rotation or scaling.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a SCIM credential explicitly and returns the plaintext token only for the current call. A maximum of two credentials are allowed in the same pool. This operation does not automatically revoke old credentials or enable AC user synchronization.</p>
     * 
     * @param request CreateIdentityProviderSCIMCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderSCIMCredentialResponse
     */
    public CreateIdentityProviderSCIMCredentialResponse createIdentityProviderSCIMCredentialWithOptions(String workspaceId, CreateIdentityProviderSCIMCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityProviderSCIMCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/scim-provisioning/credentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentityProviderSCIMCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Issues a new credential explicitly. This requires an available shared pool and the AgentIdentity SCIM reception to be Enabled. This operation does not automatically enable reception. If it is not enabled, call prepare first. Returns the configuration, credential summary, and the current token. The limit of a maximum of two credentials is enforced by AgentIdentity. An existing available token does not prevent users from explicitly creating a second one. Old credentials are not automatically revoked, and no extended rotation process is provided.
     * The token is returned only once and cannot be retrieved again in subsequent list and query operations. Do not automatically retry the issuance. If the response is lost, check the list first to verify whether it has been created. Creating a credential does not enable AC syncEnabled, start a full user import, or switch SAML logon. Deleting an old token should be performed explicitly after the user confirms the actual usage of the external provisioning system.</p>
     * <h2>Request and examples</h2>
     * <p>POST /workspaces/{workspaceId}/scim-provisioning/credentials
     * Call conventions: Call the operation in the region of the target workspace, using an AK/STS identity that has permissions for the identity source resources of the corresponding workspace. The ws-example, URL, certificate, and token in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameter content of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log the key. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/scim-provisioning/credentials
     * No business request body.
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;configuration&quot;: {
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;baseUrl&quot;: &quot;https://example.com/scim/v2&quot;
     *     },
     *     &quot;credential&quot;: {
     *       &quot;credentialId&quot;: &quot;credential-example&quot;,
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;expireTime&quot;: &quot;&lt;Upstream expiration time&gt;&quot;
     *     },
     *     &quot;token&quot;: &quot;&lt;Newly issued token for the current request&gt;&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that there is no binding of the matching type. Synchronous calls to the upstream may fail and return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 400 LimitExceeded.ScimCredential: A maximum of two credentials are allowed. Delete one before you can continue to create. 400 InvalidParameter: Reception is not enabled or the shared pool is unavailable. Do not retry quota errors as system failures.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>After creation, securely save the token that is returned only once and configure it in the external provisioning system. Existing tokens remain valid. Only DeleteIdentityProviderSCIMCredential revokes the specified credential. Do not automatically retry when the response is lost. Call ListIdentityProviderSCIMCredentials to check first. This operation does not provide automatic rotation or scaling.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a SCIM credential explicitly and returns the plaintext token only for the current call. A maximum of two credentials are allowed in the same pool. This operation does not automatically revoke old credentials or enable AC user synchronization.</p>
     * 
     * @param request CreateIdentityProviderSCIMCredentialRequest
     * @return CreateIdentityProviderSCIMCredentialResponse
     */
    public CreateIdentityProviderSCIMCredentialResponse createIdentityProviderSCIMCredential(String workspaceId, CreateIdentityProviderSCIMCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentityProviderSCIMCredentialWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Initiates a one-time user synchronization based on the saved scope without saving the configuration or requiring syncEnabled=true. Prerequisites: the identity provider is in the READY or SYNC_FAILED state, a user pool exists, and no other pending identity provider operations are in progress. The returned taskId only indicates that the request is accepted. Call GetIdentityProviderSyncJob to poll the status until it reaches SUCCESS, FAILED, or CANCELED. If the task fails, check the failureReason. The workspace user quota still applies, and previously synchronized users are not automatically deleted if the scope is reduced.
     * Authorization information: RAM action agentcore:CreateIdentityProviderSyncJob, access level Write, resource ARN: acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is required for authorization.
     * Idempotency and retry: This operation does not provide a ClientToken parameter for conditional idempotency. Repeated submissions do not guarantee the same task is returned. If an operation is already in progress, an operation conflict is returned. Submitting again after the task ends creates a new synchronization task. If a submission times out, query the identity provider status first to avoid blindly resubmitting the request.
     * Calling this API is free of charge, and operation records support ActionTrail auditing.
     * Initial selective synchronization process: CreateIdentityProvider (syncOnBind=false, it is recommended to keep syncEnabled=false initially) → GetIdentityProvider and wait for READY → ListIdentityProviderDepartments to select departments → UpdateIdentityProvider to save syncScope and wait for READY → CreateIdentityProviderSyncJob → GetIdentityProviderSyncJob to query the terminal state. If incremental synchronization is required, configure callbacks and event subscriptions, and then update syncEnabled=true.
     * Response example:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;taskId&quot;: &quot;12345678-1234-4234-8234-123456789abc&quot;,
     *     &quot;status&quot;: &quot;PENDING&quot;
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Initiates a manual synchronization of an identity provider.</p>
     * 
     * @param request CreateIdentityProviderSyncJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderSyncJobResponse
     */
    public CreateIdentityProviderSyncJobResponse createIdentityProviderSyncJobWithOptions(String workspaceId, String identityProviderType, CreateIdentityProviderSyncJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityProviderSyncJob"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + "/sync-jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentityProviderSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Initiates a one-time user synchronization based on the saved scope without saving the configuration or requiring syncEnabled=true. Prerequisites: the identity provider is in the READY or SYNC_FAILED state, a user pool exists, and no other pending identity provider operations are in progress. The returned taskId only indicates that the request is accepted. Call GetIdentityProviderSyncJob to poll the status until it reaches SUCCESS, FAILED, or CANCELED. If the task fails, check the failureReason. The workspace user quota still applies, and previously synchronized users are not automatically deleted if the scope is reduced.
     * Authorization information: RAM action agentcore:CreateIdentityProviderSyncJob, access level Write, resource ARN: acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is required for authorization.
     * Idempotency and retry: This operation does not provide a ClientToken parameter for conditional idempotency. Repeated submissions do not guarantee the same task is returned. If an operation is already in progress, an operation conflict is returned. Submitting again after the task ends creates a new synchronization task. If a submission times out, query the identity provider status first to avoid blindly resubmitting the request.
     * Calling this API is free of charge, and operation records support ActionTrail auditing.
     * Initial selective synchronization process: CreateIdentityProvider (syncOnBind=false, it is recommended to keep syncEnabled=false initially) → GetIdentityProvider and wait for READY → ListIdentityProviderDepartments to select departments → UpdateIdentityProvider to save syncScope and wait for READY → CreateIdentityProviderSyncJob → GetIdentityProviderSyncJob to query the terminal state. If incremental synchronization is required, configure callbacks and event subscriptions, and then update syncEnabled=true.
     * Response example:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;taskId&quot;: &quot;12345678-1234-4234-8234-123456789abc&quot;,
     *     &quot;status&quot;: &quot;PENDING&quot;
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Initiates a manual synchronization of an identity provider.</p>
     * 
     * @param request CreateIdentityProviderSyncJobRequest
     * @return CreateIdentityProviderSyncJobResponse
     */
    public CreateIdentityProviderSyncJobResponse createIdentityProviderSyncJob(String workspaceId, String identityProviderType, CreateIdentityProviderSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentityProviderSyncJobWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates or reuses an image cache in the current workspace based on the image source and tag. Both public and private images uniformly reuse the workspace\&quot;s source image pull authorization and resource roles. The resource manager parses the tag during the transfer node and performs image replication based on the parsed summary. The digest is empty before parsing is complete. For regular tags, the saved summary is reused after parsing. For the latest tag, it is parsed again when registered after reaching the desired state, and duplicate registrations in progress reuse the node. The logical imageId remains stable. accessInternet and accessVpc only determine the source reading and transfer for the current request and do not modify the agent network. An HTTP 200 response returns an acceptance snapshot of PENDING, READY, or FAILED, which does not indicate that the creation is complete. ClientToken does not guarantee to deduplicate requests or recover the original result. If the result is unconfirmed, query the query cache status first before deciding whether to recommit.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an image cache.</p>
     * 
     * @param tmpReq CreateImageCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCacheWithOptions(CreateImageCacheRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageCacheShrinkRequest request = new CreateImageCacheShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageCache"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/image-caches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates or reuses an image cache in the current workspace based on the image source and tag. Both public and private images uniformly reuse the workspace\&quot;s source image pull authorization and resource roles. The resource manager parses the tag during the transfer node and performs image replication based on the parsed summary. The digest is empty before parsing is complete. For regular tags, the saved summary is reused after parsing. For the latest tag, it is parsed again when registered after reaching the desired state, and duplicate registrations in progress reuse the node. The logical imageId remains stable. accessInternet and accessVpc only determine the source reading and transfer for the current request and do not modify the agent network. An HTTP 200 response returns an acceptance snapshot of PENDING, READY, or FAILED, which does not indicate that the creation is complete. ClientToken does not guarantee to deduplicate requests or recover the original result. If the result is unconfirmed, query the query cache status first before deciding whether to recommit.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an image cache.</p>
     * 
     * @param request CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImageCacheWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a managed agent in a specified workspace.</p>
     * 
     * @param tmpReq CreateManagedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateManagedAgentResponse
     */
    public CreateManagedAgentResponse createManagedAgentWithOptions(String workspaceId, CreateManagedAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateManagedAgentShrinkRequest request = new CreateManagedAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateManagedAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateManagedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a managed agent in a specified workspace.</p>
     * 
     * @param request CreateManagedAgentRequest
     * @return CreateManagedAgentResponse
     */
    public CreateManagedAgentResponse createManagedAgent(String workspaceId, CreateManagedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createManagedAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an MCP service in a specified workspace. The creation is an asynchronous process. You can check whether the service is ready by using the returned status or by calling a query operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an MCP service in a specified workspace. The creation is an asynchronous process. You can check whether the service is ready by using the returned status or by calling a query operation.</p>
     * 
     * @param tmpReq CreateMcpRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcpResponse
     */
    public CreateMcpResponse createMcpWithOptions(String workspaceId, CreateMcpRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMcpShrinkRequest request = new CreateMcpShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcp"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an MCP service in a specified workspace. The creation is an asynchronous process. You can check whether the service is ready by using the returned status or by calling a query operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an MCP service in a specified workspace. The creation is an asynchronous process. You can check whether the service is ready by using the returned status or by calling a query operation.</p>
     * 
     * @param request CreateMcpRequest
     * @return CreateMcpResponse
     */
    public CreateMcpResponse createMcp(String workspaceId, CreateMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMcpWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a long-term memory store in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a long-term memory store in a specified workspace.</p>
     * 
     * @param tmpReq CreateMemoryStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryStoreResponse
     */
    public CreateMemoryStoreResponse createMemoryStoreWithOptions(String workspaceId, CreateMemoryStoreRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMemoryStoreShrinkRequest request = new CreateMemoryStoreShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemoryStore"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemoryStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a long-term memory store in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a long-term memory store in a specified workspace.</p>
     * 
     * @param request CreateMemoryStoreRequest
     * @return CreateMemoryStoreResponse
     */
    public CreateMemoryStoreResponse createMemoryStore(String workspaceId, CreateMemoryStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryStoreWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a model configuration for model creation under a model connection in a specified workspace.</p>
     * 
     * @param tmpReq CreateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelResponse
     */
    public CreateModelResponse createModelWithOptions(String workspaceId, CreateModelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateModelShrinkRequest request = new CreateModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a model configuration for model creation under a model connection in a specified workspace.</p>
     * 
     * @param request CreateModelRequest
     * @return CreateModelResponse
     */
    public CreateModelResponse createModel(String workspaceId, CreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a model connection in a specified workspace and configures the upstream model service endpoint, invoke protocol, and access credentials to support model creation.</p>
     * 
     * @param tmpReq CreateModelConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelConnectionResponse
     */
    public CreateModelConnectionResponse createModelConnectionWithOptions(String workspaceId, CreateModelConnectionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateModelConnectionShrinkRequest request = new CreateModelConnectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelConnection"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/model-connections"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a model connection in a specified workspace and configures the upstream model service endpoint, invoke protocol, and access credentials to support model creation.</p>
     * 
     * @param request CreateModelConnectionRequest
     * @return CreateModelConnectionResponse
     */
    public CreateModelConnectionResponse createModelConnection(String workspaceId, CreateModelConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelConnectionWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a Skill in the specified workspace and generates a draft version that can be further edited. You can derive a draft from an existing version or specify a target version and commit message.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Skill in the specified workspace and generates a draft version that can be further edited. You can derive a draft from an existing version or specify a target version and commit message.</p>
     * 
     * @param tmpReq CreateSkillDraftRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillDraftResponse
     */
    public CreateSkillDraftResponse createSkillDraftWithOptions(String workspaceId, CreateSkillDraftRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSkillDraftShrinkRequest request = new CreateSkillDraftShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillDraft"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillDraftResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a Skill in the specified workspace and generates a draft version that can be further edited. You can derive a draft from an existing version or specify a target version and commit message.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Skill in the specified workspace and generates a draft version that can be further edited. You can derive a draft from an existing version or specify a target version and commit message.</p>
     * 
     * @param request CreateSkillDraftRequest
     * @return CreateSkillDraftResponse
     */
    public CreateSkillDraftResponse createSkillDraft(String workspaceId, CreateSkillDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSkillDraftWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a team in a specified workspace and configures user members and agent members at the same time. Exactly one user member must have the ADMIN role, and agent members can only have the LEADER or WORKER role.</p>
     * 
     * @param tmpReq CreateTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeamWithOptions(String workspaceId, CreateTeamRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTeamShrinkRequest request = new CreateTeamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTeam"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/teams"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a team in a specified workspace and configures user members and agent members at the same time. Exactly one user member must have the ADMIN role, and agent members can only have the LEADER or WORKER role.</p>
     * 
     * @param request CreateTeamRequest
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeam(String workspaceId, CreateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTeamWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user in a specified workspace. The username must be unique within the workspace, can contain only lowercase letters, digits, and hyphens, and cannot use reserved names such as manager, admin, or names starting with worker-. If the password is not specified, the server generates an initial password and returns it in the initialPassword field of the response.</p>
     * 
     * @param tmpReq CreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(String workspaceId, CreateUserRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserShrinkRequest request = new CreateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user in a specified workspace. The username must be unique within the workspace, can contain only lowercase letters, digits, and hyphens, and cannot use reserved names such as manager, admin, or names starting with worker-. If the password is not specified, the server generates an initial password and returns it in the initialPassword field of the response.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(String workspaceId, CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable the VPC network. If enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentCore workspace control plane record. The server completes the state transition from Initializing to Initialized within the same transaction.</p>
     * 
     * @param tmpReq CreateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkspaceShrinkRequest request = new CreateWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable the VPC network. If enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentCore workspace control plane record. The server completes the state transition from Initializing to Initialized within the same transaction.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls a specified model through a published model connection to verify whether the model call chain is available.</p>
     * 
     * @param tmpReq DebugModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DebugModelResponse
     */
    public DebugModelResponse debugModelWithOptions(String workspaceId, String modelId, DebugModelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DebugModelShrinkRequest request = new DebugModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DebugModel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelId) + "/actions/debug"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DebugModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls a specified model through a published model connection to verify whether the model call chain is available.</p>
     * 
     * @param request DebugModelRequest
     * @return DebugModelResponse
     */
    public DebugModelResponse debugModel(String workspaceId, String modelId, DebugModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.debugModelWithOptions(workspaceId, modelId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an IM channel of a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IM channel of a specified agent.</p>
     * 
     * @param request DeleteAgentIMChannelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentIMChannelResponse
     */
    public DeleteAgentIMChannelResponse deleteAgentIMChannelWithOptions(String workspaceId, String agentId, String imChannelId, DeleteAgentIMChannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentIMChannel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/im-channels/" + com.aliyun.openapiutil.Client.getEncodeParam(imChannelId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentIMChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an IM channel of a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IM channel of a specified agent.</p>
     * 
     * @param request DeleteAgentIMChannelRequest
     * @return DeleteAgentIMChannelResponse
     */
    public DeleteAgentIMChannelResponse deleteAgentIMChannel(String workspaceId, String agentId, String imChannelId, DeleteAgentIMChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentIMChannelWithOptions(workspaceId, agentId, imChannelId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes the specified AgentSpec and all its versions and metadata. The deletion is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified AgentSpec and all its versions and metadata. The deletion is irreversible.</p>
     * 
     * @param request DeleteAgentSpecRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentSpecResponse
     */
    public DeleteAgentSpecResponse deleteAgentSpecWithOptions(String workspaceId, String agentSpecName, DeleteAgentSpecRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentSpec"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentSpecResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes the specified AgentSpec and all its versions and metadata. The deletion is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified AgentSpec and all its versions and metadata. The deletion is irreversible.</p>
     * 
     * @param request DeleteAgentSpecRequest
     * @return DeleteAgentSpecResponse
     */
    public DeleteAgentSpecResponse deleteAgentSpec(String workspaceId, String agentSpecName, DeleteAgentSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentSpecWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes the draft version currently being edited for a specified AgentSpec and clears the draft version pointer.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version currently being edited for a specified AgentSpec and clears the draft version pointer.</p>
     * 
     * @param request DeleteAgentSpecVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentSpecVersionResponse
     */
    public DeleteAgentSpecVersionResponse deleteAgentSpecVersionWithOptions(String workspaceId, String agentSpecName, DeleteAgentSpecVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentSpecVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + "/draft"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentSpecVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes the draft version currently being edited for a specified AgentSpec and clears the draft version pointer.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version currently being edited for a specified AgentSpec and clears the draft version pointer.</p>
     * 
     * @param request DeleteAgentSpecVersionRequest
     * @return DeleteAgentSpecVersionResponse
     */
    public DeleteAgentSpecVersionResponse deleteAgentSpecVersion(String workspaceId, String agentSpecName, DeleteAgentSpecVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentSpecVersionWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an access credential in a specified workspace. A credential cannot be deleted if it is still bound to an MCP service.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a credential in a specified workspace and deletes the ciphertext hosted in the credential service. After deletion, agents bound to the credential can no longer obtain the credential content.</p>
     * 
     * @param request DeleteCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredentialWithOptions(String workspaceId, String credentialId, DeleteCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an access credential in a specified workspace. A credential cannot be deleted if it is still bound to an MCP service.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a credential in a specified workspace and deletes the ciphertext hosted in the credential service. After deletion, agents bound to the credential can no longer obtain the credential content.</p>
     * 
     * @param request DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredential(String workspaceId, String credentialId, DeleteCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCredentialWithOptions(workspaceId, credentialId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that the workspace is writable. If the agent is still associated with a team, you must dissociate it from the team first.
     * Deletion is an asynchronous process. After the request is accepted, the associated invocation endpoints become unavailable, and the runtime resources are subsequently cleaned up. The status in the response is typically Deleting. If the agent is already in the deletion process, a subsequent request returns the current summary.
     * You can call GetCustomAgent to check the deletion progress. After the deletion is complete, a detail query returns a resource not found error.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom agent from a specified workspace. A successful request indicates that the deletion is accepted. The runtime resources are subsequently cleaned up in the background.</p>
     * 
     * @param request DeleteCustomAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomAgentResponse
     */
    public DeleteCustomAgentResponse deleteCustomAgentWithOptions(String workspaceId, String agentId, DeleteCustomAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that the workspace is writable. If the agent is still associated with a team, you must dissociate it from the team first.
     * Deletion is an asynchronous process. After the request is accepted, the associated invocation endpoints become unavailable, and the runtime resources are subsequently cleaned up. The status in the response is typically Deleting. If the agent is already in the deletion process, a subsequent request returns the current summary.
     * You can call GetCustomAgent to check the deletion progress. After the deletion is complete, a detail query returns a resource not found error.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom agent from a specified workspace. A successful request indicates that the deletion is accepted. The runtime resources are subsequently cleaned up in the background.</p>
     * 
     * @param request DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    public DeleteCustomAgentResponse deleteCustomAgent(String workspaceId, String agentId, DeleteCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustomAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified external agent.</p>
     * 
     * @param request DeleteExternalAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExternalAgentResponse
     */
    public DeleteExternalAgentResponse deleteExternalAgentWithOptions(String workspaceId, String agentId, DeleteExternalAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExternalAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExternalAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified external agent.</p>
     * 
     * @param request DeleteExternalAgentRequest
     * @return DeleteExternalAgentResponse
     */
    public DeleteExternalAgentResponse deleteExternalAgent(String workspaceId, String agentId, DeleteExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExternalAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>This operation completely disconnects the integration, rather than simply disabling logon. Disconnecting CustomSSO clears the AC users imported from this identity source, the remote shared user pool and related resources, and the logon publishing configurations and bindings. Therefore, both SAML and SCIM are affected. However, this operation does not delete the enterprise applications created by users on external platforms such as Azure. Before disconnecting, the system checks for references between users and teams. If references exist, the disconnection is rejected.
     * After the request is accepted, the status returned is DISCONNECTING. You can query the status by calling GetIdentityProvider. The cleanup is complete only when the binding no longer exists (IdentityProviderNotFound). The binding should also no longer appear in the list. DISCONNECT_FAILED indicates that partial cleanup may have occurred, and the state cannot be restored to a completely unconfigured state. You can retry based on the returned status. If the binding does not exist in the first place, the API operation returns a placeholder result indicating no binding without creating new resources. An ongoing disconnection task may return the current binding. Do not use this API operation as a substitute for setting loginEnabled=false, syncEnabled=false, or deleting a single token.</p>
     * <h2>Requests and examples</h2>
     * <p>DELETE /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Calling conventions: Call the API operation in the region of the target workspace, using an AK/STS identity that has the corresponding workspace identity source resource permissions. The ws-example, URLs, certificates, and tokens in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log secrets. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">DELETE /workspaces/ws-example/identity-providers/CustomSSO
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;DISCONNECTING&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to upstream services that fail may return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 409 IdentityProvider.Disconnect.Conflict: Users of this identity source still belong to a team. Remove the references first. 409 IdentityProviderOperationConflict: The current status does not allow disconnection. 404 IdentityProviderNotFound: An external binding exists but the type does not match. Asynchronous failures may result in partial cleanup. You cannot claim completion based solely on the first response.</p>
     * <h2>Calling relationships and usage boundaries</h2>
     * <p>If you only need to disable a specific capability: To disable SAML logon, use UpdateIdentityProvider and set loginEnabled=false. To disable SCIM, use UpdateIdentityProviderSCIM and set syncEnabled=false. To revoke a single token, use DeleteIdentityProviderSCIMCredential. Call this API operation only when you need to completely disconnect the integration.</p>
     * 
     * <b>summary</b> : 
     * <p>Disconnects the identity source integration of a workspace. For CustomSSO, this operation clears the shared user pool and related SAML and SCIM resources. To disable only logon or synchronization, use the corresponding switch API operations.</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProviderWithOptions(String workspaceId, String identityProviderType, DeleteIdentityProviderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdentityProvider"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>This operation completely disconnects the integration, rather than simply disabling logon. Disconnecting CustomSSO clears the AC users imported from this identity source, the remote shared user pool and related resources, and the logon publishing configurations and bindings. Therefore, both SAML and SCIM are affected. However, this operation does not delete the enterprise applications created by users on external platforms such as Azure. Before disconnecting, the system checks for references between users and teams. If references exist, the disconnection is rejected.
     * After the request is accepted, the status returned is DISCONNECTING. You can query the status by calling GetIdentityProvider. The cleanup is complete only when the binding no longer exists (IdentityProviderNotFound). The binding should also no longer appear in the list. DISCONNECT_FAILED indicates that partial cleanup may have occurred, and the state cannot be restored to a completely unconfigured state. You can retry based on the returned status. If the binding does not exist in the first place, the API operation returns a placeholder result indicating no binding without creating new resources. An ongoing disconnection task may return the current binding. Do not use this API operation as a substitute for setting loginEnabled=false, syncEnabled=false, or deleting a single token.</p>
     * <h2>Requests and examples</h2>
     * <p>DELETE /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Calling conventions: Call the API operation in the region of the target workspace, using an AK/STS identity that has the corresponding workspace identity source resource permissions. The ws-example, URLs, certificates, and tokens in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log secrets. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">DELETE /workspaces/ws-example/identity-providers/CustomSSO
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;DISCONNECTING&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to upstream services that fail may return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 409 IdentityProvider.Disconnect.Conflict: Users of this identity source still belong to a team. Remove the references first. 409 IdentityProviderOperationConflict: The current status does not allow disconnection. 404 IdentityProviderNotFound: An external binding exists but the type does not match. Asynchronous failures may result in partial cleanup. You cannot claim completion based solely on the first response.</p>
     * <h2>Calling relationships and usage boundaries</h2>
     * <p>If you only need to disable a specific capability: To disable SAML logon, use UpdateIdentityProvider and set loginEnabled=false. To disable SCIM, use UpdateIdentityProviderSCIM and set syncEnabled=false. To revoke a single token, use DeleteIdentityProviderSCIMCredential. Call this API operation only when you need to completely disconnect the integration.</p>
     * 
     * <b>summary</b> : 
     * <p>Disconnects the identity source integration of a workspace. For CustomSSO, this operation clears the shared user pool and related SAML and SCIM resources. To disable only logon or synchronization, use the corresponding switch API operations.</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProvider(String workspaceId, String identityProviderType, DeleteIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIdentityProviderWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>功能与前提\n撤销指定凭据，credentialId 必填且非空，从凭据列表取得。要求共享池可用，但不要求 SAML 已配置或 SCIM 接收为 Enabled。删除后使用该 Token 的外部预配请求会失效；只影响选定凭据，不自动关闭接收、不自动关闭 AC syncEnabled，也不影响另一枚凭据或 SAML。\n即使删除最后一枚凭据，也不自动回写同步开关或重发新 Token；用户应按需要先停用外部预配或更换其使用的 Token。成功返回公共响应，无业务 data 内容；刷新列表确认。对未知或已删除 ID 的结果由上游决定，不承诺统一 404 或无条件幂等成功。\n\n## 请求与示例\nDELETE /workspaces/{workspaceId}/scim-provisioning/credentials/{credentialId}\n调用约定：按目标 Workspace 的地域调用，使用有相应 Workspace 身份源资源权限的 AK/STS 身份。下文示例中的 ws-example、URL、证书和 Token 均为占位值，需替换为真实值。请求体示例表示公开 API 的 body 参数内容，不是后端直连接口额外的 body 包装。返回示例只展示业务部分，外层还包括 requestId、success、code、message、httpStatusCode；排障请保留 requestId，不记录密钥。业务任务异步不意味着 HTTP 请求长连接等待完成。\n<code>text\nDELETE /workspaces/ws-example/scim-provisioning/credentials/credential-example\n</code>\n\n## 返回示例\n<code>json\n{\n  &quot;success&quot;: true,\n  &quot;httpStatusCode&quot;: 200\n}\n</code>\n\n## 错误与处理\n错误处理：400 InvalidParameter 表示参数或当前配置前提不满足；404 IdentityProviderNotFound 表示没有匹配类型的绑定。同步调用上游失败可能返回 503 IdentityProviderProvisioningUnavailable；保留请求 ID 排查，不把读取失败解释为未配置。实际鉴权和 Workspace 不存在错误沿用公共错误处理。\n400 InvalidParameter：credentialId 为空或共享池不可用。404 IdentityProviderNotFound 指绑定不存在，不代表所有未知凭据 ID 都返回该码。其他删除错误按上游结果处理，失败时刷新列表核对，不自动创建替代 Token。\n\n## 调用关系与使用边界\n使用 ListIdentityProviderSCIMCredentials 取得 credentialId 后删除指定凭据。若外部预配系统仍使用该 Token，后续预配可能鉴权失败，因此应先确认实际使用情况。删除后不会自动创建新凭据、关闭 AC 同步开关或关闭 SAML 登录。</h2>
     * 
     * <b>summary</b> : 
     * <p>删除 SCIM 凭据</p>
     * 
     * @param request DeleteIdentityProviderSCIMCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdentityProviderSCIMCredentialResponse
     */
    public DeleteIdentityProviderSCIMCredentialResponse deleteIdentityProviderSCIMCredentialWithOptions(String workspaceId, String credentialId, DeleteIdentityProviderSCIMCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdentityProviderSCIMCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/scim-provisioning/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdentityProviderSCIMCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <h2>功能与前提\n撤销指定凭据，credentialId 必填且非空，从凭据列表取得。要求共享池可用，但不要求 SAML 已配置或 SCIM 接收为 Enabled。删除后使用该 Token 的外部预配请求会失效；只影响选定凭据，不自动关闭接收、不自动关闭 AC syncEnabled，也不影响另一枚凭据或 SAML。\n即使删除最后一枚凭据，也不自动回写同步开关或重发新 Token；用户应按需要先停用外部预配或更换其使用的 Token。成功返回公共响应，无业务 data 内容；刷新列表确认。对未知或已删除 ID 的结果由上游决定，不承诺统一 404 或无条件幂等成功。\n\n## 请求与示例\nDELETE /workspaces/{workspaceId}/scim-provisioning/credentials/{credentialId}\n调用约定：按目标 Workspace 的地域调用，使用有相应 Workspace 身份源资源权限的 AK/STS 身份。下文示例中的 ws-example、URL、证书和 Token 均为占位值，需替换为真实值。请求体示例表示公开 API 的 body 参数内容，不是后端直连接口额外的 body 包装。返回示例只展示业务部分，外层还包括 requestId、success、code、message、httpStatusCode；排障请保留 requestId，不记录密钥。业务任务异步不意味着 HTTP 请求长连接等待完成。\n<code>text\nDELETE /workspaces/ws-example/scim-provisioning/credentials/credential-example\n</code>\n\n## 返回示例\n<code>json\n{\n  &quot;success&quot;: true,\n  &quot;httpStatusCode&quot;: 200\n}\n</code>\n\n## 错误与处理\n错误处理：400 InvalidParameter 表示参数或当前配置前提不满足；404 IdentityProviderNotFound 表示没有匹配类型的绑定。同步调用上游失败可能返回 503 IdentityProviderProvisioningUnavailable；保留请求 ID 排查，不把读取失败解释为未配置。实际鉴权和 Workspace 不存在错误沿用公共错误处理。\n400 InvalidParameter：credentialId 为空或共享池不可用。404 IdentityProviderNotFound 指绑定不存在，不代表所有未知凭据 ID 都返回该码。其他删除错误按上游结果处理，失败时刷新列表核对，不自动创建替代 Token。\n\n## 调用关系与使用边界\n使用 ListIdentityProviderSCIMCredentials 取得 credentialId 后删除指定凭据。若外部预配系统仍使用该 Token，后续预配可能鉴权失败，因此应先确认实际使用情况。删除后不会自动创建新凭据、关闭 AC 同步开关或关闭 SAML 登录。</h2>
     * 
     * <b>summary</b> : 
     * <p>删除 SCIM 凭据</p>
     * 
     * @param request DeleteIdentityProviderSCIMCredentialRequest
     * @return DeleteIdentityProviderSCIMCredentialResponse
     */
    public DeleteIdentityProviderSCIMCredentialResponse deleteIdentityProviderSCIMCredential(String workspaceId, String credentialId, DeleteIdentityProviderSCIMCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIdentityProviderSCIMCredentialWithOptions(workspaceId, credentialId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the logical image cache of the current workspace. The deletion requires that no enabled agent configurations reference the cache and no active instances are using it. Concurrency is rechecked upon submission. Caches in the PENDING or FAILED state can still be deleted, and the backend handles the cleanup. An HTTP 200 response returns an imageId that matches the request. If deletionPending is true, the current workspace is still undergoing deletion, and a Get request returns DELETING until ImageCacheNotFound is explicitly returned. If false, the deletion is complete or the current workspace no longer exists. Usage by other workspaces does not block the deletion for the current workspace. The physical content is reclaimed only after all workspaces in the same region have removed their associations and no active instances are using it.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image cache.</p>
     * 
     * @param request DeleteImageCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCacheWithOptions(String imageId, DeleteImageCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImageCache"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/image-caches/" + com.aliyun.openapiutil.Client.getEncodeParam(imageId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the logical image cache of the current workspace. The deletion requires that no enabled agent configurations reference the cache and no active instances are using it. Concurrency is rechecked upon submission. Caches in the PENDING or FAILED state can still be deleted, and the backend handles the cleanup. An HTTP 200 response returns an imageId that matches the request. If deletionPending is true, the current workspace is still undergoing deletion, and a Get request returns DELETING until ImageCacheNotFound is explicitly returned. If false, the deletion is complete or the current workspace no longer exists. Usage by other workspaces does not block the deletion for the current workspace. The physical content is reclaimed only after all workspaces in the same region have removed their associations and no active instances are using it.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an image cache.</p>
     * 
     * @param request DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCache(String imageId, DeleteImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteImageCacheWithOptions(imageId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified managed agent.</p>
     * 
     * @param request DeleteManagedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteManagedAgentResponse
     */
    public DeleteManagedAgentResponse deleteManagedAgentWithOptions(String workspaceId, String agentId, DeleteManagedAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteManagedAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteManagedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified managed agent.</p>
     * 
     * @param request DeleteManagedAgentRequest
     * @return DeleteManagedAgentResponse
     */
    public DeleteManagedAgentResponse deleteManagedAgent(String workspaceId, String agentId, DeleteManagedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteManagedAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified MCP server. The deletion is an asynchronous process, and the MCP server is no longer returned after the process is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified MCP server. The deletion is an asynchronous process, and the MCP server is no longer returned after the process is complete.</p>
     * 
     * @param request DeleteMcpRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcpResponse
     */
    public DeleteMcpResponse deleteMcpWithOptions(String mcpServerId, String workspaceId, DeleteMcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcp"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified MCP server. The deletion is an asynchronous process, and the MCP server is no longer returned after the process is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified MCP server. The deletion is an asynchronous process, and the MCP server is no longer returned after the process is complete.</p>
     * 
     * @param request DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    public DeleteMcpResponse deleteMcp(String mcpServerId, String workspaceId, DeleteMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMcpWithOptions(mcpServerId, workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a long-term memory based on the memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a long-term memory based on the memory ID.</p>
     * 
     * @param request DeleteMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemoryWithOptions(String workspaceId, String memoryStoreName, String memoryId, DeleteMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemory"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a long-term memory based on the memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a long-term memory based on the memory ID.</p>
     * 
     * @param request DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemory(String workspaceId, String memoryStoreName, String memoryId, DeleteMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryWithOptions(workspaceId, memoryStoreName, memoryId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously deletes a MemoryStore and all long-term memory within it.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously deletes a MemoryStore and all long-term memory within it.</p>
     * 
     * @param request DeleteMemoryStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryStoreResponse
     */
    public DeleteMemoryStoreResponse deleteMemoryStoreWithOptions(String workspaceId, String memoryStoreName, DeleteMemoryStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemoryStore"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously deletes a MemoryStore and all long-term memory within it.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously deletes a MemoryStore and all long-term memory within it.</p>
     * 
     * @param request DeleteMemoryStoreRequest
     * @return DeleteMemoryStoreResponse
     */
    public DeleteMemoryStoreResponse deleteMemoryStore(String workspaceId, String memoryStoreName, DeleteMemoryStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryStoreWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a model from a specified workspace. Models that are currently in use cannot be deleted.</p>
     * 
     * @param request DeleteModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModelWithOptions(String workspaceId, String modelId, DeleteModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a model from a specified workspace. Models that are currently in use cannot be deleted.</p>
     * 
     * @param request DeleteModelRequest
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModel(String workspaceId, String modelId, DeleteModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelWithOptions(workspaceId, modelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an asynchronous deletion task for a specified model connection. The connection cannot be deleted if it has associated models or runtime references.</p>
     * 
     * @param request DeleteModelConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelConnectionResponse
     */
    public DeleteModelConnectionResponse deleteModelConnectionWithOptions(String workspaceId, String connectionId, DeleteModelConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelConnection"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/model-connections/" + com.aliyun.openapiutil.Client.getEncodeParam(connectionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an asynchronous deletion task for a specified model connection. The connection cannot be deleted if it has associated models or runtime references.</p>
     * 
     * @param request DeleteModelConnectionRequest
     * @return DeleteModelConnectionResponse
     */
    public DeleteModelConnectionResponse deleteModelConnection(String workspaceId, String connectionId, DeleteModelConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelConnectionWithOptions(workspaceId, connectionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * @param request DeleteSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkillWithOptions(String workspaceId, String skillName, DeleteSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkill"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * @param request DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkill(String workspaceId, String skillName, DeleteSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSkillWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes the draft version currently being edited for a specified Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version currently being edited for a specified Skill.</p>
     * 
     * @param request DeleteSkillDraftRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillDraftResponse
     */
    public DeleteSkillDraftResponse deleteSkillDraftWithOptions(String workspaceId, String skillName, DeleteSkillDraftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkillDraft"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/draft"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillDraftResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes the draft version currently being edited for a specified Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version currently being edited for a specified Skill.</p>
     * 
     * @param request DeleteSkillDraftRequest
     * @return DeleteSkillDraftResponse
     */
    public DeleteSkillDraftResponse deleteSkillDraft(String workspaceId, String skillName, DeleteSkillDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSkillDraftWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a team from a specified workspace. Deleting a team does not delete the users or agents within it. Only the membership associations are removed.</p>
     * 
     * @param request DeleteTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeamWithOptions(String workspaceId, String teamId, DeleteTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTeam"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a team from a specified workspace. Deleting a team does not delete the users or agents within it. Only the membership associations are removed.</p>
     * 
     * @param request DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeam(String workspaceId, String teamId, DeleteTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTeamWithOptions(workspaceId, teamId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user from a specified workspace. A user cannot be deleted while the user is still a member of any team. Remove the user from all teams before deleting the user.</p>
     * 
     * @param request DeleteUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(String workspaceId, String agentCoreUserId, DeleteUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(agentCoreUserId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user from a specified workspace. A user cannot be deleted while the user is still a member of any team. Remove the user from all teams before deleting the user.</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(String workspaceId, String agentCoreUserId, DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserWithOptions(workspaceId, agentCoreUserId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. The server processes repeated deletion requests for workspaces in the <code>Deleting</code> or <code>Deleted</code> state idempotently.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes the control plane record of a specified workspace. The server completes the state transition from Deleting to Deleted within the same transaction. The server processes repeated deletion requests for workspaces in the Deleting or Deleted state idempotently.</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String workspaceId, DeleteWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. The server processes repeated deletion requests for workspaces in the <code>Deleting</code> or <code>Deleted</code> state idempotently.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes the control plane record of a specified workspace. The server completes the state transition from Deleting to Deleted within the same transaction. The server processes repeated deletion requests for workspaces in the Deleting or Deleted state idempotently.</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String workspaceId, DeleteWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disables a Connector in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a QoderCLI Connector in a specified workspace. The Connector can be disabled only when no Agent is using it. After the Connector is disabled, the Connector and its Service Account Key configuration are removed.</p>
     * 
     * @param request DisableConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableConnectorResponse
     */
    public DisableConnectorResponse disableConnectorWithOptions(String workspaceId, String connectorName, DisableConnectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableConnector"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/connectors/" + com.aliyun.openapiutil.Client.getEncodeParam(connectorName) + "/actions/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disables a Connector in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a QoderCLI Connector in a specified workspace. The Connector can be disabled only when no Agent is using it. After the Connector is disabled, the Connector and its Service Account Key configuration are removed.</p>
     * 
     * @param request DisableConnectorRequest
     * @return DisableConnectorResponse
     */
    public DisableConnectorResponse disableConnector(String workspaceId, String connectorName, DisableConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableConnectorWithOptions(workspaceId, connectorName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the presigned OSS download URL of a specified AgentSpec to download the AgentSpec ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the presigned OSS download URL of a specified AgentSpec to download the AgentSpec ZIP package.</p>
     * 
     * @param request DownloadAgentSpecViaOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadAgentSpecViaOssResponse
     */
    public DownloadAgentSpecViaOssResponse downloadAgentSpecViaOssWithOptions(String workspaceId, String agentSpecName, DownloadAgentSpecViaOssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpecVersion)) {
            query.put("agentSpecVersion", request.agentSpecVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadAgentSpecViaOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + "/actions/download-via-oss"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadAgentSpecViaOssResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the presigned OSS download URL of a specified AgentSpec to download the AgentSpec ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the presigned OSS download URL of a specified AgentSpec to download the AgentSpec ZIP package.</p>
     * 
     * @param request DownloadAgentSpecViaOssRequest
     * @return DownloadAgentSpecViaOssResponse
     */
    public DownloadAgentSpecViaOssResponse downloadAgentSpecViaOss(String workspaceId, String agentSpecName, DownloadAgentSpecViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadAgentSpecViaOssWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * @param request DownloadSkillVersionViaOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadSkillVersionViaOssResponse
     */
    public DownloadSkillVersionViaOssResponse downloadSkillVersionViaOssWithOptions(String workspaceId, String skillName, String skillVersion, DownloadSkillVersionViaOssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadSkillVersionViaOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(skillVersion) + "/actions/download-via-oss"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadSkillVersionViaOssResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * @param request DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    public DownloadSkillVersionViaOssResponse downloadSkillVersionViaOss(String workspaceId, String skillName, String skillVersion, DownloadSkillVersionViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadSkillVersionViaOssWithOptions(workspaceId, skillName, skillVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enables a Connector in a specified workspace. Credential verification is required before the Connector can be enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a QoderCLI Connector in a specified workspace. The request must include the site, API key, and at least one service account key. The service validates all account keys before saving the configuration.</p>
     * 
     * @param tmpReq EnableConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableConnectorResponse
     */
    public EnableConnectorResponse enableConnectorWithOptions(String workspaceId, String connectorName, EnableConnectorRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableConnectorShrinkRequest request = new EnableConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableConnector"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/connectors/" + com.aliyun.openapiutil.Client.getEncodeParam(connectorName) + "/actions/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enables a Connector in a specified workspace. Credential verification is required before the Connector can be enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a QoderCLI Connector in a specified workspace. The request must include the site, API key, and at least one service account key. The service validates all account keys before saving the configuration.</p>
     * 
     * @param request EnableConnectorRequest
     * @return EnableConnectorResponse
     */
    public EnableConnectorResponse enableConnector(String workspaceId, String connectorName, EnableConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableConnectorWithOptions(workspaceId, connectorName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Skips the regular review process and forcibly publishes a specified Skill version.</p>
     * 
     * <b>summary</b> : 
     * <p>Skips the regular review process and forcibly publishes a specified Skill version.</p>
     * 
     * @param tmpReq ForcePublishSkillVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ForcePublishSkillVersionResponse
     */
    public ForcePublishSkillVersionResponse forcePublishSkillVersionWithOptions(String workspaceId, String skillName, String skillVersion, ForcePublishSkillVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ForcePublishSkillVersionShrinkRequest request = new ForcePublishSkillVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForcePublishSkillVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(skillVersion) + "/actions/force-publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForcePublishSkillVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Skips the regular review process and forcibly publishes a specified Skill version.</p>
     * 
     * <b>summary</b> : 
     * <p>Skips the regular review process and forcibly publishes a specified Skill version.</p>
     * 
     * @param request ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    public ForcePublishSkillVersionResponse forcePublishSkillVersion(String workspaceId, String skillName, String skillVersion, ForcePublishSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.forcePublishSkillVersionWithOptions(workspaceId, skillName, skillVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Generates a time-limited, read-only download URL for the code package referenced by the currently saved agent configuration. This applies to code packages uploaded locally or imported from Object Storage Service (OSS). The operation uses workspaceId and agentId for locating and does not accept arbitrary bucket, object key, or historical version parameters. The current configuration must reference an available, fixed code package, and does not require waiting for a running instance to be ready. An error is returned if the code package does not exist, has changed, or is unreadable. The link is valid for up to 10 minutes and does not exceed the underlying credential expiration time. Call the operation again after it expires. The resourceVersionId indicates the saved configuration version corresponding to this download. The sample download link is redacted. Use the downloadUrl in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the download URL for the saved code package of an agent.</p>
     * 
     * @param request GetAgentCodePackageDownloadUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentCodePackageDownloadUrlResponse
     */
    public GetAgentCodePackageDownloadUrlResponse getAgentCodePackageDownloadUrlWithOptions(String workspaceId, String agentId, GetAgentCodePackageDownloadUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentCodePackageDownloadUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/code-package/download-url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentCodePackageDownloadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Generates a time-limited, read-only download URL for the code package referenced by the currently saved agent configuration. This applies to code packages uploaded locally or imported from Object Storage Service (OSS). The operation uses workspaceId and agentId for locating and does not accept arbitrary bucket, object key, or historical version parameters. The current configuration must reference an available, fixed code package, and does not require waiting for a running instance to be ready. An error is returned if the code package does not exist, has changed, or is unreadable. The link is valid for up to 10 minutes and does not exceed the underlying credential expiration time. Call the operation again after it expires. The resourceVersionId indicates the saved configuration version corresponding to this download. The sample download link is redacted. Use the downloadUrl in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the download URL for the saved code package of an agent.</p>
     * 
     * @param request GetAgentCodePackageDownloadUrlRequest
     * @return GetAgentCodePackageDownloadUrlResponse
     */
    public GetAgentCodePackageDownloadUrlResponse getAgentCodePackageDownloadUrl(String workspaceId, String agentId, GetAgentCodePackageDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentCodePackageDownloadUrlWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Generates a RAM authorization URL for the resource role of the current workspace for a specified source bucket. The client cannot specify or override the role. After you open the authorizeUrl and confirm the authorization, call VerifyAgentCodePackageOssRamAuthorization to check the policy binding, and call ValidateAgentCodePackageFromOss to check specific objects.
     * This authorization reuses the OSSObjectRestoreCustom template, which includes permissions to read, write, and delete objects, and is not a read-only authorization. Retrieving the URL itself does not complete the authorization, transfer the code package, or modify the default OSS binding of the workspace. Existing authorizations for the same role and bucket can be reused. The example URL is provided to demonstrate the format. Use the actual authorization URL returned by the API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS RAM authorization URL for the agent code package.</p>
     * 
     * @param request GetAgentCodePackageOssRamAuthorizeUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentCodePackageOssRamAuthorizeUrlResponse
     */
    public GetAgentCodePackageOssRamAuthorizeUrlResponse getAgentCodePackageOssRamAuthorizeUrlWithOptions(String workspaceId, GetAgentCodePackageOssRamAuthorizeUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("ossBucketName", request.ossBucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentCodePackageOssRamAuthorizeUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-code-packages/oss/authorize"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentCodePackageOssRamAuthorizeUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Generates a RAM authorization URL for the resource role of the current workspace for a specified source bucket. The client cannot specify or override the role. After you open the authorizeUrl and confirm the authorization, call VerifyAgentCodePackageOssRamAuthorization to check the policy binding, and call ValidateAgentCodePackageFromOss to check specific objects.
     * This authorization reuses the OSSObjectRestoreCustom template, which includes permissions to read, write, and delete objects, and is not a read-only authorization. Retrieving the URL itself does not complete the authorization, transfer the code package, or modify the default OSS binding of the workspace. Existing authorizations for the same role and bucket can be reused. The example URL is provided to demonstrate the format. Use the actual authorization URL returned by the API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS RAM authorization URL for the agent code package.</p>
     * 
     * @param request GetAgentCodePackageOssRamAuthorizeUrlRequest
     * @return GetAgentCodePackageOssRamAuthorizeUrlResponse
     */
    public GetAgentCodePackageOssRamAuthorizeUrlResponse getAgentCodePackageOssRamAuthorizeUrl(String workspaceId, GetAgentCodePackageOssRamAuthorizeUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentCodePackageOssRamAuthorizeUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a time-limited upload URL for a code package without uploading the file content. The fileName must be a ZIP or TAR.GZ filename without directories. The format must match the file extension. The fileSize is in bytes, with valid values ranging from 1 to 500,000,000.
     * Use the uploadMethod, uploadUrl, and headers from the response to upload the file directly. After the upload is complete, pass the sourceUri to the artifact.code.sourceUri parameter of CreateCustomAgent or UpdateCustomAgent. The actual object and size are verified and a fixed copy is saved during creation or update. The upload URL is valid for up to 10 minutes and does not exceed the expiration time of the underlying temporary credentials. Retrieve a new URL after it expires. The example URL is desensitized and cannot be used for actual uploads. Use the original URL and request headers from this response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the upload URL for an agent code package.</p>
     * 
     * @param tmpReq GetAgentCodePackageUploadUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentCodePackageUploadUrlResponse
     */
    public GetAgentCodePackageUploadUrlResponse getAgentCodePackageUploadUrlWithOptions(String workspaceId, GetAgentCodePackageUploadUrlRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentCodePackageUploadUrlShrinkRequest request = new GetAgentCodePackageUploadUrlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentCodePackageUploadUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-code-packages/upload-url"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentCodePackageUploadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a time-limited upload URL for a code package without uploading the file content. The fileName must be a ZIP or TAR.GZ filename without directories. The format must match the file extension. The fileSize is in bytes, with valid values ranging from 1 to 500,000,000.
     * Use the uploadMethod, uploadUrl, and headers from the response to upload the file directly. After the upload is complete, pass the sourceUri to the artifact.code.sourceUri parameter of CreateCustomAgent or UpdateCustomAgent. The actual object and size are verified and a fixed copy is saved during creation or update. The upload URL is valid for up to 10 minutes and does not exceed the expiration time of the underlying temporary credentials. Retrieve a new URL after it expires. The example URL is desensitized and cannot be used for actual uploads. Use the original URL and request headers from this response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the upload URL for an agent code package.</p>
     * 
     * @param request GetAgentCodePackageUploadUrlRequest
     * @return GetAgentCodePackageUploadUrlResponse
     */
    public GetAgentCodePackageUploadUrlResponse getAgentCodePackageUploadUrl(String workspaceId, GetAgentCodePackageUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentCodePackageUploadUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * @param request GetAgentIMChannelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentIMChannelResponse
     */
    public GetAgentIMChannelResponse getAgentIMChannelWithOptions(String workspaceId, String agentId, String imChannelId, GetAgentIMChannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentIMChannel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/im-channels/" + com.aliyun.openapiutil.Client.getEncodeParam(imChannelId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentIMChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * @param request GetAgentIMChannelRequest
     * @return GetAgentIMChannelResponse
     */
    public GetAgentIMChannelResponse getAgentIMChannel(String workspaceId, String agentId, String imChannelId, GetAgentIMChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentIMChannelWithOptions(workspaceId, agentId, imChannelId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * @param request GetAgentSpecRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSpecResponse
     */
    public GetAgentSpecResponse getAgentSpecWithOptions(String workspaceId, String agentSpecName, GetAgentSpecRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSpec"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSpecResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * @param request GetAgentSpecRequest
     * @return GetAgentSpecResponse
     */
    public GetAgentSpecResponse getAgentSpec(String workspaceId, String agentSpecName, GetAgentSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentSpecWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API to complete the import.</p>
     * 
     * @param request GetAgentSpecImportFileUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSpecImportFileUrlResponse
     */
    public GetAgentSpecImportFileUrlResponse getAgentSpecImportFileUrlWithOptions(String workspaceId, GetAgentSpecImportFileUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("contentType", request.contentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSpecImportFileUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-spec-actions/get-import-file-url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSpecImportFileUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API to complete the import.</p>
     * 
     * @param request GetAgentSpecImportFileUrlRequest
     * @return GetAgentSpecImportFileUrlResponse
     */
    public GetAgentSpecImportFileUrlResponse getAgentSpecImportFileUrl(String workspaceId, GetAgentSpecImportFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentSpecImportFileUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing.</p>
     * 
     * @param request GetAgentSpecLatestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSpecLatestResponse
     */
    public GetAgentSpecLatestResponse getAgentSpecLatestWithOptions(String workspaceId, String agentSpecName, GetAgentSpecLatestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSpecLatest"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + "/latest"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSpecLatestResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing.</p>
     * 
     * @param request GetAgentSpecLatestRequest
     * @return GetAgentSpecLatestResponse
     */
    public GetAgentSpecLatestResponse getAgentSpecLatest(String workspaceId, String agentSpecName, GetAgentSpecLatestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentSpecLatestWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
     * 
     * @param request GetAgentSpecVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSpecVersionResponse
     */
    public GetAgentSpecVersionResponse getAgentSpecVersionWithOptions(String workspaceId, String agentSpecName, String agentSpecVersion, GetAgentSpecVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSpecVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSpecVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
     * 
     * @param request GetAgentSpecVersionRequest
     * @return GetAgentSpecVersionResponse
     */
    public GetAgentSpecVersionResponse getAgentSpecVersion(String workspaceId, String agentSpecName, String agentSpecVersion, GetAgentSpecVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentSpecVersionWithOptions(workspaceId, agentSpecName, agentSpecVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a single credential. Sensitive fields are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified credential and returns the list of agents bound to the credential. The credential content is returned in a masked format.</p>
     * 
     * @param request GetCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredentialWithOptions(String workspaceId, String credentialId, GetCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a single credential. Sensitive fields are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified credential and returns the list of agents bound to the credential. The credential content is returned in a masked format.</p>
     * 
     * @param request GetCredentialRequest
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredential(String workspaceId, String credentialId, GetCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCredentialWithOptions(workspaceId, credentialId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After creating or updating a custom agent, you can poll this operation to query the execution result of the latest configuration version. latestVersionStatus corresponds to latestSpecVersion. latestExecutionError indicates the cause of the pending or failed status for this version. If retryable is true, you can query again later.
     * The returned configuration is the latest submitted configuration and may not have taken effect. Verify the deployment and running status by checking latestVersionStatus, the overall agent status, and the running instance statistics sandboxPhaseCounts.
     * If the queried custom agent does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a custom agent in a specified workspace, including deployment configurations, the execute status of the latest configuration version, and the running instance status statistics.</p>
     * 
     * @param request GetCustomAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomAgentResponse
     */
    public GetCustomAgentResponse getCustomAgentWithOptions(String workspaceId, String agentId, GetCustomAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>After creating or updating a custom agent, you can poll this operation to query the execution result of the latest configuration version. latestVersionStatus corresponds to latestSpecVersion. latestExecutionError indicates the cause of the pending or failed status for this version. If retryable is true, you can query again later.
     * The returned configuration is the latest submitted configuration and may not have taken effect. Verify the deployment and running status by checking latestVersionStatus, the overall agent status, and the running instance statistics sandboxPhaseCounts.
     * If the queried custom agent does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a custom agent in a specified workspace, including deployment configurations, the execute status of the latest configuration version, and the running instance status statistics.</p>
     * 
     * @param request GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    public GetCustomAgentResponse getCustomAgent(String workspaceId, String agentId, GetCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified external agent.</p>
     * 
     * @param request GetExternalAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExternalAgentResponse
     */
    public GetExternalAgentResponse getExternalAgentWithOptions(String workspaceId, String agentId, GetExternalAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExternalAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExternalAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified external agent.</p>
     * 
     * @param request GetExternalAgentRequest
     * @return GetExternalAgentResponse
     */
    public GetExternalAgentResponse getExternalAgent(String workspaceId, String agentId, GetExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExternalAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the available access network types for a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available access network types for a specified external agent.</p>
     * 
     * @param request GetExternalAgentBootstrapOptionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExternalAgentBootstrapOptionsResponse
     */
    public GetExternalAgentBootstrapOptionsResponse getExternalAgentBootstrapOptionsWithOptions(String workspaceId, String agentId, GetExternalAgentBootstrapOptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExternalAgentBootstrapOptions"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/bootstrap/options"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExternalAgentBootstrapOptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the available access network types for a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available access network types for a specified external agent.</p>
     * 
     * @param request GetExternalAgentBootstrapOptionsRequest
     * @return GetExternalAgentBootstrapOptionsResponse
     */
    public GetExternalAgentBootstrapOptionsResponse getExternalAgentBootstrapOptions(String workspaceId, String agentId, GetExternalAgentBootstrapOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExternalAgentBootstrapOptionsWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Reads existing bindings by type. CustomSSO returns the saved protocol, standardized saml, expected loginEnabled, syncEnabled, and shared binding status. If SAML is not configured, the saml and configuration fields may not be returned. When saml is configured, the system additionally queries AgentIdentity, and configuration represents the actual SSO configuration. The saml field is the data source for the edit form. The status switch for configuration can be Enabled or Disabled. If the upstream query fails, an error is reported. Do not treat this as an unconfigured state.
     * Only this operation reads back the actual SAML configuration. List and write operations do not guarantee that configuration is returned. A user pool in the READY state does not indicate that SAML is configured. UPDATING and UPDATE_FAILED describe logon configuration tasks, not SCIM tasks. The vendor callback URL for CustomSSO is empty. Use GetIdentityProviderSCIM.operationStatus to query SCIM operation results.</p>
     * <h2>Request and examples</h2>
     * <p>GET /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Calling conventions: Call the API operation in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example shows the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business data. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log keys. Asynchronous business tasks do not mean that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/identity-providers/CustomSSO
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;READY&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call to the upstream service may fail and return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret a read failure as an unconfigured state. Actual authentication and workspace not found errors follow common error handling.
     * 404 IdentityProviderNotFound: No binding exists, or the input type is inconsistent with the current binding. If SAML is already configured, an upstream readback failure does not degrade to a successful empty configuration.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>SAML configuration completion and logon enabling are independent operations. protocol=SAML and the presence of saml indicate that the logon configuration has been submitted, and loginEnabled indicates the expected logon switch. Check the effective status based on the actual SSO status in configuration. SCIM uses an independent query API operation. Do not use status=READY of this API operation as the basis for successful SCIM synchronization. Currently, OIDC, JIT configuration, or JIT status fields are not provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding and expected configuration of a specified identity provider. When CustomSSO is configured with SAML, this operation reads back the actual upstream SSO configuration. The SCIM status is queried through a separate API operation.</p>
     * 
     * @param request GetIdentityProviderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProviderWithOptions(String workspaceId, String identityProviderType, GetIdentityProviderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProvider"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Reads existing bindings by type. CustomSSO returns the saved protocol, standardized saml, expected loginEnabled, syncEnabled, and shared binding status. If SAML is not configured, the saml and configuration fields may not be returned. When saml is configured, the system additionally queries AgentIdentity, and configuration represents the actual SSO configuration. The saml field is the data source for the edit form. The status switch for configuration can be Enabled or Disabled. If the upstream query fails, an error is reported. Do not treat this as an unconfigured state.
     * Only this operation reads back the actual SAML configuration. List and write operations do not guarantee that configuration is returned. A user pool in the READY state does not indicate that SAML is configured. UPDATING and UPDATE_FAILED describe logon configuration tasks, not SCIM tasks. The vendor callback URL for CustomSSO is empty. Use GetIdentityProviderSCIM.operationStatus to query SCIM operation results.</p>
     * <h2>Request and examples</h2>
     * <p>GET /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Calling conventions: Call the API operation in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example shows the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business data. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log keys. Asynchronous business tasks do not mean that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/identity-providers/CustomSSO
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;READY&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call to the upstream service may fail and return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret a read failure as an unconfigured state. Actual authentication and workspace not found errors follow common error handling.
     * 404 IdentityProviderNotFound: No binding exists, or the input type is inconsistent with the current binding. If SAML is already configured, an upstream readback failure does not degrade to a successful empty configuration.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>SAML configuration completion and logon enabling are independent operations. protocol=SAML and the presence of saml indicate that the logon configuration has been submitted, and loginEnabled indicates the expected logon switch. Check the effective status based on the actual SSO status in configuration. SCIM uses an independent query API operation. Do not use status=READY of this API operation as the basis for successful SCIM synchronization. Currently, OIDC, JIT configuration, or JIT status fields are not provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding and expected configuration of a specified identity provider. When CustomSSO is configured with SAML, this operation reads back the actual upstream SSO configuration. The SCIM status is queried through a separate API operation.</p>
     * 
     * @param request GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProvider(String workspaceId, String identityProviderType, GetIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityProviderWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>The shared CustomSSO user pool must be created and must not be in the overall dissociation process or have failed to be dissociated. Prior SAML configuration is not required. SAML updates in progress or failed SAML updates do not block the query. The configuration.status and baseUrl parameters are obtained from AgentIdentity. The syncEnabled parameter is the expected AC synchronization switch. The operationStatus parameter indicates the most recent independent SCIM switch and the first full import task when the switch is enabled. The presence of a URL does not mean that external provisioning is complete, nor does it mean that AC synchronization is enabled.
     * operationStatus: PENDING (waiting), RUNNING (in progress), PAUSED (paused), SUCCESS (succeeded), FAILED (failed), CANCELED (canceled). If there are no historical tasks, it returns null or is not returned. You can poll when the status is PENDING or RUNNING. Stop polling when a terminal state is reached. You can manually refresh when the status is PAUSED. This operation does not provide taskId or failure details, and does not indicate credential issuance, external provisioning connection tests, or the health of continuous incremental synchronization. After it is disabled, the URL, credentials, and historical task records may still be retained.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/scim-provisioning
     * Calling conventions: Call this operation in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/scim-provisioning
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;configuration&quot;: {
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;baseUrl&quot;: &quot;https://example.com/scim/v2&quot;
     *     },
     *     &quot;syncEnabled&quot;: true,
     *     &quot;operationStatus&quot;: &quot;SUCCESS&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that there is no binding of the matching type. Synchronous calls to upstream services that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow common error handling.
     * 400 InvalidParameter: The shared user pool is unavailable, being dissociated, or failed to be dissociated. If there is no binding, 404 IdentityProviderNotFound is returned. Upstream read failures must retain the error and cannot be mapped to Disabled, unconfigured, or synchronization success.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>SCIM configuration sequence: After preparing the shared pool, call PrepareIdentityProviderSCIM and configure the returned baseUrl and newly issued token to the provisioning system of the external IdP. After completing the external connection test, call UpdateIdentityProviderSCIM to enable synchronization, and then call this operation to query operationStatus. SUCCESS only indicates that the most recent SCIM task is completed, and does not represent the health of continuous incremental synchronization or the success of the external provisioning connection test.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the actual SCIM receiving configuration, the expected AC synchronization switch, and the status of the most recent independent SCIM task. Prior SAML configuration is not required.</p>
     * 
     * @param request GetIdentityProviderSCIMRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderSCIMResponse
     */
    public GetIdentityProviderSCIMResponse getIdentityProviderSCIMWithOptions(String workspaceId, GetIdentityProviderSCIMRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderSCIM"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/scim-provisioning"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderSCIMResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>The shared CustomSSO user pool must be created and must not be in the overall dissociation process or have failed to be dissociated. Prior SAML configuration is not required. SAML updates in progress or failed SAML updates do not block the query. The configuration.status and baseUrl parameters are obtained from AgentIdentity. The syncEnabled parameter is the expected AC synchronization switch. The operationStatus parameter indicates the most recent independent SCIM switch and the first full import task when the switch is enabled. The presence of a URL does not mean that external provisioning is complete, nor does it mean that AC synchronization is enabled.
     * operationStatus: PENDING (waiting), RUNNING (in progress), PAUSED (paused), SUCCESS (succeeded), FAILED (failed), CANCELED (canceled). If there are no historical tasks, it returns null or is not returned. You can poll when the status is PENDING or RUNNING. Stop polling when a terminal state is reached. You can manually refresh when the status is PAUSED. This operation does not provide taskId or failure details, and does not indicate credential issuance, external provisioning connection tests, or the health of continuous incremental synchronization. After it is disabled, the URL, credentials, and historical task records may still be retained.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/scim-provisioning
     * Calling conventions: Call this operation in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/scim-provisioning
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;configuration&quot;: {
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;baseUrl&quot;: &quot;https://example.com/scim/v2&quot;
     *     },
     *     &quot;syncEnabled&quot;: true,
     *     &quot;operationStatus&quot;: &quot;SUCCESS&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that there is no binding of the matching type. Synchronous calls to upstream services that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow common error handling.
     * 400 InvalidParameter: The shared user pool is unavailable, being dissociated, or failed to be dissociated. If there is no binding, 404 IdentityProviderNotFound is returned. Upstream read failures must retain the error and cannot be mapped to Disabled, unconfigured, or synchronization success.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>SCIM configuration sequence: After preparing the shared pool, call PrepareIdentityProviderSCIM and configure the returned baseUrl and newly issued token to the provisioning system of the external IdP. After completing the external connection test, call UpdateIdentityProviderSCIM to enable synchronization, and then call this operation to query operationStatus. SUCCESS only indicates that the most recent SCIM task is completed, and does not represent the health of continuous incremental synchronization or the success of the external provisioning connection test.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the actual SCIM receiving configuration, the expected AC synchronization switch, and the status of the most recent independent SCIM task. Prior SAML configuration is not required.</p>
     * 
     * @param request GetIdentityProviderSCIMRequest
     * @return GetIdentityProviderSCIMResponse
     */
    public GetIdentityProviderSCIMResponse getIdentityProviderSCIM(String workspaceId, GetIdentityProviderSCIMRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityProviderSCIMWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>功能与前提\n要求已有可用 CustomSSO 共享用户池，identityProviderType=CustomSSO，protocol 必填且仅支持精确值 SAML；不要求先上传 IdP Metadata。返回我方 SP 的 entityId、acsUrl、metadataXml，供用户配置外部 IdP。它们不是外部 IdP 的登录 URL 或 IdP Entity ID，不能将 SP XML 作为 IdP XML 提交 UpdateIdentityProvider。\n本接口只读取，不启用登录、不开启 SCIM、不创建凭据、不执行登录连接测试。共享池初始化中、解绑中或解绑失败时不可读取。\n\n## 请求与示例\nGET /workspaces/{workspaceId}/identity-providers/{identityProviderType}/service-provider\n调用约定：按目标 Workspace 的地域调用，使用有相应 Workspace 身份源资源权限的 AK/STS 身份。下文示例中的 ws-example、URL、证书和 Token 均为占位值，需替换为真实值。请求体示例表示公开 API 的 body 参数内容，不是后端直连接口额外的 body 包装。返回示例只展示业务部分，外层还包括 requestId、success、code、message、httpStatusCode；排障请保留 requestId，不记录密钥。业务任务异步不意味着 HTTP 请求长连接等待完成。\n<code>text\nGET /workspaces/ws-example/identity-providers/CustomSSO/service-provider?protocol=SAML\n</code>\n\n## 返回示例\n<code>json\n{\n  &quot;data&quot;: {\n    &quot;protocol&quot;: &quot;SAML&quot;,\n    &quot;entityId&quot;: &quot;&lt;我方 SP Entity ID&gt;&quot;,\n    &quot;acsUrl&quot;: &quot;https://example.com/saml/acs&quot;,\n    &quot;metadataXml&quot;: &quot;&lt;我方 SP Metadata XML&gt;&quot;\n  }\n}\n</code>\n\n## 错误与处理\n错误处理：400 InvalidParameter 表示参数或当前配置前提不满足；404 IdentityProviderNotFound 表示没有匹配类型的绑定。同步调用上游失败可能返回 503 IdentityProviderProvisioningUnavailable；保留请求 ID 排查，不把读取失败解释为未配置。实际鉴权和 Workspace 不存在错误沿用公共错误处理。\n400 InvalidParameter：identityProviderType 或 protocol 不支持。404 IdentityProviderNotFound：尚无 CustomSSO 绑定。409 IdentityProviderOperationConflict：用户池未准备好、解绑中或解绑失败。\n\n## 调用关系与使用边界\nSAML 配置顺序：CreateIdentityProvider 初始化 CustomSSO 共享池，等待 GetIdentityProvider 返回 READY；调用本接口取得 SP 信息并配置到外部 IdP；再将外部 IdP Metadata XML 或完整手填配置提交 UpdateIdentityProvider。保存后按需单独启用 loginEnabled。SP 信息查询不会完成外部 IdP 配置或验证登录。</h2>
     * 
     * <b>summary</b> : 
     * <p>查询 SAML 服务提供商信息</p>
     * 
     * @param request GetIdentityProviderServiceProviderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderServiceProviderResponse
     */
    public GetIdentityProviderServiceProviderResponse getIdentityProviderServiceProviderWithOptions(String workspaceId, String identityProviderType, GetIdentityProviderServiceProviderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderServiceProvider"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + "/service-provider"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderServiceProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>功能与前提\n要求已有可用 CustomSSO 共享用户池，identityProviderType=CustomSSO，protocol 必填且仅支持精确值 SAML；不要求先上传 IdP Metadata。返回我方 SP 的 entityId、acsUrl、metadataXml，供用户配置外部 IdP。它们不是外部 IdP 的登录 URL 或 IdP Entity ID，不能将 SP XML 作为 IdP XML 提交 UpdateIdentityProvider。\n本接口只读取，不启用登录、不开启 SCIM、不创建凭据、不执行登录连接测试。共享池初始化中、解绑中或解绑失败时不可读取。\n\n## 请求与示例\nGET /workspaces/{workspaceId}/identity-providers/{identityProviderType}/service-provider\n调用约定：按目标 Workspace 的地域调用，使用有相应 Workspace 身份源资源权限的 AK/STS 身份。下文示例中的 ws-example、URL、证书和 Token 均为占位值，需替换为真实值。请求体示例表示公开 API 的 body 参数内容，不是后端直连接口额外的 body 包装。返回示例只展示业务部分，外层还包括 requestId、success、code、message、httpStatusCode；排障请保留 requestId，不记录密钥。业务任务异步不意味着 HTTP 请求长连接等待完成。\n<code>text\nGET /workspaces/ws-example/identity-providers/CustomSSO/service-provider?protocol=SAML\n</code>\n\n## 返回示例\n<code>json\n{\n  &quot;data&quot;: {\n    &quot;protocol&quot;: &quot;SAML&quot;,\n    &quot;entityId&quot;: &quot;&lt;我方 SP Entity ID&gt;&quot;,\n    &quot;acsUrl&quot;: &quot;https://example.com/saml/acs&quot;,\n    &quot;metadataXml&quot;: &quot;&lt;我方 SP Metadata XML&gt;&quot;\n  }\n}\n</code>\n\n## 错误与处理\n错误处理：400 InvalidParameter 表示参数或当前配置前提不满足；404 IdentityProviderNotFound 表示没有匹配类型的绑定。同步调用上游失败可能返回 503 IdentityProviderProvisioningUnavailable；保留请求 ID 排查，不把读取失败解释为未配置。实际鉴权和 Workspace 不存在错误沿用公共错误处理。\n400 InvalidParameter：identityProviderType 或 protocol 不支持。404 IdentityProviderNotFound：尚无 CustomSSO 绑定。409 IdentityProviderOperationConflict：用户池未准备好、解绑中或解绑失败。\n\n## 调用关系与使用边界\nSAML 配置顺序：CreateIdentityProvider 初始化 CustomSSO 共享池，等待 GetIdentityProvider 返回 READY；调用本接口取得 SP 信息并配置到外部 IdP；再将外部 IdP Metadata XML 或完整手填配置提交 UpdateIdentityProvider。保存后按需单独启用 loginEnabled。SP 信息查询不会完成外部 IdP 配置或验证登录。</h2>
     * 
     * <b>summary</b> : 
     * <p>查询 SAML 服务提供商信息</p>
     * 
     * @param request GetIdentityProviderServiceProviderRequest
     * @return GetIdentityProviderServiceProviderResponse
     */
    public GetIdentityProviderServiceProviderResponse getIdentityProviderServiceProvider(String workspaceId, String identityProviderType, GetIdentityProviderServiceProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityProviderServiceProviderWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the status, current step, number of processed users, and failure cause of a manual synchronization task by using the local taskId of AgentCore. The taskId must be obtained from CreateIdentityProviderSyncJob in the same workspace and identity provider. It is not the synchronizationJobId of AgentIdentity. Poll the task until the status is SUCCESS, FAILED, or CANCELED. The PENDING, RUNNING, and PAUSED statuses do not indicate completion. The syncedUserCount includes updated existing users and does not equal the number of newly added users or the progress percentage.
     * Authorization information: The RAM operation is agentcore:GetIdentityProviderSyncJob, the access level is Read, and the resource ARN is acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is a required authorization resource.
     * Idempotence and retry: This operation is read-only and can be repeatedly queried.
     * Calling this API operation is free of charge, and operation records support ActionTrail auditing.
     * Response example:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;taskId&quot;: &quot;12345678-1234-4234-8234-123456789abc&quot;,
     *     &quot;status&quot;: &quot;SUCCESS&quot;,
     *     &quot;currentStep&quot;: &quot;SYNC&quot;,
     *     &quot;synchronizationJobId&quot;: &quot;syncjob_0123456789abcdef0123456789abcdef&quot;,
     *     &quot;syncedUserCount&quot;: 12
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries an identity provider synchronization task.</p>
     * 
     * @param request GetIdentityProviderSyncJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderSyncJobResponse
     */
    public GetIdentityProviderSyncJobResponse getIdentityProviderSyncJobWithOptions(String workspaceId, String identityProviderType, String taskId, GetIdentityProviderSyncJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderSyncJob"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + "/sync-jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status, current step, number of processed users, and failure cause of a manual synchronization task by using the local taskId of AgentCore. The taskId must be obtained from CreateIdentityProviderSyncJob in the same workspace and identity provider. It is not the synchronizationJobId of AgentIdentity. Poll the task until the status is SUCCESS, FAILED, or CANCELED. The PENDING, RUNNING, and PAUSED statuses do not indicate completion. The syncedUserCount includes updated existing users and does not equal the number of newly added users or the progress percentage.
     * Authorization information: The RAM operation is agentcore:GetIdentityProviderSyncJob, the access level is Read, and the resource ARN is acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is a required authorization resource.
     * Idempotence and retry: This operation is read-only and can be repeatedly queried.
     * Calling this API operation is free of charge, and operation records support ActionTrail auditing.
     * Response example:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;taskId&quot;: &quot;12345678-1234-4234-8234-123456789abc&quot;,
     *     &quot;status&quot;: &quot;SUCCESS&quot;,
     *     &quot;currentStep&quot;: &quot;SYNC&quot;,
     *     &quot;synchronizationJobId&quot;: &quot;syncjob_0123456789abcdef0123456789abcdef&quot;,
     *     &quot;syncedUserCount&quot;: 12
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries an identity provider synchronization task.</p>
     * 
     * @param request GetIdentityProviderSyncJobRequest
     * @return GetIdentityProviderSyncJobResponse
     */
    public GetIdentityProviderSyncJobResponse getIdentityProviderSyncJob(String workspaceId, String identityProviderType, String taskId, GetIdentityProviderSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityProviderSyncJobWithOptions(workspaceId, identityProviderType, taskId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the saved synchronization scope, the validity of selected departments, and the estimated user count downstream of the identity provider. This operation is not used for real-time estimation of unsaved selections. AllAuthorized indicates the address book scope authorized for the application, which is not equivalent to the entire enterprise organization. An empty selectedDepartments array does not prove that the organization has no sub-departments. The estimation can be used only when estimateStatus is Ready and a count is returned. A missing count does not indicate 0.
     * Authorization information: RAM operation agentcore:GetIdentityProviderSyncScope, access level Read, resource ARN: acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is a required authorization resource.
     * Idempotence and retry: This operation is read-only and can be queried repeatedly.
     * Calling this API operation is free of charge. Operation records support ActionTrail auditing.
     * Sample response:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;syncScope&quot;: {
     *       &quot;mode&quot;: &quot;SelectedDepartments&quot;,
     *       &quot;departmentIds&quot;: [
     *         &quot;10001&quot;
     *       ]
     *     },
     *     &quot;selectedDepartments&quot;: [
     *       {
     *         &quot;id&quot;: &quot;10001&quot;,
     *         &quot;name&quot;: &quot;R&amp;D Department&quot;,
     *         &quot;exists&quot;: true
     *       }
     *     ],
     *     &quot;estimateStatus&quot;: &quot;Ready&quot;,
     *     &quot;expandedDepartmentCount&quot;: 2,
     *     &quot;estimatedUserCount&quot;: 12
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the synchronization scope of an identity provider.</p>
     * 
     * @param request GetIdentityProviderSyncScopeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderSyncScopeResponse
     */
    public GetIdentityProviderSyncScopeResponse getIdentityProviderSyncScopeWithOptions(String workspaceId, String identityProviderType, GetIdentityProviderSyncScopeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderSyncScope"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + "/sync-scope"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderSyncScopeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the saved synchronization scope, the validity of selected departments, and the estimated user count downstream of the identity provider. This operation is not used for real-time estimation of unsaved selections. AllAuthorized indicates the address book scope authorized for the application, which is not equivalent to the entire enterprise organization. An empty selectedDepartments array does not prove that the organization has no sub-departments. The estimation can be used only when estimateStatus is Ready and a count is returned. A missing count does not indicate 0.
     * Authorization information: RAM operation agentcore:GetIdentityProviderSyncScope, access level Read, resource ARN: acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is a required authorization resource.
     * Idempotence and retry: This operation is read-only and can be queried repeatedly.
     * Calling this API operation is free of charge. Operation records support ActionTrail auditing.
     * Sample response:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;syncScope&quot;: {
     *       &quot;mode&quot;: &quot;SelectedDepartments&quot;,
     *       &quot;departmentIds&quot;: [
     *         &quot;10001&quot;
     *       ]
     *     },
     *     &quot;selectedDepartments&quot;: [
     *       {
     *         &quot;id&quot;: &quot;10001&quot;,
     *         &quot;name&quot;: &quot;R&amp;D Department&quot;,
     *         &quot;exists&quot;: true
     *       }
     *     ],
     *     &quot;estimateStatus&quot;: &quot;Ready&quot;,
     *     &quot;expandedDepartmentCount&quot;: 2,
     *     &quot;estimatedUserCount&quot;: 12
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the synchronization scope of an identity provider.</p>
     * 
     * @param request GetIdentityProviderSyncScopeRequest
     * @return GetIdentityProviderSyncScopeResponse
     */
    public GetIdentityProviderSyncScopeResponse getIdentityProviderSyncScope(String workspaceId, String identityProviderType, GetIdentityProviderSyncScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityProviderSyncScopeWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of the logical image cache in the current workspace. Returns the complete source, current digest, actual size, creation time, status, and secure error messages. AgentCount counts configuration references with the switch enabled. CanDelete verifies both configuration references and instance usage. If the switch is disabled, the count is 0, but deletion is still prohibited if old instances are not released. If the resource does not belong to the current workspace, resources with the same content from other workspaces are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an image cache.</p>
     * 
     * @param request GetImageCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageCacheResponse
     */
    public GetImageCacheResponse getImageCacheWithOptions(String imageId, GetImageCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageCache"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/image-caches/" + com.aliyun.openapiutil.Client.getEncodeParam(imageId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of the logical image cache in the current workspace. Returns the complete source, current digest, actual size, creation time, status, and secure error messages. AgentCount counts configuration references with the switch enabled. CanDelete verifies both configuration references and instance usage. If the switch is disabled, the count is 0, but deletion is still prohibited if old instances are not released. If the resource does not belong to the current workspace, resources with the same content from other workspaces are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an image cache.</p>
     * 
     * @param request GetImageCacheRequest
     * @return GetImageCacheResponse
     */
    public GetImageCacheResponse getImageCache(String imageId, GetImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageCacheWithOptions(imageId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified managed agent.</p>
     * 
     * @param request GetManagedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManagedAgentResponse
     */
    public GetManagedAgentResponse getManagedAgentWithOptions(String workspaceId, String agentId, GetManagedAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManagedAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified managed agent.</p>
     * 
     * @param request GetManagedAgentRequest
     * @return GetManagedAgentResponse
     */
    public GetManagedAgentResponse getManagedAgent(String workspaceId, String agentId, GetManagedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getManagedAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the details of a specified MCP server, including the address, type, status, authentication configuration, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP server, including the address, type, status, authentication configuration, and protocol.</p>
     * 
     * @param request GetMcpRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcpResponse
     */
    public GetMcpResponse getMcpWithOptions(String workspaceId, String mcpServerId, GetMcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcp"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the details of a specified MCP server, including the address, type, status, authentication configuration, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP server, including the address, type, status, authentication configuration, and protocol.</p>
     * 
     * @param request GetMcpRequest
     * @return GetMcpResponse
     */
    public GetMcpResponse getMcp(String workspaceId, String mcpServerId, GetMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMcpWithOptions(workspaceId, mcpServerId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the current template version and installation form schema.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an MCP marketplace template.</p>
     * 
     * @param request GetMcpMarketItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcpMarketItemResponse
     */
    public GetMcpMarketItemResponse getMcpMarketItemWithOptions(String workspaceId, String marketItemId, GetMcpMarketItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcpMarketItem"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-market/items/" + com.aliyun.openapiutil.Client.getEncodeParam(marketItemId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcpMarketItemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Returns the current template version and installation form schema.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an MCP marketplace template.</p>
     * 
     * @param request GetMcpMarketItemRequest
     * @return GetMcpMarketItemResponse
     */
    public GetMcpMarketItemResponse getMcpMarketItem(String workspaceId, String marketItemId, GetMcpMarketItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMcpMarketItemWithOptions(workspaceId, marketItemId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a long-term memory by memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a long-term memory by memory ID.</p>
     * 
     * @param request GetMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemoryWithOptions(String workspaceId, String memoryStoreName, String memoryId, GetMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemory"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries a long-term memory by memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a long-term memory by memory ID.</p>
     * 
     * @param request GetMemoryRequest
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemory(String workspaceId, String memoryStoreName, String memoryId, GetMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryWithOptions(workspaceId, memoryStoreName, memoryId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the public information and current status of a MemoryStore in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the public information and current status of a MemoryStore in a specified workspace.</p>
     * 
     * @param request GetMemoryStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryStoreResponse
     */
    public GetMemoryStoreResponse getMemoryStoreWithOptions(String workspaceId, String memoryStoreName, GetMemoryStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryStore"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the public information and current status of a MemoryStore in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the public information and current status of a MemoryStore in a specified workspace.</p>
     * 
     * @param request GetMemoryStoreRequest
     * @return GetMemoryStoreResponse
     */
    public GetMemoryStoreResponse getMemoryStore(String workspaceId, String memoryStoreName, GetMemoryStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryStoreWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the task ID returned by the asynchronous AddMemories operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the task ID returned by the asynchronous AddMemories operation.</p>
     * 
     * @param request GetMemoryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryTaskResponse
     */
    public GetMemoryTaskResponse getMemoryTaskWithOptions(String workspaceId, String memoryStoreName, String taskId, GetMemoryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryTask"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memory-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the task ID returned by the asynchronous AddMemories operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the task ID returned by the asynchronous AddMemories operation.</p>
     * 
     * @param request GetMemoryTaskRequest
     * @return GetMemoryTaskResponse
     */
    public GetMemoryTaskResponse getMemoryTask(String workspaceId, String memoryStoreName, String taskId, GetMemoryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryTaskWithOptions(workspaceId, memoryStoreName, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed configuration and region of a model in a specified workspace.</p>
     * 
     * @param request GetModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelResponse
     */
    public GetModelResponse getModelWithOptions(String workspaceId, String modelId, GetModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed configuration and region of a model in a specified workspace.</p>
     * 
     * @param request GetModelRequest
     * @return GetModelResponse
     */
    public GetModelResponse getModel(String workspaceId, String modelId, GetModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelWithOptions(workspaceId, modelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed configuration, credential configuration status, publish status, and region of a specified model connection.</p>
     * 
     * @param request GetModelConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelConnectionResponse
     */
    public GetModelConnectionResponse getModelConnectionWithOptions(String workspaceId, String connectionId, GetModelConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelConnection"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/model-connections/" + com.aliyun.openapiutil.Client.getEncodeParam(connectionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed configuration, credential configuration status, publish status, and region of a specified model connection.</p>
     * 
     * @param request GetModelConnectionRequest
     * @return GetModelConnectionResponse
     */
    public GetModelConnectionResponse getModelConnection(String workspaceId, String connectionId, GetModelConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelConnectionWithOptions(workspaceId, connectionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the details of a specified service endpoint. A service endpoint (ServiceEndpoint) provides a stable access URL for a specific agent version (AgentVersion) or workspace collaboration component. The response includes target routing, access URL list, authentication configuration, and current lifecycle status.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified service endpoint, including target routing, access URLs, authentication configuration, and current status.</p>
     * 
     * @param request GetServiceEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceEndpointResponse
     */
    public GetServiceEndpointResponse getServiceEndpointWithOptions(String workspaceId, String serviceEndpointId, GetServiceEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceEndpoint"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/service-endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceEndpointId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the details of a specified service endpoint. A service endpoint (ServiceEndpoint) provides a stable access URL for a specific agent version (AgentVersion) or workspace collaboration component. The response includes target routing, access URL list, authentication configuration, and current lifecycle status.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified service endpoint, including target routing, access URLs, authentication configuration, and current status.</p>
     * 
     * @param request GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    public GetServiceEndpointResponse getServiceEndpoint(String workspaceId, String serviceEndpointId, GetServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceEndpointWithOptions(workspaceId, serviceEndpointId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the currently active API key for a specified service endpoint. The call succeeds only when API key authentication is enabled for the service endpoint and the gateway consumer and credentials are ready. The service reads the API key from the gateway in real time, and AgentCore does not persist the plaintext. Keep the returned API key secure and avoid logging it or exposing it in public configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the currently active API key and its invocation method for a service endpoint in a specified workspace.</p>
     * 
     * @param request GetServiceEndpointApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceEndpointApiKeyResponse
     */
    public GetServiceEndpointApiKeyResponse getServiceEndpointApiKeyWithOptions(String workspaceId, String serviceEndpointId, GetServiceEndpointApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceEndpointApiKey"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/service-endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceEndpointId) + "/api-key/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceEndpointApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the currently active API key for a specified service endpoint. The call succeeds only when API key authentication is enabled for the service endpoint and the gateway consumer and credentials are ready. The service reads the API key from the gateway in real time, and AgentCore does not persist the plaintext. Keep the returned API key secure and avoid logging it or exposing it in public configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the currently active API key and its invocation method for a service endpoint in a specified workspace.</p>
     * 
     * @param request GetServiceEndpointApiKeyRequest
     * @return GetServiceEndpointApiKeyResponse
     */
    public GetServiceEndpointApiKeyResponse getServiceEndpointApiKey(String workspaceId, String serviceEndpointId, GetServiceEndpointApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceEndpointApiKeyWithOptions(workspaceId, serviceEndpointId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the basic information, version status, labels, visibility scope, and version list of a specified Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information, version status, labels, visibility scope, and version list of a specified Skill.</p>
     * 
     * @param request GetSkillDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillDetailResponse
     */
    public GetSkillDetailResponse getSkillDetailWithOptions(String workspaceId, String skillName, GetSkillDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillDetail"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the basic information, version status, labels, visibility scope, and version list of a specified Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information, version status, labels, visibility scope, and version list of a specified Skill.</p>
     * 
     * @param request GetSkillDetailRequest
     * @return GetSkillDetailResponse
     */
    public GetSkillDetailResponse getSkillDetail(String workspaceId, String skillName, GetSkillDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSkillDetailWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS presigned upload URL and object name required to import a Skill ZIP package. After the upload is complete, you can call the Skill OSS upload API to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned upload URL and object name required to import a Skill ZIP package. After the upload is complete, you can call the Skill OSS upload API to complete the import.</p>
     * 
     * @param request GetSkillImportFileUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillImportFileUrlResponse
     */
    public GetSkillImportFileUrlResponse getSkillImportFileUrlWithOptions(String workspaceId, GetSkillImportFileUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("contentType", request.contentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillImportFileUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skill-actions/get-import-file-url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillImportFileUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS presigned upload URL and object name required to import a Skill ZIP package. After the upload is complete, you can call the Skill OSS upload API to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned upload URL and object name required to import a Skill ZIP package. After the upload is complete, you can call the Skill OSS upload API to complete the import.</p>
     * 
     * @param request GetSkillImportFileUrlRequest
     * @return GetSkillImportFileUrlResponse
     */
    public GetSkillImportFileUrlResponse getSkillImportFileUrl(String workspaceId, GetSkillImportFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSkillImportFileUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the complete details of a specified Skill version, including version metadata, Skill content, and associated resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete details of a specified Skill version, including version metadata, Skill content, and associated resources.</p>
     * 
     * @param request GetSkillVersionDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillVersionDetailResponse
     */
    public GetSkillVersionDetailResponse getSkillVersionDetailWithOptions(String workspaceId, String skillName, String skillVersion, GetSkillVersionDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillVersionDetail"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(skillVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillVersionDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the complete details of a specified Skill version, including version metadata, Skill content, and associated resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete details of a specified Skill version, including version metadata, Skill content, and associated resources.</p>
     * 
     * @param request GetSkillVersionDetailRequest
     * @return GetSkillVersionDetailResponse
     */
    public GetSkillVersionDetailResponse getSkillVersionDetail(String workspaceId, String skillName, String skillVersion, GetSkillVersionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSkillVersionDetailWithOptions(workspaceId, skillName, skillVersion, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified team. The response includes the complete attributes and team roles of each user member and agent member in the team.</p>
     * 
     * @param request GetTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeamWithOptions(String workspaceId, String teamId, GetTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTeam"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified team. The response includes the complete attributes and team roles of each user member and agent member in the team.</p>
     * 
     * @param request GetTeamRequest
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeam(String workspaceId, String teamId, GetTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTeamWithOptions(workspaceId, teamId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific user in a specified workspace. Returns an error if the user does not exist.</p>
     * 
     * @param request GetUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(String workspaceId, String agentCoreUserId, GetUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(agentCoreUserId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific user in a specified workspace. Returns an error if the user does not exist.</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(String workspaceId, String agentCoreUserId, GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(workspaceId, agentCoreUserId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries the details of a workspace by workspace ID, including the lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policies.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a workspace by workspace ID, including the lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policies.</p>
     * 
     * @param request GetWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceId, GetWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries the details of a workspace by workspace ID, including the lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policies.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a workspace by workspace ID, including the lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policies.</p>
     * 
     * @param request GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(String workspaceId, GetWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ACR and user OSS mounts share the workspace role. If no existing role is found, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is reused and permissions are appended without overwriting existing OSS policies. Fixed historical shared roles continue to be reused and are not recreated or renamed due to new naming templates. The acrInstanceId, namespace, and repository parameters are required. The region and account are derived from the workspace context. Returns the role resolved by the backend and the authorization URL for the target repository. This operation does not create ACR or agent execution versions, nor does it deliver runtime configurations. After authorization is complete, you can call Verify before creating or updating an agent, without the need to call an independent Ensure operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the ACR RAM authorization URL of a workspace.</p>
     * 
     * @param request GetWorkspaceAcrRamAuthorizeUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceAcrRamAuthorizeUrlResponse
     */
    public GetWorkspaceAcrRamAuthorizeUrlResponse getWorkspaceAcrRamAuthorizeUrlWithOptions(String workspaceId, GetWorkspaceAcrRamAuthorizeUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrInstanceId)) {
            query.put("acrInstanceId", request.acrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repository)) {
            query.put("repository", request.repository);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaceAcrRamAuthorizeUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/acr/authorize"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceAcrRamAuthorizeUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>ACR and user OSS mounts share the workspace role. If no existing role is found, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is reused and permissions are appended without overwriting existing OSS policies. Fixed historical shared roles continue to be reused and are not recreated or renamed due to new naming templates. The acrInstanceId, namespace, and repository parameters are required. The region and account are derived from the workspace context. Returns the role resolved by the backend and the authorization URL for the target repository. This operation does not create ACR or agent execution versions, nor does it deliver runtime configurations. After authorization is complete, you can call Verify before creating or updating an agent, without the need to call an independent Ensure operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the ACR RAM authorization URL of a workspace.</p>
     * 
     * @param request GetWorkspaceAcrRamAuthorizeUrlRequest
     * @return GetWorkspaceAcrRamAuthorizeUrlResponse
     */
    public GetWorkspaceAcrRamAuthorizeUrlResponse getWorkspaceAcrRamAuthorizeUrl(String workspaceId, GetWorkspaceAcrRamAuthorizeUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceAcrRamAuthorizeUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Determines the account, region, and shared role based on the workspace, and concatenates the resource ARN based on the provided fileSystemId and accessPointId. The server parameter is used to generate the policy name. This operation does not query NAS or check the resource status, and returns an authorization URL that contains only the target NAS policy. After completing RAM authorization, you must call the verification API.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the RAM authorization URL for mounting AgenticFS in a workspace.</p>
     * 
     * @param request GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse
     */
    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse getWorkspaceAgenticFsMountRamAuthorizeUrlWithOptions(String workspaceId, GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("accessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("fileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.server)) {
            query.put("server", request.server);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaceAgenticFsMountRamAuthorizeUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agentic-fs/authorize"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Determines the account, region, and shared role based on the workspace, and concatenates the resource ARN based on the provided fileSystemId and accessPointId. The server parameter is used to generate the policy name. This operation does not query NAS or check the resource status, and returns an authorization URL that contains only the target NAS policy. After completing RAM authorization, you must call the verification API.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the RAM authorization URL for mounting AgenticFS in a workspace.</p>
     * 
     * @param request GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest
     * @return GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse
     */
    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse getWorkspaceAgenticFsMountRamAuthorizeUrl(String workspaceId, GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceAgenticFsMountRamAuthorizeUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the plug-in status of a specified workspace. Returns whether the plug-in is enabled, its lifecycle status, and the currently effective configuration. Currently, two types of plug-ins are supported: collaboration and agentloop. If a plug-in is not installed, its status is DISABLED.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the plug-in status of a specified workspace.</p>
     * 
     * @param request GetWorkspacePluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspacePluginResponse
     */
    public GetWorkspacePluginResponse getWorkspacePluginWithOptions(String workspaceId, String pluginName, GetWorkspacePluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspacePlugin"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/plugins/" + com.aliyun.openapiutil.Client.getEncodeParam(pluginName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspacePluginResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the plug-in status of a specified workspace. Returns whether the plug-in is enabled, its lifecycle status, and the currently effective configuration. Currently, two types of plug-ins are supported: collaboration and agentloop. If a plug-in is not installed, its status is DISABLED.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries the plug-in status of a specified workspace.</p>
     * 
     * @param request GetWorkspacePluginRequest
     * @return GetWorkspacePluginResponse
     */
    public GetWorkspacePluginResponse getWorkspacePlugin(String workspaceId, String pluginName, GetWorkspacePluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspacePluginWithOptions(workspaceId, pluginName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Validates the input based on the specified template version and creates an MCP in the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an MCP marketplace template.</p>
     * 
     * @param tmpReq InstallMcpMarketItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallMcpMarketItemResponse
     */
    public InstallMcpMarketItemResponse installMcpMarketItemWithOptions(String workspaceId, String marketItemId, InstallMcpMarketItemRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallMcpMarketItemShrinkRequest request = new InstallMcpMarketItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("templateVersion", request.templateVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallMcpMarketItem"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-market/items/" + com.aliyun.openapiutil.Client.getEncodeParam(marketItemId) + "/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallMcpMarketItemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Validates the input based on the specified template version and creates an MCP in the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an MCP marketplace template.</p>
     * 
     * @param request InstallMcpMarketItemRequest
     * @return InstallMcpMarketItemResponse
     */
    public InstallMcpMarketItemResponse installMcpMarketItem(String workspaceId, String marketItemId, InstallMcpMarketItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installMcpMarketItemWithOptions(workspaceId, marketItemId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nInstalls a plugin for a specified AgentCore workspace. Currently, only the <code>collaboration</code> plugin is supported. Plugin configurations are passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify the VPC and public network access policy. The installation procedure executes asynchronously. If you repeatedly invoke this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status based on idempotent semantics if the configurations are identical. If the configurations are different, the operation returns an operation conflict.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Installs a plugin for a specified AgentCore workspace. Currently, only the collaboration plugin is supported. The installation process runs asynchronously.</p>
     * 
     * @param tmpReq InstallWorkspacePluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallWorkspacePluginResponse
     */
    public InstallWorkspacePluginResponse installWorkspacePluginWithOptions(String workspaceId, String pluginName, InstallWorkspacePluginRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallWorkspacePluginShrinkRequest request = new InstallWorkspacePluginShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallWorkspacePlugin"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/plugins/" + com.aliyun.openapiutil.Client.getEncodeParam(pluginName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallWorkspacePluginResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nInstalls a plugin for a specified AgentCore workspace. Currently, only the <code>collaboration</code> plugin is supported. Plugin configurations are passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify the VPC and public network access policy. The installation procedure executes asynchronously. If you repeatedly invoke this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status based on idempotent semantics if the configurations are identical. If the configurations are different, the operation returns an operation conflict.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Installs a plugin for a specified AgentCore workspace. Currently, only the collaboration plugin is supported. The installation process runs asynchronously.</p>
     * 
     * @param request InstallWorkspacePluginRequest
     * @return InstallWorkspacePluginResponse
     */
    public InstallWorkspacePluginResponse installWorkspacePlugin(String workspaceId, String pluginName, InstallWorkspacePluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installWorkspacePluginWithOptions(workspaceId, pluginName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the directories in the current workspace that can be used to create code package agents or switch runtime environments. Runtime environments are dynamically provided based on the current version configuration, and internal image addresses are not returned.
     * If maxResults is omitted or set to 0, the default value is 10. If the value is greater than 100, it is processed as 100. Omit nextToken in the first request. For subsequent requests, use the token returned in the previous response as is, and keep the workspace unchanged. If a directory change invalidates the token, query from the first page again. An empty nextToken indicates that there are no more pages. Existing agents continue to use the saved images for restarts, scaling, and regular updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the runtime environments supported for code deployment.</p>
     * 
     * @param request ListAgentCodeRuntimesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentCodeRuntimesResponse
     */
    public ListAgentCodeRuntimesResponse listAgentCodeRuntimesWithOptions(String workspaceId, ListAgentCodeRuntimesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAgentCodeRuntimes"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-code-runtimes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentCodeRuntimesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the directories in the current workspace that can be used to create code package agents or switch runtime environments. Runtime environments are dynamically provided based on the current version configuration, and internal image addresses are not returned.
     * If maxResults is omitted or set to 0, the default value is 10. If the value is greater than 100, it is processed as 100. Omit nextToken in the first request. For subsequent requests, use the token returned in the previous response as is, and keep the workspace unchanged. If a directory change invalidates the token, query from the first page again. An empty nextToken indicates that there are no more pages. Existing agents continue to use the saved images for restarts, scaling, and regular updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the runtime environments supported for code deployment.</p>
     * 
     * @param request ListAgentCodeRuntimesRequest
     * @return ListAgentCodeRuntimesResponse
     */
    public ListAgentCodeRuntimesResponse listAgentCodeRuntimes(String workspaceId, ListAgentCodeRuntimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentCodeRuntimesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of IM channels for a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of IM channels for a specified agent.</p>
     * 
     * @param request ListAgentIMChannelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentIMChannelsResponse
     */
    public ListAgentIMChannelsResponse listAgentIMChannelsWithOptions(String workspaceId, String agentId, ListAgentIMChannelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("channelType", request.channelType);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentIMChannels"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/im-channels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentIMChannelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of IM channels for a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of IM channels for a specified agent.</p>
     * 
     * @param request ListAgentIMChannelsRequest
     * @return ListAgentIMChannelsResponse
     */
    public ListAgentIMChannelsResponse listAgentIMChannels(String workspaceId, String agentId, ListAgentIMChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentIMChannelsWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries AgentSpec resources in a specified workspace by using paging, and supports name-based search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries AgentSpec resources in a specified workspace by using paging, and supports name-based search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * @param request ListAgentSpecsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSpecsResponse
     */
    public ListAgentSpecsResponse listAgentSpecsWithOptions(String workspaceId, ListAgentSpecsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSpecName)) {
            query.put("agentSpecName", request.agentSpecName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTag)) {
            query.put("bizTag", request.bizTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withCapabilities)) {
            query.put("withCapabilities", request.withCapabilities);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentSpecs"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSpecsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries AgentSpec resources in a specified workspace by using paging, and supports name-based search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries AgentSpec resources in a specified workspace by using paging, and supports name-based search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * @param request ListAgentSpecsRequest
     * @return ListAgentSpecsResponse
     */
    public ListAgentSpecsResponse listAgentSpecs(String workspaceId, ListAgentSpecsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentSpecsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the teams to which specified agents belong. Specify the agent IDs by using agentIds to retrieve the membership information of each agent in the teams, including the team ID, team name, and the role of the agent in the team.</p>
     * 
     * @param tmpReq ListAgentTeamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentTeamsResponse
     */
    public ListAgentTeamsResponse listAgentTeamsWithOptions(String workspaceId, ListAgentTeamsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAgentTeamsShrinkRequest request = new ListAgentTeamsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentTeams"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-team-memberships"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentTeamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the teams to which specified agents belong. Specify the agent IDs by using agentIds to retrieve the membership information of each agent in the teams, including the team ID, team name, and the role of the agent in the team.</p>
     * 
     * @param request ListAgentTeamsRequest
     * @return ListAgentTeamsResponse
     */
    public ListAgentTeamsResponse listAgentTeams(String workspaceId, ListAgentTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentTeamsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of available models for a specified Connector. Pagination is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available official models and enterprise models for an enabled QoderCLI Connector. The service retrieves models in real time by using the saved API key and organization ID, and deduplicates the results by model ID.</p>
     * 
     * @param request ListConnectorModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectorModelsResponse
     */
    public ListConnectorModelsResponse listConnectorModelsWithOptions(String workspaceId, String connectorName, ListConnectorModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorKeyId)) {
            query.put("connectorKeyId", request.connectorKeyId);
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
            new TeaPair("action", "ListConnectorModels"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/connectors/" + com.aliyun.openapiutil.Client.getEncodeParam(connectorName) + "/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectorModelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of available models for a specified Connector. Pagination is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available official models and enterprise models for an enabled QoderCLI Connector. The service retrieves models in real time by using the saved API key and organization ID, and deduplicates the results by model ID.</p>
     * 
     * @param request ListConnectorModelsRequest
     * @return ListConnectorModelsResponse
     */
    public ListConnectorModelsResponse listConnectorModels(String workspaceId, String connectorName, ListConnectorModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConnectorModelsWithOptions(workspaceId, connectorName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of connectors in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of connectors supported by a specified workspace, including their status, number of bound agents, and configurations. The current version returns the QoderCLI connector.</p>
     * 
     * @param request ListConnectorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectorsWithOptions(String workspaceId, ListConnectorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListConnectors"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/connectors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectorsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of connectors in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of connectors supported by a specified workspace, including their status, number of bound agents, and configurations. The current version returns the QoderCLI connector.</p>
     * 
     * @param request ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectors(String workspaceId, ListConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConnectorsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for the credential list in a workspace, and supports filtering by type and name during paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for credentials in a specified workspace. Filters by type using credentialType, performs fuzzy filtering by credential name using nameLike, configures paging by specifying the maximum number of records per page using maxResults, and retrieves the next page using nextToken. If maxResults is not specified, the server returns 10 records by default.</p>
     * 
     * @param request ListCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentialsWithOptions(String workspaceId, ListCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialType)) {
            query.put("credentialType", request.credentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCredentials"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/credentials"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCredentialsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for the credential list in a workspace, and supports filtering by type and name during paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for credentials in a specified workspace. Filters by type using credentialType, performs fuzzy filtering by credential name using nameLike, configures paging by specifying the maximum number of records per page using maxResults, and retrieves the next page using nextToken. If maxResults is not specified, the server returns 10 records by default.</p>
     * 
     * @param request ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentials(String workspaceId, ListCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCredentialsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default value of maxResults is 20 and the maximum value is 100. If this parameter is omitted or set to 0, the default value is used.
     * Omit nextToken in the first request. For subsequent requests, pass the nextToken returned in the previous response as is and keep the same workspace. The nextToken is an opaque token. Do not parse or construct it. An empty token in the response indicates that there are no more pages.
     * This operation returns the summaries of the current page and does not return the complete deployment configurations or the execution errors of the latest version. To obtain this information, call GetCustomAgent by using the agentId in items.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for paging through the custom agent summary in a specified workspace. For the complete configuration and the latest execute results, call GetCustomAgent.</p>
     * 
     * @param request ListCustomAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomAgentsResponse
     */
    public ListCustomAgentsResponse listCustomAgentsWithOptions(String workspaceId, ListCustomAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListCustomAgents"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomAgentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The default value of maxResults is 20 and the maximum value is 100. If this parameter is omitted or set to 0, the default value is used.
     * Omit nextToken in the first request. For subsequent requests, pass the nextToken returned in the previous response as is and keep the same workspace. The nextToken is an opaque token. Do not parse or construct it. An empty token in the response indicates that there are no more pages.
     * This operation returns the summaries of the current page and does not return the complete deployment configurations or the execution errors of the latest version. To obtain this information, call GetCustomAgent by using the agentId in items.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for paging through the custom agent summary in a specified workspace. For the complete configuration and the latest execute results, call GetCustomAgent.</p>
     * 
     * @param request ListCustomAgentsRequest
     * @return ListCustomAgentsResponse
     */
    public ListCustomAgentsResponse listCustomAgents(String workspaceId, ListCustomAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustomAgentsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * @param request ListExternalAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExternalAgentsResponse
     */
    public ListExternalAgentsResponse listExternalAgentsWithOptions(String workspaceId, ListExternalAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListExternalAgents"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExternalAgentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * @param request ListExternalAgentsRequest
     * @return ListExternalAgentsResponse
     */
    public ListExternalAgentsResponse listExternalAgents(String workspaceId, ListExternalAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExternalAgentsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries DingTalk or Lark departments by hierarchy and page. Prerequisites include an existing identity provider binding, a user pool, valid application credentials, and address book read authorization. If parentDepartmentId is not specified, the root hierarchy is queried. When expanding a node, use the ID of the node to query its direct child departments. The hasChildren field is used to determine expandability and does not indicate that child nodes have been returned. The nextToken field is only used to continue querying the next page under the current parent department. The query only reads the directory, does not save the synchronization scope, and does not import users. After a new department is added to a DingTalk or Lark organization, re-query the corresponding parent department because the old list does not represent the latest directory.
     * Authorization information: The RAM operation is agentcore:ListIdentityProviderDepartments, the access level is List, and the resource ARN is acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource requires authorization.
     * Idempotence and retry: This operation is read-only and can be invoked repeatedly.
     * It is free of charge to invoke this API operation, and operation records support ActionTrail auditing.
     * Sample response:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;maxResults&quot;: 50,
     *   &quot;nextToken&quot;: &quot;&quot;,
     *   &quot;items&quot;: [
     *     {
     *       &quot;id&quot;: &quot;10001&quot;,
     *       &quot;name&quot;: &quot;R&amp;D Department&quot;,
     *       &quot;parentId&quot;: &quot;1&quot;,
     *       &quot;memberCount&quot;: 12,
     *       &quot;hasChildren&quot;: true
     *     }
     *   ]
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the departments of an identity provider by page.</p>
     * 
     * @param request ListIdentityProviderDepartmentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProviderDepartmentsResponse
     */
    public ListIdentityProviderDepartmentsResponse listIdentityProviderDepartmentsWithOptions(String workspaceId, String identityProviderType, ListIdentityProviderDepartmentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDepartmentId)) {
            query.put("parentDepartmentId", request.parentDepartmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviderDepartments"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + "/departments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProviderDepartmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries DingTalk or Lark departments by hierarchy and page. Prerequisites include an existing identity provider binding, a user pool, valid application credentials, and address book read authorization. If parentDepartmentId is not specified, the root hierarchy is queried. When expanding a node, use the ID of the node to query its direct child departments. The hasChildren field is used to determine expandability and does not indicate that child nodes have been returned. The nextToken field is only used to continue querying the next page under the current parent department. The query only reads the directory, does not save the synchronization scope, and does not import users. After a new department is added to a DingTalk or Lark organization, re-query the corresponding parent department because the old list does not represent the latest directory.
     * Authorization information: The RAM operation is agentcore:ListIdentityProviderDepartments, the access level is List, and the resource ARN is acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource requires authorization.
     * Idempotence and retry: This operation is read-only and can be invoked repeatedly.
     * It is free of charge to invoke this API operation, and operation records support ActionTrail auditing.
     * Sample response:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;maxResults&quot;: 50,
     *   &quot;nextToken&quot;: &quot;&quot;,
     *   &quot;items&quot;: [
     *     {
     *       &quot;id&quot;: &quot;10001&quot;,
     *       &quot;name&quot;: &quot;R&amp;D Department&quot;,
     *       &quot;parentId&quot;: &quot;1&quot;,
     *       &quot;memberCount&quot;: 12,
     *       &quot;hasChildren&quot;: true
     *     }
     *   ]
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the departments of an identity provider by page.</p>
     * 
     * @param request ListIdentityProviderDepartmentsRequest
     * @return ListIdentityProviderDepartmentsResponse
     */
    public ListIdentityProviderDepartmentsResponse listIdentityProviderDepartments(String workspaceId, String identityProviderType, ListIdentityProviderDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityProviderDepartmentsWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Retrieves the current credential summary list from AgentIdentity and returns a data array. Each item contains credentialId, status, createTime, and expireTime. If no credentials exist, an empty array is returned. This operation does not support maxResults, nextToken, or pagination. Do not call this operation with fake pagination fields. The list never returns plaintext tokens, nor does it enable the receiving or issuing of new credentials.
     * Receiving is not required to be enabled, but the shared pool must be available. A credential is considered available if its status is Enabled and its expireTime is later than the current time. The maximum limit of two credentials is determined by AgentIdentity. Client-side counting is for reference only. The list may contain unavailable or expired credentials. Do not use this list to claim that available tokens exist.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/scim-provisioning/credentials
     * Call conventions: Call this operation in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity source resources of the workspace. The ws-example, URL, certificate, and token in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business data. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/scim-provisioning/credentials
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: [
     *     {
     *       &quot;credentialId&quot;: &quot;credential-example&quot;,
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;createTime&quot;: &quot;&lt;Upstream creation time&gt;&quot;,
     *       &quot;expireTime&quot;: &quot;&lt;Upstream expiration time&gt;&quot;
     *     }
     *   ]
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to the upstream service that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling process.
     * 400 InvalidParameter: The shared user pool is unavailable. 404 IdentityProviderNotFound: No corresponding binding exists. Upstream query failures cannot be replaced with an empty list, which may mislead users into repeatedly creating credentials.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>Used for configuration recovery and credential management: Existing plaintext tokens cannot be queried and retrieved again. The list provides only credential summaries. To obtain a new token, call CreateIdentityProviderSCIMCredential. To revoke a credential, submit the credentialId from the list to DeleteIdentityProviderSCIMCredential. A maximum of two credentials are allowed in the same pool. This operation returns the complete array and does not support or fabricate pagination parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete summary list of up to two SCIM credentials in the shared user pool, without returning plaintext tokens or supporting pagination.</p>
     * 
     * @param request ListIdentityProviderSCIMCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProviderSCIMCredentialsResponse
     */
    public ListIdentityProviderSCIMCredentialsResponse listIdentityProviderSCIMCredentialsWithOptions(String workspaceId, ListIdentityProviderSCIMCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviderSCIMCredentials"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/scim-provisioning/credentials"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProviderSCIMCredentialsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Retrieves the current credential summary list from AgentIdentity and returns a data array. Each item contains credentialId, status, createTime, and expireTime. If no credentials exist, an empty array is returned. This operation does not support maxResults, nextToken, or pagination. Do not call this operation with fake pagination fields. The list never returns plaintext tokens, nor does it enable the receiving or issuing of new credentials.
     * Receiving is not required to be enabled, but the shared pool must be available. A credential is considered available if its status is Enabled and its expireTime is later than the current time. The maximum limit of two credentials is determined by AgentIdentity. Client-side counting is for reference only. The list may contain unavailable or expired credentials. Do not use this list to claim that available tokens exist.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/scim-provisioning/credentials
     * Call conventions: Call this operation in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity source resources of the workspace. The ws-example, URL, certificate, and token in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business data. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/scim-provisioning/credentials
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: [
     *     {
     *       &quot;credentialId&quot;: &quot;credential-example&quot;,
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;createTime&quot;: &quot;&lt;Upstream creation time&gt;&quot;,
     *       &quot;expireTime&quot;: &quot;&lt;Upstream expiration time&gt;&quot;
     *     }
     *   ]
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to the upstream service that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling process.
     * 400 InvalidParameter: The shared user pool is unavailable. 404 IdentityProviderNotFound: No corresponding binding exists. Upstream query failures cannot be replaced with an empty list, which may mislead users into repeatedly creating credentials.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>Used for configuration recovery and credential management: Existing plaintext tokens cannot be queried and retrieved again. The list provides only credential summaries. To obtain a new token, call CreateIdentityProviderSCIMCredential. To revoke a credential, submit the credentialId from the list to DeleteIdentityProviderSCIMCredential. A maximum of two credentials are allowed in the same pool. This operation returns the complete array and does not support or fabricate pagination parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete summary list of up to two SCIM credentials in the shared user pool, without returning plaintext tokens or supporting pagination.</p>
     * 
     * @param request ListIdentityProviderSCIMCredentialsRequest
     * @return ListIdentityProviderSCIMCredentialsResponse
     */
    public ListIdentityProviderSCIMCredentialsResponse listIdentityProviderSCIMCredentials(String workspaceId, ListIdentityProviderSCIMCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityProviderSCIMCredentialsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Returns the local binding summary without querying the actual SAML and SCIM configurations of AgentIdentity. If no bindings exist, items is an empty array. A workspace currently supports only one external binding. The default value of maxResults is 10, and the valid values are 1 to 100. Currently, nextToken must be omitted or left empty. A non-empty value returns InvalidParameter, and multi-page results cannot be fabricated.
     * The status of CustomSSO indicates the task status of shared resources and logon configurations. You must combine protocol and saml to determine whether SAML is configured. SCIM queries are independently performed by using GetIdentityProviderSCIM. The list does not issue tokens and does not return the vendor appSecret, encryptKey, or verificationToken.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/identity-providers
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request example shows the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/identity-providers?maxResults=10
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;items&quot;: [
     *     {
     *       &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *       &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *       &quot;status&quot;: &quot;READY&quot;,
     *       &quot;loginEnabled&quot;: false,
     *       &quot;syncEnabled&quot;: false
     *     }
     *   ],
     *   &quot;maxResults&quot;: 10,
     *   &quot;totalCount&quot;: 1
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call failure to the upstream may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 400 InvalidParameter: maxResults is out of bounds or nextToken is non-empty, which is currently not supported. When a query fails, an error is displayed instead of being cleared as unconfigured.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>This API is used to discover current bindings. The specific SAML configuration of CustomSSO is queried by using GetIdentityProvider. The SP address is queried by using GetIdentityProviderServiceProvider. The actual SCIM configuration and independent operation results are queried by using GetIdentityProviderSCIM.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of existing identity provider bindings for a workspace, including CustomSSO. Returns local binding information without querying the actual upstream SAML or SCIM configurations.</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProvidersWithOptions(String workspaceId, ListIdentityProvidersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListIdentityProviders"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProvidersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Returns the local binding summary without querying the actual SAML and SCIM configurations of AgentIdentity. If no bindings exist, items is an empty array. A workspace currently supports only one external binding. The default value of maxResults is 10, and the valid values are 1 to 100. Currently, nextToken must be omitted or left empty. A non-empty value returns InvalidParameter, and multi-page results cannot be fabricated.
     * The status of CustomSSO indicates the task status of shared resources and logon configurations. You must combine protocol and saml to determine whether SAML is configured. SCIM queries are independently performed by using GetIdentityProviderSCIM. The list does not issue tokens and does not return the vendor appSecret, encryptKey, or verificationToken.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/identity-providers
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request example shows the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/identity-providers?maxResults=10
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;items&quot;: [
     *     {
     *       &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *       &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *       &quot;status&quot;: &quot;READY&quot;,
     *       &quot;loginEnabled&quot;: false,
     *       &quot;syncEnabled&quot;: false
     *     }
     *   ],
     *   &quot;maxResults&quot;: 10,
     *   &quot;totalCount&quot;: 1
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call failure to the upstream may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 400 InvalidParameter: maxResults is out of bounds or nextToken is non-empty, which is currently not supported. When a query fails, an error is displayed instead of being cleared as unconfigured.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>This API is used to discover current bindings. The specific SAML configuration of CustomSSO is queried by using GetIdentityProvider. The SP address is queried by using GetIdentityProviderServiceProvider. The actual SCIM configuration and independent operation results are queried by using GetIdentityProviderSCIM.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of existing identity provider bindings for a workspace, including CustomSSO. Returns local binding information without querying the actual upstream SAML or SCIM configurations.</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProviders(String workspaceId, ListIdentityProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityProvidersWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the logical image caches within the current account, region, and workspace. WorkspaceId is required, and caches are not visible across workspaces. All conditions filter the full set using the AND operator before pagination is calculated. Results are sorted in descending order of logical resource creation time and ascending order of ImageId. The cursor is bound to the account, region, workspace, all filters, and the sort order. Returns the complete cache objects, the AgentCount based on the configuration switch, and the actual deletion eligibility. Query failures do not return a disguised empty list, and the nextToken on the last page is an empty string.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries image caches.</p>
     * 
     * @param request ListImageCachesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageCachesResponse
     */
    public ListImageCachesResponse listImageCachesWithOptions(ListImageCachesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrInstanceId)) {
            query.put("acrInstanceId", request.acrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRefContains)) {
            query.put("imageRefContains", request.imageRefContains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registry)) {
            query.put("registry", request.registry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repository)) {
            query.put("repository", request.repository);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageCaches"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/image-caches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageCachesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the logical image caches within the current account, region, and workspace. WorkspaceId is required, and caches are not visible across workspaces. All conditions filter the full set using the AND operator before pagination is calculated. Results are sorted in descending order of logical resource creation time and ascending order of ImageId. The cursor is bound to the account, region, workspace, all filters, and the sort order. Returns the complete cache objects, the AgentCount based on the configuration switch, and the actual deletion eligibility. Query failures do not return a disguised empty list, and the nextToken on the last page is an empty string.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries image caches.</p>
     * 
     * @param request ListImageCachesRequest
     * @return ListImageCachesResponse
     */
    public ListImageCachesResponse listImageCaches(ListImageCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImageCachesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of managed agents in a specified workspace by using paging. Returns summary information for each agent, including the identity, name, status, template, and specifications.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of managed agents in a specified workspace.</p>
     * 
     * @param request ListManagedAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManagedAgentsResponse
     */
    public ListManagedAgentsResponse listManagedAgentsWithOptions(String workspaceId, ListManagedAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListManagedAgents"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManagedAgentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of managed agents in a specified workspace by using paging. Returns summary information for each agent, including the identity, name, status, template, and specifications.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of managed agents in a specified workspace.</p>
     * 
     * @param request ListManagedAgentsRequest
     * @return ListManagedAgentsResponse
     */
    public ListManagedAgentsResponse listManagedAgents(String workspaceId, ListManagedAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listManagedAgentsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries all online official MCP templates. You can filter results by keyword, usage tag, and MCP type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries MCP marketplace templates.</p>
     * 
     * @param request ListMcpMarketItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpMarketItemsResponse
     */
    public ListMcpMarketItemsResponse listMcpMarketItemsWithOptions(String workspaceId, ListMcpMarketItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpType)) {
            query.put("mcpType", request.mcpType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officialTag)) {
            query.put("officialTag", request.officialTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcpMarketItems"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-market/items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpMarketItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries all online official MCP templates. You can filter results by keyword, usage tag, and MCP type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries MCP marketplace templates.</p>
     * 
     * @param request ListMcpMarketItemsRequest
     * @return ListMcpMarketItemsResponse
     */
    public ListMcpMarketItemsResponse listMcpMarketItems(String workspaceId, ListMcpMarketItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMcpMarketItemsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the list of tools exposed by a specified MCP service and their input/output schemas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of tools exposed by a specified MCP service and their input/output schemas.</p>
     * 
     * @param request ListMcpToolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpToolsResponse
     */
    public ListMcpToolsResponse listMcpToolsWithOptions(String workspaceId, String mcpServerId, ListMcpToolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListMcpTools"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + "/tools"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpToolsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the list of tools exposed by a specified MCP service and their input/output schemas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of tools exposed by a specified MCP service and their input/output schemas.</p>
     * 
     * @param request ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    public ListMcpToolsResponse listMcpTools(String workspaceId, String mcpServerId, ListMcpToolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMcpToolsWithOptions(workspaceId, mcpServerId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by using paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by using paging.</p>
     * 
     * @param request ListMcpsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpsResponse
     */
    public ListMcpsResponse listMcpsWithOptions(String workspaceId, ListMcpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customTag)) {
            query.put("customTag", request.customTag);
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

        if (!com.aliyun.teautil.Common.isUnset(request.officialTag)) {
            query.put("officialTag", request.officialTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("searchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageActive)) {
            query.put("usageActive", request.usageActive);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcps"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by using paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by using paging.</p>
     * 
     * @param request ListMcpsRequest
     * @return ListMcpsResponse
     */
    public ListMcpsResponse listMcps(String workspaceId, ListMcpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMcpsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on long-term memory records. The results can be filtered independently by user ID, agent ID, and session ID. Paging is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on long-term memory records. The results can be filtered independently by user ID, agent ID, and session ID. Paging is supported.</p>
     * 
     * @param request ListMemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoriesResponse
     */
    public ListMemoriesResponse listMemoriesWithOptions(String workspaceId, String memoryStoreName, ListMemoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemories"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on long-term memory records. The results can be filtered independently by user ID, agent ID, and session ID. Paging is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on long-term memory records. The results can be filtered independently by user ID, agent ID, and session ID. Paging is supported.</p>
     * 
     * @param request ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    public ListMemoriesResponse listMemories(String workspaceId, String memoryStoreName, ListMemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoriesWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for raw messages by exact scope. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for raw messages by exact scope. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
     * 
     * @param request ListMemorySessionMessagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemorySessionMessagesResponse
     */
    public ListMemorySessionMessagesResponse listMemorySessionMessagesWithOptions(String workspaceId, String memoryStoreName, ListMemorySessionMessagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemorySessionMessages"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemorySessionMessagesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for raw messages by exact scope. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for raw messages by exact scope. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
     * 
     * @param request ListMemorySessionMessagesRequest
     * @return ListMemorySessionMessagesResponse
     */
    public ListMemorySessionMessagesResponse listMemorySessionMessages(String workspaceId, String memoryStoreName, ListMemorySessionMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemorySessionMessagesWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for sessions in a MemoryStore. You can filter the sessions independently by user ID and agent ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for sessions in a MemoryStore. You can filter the sessions independently by user ID and agent ID.</p>
     * 
     * @param request ListMemorySessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemorySessionsResponse
     */
    public ListMemorySessionsResponse listMemorySessionsWithOptions(String workspaceId, String memoryStoreName, ListMemorySessionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemorySessions"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/sessions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemorySessionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for sessions in a MemoryStore. You can filter the sessions independently by user ID and agent ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for sessions in a MemoryStore. You can filter the sessions independently by user ID and agent ID.</p>
     * 
     * @param request ListMemorySessionsRequest
     * @return ListMemorySessionsResponse
     */
    public ListMemorySessionsResponse listMemorySessions(String workspaceId, String memoryStoreName, ListMemorySessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemorySessionsWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for MemoryStores in a specified workspace with paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for MemoryStores in a specified workspace with paging.</p>
     * 
     * @param request ListMemoryStoresRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoryStoresResponse
     */
    public ListMemoryStoresResponse listMemoryStoresWithOptions(String workspaceId, ListMemoryStoresRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListMemoryStores"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoryStoresResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for MemoryStores in a specified workspace with paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for MemoryStores in a specified workspace with paging.</p>
     * 
     * @param request ListMemoryStoresRequest
     * @return ListMemoryStoresResponse
     */
    public ListMemoryStoresResponse listMemoryStores(String workspaceId, ListMemoryStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoryStoresWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries model connections in a specified AgentCore workspace. Supports filtering by name through <code>Name</code> and selecting exact match or fuzzy match through <code>SearchType</code>. Also supports filtering by model provider type and invoke protocol, and supports paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries model connections in a specified workspace with paging. Supports filtering by name, provider type, and invoke protocol.</p>
     * 
     * @param request ListModelConnectionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelConnectionsResponse
     */
    public ListModelConnectionsResponse listModelConnectionsWithOptions(String workspaceId, ListModelConnectionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeModels)) {
            query.put("includeModels", request.includeModels);
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

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerType)) {
            query.put("providerType", request.providerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("searchType", request.searchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelConnections"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/model-connections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelConnectionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries model connections in a specified AgentCore workspace. Supports filtering by name through <code>Name</code> and selecting exact match or fuzzy match through <code>SearchType</code>. Also supports filtering by model provider type and invoke protocol, and supports paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries model connections in a specified workspace with paging. Supports filtering by name, provider type, and invoke protocol.</p>
     * 
     * @param request ListModelConnectionsRequest
     * @return ListModelConnectionsResponse
     */
    public ListModelConnectionsResponse listModelConnections(String workspaceId, ListModelConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelConnectionsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries models in a specified workspace by using paging. Supports filtering by model connection and model name.</p>
     * 
     * @param request ListModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelsResponse
     */
    public ListModelsResponse listModelsWithOptions(String workspaceId, ListModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("connectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("modelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModels"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries models in a specified workspace by using paging. Supports filtering by model connection and model name.</p>
     * 
     * @param request ListModelsRequest
     * @return ListModelsResponse
     */
    public ListModelsResponse listModels(String workspaceId, ListModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the providers supported by the built-in model catalog of AgentCore and their default service configurations.</p>
     * 
     * @param request ListPredefinedModelProvidersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPredefinedModelProvidersResponse
     */
    public ListPredefinedModelProvidersResponse listPredefinedModelProvidersWithOptions(ListPredefinedModelProvidersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPredefinedModelProviders"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/model-catalog/providers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPredefinedModelProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the providers supported by the built-in model catalog of AgentCore and their default service configurations.</p>
     * 
     * @param request ListPredefinedModelProvidersRequest
     * @return ListPredefinedModelProvidersResponse
     */
    public ListPredefinedModelProvidersResponse listPredefinedModelProviders(ListPredefinedModelProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPredefinedModelProvidersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the models and their capabilities in the built-in model catalog of AgentCore for a specified provider.</p>
     * 
     * @param request ListPredefinedModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPredefinedModelsResponse
     */
    public ListPredefinedModelsResponse listPredefinedModelsWithOptions(String providerType, ListPredefinedModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPredefinedModels"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/model-catalog/providers/" + com.aliyun.openapiutil.Client.getEncodeParam(providerType) + "/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPredefinedModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the models and their capabilities in the built-in model catalog of AgentCore for a specified provider.</p>
     * 
     * @param request ListPredefinedModelsRequest
     * @return ListPredefinedModelsResponse
     */
    public ListPredefinedModelsResponse listPredefinedModels(String providerType, ListPredefinedModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPredefinedModelsWithOptions(providerType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of active sessions in the sandbox of a specified managed agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of active sessions in the sandbox of a specified managed agent by paging, and returns the session source and external channel type.</p>
     * 
     * @param request ListSandboxSessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSandboxSessionsResponse
     */
    public ListSandboxSessionsResponse listSandboxSessionsWithOptions(String workspaceId, String agentId, String sandboxId, ListSandboxSessionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListSandboxSessions"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + "/sessions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSandboxSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of active sessions in the sandbox of a specified managed agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of active sessions in the sandbox of a specified managed agent by paging, and returns the session source and external channel type.</p>
     * 
     * @param request ListSandboxSessionsRequest
     * @return ListSandboxSessionsResponse
     */
    public ListSandboxSessionsResponse listSandboxSessions(String workspaceId, String agentId, String sandboxId, ListSandboxSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSandboxSessionsWithOptions(workspaceId, agentId, sandboxId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of sandboxes for a specified managed agent. The searchText parameter performs a fuzzy match on sandbox ID fragments, and the sessionId parameter performs a fuzzy match on active session ID fragments. Both parameters are case-insensitive and can be used together with AND logic.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of sandboxes for a managed agent in a specified workspace. You can filter results by sandbox ID and active session ID fragments.</p>
     * 
     * @param request ListSandboxesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSandboxesResponse
     */
    public ListSandboxesResponse listSandboxesWithOptions(String workspaceId, String agentId, ListSandboxesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            query.put("searchText", request.searchText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSandboxes"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/sandboxes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSandboxesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of sandboxes for a specified managed agent. The searchText parameter performs a fuzzy match on sandbox ID fragments, and the sessionId parameter performs a fuzzy match on active session ID fragments. Both parameters are case-insensitive and can be used together with AND logic.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of sandboxes for a managed agent in a specified workspace. You can filter results by sandbox ID and active session ID fragments.</p>
     * 
     * @param request ListSandboxesRequest
     * @return ListSandboxesResponse
     */
    public ListSandboxesResponse listSandboxes(String workspaceId, String agentId, ListSandboxesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSandboxesWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries service endpoints in a specified workspace with paging. You can filter the results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries service endpoints in a specified workspace with paging and supports filtering by target type, agent, collaboration component, and status.</p>
     * 
     * @param request ListServiceEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceEndpointsResponse
     */
    public ListServiceEndpointsResponse listServiceEndpointsWithOptions(String workspaceId, ListServiceEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("agentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collaborationComponent)) {
            query.put("collaborationComponent", request.collaborationComponent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceBindingId)) {
            query.put("resourceBindingId", request.resourceBindingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("targetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceEndpoints"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/service-endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceEndpointsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries service endpoints in a specified workspace with paging. You can filter the results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries service endpoints in a specified workspace with paging and supports filtering by target type, agent, collaboration component, and status.</p>
     * 
     * @param request ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    public ListServiceEndpointsResponse listServiceEndpoints(String workspaceId, ListServiceEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceEndpointsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries skill reference relationships.</p>
     * 
     * @param request ListSkillReferencesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillReferencesResponse
     */
    public ListSkillReferencesResponse listSkillReferencesWithOptions(String workspaceId, String skillName, ListSkillReferencesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectorType)) {
            query.put("selectorType", request.selectorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectorValue)) {
            query.put("selectorValue", request.selectorValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillReferences"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/references"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillReferencesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries skill reference relationships.</p>
     * 
     * @param request ListSkillReferencesRequest
     * @return ListSkillReferencesResponse
     */
    public ListSkillReferencesResponse listSkillReferences(String workspaceId, String skillName, ListSkillReferencesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSkillReferencesWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query of Skills in a specified workspace and returns basic Skill information, version status, and paging information.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of Skills in a specified workspace and returns basic Skill information, version status, and paging information.</p>
     * 
     * @param request ListSkillsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkillsWithOptions(String workspaceId, ListSkillsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("skillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkills"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query of Skills in a specified workspace and returns basic Skill information, version status, and paging information.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of Skills in a specified workspace and returns basic Skill information, version status, and paging information.</p>
     * 
     * @param request ListSkillsRequest
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkills(String workspaceId, ListSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSkillsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries teams in a specified workspace by using paging. You can use nameLike to filter teams by fuzzy matching the team name, maxResults to specify the maximum number of records per page, and nextToken to retrieve the next page. If maxResults is not specified, the server returns 10 records by default. The member information in the list includes only the member identifier, name, and team role.</p>
     * 
     * @param request ListTeamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeamsWithOptions(String workspaceId, ListTeamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeams"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/teams"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries teams in a specified workspace by using paging. You can use nameLike to filter teams by fuzzy matching the team name, maxResults to specify the maximum number of records per page, and nextToken to retrieve the next page. If maxResults is not specified, the server returns 10 records by default. The member information in the list includes only the member identifier, name, and team role.</p>
     * 
     * @param request ListTeamsRequest
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeams(String workspaceId, ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTeamsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paged query for users in a specified workspace. You can use nameLike to filter users by fuzzy match on the username, maxResults to specify the maximum number of records per page for paging, and nextToken to retrieve the next page. If maxResults is not specified, 10 records are returned by default.</p>
     * 
     * @param request ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(String workspaceId, ListUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paged query for users in a specified workspace. You can use nameLike to filter users by fuzzy match on the username, maxResults to specify the maximum number of records per page for paging, and nextToken to retrieve the next page. If maxResults is not specified, 10 records are returned by default.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(String workspaceId, ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nPerforms a paged query on the workspaces under the current tenant. By default, the list does not return soft-deleted records with the Deleted status. The server performs stable sorting on the results by creation order to facilitate paging. You can use nextToken to obtain the next page, skip to skip a specified number of workspaces, maxResults to specify the maximum number of records per page, and nameLike to perform fuzzy filtering by workspace name. If maxResults is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on the workspaces under the current tenant. By default, the list does not return soft-deleted records with the Deleted status. The server performs stable sorting on the results by creation order to facilitate paging.</p>
     * 
     * @param request ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("skip", request.skip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nPerforms a paged query on the workspaces under the current tenant. By default, the list does not return soft-deleted records with the Deleted status. The server performs stable sorting on the results by creation order to facilitate paging. You can use nextToken to obtain the next page, skip to skip a specified number of workspaces, maxResults to specify the maximum number of records per page, and nameLike to perform fuzzy filtering by workspace name. If maxResults is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on the workspaces under the current tenant. By default, the list does not return soft-deleted records with the Deleted status. The server performs stable sorting on the results by creation order to facilitate paging.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Takes the online version of a specified Skill offline so that it is no longer used as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Takes the online version of a specified Skill offline so that it is no longer used as the online version.</p>
     * 
     * @param tmpReq OfflineSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineSkillResponse
     */
    public OfflineSkillResponse offlineSkillWithOptions(String workspaceId, String skillName, OfflineSkillRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OfflineSkillShrinkRequest request = new OfflineSkillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineSkill"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/actions/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineSkillResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Takes the online version of a specified Skill offline so that it is no longer used as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Takes the online version of a specified Skill offline so that it is no longer used as the online version.</p>
     * 
     * @param request OfflineSkillRequest
     * @return OfflineSkillResponse
     */
    public OfflineSkillResponse offlineSkill(String workspaceId, String skillName, OfflineSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineSkillWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Sets a specified Skill version as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets a specified Skill version as the online version.</p>
     * 
     * @param tmpReq OnlineSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineSkillResponse
     */
    public OnlineSkillResponse onlineSkillWithOptions(String workspaceId, String skillName, OnlineSkillRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OnlineSkillShrinkRequest request = new OnlineSkillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineSkill"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/actions/online"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineSkillResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Sets a specified Skill version as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets a specified Skill version as the online version.</p>
     * 
     * @param request OnlineSkillRequest
     * @return OnlineSkillResponse
     */
    public OnlineSkillResponse onlineSkill(String workspaceId, String skillName, OnlineSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineSkillWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * @param tmpReq PrecheckSkillUploadViaOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrecheckSkillUploadViaOssResponse
     */
    public PrecheckSkillUploadViaOssResponse precheckSkillUploadViaOssWithOptions(String workspaceId, PrecheckSkillUploadViaOssRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PrecheckSkillUploadViaOssShrinkRequest request = new PrecheckSkillUploadViaOssShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrecheckSkillUploadViaOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skill-actions/precheck-upload-via-oss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrecheckSkillUploadViaOssResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * @param request PrecheckSkillUploadViaOssRequest
     * @return PrecheckSkillUploadViaOssResponse
     */
    public PrecheckSkillUploadViaOssResponse precheckSkillUploadViaOss(String workspaceId, PrecheckSkillUploadViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.precheckSkillUploadViaOssWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>A CustomSSO shared user pool must be available. This operation does not depend on SAML metadata and is not blocked by SAML updating or update failure states. It synchronously calls AgentIdentity to enable SCIM receiving, and reads the configuration and credential list. If a credential in the Enabled state that has not expired already exists, its summary is returned and the token is set to null. If no available credentials exist, a new credential is created and the token is returned only in the current response. Existing invalid or expired credentials are not automatically deleted and may still trigger the upstream limit of up to two credentials.
     * The prepare operation has the side effects of enabling receiving and potentially issuing credentials, but it does not set the AC syncEnabled parameter, initiate the first import, or indicate that the external provisioning connection test has passed. After configuring the baseUrl and the current token in the external provisioning system, call UpdateIdentityProviderSCIM to confirm and enable synchronization. Existing tokens cannot be retrieved again. If the response is lost, query the credential list first. Tokens are not automatically reissued. Tokens must not be logged or persisted in frontend caches.</p>
     * <h2>Requests and examples</h2>
     * <p>POST /workspaces/{workspaceId}/scim-provisioning/prepare
     * Calling conventions: Call this operation in the region of the target workspace by using an AccessKey ID/STS identity that has permissions on the identity source resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not log secrets. Asynchronous business tasks do not mean that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/scim-provisioning/prepare
     * No business request body.
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;configuration&quot;: {
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;baseUrl&quot;: &quot;https://example.com/scim/v2&quot;
     *     },
     *     &quot;credential&quot;: {
     *       &quot;credentialId&quot;: &quot;credential-example&quot;,
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;expireTime&quot;: &quot;&lt;Expiration time returned by the upstream service&gt;&quot;
     *     },
     *     &quot;token&quot;: &quot;&lt;Token issued only in the current response; null if an available credential already exists&gt;&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to the upstream service that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace not found errors follow the common error handling process.
     * 400 LimitExceeded.ScimCredential: The maximum limit of two credentials has been reached. You must explicitly delete one credential and try again. Credentials are not automatically deleted, rotated, or expanded. 400 InvalidParameter: The shared pool is unavailable. This call may have enabled upstream receiving and then reported an error due to issuance failure. The error does not mean that the operation has been automatically rolled back.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>The shared pool is created by using CreateIdentityProvider with identityProviderType set to CustomSSO. SAML configuration is not required. If an existing credential is reused and token is null, use the token that the user has already saved. Do not configure a null value in the external system. If the token is lost, call ListIdentityProviderSCIMCredentials to check first, and then explicitly call CreateIdentityProviderSCIMCredential to issue a new token. When the limit of two credentials is reached, the user must confirm and delete the unused credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Prepares the SCIM receiving configuration, and returns the provisioning URL and credential summary. Issues a token if no available credentials exist and returns the plaintext only in the current response. Does not automatically enable user synchronization.</p>
     * 
     * @param request PrepareIdentityProviderSCIMRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrepareIdentityProviderSCIMResponse
     */
    public PrepareIdentityProviderSCIMResponse prepareIdentityProviderSCIMWithOptions(String workspaceId, PrepareIdentityProviderSCIMRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrepareIdentityProviderSCIM"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/scim-provisioning/prepare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrepareIdentityProviderSCIMResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>A CustomSSO shared user pool must be available. This operation does not depend on SAML metadata and is not blocked by SAML updating or update failure states. It synchronously calls AgentIdentity to enable SCIM receiving, and reads the configuration and credential list. If a credential in the Enabled state that has not expired already exists, its summary is returned and the token is set to null. If no available credentials exist, a new credential is created and the token is returned only in the current response. Existing invalid or expired credentials are not automatically deleted and may still trigger the upstream limit of up to two credentials.
     * The prepare operation has the side effects of enabling receiving and potentially issuing credentials, but it does not set the AC syncEnabled parameter, initiate the first import, or indicate that the external provisioning connection test has passed. After configuring the baseUrl and the current token in the external provisioning system, call UpdateIdentityProviderSCIM to confirm and enable synchronization. Existing tokens cannot be retrieved again. If the response is lost, query the credential list first. Tokens are not automatically reissued. Tokens must not be logged or persisted in frontend caches.</p>
     * <h2>Requests and examples</h2>
     * <p>POST /workspaces/{workspaceId}/scim-provisioning/prepare
     * Calling conventions: Call this operation in the region of the target workspace by using an AccessKey ID/STS identity that has permissions on the identity source resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API operation, not the extra body wrapper of the backend direct connection API operation. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not log secrets. Asynchronous business tasks do not mean that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/scim-provisioning/prepare
     * No business request body.
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;configuration&quot;: {
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;baseUrl&quot;: &quot;https://example.com/scim/v2&quot;
     *     },
     *     &quot;credential&quot;: {
     *       &quot;credentialId&quot;: &quot;credential-example&quot;,
     *       &quot;status&quot;: &quot;Enabled&quot;,
     *       &quot;expireTime&quot;: &quot;&lt;Expiration time returned by the upstream service&gt;&quot;
     *     },
     *     &quot;token&quot;: &quot;&lt;Token issued only in the current response; null if an available credential already exists&gt;&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to the upstream service that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace not found errors follow the common error handling process.
     * 400 LimitExceeded.ScimCredential: The maximum limit of two credentials has been reached. You must explicitly delete one credential and try again. Credentials are not automatically deleted, rotated, or expanded. 400 InvalidParameter: The shared pool is unavailable. This call may have enabled upstream receiving and then reported an error due to issuance failure. The error does not mean that the operation has been automatically rolled back.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>The shared pool is created by using CreateIdentityProvider with identityProviderType set to CustomSSO. SAML configuration is not required. If an existing credential is reused and token is null, use the token that the user has already saved. Do not configure a null value in the external system. If the token is lost, call ListIdentityProviderSCIMCredentials to check first, and then explicitly call CreateIdentityProviderSCIMCredential to issue a new token. When the limit of two credentials is reached, the user must confirm and delete the unused credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Prepares the SCIM receiving configuration, and returns the provisioning URL and credential summary. Issues a token if no available credentials exist and returns the plaintext only in the current response. Does not automatically enable user synchronization.</p>
     * 
     * @param request PrepareIdentityProviderSCIMRequest
     * @return PrepareIdentityProviderSCIMResponse
     */
    public PrepareIdentityProviderSCIMResponse prepareIdentityProviderSCIM(String workspaceId, PrepareIdentityProviderSCIMRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.prepareIdentityProviderSCIMWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Publishes a specified Skill version to transition it to the published state.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified Skill version to transition it to the published state.</p>
     * 
     * @param tmpReq PublishSkillVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishSkillVersionResponse
     */
    public PublishSkillVersionResponse publishSkillVersionWithOptions(String workspaceId, String skillName, String skillVersion, PublishSkillVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishSkillVersionShrinkRequest request = new PublishSkillVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishSkillVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(skillVersion) + "/actions/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishSkillVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Publishes a specified Skill version to transition it to the published state.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified Skill version to transition it to the published state.</p>
     * 
     * @param request PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    public PublishSkillVersionResponse publishSkillVersion(String workspaceId, String skillName, String skillVersion, PublishSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishSkillVersionWithOptions(workspaceId, skillName, skillVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Converts a specified Skill version back to an editable draft so that you can continue to modify it.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a specified Skill version back to an editable draft so that you can continue to modify it.</p>
     * 
     * @param tmpReq RedraftSkillVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RedraftSkillVersionResponse
     */
    public RedraftSkillVersionResponse redraftSkillVersionWithOptions(String workspaceId, String skillName, String skillVersion, RedraftSkillVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RedraftSkillVersionShrinkRequest request = new RedraftSkillVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RedraftSkillVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(skillVersion) + "/actions/redraft"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RedraftSkillVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Converts a specified Skill version back to an editable draft so that you can continue to modify it.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a specified Skill version back to an editable draft so that you can continue to modify it.</p>
     * 
     * @param request RedraftSkillVersionRequest
     * @return RedraftSkillVersionResponse
     */
    public RedraftSkillVersionResponse redraftSkillVersion(String workspaceId, String skillName, String skillVersion, RedraftSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.redraftSkillVersionWithOptions(workspaceId, skillName, skillVersion, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the logon password of a specified user. You can specify the user by using agentCoreUserId or username, and you must specify at least one of them. This operation only supports resetting passwords for users who use local password authentication in the workspace. If you do not specify the password parameter, the server generates a random password and returns it in the response.</p>
     * 
     * @param tmpReq ResetUserPasswordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPasswordWithOptions(String workspaceId, ResetUserPasswordRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResetUserPasswordShrinkRequest request = new ResetUserPasswordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUserPassword"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/users/actions/reset-password"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the logon password of a specified user. You can specify the user by using agentCoreUserId or username, and you must specify at least one of them. This operation only supports resetting passwords for users who use local password authentication in the workspace. If you do not specify the password parameter, the server generates a random password and returns it in the response.</p>
     * 
     * @param request ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(String workspaceId, ResetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetUserPasswordWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retries the image cache for the original ImageId in the current workspace. WorkspaceId is required. The business request body is not required and can be omitted or provided as an empty object. The source authorization and transfer network reuse the trusted context of the original registration. If a digest exists, the retry uses the original digest. If no digest exists, the original tag is resolved again. A new request for a FAILED status can start a new production round. PENDING and READY statuses are reused. DELETING status is rejected, and deleted resources are not recreated. PUBLIC and PRIVATE statuses reuse the pull authorization of the original workspace. Returns a complete acceptance snapshot and retains the original ImageId and CreatedAt. ClientToken does not guarantee request deduplication. If the result is not confirmed, query the real-time status first before deciding whether to resubmit.</p>
     * 
     * <b>summary</b> : 
     * <p>Retries the image cache.</p>
     * 
     * @param tmpReq RetryImageCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryImageCacheResponse
     */
    public RetryImageCacheResponse retryImageCacheWithOptions(String imageId, RetryImageCacheRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryImageCacheShrinkRequest request = new RetryImageCacheShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryImageCache"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/image-caches/" + com.aliyun.openapiutil.Client.getEncodeParam(imageId) + "/retry"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryImageCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retries the image cache for the original ImageId in the current workspace. WorkspaceId is required. The business request body is not required and can be omitted or provided as an empty object. The source authorization and transfer network reuse the trusted context of the original registration. If a digest exists, the retry uses the original digest. If no digest exists, the original tag is resolved again. A new request for a FAILED status can start a new production round. PENDING and READY statuses are reused. DELETING status is rejected, and deleted resources are not recreated. PUBLIC and PRIVATE statuses reuse the pull authorization of the original workspace. Returns a complete acceptance snapshot and retains the original ImageId and CreatedAt. ClientToken does not guarantee request deduplication. If the result is not confirmed, query the real-time status first before deciding whether to resubmit.</p>
     * 
     * <b>summary</b> : 
     * <p>Retries the image cache.</p>
     * 
     * @param request RetryImageCacheRequest
     * @return RetryImageCacheResponse
     */
    public RetryImageCacheResponse retryImageCache(String imageId, RetryImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryImageCacheWithOptions(imageId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves long-term memory from a MemoryStore based on semantics.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves long-term memory from a MemoryStore based on semantics.</p>
     * 
     * @param tmpReq SearchMemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMemoriesResponse
     */
    public SearchMemoriesResponse searchMemoriesWithOptions(String workspaceId, String memoryStoreName, SearchMemoriesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchMemoriesShrinkRequest request = new SearchMemoriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMemories"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memories/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMemoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves long-term memory from a MemoryStore based on semantics.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves long-term memory from a MemoryStore based on semantics.</p>
     * 
     * @param request SearchMemoriesRequest
     * @return SearchMemoriesResponse
     */
    public SearchMemoriesResponse searchMemories(String workspaceId, String memoryStoreName, SearchMemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMemoriesWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Submits a specified draft version of an AgentSpec for review. If no release pipeline is configured, the version is directly published online.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified draft version of an AgentSpec for review. If no release pipeline is configured, the version is directly published online.</p>
     * 
     * @param tmpReq SubmitAgentSpecVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAgentSpecVersionResponse
     */
    public SubmitAgentSpecVersionResponse submitAgentSpecVersionWithOptions(String workspaceId, String agentSpecName, String agentSpecVersion, SubmitAgentSpecVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitAgentSpecVersionShrinkRequest request = new SubmitAgentSpecVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAgentSpecVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecVersion) + "/actions/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAgentSpecVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Submits a specified draft version of an AgentSpec for review. If no release pipeline is configured, the version is directly published online.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified draft version of an AgentSpec for review. If no release pipeline is configured, the version is directly published online.</p>
     * 
     * @param request SubmitAgentSpecVersionRequest
     * @return SubmitAgentSpecVersionResponse
     */
    public SubmitAgentSpecVersionResponse submitAgentSpecVersion(String workspaceId, String agentSpecName, String agentSpecVersion, SubmitAgentSpecVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAgentSpecVersionWithOptions(workspaceId, agentSpecName, agentSpecVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * @param tmpReq SubmitSkillVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSkillVersionResponse
     */
    public SubmitSkillVersionResponse submitSkillVersionWithOptions(String workspaceId, String skillName, String skillVersion, SubmitSkillVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSkillVersionShrinkRequest request = new SubmitSkillVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSkillVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(skillVersion) + "/actions/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSkillVersionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * @param request SubmitSkillVersionRequest
     * @return SubmitSkillVersionResponse
     */
    public SubmitSkillVersionResponse submitSkillVersion(String workspaceId, String skillName, String skillVersion, SubmitSkillVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitSkillVersionWithOptions(workspaceId, skillName, skillVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel. At least one updatable field must be provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel. At least one updatable field must be provided.</p>
     * 
     * @param tmpReq UpdateAgentIMChannelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentIMChannelResponse
     */
    public UpdateAgentIMChannelResponse updateAgentIMChannelWithOptions(String workspaceId, String agentId, String imChannelId, UpdateAgentIMChannelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAgentIMChannelShrinkRequest request = new UpdateAgentIMChannelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentIMChannel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/im-channels/" + com.aliyun.openapiutil.Client.getEncodeParam(imChannelId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentIMChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel. At least one updatable field must be provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel. At least one updatable field must be provided.</p>
     * 
     * @param request UpdateAgentIMChannelRequest
     * @return UpdateAgentIMChannelResponse
     */
    public UpdateAgentIMChannelResponse updateAgentIMChannel(String workspaceId, String agentId, String imChannelId, UpdateAgentIMChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentIMChannelWithOptions(workspaceId, agentId, imChannelId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Fully updates the channel credentials of a specified IM channel. Secrets are not returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Fully updates the channel credentials of a specified IM channel. Secrets are not returned in the response.</p>
     * 
     * @param tmpReq UpdateAgentIMChannelCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentIMChannelCredentialResponse
     */
    public UpdateAgentIMChannelCredentialResponse updateAgentIMChannelCredentialWithOptions(String workspaceId, String agentId, String imChannelId, UpdateAgentIMChannelCredentialRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAgentIMChannelCredentialShrinkRequest request = new UpdateAgentIMChannelCredentialShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentIMChannelCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/im-channels/" + com.aliyun.openapiutil.Client.getEncodeParam(imChannelId) + "/actions/update-credential"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentIMChannelCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Fully updates the channel credentials of a specified IM channel. Secrets are not returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Fully updates the channel credentials of a specified IM channel. Secrets are not returned in the response.</p>
     * 
     * @param request UpdateAgentIMChannelCredentialRequest
     * @return UpdateAgentIMChannelCredentialResponse
     */
    public UpdateAgentIMChannelCredentialResponse updateAgentIMChannelCredential(String workspaceId, String agentId, String imChannelId, UpdateAgentIMChannelCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentIMChannelCredentialWithOptions(workspaceId, agentId, imChannelId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the business tags, version labels, and visibility scope of a specified AgentSpec. Fields that are not provided remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags, version labels, and visibility scope of a specified AgentSpec. Fields that are not provided remain unchanged.</p>
     * 
     * @param tmpReq UpdateAgentSpecRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentSpecResponse
     */
    public UpdateAgentSpecResponse updateAgentSpecWithOptions(String workspaceId, String agentSpecName, UpdateAgentSpecRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAgentSpecShrinkRequest request = new UpdateAgentSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentSpec"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-specs/" + com.aliyun.openapiutil.Client.getEncodeParam(agentSpecName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentSpecResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the business tags, version labels, and visibility scope of a specified AgentSpec. Fields that are not provided remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags, version labels, and visibility scope of a specified AgentSpec. Fields that are not provided remain unchanged.</p>
     * 
     * @param request UpdateAgentSpecRequest
     * @return UpdateAgentSpecResponse
     */
    public UpdateAgentSpecResponse updateAgentSpec(String workspaceId, String agentSpecName, UpdateAgentSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentSpecWithOptions(workspaceId, agentSpecName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the sensitive configuration of a specified Connector and aligns Service Account Keys by ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the API Key or Service Account Key collection for an enabled QoderCLI Connector. When serviceAccountKeys is submitted, the service treats it as the complete updated key collection and performs additions, renames, rotations, and deletions accordingly.</p>
     * 
     * @param tmpReq UpdateConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectorResponse
     */
    public UpdateConnectorResponse updateConnectorWithOptions(String workspaceId, String connectorName, UpdateConnectorRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConnectorShrinkRequest request = new UpdateConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnector"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/connectors/" + com.aliyun.openapiutil.Client.getEncodeParam(connectorName) + "/actions/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the sensitive configuration of a specified Connector and aligns Service Account Keys by ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the API Key or Service Account Key collection for an enabled QoderCLI Connector. When serviceAccountKeys is submitted, the service treats it as the complete updated key collection and performs additions, renames, rotations, and deletions accordingly.</p>
     * 
     * @param request UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    public UpdateConnectorResponse updateConnector(String workspaceId, String connectorName, UpdateConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConnectorWithOptions(workspaceId, connectorName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the metadata or application scope of a specified credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the content or description of a specified credential. You must specify at least one of credentialMetadata and description. Unspecified attributes remain unchanged. The credential name and credential type cannot be modified after creation.</p>
     * 
     * @param tmpReq UpdateCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredentialWithOptions(String workspaceId, String credentialId, UpdateCredentialRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCredentialShrinkRequest request = new UpdateCredentialShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredential"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the metadata or application scope of a specified credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the content or description of a specified credential. You must specify at least one of credentialMetadata and description. Unspecified attributes remain unchanged. The credential name and credential type cannot be modified after creation.</p>
     * 
     * @param request UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredential(String workspaceId, String credentialId, UpdateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCredentialWithOptions(workspaceId, credentialId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Provide at least one top-level field to update. Omitted top-level fields retain their original configurations. When providing a configuration object, specify its required subfields and include any optional configurations that you want to retain. Arrays are replaced as a whole. Pass an empty array [] to clear a list. The agenticFsMounts field does not accept null. Pass null for the description field to clear the description, and pass null for the healthCheck field to remove the health check.
     * When updating an image, you must specify artifact.port and the type, instanceId, namespace, repo, and tag fields of artifact.container. To retain a custom startup command, also provide the entrypoint field.
     * In code package pattern, specify artifact.port and the sourceUri, languageRuntime, and entrypoint fields of artifact.code. Do not specify the container field at the same time. Dependencies must be packaged by the user. ZIP and TAR.GZ formats are supported, and the compressed package size cannot exceed 500,000,000 bytes. Query the runtime environment identity by calling the ListAgentCodeRuntimes operation. The sourceUri field supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including signed URLs. For local files, first call the GetAgentCodePackageUploadUrl operation to obtain an upload URL, upload the file directly, and then commit the returned sourceUri.
     * When submitting a new code package source, the backend rechecks read permissions, objects, and sizes. The configuration is saved only after the transfer succeeds. If the transfer fails, the current configuration is not saved. Saved fixed packages can be reused. Set the client timeout to 210 seconds for code package requests. Archive integrity and secure decompression are checked at startup. A successful acceptance does not indicate that the agent is ready to run.
     * When providing the runtime field, the compute and sessionPolicy fields must be provided at the same time. If the hpa field or its subfields are omitted, unspecified elastic configurations use default values. To retain the original elastic configurations, provide them together. When providing the network field, omitted access items are treated as allowed, but actual access is still restricted by the workspace network configurations. To retain the original restrictions, provide both accessInternet and accessVpc. When providing the healthCheck field, the port field is required, and other unspecified items use default values. When providing the logging.sls field, both project and logstore must be specified.
     * The update is an asynchronous process. A successful response indicates that the request is accepted. Call the GetCustomAgent operation to query latestSpecVersion, latestVersionStatus, and latestExecutionError, and check the status field to confirm the update result.
     * The clientToken field currently does not provide idempotency guarantees. Do not rely on this parameter to prevent duplicate requests. The healthyThreshold field for health checks currently does not take effect. Omit this field.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified custom agent in a workspace and executes the update asynchronously. Omitted top-level fields retain their original configurations. You can call the GetCustomAgent operation to query the update result.</p>
     * 
     * @param tmpReq UpdateCustomAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomAgentResponse
     */
    public UpdateCustomAgentResponse updateCustomAgentWithOptions(String workspaceId, String agentId, UpdateCustomAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCustomAgentShrinkRequest request = new UpdateCustomAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Provide at least one top-level field to update. Omitted top-level fields retain their original configurations. When providing a configuration object, specify its required subfields and include any optional configurations that you want to retain. Arrays are replaced as a whole. Pass an empty array [] to clear a list. The agenticFsMounts field does not accept null. Pass null for the description field to clear the description, and pass null for the healthCheck field to remove the health check.
     * When updating an image, you must specify artifact.port and the type, instanceId, namespace, repo, and tag fields of artifact.container. To retain a custom startup command, also provide the entrypoint field.
     * In code package pattern, specify artifact.port and the sourceUri, languageRuntime, and entrypoint fields of artifact.code. Do not specify the container field at the same time. Dependencies must be packaged by the user. ZIP and TAR.GZ formats are supported, and the compressed package size cannot exceed 500,000,000 bytes. Query the runtime environment identity by calling the ListAgentCodeRuntimes operation. The sourceUri field supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including signed URLs. For local files, first call the GetAgentCodePackageUploadUrl operation to obtain an upload URL, upload the file directly, and then commit the returned sourceUri.
     * When submitting a new code package source, the backend rechecks read permissions, objects, and sizes. The configuration is saved only after the transfer succeeds. If the transfer fails, the current configuration is not saved. Saved fixed packages can be reused. Set the client timeout to 210 seconds for code package requests. Archive integrity and secure decompression are checked at startup. A successful acceptance does not indicate that the agent is ready to run.
     * When providing the runtime field, the compute and sessionPolicy fields must be provided at the same time. If the hpa field or its subfields are omitted, unspecified elastic configurations use default values. To retain the original elastic configurations, provide them together. When providing the network field, omitted access items are treated as allowed, but actual access is still restricted by the workspace network configurations. To retain the original restrictions, provide both accessInternet and accessVpc. When providing the healthCheck field, the port field is required, and other unspecified items use default values. When providing the logging.sls field, both project and logstore must be specified.
     * The update is an asynchronous process. A successful response indicates that the request is accepted. Call the GetCustomAgent operation to query latestSpecVersion, latestVersionStatus, and latestExecutionError, and check the status field to confirm the update result.
     * The clientToken field currently does not provide idempotency guarantees. Do not rely on this parameter to prevent duplicate requests. The healthyThreshold field for health checks currently does not take effect. Omit this field.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified custom agent in a workspace and executes the update asynchronously. Omitted top-level fields retain their original configurations. You can call the GetCustomAgent operation to query the update result.</p>
     * 
     * @param request UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    public UpdateCustomAgentResponse updateCustomAgent(String workspaceId, String agentId, UpdateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * @param tmpReq UpdateExternalAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExternalAgentResponse
     */
    public UpdateExternalAgentResponse updateExternalAgentWithOptions(String workspaceId, String agentId, UpdateExternalAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateExternalAgentShrinkRequest request = new UpdateExternalAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExternalAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/external-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExternalAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * @param request UpdateExternalAgentRequest
     * @return UpdateExternalAgentResponse
     */
    public UpdateExternalAgentResponse updateExternalAgent(String workspaceId, String agentId, UpdateExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExternalAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites and update methods</h3>
     * <p>The workspace must be bound to an identity provider of the corresponding type. For DingTalk and Lark, you must submit at least one of loginEnabled, syncEnabled, metadata, and syncScope. protocol and saml are not accepted. For CustomSSO, use protocol, saml, and loginEnabled. metadata, syncEnabled, and syncScope are not accepted. The SCIM synchronization switch is managed separately through UpdateIdentityProviderSCIM.</p>
     * <h3>DingTalk and Lark</h3>
     * <p>The metadata is merged by field. Submit only the fields that need to be updated. Omitted fields and existing keys remain unchanged. Explicitly submitting null, empty strings, or blank strings will be rejected. The server validates the complete configuration after merging. When incremental synchronization is enabled, the merged configuration must include encryptKey and verificationToken.
     * syncEnabled controls subsequent address book change events and does not control the initial synchronization or manual synchronization. syncScope applies only to DingTalk and Lark. If it is omitted or set to null, the current scope is retained. Saving the scope does not automatically trigger a full synchronization. To perform manual synchronization, call CreateIdentityProviderSyncJob after saving and waiting for the identity provider to be ready, and then call GetIdentityProviderSyncJob to query the task result.</p>
     * <h3>Custom SAML identity provider</h3>
     * <p>CustomSSO currently supports only SAML. The saml parameter supports two mutually exclusive methods: providing metadataXml, or providing the four manual configuration fields: entityId, loginUrl, bindingType, and x509Certificates.
     * metadataXml is a single IdP EntityDescriptor XML text of up to 1 MiB, not a URL or file path. DTDs and external entities are prohibited. For manual configuration, entityId must be non-empty and up to 2,048 characters, and cannot be changed after saving. loginUrl must be an absolute HTTPS URL without user credentials and fragments. bindingType must be HTTP-Redirect or HTTP-POST. Certificates must be valid X.509 signing certificates, with a maximum of 10 certificates.
     * jitProvisionEnabled controls the automatic creation of users during the initial logon, and jitUpdateEnabled controls whether user information is updated during logon. Omitting these switches during an update retains the existing values. Modifying only the JIT switches also requires an existing valid SAML configuration. Saving the SAML configuration does not automatically enable logon. A valid configuration must exist before enabling logon. Setting loginEnabled to false only triggers a shutdown of logon and does not delete the saved SAML or SCIM configurations.</p>
     * <h3>Asynchronous results and retries</h3>
     * <p>When actual changes exist, the expected configuration and the UPDATING status of the identity provider are returned. The CONFIGURED status may also be returned when resource configurations are restored. Call GetIdentityProvider to wait for the READY status. If the operation fails, check for statuses such as UPDATE_FAILED. If the configuration is identical and no restoration is required, the current binding may be returned directly without generating a new task. A successful HTTP request does not indicate that the background task or upstream configuration has taken effect.
     * Operation conflicts occur when in-flight operations exist. If a submission times out, query the configuration and status before deciding whether to retry. The status parameter describes the status of the identity provider resource and logon configuration. The SCIM operation results for CustomSSO must be queried through GetIdentityProviderSCIM and cannot be inferred from this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the logon configuration of a bound identity provider in a specified workspace. DingTalk and Lark support logon switches, incremental synchronization switches, application configurations, and synchronization scopes. CustomSSO supports SAML configurations and logon switches. Actual updates take effect asynchronously. Call GetIdentityProvider to query the status.</p>
     * 
     * @param tmpReq UpdateIdentityProviderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProviderWithOptions(String workspaceId, String identityProviderType, UpdateIdentityProviderRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIdentityProviderShrinkRequest request = new UpdateIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityProvider"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/identity-providers/" + com.aliyun.openapiutil.Client.getEncodeParam(identityProviderType) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites and update methods</h3>
     * <p>The workspace must be bound to an identity provider of the corresponding type. For DingTalk and Lark, you must submit at least one of loginEnabled, syncEnabled, metadata, and syncScope. protocol and saml are not accepted. For CustomSSO, use protocol, saml, and loginEnabled. metadata, syncEnabled, and syncScope are not accepted. The SCIM synchronization switch is managed separately through UpdateIdentityProviderSCIM.</p>
     * <h3>DingTalk and Lark</h3>
     * <p>The metadata is merged by field. Submit only the fields that need to be updated. Omitted fields and existing keys remain unchanged. Explicitly submitting null, empty strings, or blank strings will be rejected. The server validates the complete configuration after merging. When incremental synchronization is enabled, the merged configuration must include encryptKey and verificationToken.
     * syncEnabled controls subsequent address book change events and does not control the initial synchronization or manual synchronization. syncScope applies only to DingTalk and Lark. If it is omitted or set to null, the current scope is retained. Saving the scope does not automatically trigger a full synchronization. To perform manual synchronization, call CreateIdentityProviderSyncJob after saving and waiting for the identity provider to be ready, and then call GetIdentityProviderSyncJob to query the task result.</p>
     * <h3>Custom SAML identity provider</h3>
     * <p>CustomSSO currently supports only SAML. The saml parameter supports two mutually exclusive methods: providing metadataXml, or providing the four manual configuration fields: entityId, loginUrl, bindingType, and x509Certificates.
     * metadataXml is a single IdP EntityDescriptor XML text of up to 1 MiB, not a URL or file path. DTDs and external entities are prohibited. For manual configuration, entityId must be non-empty and up to 2,048 characters, and cannot be changed after saving. loginUrl must be an absolute HTTPS URL without user credentials and fragments. bindingType must be HTTP-Redirect or HTTP-POST. Certificates must be valid X.509 signing certificates, with a maximum of 10 certificates.
     * jitProvisionEnabled controls the automatic creation of users during the initial logon, and jitUpdateEnabled controls whether user information is updated during logon. Omitting these switches during an update retains the existing values. Modifying only the JIT switches also requires an existing valid SAML configuration. Saving the SAML configuration does not automatically enable logon. A valid configuration must exist before enabling logon. Setting loginEnabled to false only triggers a shutdown of logon and does not delete the saved SAML or SCIM configurations.</p>
     * <h3>Asynchronous results and retries</h3>
     * <p>When actual changes exist, the expected configuration and the UPDATING status of the identity provider are returned. The CONFIGURED status may also be returned when resource configurations are restored. Call GetIdentityProvider to wait for the READY status. If the operation fails, check for statuses such as UPDATE_FAILED. If the configuration is identical and no restoration is required, the current binding may be returned directly without generating a new task. A successful HTTP request does not indicate that the background task or upstream configuration has taken effect.
     * Operation conflicts occur when in-flight operations exist. If a submission times out, query the configuration and status before deciding whether to retry. The status parameter describes the status of the identity provider resource and logon configuration. The SCIM operation results for CustomSSO must be queried through GetIdentityProviderSCIM and cannot be inferred from this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the logon configuration of a bound identity provider in a specified workspace. DingTalk and Lark support logon switches, incremental synchronization switches, application configurations, and synchronization scopes. CustomSSO supports SAML configurations and logon switches. Actual updates take effect asynchronously. Call GetIdentityProvider to query the status.</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProvider(String workspaceId, String identityProviderType, UpdateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIdentityProviderWithOptions(workspaceId, identityProviderType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>The syncEnabled parameter is required. If you set this parameter to true, a task is submitted to independently enable SCIM and perform the initial full user import. During execution, the AgentIdentity receiving status must be Enabled, and an enabled and unexpired credential must exist. Therefore, you must first call the prepare operation and complete the URL and token configuration in the external system. If you set this parameter to false, a task is submitted to disable synchronization and upstream receiving. Existing users, credentials, and SAML logon configurations are retained. If you re-enable synchronization later and receiving is disabled, you must call the prepare operation again.
     * Request acceptance only saves the expected switch status in AC and submits the task. The returned data is still the shared binding and does not contain the SCIM taskId. The status is not overwritten by this task and may be READY or UPDATE_FAILED from a previous logon task. Neither can be used to determine the success or failure of SCIM. Query GetIdentityProviderSCIM.operationStatus to wait for the result. Prerequisite checks for enabling are executed within the task. If the prerequisites are not met, you may receive a successful request response first, and then operationStatus=FAILED. A failure does not automatically roll back the expected switch status.
     * SCIM does not depend on SAML configuration and does not affect the SAML status or switch. A successful task and a successful full import of empty users do not prove that continuous incremental synchronization is healthy. Whether users exist depends on whether the external system has actually pre-provisioned them.</p>
     * <h2>Requests and examples</h2>
     * <p>PUT /workspaces/{workspaceId}/scim-provisioning
     * Call conventions: Call the API in the region of the target workspace by using an AK/STS identity that has permissions on the identity provider resources of the corresponding workspace. In the following examples, ws-example, URL, certificate, and Token are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API, not the additional body wrapper of the backend direct connection API. The response example only shows the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">PUT /workspaces/ws-example/scim-provisioning
     * {&quot;syncEnabled&quot;: true}
     * To disable: {&quot;syncEnabled&quot;: false}
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;READY&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: true
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call to the upstream system that fails may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 400 InvalidParameter: syncEnabled is missing. 404 IdentityProviderNotFound: No CustomSSO binding exists. 409 IdentityProviderOperationConflict: The user pool is not ready, is being unbound, failed to unbind, or has a concurrent status conflict. Upstream not being enabled or having no valid credentials may manifest as an asynchronous FAILED after acceptance. You cannot only handle HTTP errors.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>The call example for enabling is body={&quot;syncEnabled&quot;:true}, and for disabling is body={&quot;syncEnabled&quot;:false}. This API returns a snapshot of the shared binding, and its status is not the status of this SCIM task. After acceptance, use GetIdentityProviderSCIM to query operationStatus. Pre-provisioning tests or user assignments for external IdPs must still be completed in the external system. AC does not configure external IdPs for users.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables SCIM user synchronization independently. When enabled, the initial full import is executed asynchronously. You can query the result by calling GetIdentityProviderSCIM. The SAML logon configuration is retained.</p>
     * 
     * @param tmpReq UpdateIdentityProviderSCIMRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityProviderSCIMResponse
     */
    public UpdateIdentityProviderSCIMResponse updateIdentityProviderSCIMWithOptions(String workspaceId, UpdateIdentityProviderSCIMRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIdentityProviderSCIMShrinkRequest request = new UpdateIdentityProviderSCIMShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityProviderSCIM"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/scim-provisioning"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdentityProviderSCIMResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>The syncEnabled parameter is required. If you set this parameter to true, a task is submitted to independently enable SCIM and perform the initial full user import. During execution, the AgentIdentity receiving status must be Enabled, and an enabled and unexpired credential must exist. Therefore, you must first call the prepare operation and complete the URL and token configuration in the external system. If you set this parameter to false, a task is submitted to disable synchronization and upstream receiving. Existing users, credentials, and SAML logon configurations are retained. If you re-enable synchronization later and receiving is disabled, you must call the prepare operation again.
     * Request acceptance only saves the expected switch status in AC and submits the task. The returned data is still the shared binding and does not contain the SCIM taskId. The status is not overwritten by this task and may be READY or UPDATE_FAILED from a previous logon task. Neither can be used to determine the success or failure of SCIM. Query GetIdentityProviderSCIM.operationStatus to wait for the result. Prerequisite checks for enabling are executed within the task. If the prerequisites are not met, you may receive a successful request response first, and then operationStatus=FAILED. A failure does not automatically roll back the expected switch status.
     * SCIM does not depend on SAML configuration and does not affect the SAML status or switch. A successful task and a successful full import of empty users do not prove that continuous incremental synchronization is healthy. Whether users exist depends on whether the external system has actually pre-provisioned them.</p>
     * <h2>Requests and examples</h2>
     * <p>PUT /workspaces/{workspaceId}/scim-provisioning
     * Call conventions: Call the API in the region of the target workspace by using an AK/STS identity that has permissions on the identity provider resources of the corresponding workspace. In the following examples, ws-example, URL, certificate, and Token are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API, not the additional body wrapper of the backend direct connection API. The response example only shows the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">PUT /workspaces/ws-example/scim-provisioning
     * {&quot;syncEnabled&quot;: true}
     * To disable: {&quot;syncEnabled&quot;: false}
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;READY&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: true
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call to the upstream system that fails may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 400 InvalidParameter: syncEnabled is missing. 404 IdentityProviderNotFound: No CustomSSO binding exists. 409 IdentityProviderOperationConflict: The user pool is not ready, is being unbound, failed to unbind, or has a concurrent status conflict. Upstream not being enabled or having no valid credentials may manifest as an asynchronous FAILED after acceptance. You cannot only handle HTTP errors.</p>
     * <h2>Call relationships and usage boundaries</h2>
     * <p>The call example for enabling is body={&quot;syncEnabled&quot;:true}, and for disabling is body={&quot;syncEnabled&quot;:false}. This API returns a snapshot of the shared binding, and its status is not the status of this SCIM task. After acceptance, use GetIdentityProviderSCIM to query operationStatus. Pre-provisioning tests or user assignments for external IdPs must still be completed in the external system. AC does not configure external IdPs for users.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables SCIM user synchronization independently. When enabled, the initial full import is executed asynchronously. You can query the result by calling GetIdentityProviderSCIM. The SAML logon configuration is retained.</p>
     * 
     * @param request UpdateIdentityProviderSCIMRequest
     * @return UpdateIdentityProviderSCIMResponse
     */
    public UpdateIdentityProviderSCIMResponse updateIdentityProviderSCIM(String workspaceId, UpdateIdentityProviderSCIMRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIdentityProviderSCIMWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified managed agent.</p>
     * 
     * @param tmpReq UpdateManagedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateManagedAgentResponse
     */
    public UpdateManagedAgentResponse updateManagedAgentWithOptions(String workspaceId, String agentId, UpdateManagedAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateManagedAgentShrinkRequest request = new UpdateManagedAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateManagedAgent"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateManagedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified managed agent.</p>
     * 
     * @param request UpdateManagedAgentRequest
     * @return UpdateManagedAgentResponse
     */
    public UpdateManagedAgentResponse updateManagedAgent(String workspaceId, String agentId, UpdateManagedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateManagedAgentWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update is an asynchronous process.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update is an asynchronous process.</p>
     * 
     * @param tmpReq UpdateMcpRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcpResponse
     */
    public UpdateMcpResponse updateMcpWithOptions(String workspaceId, String mcpServerId, UpdateMcpRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMcpShrinkRequest request = new UpdateMcpShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMcp"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update is an asynchronous process.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update is an asynchronous process.</p>
     * 
     * @param request UpdateMcpRequest
     * @return UpdateMcpResponse
     */
    public UpdateMcpResponse updateMcp(String workspaceId, String mcpServerId, UpdateMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMcpWithOptions(workspaceId, mcpServerId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the schema-exposed parameters by using the same template version that was bound when the MCP was created, without upgrading the template version.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates MCP parameters by template.</p>
     * 
     * @param tmpReq UpdateMcpTemplateConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcpTemplateConfigResponse
     */
    public UpdateMcpTemplateConfigResponse updateMcpTemplateConfigWithOptions(String workspaceId, String mcpServerId, UpdateMcpTemplateConfigRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMcpTemplateConfigShrinkRequest request = new UpdateMcpTemplateConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("templateVersion", request.templateVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMcpTemplateConfig"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + "/template-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcpTemplateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the schema-exposed parameters by using the same template version that was bound when the MCP was created, without upgrading the template version.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates MCP parameters by template.</p>
     * 
     * @param request UpdateMcpTemplateConfigRequest
     * @return UpdateMcpTemplateConfigResponse
     */
    public UpdateMcpTemplateConfigResponse updateMcpTemplateConfig(String workspaceId, String mcpServerId, UpdateMcpTemplateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMcpTemplateConfigWithOptions(workspaceId, mcpServerId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the text or metadata of a long-term memory based on the memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the text or metadata of a long-term memory based on the memory ID.</p>
     * 
     * @param tmpReq UpdateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemoryWithOptions(String workspaceId, String memoryStoreName, String memoryId, UpdateMemoryRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMemoryShrinkRequest request = new UpdateMemoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemory"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the text or metadata of a long-term memory based on the memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the text or metadata of a long-term memory based on the memory ID.</p>
     * 
     * @param request UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemory(String workspaceId, String memoryStoreName, String memoryId, UpdateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryWithOptions(workspaceId, memoryStoreName, memoryId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a memory store.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a memory store.</p>
     * 
     * @param tmpReq UpdateMemoryStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryStoreResponse
     */
    public UpdateMemoryStoreResponse updateMemoryStoreWithOptions(String workspaceId, String memoryStoreName, UpdateMemoryStoreRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMemoryStoreShrinkRequest request = new UpdateMemoryStoreShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemoryStore"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memorystores/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryStoreName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates a memory store.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a memory store.</p>
     * 
     * @param request UpdateMemoryStoreRequest
     * @return UpdateMemoryStoreResponse
     */
    public UpdateMemoryStoreResponse updateMemoryStore(String workspaceId, String memoryStoreName, UpdateMemoryStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryStoreWithOptions(workspaceId, memoryStoreName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports updating description, contextSize, maxTokens, and capabilities. You must specify at least one non-null parameter. Parameters that are not specified or are set to null retain their original values. The capabilities parameter is replaced as a whole object. Capability fields that are not specified in the object are treated as false.
     * Modifying only the description does not refresh the model configurations of associated agents. When contextSize, maxTokens, or capabilities actually change, the system asynchronously refreshes managed agents that reference the model within the same workspace, as well as external agents whose model source is PLATFORM. External agents whose model source is RUNTIME are not affected. Repeatedly submitting the same configuration does not trigger a new model configuration refresh.
     * A successful response indicates that the model configuration has been saved, but does not indicate that associated agents have completed the configuration refresh or that the runtime has loaded the new configuration. You can call GetModel to query the saved model configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description, context token limit, maximum output token count, or capability configurations of a specified model.</p>
     * 
     * @param tmpReq UpdateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelResponse
     */
    public UpdateModelResponse updateModelWithOptions(String workspaceId, String modelId, UpdateModelRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateModelShrinkRequest request = new UpdateModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModel"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/models/" + com.aliyun.openapiutil.Client.getEncodeParam(modelId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports updating description, contextSize, maxTokens, and capabilities. You must specify at least one non-null parameter. Parameters that are not specified or are set to null retain their original values. The capabilities parameter is replaced as a whole object. Capability fields that are not specified in the object are treated as false.
     * Modifying only the description does not refresh the model configurations of associated agents. When contextSize, maxTokens, or capabilities actually change, the system asynchronously refreshes managed agents that reference the model within the same workspace, as well as external agents whose model source is PLATFORM. External agents whose model source is RUNTIME are not affected. Repeatedly submitting the same configuration does not trigger a new model configuration refresh.
     * A successful response indicates that the model configuration has been saved, but does not indicate that associated agents have completed the configuration refresh or that the runtime has loaded the new configuration. You can call GetModel to query the saved model configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description, context token limit, maximum output token count, or capability configurations of a specified model.</p>
     * 
     * @param request UpdateModelRequest
     * @return UpdateModelResponse
     */
    public UpdateModelResponse updateModel(String workspaceId, String modelId, UpdateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelWithOptions(workspaceId, modelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publish task. The invocation protocol cannot be modified after creation.</p>
     * 
     * @param tmpReq UpdateModelConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelConnectionResponse
     */
    public UpdateModelConnectionResponse updateModelConnectionWithOptions(String workspaceId, String connectionId, UpdateModelConnectionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateModelConnectionShrinkRequest request = new UpdateModelConnectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelConnection"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/model-connections/" + com.aliyun.openapiutil.Client.getEncodeParam(connectionId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publish task. The invocation protocol cannot be modified after creation.</p>
     * 
     * @param request UpdateModelConnectionRequest
     * @return UpdateModelConnectionResponse
     */
    public UpdateModelConnectionResponse updateModelConnection(String workspaceId, String connectionId, UpdateModelConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelConnectionWithOptions(workspaceId, connectionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the business tags of a specified skill. Other attributes not provided in the request remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags of a specified skill. Other attributes not provided in the request remain unchanged.</p>
     * 
     * @param tmpReq UpdateSkillBizTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillBizTagsResponse
     */
    public UpdateSkillBizTagsResponse updateSkillBizTagsWithOptions(String workspaceId, String skillName, UpdateSkillBizTagsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSkillBizTagsShrinkRequest request = new UpdateSkillBizTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillBizTags"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/biz-tags"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillBizTagsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the business tags of a specified skill. Other attributes not provided in the request remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags of a specified skill. Other attributes not provided in the request remain unchanged.</p>
     * 
     * @param request UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    public UpdateSkillBizTagsResponse updateSkillBizTags(String workspaceId, String skillName, UpdateSkillBizTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSkillBizTagsWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the version labels and their mappings for a specified Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the version labels and their mappings for a specified Skill.</p>
     * 
     * @param tmpReq UpdateSkillLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillLabelsResponse
     */
    public UpdateSkillLabelsResponse updateSkillLabelsWithOptions(String workspaceId, String skillName, UpdateSkillLabelsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSkillLabelsShrinkRequest request = new UpdateSkillLabelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillLabels"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/labels"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillLabelsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the version labels and their mappings for a specified Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the version labels and their mappings for a specified Skill.</p>
     * 
     * @param request UpdateSkillLabelsRequest
     * @return UpdateSkillLabelsResponse
     */
    public UpdateSkillLabelsResponse updateSkillLabels(String workspaceId, String skillName, UpdateSkillLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSkillLabelsWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * @param tmpReq UpdateSkillScopeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillScopeResponse
     */
    public UpdateSkillScopeResponse updateSkillScopeWithOptions(String workspaceId, String skillName, UpdateSkillScopeRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSkillScopeShrinkRequest request = new UpdateSkillScopeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillScope"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/scope"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillScopeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * @param request UpdateSkillScopeRequest
     * @return UpdateSkillScopeResponse
     */
    public UpdateSkillScopeResponse updateSkillScope(String workspaceId, String skillName, UpdateSkillScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSkillScopeWithOptions(workspaceId, skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description and members of a specified team. When users or agents are passed, the corresponding member list is replaced based on full overwrite semantics. Member lists that are not passed remain unchanged. The team name cannot be modified after creation.</p>
     * 
     * @param tmpReq UpdateTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeamWithOptions(String workspaceId, String teamId, UpdateTeamRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTeamShrinkRequest request = new UpdateTeamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTeam"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description and members of a specified team. When users or agents are passed, the corresponding member list is replaced based on full overwrite semantics. Member lists that are not passed remain unchanged. The team name cannot be modified after creation.</p>
     * 
     * @param request UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeam(String workspaceId, String teamId, UpdateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTeamWithOptions(workspaceId, teamId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the display name, email address, or note of a specified user. You must specify at least one of the displayName, email, and note parameters. Unspecified attributes remain unchanged. The username cannot be modified after creation.</p>
     * 
     * @param tmpReq UpdateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(String workspaceId, String agentCoreUserId, UpdateUserRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserShrinkRequest request = new UpdateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(agentCoreUserId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the display name, email address, or note of a specified user. You must specify at least one of the displayName, email, and note parameters. Unspecified attributes remain unchanged. The username cannot be modified after creation.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(String workspaceId, String agentCoreUserId, UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(workspaceId, agentCoreUserId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> state can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this API operation. The network configuration uses <code>Enabled</code> to specify whether to enable the VPC network. If enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or network configuration of a workspace. Only workspaces in the Initialized state can be updated. Status, TenantId, and RegionId are maintained by the server and cannot be modified through this API operation.</p>
     * 
     * @param tmpReq UpdateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspaceWithOptions(String workspaceId, UpdateWorkspaceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkspaceShrinkRequest request = new UpdateWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspace"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> state can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this API operation. The network configuration uses <code>Enabled</code> to specify whether to enable the VPC network. If enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or network configuration of a workspace. Only workspaces in the Initialized state can be updated. Status, TenantId, and RegionId are maintained by the server and cannot be modified through this API operation.</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(String workspaceId, UpdateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses the package, and imports the AgentSpec into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports an AgentSpec into the current workspace by retrieving and parsing an uploaded AgentSpec ZIP package from OSS.</p>
     * 
     * @param tmpReq UploadAgentSpecViaOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadAgentSpecViaOssResponse
     */
    public UploadAgentSpecViaOssResponse uploadAgentSpecViaOssWithOptions(String workspaceId, UploadAgentSpecViaOssRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadAgentSpecViaOssShrinkRequest request = new UploadAgentSpecViaOssShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadAgentSpecViaOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-spec-actions/upload-via-oss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadAgentSpecViaOssResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses the package, and imports the AgentSpec into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports an AgentSpec into the current workspace by retrieving and parsing an uploaded AgentSpec ZIP package from OSS.</p>
     * 
     * @param request UploadAgentSpecViaOssRequest
     * @return UploadAgentSpecViaOssResponse
     */
    public UploadAgentSpecViaOssResponse uploadAgentSpecViaOss(String workspaceId, UploadAgentSpecViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadAgentSpecViaOssWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded Skill ZIP package from OSS, parses it, and imports the Skill into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an uploaded Skill ZIP package from OSS, parses it, and imports the Skill into the current workspace.</p>
     * 
     * @param tmpReq UploadSkillViaOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadSkillViaOssResponse
     */
    public UploadSkillViaOssResponse uploadSkillViaOssWithOptions(String workspaceId, UploadSkillViaOssRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadSkillViaOssShrinkRequest request = new UploadSkillViaOssShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadSkillViaOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/skill-actions/upload-via-oss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadSkillViaOssResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded Skill ZIP package from OSS, parses it, and imports the Skill into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an uploaded Skill ZIP package from OSS, parses it, and imports the Skill into the current workspace.</p>
     * 
     * @param request UploadSkillViaOssRequest
     * @return UploadSkillViaOssResponse
     */
    public UploadSkillViaOssResponse uploadSkillViaOss(String workspaceId, UploadSkillViaOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSkillViaOssWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Uses the current workspace role to check whether the customer\&quot;s OSS object exists and is readable, and checks the file name extension and compressed size. Returns the sourceUri, file name, size, and format read in this request. The bucket and object key are passed separately, and HTTPS download URLs are not accepted.
     * The validation uses object metadata and read probing. It does not perform full downloads, transfers, or decompression, nor does it generate a SHA-256 hash. Passing the validation does not mean that the archive content is complete or can be started. When you submit a CreateCustomAgent or UpdateCustomAgent request, the system re-validates and transfers the package. You do not need to invoke this operation in advance as a prerequisite for submission.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates the OSS code package source for an agent.</p>
     * 
     * @param tmpReq ValidateAgentCodePackageFromOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateAgentCodePackageFromOssResponse
     */
    public ValidateAgentCodePackageFromOssResponse validateAgentCodePackageFromOssWithOptions(String workspaceId, ValidateAgentCodePackageFromOssRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ValidateAgentCodePackageFromOssShrinkRequest request = new ValidateAgentCodePackageFromOssShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateAgentCodePackageFromOss"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-code-packages/validate-from-oss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateAgentCodePackageFromOssResponse());
    }

    /**
     * <b>description</b> :
     * <p>Uses the current workspace role to check whether the customer\&quot;s OSS object exists and is readable, and checks the file name extension and compressed size. Returns the sourceUri, file name, size, and format read in this request. The bucket and object key are passed separately, and HTTPS download URLs are not accepted.
     * The validation uses object metadata and read probing. It does not perform full downloads, transfers, or decompression, nor does it generate a SHA-256 hash. Passing the validation does not mean that the archive content is complete or can be started. When you submit a CreateCustomAgent or UpdateCustomAgent request, the system re-validates and transfers the package. You do not need to invoke this operation in advance as a prerequisite for submission.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates the OSS code package source for an agent.</p>
     * 
     * @param request ValidateAgentCodePackageFromOssRequest
     * @return ValidateAgentCodePackageFromOssResponse
     */
    public ValidateAgentCodePackageFromOssResponse validateAgentCodePackageFromOss(String workspaceId, ValidateAgentCodePackageFromOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateAgentCodePackageFromOssWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the binding status of the authorization policy for a specified source bucket to the current workspace role. AUTHORIZED indicates that the policy is bound. UNAUTHORIZED indicates that the policy is not bound. A bound policy does not indicate that a specific code package object exists or is readable.
     * To check a specific object, call ValidateAgentCodePackageFromOss. This operation does not copy code packages or modify the default OSS binding of the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the OSS RAM authorization status of the agent code package.</p>
     * 
     * @param request VerifyAgentCodePackageOssRamAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyAgentCodePackageOssRamAuthorizationResponse
     */
    public VerifyAgentCodePackageOssRamAuthorizationResponse verifyAgentCodePackageOssRamAuthorizationWithOptions(String workspaceId, VerifyAgentCodePackageOssRamAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("ossBucketName", request.ossBucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAgentCodePackageOssRamAuthorization"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agent-code-packages/oss/authorize/verify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyAgentCodePackageOssRamAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the binding status of the authorization policy for a specified source bucket to the current workspace role. AUTHORIZED indicates that the policy is bound. UNAUTHORIZED indicates that the policy is not bound. A bound policy does not indicate that a specific code package object exists or is readable.
     * To check a specific object, call ValidateAgentCodePackageFromOss. This operation does not copy code packages or modify the default OSS binding of the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the OSS RAM authorization status of the agent code package.</p>
     * 
     * @param request VerifyAgentCodePackageOssRamAuthorizationRequest
     * @return VerifyAgentCodePackageOssRamAuthorizationResponse
     */
    public VerifyAgentCodePackageOssRamAuthorizationResponse verifyAgentCodePackageOssRamAuthorization(String workspaceId, VerifyAgentCodePackageOssRamAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAgentCodePackageOssRamAuthorizationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Validates whether the credentials of a specified Connector are valid and returns a list of invalid Service Account Keys.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates whether one or more Qoder Service Account Keys are available at a specified site. This operation does not save keys or modify the Connector status.</p>
     * 
     * @param tmpReq VerifyConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyConnectorResponse
     */
    public VerifyConnectorResponse verifyConnectorWithOptions(String workspaceId, String connectorName, VerifyConnectorRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        VerifyConnectorShrinkRequest request = new VerifyConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyConnector"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/connectors/" + com.aliyun.openapiutil.Client.getEncodeParam(connectorName) + "/actions/verify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Validates whether the credentials of a specified Connector are valid and returns a list of invalid Service Account Keys.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates whether one or more Qoder Service Account Keys are available at a specified site. This operation does not save keys or modify the Connector status.</p>
     * 
     * @param request VerifyConnectorRequest
     * @return VerifyConnectorResponse
     */
    public VerifyConnectorResponse verifyConnector(String workspaceId, String connectorName, VerifyConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyConnectorWithOptions(workspaceId, connectorName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ACR and user OSS mounts share the workspace role. If no existing role is found, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is retained and only new permissions are appended without overwriting existing OSS policies. Fixed historical shared roles continue to be reused and are not recreated or renamed due to new naming templates. This operation performs a read-only check to verify whether the custom policies corresponding to the target instance, namespace, and repository are attached to the shared role, and checks the workspace prerequisites. It does not create execution versions or trigger configuration delivery. AUTHORIZED only indicates that the custom policy for the target name is attached, without parsing the policy content or simulating the final permissions. ELIGIBLE does not mean that RuntimeManager capacity or template admission is complete, nor does it require ACR configuration to be delivered. Creating or updating an agent re-verifies permissions and processes ACR dependencies on the backend. Configuration waiting, failures, and retries are reported through agent details.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ACR RAM authorization for a workspace.</p>
     * 
     * @param request VerifyWorkspaceAcrRamAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyWorkspaceAcrRamAuthorizationResponse
     */
    public VerifyWorkspaceAcrRamAuthorizationResponse verifyWorkspaceAcrRamAuthorizationWithOptions(String workspaceId, VerifyWorkspaceAcrRamAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrInstanceId)) {
            query.put("acrInstanceId", request.acrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repository)) {
            query.put("repository", request.repository);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyWorkspaceAcrRamAuthorization"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/acr/authorize/verify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyWorkspaceAcrRamAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>ACR and user OSS mounts share the workspace role. If no existing role is found, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is retained and only new permissions are appended without overwriting existing OSS policies. Fixed historical shared roles continue to be reused and are not recreated or renamed due to new naming templates. This operation performs a read-only check to verify whether the custom policies corresponding to the target instance, namespace, and repository are attached to the shared role, and checks the workspace prerequisites. It does not create execution versions or trigger configuration delivery. AUTHORIZED only indicates that the custom policy for the target name is attached, without parsing the policy content or simulating the final permissions. ELIGIBLE does not mean that RuntimeManager capacity or template admission is complete, nor does it require ACR configuration to be delivered. Creating or updating an agent re-verifies permissions and processes ACR dependencies on the backend. Configuration waiting, failures, and retries are reported through agent details.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ACR RAM authorization for a workspace.</p>
     * 
     * @param request VerifyWorkspaceAcrRamAuthorizationRequest
     * @return VerifyWorkspaceAcrRamAuthorizationResponse
     */
    public VerifyWorkspaceAcrRamAuthorizationResponse verifyWorkspaceAcrRamAuthorization(String workspaceId, VerifyWorkspaceAcrRamAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyWorkspaceAcrRamAuthorizationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Determines the shared role and target access point based on the workspace and server, checks whether the role has a mounted policy with the expected name and a type of Custom, and returns AUTHORIZED or UNAUTHORIZED. Consistent with OSS/ACR, this operation does not verify the policy body, role trust, or actual mount read/write permissions. If the upstream query fails, an error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the RAM authorization status of AgenticFS mounting for a workspace.</p>
     * 
     * @param request VerifyWorkspaceAgenticFsMountRamAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyWorkspaceAgenticFsMountRamAuthorizationResponse
     */
    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponse verifyWorkspaceAgenticFsMountRamAuthorizationWithOptions(String workspaceId, VerifyWorkspaceAgenticFsMountRamAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.server)) {
            query.put("server", request.server);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyWorkspaceAgenticFsMountRamAuthorization"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agentic-fs/authorize/verify"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyWorkspaceAgenticFsMountRamAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Determines the shared role and target access point based on the workspace and server, checks whether the role has a mounted policy with the expected name and a type of Custom, and returns AUTHORIZED or UNAUTHORIZED. Consistent with OSS/ACR, this operation does not verify the policy body, role trust, or actual mount read/write permissions. If the upstream query fails, an error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the RAM authorization status of AgenticFS mounting for a workspace.</p>
     * 
     * @param request VerifyWorkspaceAgenticFsMountRamAuthorizationRequest
     * @return VerifyWorkspaceAgenticFsMountRamAuthorizationResponse
     */
    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponse verifyWorkspaceAgenticFsMountRamAuthorization(String workspaceId, VerifyWorkspaceAgenticFsMountRamAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyWorkspaceAgenticFsMountRamAuthorizationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries whether the workspace OSS mount role is bound to the custom RAM policy corresponding to the target bucket, and returns AUTHORIZED or UNAUTHORIZED. When bucketName is not specified, the existing user-managed OSS binding of the workspace is used and the authorization status is saved. When bucketName is specified, only the authorization status of the specified bucket is queried without modifying the workspace OSS binding. This operation does not verify OSS data plane access permissions or resume workspace initialization tasks. Alibaba Cloud Container Registry (ACR) and user OSS mounts share the workspace role. If no existing role is available, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is reused and permissions are only appended without overwriting existing OSS policies. Previously pinned shared roles continue to be reused and are not recreated or renamed due to new naming templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the RAM authorization for a workspace to access an OSS bucket and returns the current authorization status. When bucketName is specified, verifies the authorization for an agent-mounted bucket. When bucketName is not specified, verifies and updates the authorization status of the workspace\&quot;s private OSS storage.</p>
     * 
     * @param request VerifyWorkspaceOssMountRamAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyWorkspaceOssMountRamAuthorizationResponse
     */
    public VerifyWorkspaceOssMountRamAuthorizationResponse verifyWorkspaceOssMountRamAuthorizationWithOptions(String workspaceId, VerifyWorkspaceOssMountRamAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("bucketName", request.bucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyWorkspaceOssMountRamAuthorization"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/oss-mount/authorize/verify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyWorkspaceOssMountRamAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries whether the workspace OSS mount role is bound to the custom RAM policy corresponding to the target bucket, and returns AUTHORIZED or UNAUTHORIZED. When bucketName is not specified, the existing user-managed OSS binding of the workspace is used and the authorization status is saved. When bucketName is specified, only the authorization status of the specified bucket is queried without modifying the workspace OSS binding. This operation does not verify OSS data plane access permissions or resume workspace initialization tasks. Alibaba Cloud Container Registry (ACR) and user OSS mounts share the workspace role. If no existing role is available, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is reused and permissions are only appended without overwriting existing OSS policies. Previously pinned shared roles continue to be reused and are not recreated or renamed due to new naming templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the RAM authorization for a workspace to access an OSS bucket and returns the current authorization status. When bucketName is specified, verifies the authorization for an agent-mounted bucket. When bucketName is not specified, verifies and updates the authorization status of the workspace\&quot;s private OSS storage.</p>
     * 
     * @param request VerifyWorkspaceOssMountRamAuthorizationRequest
     * @return VerifyWorkspaceOssMountRamAuthorizationResponse
     */
    public VerifyWorkspaceOssMountRamAuthorizationResponse verifyWorkspaceOssMountRamAuthorization(String workspaceId, VerifyWorkspaceOssMountRamAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyWorkspaceOssMountRamAuthorizationWithOptions(workspaceId, request, headers, runtime);
    }
}
