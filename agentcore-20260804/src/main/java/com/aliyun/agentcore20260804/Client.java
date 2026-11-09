// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804;

import com.aliyun.tea.*;
import com.aliyun.agentcore20260804.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "AgentCore";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
     * <p>Writes messages or text to a memory store to fetch long-term memory to retrieve and use later.</p>
     * <ul>
     * <li>If <code>sync</code> is omitted or set to <code>true</code>: waits for the fetch to complete and returns <code>memories</code>. Returns an empty array if no memories are fetched.</li>
     * <li>If <code>sync</code> is set to <code>false</code>: returns a <code>taskId</code>. You can query the fetch progress and results by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMemoryTask">GetMemoryTask</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Writes messages or text to a memory store. If sync is omitted or set to true, the operation synchronously waits for extraction and returns only memories, which can be an empty array. If sync is set to false, the operation returns only a taskId, and you can query the result by calling GetMemoryTask.</p>
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
     * <p>Writes messages or text to a memory store to fetch long-term memory to retrieve and use later.</p>
     * <ul>
     * <li>If <code>sync</code> is omitted or set to <code>true</code>: waits for the fetch to complete and returns <code>memories</code>. Returns an empty array if no memories are fetched.</li>
     * <li>If <code>sync</code> is set to <code>false</code>: returns a <code>taskId</code>. You can query the fetch progress and results by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMemoryTask">GetMemoryTask</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Writes messages or text to a memory store. If sync is omitted or set to true, the operation synchronously waits for extraction and returns only memories, which can be an empty array. If sync is set to false, the operation returns only a taskId, and you can query the result by calling GetMemoryTask.</p>
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
     * <b>description</b> :
     * <p>Deletes multiple models in a specified workspace. If any model is in use, the entire batch request fails.</p>
     * 
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
     * <b>description</b> :
     * <p>Deletes multiple models in a specified workspace. If any model is in use, the entire batch request fails.</p>
     * 
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
     * <p>Imports multiple skill ZIP packages that have been uploaded to OSS into a workspace in batches, and returns the processing result for each skill.
     * OSS is used here to temporarily store the ZIP packages to be imported. First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetSkillImportFileUrl">GetSkillImportFileUrl</a> to obtain the upload URL and upload the files, and then call this operation. To check the package content and name conflicts in advance, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrecheckSkillUploadViaOss">PrecheckSkillUploadViaOss</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads multiple skill ZIP packages through OSS and returns the processing result for each skill.</p>
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
     * <p>Imports multiple skill ZIP packages that have been uploaded to OSS into a workspace in batches, and returns the processing result for each skill.
     * OSS is used here to temporarily store the ZIP packages to be imported. First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetSkillImportFileUrl">GetSkillImportFileUrl</a> to obtain the upload URL and upload the files, and then call this operation. To check the package content and name conflicts in advance, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrecheckSkillUploadViaOss">PrecheckSkillUploadViaOss</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads multiple skill ZIP packages through OSS and returns the processing result for each skill.</p>
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
     * <p>Converts an MCP server installed from a marketplace template to free-edit mode so that you can directly modify the server configuration. After the conversion, the original source and tag information is retained, and the template editing restrictions are removed. The server no longer appears on the use case page associated with the template.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts an MCP server to free-edit mode.</p>
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
     * <p>Converts an MCP server installed from a marketplace template to free-edit mode so that you can directly modify the server configuration. After the conversion, the original source and tag information is retained, and the template editing restrictions are removed. The server no longer appears on the use case page associated with the template.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts an MCP server to free-edit mode.</p>
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
     * <p>Creates an IM channel for an agent to route messages from instant messaging platforms to the agent.
     * During creation, a publicly accessible service endpoint (<code>ServiceEndpoint</code>) is bound to the channel. After the channel is created, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentIMChannel">GetAgentIMChannel</a> to query its configuration and status.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible service endpoint.</p>
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
     * <p>Creates an IM channel for an agent to route messages from instant messaging platforms to the agent.
     * During creation, a publicly accessible service endpoint (<code>ServiceEndpoint</code>) is bound to the channel. After the channel is created, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentIMChannel">GetAgentIMChannel</a> to query its configuration and status.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible service endpoint.</p>
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
     * <p>Creates an agent template (AgentSpec) and generates the first draft version for editing reusable agent configurations. The creation fails if a template with the same name already exists in the same workspace. After creation, you can query the template and version information by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentSpec">GetAgentSpec</a>.</p>
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
     * <p>Creates an agent template (AgentSpec) and generates the first draft version for editing reusable agent configurations. The creation fails if a template with the same name already exists in the same workspace. After creation, you can query the template and version information by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentSpec">GetAgentSpec</a>.</p>
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
     * <p>Creates a new draft version for an existing agent template (AgentSpec) to modify and publish the next version of the configuration.
     * The template must already exist and must not have a draft currently being edited.</p>
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
     * <p>Creates a new draft version for an existing agent template (AgentSpec) to modify and publish the next version of the configuration.
     * The template must already exist and must not have a draft currently being edited.</p>
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
     * <p>Saves the currently effective configuration of a specified managed or custom agent as an immutable fixed version, and archives the version template and artifacts. This operation only saves the version and does not deploy an instance. Other types of agents, such as external agents, do not support versions and return AgentVersionSubtypeUnsupported. The latest release of the agent must be effective, meaning latestSpecVersion is equal to effectiveSpecVersion. The system generates an incrementing version number, agentVersion, such as v1 and v2, for each agent. The version number is unique within the agent, and the sequence numbers of deleted versions are not reused. This version number is used for querying, deleting, and referencing versions in service endpoints. Each agent can retain up to 50 undeleted versions. If the limit is reached, AgentVersionQuotaExceeded is returned. You can continue to save versions after deleting unused ones. Duplicate submissions with the same versionName and release serial number return the existing version and are not subject to the limit. Submissions with the same versionName but a different release serial number return AgentVersionAlreadyExists.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves an agent version.</p>
     * 
     * @param tmpReq CreateAgentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentVersionResponse
     */
    public CreateAgentVersionResponse createAgentVersionWithOptions(String workspaceId, String agentId, CreateAgentVersionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentVersionShrinkRequest request = new CreateAgentVersionShrinkRequest();
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
            new TeaPair("action", "CreateAgentVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Saves the currently effective configuration of a specified managed or custom agent as an immutable fixed version, and archives the version template and artifacts. This operation only saves the version and does not deploy an instance. Other types of agents, such as external agents, do not support versions and return AgentVersionSubtypeUnsupported. The latest release of the agent must be effective, meaning latestSpecVersion is equal to effectiveSpecVersion. The system generates an incrementing version number, agentVersion, such as v1 and v2, for each agent. The version number is unique within the agent, and the sequence numbers of deleted versions are not reused. This version number is used for querying, deleting, and referencing versions in service endpoints. Each agent can retain up to 50 undeleted versions. If the limit is reached, AgentVersionQuotaExceeded is returned. You can continue to save versions after deleting unused ones. Duplicate submissions with the same versionName and release serial number return the existing version and are not subject to the limit. Submissions with the same versionName but a different release serial number return AgentVersionAlreadyExists.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves an agent version.</p>
     * 
     * @param request CreateAgentVersionRequest
     * @return CreateAgentVersionResponse
     */
    public CreateAgentVersionResponse createAgentVersion(String workspaceId, String agentId, CreateAgentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentVersionWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an apiKey or mcpHeader credential in a workspace for agents or MCP to access external services.</p>
     * <h3>Credential types</h3>
     * <ul>
     * <li><code>apiKey</code>: <code>credentialMetadata</code> is a JSON string that contains only a non-empty <code>apiKey</code>. Do not submit <code>resourceScope</code> and <code>resourceRefs</code>.</li>
     * <li><code>mcpHeader</code>: <code>credentialMetadata</code> is a JSON string that contains a non-empty <code>headers</code> array. Each item contains a non-empty <code>name</code> and <code>value</code> to configure MCP request headers.</li>
     * </ul>
     * <h3>MCP header scope</h3>
     * <p>You must specify <code>resourceScope</code> when creating an <code>mcpHeader</code> credential:</p>
     * <ul>
     * <li><code>ALL</code>: Applies to all MCP services. Omit <code>resourceRefs</code>.</li>
     * <li><code>SPECIFIED</code>: Applies to specified MCP services. <code>resourceRefs</code> must be a non-empty array. For each item, set <code>resourceType=mcpServer</code> and specify <code>resourceId</code>.</li>
     * </ul>
     * <h3>Subsequent queries</h3>
     * <p>Use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListCredentials">ListCredentials</a> to query credentials. For <code>apiKey</code>, a masked value is returned. For <code>mcpHeader</code>, only header names are returned, and header values are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an apiKey or mcpHeader credential in a workspace for agents or MCP to access external services. The credential content is submitted as a JSON string, and masked results are returned when queried.</p>
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
     * <p>Creates an apiKey or mcpHeader credential in a workspace for agents or MCP to access external services.</p>
     * <h3>Credential types</h3>
     * <ul>
     * <li><code>apiKey</code>: <code>credentialMetadata</code> is a JSON string that contains only a non-empty <code>apiKey</code>. Do not submit <code>resourceScope</code> and <code>resourceRefs</code>.</li>
     * <li><code>mcpHeader</code>: <code>credentialMetadata</code> is a JSON string that contains a non-empty <code>headers</code> array. Each item contains a non-empty <code>name</code> and <code>value</code> to configure MCP request headers.</li>
     * </ul>
     * <h3>MCP header scope</h3>
     * <p>You must specify <code>resourceScope</code> when creating an <code>mcpHeader</code> credential:</p>
     * <ul>
     * <li><code>ALL</code>: Applies to all MCP services. Omit <code>resourceRefs</code>.</li>
     * <li><code>SPECIFIED</code>: Applies to specified MCP services. <code>resourceRefs</code> must be a non-empty array. For each item, set <code>resourceType=mcpServer</code> and specify <code>resourceId</code>.</li>
     * </ul>
     * <h3>Subsequent queries</h3>
     * <p>Use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListCredentials">ListCredentials</a> to query credentials. For <code>apiKey</code>, a masked value is returned. For <code>mcpHeader</code>, only header names are returned, and header values are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an apiKey or mcpHeader credential in a workspace for agents or MCP to access external services. The credential content is submitted as a JSON string, and masked results are returned when queried.</p>
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
     * <p>Deploys a user-provided code package or container image as an agent in a workspace. This corresponds to the &quot;Custom Code / Image&quot; creation method in the console.</p>
     * <h3>Preparations</h3>
     * <p>Prepare a writable workspace and submit name, roleArn, artifact, and runtime. In runtime, specify both compute and sessionPolicy. roleArn is the RAM role used by the agent to access your cloud resources.</p>
     * <h3>Select a deployment method</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Deployment method</th>
     * <th>Required configurations</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>ACR image</td>
     * <td>artifact.port, and type=acr, instanceId, namespace, repo, and tag in artifact.container.</td>
     * </tr>
     * <tr>
     * <td>Custom image</td>
     * <td>artifact.port, artifact.container.type=custom, and the complete customImage. The clientToken query parameter is required.</td>
     * </tr>
     * <tr>
     * <td>Code package</td>
     * <td>artifact.port, and sourceUri, languageRuntime, and entrypoint in artifact.code.</td>
     * </tr>
     * <tr>
     * <td>artifact.code and artifact.container are mutually exclusive. The service listening port ranges from 1 to 65535. You can specify a startup command for a container image by using artifact.container.entrypoint. If this parameter is omitted, the default startup method of the image is used.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Code package</h3>
     * <ul>
     * <li>ZIP and TAR.GZ formats are supported. The compressed package size ranges from 1 to 500,000,000 bytes. Dependencies must be included in the package. The platform does not install dependencies or perform online builds.</li>
     * <li>Invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListAgentCodeRuntimes">ListAgentCodeRuntimes</a> to query the currently active <code>languageRuntime</code>.</li>
     * <li>For local files, first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageUploadUrl">GetAgentCodePackageUploadUrl</a> and upload the file directly by using the upload method, URL, and request headers returned in the response. Then, commit <code>sourceUri</code>.</li>
     * <li><code>sourceUri</code> supports <code>oss://</code> URLs or HTTPS object URLs of standard OSS public domain names, including signed URLs. Private OSS objects must allow the workspace role to read them. You can first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageOssRamAuthorizeUrl">GetAgentCodePackageOssRamAuthorizeUrl</a> to complete the authorization.</li>
     * <li>Read permissions, objects, and sizes are checked upon commit, and a fixed copy is saved. If the transfer failed, the agent configuration is not created. Archive integrity and decompression are checked when the instance starts.</li>
     * <li><code>entrypoint</code> is the startup command executed in the <code>/code</code> folder, such as <code>python main.py</code>. The command does not automatically execute shell pipelines or expand environment variables. For complex startup logic, write a script in the package.
     * Sample request body for a code package (the runtime environment is subject to the query result):</li>
     * </ul>
     * <pre><code class="language-json">{
     *   &quot;name&quot;: &quot;code-agent&quot;,
     *   &quot;roleArn&quot;: &quot;acs:ram::1234567890123456:role/AgentRuntimeRole&quot;,
     *   &quot;artifact&quot;: {
     *     &quot;port&quot;: 8000,
     *     &quot;code&quot;: {
     *       &quot;sourceUri&quot;: &quot;oss://example-code-bucket/releases/agent.zip&quot;,
     *       &quot;languageRuntime&quot;: &quot;python3.12&quot;,
     *       &quot;entrypoint&quot;: &quot;python main.py&quot;
     *     }
     *   },
     *   &quot;runtime&quot;: {
     *     &quot;compute&quot;: {
     *       &quot;computeClass&quot;: &quot;STANDARD&quot;
     *     },
     *     &quot;sessionPolicy&quot;: {
     *       &quot;type&quot;: &quot;AFFINITY&quot;
     *     }
     *   }
     * }
     * </code></pre>
     * <h3>Custom image</h3>
     * <p>Specify the complete image address in customImage.image. Tags or digests are supported. Do not include protocols or user information. Configure the image pull network separately in customImage.pullNetwork:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Pull method</th>
     * <th>Configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Internet</td>
     * <td>type=public. Do not specify VPC fields.</td>
     * </tr>
     * <tr>
     * <td>VPC</td>
     * <td>type=vpc. Specify vpcId, vSwitchId, and securityGroupId.</td>
     * </tr>
     * <tr>
     * <td>If repository authentication is required, specify both customImage.username and customImage.password. For anonymous access, omit both. The password is not returned in the response. The image pull network and the agent runtime network are configured separately.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>useImageCache=true applies only to ACR images. For custom images and code packages, set this parameter to false or omit it.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Runtime configurations</h3>
     * <p>Omitted fields in runtime.hpa use the following default values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Valid values and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>enabled</td>
     * <td>false</td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td>minSandboxCount</td>
     * <td>1</td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td>maxSandboxCount</td>
     * <td>10</td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td>maxConcurrentSessionsPerSandbox</td>
     * <td>20</td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td>sessionTtlSeconds</td>
     * <td>600</td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If sessionPolicy.type=ISOLATED_HEADER_FIELD, you must provide a valid HTTP request header name in headerName. Do not specify this field for other policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If network is omitted, the default access policy on the agent side is used. Actual access is still restricted by the workspace network. When submitting access items, specify the corresponding enabled field.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The total number of items in ossMounts and agenticFsMounts cannot exceed 10. The mount target mountPath must be an absolute path in the container, such as /data/train. It cannot conflict with platform reserved directories, be duplicated, or form parent-child directory overrides.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>File mounts are used to allow the agent to access persistent data. When using AgenticFS, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a> to complete the access point authorization first.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The path for an OSS mount must be a non-empty directory prefix in the bucket. The server for an AgenticFS mount is the access point domain name, without a protocol, port, or path. The path must be an existing non-empty relative directory in the access point. You cannot mount the root directory of the access point. If readOnly is omitted, the default value is false.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Environment variable names must be non-empty and unique in the list. Values must be strings, and empty strings are allowed. When configuring healthCheck, you must specify port. Omitting the health check means no health check is configured. When configuring logging.sls, specify both non-empty project and logstore.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query results and retries</h3>
     * <p>A successful response indicates that the request is accepted. Save the agentId and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a>. Check latestVersionStatus, latestExecutionError, status, and sandboxPhaseCounts to confirm the configuration processing and instance status.
     * The clientToken query parameter is required for custom image submissions, and optional for ACR image and code package submissions. The token must be 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens. Reuse the original token to retry the same submission. If the parameters are the same, the existing acceptance result is returned. Use a new token for different submission content.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom code or image agent in a specified workspace, supports code package, ACR image, and custom image deployments, and executes the deployment asynchronously.</p>
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
     * <p>Deploys a user-provided code package or container image as an agent in a workspace. This corresponds to the &quot;Custom Code / Image&quot; creation method in the console.</p>
     * <h3>Preparations</h3>
     * <p>Prepare a writable workspace and submit name, roleArn, artifact, and runtime. In runtime, specify both compute and sessionPolicy. roleArn is the RAM role used by the agent to access your cloud resources.</p>
     * <h3>Select a deployment method</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Deployment method</th>
     * <th>Required configurations</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>ACR image</td>
     * <td>artifact.port, and type=acr, instanceId, namespace, repo, and tag in artifact.container.</td>
     * </tr>
     * <tr>
     * <td>Custom image</td>
     * <td>artifact.port, artifact.container.type=custom, and the complete customImage. The clientToken query parameter is required.</td>
     * </tr>
     * <tr>
     * <td>Code package</td>
     * <td>artifact.port, and sourceUri, languageRuntime, and entrypoint in artifact.code.</td>
     * </tr>
     * <tr>
     * <td>artifact.code and artifact.container are mutually exclusive. The service listening port ranges from 1 to 65535. You can specify a startup command for a container image by using artifact.container.entrypoint. If this parameter is omitted, the default startup method of the image is used.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Code package</h3>
     * <ul>
     * <li>ZIP and TAR.GZ formats are supported. The compressed package size ranges from 1 to 500,000,000 bytes. Dependencies must be included in the package. The platform does not install dependencies or perform online builds.</li>
     * <li>Invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListAgentCodeRuntimes">ListAgentCodeRuntimes</a> to query the currently active <code>languageRuntime</code>.</li>
     * <li>For local files, first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageUploadUrl">GetAgentCodePackageUploadUrl</a> and upload the file directly by using the upload method, URL, and request headers returned in the response. Then, commit <code>sourceUri</code>.</li>
     * <li><code>sourceUri</code> supports <code>oss://</code> URLs or HTTPS object URLs of standard OSS public domain names, including signed URLs. Private OSS objects must allow the workspace role to read them. You can first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageOssRamAuthorizeUrl">GetAgentCodePackageOssRamAuthorizeUrl</a> to complete the authorization.</li>
     * <li>Read permissions, objects, and sizes are checked upon commit, and a fixed copy is saved. If the transfer failed, the agent configuration is not created. Archive integrity and decompression are checked when the instance starts.</li>
     * <li><code>entrypoint</code> is the startup command executed in the <code>/code</code> folder, such as <code>python main.py</code>. The command does not automatically execute shell pipelines or expand environment variables. For complex startup logic, write a script in the package.
     * Sample request body for a code package (the runtime environment is subject to the query result):</li>
     * </ul>
     * <pre><code class="language-json">{
     *   &quot;name&quot;: &quot;code-agent&quot;,
     *   &quot;roleArn&quot;: &quot;acs:ram::1234567890123456:role/AgentRuntimeRole&quot;,
     *   &quot;artifact&quot;: {
     *     &quot;port&quot;: 8000,
     *     &quot;code&quot;: {
     *       &quot;sourceUri&quot;: &quot;oss://example-code-bucket/releases/agent.zip&quot;,
     *       &quot;languageRuntime&quot;: &quot;python3.12&quot;,
     *       &quot;entrypoint&quot;: &quot;python main.py&quot;
     *     }
     *   },
     *   &quot;runtime&quot;: {
     *     &quot;compute&quot;: {
     *       &quot;computeClass&quot;: &quot;STANDARD&quot;
     *     },
     *     &quot;sessionPolicy&quot;: {
     *       &quot;type&quot;: &quot;AFFINITY&quot;
     *     }
     *   }
     * }
     * </code></pre>
     * <h3>Custom image</h3>
     * <p>Specify the complete image address in customImage.image. Tags or digests are supported. Do not include protocols or user information. Configure the image pull network separately in customImage.pullNetwork:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Pull method</th>
     * <th>Configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Internet</td>
     * <td>type=public. Do not specify VPC fields.</td>
     * </tr>
     * <tr>
     * <td>VPC</td>
     * <td>type=vpc. Specify vpcId, vSwitchId, and securityGroupId.</td>
     * </tr>
     * <tr>
     * <td>If repository authentication is required, specify both customImage.username and customImage.password. For anonymous access, omit both. The password is not returned in the response. The image pull network and the agent runtime network are configured separately.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>useImageCache=true applies only to ACR images. For custom images and code packages, set this parameter to false or omit it.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Runtime configurations</h3>
     * <p>Omitted fields in runtime.hpa use the following default values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Valid values and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>enabled</td>
     * <td>false</td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td>minSandboxCount</td>
     * <td>1</td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td>maxSandboxCount</td>
     * <td>10</td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td>maxConcurrentSessionsPerSandbox</td>
     * <td>20</td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td>sessionTtlSeconds</td>
     * <td>600</td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If sessionPolicy.type=ISOLATED_HEADER_FIELD, you must provide a valid HTTP request header name in headerName. Do not specify this field for other policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If network is omitted, the default access policy on the agent side is used. Actual access is still restricted by the workspace network. When submitting access items, specify the corresponding enabled field.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The total number of items in ossMounts and agenticFsMounts cannot exceed 10. The mount target mountPath must be an absolute path in the container, such as /data/train. It cannot conflict with platform reserved directories, be duplicated, or form parent-child directory overrides.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>File mounts are used to allow the agent to access persistent data. When using AgenticFS, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a> to complete the access point authorization first.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The path for an OSS mount must be a non-empty directory prefix in the bucket. The server for an AgenticFS mount is the access point domain name, without a protocol, port, or path. The path must be an existing non-empty relative directory in the access point. You cannot mount the root directory of the access point. If readOnly is omitted, the default value is false.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Environment variable names must be non-empty and unique in the list. Values must be strings, and empty strings are allowed. When configuring healthCheck, you must specify port. Omitting the health check means no health check is configured. When configuring logging.sls, specify both non-empty project and logstore.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query results and retries</h3>
     * <p>A successful response indicates that the request is accepted. Save the agentId and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a>. Check latestVersionStatus, latestExecutionError, status, and sandboxPhaseCounts to confirm the configuration processing and instance status.
     * The clientToken query parameter is required for custom image submissions, and optional for ACR image and code package submissions. The token must be 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens. Reuse the original token to retry the same submission. If the parameters are the same, the existing acceptance result is returned. Use a new token for different submission content.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom code or image agent in a specified workspace, supports code package, ACR image, and custom image deployments, and executes the deployment asynchronously.</p>
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
     * <p>Registers an agent hosted in the user\&quot;s runtime environment, which corresponds to the &quot;Managed Agent&quot; in the console. After registration, you can continue to obtain the bootstrap information and complete the connection.</p>
     * <h3>Configure a managed agent</h3>
     * <p>Provide name, and select the configuration based on the model source:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>modelSource</th>
     * <th>Model configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>PLATFORM</td>
     * <td>Uses a platform model. Provide model.modelConnectionId and model.modelName.</td>
     * </tr>
     * <tr>
     * <td>RUNTIME</td>
     * <td>The model is managed by the external runtime environment. Do not submit model.</td>
     * </tr>
     * <tr>
     * <td>If modelSource is omitted but model is provided, it is processed as PLATFORM. If both are omitted, the agent cannot be created.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Configure instructions, MCP tools, and skills through instruction, tools, and skills. You can also reference an agent template through template.aiRegistry. The external process is deployed by the caller. This operation does not create a platform runtime instance.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Bootstrap sequence</h3>
     * <p><strong>Step 1:</strong> After creation, save the agentId and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a> to query the configuration processing result.
     * <strong>Step 2:</strong> After the latest configuration takes effect, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> to obtain the available bootstrap networks.
     * <strong>Step 3:</strong> Select an available network and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain the bootstrap token and CMS configuration. The external process then completes the bootstrap.
     * clientToken is a reserved query parameter and currently does not provide idempotency guarantees.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an agent that runs in an external environment, saves the configurations for the platform model, instructions, tools, and skills, and asynchronously processes the bootstrap configuration.</p>
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
     * <p>Registers an agent hosted in the user\&quot;s runtime environment, which corresponds to the &quot;Managed Agent&quot; in the console. After registration, you can continue to obtain the bootstrap information and complete the connection.</p>
     * <h3>Configure a managed agent</h3>
     * <p>Provide name, and select the configuration based on the model source:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>modelSource</th>
     * <th>Model configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>PLATFORM</td>
     * <td>Uses a platform model. Provide model.modelConnectionId and model.modelName.</td>
     * </tr>
     * <tr>
     * <td>RUNTIME</td>
     * <td>The model is managed by the external runtime environment. Do not submit model.</td>
     * </tr>
     * <tr>
     * <td>If modelSource is omitted but model is provided, it is processed as PLATFORM. If both are omitted, the agent cannot be created.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Configure instructions, MCP tools, and skills through instruction, tools, and skills. You can also reference an agent template through template.aiRegistry. The external process is deployed by the caller. This operation does not create a platform runtime instance.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Bootstrap sequence</h3>
     * <p><strong>Step 1:</strong> After creation, save the agentId and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a> to query the configuration processing result.
     * <strong>Step 2:</strong> After the latest configuration takes effect, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> to obtain the available bootstrap networks.
     * <strong>Step 3:</strong> Select an available network and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain the bootstrap token and CMS configuration. The external process then completes the bootstrap.
     * clientToken is a reserved query parameter and currently does not provide idempotency guarantees.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an agent that runs in an external environment, saves the configurations for the platform model, instructions, tools, and skills, and asynchronously processes the bootstrap configuration.</p>
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
     * <p>Issues an access token and connection configurations for a registered managed agent whose configurations have taken effect to complete the onboarding in the runtime environment where the agent resides.</p>
     * <h3>Prerequisites and parameters</h3>
     * <p>The managed agent must be in the running state, and its latest configurations must have taken effect. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> first to query available networks.
     * The <code>networkType</code> parameter is passed as a query parameter. Valid values: <code>INTRANET</code> (internal network) and <code>INTERNET</code> (Internet). The selected endpoint must be available.</p>
     * <h3>Use the response</h3>
     * <p>Pass the <code>bootstrapToken</code> to the external runtime process to complete the onboarding. The <code>tokenFingerprint</code> is used to identify the token and cannot be used as a substitute for the token. The <code>cms</code> field contains the observability reporting configurations for the corresponding network. Configure the endpoint, workspace, and license key as provided in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues an access token for a specified network to a managed agent with effective configurations and returns the CMS configuration.</p>
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
     * <p>Issues an access token and connection configurations for a registered managed agent whose configurations have taken effect to complete the onboarding in the runtime environment where the agent resides.</p>
     * <h3>Prerequisites and parameters</h3>
     * <p>The managed agent must be in the running state, and its latest configurations must have taken effect. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> first to query available networks.
     * The <code>networkType</code> parameter is passed as a query parameter. Valid values: <code>INTRANET</code> (internal network) and <code>INTERNET</code> (Internet). The selected endpoint must be available.</p>
     * <h3>Use the response</h3>
     * <p>Pass the <code>bootstrapToken</code> to the external runtime process to complete the onboarding. The <code>tokenFingerprint</code> is used to identify the token and cannot be used as a substitute for the token. The <code>cms</code> field contains the observability reporting configurations for the corresponding network. Configure the endpoint, workspace, and license key as provided in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues an access token for a specified network to a managed agent with effective configurations and returns the CMS configuration.</p>
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
     * <p>Integrates an enterprise identity source with a workspace to allow application users to log on with enterprise accounts, or to synchronize users from the enterprise address book to the workspace.
     * DingTalk, Lark, and custom identity sources (CustomSSO) are supported. A workspace can be bound to only one identity source. To change the integration method, you must unbind the current identity source first.</p>
     * <h3>Select an integration method</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Integration method</th>
     * <th>Scenario</th>
     * <th>Task completed by this operation</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>DingTalk or Lark</td>
     * <td>The enterprise already uses DingTalk or Lark and wants to integrate enterprise accounts and the address book.</td>
     * <td>Saves the enterprise application credentials and establishes a binding for subsequent logon and address book synchronization configuration.</td>
     * </tr>
     * <tr>
     * <td>Custom identity source (CustomSSO)</td>
     * <td>The enterprise wants to integrate its own identity authentication and user management system.</td>
     * <td>Creates a shared user pool to prepare for subsequent SAML single sign-on (SSO) and SCIM user synchronization configuration.</td>
     * </tr>
     * <tr>
     * <td>A user pool stores application users and identity integration configurations. SAML handles enterprise account logon. SCIM provisions users from the enterprise identity system to the user pool. You can configure these two capabilities separately.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Bind DingTalk or Lark</h3>
     * <p>Specify the enterprise application credentials in metadata. DingTalk requires appKey, appSecret, and corpId. Lark requires appId and appSecret.
     * Logon is enabled by default. A user synchronization task is executed by default upon the first binding. If you want to select departments before synchronization, set syncOnBind to false.
     * Subsequent address book change synchronization is controlled by syncEnabled, which is disabled by default. When enabled, you must also provide encryptKey and verificationToken.</p>
     * <h3>Bind a custom identity source</h3>
     * <p>When you create a CustomSSO binding, you only need to specify the identity source type:</p>
     * <pre><code class="language-http">POST /workspaces/{workspaceId}/identity-providers
     * {&quot;identityProviderType&quot;:&quot;CustomSSO&quot;}
     * </code></pre>
     * <p>This call only creates a user pool. Logon and user synchronization are disabled by default. Do not specify metadata, loginEnabled, or syncEnabled during creation.
     * After creation, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to query the progress. If WAITING_CONFIGURATION is returned, the user pool is created and you can proceed with the integration configuration:</p>
     * <ul>
     * <li><strong>Integrate enterprise account logon</strong>: Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the SAML integration information of AgentCore and configure it in the enterprise identity system. Then, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> to save the SAML configuration of the enterprise identity system and enable logon as needed.</li>
     * <li><strong>Integrate user synchronization</strong>: Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to obtain the SCIM receiving endpoint and credentials, and configure them in the enterprise identity system. After the external configuration is complete, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a> to enable AgentCore user synchronization.
     * The two processes are independent. You can select one or both based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an external identity provider such as DingTalk, Lark, or a custom identity source to a workspace for enterprise account logon and user synchronization.</p>
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
     * <p>Integrates an enterprise identity source with a workspace to allow application users to log on with enterprise accounts, or to synchronize users from the enterprise address book to the workspace.
     * DingTalk, Lark, and custom identity sources (CustomSSO) are supported. A workspace can be bound to only one identity source. To change the integration method, you must unbind the current identity source first.</p>
     * <h3>Select an integration method</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Integration method</th>
     * <th>Scenario</th>
     * <th>Task completed by this operation</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>DingTalk or Lark</td>
     * <td>The enterprise already uses DingTalk or Lark and wants to integrate enterprise accounts and the address book.</td>
     * <td>Saves the enterprise application credentials and establishes a binding for subsequent logon and address book synchronization configuration.</td>
     * </tr>
     * <tr>
     * <td>Custom identity source (CustomSSO)</td>
     * <td>The enterprise wants to integrate its own identity authentication and user management system.</td>
     * <td>Creates a shared user pool to prepare for subsequent SAML single sign-on (SSO) and SCIM user synchronization configuration.</td>
     * </tr>
     * <tr>
     * <td>A user pool stores application users and identity integration configurations. SAML handles enterprise account logon. SCIM provisions users from the enterprise identity system to the user pool. You can configure these two capabilities separately.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Bind DingTalk or Lark</h3>
     * <p>Specify the enterprise application credentials in metadata. DingTalk requires appKey, appSecret, and corpId. Lark requires appId and appSecret.
     * Logon is enabled by default. A user synchronization task is executed by default upon the first binding. If you want to select departments before synchronization, set syncOnBind to false.
     * Subsequent address book change synchronization is controlled by syncEnabled, which is disabled by default. When enabled, you must also provide encryptKey and verificationToken.</p>
     * <h3>Bind a custom identity source</h3>
     * <p>When you create a CustomSSO binding, you only need to specify the identity source type:</p>
     * <pre><code class="language-http">POST /workspaces/{workspaceId}/identity-providers
     * {&quot;identityProviderType&quot;:&quot;CustomSSO&quot;}
     * </code></pre>
     * <p>This call only creates a user pool. Logon and user synchronization are disabled by default. Do not specify metadata, loginEnabled, or syncEnabled during creation.
     * After creation, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to query the progress. If WAITING_CONFIGURATION is returned, the user pool is created and you can proceed with the integration configuration:</p>
     * <ul>
     * <li><strong>Integrate enterprise account logon</strong>: Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the SAML integration information of AgentCore and configure it in the enterprise identity system. Then, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> to save the SAML configuration of the enterprise identity system and enable logon as needed.</li>
     * <li><strong>Integrate user synchronization</strong>: Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to obtain the SCIM receiving endpoint and credentials, and configure them in the enterprise identity system. After the external configuration is complete, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a> to enable AgentCore user synchronization.
     * The two processes are independent. You can select one or both based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an external identity provider such as DingTalk, Lark, or a custom identity source to a workspace for enterprise account logon and user synchronization.</p>
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
     * <p>Creates a SCIM access token to authorize an enterprise identity system to send user provisioning requests to AgentCore. For example, when you plan to replace the token used by the enterprise identity system, you can create a new token first and revoke the old token after the switchover is complete.
     * SCIM is a user provisioning protocol through which an enterprise identity system sends user information by using a receiving endpoint and an access token.</p>
     * <h3>Before you begin</h3>
     * <p>A <code>CustomSSO</code> binding is created, and the SCIM receiving endpoint is enabled by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a>.
     * A maximum of two SCIM credentials can be retained in the same user pool. When the limit is reached, query existing credentials by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderSCIMCredentials">ListIdentityProviderSCIMCredentials</a> and revoke the credentials that are no longer in use.</p>
     * <h3>What to do next</h3>
     * <p><strong>Step 1:</strong> Save the plaintext of the <code>token</code> in the response. The token is returned only upon creation. You can only query the credential summary later.
     * <strong>Step 2:</strong> Configure the receiving endpoint and the new token in the enterprise identity system.
     * <strong>Step 3:</strong> After you confirm that the enterprise identity system uses the new token, revoke the old token by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteIdentityProviderSCIMCredential">DeleteIdentityProviderSCIMCredential</a> as needed.
     * If the creation response is lost, query the credential list to verify the creation result to avoid duplicate creation and occupying the credential quota. The user synchronization switch is configured separately by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Explicitly issues a SCIM credential and returns the plaintext token only in the current response. A maximum of two credentials can exist in the same pool. This operation does not automatically revoke old credentials or enable AC user synchronization.</p>
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
     * <p>Creates a SCIM access token to authorize an enterprise identity system to send user provisioning requests to AgentCore. For example, when you plan to replace the token used by the enterprise identity system, you can create a new token first and revoke the old token after the switchover is complete.
     * SCIM is a user provisioning protocol through which an enterprise identity system sends user information by using a receiving endpoint and an access token.</p>
     * <h3>Before you begin</h3>
     * <p>A <code>CustomSSO</code> binding is created, and the SCIM receiving endpoint is enabled by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a>.
     * A maximum of two SCIM credentials can be retained in the same user pool. When the limit is reached, query existing credentials by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderSCIMCredentials">ListIdentityProviderSCIMCredentials</a> and revoke the credentials that are no longer in use.</p>
     * <h3>What to do next</h3>
     * <p><strong>Step 1:</strong> Save the plaintext of the <code>token</code> in the response. The token is returned only upon creation. You can only query the credential summary later.
     * <strong>Step 2:</strong> Configure the receiving endpoint and the new token in the enterprise identity system.
     * <strong>Step 3:</strong> After you confirm that the enterprise identity system uses the new token, revoke the old token by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteIdentityProviderSCIMCredential">DeleteIdentityProviderSCIMCredential</a> as needed.
     * If the creation response is lost, query the credential list to verify the creation result to avoid duplicate creation and occupying the credential quota. The user synchronization switch is configured separately by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Explicitly issues a SCIM credential and returns the plaintext token only in the current response. A maximum of two credentials can exist in the same pool. This operation does not automatically revoke old credentials or enable AC user synchronization.</p>
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
     * <p>Synchronizes users from an enterprise identity provider to a workspace based on the saved department scope. This is suitable for importing users for the first time or manually updating workspace users after adjusting the synchronization scope.</p>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The identity provider is configured and its status is <code>READY</code>. If the previous synchronization failed and the status is <code>SYNC_FAILED</code>, you can also re-initiate it.</li>
     * <li>The user pool is ready, and no identity provider operations are in progress.</li>
     * <li>Manual synchronization uses the saved <code>syncScope</code>. You do not need to enable <code>syncEnabled</code>, which is used for subsequent address book change synchronization.</li>
     * </ul>
     * <h3>Steps for synchronizing by department</h3>
     * <p><strong>Step 1:</strong> Query departments by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a> and select the scope to synchronize.
     * <strong>Step 2:</strong> Save the <code>syncScope</code> by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to wait for the configuration processing to complete.
     * <strong>Step 3:</strong> Call this operation to initiate the synchronization and save the returned <code>taskId</code>.
     * <strong>Step 4:</strong> Query the progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSyncJob">GetIdentityProviderSyncJob</a>. After the synchronization is complete, view the workspace user list.
     * If you want to select departments before the initial synchronization, set <code>syncOnBind=false</code> when creating the identity provider, and then perform the preceding steps.</p>
     * <h3>Synchronization results and re-execution</h3>
     * <p>Synchronization is subject to the maximum number of users allowed in the workspace. Narrowing the synchronization scope does not actively delete users that have already been synchronized.
     * Each successful initiation creates a new synchronization task. If a request times out or the response is lost, check the identity provider status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> before deciding whether to resubmit the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a manual synchronization for an identity provider.</p>
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
     * <p>Synchronizes users from an enterprise identity provider to a workspace based on the saved department scope. This is suitable for importing users for the first time or manually updating workspace users after adjusting the synchronization scope.</p>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The identity provider is configured and its status is <code>READY</code>. If the previous synchronization failed and the status is <code>SYNC_FAILED</code>, you can also re-initiate it.</li>
     * <li>The user pool is ready, and no identity provider operations are in progress.</li>
     * <li>Manual synchronization uses the saved <code>syncScope</code>. You do not need to enable <code>syncEnabled</code>, which is used for subsequent address book change synchronization.</li>
     * </ul>
     * <h3>Steps for synchronizing by department</h3>
     * <p><strong>Step 1:</strong> Query departments by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a> and select the scope to synchronize.
     * <strong>Step 2:</strong> Save the <code>syncScope</code> by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to wait for the configuration processing to complete.
     * <strong>Step 3:</strong> Call this operation to initiate the synchronization and save the returned <code>taskId</code>.
     * <strong>Step 4:</strong> Query the progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSyncJob">GetIdentityProviderSyncJob</a>. After the synchronization is complete, view the workspace user list.
     * If you want to select departments before the initial synchronization, set <code>syncOnBind=false</code> when creating the identity provider, and then perform the preceding steps.</p>
     * <h3>Synchronization results and re-execution</h3>
     * <p>Synchronization is subject to the maximum number of users allowed in the workspace. Narrowing the synchronization scope does not actively delete users that have already been synchronized.
     * Each successful initiation creates a new synchronization task. If a request times out or the response is lost, check the identity provider status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> before deciding whether to resubmit the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a manual synchronization for an identity provider.</p>
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
     * <p>Pre-builds or reuses an ACR Enterprise Edition image cache for custom code or image agents for subsequent deployment and startup.</p>
     * <h3>Request parameters</h3>
     * <p><code>regionId</code>, <code>workspaceId</code>, and <code>clientToken</code> are passed as query parameters. The region must match the entry endpoint and the workspace.
     * Specify <code>acrInstanceId</code>, <code>namespace</code>, <code>repository</code>, and <code>tag</code> in the JSON request body. For <code>repository</code>, specify only the repository name without repeating the namespace. The source repository must have pull authorization for the workspace resource role. You can obtain the authorization URL by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAcrRamAuthorizeUrl">GetWorkspaceAcrRamAuthorizeUrl</a>.</p>
     * <h3>Transfer network</h3>
     * <p>Both <code>accessInternet</code> and <code>accessVpc</code> must be provided, and at least one must be set to <code>true</code>. The server validates this based on the workspace network conditions. These parameters control the source reading and transfer for the current operation and do not modify the runtime network of the agent.</p>
     * <h3>Acceptance and readiness</h3>
     * <p>A successful response returns the current cache snapshot. <code>PENDING</code> indicates that the cache is being prepared, <code>READY</code> indicates that the cache is ready, and <code>FAILED</code> indicates a failure. For failures, check the <code>error</code> field. Save the <code>imageId</code> and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a> to query subsequent results. If the image digest has not been parsed, <code>digest</code> may be empty.
     * Currently, <code>clientToken</code> is only validated to ensure it is not empty. It does not guarantee deduplication by identifier or recovery of the original acceptance result. If the result is not confirmed, query the existing cache first.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or reuses a cache for an ACR Enterprise Edition image in a workspace, and returns the cache status upon acceptance.</p>
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
     * <p>Pre-builds or reuses an ACR Enterprise Edition image cache for custom code or image agents for subsequent deployment and startup.</p>
     * <h3>Request parameters</h3>
     * <p><code>regionId</code>, <code>workspaceId</code>, and <code>clientToken</code> are passed as query parameters. The region must match the entry endpoint and the workspace.
     * Specify <code>acrInstanceId</code>, <code>namespace</code>, <code>repository</code>, and <code>tag</code> in the JSON request body. For <code>repository</code>, specify only the repository name without repeating the namespace. The source repository must have pull authorization for the workspace resource role. You can obtain the authorization URL by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAcrRamAuthorizeUrl">GetWorkspaceAcrRamAuthorizeUrl</a>.</p>
     * <h3>Transfer network</h3>
     * <p>Both <code>accessInternet</code> and <code>accessVpc</code> must be provided, and at least one must be set to <code>true</code>. The server validates this based on the workspace network conditions. These parameters control the source reading and transfer for the current operation and do not modify the runtime network of the agent.</p>
     * <h3>Acceptance and readiness</h3>
     * <p>A successful response returns the current cache snapshot. <code>PENDING</code> indicates that the cache is being prepared, <code>READY</code> indicates that the cache is ready, and <code>FAILED</code> indicates a failure. For failures, check the <code>error</code> field. Save the <code>imageId</code> and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a> to query subsequent results. If the image digest has not been parsed, <code>digest</code> may be empty.
     * Currently, <code>clientToken</code> is only validated to ensure it is not empty. It does not guarantee deduplication by identifier or recovery of the original acceptance result. If the result is not confirmed, query the existing cache first.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or reuses a cache for an ACR Enterprise Edition image in a workspace, and returns the cache status upon acceptance.</p>
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
     * <b>description</b> :
     * <p>Creates an agent by using a platform-managed runtime framework. This corresponds to the &quot;Managed Harness&quot; creation method in the console, where you can configure models, instructions, and skills.</p>
     * <h3>Required configurations</h3>
     * <p>Submit <code>name</code>, <code>model</code>, and <code>runtime</code>. The <code>runtime</code> parameter must include both <code>compute</code> and <code>sessionPolicy</code>. The agent is deployed and run by the platform. You do not need to provide a code package or container image.</p>
     * <h3>Harness and model</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Harness</th>
     * <th>Model and connector configurations</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>qwenpaw</code></td>
     * <td>If you omit <code>harness</code> during creation, this type is used by default. Set <code>model.modelConnectionId</code> to the workspace model connection ID, and set <code>model.modelName</code> to the name of the model created under this connection.</td>
     * </tr>
     * <tr>
     * <td><code>qodercli</code></td>
     * <td>The qodercli connector must be enabled in the workspace. Set <code>model.modelConnectionId</code> to the model identifier returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectorModels">ListConnectorModels</a>. You can omit <code>model.modelName</code>.</td>
     * </tr>
     * <tr>
     * <td><code>harness</code> is an object, such as <code>{&quot;type&quot;:&quot;qwenpaw&quot;}</code>. For qodercli, set <code>harness.configuration.connectorServiceAccountKey</code> to the account key record ID returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectors">ListConnectors</a>, not the original service account key. You can omit this parameter if only one key record exists. You must specify this parameter if multiple records exist. <code>connectorServiceAccountName</code> is the account name. Do not specify these two binding fields for qwenpaw.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The harness type cannot be changed after creation.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Instructions, templates, and skills</h3>
     * <p><code>skills</code> uses the skill names in the workspace AI registry. If <code>sourceType=REFERENCE</code>, versions are referenced by <code>versionSelector</code>: use <code>LABEL</code> with a label name, or <code>VERSION</code> with a specific version number. If the selector is omitted, <code>LABEL/latest</code> is used. If <code>sourceType=STATIC</code>, static files bundled with the package are used, and no version selector is provided.
     * <code>template.aiRegistry</code> specifies the agent template name and an optional version. If you omit the version during creation, the published version is resolved and fixed. When a template is used, <code>instruction</code>, <code>promptVariables</code>, and <code>subAgents</code> are derived from the template, and the corresponding fields in the current request do not take effect. Explicit skills and template skills are recorded separately. You can query the target and effective versions by using <code>configuredSkills</code> and <code>skills</code>.
     * If you do not use a template, you can set instructions by using <code>instruction</code>, declare variables by using <code>promptVariables</code>, and configure up to 20 sub-agents by using <code>subAgents</code>. The name and instruction of a sub-agent cannot be empty. Each sub-agent must have a unique name. Tools currently use <code>tools[].type=MCP</code>.</p>
     * <h3>Runtime configurations and mounts</h3>
     * <p>Omitted fields in <code>runtime.hpa</code> use the following default values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Valid values and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If <code>sessionPolicy.type=ISOLATED_HEADER_FIELD</code>, you must provide <code>headerName</code>. Do not specify this parameter for other policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If you provide <code>network</code>, you must specify both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code>. Actual access is restricted by the workspace network configurations.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. The mount target <code>mountPath</code> uses an absolute path in the container, such as <code>/data/train</code>. The path cannot conflict with platform-reserved directories, and mount targets cannot be duplicated or form parent-child directory overwrites.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>File mounts are used to allow the agent to access persistent data. When you use AgenticFS, you can first complete the access point authorization by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The <code>path</code> for an OSS mount must be a non-empty directory prefix in a bucket. The <code>server</code> for an AgenticFS mount is the access point domain name, without a protocol, port, or path. The <code>path</code> is an existing non-empty relative directory in the access point. You cannot mount the root directory of the access point. If <code>readOnly</code> is omitted, the default value is <code>false</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>environment.variables</code> configures environment variables, and <code>environment.credentialReferences</code> references workspace credentials. Environment variable names must be non-empty and unique, and values must be strings.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query deployment results</h3>
     * <p>A successful response indicates that the request is accepted. Save the <code>agentId</code> and use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query <code>latestVersionStatus</code>, <code>status</code>, and <code>sandboxPhaseCounts</code> to confirm the configuration processing and instance status. <code>clientToken</code> is a reserved query parameter and does not provide idempotency guarantees.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a managed Harness agent in a specified workspace, configures the harness, model, skills, and runtime resources, and deploys the agent asynchronously.</p>
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
     * <b>description</b> :
     * <p>Creates an agent by using a platform-managed runtime framework. This corresponds to the &quot;Managed Harness&quot; creation method in the console, where you can configure models, instructions, and skills.</p>
     * <h3>Required configurations</h3>
     * <p>Submit <code>name</code>, <code>model</code>, and <code>runtime</code>. The <code>runtime</code> parameter must include both <code>compute</code> and <code>sessionPolicy</code>. The agent is deployed and run by the platform. You do not need to provide a code package or container image.</p>
     * <h3>Harness and model</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Harness</th>
     * <th>Model and connector configurations</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>qwenpaw</code></td>
     * <td>If you omit <code>harness</code> during creation, this type is used by default. Set <code>model.modelConnectionId</code> to the workspace model connection ID, and set <code>model.modelName</code> to the name of the model created under this connection.</td>
     * </tr>
     * <tr>
     * <td><code>qodercli</code></td>
     * <td>The qodercli connector must be enabled in the workspace. Set <code>model.modelConnectionId</code> to the model identifier returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectorModels">ListConnectorModels</a>. You can omit <code>model.modelName</code>.</td>
     * </tr>
     * <tr>
     * <td><code>harness</code> is an object, such as <code>{&quot;type&quot;:&quot;qwenpaw&quot;}</code>. For qodercli, set <code>harness.configuration.connectorServiceAccountKey</code> to the account key record ID returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectors">ListConnectors</a>, not the original service account key. You can omit this parameter if only one key record exists. You must specify this parameter if multiple records exist. <code>connectorServiceAccountName</code> is the account name. Do not specify these two binding fields for qwenpaw.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The harness type cannot be changed after creation.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Instructions, templates, and skills</h3>
     * <p><code>skills</code> uses the skill names in the workspace AI registry. If <code>sourceType=REFERENCE</code>, versions are referenced by <code>versionSelector</code>: use <code>LABEL</code> with a label name, or <code>VERSION</code> with a specific version number. If the selector is omitted, <code>LABEL/latest</code> is used. If <code>sourceType=STATIC</code>, static files bundled with the package are used, and no version selector is provided.
     * <code>template.aiRegistry</code> specifies the agent template name and an optional version. If you omit the version during creation, the published version is resolved and fixed. When a template is used, <code>instruction</code>, <code>promptVariables</code>, and <code>subAgents</code> are derived from the template, and the corresponding fields in the current request do not take effect. Explicit skills and template skills are recorded separately. You can query the target and effective versions by using <code>configuredSkills</code> and <code>skills</code>.
     * If you do not use a template, you can set instructions by using <code>instruction</code>, declare variables by using <code>promptVariables</code>, and configure up to 20 sub-agents by using <code>subAgents</code>. The name and instruction of a sub-agent cannot be empty. Each sub-agent must have a unique name. Tools currently use <code>tools[].type=MCP</code>.</p>
     * <h3>Runtime configurations and mounts</h3>
     * <p>Omitted fields in <code>runtime.hpa</code> use the following default values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Valid values and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If <code>sessionPolicy.type=ISOLATED_HEADER_FIELD</code>, you must provide <code>headerName</code>. Do not specify this parameter for other policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If you provide <code>network</code>, you must specify both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code>. Actual access is restricted by the workspace network configurations.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. The mount target <code>mountPath</code> uses an absolute path in the container, such as <code>/data/train</code>. The path cannot conflict with platform-reserved directories, and mount targets cannot be duplicated or form parent-child directory overwrites.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>File mounts are used to allow the agent to access persistent data. When you use AgenticFS, you can first complete the access point authorization by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The <code>path</code> for an OSS mount must be a non-empty directory prefix in a bucket. The <code>server</code> for an AgenticFS mount is the access point domain name, without a protocol, port, or path. The <code>path</code> is an existing non-empty relative directory in the access point. You cannot mount the root directory of the access point. If <code>readOnly</code> is omitted, the default value is <code>false</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>environment.variables</code> configures environment variables, and <code>environment.credentialReferences</code> references workspace credentials. Environment variable names must be non-empty and unique, and values must be strings.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query deployment results</h3>
     * <p>A successful response indicates that the request is accepted. Save the <code>agentId</code> and use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query <code>latestVersionStatus</code>, <code>status</code>, and <code>sandboxPhaseCounts</code> to confirm the configuration processing and instance status. <code>clientToken</code> is a reserved query parameter and does not provide idempotency guarantees.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a managed Harness agent in a specified workspace, configures the harness, model, skills, and runtime resources, and deploys the agent asynchronously.</p>
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
     * <p>Creates an MCP service in a workspace for agents to use the tools provided by the service.
     * The creation process is executed asynchronously. After you submit the request, call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> operation to check whether the service is ready.
     * To deploy the service by using a local code package, first call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcpCodePackageUploadUrl">GetMcpCodePackageUploadUrl</a> operation to obtain the upload URL and upload the file. Then, fill in the returned code package token in the deployment configuration.
     * The <code>clientToken</code> parameter does not provide idempotency guarantees. If the request result is not confirmed, query existing services before you decide whether to recreate the service.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an MCP service in a specified workspace. The creation process is asynchronous. You can check whether the service is ready by using the returned status or a query operation.</p>
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
     * <p>Creates an MCP service in a workspace for agents to use the tools provided by the service.
     * The creation process is executed asynchronously. After you submit the request, call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> operation to check whether the service is ready.
     * To deploy the service by using a local code package, first call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcpCodePackageUploadUrl">GetMcpCodePackageUploadUrl</a> operation to obtain the upload URL and upload the file. Then, fill in the returned code package token in the deployment configuration.
     * The <code>clientToken</code> parameter does not provide idempotency guarantees. If the request result is not confirmed, query existing services before you decide whether to recreate the service.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an MCP service in a specified workspace. The creation process is asynchronous. You can check whether the service is ready by using the returned status or a query operation.</p>
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
     * <p>Creates a long-term memory store (MemoryStore) in a workspace to organize the long-term memories of an agent and their source sessions.
     * After creation, you can write messages or text by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/AddMemories">AddMemories</a> and retrieve memories by semantics by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/SearchMemories">SearchMemories</a>.</p>
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
     * <p>Creates a long-term memory store (MemoryStore) in a workspace to organize the long-term memories of an agent and their source sessions.
     * After creation, you can write messages or text by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/AddMemories">AddMemories</a> and retrieve memories by semantics by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/SearchMemories">SearchMemories</a>.</p>
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
     * <b>description</b> :
     * <p>Creates a model configuration under a model connection in a workspace for model creation, allowing an agent to select and invoke the model.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model configuration under a model connection in a specified workspace for model creation.</p>
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
     * <b>description</b> :
     * <p>Creates a model configuration under a model connection in a workspace for model creation, allowing an agent to select and invoke the model.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model configuration under a model connection in a specified workspace for model creation.</p>
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
     * <b>description</b> :
     * <p>Creates a model connection in a specified workspace and configures the upstream model service address, invoke protocol, and access credentials for model creation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model connection in a specified workspace and configures the upstream model service address, invoke protocol, and access credentials for model creation.</p>
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
     * <b>description</b> :
     * <p>Creates a model connection in a specified workspace and configures the upstream model service address, invoke protocol, and access credentials for model creation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model connection in a specified workspace and configures the upstream model service address, invoke protocol, and access credentials for model creation.</p>
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
     * <p>Creates access rules in batches for specified resources in a workspace to define which users or agents can or cannot access the resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates permission rules.</p>
     * 
     * @param tmpReq CreatePermissionRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePermissionRulesResponse
     */
    public CreatePermissionRulesResponse createPermissionRulesWithOptions(String workspaceId, CreatePermissionRulesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePermissionRulesShrinkRequest request = new CreatePermissionRulesShrinkRequest();
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
            new TeaPair("action", "CreatePermissionRules"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/permission-rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePermissionRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates access rules in batches for specified resources in a workspace to define which users or agents can or cannot access the resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates permission rules.</p>
     * 
     * @param request CreatePermissionRulesRequest
     * @return CreatePermissionRulesResponse
     */
    public CreatePermissionRulesResponse createPermissionRules(String workspaceId, CreatePermissionRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPermissionRulesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a skill and its draft in a workspace for editing skill instructions and related resources. You can derive the draft from an existing version, or specify a target version and a commit message.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a skill in a specified workspace and generates an editable draft version. You can derive the draft from an existing version, or specify a target version and a commit message.</p>
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
     * <p>Creates a skill and its draft in a workspace for editing skill instructions and related resources. You can derive the draft from an existing version, or specify a target version and a commit message.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a skill in a specified workspace and generates an editable draft version. You can derive the draft from an existing version, or specify a target version and a commit message.</p>
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
     * <b>description</b> :
     * <p>Creates a team in a specified workspace and configures user members and agent members at the same time.</p>
     * 
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
     * <b>description</b> :
     * <p>Creates a team in a specified workspace and configures user members and agent members at the same time.</p>
     * 
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
     * <b>description</b> :
     * <p>Creates a user in a workspace for member collaboration and application access, which is used when configuring team members and user logons.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user in a specified workspace. The username must be unique within the workspace, can contain only lowercase letters, digits, and hyphens, and cannot be a reserved name such as manager, admin, or any name starting with worker-. If the password is not specified, the server generates an initial password and returns it in the initialPassword field of the response.</p>
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
     * <b>description</b> :
     * <p>Creates a user in a workspace for member collaboration and application access, which is used when configuring team members and user logons.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user in a specified workspace. The username must be unique within the workspace, can contain only lowercase letters, digits, and hyphens, and cannot be a reserved name such as manager, admin, or any name starting with worker-. If the password is not specified, the server generates an initial password and returns it in the initialPassword field of the response.</p>
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
     * <p>Creates an AgentCore workspace as a resource scope for organizing agents, models, Model Context Protocol (MCP) services, and collaboration configurations.
     * After the workspace is created, you can use the returned workspace ID to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspace">GetWorkspace</a> to query the details, and then manage agents and associated resources in the workspace. For network configuration fields and their dependencies, see the request parameters table.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentCore workspace as a resource scope for organizing agents, models, Model Context Protocol (MCP) services, and collaboration configurations.</p>
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
     * <p>Creates an AgentCore workspace as a resource scope for organizing agents, models, Model Context Protocol (MCP) services, and collaboration configurations.
     * After the workspace is created, you can use the returned workspace ID to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspace">GetWorkspace</a> to query the details, and then manage agents and associated resources in the workspace. For network configuration fields and their dependencies, see the request parameters table.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentCore workspace as a resource scope for organizing agents, models, Model Context Protocol (MCP) services, and collaboration configurations.</p>
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
     * <b>description</b> :
     * <p>Invokes a specified model through a published model connection to verify whether the model invocation pipeline is available.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a specified model through a published model connection to verify whether the model invocation pipeline is available.</p>
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
     * <b>description</b> :
     * <p>Invokes a specified model through a published model connection to verify whether the model invocation pipeline is available.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a specified model through a published model connection to verify whether the model invocation pipeline is available.</p>
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
     * <p>Deletes a specified access application and removes the access configuration of the application from the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access application.</p>
     * 
     * @param request DeleteAccessApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessApplicationResponse
     */
    public DeleteAccessApplicationResponse deleteAccessApplicationWithOptions(String workspaceId, String applicationId, DeleteAccessApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessApplication"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/access-applications/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified access application and removes the access configuration of the application from the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access application.</p>
     * 
     * @param request DeleteAccessApplicationRequest
     * @return DeleteAccessApplicationResponse
     */
    public DeleteAccessApplicationResponse deleteAccessApplication(String workspaceId, String applicationId, DeleteAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAccessApplicationWithOptions(workspaceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the IM channel of a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the IM channel of a specified agent.</p>
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
     * <p>Deletes the IM channel of a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the IM channel of a specified agent.</p>
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
     * <p>Deletes the specified agent template and all its versions and metadata.
     * This operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified AgentSpec and all its versions and metadata. This operation is irreversible.</p>
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
     * <p>Deletes the specified agent template and all its versions and metadata.
     * This operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified AgentSpec and all its versions and metadata. This operation is irreversible.</p>
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
     * <p>Deletes the draft version of the agent template (AgentSpec) that is currently being edited.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version of the specified AgentSpec that is currently being edited and clears the draft version pointer.</p>
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
     * <p>Deletes the draft version of the agent template (AgentSpec) that is currently being edited.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version of the specified AgentSpec that is currently being edited and clears the draft version pointer.</p>
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
     * <p>Deletes a saved fixed version of a specified managed or custom agent. You cannot delete versions that are still referenced by service endpoints or the system-maintained latest version.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a saved fixed version of a specified managed or custom agent.</p>
     * 
     * @param request DeleteAgentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentVersionResponse
     */
    public DeleteAgentVersionResponse deleteAgentVersionWithOptions(String workspaceId, String agentId, String agentVersion, DeleteAgentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteAgentVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(agentVersion) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a saved fixed version of a specified managed or custom agent. You cannot delete versions that are still referenced by service endpoints or the system-maintained latest version.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a saved fixed version of a specified managed or custom agent.</p>
     * 
     * @param request DeleteAgentVersionRequest
     * @return DeleteAgentVersionResponse
     */
    public DeleteAgentVersionResponse deleteAgentVersion(String workspaceId, String agentId, String agentVersion, DeleteAgentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentVersionWithOptions(workspaceId, agentId, agentVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an access credential that is no longer used in a workspace.
     * If the credential is still bound to an MCP service, dissociate it before deletion.</p>
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
     * <p>Deletes an access credential that is no longer used in a workspace.
     * If the credential is still bound to an MCP service, dissociate it before deletion.</p>
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
     * <p>Deletes a custom code or image agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
     * <h3>Before you begin</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion result</h3>
     * <p>A successful response indicates that the deletion request is accepted, and the response summary typically returns <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query the deletion progress. After the deletion is complete, a detail query returns a resource not found error. Runtime resources are cleaned up in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom code or image agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
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
     * <p>Deletes a custom code or image agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
     * <h3>Before you begin</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion result</h3>
     * <p>A successful response indicates that the deletion request is accepted, and the response summary typically returns <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query the deletion progress. After the deletion is complete, a detail query returns a resource not found error. Runtime resources are cleaned up in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom code or image agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
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
     * <p>Deletes a managed agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
     * <h3>Prerequisites</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion results</h3>
     * <p>A successful response indicates that the deletion request has been accepted, and the response summary is typically <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * You can query the deletion progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>. After the deletion is complete, a details query returns a resource not found error. The processes and runtime environment of the managed agent are managed by the caller.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a managed agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
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
     * <p>Deletes a managed agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
     * <h3>Prerequisites</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion results</h3>
     * <p>A successful response indicates that the deletion request has been accepted, and the response summary is typically <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * You can query the deletion progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>. After the deletion is complete, a details query returns a resource not found error. The processes and runtime environment of the managed agent are managed by the caller.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a managed agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
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
     * <p>Disconnects the association between a workspace and an enterprise identity source. This operation is used to terminate identity federation or clear the current attach configuration before you attach another identity source.
     * Disconnecting clears the AgentCore users and associated configurations imported from the identity source. For <code>CustomSSO</code>, it also clears the shared user pool and SAML and SCIM access resources. Applications created by users in the enterprise identity system must still be managed on the enterprise side.</p>
     * <h3>Preparations before disconnecting</h3>
     * <p>Remove the reference relationships between the related users and collaboration teams first. If teams still reference these users, the API operation rejects the disconnection request.
     * If you only want to temporarily disable a specific capability, you can retain the identity source binding. Use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> to disable logon, or use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a> to disable SCIM synchronization.</p>
     * <h3>Verify the disconnection result</h3>
     * <p>The disconnection is executed in the background. After the request is accepted, <code>DISCONNECTING</code> is returned. You can query the progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>:</p>
     * <ul>
     * <li>If the query returns <code>IdentityProviderNotFound</code>, the binding has been removed and the disconnection is complete.</li>
     * <li>If <code>DISCONNECT_FAILED</code> is returned, the cleanup failed. Some resources may have already been cleared. You can initiate the disconnection again.
     * You can bind a new identity source to the workspace only after the disconnection is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disconnects the identity source integration of a workspace. For CustomSSO, this operation clears the shared user pool and related SAML and SCIM resources. To disable only logon or synchronization, use the corresponding API operations.</p>
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
     * <p>Disconnects the association between a workspace and an enterprise identity source. This operation is used to terminate identity federation or clear the current attach configuration before you attach another identity source.
     * Disconnecting clears the AgentCore users and associated configurations imported from the identity source. For <code>CustomSSO</code>, it also clears the shared user pool and SAML and SCIM access resources. Applications created by users in the enterprise identity system must still be managed on the enterprise side.</p>
     * <h3>Preparations before disconnecting</h3>
     * <p>Remove the reference relationships between the related users and collaboration teams first. If teams still reference these users, the API operation rejects the disconnection request.
     * If you only want to temporarily disable a specific capability, you can retain the identity source binding. Use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> to disable logon, or use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a> to disable SCIM synchronization.</p>
     * <h3>Verify the disconnection result</h3>
     * <p>The disconnection is executed in the background. After the request is accepted, <code>DISCONNECTING</code> is returned. You can query the progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>:</p>
     * <ul>
     * <li>If the query returns <code>IdentityProviderNotFound</code>, the binding has been removed and the disconnection is complete.</li>
     * <li>If <code>DISCONNECT_FAILED</code> is returned, the cleanup failed. Some resources may have already been cleared. You can initiate the disconnection again.
     * You can bind a new identity source to the workspace only after the disconnection is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disconnects the identity source integration of a workspace. For CustomSSO, this operation clears the shared user pool and related SAML and SCIM resources. To disable only logon or synchronization, use the corresponding API operations.</p>
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
     * <p>Revokes a SCIM access token to deactivate an old token or clean up credentials that are no longer in use or have expired.
     * SCIM tokens are used to authorize enterprise identity systems to send user provisioning requests to user pools. After revocation, the enterprise identity system can no longer use the token to access the SCIM endpoint.</p>
     * <h3>Usage</h3>
     * <p><strong>Step 1:</strong> Query the credential list by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderSCIMCredentials">ListIdentityProviderSCIMCredentials</a> to obtain the target credentialId.
     * <strong>Step 2:</strong> If the enterprise identity system is still using the token, configure another valid token for it first.
     * <strong>Step 3:</strong> Call this operation to revoke the target credential, and then refresh the list to confirm the result.
     * This operation only revokes the specified token. Synchronized users, other tokens, logon configurations, and the user synchronization switch are retained. To disable user synchronization, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes a specified SCIM credential. This operation does not trigger automatic creation of a new token, modify the AC synchronization switch, or disable SAML logon.</p>
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
     * <p>Revokes a SCIM access token to deactivate an old token or clean up credentials that are no longer in use or have expired.
     * SCIM tokens are used to authorize enterprise identity systems to send user provisioning requests to user pools. After revocation, the enterprise identity system can no longer use the token to access the SCIM endpoint.</p>
     * <h3>Usage</h3>
     * <p><strong>Step 1:</strong> Query the credential list by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderSCIMCredentials">ListIdentityProviderSCIMCredentials</a> to obtain the target credentialId.
     * <strong>Step 2:</strong> If the enterprise identity system is still using the token, configure another valid token for it first.
     * <strong>Step 3:</strong> Call this operation to revoke the target credential, and then refresh the list to confirm the result.
     * This operation only revokes the specified token. Synchronized users, other tokens, logon configurations, and the user synchronization switch are retained. To disable user synchronization, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes a specified SCIM credential. This operation does not trigger automatic creation of a new token, modify the AC synchronization switch, or disable SAML logon.</p>
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
     * <p>Deletes the image cache association in a workspace and checks for agent references and instance usage before submission.</p>
     * <h3>Deletion conditions</h3>
     * <p>The deletion request is rejected if the cache is still referenced by an agent with the cache switch enabled, or if instances are still using it or resources are being released. You can first query <code>agentCount</code>, <code>canDelete</code>, and <code>deleteBlockReason</code> by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>.</p>
     * <h3>Query results</h3>
     * <p>The <code>imageId</code> in the response corresponds to this request. The current implementation of <code>deletionPending</code> returns <code>false</code>. To confirm whether the cache is still visible, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListImageCaches">ListImageCaches</a>.
     * This operation deletes the cache association in the specified workspace, but does not delete the source ACR repository or the source image.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the image cache association in a workspace and checks for agent references and instance usage before submission.</p>
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
     * <p>Deletes the image cache association in a workspace and checks for agent references and instance usage before submission.</p>
     * <h3>Deletion conditions</h3>
     * <p>The deletion request is rejected if the cache is still referenced by an agent with the cache switch enabled, or if instances are still using it or resources are being released. You can first query <code>agentCount</code>, <code>canDelete</code>, and <code>deleteBlockReason</code> by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>.</p>
     * <h3>Query results</h3>
     * <p>The <code>imageId</code> in the response corresponds to this request. The current implementation of <code>deletionPending</code> returns <code>false</code>. To confirm whether the cache is still visible, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListImageCaches">ListImageCaches</a>.
     * This operation deletes the cache association in the specified workspace, but does not delete the source ACR repository or the source image.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the image cache association in a workspace and checks for agent references and instance usage before submission.</p>
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
     * <b>description</b> :
     * <p>Deletes a managed Harness agent in a specified workspace and asynchronously cleans up its platform-associated resources.</p>
     * <h3>Prerequisites</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion results</h3>
     * <p>A successful response indicates that the deletion request has been accepted, and the response summary is typically <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * You can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query the deletion progress. After the deletion is complete, a details query returns a resource not found error. Runtime resources are cleaned up in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a managed Harness agent in a specified workspace and asynchronously cleans up its platform-associated resources.</p>
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
     * <b>description</b> :
     * <p>Deletes a managed Harness agent in a specified workspace and asynchronously cleans up its platform-associated resources.</p>
     * <h3>Prerequisites</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion results</h3>
     * <p>A successful response indicates that the deletion request has been accepted, and the response summary is typically <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * You can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query the deletion progress. After the deletion is complete, a details query returns a resource not found error. Runtime resources are cleaned up in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a managed Harness agent in a specified workspace and asynchronously cleans up its platform-associated resources.</p>
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
     * <p>Deletes a specified MCP service.
     * The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified MCP service. The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
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
     * <p>Deletes a specified MCP service.
     * The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified MCP service. The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
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
     * <p>Deletes a long-term memory by memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a long-term memory by memory ID.</p>
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
     * <p>Deletes a long-term memory by memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a long-term memory by memory ID.</p>
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
     * <p>Asynchronously deletes a specified long-term memory store (MemoryStore) and all its long-term memories.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously deletes a MemoryStore and all its long-term memories.</p>
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
     * <p>Asynchronously deletes a specified long-term memory store (MemoryStore) and all its long-term memories.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously deletes a MemoryStore and all its long-term memories.</p>
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
     * <b>description</b> :
     * <p>Deletes a model in a specified workspace. Models that are in use cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model in a specified workspace. Models that are in use cannot be deleted.</p>
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
     * <b>description</b> :
     * <p>Deletes a model in a specified workspace. Models that are in use cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model in a specified workspace. Models that are in use cannot be deleted.</p>
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
     * <b>description</b> :
     * <p>Submits an asynchronous deletion task for a specified model connection. The connection cannot be deleted if it has associated models or runtime references.</p>
     * 
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
     * <b>description</b> :
     * <p>Submits an asynchronous deletion task for a specified model connection. The connection cannot be deleted if it has associated models or runtime references.</p>
     * 
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
     * <p>Deletes an access rule in a workspace and revokes the configuration of the rule. Repeated deletions still return a success response.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission rule.</p>
     * 
     * @param request DeletePermissionRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePermissionRuleResponse
     */
    public DeletePermissionRuleResponse deletePermissionRuleWithOptions(String workspaceId, String permissionRuleId, DeletePermissionRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeletePermissionRule"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/permission-rules/" + com.aliyun.openapiutil.Client.getEncodeParam(permissionRuleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePermissionRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an access rule in a workspace and revokes the configuration of the rule. Repeated deletions still return a success response.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission rule.</p>
     * 
     * @param request DeletePermissionRuleRequest
     * @return DeletePermissionRuleResponse
     */
    public DeletePermissionRuleResponse deletePermissionRule(String workspaceId, String permissionRuleId, DeletePermissionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePermissionRuleWithOptions(workspaceId, permissionRuleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a skill and its related version data from the specified workspace.
     * The deletion operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a skill and its related version data from the specified workspace. The deletion operation is irreversible.</p>
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
     * <p>Deletes a skill and its related version data from the specified workspace.
     * The deletion operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a skill and its related version data from the specified workspace. The deletion operation is irreversible.</p>
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
     * <p>Deletes the draft of a skill that is being edited in normal version mode.
     * In <code>HEAD</code> mode, a persistent draft is used, and the delete draft operation is not supported. To modify the content, continue editing the draft. To remove the entire skill, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteSkill">DeleteSkill</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version of the specified skill that is currently being edited.</p>
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
     * <p>Deletes the draft of a skill that is being edited in normal version mode.
     * In <code>HEAD</code> mode, a persistent draft is used, and the delete draft operation is not supported. To modify the content, continue editing the draft. To remove the entire skill, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteSkill">DeleteSkill</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the draft version of the specified skill that is currently being edited.</p>
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
     * <b>description</b> :
     * <p>Deletes a team in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a team in a specified workspace. Deleting a team does not delete the users and agents within it, but only removes the membership associations.</p>
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
     * <b>description</b> :
     * <p>Deletes a team in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a team in a specified workspace. Deleting a team does not delete the users and agents within it, but only removes the membership associations.</p>
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
     * <b>description</b> :
     * <p>Deletes a user from a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user from a specified workspace. A user cannot be deleted if they are still a member of any team. Remove the user from the team first.</p>
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
     * <b>description</b> :
     * <p>Deletes a user from a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user from a specified workspace. A user cannot be deleted if they are still a member of any team. Remove the user from the team first.</p>
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
     * <p>Deletes a workspace that is no longer in use and ends the management lifecycle of the workspace. The API operation processes repeated deletion requests for the same workspace in the <code>Deleting</code> or <code>Deleted</code> state based on idempotence.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace that is no longer in use and ends the management lifecycle of the workspace.</p>
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
     * <p>Deletes a workspace that is no longer in use and ends the management lifecycle of the workspace. The API operation processes repeated deletion requests for the same workspace in the <code>Deleting</code> or <code>Deleted</code> state based on idempotence.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace that is no longer in use and ends the management lifecycle of the workspace.</p>
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
     * <p>Disables the QoderCLI connector in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the QoderCLI connector in a specified workspace. The connector can be disabled only when no agent is using it. After being disabled, the connector and its service account key configuration are removed.</p>
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
     * <p>Disables the QoderCLI connector in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the QoderCLI connector in a specified workspace. The connector can be disabled only when no agent is using it. After being disabled, the connector and its service account key configuration are removed.</p>
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
     * <p>Retrieves the OSS presigned download URL for a specified agent template to download the agent template ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned download URL for a specified AgentSpec to download the AgentSpec ZIP package.</p>
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
     * <p>Retrieves the OSS presigned download URL for a specified agent template to download the agent template ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned download URL for a specified AgentSpec to download the AgentSpec ZIP package.</p>
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
     * <p>Retrieves the OSS pre-signed download URL for a specified skill version to download the corresponding skill ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS pre-signed download URL for a specified skill version to download the corresponding skill ZIP package.</p>
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
     * <p>Retrieves the OSS pre-signed download URL for a specified skill version to download the corresponding skill ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS pre-signed download URL for a specified skill version to download the corresponding skill ZIP package.</p>
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
     * <p>Enables the QoderCLI connector in a workspace. Before enabling, verify the credentials by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyConnector">VerifyConnector</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the QoderCLI connector in a specified workspace. The request must provide a site, an API key, and at least one service account key. The service verifies all account keys before saving the configuration.</p>
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
     * <p>Enables the QoderCLI connector in a workspace. Before enabling, verify the credentials by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyConnector">VerifyConnector</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the QoderCLI connector in a specified workspace. The request must provide a site, an API key, and at least one service account key. The service verifies all account keys before saving the configuration.</p>
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
     * <p>Uses the <code>clientToken</code> of a create or update request to retrieve a custom image preparation task, which allows you to continue querying the processing progress after a request response is lost.</p>
     * <h3>Search scope</h3>
     * <p>Pass the <code>clientToken</code> used when submitting <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a> as a query parameter, and use the original workspace.
     * The preparation task can be retrieved only if the submission result includes <code>imagePreparation</code>. If no corresponding preparation task exists, a resource not found error is returned.</p>
     * <h3>Query phases</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>phase</code></th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>QUEUED</code>, <code>CHECKING</code></td>
     * <td>Queued or checking the source.</td>
     * </tr>
     * <tr>
     * <td><code>COPYING</code></td>
     * <td>Copying the image.</td>
     * </tr>
     * <tr>
     * <td><code>STARTING</code></td>
     * <td>Starting the target version.</td>
     * </tr>
     * <tr>
     * <td><code>HEALTH_CHECKING</code></td>
     * <td>Waiting for the target version instance to be ready.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCEEDED</code></td>
     * <td>The target version deployment succeeded.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The preparation or deployment failed. Check <code>failedPhase</code> and <code>error</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELLED</code></td>
     * <td>The target version has been replaced by a subsequent configuration or canceled.</td>
     * </tr>
     * <tr>
     * <td>After the task is found, you can use the <code>preparationId</code> to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgentImagePreparation">GetCustomAgentImagePreparation</a> to continuously query the progress.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a custom image preparation task by using a submitted clientToken and queries the current progress.</p>
     * 
     * @param request FindCustomAgentImagePreparationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindCustomAgentImagePreparationResponse
     */
    public FindCustomAgentImagePreparationResponse findCustomAgentImagePreparationWithOptions(String workspaceId, FindCustomAgentImagePreparationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "FindCustomAgentImagePreparation"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-image-preparations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindCustomAgentImagePreparationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Uses the <code>clientToken</code> of a create or update request to retrieve a custom image preparation task, which allows you to continue querying the processing progress after a request response is lost.</p>
     * <h3>Search scope</h3>
     * <p>Pass the <code>clientToken</code> used when submitting <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a> as a query parameter, and use the original workspace.
     * The preparation task can be retrieved only if the submission result includes <code>imagePreparation</code>. If no corresponding preparation task exists, a resource not found error is returned.</p>
     * <h3>Query phases</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>phase</code></th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>QUEUED</code>, <code>CHECKING</code></td>
     * <td>Queued or checking the source.</td>
     * </tr>
     * <tr>
     * <td><code>COPYING</code></td>
     * <td>Copying the image.</td>
     * </tr>
     * <tr>
     * <td><code>STARTING</code></td>
     * <td>Starting the target version.</td>
     * </tr>
     * <tr>
     * <td><code>HEALTH_CHECKING</code></td>
     * <td>Waiting for the target version instance to be ready.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCEEDED</code></td>
     * <td>The target version deployment succeeded.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The preparation or deployment failed. Check <code>failedPhase</code> and <code>error</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELLED</code></td>
     * <td>The target version has been replaced by a subsequent configuration or canceled.</td>
     * </tr>
     * <tr>
     * <td>After the task is found, you can use the <code>preparationId</code> to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgentImagePreparation">GetCustomAgentImagePreparation</a> to continuously query the progress.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a custom image preparation task by using a submitted clientToken and queries the current progress.</p>
     * 
     * @param request FindCustomAgentImagePreparationRequest
     * @return FindCustomAgentImagePreparationResponse
     */
    public FindCustomAgentImagePreparationResponse findCustomAgentImagePreparation(String workspaceId, FindCustomAgentImagePreparationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findCustomAgentImagePreparationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Forcibly publishes a specified skill version by bypassing the standard review process.</p>
     * 
     * <b>summary</b> : 
     * <p>Forcibly publishes a specified skill version by bypassing the standard review process.</p>
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
     * <p>Forcibly publishes a specified skill version by bypassing the standard review process.</p>
     * 
     * <b>summary</b> : 
     * <p>Forcibly publishes a specified skill version by bypassing the standard review process.</p>
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
     * <p>Queries the configuration of an access application in a workspace to view the application access information and user source settings.
     * The query result does not include the plaintext of the application secret. The secret is returned only when the application is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the access application.</p>
     * 
     * @param request GetAccessApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessApplicationResponse
     */
    public GetAccessApplicationResponse getAccessApplicationWithOptions(String workspaceId, String applicationId, GetAccessApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessApplication"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/access-applications/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration of an access application in a workspace to view the application access information and user source settings.
     * The query result does not include the plaintext of the application secret. The secret is returned only when the application is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the access application.</p>
     * 
     * @param request GetAccessApplicationRequest
     * @return GetAccessApplicationResponse
     */
    public GetAccessApplicationResponse getAccessApplication(String workspaceId, String applicationId, GetAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccessApplicationWithOptions(workspaceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the download URL for the currently saved code package of a custom code or image agent, which can be used to download, inspect, or reuse the fixed code package.</p>
     * <h3>Download scope</h3>
     * <p>Locates the fixed code package referenced by the currently saved configuration by using <code>workspaceId</code> and <code>agentId</code>. This applies to code packages uploaded locally or imported from OSS. Arbitrary bucket names, object keys, or historical version parameters are not accepted.
     * The current configuration must be deployed as a code package and the fixed package must be available. You do not need to wait for the running instance to be ready. An error is returned if the object has been changed, is missing, or is unreadable.</p>
     * <h3>Use the response</h3>
     * <p>Use <code>downloadUrl</code> to download the file. The <code>fileName</code>, <code>fileSize</code>, <code>format</code>, <code>etag</code>, and <code>crc64</code> fields describe the corresponding fixed package. The unit of <code>fileSize</code> is bytes. The <code>resourceVersionId</code> field identifies the saved configuration version corresponding to this download.
     * The URL is valid for up to 10 minutes and does not exceed the validity period of the underlying credentials, subject to <code>expiresAt</code>. Retrieve the URL again after it expires.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the time-limited read-only download URL for the currently saved fixed code package of a custom code or image agent.</p>
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
     * <p>Retrieves the download URL for the currently saved code package of a custom code or image agent, which can be used to download, inspect, or reuse the fixed code package.</p>
     * <h3>Download scope</h3>
     * <p>Locates the fixed code package referenced by the currently saved configuration by using <code>workspaceId</code> and <code>agentId</code>. This applies to code packages uploaded locally or imported from OSS. Arbitrary bucket names, object keys, or historical version parameters are not accepted.
     * The current configuration must be deployed as a code package and the fixed package must be available. You do not need to wait for the running instance to be ready. An error is returned if the object has been changed, is missing, or is unreadable.</p>
     * <h3>Use the response</h3>
     * <p>Use <code>downloadUrl</code> to download the file. The <code>fileName</code>, <code>fileSize</code>, <code>format</code>, <code>etag</code>, and <code>crc64</code> fields describe the corresponding fixed package. The unit of <code>fileSize</code> is bytes. The <code>resourceVersionId</code> field identifies the saved configuration version corresponding to this download.
     * The URL is valid for up to 10 minutes and does not exceed the validity period of the underlying credentials, subject to <code>expiresAt</code>. Retrieve the URL again after it expires.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the time-limited read-only download URL for the currently saved fixed code package of a custom code or image agent.</p>
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
     * <p>Generates an authorization link for the workspace resource role to read the code package source bucket, which is used to complete authorization before deploying an existing OSS code package.</p>
     * <h3>Authorization steps</h3>
     * <p><strong>Step 1:</strong> Provide the <code>ossBucketName</code> to obtain the <code>authorizeUrl</code> for the current workspace resource role.
     * <strong>Step 2:</strong> Open the returned link and confirm the authorization.
     * <strong>Step 3:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyAgentCodePackageOssRamAuthorization">VerifyAgentCodePackageOssRamAuthorization</a> to query the policy binding status. To verify a specific code package object, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ValidateAgentCodePackageFromOss">ValidateAgentCodePackageFromOss</a>.</p>
     * <h3>Authorization scope</h3>
     * <p>The role is selected by the server and cannot be overridden by the caller. This authorization reuses the <code>OSSObjectRestoreCustom</code> template, which includes permissions such as reading, writing, and deleting objects, and is not a read-only authorization. Existing authorizations for the same role and bucket can be reused.
     * Obtaining the link itself does not complete the authorization, transfer the code package, or modify the default OSS binding of the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a RAM authorization link for the specified code package source bucket for the workspace resource role.</p>
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
     * <p>Generates an authorization link for the workspace resource role to read the code package source bucket, which is used to complete authorization before deploying an existing OSS code package.</p>
     * <h3>Authorization steps</h3>
     * <p><strong>Step 1:</strong> Provide the <code>ossBucketName</code> to obtain the <code>authorizeUrl</code> for the current workspace resource role.
     * <strong>Step 2:</strong> Open the returned link and confirm the authorization.
     * <strong>Step 3:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyAgentCodePackageOssRamAuthorization">VerifyAgentCodePackageOssRamAuthorization</a> to query the policy binding status. To verify a specific code package object, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ValidateAgentCodePackageFromOss">ValidateAgentCodePackageFromOss</a>.</p>
     * <h3>Authorization scope</h3>
     * <p>The role is selected by the server and cannot be overridden by the caller. This authorization reuses the <code>OSSObjectRestoreCustom</code> template, which includes permissions such as reading, writing, and deleting objects, and is not a read-only authorization. Existing authorizations for the same role and bucket can be reused.
     * Obtaining the link itself does not complete the authorization, transfer the code package, or modify the default OSS binding of the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a RAM authorization link for the specified code package source bucket for the workspace resource role.</p>
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
     * <p>Retrieves a time-limited direct upload URL and upload requirements for a local code package. After the upload is complete, use the returned <code>sourceUri</code> to submit the agent deployment.</p>
     * <h3>Request requirements</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Requirement</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>fileName</code></td>
     * <td>The name of the ZIP or TAR.GZ file without the folder. Maximum length: 255 characters.</td>
     * </tr>
     * <tr>
     * <td><code>format</code></td>
     * <td><code>zip</code> or <code>tar.gz</code>. Must match the file name extension.</td>
     * </tr>
     * <tr>
     * <td><code>fileSize</code></td>
     * <td>The size of the compressed package in bytes. Valid values: 1 to 500000000.</td>
     * </tr>
     * </tbody></table>
     * <h3>Upload and deployment</h3>
     * <p><strong>Step 1:</strong> Use the <code>uploadMethod</code>, <code>uploadUrl</code>, and <code>headers</code> from the response to upload the file directly. This operation only generates the URL and does not upload the file content.
     * <strong>Step 2:</strong> After the upload is complete, specify the <code>sourceUri</code> in the <code>artifact.code.sourceUri</code> parameter of the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a> operation. You must also provide the <code>languageRuntime</code>, <code>entrypoint</code>, and service port.
     * <strong>Step 3:</strong> During creation or update, the actual object and its size are verified again. The configuration is saved after the object is transferred to a fixed replica.
     * The upload URL is valid for up to 10 minutes and does not exceed the expiration time of the underlying temporary credentials. The exact expiration time is subject to the <code>expiresAt</code> value. If the URL expires, obtain a new one and use the original link and request headers from the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a time-limited upload URL for a local code package, and returns the upload method, request headers, and the sourceUri for subsequent deployment.</p>
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
     * <p>Retrieves a time-limited direct upload URL and upload requirements for a local code package. After the upload is complete, use the returned <code>sourceUri</code> to submit the agent deployment.</p>
     * <h3>Request requirements</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Requirement</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>fileName</code></td>
     * <td>The name of the ZIP or TAR.GZ file without the folder. Maximum length: 255 characters.</td>
     * </tr>
     * <tr>
     * <td><code>format</code></td>
     * <td><code>zip</code> or <code>tar.gz</code>. Must match the file name extension.</td>
     * </tr>
     * <tr>
     * <td><code>fileSize</code></td>
     * <td>The size of the compressed package in bytes. Valid values: 1 to 500000000.</td>
     * </tr>
     * </tbody></table>
     * <h3>Upload and deployment</h3>
     * <p><strong>Step 1:</strong> Use the <code>uploadMethod</code>, <code>uploadUrl</code>, and <code>headers</code> from the response to upload the file directly. This operation only generates the URL and does not upload the file content.
     * <strong>Step 2:</strong> After the upload is complete, specify the <code>sourceUri</code> in the <code>artifact.code.sourceUri</code> parameter of the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a> operation. You must also provide the <code>languageRuntime</code>, <code>entrypoint</code>, and service port.
     * <strong>Step 3:</strong> During creation or update, the actual object and its size are verified again. The configuration is saved after the object is transferred to a fixed replica.
     * The upload URL is valid for up to 10 minutes and does not exceed the expiration time of the underlying temporary credentials. The exact expiration time is subject to the <code>expiresAt</code> value. If the URL expires, obtain a new one and use the original link and request headers from the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a time-limited upload URL for a local code package, and returns the upload method, request headers, and the sourceUri for subsequent deployment.</p>
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
     * <p>Queries the basic information, version status, and summaries of all versions of an agent template (AgentSpec) for viewing the template and selecting a version.</p>
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
     * <p>Queries the basic information, version status, and summaries of all versions of an agent template (AgentSpec) for viewing the template and selecting a version.</p>
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
     * <p>Retrieves the upload URL for an agent template (AgentSpec) ZIP package to import templates from local files.
     * Files are transferred through Object Storage Service (OSS). First, upload the file by using the returned URL, and then call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadAgentSpecViaOss">UploadAgentSpecViaOss</a> API operation to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API operation to complete the import.</p>
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
     * <p>Retrieves the upload URL for an agent template (AgentSpec) ZIP package to import templates from local files.
     * Files are transferred through Object Storage Service (OSS). First, upload the file by using the returned URL, and then call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadAgentSpecViaOss">UploadAgentSpecViaOss</a> API operation to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API operation to complete the import.</p>
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
     * <p>Queries the full content of the latest version of an agent template (AgentSpec) for viewing or editing the latest version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing the latest version.</p>
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
     * <p>Queries the full content of the latest version of an agent template (AgentSpec) for viewing or editing the latest version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing the latest version.</p>
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
     * <p>Queries the full content of a specified agent template version, including the manifest content, resource files, and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
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
     * <p>Queries the full content of a specified agent template version, including the manifest content, resource files, and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
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
     * <p>Queries the details of a saved fixed version for a specified managed or custom agent. The configuration field returns the agent configuration at the time the version was saved.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an agent version.</p>
     * 
     * @param request GetAgentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentVersionResponse
     */
    public GetAgentVersionResponse getAgentVersionWithOptions(String workspaceId, String agentId, String agentVersion, GetAgentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentVersion"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(agentVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a saved fixed version for a specified managed or custom agent. The configuration field returns the agent configuration at the time the version was saved.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an agent version.</p>
     * 
     * @param request GetAgentVersionRequest
     * @return GetAgentVersionResponse
     */
    public GetAgentVersionResponse getAgentVersion(String workspaceId, String agentId, String agentVersion, GetAgentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentVersionWithOptions(workspaceId, agentId, agentVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified credential and returns the list of agents bound to the credential.</p>
     * <h3>Response content</h3>
     * <p>Queries the credential type, description, application scope, and binding information. Supports two types: <code>apiKey</code> and <code>mcpHeader</code>.</p>
     * <ul>
     * <li><code>apiKey</code>: The key value is returned in a masked format.</li>
     * <li><code>mcpHeader</code>: Returns the configured header name without the header value. The <code>resourceType</code> of the applicable resource is <code>mcpServer</code>.
     * To modify the configuration, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCredential">UpdateCredential</a>.</li>
     * </ul>
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
     * <p>Queries the details of a specified credential and returns the list of agents bound to the credential.</p>
     * <h3>Response content</h3>
     * <p>Queries the credential type, description, application scope, and binding information. Supports two types: <code>apiKey</code> and <code>mcpHeader</code>.</p>
     * <ul>
     * <li><code>apiKey</code>: The key value is returned in a masked format.</li>
     * <li><code>mcpHeader</code>: Returns the configured header name without the header value. The <code>resourceType</code> of the applicable resource is <code>mcpServer</code>.
     * To modify the configuration, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCredential">UpdateCredential</a>.</li>
     * </ul>
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
     * <p>Queries the configuration, artifacts, and running status of a custom code or image agent to confirm the processing and effective results of creation or updates.</p>
     * <h3>Query configuration processing results</h3>
     * <p>After creation or update, you can poll this operation. The returned configuration belongs to the latest submitted version and may not have taken effect yet.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>effectiveSpecVersion</code></td>
     * <td>The currently effective configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the latest expected version.</td>
     * </tr>
     * <tr>
     * <td><code>latestExecutionError</code></td>
     * <td>The reason why the latest version is waiting for a retry or failed to execute, and whether automatic retry is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>The snapshot of the number of running instances in each phase.</td>
     * </tr>
     * <tr>
     * <td><code>pending</code>, <code>processing</code>, and <code>waiting_retry</code> indicate that processing is continuing. <code>succeeded</code> indicates that the configuration is processed successfully. If the value is <code>failed</code>, troubleshoot the issue based on <code>latestExecutionError</code>. Instance status and configuration processing status are queried separately.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Code packages and images</h3>
     * <p>In code package mode, <code>artifact.code.sourceUri</code> is the saved fixed package address, and <code>codePackageInfo</code> provides the package information. To download the current fixed package, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageDownloadUrl">GetAgentCodePackageDownloadUrl</a>.
     * In image mode, <code>customImage</code> is the most recently saved custom source, and <code>currentImage</code> is the image source of the effective version. The two may be different. You can use <code>imagePreparation.preparationId</code> to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgentImagePreparation">GetCustomAgentImagePreparation</a> to query the preparation and deployment phases of the current custom image. <code>imageCachePreparation.statusAtAcceptance</code> only indicates the cache status at the time of acceptance.
     * The response does not return the image repository password. If you query an agent that does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest deployment configuration, version processing results, code package or image information, and running instance status of a custom code or image agent.</p>
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
     * <p>Queries the configuration, artifacts, and running status of a custom code or image agent to confirm the processing and effective results of creation or updates.</p>
     * <h3>Query configuration processing results</h3>
     * <p>After creation or update, you can poll this operation. The returned configuration belongs to the latest submitted version and may not have taken effect yet.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>effectiveSpecVersion</code></td>
     * <td>The currently effective configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the latest expected version.</td>
     * </tr>
     * <tr>
     * <td><code>latestExecutionError</code></td>
     * <td>The reason why the latest version is waiting for a retry or failed to execute, and whether automatic retry is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>The snapshot of the number of running instances in each phase.</td>
     * </tr>
     * <tr>
     * <td><code>pending</code>, <code>processing</code>, and <code>waiting_retry</code> indicate that processing is continuing. <code>succeeded</code> indicates that the configuration is processed successfully. If the value is <code>failed</code>, troubleshoot the issue based on <code>latestExecutionError</code>. Instance status and configuration processing status are queried separately.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Code packages and images</h3>
     * <p>In code package mode, <code>artifact.code.sourceUri</code> is the saved fixed package address, and <code>codePackageInfo</code> provides the package information. To download the current fixed package, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageDownloadUrl">GetAgentCodePackageDownloadUrl</a>.
     * In image mode, <code>customImage</code> is the most recently saved custom source, and <code>currentImage</code> is the image source of the effective version. The two may be different. You can use <code>imagePreparation.preparationId</code> to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgentImagePreparation">GetCustomAgentImagePreparation</a> to query the preparation and deployment phases of the current custom image. <code>imageCachePreparation.statusAtAcceptance</code> only indicates the cache status at the time of acceptance.
     * The response does not return the image repository password. If you query an agent that does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest deployment configuration, version processing results, code package or image information, and running instance status of a custom code or image agent.</p>
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
     * <p>Queries the processing progress, such as image checking, copying, and starting, by preparation task ID to track the result of the current custom image submission.</p>
     * <h3>Obtain the task identifier</h3>
     * <p>Pass the value of <code>imagePreparation.preparationId</code> from the response of creating or updating a custom code or image agent as the <code>preparationId</code> parameter without modification. It identifies the task for the current submission, not the running instance ID.</p>
     * <h3>Determine completion</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>phase</code></th>
     * <th>Meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>QUEUED</code>, <code>CHECKING</code></td>
     * <td>Queued or checking the source.</td>
     * </tr>
     * <tr>
     * <td><code>COPYING</code></td>
     * <td>Copying the image.</td>
     * </tr>
     * <tr>
     * <td><code>STARTING</code></td>
     * <td>Starting the target version.</td>
     * </tr>
     * <tr>
     * <td><code>HEALTH_CHECKING</code></td>
     * <td>Waiting for the target version instance to be ready.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCEEDED</code></td>
     * <td>The target version is deployed successfully.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The preparation or deployment failed. Check <code>failedPhase</code> and <code>error</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELLED</code></td>
     * <td>The target version has been replaced by a subsequent configuration or canceled.</td>
     * </tr>
     * <tr>
     * <td>The query only reads the status and does not recreate the copy task. <code>SUCCEEDED</code> applies to the current target version. Seeing only old instances running does not indicate that the current submission is complete. If the configuration version is replaced by a subsequent submission, the current task may return <code>CANCELLED</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If the create or update response is lost, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/FindCustomAgentImagePreparation">FindCustomAgentImagePreparation</a> with the <code>clientToken</code> used at that time to retrieve the preparation task.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the preparation and deployment progress of the current submission for a custom image by preparation task ID.</p>
     * 
     * @param request GetCustomAgentImagePreparationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomAgentImagePreparationResponse
     */
    public GetCustomAgentImagePreparationResponse getCustomAgentImagePreparationWithOptions(String workspaceId, String preparationId, GetCustomAgentImagePreparationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomAgentImagePreparation"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/custom-image-preparations/" + com.aliyun.openapiutil.Client.getEncodeParam(preparationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomAgentImagePreparationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the processing progress, such as image checking, copying, and starting, by preparation task ID to track the result of the current custom image submission.</p>
     * <h3>Obtain the task identifier</h3>
     * <p>Pass the value of <code>imagePreparation.preparationId</code> from the response of creating or updating a custom code or image agent as the <code>preparationId</code> parameter without modification. It identifies the task for the current submission, not the running instance ID.</p>
     * <h3>Determine completion</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>phase</code></th>
     * <th>Meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>QUEUED</code>, <code>CHECKING</code></td>
     * <td>Queued or checking the source.</td>
     * </tr>
     * <tr>
     * <td><code>COPYING</code></td>
     * <td>Copying the image.</td>
     * </tr>
     * <tr>
     * <td><code>STARTING</code></td>
     * <td>Starting the target version.</td>
     * </tr>
     * <tr>
     * <td><code>HEALTH_CHECKING</code></td>
     * <td>Waiting for the target version instance to be ready.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCEEDED</code></td>
     * <td>The target version is deployed successfully.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The preparation or deployment failed. Check <code>failedPhase</code> and <code>error</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELLED</code></td>
     * <td>The target version has been replaced by a subsequent configuration or canceled.</td>
     * </tr>
     * <tr>
     * <td>The query only reads the status and does not recreate the copy task. <code>SUCCEEDED</code> applies to the current target version. Seeing only old instances running does not indicate that the current submission is complete. If the configuration version is replaced by a subsequent submission, the current task may return <code>CANCELLED</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If the create or update response is lost, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/FindCustomAgentImagePreparation">FindCustomAgentImagePreparation</a> with the <code>clientToken</code> used at that time to retrieve the preparation task.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the preparation and deployment progress of the current submission for a custom image by preparation task ID.</p>
     * 
     * @param request GetCustomAgentImagePreparationRequest
     * @return GetCustomAgentImagePreparationResponse
     */
    public GetCustomAgentImagePreparationResponse getCustomAgentImagePreparation(String workspaceId, String preparationId, GetCustomAgentImagePreparationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomAgentImagePreparationWithOptions(workspaceId, preparationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the platform configuration, version processing status, and external runtime status of a managed agent to verify access and configuration effectiveness.</p>
     * <h3>Configuration processing and runtime status</h3>
     * <p><code>latestSpecVersion</code> and <code>latestVersionStatus</code> indicate the latest submitted configuration and its processing status. <code>status</code> represents the platform resource status, and <code>externalAgentStatus</code> represents the external runtime status. A successful configuration acceptance does not mean that the external process is connected.
     * If <code>modelSource</code> is <code>PLATFORM</code>, the returned model configuration is used. <code>RUNTIME</code> indicates that the model is managed by the external environment. <code>configuredSkills</code> indicates explicit skill configurations, and <code>skills</code> represents the aggregated skill information.</p>
     * <h3>External access</h3>
     * <p>After the configuration takes effect, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> to query available networks, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain access information. If the agent does not exist, has been deleted, or does not belong to the workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration, model source, version processing status, and external runtime status of a managed agent.</p>
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
     * <p>Queries the platform configuration, version processing status, and external runtime status of a managed agent to verify access and configuration effectiveness.</p>
     * <h3>Configuration processing and runtime status</h3>
     * <p><code>latestSpecVersion</code> and <code>latestVersionStatus</code> indicate the latest submitted configuration and its processing status. <code>status</code> represents the platform resource status, and <code>externalAgentStatus</code> represents the external runtime status. A successful configuration acceptance does not mean that the external process is connected.
     * If <code>modelSource</code> is <code>PLATFORM</code>, the returned model configuration is used. <code>RUNTIME</code> indicates that the model is managed by the external environment. <code>configuredSkills</code> indicates explicit skill configurations, and <code>skills</code> represents the aggregated skill information.</p>
     * <h3>External access</h3>
     * <p>After the configuration takes effect, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> to query available networks, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain access information. If the agent does not exist, has been deleted, or does not belong to the workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration, model source, version processing status, and external runtime status of a managed agent.</p>
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
     * <p>Queries the available public and internal network access methods for a managed agent to select the network used for subsequent connections.</p>
     * <h3>Prerequisites</h3>
     * <p>The managed agent must be in the running state, and the latest desired configuration must be applied. If the configuration is still being created, updated, or not fully applied, query the status first by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>.</p>
     * <h3>Select an access network</h3>
     * <p>In the response, the <code>networkType</code> in <code>networkOptions</code> is <code>INTRANET</code> or <code>INTERNET</code>, and <code>available</code> indicates whether the corresponding access endpoint is available. Select a network with <code>available=true</code> and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain the corresponding access information.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available internal and public network access options for a managed agent.</p>
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
     * <p>Queries the available public and internal network access methods for a managed agent to select the network used for subsequent connections.</p>
     * <h3>Prerequisites</h3>
     * <p>The managed agent must be in the running state, and the latest desired configuration must be applied. If the configuration is still being created, updated, or not fully applied, query the status first by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>.</p>
     * <h3>Select an access network</h3>
     * <p>In the response, the <code>networkType</code> in <code>networkOptions</code> is <code>INTRANET</code> or <code>INTERNET</code>, and <code>available</code> indicates whether the corresponding access endpoint is available. Select a network with <code>available=true</code> and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain the corresponding access information.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available internal and public network access options for a managed agent.</p>
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
     * <p>Queries the enterprise identity providers bound to a workspace to view the access configuration, logon and user synchronization switches, and configuration processing progress.
     * For a custom identity provider (<code>CustomSSO</code>), this API operation also reads the saved SAML logon configuration for viewing or modifying enterprise single sign-on (SSO) settings.</p>
     * <h3>How to interpret the query results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>identityProviderType</code></td>
     * <td>Indicates whether DingTalk, Lark, or a custom identity provider is currently connected.</td>
     * </tr>
     * <tr>
     * <td><code>loginEnabled</code></td>
     * <td>Indicates whether enterprise account logon is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>saml</code></td>
     * <td>The saved SAML configuration of the enterprise identity system, used for backfilling when editing the configuration.</td>
     * </tr>
     * <tr>
     * <td><code>configuration</code></td>
     * <td>The actual SAML configuration read from the identity service, used to verify whether the logon configuration has taken effect.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The processing progress to attach the identity provider or apply the logon configuration.</td>
     * </tr>
     * <tr>
     * <td>If <code>CustomSSO</code> returns <code>WAITING_CONFIGURATION</code>, it indicates that the user pool is ready and the SAML logon configuration is pending. In this case, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the access information of AgentCore and continue configuring enterprise single sign-on.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>After saving the logon configuration, you can query <code>status</code> to track the processing progress. <code>READY</code> indicates that the configuration processing is complete. To check whether logon is enabled, you also need to verify <code>loginEnabled</code> and <code>configuration</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query user synchronization status</h3>
     * <p>SAML logon and SCIM user synchronization are configured separately. SCIM is used to pre-provision users from the enterprise identity system to the user pool. You can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a> to query the receiver configuration and synchronization task results.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding and expected configuration of a specified identity provider. When SAML is configured for CustomSSO, this operation reads back the actual upstream SSO configuration. The SCIM status is queried through a separate API operation.</p>
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
     * <p>Queries the enterprise identity providers bound to a workspace to view the access configuration, logon and user synchronization switches, and configuration processing progress.
     * For a custom identity provider (<code>CustomSSO</code>), this API operation also reads the saved SAML logon configuration for viewing or modifying enterprise single sign-on (SSO) settings.</p>
     * <h3>How to interpret the query results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>identityProviderType</code></td>
     * <td>Indicates whether DingTalk, Lark, or a custom identity provider is currently connected.</td>
     * </tr>
     * <tr>
     * <td><code>loginEnabled</code></td>
     * <td>Indicates whether enterprise account logon is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>saml</code></td>
     * <td>The saved SAML configuration of the enterprise identity system, used for backfilling when editing the configuration.</td>
     * </tr>
     * <tr>
     * <td><code>configuration</code></td>
     * <td>The actual SAML configuration read from the identity service, used to verify whether the logon configuration has taken effect.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The processing progress to attach the identity provider or apply the logon configuration.</td>
     * </tr>
     * <tr>
     * <td>If <code>CustomSSO</code> returns <code>WAITING_CONFIGURATION</code>, it indicates that the user pool is ready and the SAML logon configuration is pending. In this case, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the access information of AgentCore and continue configuring enterprise single sign-on.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>After saving the logon configuration, you can query <code>status</code> to track the processing progress. <code>READY</code> indicates that the configuration processing is complete. To check whether logon is enabled, you also need to verify <code>loginEnabled</code> and <code>configuration</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query user synchronization status</h3>
     * <p>SAML logon and SCIM user synchronization are configured separately. SCIM is used to pre-provision users from the enterprise identity system to the user pool. You can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a> to query the receiver configuration and synchronization task results.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding and expected configuration of a specified identity provider. When SAML is configured for CustomSSO, this operation reads back the actual upstream SSO configuration. The SCIM status is queried through a separate API operation.</p>
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
     * <p>Queries the access configuration and processing progress of SCIM user synchronization to determine whether the receiving end is ready, whether AgentCore user synchronization is enabled, and whether the most recent synchronization operation is completed.
     * SCIM is a user provisioning protocol. The enterprise identity system sends user information to the user pool through the receiving URL and access token. After AgentCore user synchronization is enabled, users in the user pool are imported into the workspace.</p>
     * <h3>How to interpret the query results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Business meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>configuration</code></td>
     * <td>The actual status and receiving URL of the SCIM receiving endpoint.</td>
     * </tr>
     * <tr>
     * <td><code>syncEnabled</code></td>
     * <td>The expected switch for AgentCore user synchronization.</td>
     * </tr>
     * <tr>
     * <td><code>operationStatus</code></td>
     * <td>The execution result of the most recent operation to enable or disable synchronization. It is an empty string <code>&quot;&quot;</code> if no historical tasks exist.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The SCIM access state derived from the receiving endpoint configuration, credentials, and operation results.</td>
     * </tr>
     * </tbody></table>
     * <h3>Proceed based on the status</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Current stage</th>
     * <th>Next step</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>UNCONFIGURED</code></td>
     * <td>The receiving end is not ready.</td>
     * <td>Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to prepare for access.</td>
     * </tr>
     * <tr>
     * <td><code>WAITING_CONFIGURATION</code></td>
     * <td>The URL and valid credentials are available. Waiting for the enterprise-side configuration to be completed and synchronization to be enabled.</td>
     * <td>Configure the URL and token in the enterprise identity system, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</td>
     * </tr>
     * <tr>
     * <td><code>UPDATING</code></td>
     * <td>Synchronization is being enabled or disabled.</td>
     * <td>Continue to query this operation and wait for the operation to complete.</td>
     * </tr>
     * <tr>
     * <td><code>READY</code></td>
     * <td>Synchronization is enabled, the current enabling task is successful, and the receiving end and credentials are still available.</td>
     * <td>You can view the synchronized workspace users.</td>
     * </tr>
     * <tr>
     * <td><code>DISABLED</code></td>
     * <td>Synchronization is disabled. Existing configurations, credentials, and users are retained.</td>
     * <td>To re-establish access, check and prepare the receiving end first, and then enable synchronization.</td>
     * </tr>
     * <tr>
     * <td><code>UPDATE_FAILED</code></td>
     * <td>The operation failed, or the configuration and credentials after enabling are no longer available.</td>
     * <td>Check the operation results and access configuration in combination with <code>operationStatus</code>.</td>
     * </tr>
     * <tr>
     * <td>This operation queries the SCIM status. The SAML enterprise account logon configuration is queried through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>. <code>READY</code> reflects the result of the current enabling operation. The user assignment and provisioning status in the enterprise identity system must still be verified on the enterprise side.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the actual SCIM receiving configuration, the expected AgentCore synchronization switch, and the status of the most recent independent SCIM task. SAML configuration is not required beforehand.</p>
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
     * <p>Queries the access configuration and processing progress of SCIM user synchronization to determine whether the receiving end is ready, whether AgentCore user synchronization is enabled, and whether the most recent synchronization operation is completed.
     * SCIM is a user provisioning protocol. The enterprise identity system sends user information to the user pool through the receiving URL and access token. After AgentCore user synchronization is enabled, users in the user pool are imported into the workspace.</p>
     * <h3>How to interpret the query results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Business meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>configuration</code></td>
     * <td>The actual status and receiving URL of the SCIM receiving endpoint.</td>
     * </tr>
     * <tr>
     * <td><code>syncEnabled</code></td>
     * <td>The expected switch for AgentCore user synchronization.</td>
     * </tr>
     * <tr>
     * <td><code>operationStatus</code></td>
     * <td>The execution result of the most recent operation to enable or disable synchronization. It is an empty string <code>&quot;&quot;</code> if no historical tasks exist.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The SCIM access state derived from the receiving endpoint configuration, credentials, and operation results.</td>
     * </tr>
     * </tbody></table>
     * <h3>Proceed based on the status</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Current stage</th>
     * <th>Next step</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>UNCONFIGURED</code></td>
     * <td>The receiving end is not ready.</td>
     * <td>Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to prepare for access.</td>
     * </tr>
     * <tr>
     * <td><code>WAITING_CONFIGURATION</code></td>
     * <td>The URL and valid credentials are available. Waiting for the enterprise-side configuration to be completed and synchronization to be enabled.</td>
     * <td>Configure the URL and token in the enterprise identity system, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</td>
     * </tr>
     * <tr>
     * <td><code>UPDATING</code></td>
     * <td>Synchronization is being enabled or disabled.</td>
     * <td>Continue to query this operation and wait for the operation to complete.</td>
     * </tr>
     * <tr>
     * <td><code>READY</code></td>
     * <td>Synchronization is enabled, the current enabling task is successful, and the receiving end and credentials are still available.</td>
     * <td>You can view the synchronized workspace users.</td>
     * </tr>
     * <tr>
     * <td><code>DISABLED</code></td>
     * <td>Synchronization is disabled. Existing configurations, credentials, and users are retained.</td>
     * <td>To re-establish access, check and prepare the receiving end first, and then enable synchronization.</td>
     * </tr>
     * <tr>
     * <td><code>UPDATE_FAILED</code></td>
     * <td>The operation failed, or the configuration and credentials after enabling are no longer available.</td>
     * <td>Check the operation results and access configuration in combination with <code>operationStatus</code>.</td>
     * </tr>
     * <tr>
     * <td>This operation queries the SCIM status. The SAML enterprise account logon configuration is queried through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>. <code>READY</code> reflects the result of the current enabling operation. The user assignment and provisioning status in the enterprise identity system must still be verified on the enterprise side.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the actual SCIM receiving configuration, the expected AgentCore synchronization switch, and the status of the most recent independent SCIM task. SAML configuration is not required beforehand.</p>
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
     * <p>Retrieves the SAML service provider (SP) access information of AgentCore to configure single sign-on (SSO) in an enterprise identity provider (IdP).
     * An SP is a service provider that receives logon assertions. An IdP is an enterprise identity provider that verifies user identities and issues logon assertions. This operation returns the SP information on the AgentCore side.</p>
     * <h3>Before you begin</h3>
     * <p>The workspace is bound to CustomSSO, and the shared user pool is initialized. The protocol parameter is required and must be set to SAML.
     * You can call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> operation to query the binding information. After the user pool is available, you can obtain the SP information and then complete the SAML configuration.</p>
     * <h3>Request example</h3>
     * <pre><code class="language-http">GET /workspaces/{workspaceId}/identity-providers/CustomSSO/service-provider?protocol=SAML
     * </code></pre>
     * <h3>Response information</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>protocol</td>
     * <td>The access protocol. This operation returns SAML.</td>
     * </tr>
     * <tr>
     * <td>entityId</td>
     * <td>The SP identifier of AgentCore. Configure it as the service provider Entity ID in the enterprise IdP.</td>
     * </tr>
     * <tr>
     * <td>acsUrl</td>
     * <td>The URL where AgentCore receives SAML logon assertions. Configure it as the ACS URL in the enterprise IdP.</td>
     * </tr>
     * <tr>
     * <td>metadataXml</td>
     * <td>The SP metadata XML. Import it to configure the SP in an enterprise IdP that supports metadata import.</td>
     * </tr>
     * </tbody></table>
     * <h3>Configuration flow</h3>
     * <p><strong>Step 1:</strong> Call this operation to obtain the SP information, and configure the SP identifier and the URL to accept assertions of AgentCore in the enterprise IdP.
     * <strong>Step 2:</strong> Export the metadata XML from the enterprise IdP and save it to AgentCore by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>.
     * <strong>Step 3:</strong> After the configuration is complete, enable single sign-on logon by setting loginEnabled as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SAML service provider (SP) information of CustomSSO, including the Entity ID, ACS URL, and SP metadata XML, for users to configure an external IdP.</p>
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
     * <p>Retrieves the SAML service provider (SP) access information of AgentCore to configure single sign-on (SSO) in an enterprise identity provider (IdP).
     * An SP is a service provider that receives logon assertions. An IdP is an enterprise identity provider that verifies user identities and issues logon assertions. This operation returns the SP information on the AgentCore side.</p>
     * <h3>Before you begin</h3>
     * <p>The workspace is bound to CustomSSO, and the shared user pool is initialized. The protocol parameter is required and must be set to SAML.
     * You can call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> operation to query the binding information. After the user pool is available, you can obtain the SP information and then complete the SAML configuration.</p>
     * <h3>Request example</h3>
     * <pre><code class="language-http">GET /workspaces/{workspaceId}/identity-providers/CustomSSO/service-provider?protocol=SAML
     * </code></pre>
     * <h3>Response information</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>protocol</td>
     * <td>The access protocol. This operation returns SAML.</td>
     * </tr>
     * <tr>
     * <td>entityId</td>
     * <td>The SP identifier of AgentCore. Configure it as the service provider Entity ID in the enterprise IdP.</td>
     * </tr>
     * <tr>
     * <td>acsUrl</td>
     * <td>The URL where AgentCore receives SAML logon assertions. Configure it as the ACS URL in the enterprise IdP.</td>
     * </tr>
     * <tr>
     * <td>metadataXml</td>
     * <td>The SP metadata XML. Import it to configure the SP in an enterprise IdP that supports metadata import.</td>
     * </tr>
     * </tbody></table>
     * <h3>Configuration flow</h3>
     * <p><strong>Step 1:</strong> Call this operation to obtain the SP information, and configure the SP identifier and the URL to accept assertions of AgentCore in the enterprise IdP.
     * <strong>Step 2:</strong> Export the metadata XML from the enterprise IdP and save it to AgentCore by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>.
     * <strong>Step 3:</strong> After the configuration is complete, enable single sign-on logon by setting loginEnabled as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SAML service provider (SP) information of CustomSSO, including the Entity ID, ACS URL, and SP metadata XML, for users to configure an external IdP.</p>
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
     * <p>Queries the progress, number of processed users, and failure causes of a user synchronization task to track whether manual synchronization is complete.
     * Use the <code>taskId</code> returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> and keep the same workspace and identity provider.</p>
     * <h3>Determine synchronization results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Meaning and what to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>PENDING</code>, <code>RUNNING</code></td>
     * <td>The node is not yet complete. You can continue to query.</td>
     * </tr>
     * <tr>
     * <td><code>PAUSED</code></td>
     * <td>The node is paused and has not ended.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCESS</code></td>
     * <td>The synchronization is complete. You can view the workspace users.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The synchronization failed. Check <code>failureReason</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELED</code></td>
     * <td>The node is canceled.</td>
     * </tr>
     * <tr>
     * <td><code>syncedUserCount</code> is the number of processed users, including updated existing users. It is not the number of newly added users and cannot be directly used as a completion percentage. <code>null</code> is returned when the count is not yet available.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
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
     * <p>Queries the progress, number of processed users, and failure causes of a user synchronization task to track whether manual synchronization is complete.
     * Use the <code>taskId</code> returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> and keep the same workspace and identity provider.</p>
     * <h3>Determine synchronization results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Meaning and what to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>PENDING</code>, <code>RUNNING</code></td>
     * <td>The node is not yet complete. You can continue to query.</td>
     * </tr>
     * <tr>
     * <td><code>PAUSED</code></td>
     * <td>The node is paused and has not ended.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCESS</code></td>
     * <td>The synchronization is complete. You can view the workspace users.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The synchronization failed. Check <code>failureReason</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELED</code></td>
     * <td>The node is canceled.</td>
     * </tr>
     * <tr>
     * <td><code>syncedUserCount</code> is the number of processed users, including updated existing users. It is not the number of newly added users and cannot be directly used as a completion percentage. <code>null</code> is returned when the count is not yet available.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
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
     * <p>Queries the saved user synchronization scope, checks whether the selected departments are valid, and views the estimated number of departments and users involved. You can use this operation to verify the scope before initiating a manual synchronization.</p>
     * <h3>View synchronization scope</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>syncScope.mode</code></th>
     * <th>Synchronization scope</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>AllAuthorized</code></td>
     * <td>The address book scope authorized for the enterprise application. The specific scope is determined by the enterprise\&quot;s authorization.</td>
     * </tr>
     * <tr>
     * <td><code>SelectedDepartments</code></td>
     * <td>The saved scope of specified departments. Use <code>selectedDepartments</code> to view the selected departments and their validity.</td>
     * </tr>
     * <tr>
     * <td>This operation reads the saved configuration. After adjusting the department selection, save the changes by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> before querying the estimated results. To browse the complete department tree, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Use user count estimation</h3>
     * <p>You can use <code>expandedDepartmentCount</code> and <code>estimatedUserCount</code> only when <code>estimateStatus=Ready</code> and the counts are not <code>null</code>. Counts that have not been obtained return <code>null</code> and must not be treated as 0.
     * After confirming the scope, initiate the synchronization by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a>.</p>
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
     * <p>Queries the saved user synchronization scope, checks whether the selected departments are valid, and views the estimated number of departments and users involved. You can use this operation to verify the scope before initiating a manual synchronization.</p>
     * <h3>View synchronization scope</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>syncScope.mode</code></th>
     * <th>Synchronization scope</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>AllAuthorized</code></td>
     * <td>The address book scope authorized for the enterprise application. The specific scope is determined by the enterprise\&quot;s authorization.</td>
     * </tr>
     * <tr>
     * <td><code>SelectedDepartments</code></td>
     * <td>The saved scope of specified departments. Use <code>selectedDepartments</code> to view the selected departments and their validity.</td>
     * </tr>
     * <tr>
     * <td>This operation reads the saved configuration. After adjusting the department selection, save the changes by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> before querying the estimated results. To browse the complete department tree, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Use user count estimation</h3>
     * <p>You can use <code>expandedDepartmentCount</code> and <code>estimatedUserCount</code> only when <code>estimateStatus=Ready</code> and the counts are not <code>null</code>. Counts that have not been obtained return <code>null</code> and must not be treated as 0.
     * After confirming the scope, initiate the synchronization by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a>.</p>
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
     * <p>Queries the creation status and usage of an image cache to determine whether the cache is available and meets the deletion conditions.</p>
     * <h3>Cache status</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>PENDING</code></td>
     * <td>Preparing. Continue to query.</td>
     * </tr>
     * <tr>
     * <td><code>READY</code></td>
     * <td>Ready.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>Preparation failed. Troubleshoot based on the <code>error</code> field.</td>
     * </tr>
     * <tr>
     * <td><code>DELETING</code></td>
     * <td>Deleting.</td>
     * </tr>
     * <tr>
     * <td><code>DISABLED</code></td>
     * <td>Disabled.</td>
     * </tr>
     * <tr>
     * <td>The <code>digest</code> is provided after the source resolution is completed. The unit of <code>cacheSizeBytes</code> is bytes, and it can be empty when the cache is not yet available.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Usage and deletion</h3>
     * <p><code>agentCount</code> indicates the number of agents that have enabled the cache switch and reference this cache. <code>canDelete</code> and <code>deleteBlockReason</code> indicate whether the cache can be deleted and the reason for blocking deletion. Deletion requests will recheck the usage.
     * The query scope of this operation is determined by <code>regionId</code>, <code>workspaceId</code>, and <code>imageId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, digest, size, and deletion conditions of an image cache in a specified workspace.</p>
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
     * <p>Queries the creation status and usage of an image cache to determine whether the cache is available and meets the deletion conditions.</p>
     * <h3>Cache status</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>PENDING</code></td>
     * <td>Preparing. Continue to query.</td>
     * </tr>
     * <tr>
     * <td><code>READY</code></td>
     * <td>Ready.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>Preparation failed. Troubleshoot based on the <code>error</code> field.</td>
     * </tr>
     * <tr>
     * <td><code>DELETING</code></td>
     * <td>Deleting.</td>
     * </tr>
     * <tr>
     * <td><code>DISABLED</code></td>
     * <td>Disabled.</td>
     * </tr>
     * <tr>
     * <td>The <code>digest</code> is provided after the source resolution is completed. The unit of <code>cacheSizeBytes</code> is bytes, and it can be empty when the cache is not yet available.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Usage and deletion</h3>
     * <p><code>agentCount</code> indicates the number of agents that have enabled the cache switch and reference this cache. <code>canDelete</code> and <code>deleteBlockReason</code> indicate whether the cache can be deleted and the reason for blocking deletion. Deletion requests will recheck the usage.
     * The query scope of this operation is determined by <code>regionId</code>, <code>workspaceId</code>, and <code>imageId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, digest, size, and deletion conditions of an image cache in a specified workspace.</p>
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
     * <b>description</b> :
     * <p>Queries the configuration, skill versions, and running status of a managed Harness agent to view the current configuration and its processing results.</p>
     * <h3>Configuration and running status</h3>
     * <p>This operation returns the latest submitted configuration, which may still be processing. Use the following fields to determine the update progress and running status:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest submitted desired configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the desired version.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>The current snapshot of the number of instances in each phase.</td>
     * </tr>
     * <tr>
     * <td>Successful configuration processing does not mean that all old instances have been replaced. To view specific instances or active sessions, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxes">ListSandboxes</a> and <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxSessions">ListSandboxSessions</a> respectively.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Harness and skill versions</h3>
     * <p><code>harness.type</code> indicates the runtime framework determined at creation. For qodercli, <code>connectorServiceAccountKey</code> returns the ID of the bound account key record and does not return the original key.
     * <code>configuredSkills</code> refers to explicitly configured skills. <code>skills</code> includes the aggregated results of template and explicit configurations. <code>resolvedVersion</code> is the current target version, and <code>appliedVersion</code> is the version currently in effect at runtime. These two may differ during an update. <code>fromTemplate=true</code> indicates that the skill comes from a template.
     * If you query an agent that does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest configuration, Harness and skill versions, configuration processing status, and running instance statistics of a managed Harness agent.</p>
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
     * <b>description</b> :
     * <p>Queries the configuration, skill versions, and running status of a managed Harness agent to view the current configuration and its processing results.</p>
     * <h3>Configuration and running status</h3>
     * <p>This operation returns the latest submitted configuration, which may still be processing. Use the following fields to determine the update progress and running status:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest submitted desired configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the desired version.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>The current snapshot of the number of instances in each phase.</td>
     * </tr>
     * <tr>
     * <td>Successful configuration processing does not mean that all old instances have been replaced. To view specific instances or active sessions, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxes">ListSandboxes</a> and <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxSessions">ListSandboxSessions</a> respectively.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Harness and skill versions</h3>
     * <p><code>harness.type</code> indicates the runtime framework determined at creation. For qodercli, <code>connectorServiceAccountKey</code> returns the ID of the bound account key record and does not return the original key.
     * <code>configuredSkills</code> refers to explicitly configured skills. <code>skills</code> includes the aggregated results of template and explicit configurations. <code>resolvedVersion</code> is the current target version, and <code>appliedVersion</code> is the version currently in effect at runtime. These two may differ during an update. <code>fromTemplate=true</code> indicates that the skill comes from a template.
     * If you query an agent that does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest configuration, Harness and skill versions, configuration processing status, and running instance statistics of a managed Harness agent.</p>
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
     * <p>Queries the details of a specified MCP service, such as the address, type, status, authentication configuration, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP service, such as the address, type, status, authentication configuration, and protocol.</p>
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
     * <p>Queries the details of a specified MCP service, such as the address, type, status, authentication configuration, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP service, such as the address, type, status, authentication configuration, and protocol.</p>
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
     * <p>Retrieves a temporary upload URL for a local MCP code package to create or update an MCP service of the code deployment type.</p>
     * <h3>Upload and deployment steps</h3>
     * <p><strong>Step 1:</strong> Prepare a ZIP code package, enter the file name in <code>fileName</code>, and call this operation to obtain the upload information.
     * <strong>Step 2:</strong> Use the returned <code>uploadMethod</code>, <code>uploadUrl</code>, and <code>headers</code> to upload the file content. The package size cannot exceed <code>maxSize</code>. The current limit is 50 MiB (52,428,800 bytes).
     * <strong>Step 3:</strong> After the upload is complete, submit the <code>codePackageToken</code> to the code deployment configuration in <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateMcp">CreateMcp</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateMcp">UpdateMcp</a>.
     * <strong>Step 4:</strong> After submitting the deployment, query the service status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a>.</p>
     * <h3>Validity period</h3>
     * <p>For the expiration time of the upload URL, see <code>expiresAt</code>. For the expiration time of the temporary code package, see <code>artifactExpiresAt</code>. Complete the upload and deployment within the corresponding periods. If the upload URL expires, retrieve it again.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a time-limited presigned upload URL and a temporary code package token. After the upload is complete, the token can be used to create or update a code deployment.</p>
     * 
     * @param tmpReq GetMcpCodePackageUploadUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcpCodePackageUploadUrlResponse
     */
    public GetMcpCodePackageUploadUrlResponse getMcpCodePackageUploadUrlWithOptions(String workspaceId, GetMcpCodePackageUploadUrlRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMcpCodePackageUploadUrlShrinkRequest request = new GetMcpCodePackageUploadUrlShrinkRequest();
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
            new TeaPair("action", "GetMcpCodePackageUploadUrl"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/mcp-server-actions/get-code-package-upload-url"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcpCodePackageUploadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary upload URL for a local MCP code package to create or update an MCP service of the code deployment type.</p>
     * <h3>Upload and deployment steps</h3>
     * <p><strong>Step 1:</strong> Prepare a ZIP code package, enter the file name in <code>fileName</code>, and call this operation to obtain the upload information.
     * <strong>Step 2:</strong> Use the returned <code>uploadMethod</code>, <code>uploadUrl</code>, and <code>headers</code> to upload the file content. The package size cannot exceed <code>maxSize</code>. The current limit is 50 MiB (52,428,800 bytes).
     * <strong>Step 3:</strong> After the upload is complete, submit the <code>codePackageToken</code> to the code deployment configuration in <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateMcp">CreateMcp</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateMcp">UpdateMcp</a>.
     * <strong>Step 4:</strong> After submitting the deployment, query the service status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a>.</p>
     * <h3>Validity period</h3>
     * <p>For the expiration time of the upload URL, see <code>expiresAt</code>. For the expiration time of the temporary code package, see <code>artifactExpiresAt</code>. Complete the upload and deployment within the corresponding periods. If the upload URL expires, retrieve it again.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a time-limited presigned upload URL and a temporary code package token. After the upload is complete, the token can be used to create or update a code deployment.</p>
     * 
     * @param request GetMcpCodePackageUploadUrlRequest
     * @return GetMcpCodePackageUploadUrlResponse
     */
    public GetMcpCodePackageUploadUrlResponse getMcpCodePackageUploadUrl(String workspaceId, GetMcpCodePackageUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMcpCodePackageUploadUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the capabilities, parameters, and version information of an MCP marketplace template to help you select a template and prepare for installation and configuration.
     * Returns the current template version and the installation form schema.</p>
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
     * <p>Queries the capabilities, parameters, and version information of an MCP marketplace template to help you select a template and prepare for installation and configuration.
     * Returns the current template version and the installation form schema.</p>
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
     * <p>Queries the configuration and current status of a long-term memory store (MemoryStore) for viewing memory store information.</p>
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
     * <p>Queries the configuration and current status of a long-term memory store (MemoryStore) for viewing memory store information.</p>
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
     * <p>Queries the progress and results of a memory extraction task by using the <code>taskId</code> returned by the asynchronous <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/AddMemories">AddMemories</a> operation.</p>
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
     * <p>Queries the progress and results of a memory extraction task by using the <code>taskId</code> returned by the asynchronous <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/AddMemories">AddMemories</a> operation.</p>
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
     * <b>description</b> :
     * <p>Queries the detailed configuration and region of a model in a specified workspace.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the detailed configuration and region of a model in a specified workspace.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the detailed configuration, credential configuration status, publish status, and region of a specified model connection.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the detailed configuration, credential configuration status, publish status, and region of a specified model connection.</p>
     * 
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
     * <p>Always use the initial operationId returned by RebuildSandbox for queries. Magic aggregates and returns the rebuildOutcome result from Runtime Manager, so the frontend does not need to track Claim tasks. Only SUCCEEDED indicates overall completion. UNKNOWN, missing fields, or query exceptions must not be treated as success, and the rebuild must not be automatically resubmitted. You can specify the endpoint runtime version by using serviceEndpointId. If omitted, the default latest runtime identity is used.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the overall result of a specified sandbox rebuild task. Always use the initial operationId returned by RebuildSandbox without tracking the rebuild task and subsequent creation tasks separately. Only the SUCCEEDED status indicates completion. Do not treat UNKNOWN, missing status, or query exceptions as success, and do not automatically resubmit the rebuild.</p>
     * 
     * @param request GetSandboxRebuildOperationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSandboxRebuildOperationResponse
     */
    public GetSandboxRebuildOperationResponse getSandboxRebuildOperationWithOptions(String workspaceId, String agentId, String sandboxId, String operationId, GetSandboxRebuildOperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceEndpointId)) {
            query.put("serviceEndpointId", request.serviceEndpointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSandboxRebuildOperation"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + "/rebuild-operations/" + com.aliyun.openapiutil.Client.getEncodeParam(operationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSandboxRebuildOperationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Always use the initial operationId returned by RebuildSandbox for queries. Magic aggregates and returns the rebuildOutcome result from Runtime Manager, so the frontend does not need to track Claim tasks. Only SUCCEEDED indicates overall completion. UNKNOWN, missing fields, or query exceptions must not be treated as success, and the rebuild must not be automatically resubmitted. You can specify the endpoint runtime version by using serviceEndpointId. If omitted, the default latest runtime identity is used.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the overall result of a specified sandbox rebuild task. Always use the initial operationId returned by RebuildSandbox without tracking the rebuild task and subsequent creation tasks separately. Only the SUCCEEDED status indicates completion. Do not treat UNKNOWN, missing status, or query exceptions as success, and do not automatically resubmit the rebuild.</p>
     * 
     * @param request GetSandboxRebuildOperationRequest
     * @return GetSandboxRebuildOperationResponse
     */
    public GetSandboxRebuildOperationResponse getSandboxRebuildOperation(String workspaceId, String agentId, String sandboxId, String operationId, GetSandboxRebuildOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSandboxRebuildOperationWithOptions(workspaceId, agentId, sandboxId, operationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the service endpoint of an agent or collaboration component to obtain stable access URLs, authentication configuration, and current status.
     * A service endpoint associates access URLs with a specified agent version or workspace collaboration component. You can use the target route and URL list in the response to verify the access target.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified service endpoint, including the target route, access URLs, authentication configuration, and current status.</p>
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
     * <p>Queries the service endpoint of an agent or collaboration component to obtain stable access URLs, authentication configuration, and current status.
     * A service endpoint associates access URLs with a specified agent version or workspace collaboration component. You can use the target route and URL list in the response to verify the access target.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified service endpoint, including the target route, access URLs, authentication configuration, and current status.</p>
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
     * <p>Retrieves the active API key and invocation method of a service endpoint for external applications to access the endpoint.
     * The endpoint must have <code>API_KEY</code> authentication enabled and access credentials ready. Securely store the returned API key.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the active API key and its invocation method for a service endpoint in a specified workspace.</p>
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
     * <p>Retrieves the active API key and invocation method of a service endpoint for external applications to access the endpoint.
     * The endpoint must have <code>API_KEY</code> authentication enabled and access credentials ready. Securely store the returned API key.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the active API key and its invocation method for a service endpoint in a specified workspace.</p>
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
     * <p>Queries the basic information, version status, tags, visibility scope, and version list of a specified skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information, version status, tags, visibility scope, and version list of a specified skill.</p>
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
     * <p>Queries the basic information, version status, tags, visibility scope, and version list of a specified skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information, version status, tags, visibility scope, and version list of a specified skill.</p>
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
     * <p>Retrieves the upload URL for a skill ZIP package to import a skill from a local file.
     * Files are transferred through OSS. Upload the file by using the returned URL, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadSkillViaOss">UploadSkillViaOss</a> to complete the import. To check the package content and conflicts, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrecheckSkillUploadViaOss">PrecheckSkillUploadViaOss</a> first.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the Object Storage Service (OSS) presigned upload URL and object name required to import a skill ZIP package. After the upload is complete, you can call the skill OSS upload API operation to complete the import.</p>
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
     * <p>Retrieves the upload URL for a skill ZIP package to import a skill from a local file.
     * Files are transferred through OSS. Upload the file by using the returned URL, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadSkillViaOss">UploadSkillViaOss</a> to complete the import. To check the package content and conflicts, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrecheckSkillUploadViaOss">PrecheckSkillUploadViaOss</a> first.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the Object Storage Service (OSS) presigned upload URL and object name required to import a skill ZIP package. After the upload is complete, you can call the skill OSS upload API operation to complete the import.</p>
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
     * <p>Queries the complete details of a specified skill version, including version metadata, skill content, and associated resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete details of a specified skill version, including version metadata, skill content, and associated resources.</p>
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
     * <p>Queries the complete details of a specified skill version, including version metadata, skill content, and associated resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete details of a specified skill version, including version metadata, skill content, and associated resources.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specified team, including the complete attributes and team roles of each user and agent member in the team.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified team, including the complete attributes and team roles of each user and agent member in the team.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specified team, including the complete attributes and team roles of each user and agent member in the team.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified team, including the complete attributes and team roles of each user and agent member in the team.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specific user in a specified workspace.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the details of a specific user in a specified workspace.</p>
     * 
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
     * <p>Queries the basic information, associated resources, and network configurations of a workspace for status viewing or configuration verification.
     * The returned information includes the lifecycle status, associated observability workspace, AI registry namespace, and current network policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a workspace by workspace ID, including the lifecycle status, CMS workspace, AI registry namespace, and current network policies.</p>
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
     * <p>Queries the basic information, associated resources, and network configurations of a workspace for status viewing or configuration verification.
     * The returned information includes the lifecycle status, associated observability workspace, AI registry namespace, and current network policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a workspace by workspace ID, including the lifecycle status, CMS workspace, AI registry namespace, and current network policies.</p>
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
     * <p>Generates an authorization link for the workspace resource role to pull images from a specified ACR Enterprise Edition repository, allowing you to complete access authorization before image deployment.</p>
     * <h3>Request parameters</h3>
     * <p>The <code>workspaceId</code> parameter specifies the workspace. The <code>acrInstanceId</code>, <code>namespace</code>, and <code>repository</code> parameters are passed as query parameters. The <code>repository</code> parameter specifies the repository name without the namespace.</p>
     * <h3>Complete authorization</h3>
     * <p>Open the <code>authorizeUrl</code> in the response and confirm the authorization. Then, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyWorkspaceAcrRamAuthorization">VerifyWorkspaceAcrRamAuthorization</a> to check the binding status. The role is selected by the server. The <code>roleName</code> and <code>roleSource</code> parameters indicate the selected role and its source, but do not indicate that the authorization is complete.
     * This authorization is used for ACR image deployment of custom agents and reading image cache sources. Obtaining the link itself does not pull images or create caches.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a RAM authorization link for the workspace resource role to pull images from a specified ACR Enterprise Edition repository.</p>
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
     * <p>Generates an authorization link for the workspace resource role to pull images from a specified ACR Enterprise Edition repository, allowing you to complete access authorization before image deployment.</p>
     * <h3>Request parameters</h3>
     * <p>The <code>workspaceId</code> parameter specifies the workspace. The <code>acrInstanceId</code>, <code>namespace</code>, and <code>repository</code> parameters are passed as query parameters. The <code>repository</code> parameter specifies the repository name without the namespace.</p>
     * <h3>Complete authorization</h3>
     * <p>Open the <code>authorizeUrl</code> in the response and confirm the authorization. Then, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyWorkspaceAcrRamAuthorization">VerifyWorkspaceAcrRamAuthorization</a> to check the binding status. The role is selected by the server. The <code>roleName</code> and <code>roleSource</code> parameters indicate the selected role and its source, but do not indicate that the authorization is complete.
     * This authorization is used for ACR image deployment of custom agents and reading image cache sources. Obtaining the link itself does not pull images or create caches.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a RAM authorization link for the workspace resource role to pull images from a specified ACR Enterprise Edition repository.</p>
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
     * <p>Retrieves the AgenticFS mount authorization link to enable agents in the workspace to access a specified file space.
     * <a href="https://www.alibabacloud.com/help/en/nas/product-overview/agenticfs-overview">AgenticFS</a> is a storage type of Apsara File Storage NAS designed for AI agents. It can be used to persistently store files used by agents. AgenticSpace is the file space within it, and an access point provides the mount entry.</p>
     * <h3>Authorization and mounting steps</h3>
     * <p><strong>Step 1:</strong> Prepare a file system, an AgenticSpace, and an access point in NAS, and obtain the file system ID, access point ID, and domain name.
     * <strong>Step 2:</strong> Submit <code>fileSystemId</code>, <code>accessPointId</code>, and <code>server</code> as query parameters. For <code>server</code>, enter the access point domain name returned by the NAS <code>ListAccessPoints</code> operation, without the protocol, port, or path.
     * <strong>Step 3:</strong> Open the returned <code>authorizeUrl</code> to complete the authorization for the workspace resource role.
     * <strong>Step 4:</strong> Check the authorization status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyWorkspaceAgenticFsMountRamAuthorization">VerifyWorkspaceAgenticFsMountRamAuthorization</a>.
     * <strong>Step 5:</strong> When creating or updating a custom code or image agent, or a managed Harness agent, enter the access point domain name, the relative directory <code>path</code>, and the container mount path <code>mountPath</code> in <code>agenticFsMounts</code>.
     * The access point must be located in the VPC associated with the workspace, and VPC access must be enabled for the agent. The mount directory must already exist. Use a non-empty relative directory within the access point for <code>path</code>, and use an absolute path within the container for <code>mountPath</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the RAM authorization page URL to grant the workspace resource role access to a specified AgenticFS access point before configuring NAS storage mounting for an agent.</p>
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
     * <p>Retrieves the AgenticFS mount authorization link to enable agents in the workspace to access a specified file space.
     * <a href="https://www.alibabacloud.com/help/en/nas/product-overview/agenticfs-overview">AgenticFS</a> is a storage type of Apsara File Storage NAS designed for AI agents. It can be used to persistently store files used by agents. AgenticSpace is the file space within it, and an access point provides the mount entry.</p>
     * <h3>Authorization and mounting steps</h3>
     * <p><strong>Step 1:</strong> Prepare a file system, an AgenticSpace, and an access point in NAS, and obtain the file system ID, access point ID, and domain name.
     * <strong>Step 2:</strong> Submit <code>fileSystemId</code>, <code>accessPointId</code>, and <code>server</code> as query parameters. For <code>server</code>, enter the access point domain name returned by the NAS <code>ListAccessPoints</code> operation, without the protocol, port, or path.
     * <strong>Step 3:</strong> Open the returned <code>authorizeUrl</code> to complete the authorization for the workspace resource role.
     * <strong>Step 4:</strong> Check the authorization status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyWorkspaceAgenticFsMountRamAuthorization">VerifyWorkspaceAgenticFsMountRamAuthorization</a>.
     * <strong>Step 5:</strong> When creating or updating a custom code or image agent, or a managed Harness agent, enter the access point domain name, the relative directory <code>path</code>, and the container mount path <code>mountPath</code> in <code>agenticFsMounts</code>.
     * The access point must be located in the VPC associated with the workspace, and VPC access must be enabled for the agent. The mount directory must already exist. Use a non-empty relative directory within the access point for <code>path</code>, and use an absolute path within the container for <code>mountPath</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the RAM authorization page URL to grant the workspace resource role access to a specified AgenticFS access point before configuring NAS storage mounting for an agent.</p>
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
     * <p>Queries the status and configuration of the workspace collaboration component to check whether the component is activated and whether the configuration takes effect.
     * Use <code>pluginName=collaboration</code> to specify the collaboration component. To activate the component, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/InstallWorkspacePlugin">InstallWorkspacePlugin</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status and configuration of a specified component in a workspace. The collaboration value corresponds to the Collaboration component displayed in the console.</p>
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
     * <p>Queries the status and configuration of the workspace collaboration component to check whether the component is activated and whether the configuration takes effect.
     * Use <code>pluginName=collaboration</code> to specify the collaboration component. To activate the component, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/InstallWorkspacePlugin">InstallWorkspacePlugin</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status and configuration of a specified component in a workspace. The collaboration value corresponds to the Collaboration component displayed in the console.</p>
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
     * <p>Creates an MCP service by using a marketplace template to reuse the tool capabilities and configurations provided by the template.
     * First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcpMarketItem">GetMcpMarketItem</a> to view the template versions and required parameters, and then submit the configuration based on the selected version. After the service is created, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> to query the service status.</p>
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
     * <p>Creates an MCP service by using a marketplace template to reuse the tool capabilities and configurations provided by the template.
     * First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcpMarketItem">GetMcpMarketItem</a> to view the template versions and required parameters, and then submit the configuration based on the selected version. After the service is created, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> to query the service status.</p>
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
     * <p>Enables the collaboration component for a workspace and configures initial settings such as the network.
     * Set pluginName=collaboration to specify the collaboration component. The enabling process is executed asynchronously. After submission, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspacePlugin">GetWorkspacePlugin</a> to check the component status and processing result.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a component for a workspace. This operation corresponds to enabling the collaboration component in the console. After the component is enabled, you can query the component status and current configurations.</p>
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
     * <p>Enables the collaboration component for a workspace and configures initial settings such as the network.
     * Set pluginName=collaboration to specify the collaboration component. The enabling process is executed asynchronously. After submission, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspacePlugin">GetWorkspacePlugin</a> to check the component status and processing result.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a component for a workspace. This operation corresponds to enabling the collaboration component in the console. After the component is enabled, you can query the component status and current configurations.</p>
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
     * <p>Queries the available runtime environments for code package deployment of custom code or image agents, which is used to populate artifact.code.languageRuntime.</p>
     * <h3>Select a runtime environment</h3>
     * <p>Copy the languageRuntime value from the response exactly as is into the artifact.code.languageRuntime parameter of <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a>. The catalog is dynamically provided by the current platform version, and internal base image addresses are not returned.</p>
     * <h3>Pagination rules</h3>
     * <p>If maxResults is omitted or set to 0, the default value is 10. If the value is greater than 100, it is processed as 100. The value cannot be negative. Omit nextToken for the first request. For subsequent requests, use the token returned in the previous response and keep the workspace unchanged. An empty token indicates that the query is complete. If the token becomes invalid due to changes in the runtime environment catalog, restart the query from the first page.
     * Regular updates, restarts, and scale-outs of existing agents continue to use their saved runtime images. When you create an agent or switch the language runtime environment, the catalog currently returned by this operation prevails.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the identity, name, and architecture of language runtime environments currently available for code package deployment by page.</p>
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
     * <p>Queries the available runtime environments for code package deployment of custom code or image agents, which is used to populate artifact.code.languageRuntime.</p>
     * <h3>Select a runtime environment</h3>
     * <p>Copy the languageRuntime value from the response exactly as is into the artifact.code.languageRuntime parameter of <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a>. The catalog is dynamically provided by the current platform version, and internal base image addresses are not returned.</p>
     * <h3>Pagination rules</h3>
     * <p>If maxResults is omitted or set to 0, the default value is 10. If the value is greater than 100, it is processed as 100. The value cannot be negative. Omit nextToken for the first request. For subsequent requests, use the token returned in the previous response and keep the workspace unchanged. An empty token indicates that the query is complete. If the token becomes invalid due to changes in the runtime environment catalog, restart the query from the first page.
     * Regular updates, restarts, and scale-outs of existing agents continue to use their saved runtime images. When you create an agent or switch the language runtime environment, the catalog currently returned by this operation prevails.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the identity, name, and architecture of language runtime environments currently available for code package deployment by page.</p>
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
     * <p>Queries the IM channels for a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IM channels for a specified agent.</p>
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
     * <p>Queries the IM channels for a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IM channels for a specified agent.</p>
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
     * <p>Performs a paging query of Agent templates in a specified workspace, and supports name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query of AgentSpecs in a specified workspace, and supports name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
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
     * <p>Performs a paging query of Agent templates in a specified workspace, and supports name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query of AgentSpecs in a specified workspace, and supports name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
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
     * <b>description</b> :
     * <p>Queries the teams to which specified agents belong.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the teams to which specified agents belong. Specify the agent IDs to query by using agentIds. The response includes the membership information of each agent in its teams, such as the team ID, team name, and the role of the agent in the team.</p>
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
     * <b>description</b> :
     * <p>Queries the teams to which specified agents belong.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the teams to which specified agents belong. Specify the agent IDs to query by using agentIds. The response includes the membership information of each agent in its teams, such as the team ID, team name, and the role of the agent in the team.</p>
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
     * <p>Performs a paged query for saved fixed versions of a specified managed or custom agent. The paging results are returned in descending order of creation time and do not include the latest version under system maintenance. List items do not return the configuration. To view the configuration, invoke GetAgentVersion.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of agent versions.</p>
     * 
     * @param request ListAgentVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentVersionsResponse
     */
    public ListAgentVersionsResponse listAgentVersionsWithOptions(String workspaceId, String agentId, ListAgentVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAgentVersions"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for saved fixed versions of a specified managed or custom agent. The paging results are returned in descending order of creation time and do not include the latest version under system maintenance. List items do not return the configuration. To view the configuration, invoke GetAgentVersion.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of agent versions.</p>
     * 
     * @param request ListAgentVersionsRequest
     * @return ListAgentVersionsResponse
     */
    public ListAgentVersionsResponse listAgentVersions(String workspaceId, String agentId, ListAgentVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentVersionsWithOptions(workspaceId, agentId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the official and enterprise models available for the enabled QoderCLI connector.
     * Queries the list of models available for a specified connector. Pagination is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the official and enterprise models available for the enabled QoderCLI connector. The service retrieves models in real time by using the saved API key and organization ID, and deduplicates them by model ID.</p>
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
     * <p>Queries the official and enterprise models available for the enabled QoderCLI connector.
     * Queries the list of models available for a specified connector. Pagination is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the official and enterprise models available for the enabled QoderCLI connector. The service retrieves models in real time by using the saved API key and organization ID, and deduplicates them by model ID.</p>
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
     * <p>Queries the connectors supported by the workspace to view their activation status, configurations, and the number of bound agents.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of connectors supported by a specified workspace, along with their status, the number of bound agents, and configurations. The current version returns the QoderCLI connector.</p>
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
     * <p>Queries the connectors supported by the workspace to view their activation status, configurations, and the number of bound agents.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of connectors supported by a specified workspace, along with their status, the number of bound agents, and configurations. The current version returns the QoderCLI connector.</p>
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
     * <p>Performs a paged query for credentials in a specified workspace.</p>
     * <h3>Query and paging</h3>
     * <p>Filters credentials by <code>apiKey</code> or <code>mcpHeader</code> type by using <code>credentialType</code>, and performs fuzzy filtering by name by using <code>nameLike</code>.
     * Uses <code>maxResults</code> to specify the number of entries per page for paging, and uses <code>nextToken</code> in the response to retrieve the next page. The returned credential content is desensitized. To query the details of a single credential, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for credentials in a specified workspace. Filters credentials by type by using credentialType, performs fuzzy filtering by credential name by using nameLike, specifies the maximum number of records per page for paging by using maxResults, and retrieves the next page by using nextToken. If maxResults is not specified, the server returns 10 records by default.</p>
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
     * <p>Performs a paged query for credentials in a specified workspace.</p>
     * <h3>Query and paging</h3>
     * <p>Filters credentials by <code>apiKey</code> or <code>mcpHeader</code> type by using <code>credentialType</code>, and performs fuzzy filtering by name by using <code>nameLike</code>.
     * Uses <code>maxResults</code> to specify the number of entries per page for paging, and uses <code>nextToken</code> in the response to retrieve the next page. The returned credential content is desensitized. To query the details of a single credential, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for credentials in a specified workspace. Filters credentials by type by using credentialType, performs fuzzy filtering by credential name by using nameLike, specifies the maximum number of records per page for paging by using maxResults, and retrieves the next page by using nextToken. If maxResults is not specified, the server returns 10 records by default.</p>
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
     * <p>Performs a paged query to retrieve the identity, deployment method, and status summary of custom code or image agents in a workspace, with paging support.</p>
     * <h3>Paged query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20 and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates the end of paging.</p>
     * <h3>Response content</h3>
     * <p>This operation returns the summary for the current page. It does not return the complete deployment configurations or errors that occur when you execute the latest configurations. Use <code>items[].agentId</code> to invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query code packages, image sources, results after you execute the version, and running instance statuses.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query to retrieve the identity, deployment method, and status summary of custom code or image agents in a workspace, with paging support.</p>
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
     * <p>Performs a paged query to retrieve the identity, deployment method, and status summary of custom code or image agents in a workspace, with paging support.</p>
     * <h3>Paged query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20 and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates the end of paging.</p>
     * <h3>Response content</h3>
     * <p>This operation returns the summary for the current page. It does not return the complete deployment configurations or errors that occur when you execute the latest configurations. Use <code>items[].agentId</code> to invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query code packages, image sources, results after you execute the version, and running instance statuses.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query to retrieve the identity, deployment method, and status summary of custom code or image agents in a workspace, with paging support.</p>
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
     * <p>Performs a paging query to retrieve the identity, configuration versions, and status summary of managed agents in a workspace.</p>
     * <h3>Paging query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20, and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>This operation returns the summary of managed agents. To query the complete models, instructions, tools, skills, and accessed state, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the identity, configuration versions, and status summary of managed agents in a workspace.</p>
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
     * <p>Performs a paging query to retrieve the identity, configuration versions, and status summary of managed agents in a workspace.</p>
     * <h3>Paging query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20, and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>This operation returns the summary of managed agents. To query the complete models, instructions, tools, skills, and accessed state, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the identity, configuration versions, and status summary of managed agents in a workspace.</p>
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
     * <p>Queries the list of DingTalk or Lark departments by parent department and paging. This is used when selecting or adjusting the user synchronization scope.</p>
     * <h3>Before you begin</h3>
     * <p>A DingTalk or Lark identity provider is bound to the workspace, and the user pool, application credentials, and authorization to read contacts are prepared.</p>
     * <h3>Query methods</h3>
     * <ul>
     * <li>Omit <code>parentDepartmentId</code> to query the root level. Pass a department ID to query its direct child departments.</li>
     * <li><code>hasChildren</code> indicates whether a department can be expanded. After expansion, use the department ID to query the next level.</li>
     * <li><code>nextToken</code> is used to continue reading the next page under the same parent department. An empty string indicates that there are no more pages.</li>
     * </ul>
     * <h3>Total count and pagination</h3>
     * <p>This operation does not calculate the total number of departments. Currently, <code>totalCount</code> returns JSON <code>null</code>, which does not mean the number of departments is 0. Whether to continue pagination depends on <code>nextToken</code>.</p>
     * <h3>Request examples</h3>
     * <pre><code class="language-http">GET /workspaces/{workspaceId}/identity-providers/{identityProviderType}/departments?maxResults=50
     * </code></pre>
     * <h3>Response examples</h3>
     * <p>The following shows the response structure for an empty directory page. <code>totalCount</code> retains the <code>null</code> value actually returned by the operation.</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;maxResults&quot;: 50,
     *   &quot;nextToken&quot;: &quot;&quot;,
     *   &quot;totalCount&quot;: null,
     *   &quot;items&quot;: []
     * }
     * </code></pre>
     * <h3>What to do next</h3>
     * <p>After selecting the departments to synchronize, save the synchronization scope by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> to initiate synchronization as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the departments of an identity provider by paging.</p>
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
     * <p>Queries the list of DingTalk or Lark departments by parent department and paging. This is used when selecting or adjusting the user synchronization scope.</p>
     * <h3>Before you begin</h3>
     * <p>A DingTalk or Lark identity provider is bound to the workspace, and the user pool, application credentials, and authorization to read contacts are prepared.</p>
     * <h3>Query methods</h3>
     * <ul>
     * <li>Omit <code>parentDepartmentId</code> to query the root level. Pass a department ID to query its direct child departments.</li>
     * <li><code>hasChildren</code> indicates whether a department can be expanded. After expansion, use the department ID to query the next level.</li>
     * <li><code>nextToken</code> is used to continue reading the next page under the same parent department. An empty string indicates that there are no more pages.</li>
     * </ul>
     * <h3>Total count and pagination</h3>
     * <p>This operation does not calculate the total number of departments. Currently, <code>totalCount</code> returns JSON <code>null</code>, which does not mean the number of departments is 0. Whether to continue pagination depends on <code>nextToken</code>.</p>
     * <h3>Request examples</h3>
     * <pre><code class="language-http">GET /workspaces/{workspaceId}/identity-providers/{identityProviderType}/departments?maxResults=50
     * </code></pre>
     * <h3>Response examples</h3>
     * <p>The following shows the response structure for an empty directory page. <code>totalCount</code> retains the <code>null</code> value actually returned by the operation.</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;maxResults&quot;: 50,
     *   &quot;nextToken&quot;: &quot;&quot;,
     *   &quot;totalCount&quot;: null,
     *   &quot;items&quot;: []
     * }
     * </code></pre>
     * <h3>What to do next</h3>
     * <p>After selecting the departments to synchronize, save the synchronization scope by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> to initiate synchronization as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the departments of an identity provider by paging.</p>
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
     * <p>Queries the list of SCIM access credentials to check which tokens are still valid, when they expire, and to select credentials for revocation.
     * SCIM tokens are used to authorize enterprise identity systems to send user provisioning requests to the user pool. This operation returns credential summaries, including the credential ID, status, creation time, and expiration time. The plaintext token is returned only upon creation.</p>
     * <h3>How to use the query results</h3>
     * <ul>
     * <li>Credentials with the Enabled status that have not expired can continue to be used.</li>
     * <li>To obtain a new token, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSCIMCredential">CreateIdentityProviderSCIMCredential</a>.</li>
     * <li>To revoke a token, pass the target credentialId to <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteIdentityProviderSCIMCredential">DeleteIdentityProviderSCIMCredential</a>.
     * A single user pool can retain up to two SCIM credentials. The list may include expired or disabled credentials. Clean up unused credentials before creating a new token.</li>
     * </ul>
     * <h3>Return method</h3>
     * <p>This operation returns the complete array of credentials at once without using pagination parameters. If no credentials exist, the following is returned:</p>
     * <pre><code class="language-json">{&quot;data&quot;:[]}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete summary list of up to two SCIM credentials in a shared user pool, without returning plaintext tokens or supporting pagination.</p>
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
     * <p>Queries the list of SCIM access credentials to check which tokens are still valid, when they expire, and to select credentials for revocation.
     * SCIM tokens are used to authorize enterprise identity systems to send user provisioning requests to the user pool. This operation returns credential summaries, including the credential ID, status, creation time, and expiration time. The plaintext token is returned only upon creation.</p>
     * <h3>How to use the query results</h3>
     * <ul>
     * <li>Credentials with the Enabled status that have not expired can continue to be used.</li>
     * <li>To obtain a new token, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSCIMCredential">CreateIdentityProviderSCIMCredential</a>.</li>
     * <li>To revoke a token, pass the target credentialId to <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteIdentityProviderSCIMCredential">DeleteIdentityProviderSCIMCredential</a>.
     * A single user pool can retain up to two SCIM credentials. The list may include expired or disabled credentials. Clean up unused credentials before creating a new token.</li>
     * </ul>
     * <h3>Return method</h3>
     * <p>This operation returns the complete array of credentials at once without using pagination parameters. If no credentials exist, the following is returned:</p>
     * <pre><code class="language-json">{&quot;data&quot;:[]}
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete summary list of up to two SCIM credentials in a shared user pool, without returning plaintext tokens or supporting pagination.</p>
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
     * <p>Queries the enterprise identity providers currently connected to a workspace. This operation is used to display the identity provider list or to check whether a binding already exists before configuring a new connection.
     * A workspace can be bound to at most one external identity provider: DingTalk, Lark, or a custom identity provider (<code>CustomSSO</code>). If no identity provider is bound, the returned <code>items</code> is an empty array.</p>
     * <h3>What you can view in the list</h3>
     * <p>The list returns the identity provider type, binding status, and logon and user synchronization switches. When the status of <code>CustomSSO</code> is <code>WAITING_CONFIGURATION</code>, it indicates that the user pool is ready and you can proceed to complete the integration configuration.
     * This operation returns a binding summary. To view specific integration configurations, use the corresponding operations:</p>
     * <ul>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>: Views the identity provider details and SAML logon configuration.</li>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a>: Retrieves the SAML integration information required to configure AgentCore in the enterprise identity system.</li>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>: Views the SCIM endpoint configuration and user synchronization status.</li>
     * </ul>
     * <h3>Pagination</h3>
     * <p>Currently, at most one binding is returned. <code>nextToken</code> should be omitted or passed as an empty string. The default value of <code>maxResults</code> is 10. Valid values: 1 to 100.</p>
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
     * <p>Queries the enterprise identity providers currently connected to a workspace. This operation is used to display the identity provider list or to check whether a binding already exists before configuring a new connection.
     * A workspace can be bound to at most one external identity provider: DingTalk, Lark, or a custom identity provider (<code>CustomSSO</code>). If no identity provider is bound, the returned <code>items</code> is an empty array.</p>
     * <h3>What you can view in the list</h3>
     * <p>The list returns the identity provider type, binding status, and logon and user synchronization switches. When the status of <code>CustomSSO</code> is <code>WAITING_CONFIGURATION</code>, it indicates that the user pool is ready and you can proceed to complete the integration configuration.
     * This operation returns a binding summary. To view specific integration configurations, use the corresponding operations:</p>
     * <ul>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>: Views the identity provider details and SAML logon configuration.</li>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a>: Retrieves the SAML integration information required to configure AgentCore in the enterprise identity system.</li>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>: Views the SCIM endpoint configuration and user synchronization status.</li>
     * </ul>
     * <h3>Pagination</h3>
     * <p>Currently, at most one binding is returned. <code>nextToken</code> should be omitted or passed as an empty string. The default value of <code>maxResults</code> is 10. Valid values: 1 to 100.</p>
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
     * <p>Performs a paged query for image caches in a workspace. Supports paging and filtering by image source and cache status.</p>
     * <h3>Filter conditions</h3>
     * <p>Provide regionId and workspaceId in the query parameters. You can filter by ACR instance, registry, namespace, repository, tag, digest, and status. Use imageRefContains to search for image address fragments.</p>
     * <h3>Pagination rules</h3>
     * <p>The default value of maxResults is 20, and the valid values are 1 to 100. Omit nextToken for the first request. For subsequent requests, use the token returned in the response as is, and keep the workspace, region, page size, and all filter conditions unchanged. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>Each item includes imageId, source, digest, status, size, reference count, and deletion conditions. PENDING only indicates that the cache is being prepared. For the cause of failure, see error. You can query a single cache by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for image caches in a workspace. Supports paging and filtering by image source and cache status.</p>
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
     * <p>Performs a paged query for image caches in a workspace. Supports paging and filtering by image source and cache status.</p>
     * <h3>Filter conditions</h3>
     * <p>Provide regionId and workspaceId in the query parameters. You can filter by ACR instance, registry, namespace, repository, tag, digest, and status. Use imageRefContains to search for image address fragments.</p>
     * <h3>Pagination rules</h3>
     * <p>The default value of maxResults is 20, and the valid values are 1 to 100. Omit nextToken for the first request. For subsequent requests, use the token returned in the response as is, and keep the workspace, region, page size, and all filter conditions unchanged. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>Each item includes imageId, source, digest, status, size, reference count, and deletion conditions. PENDING only indicates that the cache is being prepared. For the cause of failure, see error. You can query a single cache by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for image caches in a workspace. Supports paging and filtering by image source and cache status.</p>
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
     * <p>Performs a paging query for the identity, harness, configuration version, and status summary of managed Harness agents in a workspace.</p>
     * <h3>Paging query</h3>
     * <p>If maxResults is omitted or set to 0, the default value is 20, and the maximum value is 100. Omit nextToken in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>The list returns summary information, where harness.type indicates the runtime framework. For complete configurations, skill targets and effective versions, and instance status statistics, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for the identity, harness, configuration version, and status summary of managed Harness agents in a workspace.</p>
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
     * <p>Performs a paging query for the identity, harness, configuration version, and status summary of managed Harness agents in a workspace.</p>
     * <h3>Paging query</h3>
     * <p>If maxResults is omitted or set to 0, the default value is 20, and the maximum value is 100. Omit nextToken in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>The list returns summary information, where harness.type indicates the runtime framework. For complete configurations, skill targets and effective versions, and instance status statistics, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for the identity, harness, configuration version, and status summary of managed Harness agents in a workspace.</p>
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
     * <p>Queries official MCP marketplace templates available for installation to help select required tool services. Supports filtering by keyword, usage tag, and MCP type.</p>
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
     * <p>Queries official MCP marketplace templates available for installation to help select required tool services. Supports filtering by keyword, usage tag, and MCP type.</p>
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
     * <p>Queries the list of tools exposed by a specified MCP service and their input and output schemas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of tools exposed by a specified MCP service and their input and output schemas.</p>
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
     * <p>Queries the list of tools exposed by a specified MCP service and their input and output schemas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of tools exposed by a specified MCP service and their input and output schemas.</p>
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
     * <p>Performs a paging query for MCP services and their configurations and status in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for MCP services and their configurations and status in a specified workspace.</p>
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
     * <p>Performs a paging query for MCP services and their configurations and status in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for MCP services and their configurations and status in a specified workspace.</p>
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
     * <p>Queries long-term memory with paging and supports filtering by <code>UserId</code>, <code>AgentId</code>, and <code>SessionId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries long-term memory with paging and supports independent filtering by UserId, AgentId, and SessionId.</p>
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
     * <p>Queries long-term memory with paging and supports filtering by <code>UserId</code>, <code>AgentId</code>, and <code>SessionId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries long-term memory with paging and supports independent filtering by UserId, AgentId, and SessionId.</p>
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
     * <p>Queries raw messages of a specific session in the memory store with paging to view the session content used for generating long-term memory.
     * <code>SessionId</code> is required, and at least one of <code>UserId</code> and <code>AgentId</code> must be provided to identify the target session.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries raw messages by exact scope with paging. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
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
     * <p>Queries raw messages of a specific session in the memory store with paging to view the session content used for generating long-term memory.
     * <code>SessionId</code> is required, and at least one of <code>UserId</code> and <code>AgentId</code> must be provided to identify the target session.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries raw messages by exact scope with paging. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
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
     * <p>Performs a paged query for source sessions in a long-term memory store (MemoryStore), supporting paging and filtering by user ID and agent ID respectively.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for sessions in a MemoryStore, supporting paging and filtering by user ID and agent ID independently.</p>
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
     * <p>Performs a paged query for source sessions in a long-term memory store (MemoryStore), supporting paging and filtering by user ID and agent ID respectively.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for sessions in a MemoryStore, supporting paging and filtering by user ID and agent ID independently.</p>
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
     * <p>Performs a paged query of the long-term memory stores (MemoryStores) in a workspace by using paging for selection or management.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of MemoryStores in a specified workspace by using paging.</p>
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
     * <p>Performs a paged query of the long-term memory stores (MemoryStores) in a workspace by using paging for selection or management.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of MemoryStores in a specified workspace by using paging.</p>
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
     * <p>Queries model connections in a workspace by using paging to view configured model services.</p>
     * <ul>
     * <li>Use <code>Name</code> to filter by name, and <code>SearchType</code> to specify exact match or fuzzy match.</li>
     * <li>You can filter by model provider type and invocation protocol.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries model connections in a specified workspace by using paging. Supports filtering by name, provider type, and invocation protocol.</p>
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
     * <p>Queries model connections in a workspace by using paging to view configured model services.</p>
     * <ul>
     * <li>Use <code>Name</code> to filter by name, and <code>SearchType</code> to specify exact match or fuzzy match.</li>
     * <li>You can filter by model provider type and invocation protocol.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries model connections in a specified workspace by using paging. Supports filtering by name, provider type, and invocation protocol.</p>
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
     * <b>description</b> :
     * <p>Performs a paging query for models in a specified workspace and supports filtering by model connection and model name.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for models in a specified workspace and supports filtering by model connection and model name.</p>
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
     * <b>description</b> :
     * <p>Performs a paging query for models in a specified workspace and supports filtering by model connection and model name.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for models in a specified workspace and supports filtering by model connection and model name.</p>
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
     * <b>description</b> :
     * <p>Performs a paged query of access rules by resource, supporting paging to check existing rules and their sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries permission rules.</p>
     * 
     * @param request ListPermissionRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionRulesResponse
     */
    public ListPermissionRulesResponse listPermissionRulesWithOptions(String workspaceId, ListPermissionRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("principalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("principalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("principalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionRules"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/permission-rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of access rules by resource, supporting paging to check existing rules and their sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries permission rules.</p>
     * 
     * @param request ListPermissionRulesRequest
     * @return ListPermissionRulesResponse
     */
    public ListPermissionRulesResponse listPermissionRules(String workspaceId, ListPermissionRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionRulesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the providers supported by the built-in model catalog of AgentCore and their default service configurations.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the providers supported by the built-in model catalog of AgentCore and their default service configurations.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the models and their capabilities for a specified provider in the AgentCore built-in model catalog.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the models and their capabilities for a specified provider in the AgentCore built-in model catalog.</p>
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
     * <b>description</b> :
     * <p>Queries the models and their capabilities for a specified provider in the AgentCore built-in model catalog.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the models and their capabilities for a specified provider in the AgentCore built-in model catalog.</p>
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
     * <p>Queries the active sessions in a specified running instance to view the current mapping between sessions and instances.</p>
     * <h3>Query scope</h3>
     * <p>Locates the instance by using workspaceId, agentId, and sandboxId. You can obtain the sandboxId from <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxes">ListSandboxes</a>. This operation queries the current active sessions.</p>
     * <h3>Pagination</h3>
     * <p>The default value of maxResults is 20. Valid values: 1 to 100. Omit nextToken in the first request. For subsequent requests, use the returned token as is, and keep the workspace, agent, instance, and page size unchanged. An empty token indicates that no more pages are available.</p>
     * <h3>Session sources</h3>
     * <p>The source can be API, CONSOLE_DEBUG, EXTERNAL_CHANNEL, or UNKNOWN. For external channels, the channel type is additionally returned. If no source information is provided, UNKNOWN is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the current active sessions and their sources in a specified agent instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEndpointId)) {
            query.put("serviceEndpointId", request.serviceEndpointId);
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
     * <p>Queries the active sessions in a specified running instance to view the current mapping between sessions and instances.</p>
     * <h3>Query scope</h3>
     * <p>Locates the instance by using workspaceId, agentId, and sandboxId. You can obtain the sandboxId from <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxes">ListSandboxes</a>. This operation queries the current active sessions.</p>
     * <h3>Pagination</h3>
     * <p>The default value of maxResults is 20. Valid values: 1 to 100. Omit nextToken in the first request. For subsequent requests, use the returned token as is, and keep the workspace, agent, instance, and page size unchanged. An empty token indicates that no more pages are available.</p>
     * <h3>Session sources</h3>
     * <p>The source can be API, CONSOLE_DEBUG, EXTERNAL_CHANNEL, or UNKNOWN. For external channels, the channel type is additionally returned. If no source information is provided, UNKNOWN is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the current active sessions and their sources in a specified agent instance.</p>
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
     * <p>Queries the running instances (sandboxes) of an agent to view instance distribution and current running status.</p>
     * <h3>Filter instances</h3>
     * <p><code>searchText</code> matches Sandbox ID fragments, and <code>sessionId</code> matches current valid session ID fragments. Both are case-insensitive. If both are submitted, they are combined for filtering.</p>
     * <h3>Pagination and status</h3>
     * <p>The default value of <code>maxResults</code> is 20. Valid values: 1 to 100. Omit <code>nextToken</code> for the first request. For subsequent requests, use the response token as is, and keep <code>workspaceId</code>, <code>agentId</code>, filter conditions, and <code>maxResults</code> unchanged. An empty token indicates that the query is complete.
     * <code>phase</code> indicates the instance phase, <code>activeSessionCount</code> indicates the number of current active sessions, and <code>maxConcurrentSessions</code> indicates the configured concurrency limit for a single instance. You can query the active sessions of an instance by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxSessions">ListSandboxSessions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the running instances of an agent, and supports filtering by Sandbox ID and current valid session ID fragments.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEndpointId)) {
            query.put("serviceEndpointId", request.serviceEndpointId);
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
     * <p>Queries the running instances (sandboxes) of an agent to view instance distribution and current running status.</p>
     * <h3>Filter instances</h3>
     * <p><code>searchText</code> matches Sandbox ID fragments, and <code>sessionId</code> matches current valid session ID fragments. Both are case-insensitive. If both are submitted, they are combined for filtering.</p>
     * <h3>Pagination and status</h3>
     * <p>The default value of <code>maxResults</code> is 20. Valid values: 1 to 100. Omit <code>nextToken</code> for the first request. For subsequent requests, use the response token as is, and keep <code>workspaceId</code>, <code>agentId</code>, filter conditions, and <code>maxResults</code> unchanged. An empty token indicates that the query is complete.
     * <code>phase</code> indicates the instance phase, <code>activeSessionCount</code> indicates the number of current active sessions, and <code>maxConcurrentSessions</code> indicates the configured concurrency limit for a single instance. You can query the active sessions of an instance by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxSessions">ListSandboxSessions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the running instances of an agent, and supports filtering by Sandbox ID and current valid session ID fragments.</p>
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
     * <p>Queries service endpoints in a workspace with paging to find the access endpoints for agents or collaboration components.</p>
     * <ul>
     * <li>Use targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status to filter the results.</li>
     * <li>Use maxResults to set the number of entries per page. If omitted, the default value is 20.</li>
     * <li>Use the returned nextToken to query the next page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries service endpoints in a specified workspace with paging, and supports filtering by target type, agent, collaboration component, and status.</p>
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
     * <p>Queries service endpoints in a workspace with paging to find the access endpoints for agents or collaboration components.</p>
     * <ul>
     * <li>Use targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status to filter the results.</li>
     * <li>Use maxResults to set the number of entries per page. If omitted, the default value is 20.</li>
     * <li>Use the returned nextToken to query the next page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries service endpoints in a specified workspace with paging, and supports filtering by target type, agent, collaboration component, and status.</p>
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
     * <b>description</b> :
     * <p>Queries the reference relationships of a specified skill to verify its usage before modifying or cleaning up skill assets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the reference relationships of a skill.</p>
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
     * <b>description</b> :
     * <p>Queries the reference relationships of a specified skill to verify its usage before modifying or cleaning up skill assets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the reference relationships of a skill.</p>
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
     * <p>Performs a paged query of skills in a specified workspace and returns the basic information, version status, and paging information of the skills.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of skills in a specified workspace and returns the basic information, version status, and paging information of the skills.</p>
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
     * <p>Performs a paged query of skills in a specified workspace and returns the basic information, version status, and paging information of the skills.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of skills in a specified workspace and returns the basic information, version status, and paging information of the skills.</p>
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
     * <b>description</b> :
     * <p>Performs a paging query of teams in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query of teams in a specified workspace. You can use nameLike to filter teams by fuzzy match on the team name, maxResults to specify the maximum number of records per page, and nextToken to retrieve the next page. If maxResults is not specified, the server returns 10 records by default. The member information in the list includes only the member ID, name, and team role.</p>
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
     * <b>description</b> :
     * <p>Performs a paging query of teams in a specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query of teams in a specified workspace. You can use nameLike to filter teams by fuzzy match on the team name, maxResults to specify the maximum number of records per page, and nextToken to retrieve the next page. If maxResults is not specified, the server returns 10 records by default. The member information in the list includes only the member ID, name, and team role.</p>
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
     * <b>description</b> :
     * <p>Queries the application user directory in a workspace for viewing users and selecting team members.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for users in a specified workspace. You can filter users by fuzzy match on the username by using nameLike, specify the maximum number of records per paging by using maxResults, and retrieve the next paging by using nextToken. If maxResults is not specified, the server returns 10 records by default.</p>
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
     * <b>description</b> :
     * <p>Queries the application user directory in a workspace for viewing users and selecting team members.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for users in a specified workspace. You can filter users by fuzzy match on the username by using nameLike, specify the maximum number of records per paging by using maxResults, and retrieve the next paging by using nextToken. If maxResults is not specified, the server returns 10 records by default.</p>
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
     * <p>Performs a paged query of workspaces accessible to the current account for selecting a workspace or viewing a workspace overview.</p>
     * <ul>
     * <li>Use <code>nameLike</code> to filter by name using fuzzy match.</li>
     * <li>Use <code>maxResults</code> to configure the Settings for the number of entries per page. If this parameter is omitted or set to <code>0</code>, the default value is 20.</li>
     * <li>Use <code>nextToken</code> to query the next page during paging, or use <code>skip</code> to skip a specified number of workspaces.
     * The list is sorted in the order of creation. By default, deleted workspaces (with the <code>Deleted</code> status) are not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of workspaces under the current tenant. By default, the list does not return soft-deleted records whose status is Deleted. The server applies stable sorting to the results in chronological order of creation during paging.</p>
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
     * <p>Performs a paged query of workspaces accessible to the current account for selecting a workspace or viewing a workspace overview.</p>
     * <ul>
     * <li>Use <code>nameLike</code> to filter by name using fuzzy match.</li>
     * <li>Use <code>maxResults</code> to configure the Settings for the number of entries per page. If this parameter is omitted or set to <code>0</code>, the default value is 20.</li>
     * <li>Use <code>nextToken</code> to query the next page during paging, or use <code>skip</code> to skip a specified number of workspaces.
     * The list is sorted in the order of creation. By default, deleted workspaces (with the <code>Deleted</code> status) are not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of workspaces under the current tenant. By default, the list does not return soft-deleted records whose status is Deleted. The server applies stable sorting to the results in chronological order of creation during paging.</p>
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
     * <p>Takes the online version of a specified skill offline so that it is no longer used as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Takes the online version of a specified skill offline so that it is no longer used as the online version.</p>
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
     * <p>Takes the online version of a specified skill offline so that it is no longer used as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Takes the online version of a specified skill offline so that it is no longer used as the online version.</p>
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
     * <p>Sets the specified skill version as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the specified skill version as the online version.</p>
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
     * <p>Sets the specified skill version as the online version.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the specified skill version as the online version.</p>
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
     * <p>Checks one or more skill ZIP packages uploaded to OSS for skill names, versions, and import conflicts.
     * After the check passes, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadSkillViaOss">UploadSkillViaOss</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/BatchUploadSkillsViaOss">BatchUploadSkillsViaOss</a> to import the skills into the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses and checks one or more skill ZIP packages uploaded to OSS, and returns the names, versions, and conflict check results.</p>
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
     * <p>Checks one or more skill ZIP packages uploaded to OSS for skill names, versions, and import conflicts.
     * After the check passes, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadSkillViaOss">UploadSkillViaOss</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/BatchUploadSkillsViaOss">BatchUploadSkillsViaOss</a> to import the skills into the workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses and checks one or more skill ZIP packages uploaded to OSS, and returns the names, versions, and conflict check results.</p>
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
     * <p>Prepares the receiving endpoint and access token for integrating an enterprise identity system with SCIM user synchronization. The enterprise identity system uses this information to provision users to the shared user pool of AgentCore.
     * SCIM is a user provisioning protocol. The enterprise identity system first sends users to the receiving endpoint, and then AgentCore synchronizes the users from the user pool to the workspace.</p>
     * <h3>Before you begin</h3>
     * <p>A <code>CustomSSO</code> binding has been created by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProvider">CreateIdentityProvider</a>, and the shared user pool is ready. SCIM integration can be performed independently of SAML logon configuration.</p>
     * <h3>What this operation prepares</h3>
     * <p>This operation enables the SCIM receiving endpoint and returns the receiving URL and credential summary:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Current credential status</th>
     * <th>Returned result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>An unexpired credential with the status of <code>Enabled</code> already exists</td>
     * <td>Reuses the existing credential. The <code>token</code> field returns an empty string <code>&quot;&quot;</code>. Use the previously saved token.</td>
     * </tr>
     * <tr>
     * <td>No available credentials exist</td>
     * <td>Creates a new credential. The <code>token</code> field returns the plaintext of the new token, which is returned only in this response.</td>
     * </tr>
     * <tr>
     * <td>The plaintext of an existing token cannot be queried again. If the token is lost, you can create a new token by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSCIMCredential">CreateIdentityProviderSCIMCredential</a>. A maximum of two credentials can be retained for the same user pool. When the limit is reached, you must delete unused credentials first.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Subsequent configuration</h3>
     * <ol>
     * <li>Configure the returned receiving URL and valid token in the SCIM user provisioning settings of the enterprise identity system.</li>
     * <li>Complete the connection test and user assignment in the enterprise identity system.</li>
     * <li>Enable AgentCore user synchronization by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>, and then query the synchronization result by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Prepares the SCIM receiving configuration and returns the provisioning URL and credential summary. Issues a token if no available credentials exist and returns the plaintext only in this response, without automatically enabling AgentCore user synchronization.</p>
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
     * <p>Prepares the receiving endpoint and access token for integrating an enterprise identity system with SCIM user synchronization. The enterprise identity system uses this information to provision users to the shared user pool of AgentCore.
     * SCIM is a user provisioning protocol. The enterprise identity system first sends users to the receiving endpoint, and then AgentCore synchronizes the users from the user pool to the workspace.</p>
     * <h3>Before you begin</h3>
     * <p>A <code>CustomSSO</code> binding has been created by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProvider">CreateIdentityProvider</a>, and the shared user pool is ready. SCIM integration can be performed independently of SAML logon configuration.</p>
     * <h3>What this operation prepares</h3>
     * <p>This operation enables the SCIM receiving endpoint and returns the receiving URL and credential summary:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Current credential status</th>
     * <th>Returned result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>An unexpired credential with the status of <code>Enabled</code> already exists</td>
     * <td>Reuses the existing credential. The <code>token</code> field returns an empty string <code>&quot;&quot;</code>. Use the previously saved token.</td>
     * </tr>
     * <tr>
     * <td>No available credentials exist</td>
     * <td>Creates a new credential. The <code>token</code> field returns the plaintext of the new token, which is returned only in this response.</td>
     * </tr>
     * <tr>
     * <td>The plaintext of an existing token cannot be queried again. If the token is lost, you can create a new token by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSCIMCredential">CreateIdentityProviderSCIMCredential</a>. A maximum of two credentials can be retained for the same user pool. When the limit is reached, you must delete unused credentials first.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Subsequent configuration</h3>
     * <ol>
     * <li>Configure the returned receiving URL and valid token in the SCIM user provisioning settings of the enterprise identity system.</li>
     * <li>Complete the connection test and user assignment in the enterprise identity system.</li>
     * <li>Enable AgentCore user synchronization by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>, and then query the synchronization result by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Prepares the SCIM receiving configuration and returns the provisioning URL and credential summary. Issues a token if no available credentials exist and returns the plaintext only in this response, without automatically enabling AgentCore user synchronization.</p>
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
     * <p>Publishes a specified skill version and changes its status to published.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified skill version and changes its status to published.</p>
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
     * <p>Publishes a specified skill version and changes its status to published.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified skill version and changes its status to published.</p>
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
     * <p>Submits a request to rebuild a single sandbox image for a specified managed agent. Existing sessions may be interrupted. An HTTP 200 response only indicates that the request is successfully submitted and accepted. You must use the returned operationId to call GetSandboxRebuildOperation. Only an overall SUCCEEDED status indicates that the rebuild is complete. Do not automatically resubmit the request if the query times out, returns UNKNOWN, or the result is unclear. You can specify an endpoint runtime version by using serviceEndpointId. If this parameter is omitted, the default latest runtime identity is used.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a request to rebuild a single sandbox image for a specified managed agent. Existing sessions may be interrupted. An HTTP 200 response only indicates that the request is accepted. Use the returned operationId to call GetSandboxRebuildOperation to query the overall result. Only a SUCCEEDED status indicates that the rebuild is complete. Do not automatically resubmit the rebuild request if the query times out, returns UNKNOWN, or the result is unclear.</p>
     * 
     * @param request RebuildSandboxRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebuildSandboxResponse
     */
    public RebuildSandboxResponse rebuildSandboxWithOptions(String workspaceId, String agentId, String sandboxId, RebuildSandboxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceEndpointId)) {
            query.put("serviceEndpointId", request.serviceEndpointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildSandbox"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/managed-agents/" + com.aliyun.openapiutil.Client.getEncodeParam(agentId) + "/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + "/rebuild"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Submits a request to rebuild a single sandbox image for a specified managed agent. Existing sessions may be interrupted. An HTTP 200 response only indicates that the request is successfully submitted and accepted. You must use the returned operationId to call GetSandboxRebuildOperation. Only an overall SUCCEEDED status indicates that the rebuild is complete. Do not automatically resubmit the request if the query times out, returns UNKNOWN, or the result is unclear. You can specify an endpoint runtime version by using serviceEndpointId. If this parameter is omitted, the default latest runtime identity is used.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a request to rebuild a single sandbox image for a specified managed agent. Existing sessions may be interrupted. An HTTP 200 response only indicates that the request is accepted. Use the returned operationId to call GetSandboxRebuildOperation to query the overall result. Only a SUCCEEDED status indicates that the rebuild is complete. Do not automatically resubmit the rebuild request if the query times out, returns UNKNOWN, or the result is unclear.</p>
     * 
     * @param request RebuildSandboxRequest
     * @return RebuildSandboxResponse
     */
    public RebuildSandboxResponse rebuildSandbox(String workspaceId, String agentId, String sandboxId, RebuildSandboxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebuildSandboxWithOptions(workspaceId, agentId, sandboxId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Reverts a specified skill version to an editable draft for further modification.</p>
     * 
     * <b>summary</b> : 
     * <p>Reverts a specified skill version to an editable draft for further modification.</p>
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
     * <p>Reverts a specified skill version to an editable draft for further modification.</p>
     * 
     * <b>summary</b> : 
     * <p>Reverts a specified skill version to an editable draft for further modification.</p>
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
     * <b>description</b> :
     * <p>Resets the logon password of a specified user.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the logon password of a specified user. Specify the user by using agentCoreUserId or username. You must specify at least one of them. This operation only supports resetting the passwords of users who use local password authentication for the workspace. If you do not specify the password parameter, the server generates a random password and returns it in the response.</p>
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
     * <b>description</b> :
     * <p>Resets the logon password of a specified user.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the logon password of a specified user. Specify the user by using agentCoreUserId or username. You must specify at least one of them. This operation only supports resetting the passwords of users who use local password authentication for the workspace. If you do not specify the password parameter, the server generates a random password and returns it in the response.</p>
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
     * <p>Resubmits the creation request for an existing image cache to recreate a cache that has not been successfully created.</p>
     * <h3>Call scope</h3>
     * <p>Pass <code>regionId</code>, <code>workspaceId</code>, and <code>clientToken</code> as query parameters, and use <code>imageId</code> to locate the cache. This operation applies to ACR source caches and re-verifies the source repository authorization before submission.</p>
     * <h3>Query retry results</h3>
     * <p>A successful response indicates that a retry acceptance snapshot is returned, not that the creation is complete. Query the status through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>. <code>READY</code> indicates that the cache is ready. If the status is <code>FAILED</code>, check the <code>error</code> field.
     * The <code>clientToken</code> parameter currently only verifies that the value is not empty and does not guarantee deduplication or recovery of the original acceptance result based on this identifier.</p>
     * 
     * <b>summary</b> : 
     * <p>Resubmits the creation request for an ACR image cache in a specified workspace.</p>
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
     * <p>Resubmits the creation request for an existing image cache to recreate a cache that has not been successfully created.</p>
     * <h3>Call scope</h3>
     * <p>Pass <code>regionId</code>, <code>workspaceId</code>, and <code>clientToken</code> as query parameters, and use <code>imageId</code> to locate the cache. This operation applies to ACR source caches and re-verifies the source repository authorization before submission.</p>
     * <h3>Query retry results</h3>
     * <p>A successful response indicates that a retry acceptance snapshot is returned, not that the creation is complete. Query the status through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>. <code>READY</code> indicates that the cache is ready. If the status is <code>FAILED</code>, check the <code>error</code> field.
     * The <code>clientToken</code> parameter currently only verifies that the value is not empty and does not guarantee deduplication or recovery of the original acceptance result based on this identifier.</p>
     * 
     * <b>summary</b> : 
     * <p>Resubmits the creation request for an ACR image cache in a specified workspace.</p>
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
     * <p>Retrieves relevant memories semantically from the long-term memory store (MemoryStore) to help agents obtain the information required for subsequent tasks.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves long-term memory from MemoryStore based on semantics.</p>
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
     * <p>Retrieves relevant memories semantically from the long-term memory store (MemoryStore) to help agents obtain the information required for subsequent tasks.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves long-term memory from MemoryStore based on semantics.</p>
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
     * <p>Submits a specified draft version of an agent template for review.
     * If no release pipeline is configured, the version is directly published online.</p>
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
     * <p>Submits a specified draft version of an agent template for review.
     * If no release pipeline is configured, the version is directly published online.</p>
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
     * <p>Modifies the configuration of an access application in a workspace to adjust application integration and identity source settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an access application.</p>
     * 
     * @param tmpReq UpdateAccessApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccessApplicationResponse
     */
    public UpdateAccessApplicationResponse updateAccessApplicationWithOptions(String workspaceId, String applicationId, UpdateAccessApplicationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAccessApplicationShrinkRequest request = new UpdateAccessApplicationShrinkRequest();
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
            new TeaPair("action", "UpdateAccessApplication"),
            new TeaPair("version", "2026-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/access-applications/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccessApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies the configuration of an access application in a workspace to adjust application integration and identity source settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an access application.</p>
     * 
     * @param request UpdateAccessApplicationRequest
     * @return UpdateAccessApplicationResponse
     */
    public UpdateAccessApplicationResponse updateAccessApplication(String workspaceId, String applicationId, UpdateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAccessApplicationWithOptions(workspaceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel.
     * At least one updatable field must be provided.</p>
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
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel.
     * At least one updatable field must be provided.</p>
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
     * <p>Replaces the access credentials for an IM channel to rotate keys or correct authentication configurations.
     * Submit the complete new credentials. The response does not return plaintext secrets.</p>
     * 
     * <b>summary</b> : 
     * <p>Fully updates the channel credentials for a specified IM channel. Secrets are not returned in the response.</p>
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
     * <p>Replaces the access credentials for an IM channel to rotate keys or correct authentication configurations.
     * Submit the complete new credentials. The response does not return plaintext secrets.</p>
     * 
     * <b>summary</b> : 
     * <p>Fully updates the channel credentials for a specified IM channel. Secrets are not returned in the response.</p>
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
     * <p>Updates the business tags, version tags, and visibility scope of a specified agent template. Fields not provided remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags, version tags, and visibility scope of a specified AgentSpec. Fields not provided remain unchanged.</p>
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
     * <p>Updates the business tags, version tags, and visibility scope of a specified agent template. Fields not provided remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags, version tags, and visibility scope of a specified AgentSpec. Fields not provided remain unchanged.</p>
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
     * <p>Updates the API key or service account key collection for an enabled QoderCLI connector.
     * When updating service account keys, existing keys are matched by their record <code>id</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the API key or service account key collection for an enabled QoderCLI connector. When serviceAccountKeys is submitted, the service uses it as the complete updated key collection to add, rename, rotate, and delete keys.</p>
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
     * <p>Updates the API key or service account key collection for an enabled QoderCLI connector.
     * When updating service account keys, existing keys are matched by their record <code>id</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the API key or service account key collection for an enabled QoderCLI connector. When serviceAccountKeys is submitted, the service uses it as the complete updated key collection to add, rename, rotate, and delete keys.</p>
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
     * <p>Updates the content, description, or MCP header application scope of a specified credential.</p>
     * <h3>Update rules</h3>
     * <p>You must modify at least one of the credential content, description, or application scope. When modifying only the application scope, you do not need to submit credentialMetadata or description.</p>
     * <ul>
     * <li>Omit credentialMetadata: The original credential content is retained. If provided, submit a JSON string according to the original credential type.</li>
     * <li>Omit description: The original description is retained.</li>
     * <li>The credential name and credentialType cannot be modified.</li>
     * </ul>
     * <h3>MCP header application scope</h3>
     * <p>Only mcpHeader supports updating the application scope. For apiKey, do not submit resourceScope or resourceRefs.</p>
     * <ul>
     * <li>Omit both the scope and the resource list: The original configuration is retained.</li>
     * <li>Submit resourceRefs: You must also submit resourceScope.</li>
     * <li>resourceScope=ALL: Omit resourceRefs.</li>
     * <li>resourceScope=SPECIFIED: Submit resourceRefs. An empty array [] is allowed during updates. For each item, specify resourceType=mcpServer and resourceId.</li>
     * </ul>
     * <h3>Query results</h3>
     * <p>After the update, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a> to query the current configuration and the masked credential content.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the content, description, or MCP header application scope of a specified credential. Unspecified configurations retain their original values. The credential name and type cannot be modified.</p>
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
     * <p>Updates the content, description, or MCP header application scope of a specified credential.</p>
     * <h3>Update rules</h3>
     * <p>You must modify at least one of the credential content, description, or application scope. When modifying only the application scope, you do not need to submit credentialMetadata or description.</p>
     * <ul>
     * <li>Omit credentialMetadata: The original credential content is retained. If provided, submit a JSON string according to the original credential type.</li>
     * <li>Omit description: The original description is retained.</li>
     * <li>The credential name and credentialType cannot be modified.</li>
     * </ul>
     * <h3>MCP header application scope</h3>
     * <p>Only mcpHeader supports updating the application scope. For apiKey, do not submit resourceScope or resourceRefs.</p>
     * <ul>
     * <li>Omit both the scope and the resource list: The original configuration is retained.</li>
     * <li>Submit resourceRefs: You must also submit resourceScope.</li>
     * <li>resourceScope=ALL: Omit resourceRefs.</li>
     * <li>resourceScope=SPECIFIED: Submit resourceRefs. An empty array [] is allowed during updates. For each item, specify resourceType=mcpServer and resourceId.</li>
     * </ul>
     * <h3>Query results</h3>
     * <p>After the update, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a> to query the current configuration and the masked credential content.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the content, description, or MCP header application scope of a specified credential. Unspecified configurations retain their original values. The credential name and type cannot be modified.</p>
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
     * <p>Updates the deployment artifact or runtime configuration of a custom code or image agent to release new code, images, or configurations.</p>
     * <h3>Update rules</h3>
     * <p>Updates a custom code or image agent in a specified workspace. You must provide at least one top-level field to update. Omitted top-level fields retain their original configurations.
     * The update rules for each configuration are as follows.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Configuration</th>
     * <th>Update method and precautions</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>name</code></td>
     * <td>Omit to retain the original name. The value cannot be <code>null</code> or an empty string.</td>
     * </tr>
     * <tr>
     * <td><code>description</code></td>
     * <td>Omit to retain the original description. Pass <code>null</code> to clear the description.</td>
     * </tr>
     * <tr>
     * <td><code>artifact</code></td>
     * <td>When submitting, specify <code>port</code> and the required fields for the selected source. To retain a custom startup command, also specify <code>entrypoint</code>. <code>code</code> and <code>container</code> are mutually exclusive.</td>
     * </tr>
     * <tr>
     * <td><code>runtime</code></td>
     * <td>When submitting, specify both <code>compute</code> and <code>sessionPolicy</code>. To retain the elastic policy, submit the complete <code>hpa</code>.</td>
     * </tr>
     * <tr>
     * <td><code>environment</code></td>
     * <td>The environment variable list is replaced as a whole. You must include all variables that need to be retained.</td>
     * </tr>
     * <tr>
     * <td><code>network</code></td>
     * <td>When submitting, omitted access items are treated as allowed. To retain access restrictions, specify both <code>accessInternet</code> and <code>accessVpc</code>.</td>
     * </tr>
     * <tr>
     * <td><code>healthCheck</code></td>
     * <td>When submitting, you must specify <code>port</code>. Other unspecified configurations use default values. Pass <code>null</code> to remove the health check.</td>
     * </tr>
     * <tr>
     * <td><code>logging</code></td>
     * <td>When submitting <code>logging.sls</code>, specify non-empty <code>project</code> and <code>logstore</code> at the same time.</td>
     * </tr>
     * <tr>
     * <td><code>protocol</code>, <code>ossMounts</code>, <code>agenticFsMounts</code></td>
     * <td>When submitting, the corresponding list is replaced as a whole. Pass <code>[]</code> to clear the corresponding list. <code>agenticFsMounts</code> does not accept <code>null</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Deployment artifacts</h3>
     * <p>Three deployment methods are supported: code packages, ACR images, and custom images. When updating or switching the deployment method, provide the configuration according to the target method.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Deployment method</th>
     * <th>Configuration requirements</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>ACR image</td>
     * <td>When updating the image tag, also provide <code>artifact.port</code>, as well as <code>type=acr</code>, <code>instanceId</code>, <code>namespace</code>, <code>repo</code>, and <code>tag</code> in <code>artifact.container</code>. To retain a custom startup command, also provide <code>entrypoint</code>.</td>
     * </tr>
     * <tr>
     * <td>Custom image</td>
     * <td>Set <code>artifact.container.type=custom</code>, provide the complete <code>customImage</code>, and provide <code>clientToken</code> in the query parameters. When switching to this method, also specify <code>artifact.port</code>. Do not include ACR instance, namespace, repository, and tag fields in <code>container</code>.</td>
     * </tr>
     * <tr>
     * <td>Code package</td>
     * <td>Provide <code>artifact.port</code>, as well as <code>sourceUri</code>, <code>languageRuntime</code>, and <code>entrypoint</code> in <code>artifact.code</code>. Do not commit <code>container</code> at the same time.</td>
     * </tr>
     * <tr>
     * <td><strong>Custom image</strong></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><code>customImage</code> must include the complete image address <code>image</code> and the independent pull network <code>pullNetwork</code>. The image address does not include a protocol or user information, and supports addresses with tags or digests.</li>
     * <li>For public network pulling, set <code>pullNetwork.type=public</code> and do not include VPC fields. For VPC pulling, set <code>type=vpc</code> and provide <code>vpcId</code>, <code>vSwitchId</code>, and <code>securityGroupId</code> at the same time. The image pull network and the agent runtime network are configured separately.</li>
     * <li>When repository authentication is required, provide non-empty <code>username</code> and <code>password</code> at the same time. For anonymous access, omit both. The response does not return the password.</li>
     * <li>Omitting the entire <code>customImage</code> retains the saved image source. Commit the complete object when updating the custom image source. You do not need to resubmit this object when only adjusting the runtime configuration.</li>
     * <li>Custom images and code packages do not support enabling <code>useImageCache</code>. The value in the final configuration must be <code>false</code>. When this field is omitted for a custom image, it is treated as <code>false</code>. When switching to a code package, if the original configuration is <code>true</code>, you must explicitly change it to <code>false</code>. When updating other sources, omitting this field retains the original value.
     * <strong>Code package</strong></li>
     * <li>Supports ZIP or TAR.GZ. The compressed package size cannot exceed <code>500000000</code> bytes. Dependencies are packaged by the invoker. The platform does not execute online builds or install dependencies.</li>
     * <li>Query the active <code>languageRuntime</code> values by invoking <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListAgentCodeRuntimes">ListAgentCodeRuntimes</a>.</li>
     * <li><code>sourceUri</code> supports <code>oss://</code> addresses or HTTPS object addresses of standard OSS public domain name, including signed URLs.</li>
     * <li>For local code packages, first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageUploadUrl">GetAgentCodePackageUploadUrl</a>, upload the file according to the response information, and then commit the returned <code>sourceUri</code>.</li>
     * <li>The new source is verified for read permissions, objects, and size before acceptance, and is transferred to a fixed copy on the platform. If the transfer failed, the current agent configuration is not saved. Common updates can reuse the saved fixed code package address.</li>
     * </ul>
     * <h3>Runtime configuration and elasticity</h3>
     * <p>Omitting the entire <code>runtime</code> retains the original runtime configuration. When submitting <code>runtime</code>, you must specify both <code>compute</code> and <code>sessionPolicy</code>.
     * If you submit <code>runtime</code> but omit <code>hpa</code>, or omit some fields in <code>hpa</code>, the unspecified items use the following default values. <strong>To retain the existing elastic policy, submit the complete <code>hpa</code>.</strong></p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether elastic scaling is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances, which cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds.</td>
     * </tr>
     * <tr>
     * <td>The upper and lower limits of the number of instances are configuration values. Query the current number of instances through <code>sandboxPhaseCounts</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When <code>sessionPolicy.type=ISOLATED_HEADER_FIELD</code>, you must specify a valid HTTP request header name <code>headerName</code>. Do not specify <code>headerName</code> for other session policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Network and mounts</h3>
     * <p>Omitting the entire <code>network</code> retains the original configuration. When submitting this object, omitted access items are treated as allowed on the agent side, and actual access is restricted by the workspace network configuration.
     * To retain the original restrictions, submit both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code> at the same time. Do not submit only one of them.
     * The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. When updating either list, you must include all mount items that need to be retained in the list. The two lists are updated separately. You can use <code>agenticFsMounts=[]</code> to clear AgenticFS mounts, but you cannot use <code>null</code> to clear them.
     * In this operation, ACR images, custom images, and code packages all use the same user mount target rules: <code>mountPath</code> is the absolute path in the container, such as <code>/data/train</code>, and must not conflict with platform reserved directories. Mount targets must not be duplicated or form parent-child directory overwrites.</p>
     * <h3>Environment variables</h3>
     * <p>Omitting the entire <code>environment</code> retains the original configuration. When submitting <code>environment.variables</code>, the original list is replaced as a whole with the current list. You must include all variables that need to be retained.
     * The following methods all clear the environment variables configured by the user:</p>
     * <ul>
     * <li><code>environment.variables=[]</code>.</li>
     * <li><code>environment=null</code>.</li>
     * <li>Submit <code>environment</code> but omit <code>variables</code>, such as <code>environment={}</code>.
     * Variable names must be non-empty and unique in the list. Variable values must be strings, and empty strings are allowed.</li>
     * </ul>
     * <h3>Health checks and logs</h3>
     * <p>Omitting the entire <code>healthCheck</code> retains the original configuration. Pass <code>null</code> to remove the health check. When submitting this object, you must specify <code>port</code>. Other unspecified items use the following default values.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>path</code></td>
     * <td><code>/healthz</code></td>
     * </tr>
     * <tr>
     * <td><code>intervalSeconds</code></td>
     * <td><code>10</code> seconds</td>
     * </tr>
     * <tr>
     * <td><code>timeoutSeconds</code></td>
     * <td><code>2</code> seconds</td>
     * </tr>
     * <tr>
     * <td><code>unhealthyThreshold</code></td>
     * <td><code>3</code> times</td>
     * </tr>
     * <tr>
     * <td>The health check port ranges from 1 to 65535. Health Check Interval, timeout period, and failure threshold must be positive integers, and the timeout period must be less than Health Check Interval. Do not submit <code>healthyThreshold</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When configuring log delivery, <code>logging.sls.project</code> and <code>logging.sls.logstore</code> must be provided at the same time and cannot be empty.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Asynchronous results and retries</h3>
     * <p><code>success=true</code> indicates that the update request has been accepted. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query the configuration processing result.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>effectiveSpecVersion</code></td>
     * <td>The effective configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestExecutionError</code></td>
     * <td>The reason why the latest configuration is waiting for a retry or fails to be executed, and whether to automatically retry.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>A snapshot of the number of instances counted by phase.</td>
     * </tr>
     * <tr>
     * <td>When <code>latestVersionStatus</code> is <code>pending</code>, <code>processing</code>, or <code>waiting_retry</code>, you can continue to query later. <code>succeeded</code> indicates that the configuration is processed successfully. When the value is <code>failed</code>, troubleshoot the configuration based on <code>latestExecutionError</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When explicitly submitting <code>customImage</code> or explicitly setting <code>artifact.container.type=custom</code>, you must provide <code>clientToken</code> in the query parameters. You can also optionally pass this parameter when updating ACR images or code packages to reuse the acceptance result of the same submission. The identifier is 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When retrying the same submission, reuse the original <code>clientToken</code>. The service returns the existing acceptance result based on the tenant, workspace, and this identifier. Use a new identifier when modifying the submission content.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a custom code or image agent in a specified workspace and executes the update asynchronously. Omitted top-level fields retain their original configurations. You can call GetCustomAgent to query the update result.</p>
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
     * <p>Updates the deployment artifact or runtime configuration of a custom code or image agent to release new code, images, or configurations.</p>
     * <h3>Update rules</h3>
     * <p>Updates a custom code or image agent in a specified workspace. You must provide at least one top-level field to update. Omitted top-level fields retain their original configurations.
     * The update rules for each configuration are as follows.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Configuration</th>
     * <th>Update method and precautions</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>name</code></td>
     * <td>Omit to retain the original name. The value cannot be <code>null</code> or an empty string.</td>
     * </tr>
     * <tr>
     * <td><code>description</code></td>
     * <td>Omit to retain the original description. Pass <code>null</code> to clear the description.</td>
     * </tr>
     * <tr>
     * <td><code>artifact</code></td>
     * <td>When submitting, specify <code>port</code> and the required fields for the selected source. To retain a custom startup command, also specify <code>entrypoint</code>. <code>code</code> and <code>container</code> are mutually exclusive.</td>
     * </tr>
     * <tr>
     * <td><code>runtime</code></td>
     * <td>When submitting, specify both <code>compute</code> and <code>sessionPolicy</code>. To retain the elastic policy, submit the complete <code>hpa</code>.</td>
     * </tr>
     * <tr>
     * <td><code>environment</code></td>
     * <td>The environment variable list is replaced as a whole. You must include all variables that need to be retained.</td>
     * </tr>
     * <tr>
     * <td><code>network</code></td>
     * <td>When submitting, omitted access items are treated as allowed. To retain access restrictions, specify both <code>accessInternet</code> and <code>accessVpc</code>.</td>
     * </tr>
     * <tr>
     * <td><code>healthCheck</code></td>
     * <td>When submitting, you must specify <code>port</code>. Other unspecified configurations use default values. Pass <code>null</code> to remove the health check.</td>
     * </tr>
     * <tr>
     * <td><code>logging</code></td>
     * <td>When submitting <code>logging.sls</code>, specify non-empty <code>project</code> and <code>logstore</code> at the same time.</td>
     * </tr>
     * <tr>
     * <td><code>protocol</code>, <code>ossMounts</code>, <code>agenticFsMounts</code></td>
     * <td>When submitting, the corresponding list is replaced as a whole. Pass <code>[]</code> to clear the corresponding list. <code>agenticFsMounts</code> does not accept <code>null</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Deployment artifacts</h3>
     * <p>Three deployment methods are supported: code packages, ACR images, and custom images. When updating or switching the deployment method, provide the configuration according to the target method.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Deployment method</th>
     * <th>Configuration requirements</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>ACR image</td>
     * <td>When updating the image tag, also provide <code>artifact.port</code>, as well as <code>type=acr</code>, <code>instanceId</code>, <code>namespace</code>, <code>repo</code>, and <code>tag</code> in <code>artifact.container</code>. To retain a custom startup command, also provide <code>entrypoint</code>.</td>
     * </tr>
     * <tr>
     * <td>Custom image</td>
     * <td>Set <code>artifact.container.type=custom</code>, provide the complete <code>customImage</code>, and provide <code>clientToken</code> in the query parameters. When switching to this method, also specify <code>artifact.port</code>. Do not include ACR instance, namespace, repository, and tag fields in <code>container</code>.</td>
     * </tr>
     * <tr>
     * <td>Code package</td>
     * <td>Provide <code>artifact.port</code>, as well as <code>sourceUri</code>, <code>languageRuntime</code>, and <code>entrypoint</code> in <code>artifact.code</code>. Do not commit <code>container</code> at the same time.</td>
     * </tr>
     * <tr>
     * <td><strong>Custom image</strong></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><code>customImage</code> must include the complete image address <code>image</code> and the independent pull network <code>pullNetwork</code>. The image address does not include a protocol or user information, and supports addresses with tags or digests.</li>
     * <li>For public network pulling, set <code>pullNetwork.type=public</code> and do not include VPC fields. For VPC pulling, set <code>type=vpc</code> and provide <code>vpcId</code>, <code>vSwitchId</code>, and <code>securityGroupId</code> at the same time. The image pull network and the agent runtime network are configured separately.</li>
     * <li>When repository authentication is required, provide non-empty <code>username</code> and <code>password</code> at the same time. For anonymous access, omit both. The response does not return the password.</li>
     * <li>Omitting the entire <code>customImage</code> retains the saved image source. Commit the complete object when updating the custom image source. You do not need to resubmit this object when only adjusting the runtime configuration.</li>
     * <li>Custom images and code packages do not support enabling <code>useImageCache</code>. The value in the final configuration must be <code>false</code>. When this field is omitted for a custom image, it is treated as <code>false</code>. When switching to a code package, if the original configuration is <code>true</code>, you must explicitly change it to <code>false</code>. When updating other sources, omitting this field retains the original value.
     * <strong>Code package</strong></li>
     * <li>Supports ZIP or TAR.GZ. The compressed package size cannot exceed <code>500000000</code> bytes. Dependencies are packaged by the invoker. The platform does not execute online builds or install dependencies.</li>
     * <li>Query the active <code>languageRuntime</code> values by invoking <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListAgentCodeRuntimes">ListAgentCodeRuntimes</a>.</li>
     * <li><code>sourceUri</code> supports <code>oss://</code> addresses or HTTPS object addresses of standard OSS public domain name, including signed URLs.</li>
     * <li>For local code packages, first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageUploadUrl">GetAgentCodePackageUploadUrl</a>, upload the file according to the response information, and then commit the returned <code>sourceUri</code>.</li>
     * <li>The new source is verified for read permissions, objects, and size before acceptance, and is transferred to a fixed copy on the platform. If the transfer failed, the current agent configuration is not saved. Common updates can reuse the saved fixed code package address.</li>
     * </ul>
     * <h3>Runtime configuration and elasticity</h3>
     * <p>Omitting the entire <code>runtime</code> retains the original runtime configuration. When submitting <code>runtime</code>, you must specify both <code>compute</code> and <code>sessionPolicy</code>.
     * If you submit <code>runtime</code> but omit <code>hpa</code>, or omit some fields in <code>hpa</code>, the unspecified items use the following default values. <strong>To retain the existing elastic policy, submit the complete <code>hpa</code>.</strong></p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether elastic scaling is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances, which cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds.</td>
     * </tr>
     * <tr>
     * <td>The upper and lower limits of the number of instances are configuration values. Query the current number of instances through <code>sandboxPhaseCounts</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When <code>sessionPolicy.type=ISOLATED_HEADER_FIELD</code>, you must specify a valid HTTP request header name <code>headerName</code>. Do not specify <code>headerName</code> for other session policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Network and mounts</h3>
     * <p>Omitting the entire <code>network</code> retains the original configuration. When submitting this object, omitted access items are treated as allowed on the agent side, and actual access is restricted by the workspace network configuration.
     * To retain the original restrictions, submit both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code> at the same time. Do not submit only one of them.
     * The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. When updating either list, you must include all mount items that need to be retained in the list. The two lists are updated separately. You can use <code>agenticFsMounts=[]</code> to clear AgenticFS mounts, but you cannot use <code>null</code> to clear them.
     * In this operation, ACR images, custom images, and code packages all use the same user mount target rules: <code>mountPath</code> is the absolute path in the container, such as <code>/data/train</code>, and must not conflict with platform reserved directories. Mount targets must not be duplicated or form parent-child directory overwrites.</p>
     * <h3>Environment variables</h3>
     * <p>Omitting the entire <code>environment</code> retains the original configuration. When submitting <code>environment.variables</code>, the original list is replaced as a whole with the current list. You must include all variables that need to be retained.
     * The following methods all clear the environment variables configured by the user:</p>
     * <ul>
     * <li><code>environment.variables=[]</code>.</li>
     * <li><code>environment=null</code>.</li>
     * <li>Submit <code>environment</code> but omit <code>variables</code>, such as <code>environment={}</code>.
     * Variable names must be non-empty and unique in the list. Variable values must be strings, and empty strings are allowed.</li>
     * </ul>
     * <h3>Health checks and logs</h3>
     * <p>Omitting the entire <code>healthCheck</code> retains the original configuration. Pass <code>null</code> to remove the health check. When submitting this object, you must specify <code>port</code>. Other unspecified items use the following default values.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>path</code></td>
     * <td><code>/healthz</code></td>
     * </tr>
     * <tr>
     * <td><code>intervalSeconds</code></td>
     * <td><code>10</code> seconds</td>
     * </tr>
     * <tr>
     * <td><code>timeoutSeconds</code></td>
     * <td><code>2</code> seconds</td>
     * </tr>
     * <tr>
     * <td><code>unhealthyThreshold</code></td>
     * <td><code>3</code> times</td>
     * </tr>
     * <tr>
     * <td>The health check port ranges from 1 to 65535. Health Check Interval, timeout period, and failure threshold must be positive integers, and the timeout period must be less than Health Check Interval. Do not submit <code>healthyThreshold</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When configuring log delivery, <code>logging.sls.project</code> and <code>logging.sls.logstore</code> must be provided at the same time and cannot be empty.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Asynchronous results and retries</h3>
     * <p><code>success=true</code> indicates that the update request has been accepted. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query the configuration processing result.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>effectiveSpecVersion</code></td>
     * <td>The effective configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestExecutionError</code></td>
     * <td>The reason why the latest configuration is waiting for a retry or fails to be executed, and whether to automatically retry.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>A snapshot of the number of instances counted by phase.</td>
     * </tr>
     * <tr>
     * <td>When <code>latestVersionStatus</code> is <code>pending</code>, <code>processing</code>, or <code>waiting_retry</code>, you can continue to query later. <code>succeeded</code> indicates that the configuration is processed successfully. When the value is <code>failed</code>, troubleshoot the configuration based on <code>latestExecutionError</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When explicitly submitting <code>customImage</code> or explicitly setting <code>artifact.container.type=custom</code>, you must provide <code>clientToken</code> in the query parameters. You can also optionally pass this parameter when updating ACR images or code packages to reuse the acceptance result of the same submission. The identifier is 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When retrying the same submission, reuse the original <code>clientToken</code>. The service returns the existing acceptance result based on the tenant, workspace, and this identifier. Use a new identifier when modifying the submission content.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a custom code or image agent in a specified workspace and executes the update asynchronously. Omitted top-level fields retain their original configurations. You can call GetCustomAgent to query the update result.</p>
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
     * <p>Updates the model, instruction, tool, or skill configurations saved on the platform side for a managed agent to adjust its capability configurations after integration.</p>
     * <h3>Update rules</h3>
     * <p>Provide at least one updatable field. Omitted top-level fields retain their original configurations. You can set description=null to clear the description. The tools and skills fields are replaced as a whole upon submission. You must include the items to be retained, or pass [] to clear the corresponding explicit lists.</p>
     * <h3>Switch model sources</h3>
     * <ul>
     * <li>To switch to PLATFORM, provide modelSource=PLATFORM and a valid model configuration, including the model connection ID and model name.</li>
     * <li>To switch to RUNTIME, change the Settings to modelSource=RUNTIME and do not commit the platform model. The original platform model configuration is removed when the source is switched.
     * When a template is used, configurations belonging to the template such as instructions are read from the template. A successful update indicates that the request is accepted. Invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a> to query the configuration version and external accessed state. The clientToken parameter does not provide idempotence guarantees at this time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the model source, instructions, tools, and skills of a managed agent, and processes the configuration asynchronously.</p>
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
     * <p>Updates the model, instruction, tool, or skill configurations saved on the platform side for a managed agent to adjust its capability configurations after integration.</p>
     * <h3>Update rules</h3>
     * <p>Provide at least one updatable field. Omitted top-level fields retain their original configurations. You can set description=null to clear the description. The tools and skills fields are replaced as a whole upon submission. You must include the items to be retained, or pass [] to clear the corresponding explicit lists.</p>
     * <h3>Switch model sources</h3>
     * <ul>
     * <li>To switch to PLATFORM, provide modelSource=PLATFORM and a valid model configuration, including the model connection ID and model name.</li>
     * <li>To switch to RUNTIME, change the Settings to modelSource=RUNTIME and do not commit the platform model. The original platform model configuration is removed when the source is switched.
     * When a template is used, configurations belonging to the template such as instructions are read from the template. A successful update indicates that the request is accepted. Invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a> to query the configuration version and external accessed state. The clientToken parameter does not provide idempotence guarantees at this time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the model source, instructions, tools, and skills of a managed agent, and processes the configuration asynchronously.</p>
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
     * <p>Modifies the logon or directory configuration of a bound enterprise identity provider to update enterprise application credentials, adjust synchronized departments, or configure custom single sign-on.</p>
     * <h3>Select the configuration to modify</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Identity provider</th>
     * <th>Updatable content</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>DingTalk (DingTalk), Feishu (Feishu)</td>
     * <td>Enterprise application credentials metadata, logon switch loginEnabled, directory change synchronization switch syncEnabled, and synchronization scope syncScope. You must submit at least one item.</td>
     * </tr>
     * <tr>
     * <td>Custom identity provider (CustomSSO)</td>
     * <td>SAML protocol protocol, logon configuration saml, and logon switch loginEnabled. SCIM-based user synchronization is configured separately by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Update DingTalk or Feishu</h3>
     * <p>metadata is updated by field: submit only the fields that need to be modified. Omitted fields and existing keys remain unchanged. Provided values must be non-empty strings. When you enable directory change synchronization, the configuration must include encryptKey and verificationToken.
     * To adjust synchronized departments:
     * <strong>Step 1:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a> to query and select departments.
     * <strong>Step 2:</strong> Save syncScope by using this operation. If you omit this field or pass null, the current scope is retained.
     * <strong>Step 3:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to wait for the configuration processing to complete, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> to synchronize users based on the new scope.
     * Saving the scope does not automatically trigger a full synchronization. syncEnabled controls subsequent directory change events. The initial synchronization and manual synchronization are executed separately.</p>
     * <h3>Configure custom single sign-on</h3>
     * <p>CustomSSO uses the SAML protocol to allow users to log on through the enterprise identity system. First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the access information of AgentCore and configure it in the enterprise identity system. Then, fill in the enterprise-side information in saml.
     * Choose one of the following two methods:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Method</th>
     * <th>Required configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Import metadata</td>
     * <td>metadataXml: a single IdP metadata XML text exported from the enterprise identity provider, with a maximum size of 1 MiB. Enter the XML content instead of a download URL or file path.</td>
     * </tr>
     * <tr>
     * <td>Manual entry</td>
     * <td>Provide entityId, loginUrl, bindingType, and x509Certificates at the same time. Use an HTTPS logon URL and a valid signing certificate. Set bindingType to HTTP-Redirect or HTTP-POST. You can provide up to two certificates.</td>
     * </tr>
     * <tr>
     * <td>The entityId cannot be changed after it is saved. If the XML contains both binding methods, HTTP-POST and its corresponding URL take precedence.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>After saving the configuration, set loginEnabled=true to enable logon. You can also enable it when submitting a valid SAML configuration. Setting it to false disables logon and retains the existing configuration.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Confirm that the configuration takes effect</h3>
     * <p>After the request is accepted, UPDATING is usually returned. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to query the progress. READY indicates that the configuration processing is complete. If it fails, check the returned status and configuration.
     * If the request times out, query the current configuration and processing status first, and then decide whether to retry. Query the SCIM processing result by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the logon configuration of a bound identity provider in a specified workspace. DingTalk and Feishu support the logon switch, incremental synchronization switch, application configuration, and synchronization scope. CustomSSO supports SAML configuration and the logon switch. Updates take effect asynchronously. Call GetIdentityProvider to query the status.</p>
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
     * <p>Modifies the logon or directory configuration of a bound enterprise identity provider to update enterprise application credentials, adjust synchronized departments, or configure custom single sign-on.</p>
     * <h3>Select the configuration to modify</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Identity provider</th>
     * <th>Updatable content</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>DingTalk (DingTalk), Feishu (Feishu)</td>
     * <td>Enterprise application credentials metadata, logon switch loginEnabled, directory change synchronization switch syncEnabled, and synchronization scope syncScope. You must submit at least one item.</td>
     * </tr>
     * <tr>
     * <td>Custom identity provider (CustomSSO)</td>
     * <td>SAML protocol protocol, logon configuration saml, and logon switch loginEnabled. SCIM-based user synchronization is configured separately by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Update DingTalk or Feishu</h3>
     * <p>metadata is updated by field: submit only the fields that need to be modified. Omitted fields and existing keys remain unchanged. Provided values must be non-empty strings. When you enable directory change synchronization, the configuration must include encryptKey and verificationToken.
     * To adjust synchronized departments:
     * <strong>Step 1:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a> to query and select departments.
     * <strong>Step 2:</strong> Save syncScope by using this operation. If you omit this field or pass null, the current scope is retained.
     * <strong>Step 3:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to wait for the configuration processing to complete, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> to synchronize users based on the new scope.
     * Saving the scope does not automatically trigger a full synchronization. syncEnabled controls subsequent directory change events. The initial synchronization and manual synchronization are executed separately.</p>
     * <h3>Configure custom single sign-on</h3>
     * <p>CustomSSO uses the SAML protocol to allow users to log on through the enterprise identity system. First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the access information of AgentCore and configure it in the enterprise identity system. Then, fill in the enterprise-side information in saml.
     * Choose one of the following two methods:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Method</th>
     * <th>Required configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Import metadata</td>
     * <td>metadataXml: a single IdP metadata XML text exported from the enterprise identity provider, with a maximum size of 1 MiB. Enter the XML content instead of a download URL or file path.</td>
     * </tr>
     * <tr>
     * <td>Manual entry</td>
     * <td>Provide entityId, loginUrl, bindingType, and x509Certificates at the same time. Use an HTTPS logon URL and a valid signing certificate. Set bindingType to HTTP-Redirect or HTTP-POST. You can provide up to two certificates.</td>
     * </tr>
     * <tr>
     * <td>The entityId cannot be changed after it is saved. If the XML contains both binding methods, HTTP-POST and its corresponding URL take precedence.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>After saving the configuration, set loginEnabled=true to enable logon. You can also enable it when submitting a valid SAML configuration. Setting it to false disables logon and retains the existing configuration.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Confirm that the configuration takes effect</h3>
     * <p>After the request is accepted, UPDATING is usually returned. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to query the progress. READY indicates that the configuration processing is complete. If it fails, check the returned status and configuration.
     * If the request times out, query the current configuration and processing status first, and then decide whether to retry. Query the SCIM processing result by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the logon configuration of a bound identity provider in a specified workspace. DingTalk and Feishu support the logon switch, incremental synchronization switch, application configuration, and synchronization scope. CustomSSO supports SAML configuration and the logon switch. Updates take effect asynchronously. Call GetIdentityProvider to query the status.</p>
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
     * <p>Enables or disables SCIM user synchronization for AgentCore. When enabled, all existing users in the shared user pool are fully imported into the workspace. Users in the user pool are provisioned by the enterprise identity system through SCIM.</p>
     * <h3>Preparations</h3>
     * <p><strong>Step 1:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to enable the receiving endpoint and obtain the receiving URL and a valid token.
     * <strong>Step 2:</strong> Complete the SCIM configuration, connection test, and user assignment in the enterprise identity system.
     * <strong>Step 3:</strong> Call this operation and set syncEnabled to true.</p>
     * <pre><code class="language-http">PUT /workspaces/{workspaceId}/scim-provisioning
     * {&quot;syncEnabled&quot;:true}
     * </code></pre>
     * <p>When the enabling task is executed, the system checks whether the receiving endpoint is enabled and whether valid credentials exist. If no users are provisioned in the enterprise identity system, the initial import may succeed but contain no user records.</p>
     * <h3>Impact of disabling</h3>
     * <p>Setting syncEnabled to false disables user synchronization and the upstream SCIM receiving endpoint, but retains the imported users, existing credentials, and SAML logon configuration.
     * To re-enable the feature later, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to prepare the receiving endpoint first, and then enable synchronization.</p>
     * <h3>Verify the operation result</h3>
     * <p>After this operation accepts the request, it executes the enabling or disabling task in the background. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a> to query the progress:</p>
     * <ul>
     * <li>syncEnabled indicates whether synchronization is expected to be enabled or disabled.</li>
     * <li>operationStatus indicates the execution result of the most recent operation.</li>
     * <li>The status field in the query operation comprehensively indicates the current stage of SCIM, such as pending configuration, processing, available, or disabled.
     * If the operation fails, the saved syncEnabled value is not automatically rolled back. Verify the configuration based on the operation result before deciding on subsequent actions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables SCIM user synchronization independently. When enabled, an initial full import is executed asynchronously, and the result can be queried by calling GetIdentityProviderSCIM. The SAML logon configuration is retained.</p>
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
     * <p>Enables or disables SCIM user synchronization for AgentCore. When enabled, all existing users in the shared user pool are fully imported into the workspace. Users in the user pool are provisioned by the enterprise identity system through SCIM.</p>
     * <h3>Preparations</h3>
     * <p><strong>Step 1:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to enable the receiving endpoint and obtain the receiving URL and a valid token.
     * <strong>Step 2:</strong> Complete the SCIM configuration, connection test, and user assignment in the enterprise identity system.
     * <strong>Step 3:</strong> Call this operation and set syncEnabled to true.</p>
     * <pre><code class="language-http">PUT /workspaces/{workspaceId}/scim-provisioning
     * {&quot;syncEnabled&quot;:true}
     * </code></pre>
     * <p>When the enabling task is executed, the system checks whether the receiving endpoint is enabled and whether valid credentials exist. If no users are provisioned in the enterprise identity system, the initial import may succeed but contain no user records.</p>
     * <h3>Impact of disabling</h3>
     * <p>Setting syncEnabled to false disables user synchronization and the upstream SCIM receiving endpoint, but retains the imported users, existing credentials, and SAML logon configuration.
     * To re-enable the feature later, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to prepare the receiving endpoint first, and then enable synchronization.</p>
     * <h3>Verify the operation result</h3>
     * <p>After this operation accepts the request, it executes the enabling or disabling task in the background. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a> to query the progress:</p>
     * <ul>
     * <li>syncEnabled indicates whether synchronization is expected to be enabled or disabled.</li>
     * <li>operationStatus indicates the execution result of the most recent operation.</li>
     * <li>The status field in the query operation comprehensively indicates the current stage of SCIM, such as pending configuration, processing, available, or disabled.
     * If the operation fails, the saved syncEnabled value is not automatically rolled back. Verify the configuration based on the operation result before deciding on subsequent actions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables SCIM user synchronization independently. When enabled, an initial full import is executed asynchronously, and the result can be queried by calling GetIdentityProviderSCIM. The SAML logon configuration is retained.</p>
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
     * <b>description</b> :
     * <p>Updates the model, instructions, skills, or runtime configuration of a managed Harness agent to adjust the capabilities and runtime behavior of an existing agent.</p>
     * <h3>Update rules</h3>
     * <p>Provide at least one updatable field. Omitted top-level fields retain their original configurations. You can set <code>description=null</code> to clear the description.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Configuration</th>
     * <th>Update method</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>harness</code></td>
     * <td>The type cannot be changed. When updating the qodercli account binding, keep the original <code>type</code> and submit the corresponding <code>configuration</code>.</td>
     * </tr>
     * <tr>
     * <td><code>model</code></td>
     * <td>Provide a model configuration that matches the current Harness. For qwenpaw, specify the model connection ID and model name. For qodercli, use the available model identifier of the connector.</td>
     * </tr>
     * <tr>
     * <td><code>runtime</code></td>
     * <td>Specify both <code>compute</code> and <code>sessionPolicy</code> when submitting. Omitting the entire object retains the original runtime configuration.</td>
     * </tr>
     * <tr>
     * <td><code>tools</code>, <code>skills</code>, <code>promptVariables</code>, <code>subAgents</code></td>
     * <td>The corresponding lists are entirely replaced upon submission. You must include the items to be retained. Pass <code>[]</code> to clear the corresponding explicit lists.</td>
     * </tr>
     * <tr>
     * <td><code>environment</code></td>
     * <td>The variable list and credential reference list are entirely replaced respectively. Submit the items to be retained together.</td>
     * </tr>
     * <tr>
     * <td><code>network</code></td>
     * <td>Specify both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code> when submitting.</td>
     * </tr>
     * <tr>
     * <td><code>ossMounts</code>, <code>agenticFsMounts</code></td>
     * <td>Entirely replaced respectively. Pass <code>[]</code> to clear the corresponding lists. <code>agenticFsMounts</code> does not accept <code>null</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Harnesses, templates, and skills</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Harness</th>
     * <th>Model and connector configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>qwenpaw</code></td>
     * <td>This type is used by default if <code>harness</code> is omitted during creation. Set <code>model.modelConnectionId</code> to the workspace model connection ID, and set <code>model.modelName</code> to the name of the model created under this connection.</td>
     * </tr>
     * <tr>
     * <td><code>qodercli</code></td>
     * <td>The qodercli connector must be enabled in the workspace. Set <code>model.modelConnectionId</code> to the model identifier returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectorModels">ListConnectorModels</a>. <code>model.modelName</code> can be omitted.</td>
     * </tr>
     * <tr>
     * <td><code>harness</code> is an object, such as <code>{&quot;type&quot;:&quot;qwenpaw&quot;}</code>. For qodercli, set <code>harness.configuration.connectorServiceAccountKey</code> to the account key record ID returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectors">ListConnectors</a>, not the original service account key. This field can be omitted if there is only one key record, but must be specified if there are multiple records. <code>connectorServiceAccountName</code> is the account name. Do not specify these two binding fields for qwenpaw.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>skills</code> uses the skill names in the workspace AI Registry. If <code>sourceType=REFERENCE</code>, versions are referenced by <code>versionSelector</code>: use <code>LABEL</code> with a tag name, or <code>VERSION</code> with a specific version number. If the selector is omitted, <code>LABEL/latest</code> is used. If <code>sourceType=STATIC</code>, static files bundled with the package are used, and no version selector is provided.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>For <code>template.aiRegistry</code>, specify the agent template name and an optional version. If the version is omitted during creation, the published version is resolved and fixed. When a template is used, <code>instruction</code>, <code>promptVariables</code>, and <code>subAgents</code> are derived from the template, and the corresponding fields in the current request do not take effect. Explicit skills and template skills are recorded separately. You can query the target and effective versions through <code>configuredSkills</code> and <code>skills</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Elasticity and instances</h3>
     * <p>If <code>runtime</code> is committed but <code>hpa</code> or some of its fields are omitted, the following default values are used for unspecified items. To retain the existing elastic policy, commit the complete <code>hpa</code>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Value and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether elastic scaling is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If you only modify instructions, models, or skills, you can omit the entire <code>runtime</code> to keep the original runtime configuration unchanged. The minimum and maximum numbers of instances are the configuration border. You can query the actual number through <code>sandboxPhaseCounts</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Environment and mounts</h3>
     * <p>Omitting the entire <code>environment</code> retains the original configuration. Submitting <code>environment={}</code> or <code>environment=null</code> clears the environment configuration. Environment variable values must be strings, and variable names must be non-empty and unique.
     * The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. The mount target <code>mountPath</code> uses an absolute path in the container, such as <code>/data/train</code>. It cannot conflict with platform reserved directories, and cannot be duplicated or form parent-child directory overwrites.
     * The <code>path</code> for OSS mounts must be a non-empty directory prefix in the bucket. For AgenticFS mounts, <code>server</code> is the AccessPoint domain name, without a protocol, port, or path. <code>path</code> is an existing non-empty relative directory in the AccessPoint. You cannot mount the root directory of the AccessPoint. If <code>readOnly</code> is omitted, the default value is <code>false</code>.</p>
     * <h3>Query update results</h3>
     * <p>A successful response indicates that the update request has been accepted. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query <code>latestSpecVersion</code>, <code>latestVersionStatus</code>, <code>status</code>, and <code>sandboxPhaseCounts</code> to confirm the configuration processing and instance status. <code>clientToken</code> does not provide idempotence guarantees at this time.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the model, instructions, skills, and runtime configuration of a managed Harness agent and executes the update asynchronously. Omitted top-level fields retain their original configurations.</p>
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
     * <b>description</b> :
     * <p>Updates the model, instructions, skills, or runtime configuration of a managed Harness agent to adjust the capabilities and runtime behavior of an existing agent.</p>
     * <h3>Update rules</h3>
     * <p>Provide at least one updatable field. Omitted top-level fields retain their original configurations. You can set <code>description=null</code> to clear the description.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Configuration</th>
     * <th>Update method</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>harness</code></td>
     * <td>The type cannot be changed. When updating the qodercli account binding, keep the original <code>type</code> and submit the corresponding <code>configuration</code>.</td>
     * </tr>
     * <tr>
     * <td><code>model</code></td>
     * <td>Provide a model configuration that matches the current Harness. For qwenpaw, specify the model connection ID and model name. For qodercli, use the available model identifier of the connector.</td>
     * </tr>
     * <tr>
     * <td><code>runtime</code></td>
     * <td>Specify both <code>compute</code> and <code>sessionPolicy</code> when submitting. Omitting the entire object retains the original runtime configuration.</td>
     * </tr>
     * <tr>
     * <td><code>tools</code>, <code>skills</code>, <code>promptVariables</code>, <code>subAgents</code></td>
     * <td>The corresponding lists are entirely replaced upon submission. You must include the items to be retained. Pass <code>[]</code> to clear the corresponding explicit lists.</td>
     * </tr>
     * <tr>
     * <td><code>environment</code></td>
     * <td>The variable list and credential reference list are entirely replaced respectively. Submit the items to be retained together.</td>
     * </tr>
     * <tr>
     * <td><code>network</code></td>
     * <td>Specify both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code> when submitting.</td>
     * </tr>
     * <tr>
     * <td><code>ossMounts</code>, <code>agenticFsMounts</code></td>
     * <td>Entirely replaced respectively. Pass <code>[]</code> to clear the corresponding lists. <code>agenticFsMounts</code> does not accept <code>null</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Harnesses, templates, and skills</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Harness</th>
     * <th>Model and connector configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>qwenpaw</code></td>
     * <td>This type is used by default if <code>harness</code> is omitted during creation. Set <code>model.modelConnectionId</code> to the workspace model connection ID, and set <code>model.modelName</code> to the name of the model created under this connection.</td>
     * </tr>
     * <tr>
     * <td><code>qodercli</code></td>
     * <td>The qodercli connector must be enabled in the workspace. Set <code>model.modelConnectionId</code> to the model identifier returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectorModels">ListConnectorModels</a>. <code>model.modelName</code> can be omitted.</td>
     * </tr>
     * <tr>
     * <td><code>harness</code> is an object, such as <code>{&quot;type&quot;:&quot;qwenpaw&quot;}</code>. For qodercli, set <code>harness.configuration.connectorServiceAccountKey</code> to the account key record ID returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectors">ListConnectors</a>, not the original service account key. This field can be omitted if there is only one key record, but must be specified if there are multiple records. <code>connectorServiceAccountName</code> is the account name. Do not specify these two binding fields for qwenpaw.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>skills</code> uses the skill names in the workspace AI Registry. If <code>sourceType=REFERENCE</code>, versions are referenced by <code>versionSelector</code>: use <code>LABEL</code> with a tag name, or <code>VERSION</code> with a specific version number. If the selector is omitted, <code>LABEL/latest</code> is used. If <code>sourceType=STATIC</code>, static files bundled with the package are used, and no version selector is provided.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>For <code>template.aiRegistry</code>, specify the agent template name and an optional version. If the version is omitted during creation, the published version is resolved and fixed. When a template is used, <code>instruction</code>, <code>promptVariables</code>, and <code>subAgents</code> are derived from the template, and the corresponding fields in the current request do not take effect. Explicit skills and template skills are recorded separately. You can query the target and effective versions through <code>configuredSkills</code> and <code>skills</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Elasticity and instances</h3>
     * <p>If <code>runtime</code> is committed but <code>hpa</code> or some of its fields are omitted, the following default values are used for unspecified items. To retain the existing elastic policy, commit the complete <code>hpa</code>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Value and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether elastic scaling is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If you only modify instructions, models, or skills, you can omit the entire <code>runtime</code> to keep the original runtime configuration unchanged. The minimum and maximum numbers of instances are the configuration border. You can query the actual number through <code>sandboxPhaseCounts</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Environment and mounts</h3>
     * <p>Omitting the entire <code>environment</code> retains the original configuration. Submitting <code>environment={}</code> or <code>environment=null</code> clears the environment configuration. Environment variable values must be strings, and variable names must be non-empty and unique.
     * The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. The mount target <code>mountPath</code> uses an absolute path in the container, such as <code>/data/train</code>. It cannot conflict with platform reserved directories, and cannot be duplicated or form parent-child directory overwrites.
     * The <code>path</code> for OSS mounts must be a non-empty directory prefix in the bucket. For AgenticFS mounts, <code>server</code> is the AccessPoint domain name, without a protocol, port, or path. <code>path</code> is an existing non-empty relative directory in the AccessPoint. You cannot mount the root directory of the AccessPoint. If <code>readOnly</code> is omitted, the default value is <code>false</code>.</p>
     * <h3>Query update results</h3>
     * <p>A successful response indicates that the update request has been accepted. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query <code>latestSpecVersion</code>, <code>latestVersionStatus</code>, <code>status</code>, and <code>sandboxPhaseCounts</code> to confirm the configuration processing and instance status. <code>clientToken</code> does not provide idempotence guarantees at this time.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the model, instructions, skills, and runtime configuration of a managed Harness agent and executes the update asynchronously. Omitted top-level fields retain their original configurations.</p>
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
     * <p>Updates the address, description, authentication, or Swagger configuration of an MCP service. The service type and protocol cannot be modified after creation.
     * The update process is executed asynchronously. After submission, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> to query the processing result. The <code>clientToken</code> parameter does not currently provide idempotency guarantees. If the request result is not confirmed, query the current configuration and status first.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update process is asynchronous.</p>
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
     * <p>Updates the address, description, authentication, or Swagger configuration of an MCP service. The service type and protocol cannot be modified after creation.
     * The update process is executed asynchronously. After submission, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> to query the processing result. The <code>clientToken</code> parameter does not currently provide idempotency guarantees. If the request result is not confirmed, query the current configuration and status first.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update process is asynchronous.</p>
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
     * <p>Updates parameters based on the marketplace template bound to the MCP service to adjust the configuration of the templated service.
     * Updates the parameters exposed by the schema using the same template version bound during MCP creation, without upgrading the template version.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates MCP parameters based on a template.</p>
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
     * <p>Updates parameters based on the marketplace template bound to the MCP service to adjust the configuration of the templated service.
     * Updates the parameters exposed by the schema using the same template version bound during MCP creation, without upgrading the template version.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates MCP parameters based on a template.</p>
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
     * <p>Updates the long-term memory text or metadata based on the memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the long-term memory text or metadata based on the memory ID.</p>
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
     * <p>Updates the long-term memory text or metadata based on the memory ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the long-term memory text or metadata based on the memory ID.</p>
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
     * <p>Updates the mutable configurations of a long-term memory store to adjust the settings of an existing memory store.</p>
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
     * <p>Updates the mutable configurations of a long-term memory store to adjust the settings of an existing memory store.</p>
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
     * <p>Updates the description, context length, maximum output length, or capability configuration of a model.</p>
     * <h3>Update rules</h3>
     * <ul>
     * <li>Provide at least one non-null field among description, contextSize, maxTokens, and capabilities.</li>
     * <li>Omitted fields or fields passed as null retain their original values.</li>
     * <li>The capabilities object is replaced as a whole. Unsubmitted capabilities within the object are treated as false.</li>
     * </ul>
     * <h3>Impact on agents</h3>
     * <p>After contextSize, maxTokens, or capabilities actually change, the platform asynchronously refreshes the managed Harness agents that reference this model, as well as the managed agents that use platform models (modelSource=PLATFORM). Modifying only the description or repeatedly submitting the same configuration does not trigger a refresh.
     * A successful response indicates that the model configuration has been saved. Verify the configuration by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetModel">GetModel</a>, and then check whether the configuration takes effect by calling the corresponding agent details API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description, context token limit, maximum output token count, or capability configuration of a specified model.</p>
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
     * <p>Updates the description, context length, maximum output length, or capability configuration of a model.</p>
     * <h3>Update rules</h3>
     * <ul>
     * <li>Provide at least one non-null field among description, contextSize, maxTokens, and capabilities.</li>
     * <li>Omitted fields or fields passed as null retain their original values.</li>
     * <li>The capabilities object is replaced as a whole. Unsubmitted capabilities within the object are treated as false.</li>
     * </ul>
     * <h3>Impact on agents</h3>
     * <p>After contextSize, maxTokens, or capabilities actually change, the platform asynchronously refreshes the managed Harness agents that reference this model, as well as the managed agents that use platform models (modelSource=PLATFORM). Modifying only the description or repeatedly submitting the same configuration does not trigger a refresh.
     * A successful response indicates that the model configuration has been saved. Verify the configuration by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetModel">GetModel</a>, and then check whether the configuration takes effect by calling the corresponding agent details API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description, context token limit, maximum output token count, or capability configuration of a specified model.</p>
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
     * <b>description</b> :
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publishing task. The invocation protocol cannot be modified after creation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publishing task. The invocation protocol cannot be modified after creation.</p>
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
     * <b>description</b> :
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publishing task. The invocation protocol cannot be modified after creation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publishing task. The invocation protocol cannot be modified after creation.</p>
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
     * <p>Updates the business tags of a specified skill. Other attributes that are not specified remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags of a specified skill. Other attributes that are not specified remain unchanged.</p>
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
     * <p>Updates the business tags of a specified skill. Other attributes that are not specified remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags of a specified skill. Other attributes that are not specified remain unchanged.</p>
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
     * <p>Updates the version labels and their mappings for a specified skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the version labels and their mappings for a specified skill.</p>
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
     * <p>Updates the version labels and their mappings for a specified skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the version labels and their mappings for a specified skill.</p>
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
     * <b>description</b> :
     * <p>Updates the description and members of a specified team.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description and members of a specified team. When users or agents are provided, the corresponding member lists are replaced based on full overwrite semantics. Member lists that are not provided remain unchanged. The team name cannot be modified after creation.</p>
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
     * <b>description</b> :
     * <p>Updates the description and members of a specified team.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description and members of a specified team. When users or agents are provided, the corresponding member lists are replaced based on full overwrite semantics. Member lists that are not provided remain unchanged. The team name cannot be modified after creation.</p>
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
     * <b>description</b> :
     * <p>Updates the display name, email address, or note of a specified user.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the display name, email address, or note of a specified user. At least one of displayName, email, and note must be specified. Unspecified properties remain unchanged. The username cannot be modified after creation.</p>
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
     * <b>description</b> :
     * <p>Updates the display name, email address, or note of a specified user.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the display name, email address, or note of a specified user. At least one of displayName, email, and note must be specified. Unspecified properties remain unchanged. The username cannot be modified after creation.</p>
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
     * <p>Modifies the name or network configuration of a workspace to adjust workspace information and the private network access environment for agents.
     * The workspace must be in the <code>Initialized</code> state. To enable VPC networking, set <code>Enabled</code> in the network configuration to <code>true</code>, and provide both <code>VpcId</code> and at least one <code>VSwitchIds</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or network configuration of a workspace. Only workspaces in the Initialized state can be updated. Status, TenantId, and RegionId are maintained by the server and cannot be modified through this operation.</p>
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
     * <p>Modifies the name or network configuration of a workspace to adjust workspace information and the private network access environment for agents.
     * The workspace must be in the <code>Initialized</code> state. To enable VPC networking, set <code>Enabled</code> in the network configuration to <code>true</code>, and provide both <code>VpcId</code> and at least one <code>VSwitchIds</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or network configuration of a workspace. Only workspaces in the Initialized state can be updated. Status, TenantId, and RegionId are maintained by the server and cannot be modified through this operation.</p>
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
     * <p>Retrieves an uploaded agent template ZIP package from OSS, parses the package, and imports the agent template into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses the package, and imports the AgentSpec into the current workspace.</p>
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
     * <p>Retrieves an uploaded agent template ZIP package from OSS, parses the package, and imports the agent template into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses the package, and imports the AgentSpec into the current workspace.</p>
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
     * <p>Imports a skill into the current workspace by retrieving and parsing an uploaded skill ZIP package from OSS.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports a skill into the current workspace by retrieving and parsing an uploaded skill ZIP package from OSS.</p>
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
     * <p>Imports a skill into the current workspace by retrieving and parsing an uploaded skill ZIP package from OSS.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports a skill into the current workspace by retrieving and parsing an uploaded skill ZIP package from OSS.</p>
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
     * <p>Checks the read conditions and package information of a specified OSS object before submitting the code package for deployment, and obtains the source URI for subsequent deployment.</p>
     * <h3>Request and validation scope</h3>
     * <p>In the JSON request body, specify <code>ossBucketName</code> and the complete <code>ossObjectName</code>. Do not specify the HTTPS download URL. The object extension must be ZIP or TAR.GZ, and the compressed size must be between 1 and 500,000,000 bytes.
     * This operation uses the workspace role to check the object metadata and read permissions, and returns the <code>sourceUri</code>, file name, size, and format.</p>
     * <h3>Subsequent deployment</h3>
     * <p>Passing the validation indicates that the object check is successful, but does not mean that the archive content is complete or ready to start. Submit the returned <code>sourceUri</code> to <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a>. The system will recheck and save a fixed copy upon submission.
     * This operation is an optional precheck and is not a required step for creation or update.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates the read conditions of the workspace role for a specified OSS code package object and returns the source URI and package information.</p>
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
     * <p>Checks the read conditions and package information of a specified OSS object before submitting the code package for deployment, and obtains the source URI for subsequent deployment.</p>
     * <h3>Request and validation scope</h3>
     * <p>In the JSON request body, specify <code>ossBucketName</code> and the complete <code>ossObjectName</code>. Do not specify the HTTPS download URL. The object extension must be ZIP or TAR.GZ, and the compressed size must be between 1 and 500,000,000 bytes.
     * This operation uses the workspace role to check the object metadata and read permissions, and returns the <code>sourceUri</code>, file name, size, and format.</p>
     * <h3>Subsequent deployment</h3>
     * <p>Passing the validation indicates that the object check is successful, but does not mean that the archive content is complete or ready to start. Submit the returned <code>sourceUri</code> to <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a>. The system will recheck and save a fixed copy upon submission.
     * This operation is an optional precheck and is not a required step for creation or update.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates the read conditions of the workspace role for a specified OSS code package object and returns the source URI and package information.</p>
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
     * <p>Queries whether the read authorization for the code package source bucket is bound to the workspace resource role to determine whether supplementary authorization is required.</p>
     * <h3>Query results</h3>
     * <p><code>ossBucketName</code> is passed as a query parameter. <code>authorizationStatus=AUTHORIZED</code> indicates that the policy is bound, and <code>UNAUTHORIZED</code> indicates that it is not bound.
     * A bound policy does not mean that a specific code package object definitely exists or is readable. To check the object, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ValidateAgentCodePackageFromOss">ValidateAgentCodePackageFromOss</a>. To obtain the authorization link, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageOssRamAuthorizeUrl">GetAgentCodePackageOssRamAuthorizeUrl</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding status of the authorization policy for the code package source bucket to the current workspace resource role.</p>
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
     * <p>Queries whether the read authorization for the code package source bucket is bound to the workspace resource role to determine whether supplementary authorization is required.</p>
     * <h3>Query results</h3>
     * <p><code>ossBucketName</code> is passed as a query parameter. <code>authorizationStatus=AUTHORIZED</code> indicates that the policy is bound, and <code>UNAUTHORIZED</code> indicates that it is not bound.
     * A bound policy does not mean that a specific code package object definitely exists or is readable. To check the object, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ValidateAgentCodePackageFromOss">ValidateAgentCodePackageFromOss</a>. To obtain the authorization link, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageOssRamAuthorizeUrl">GetAgentCodePackageOssRamAuthorizeUrl</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding status of the authorization policy for the code package source bucket to the current workspace resource role.</p>
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
     * <p>Verifies Qoder service account keys for a specified site to check whether the credentials are available before enabling or updating a connector. You can submit multiple keys at the same time. The response returns a list of invalid service account keys.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether one or more Qoder service account keys are available at a specified site. This operation does not save the keys or modify the connector status.</p>
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
     * <p>Verifies Qoder service account keys for a specified site to check whether the credentials are available before enabling or updating a connector. You can submit multiple keys at the same time. The response returns a list of invalid service account keys.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether one or more Qoder service account keys are available at a specified site. This operation does not save the keys or modify the connector status.</p>
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
     * <p>Queries the authorization status of a workspace resource role for a specified ACR Enterprise Edition image repository to determine whether to proceed with image preparation or grant additional authorizations.</p>
     * <h3>Request parameters</h3>
     * <p><code>acrInstanceId</code>, <code>namespace</code>, and <code>repository</code> use query parameters and must be consistent with the targets used when obtaining the authorization URL.</p>
     * <h3>Authorization and deployment</h3>
     * <p><code>authorizationStatus=AUTHORIZED</code> indicates that the target authorization for the selected role is satisfied, and <code>UNAUTHORIZED</code> indicates that it is not yet satisfied. If authorization is required, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAcrRamAuthorizeUrl">GetWorkspaceAcrRamAuthorizeUrl</a> and confirm on the RAM page.
     * The authorization status is checked separately from whether the specific image tag exists and whether the pull network is reachable.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the authorization status of a workspace resource role for a specified ACR Enterprise Edition repository.</p>
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
     * <p>Queries the authorization status of a workspace resource role for a specified ACR Enterprise Edition image repository to determine whether to proceed with image preparation or grant additional authorizations.</p>
     * <h3>Request parameters</h3>
     * <p><code>acrInstanceId</code>, <code>namespace</code>, and <code>repository</code> use query parameters and must be consistent with the targets used when obtaining the authorization URL.</p>
     * <h3>Authorization and deployment</h3>
     * <p><code>authorizationStatus=AUTHORIZED</code> indicates that the target authorization for the selected role is satisfied, and <code>UNAUTHORIZED</code> indicates that it is not yet satisfied. If authorization is required, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAcrRamAuthorizeUrl">GetWorkspaceAcrRamAuthorizeUrl</a> and confirm on the RAM page.
     * The authorization status is checked separately from whether the specific image tag exists and whether the pull network is reachable.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the authorization status of a workspace resource role for a specified ACR Enterprise Edition repository.</p>
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
     * <p>Checks whether the workspace has been granted access to the specified AgenticFS access point for subsequent Agent file mount configurations.
     * <a href="https://www.alibabacloud.com/help/en/nas/product-overview/agenticfs-overview">AgenticFS</a> is a storage type of File Storage NAS designed for AI agents. Access points provide mount entries for file spaces.</p>
     * <h3>Query and what to do next</h3>
     * <p>For the <code>server</code> query parameter, specify the access point domain name without the protocol, port, or path. Keep it consistent with the value used when obtaining the authorization link.</p>
     * <table>
     * <thead>
     * <tr>
     * <th><code>authorizationStatus</code></th>
     * <th>What to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>AUTHORIZED</code></td>
     * <td>Authorization is complete. You can continue to configure <code>agenticFsMounts</code> for the agent.</td>
     * </tr>
     * <tr>
     * <td><code>UNAUTHORIZED</code></td>
     * <td>Obtain the link through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a>, complete the authorization, and then query again.</td>
     * </tr>
     * <tr>
     * <td>After authorization is complete, you must still commit the mount configuration in the agent and check the configuration processing result through the agent details. The mount folder must already exist, the access point must be located in the VPC associated with the workspace, and VPC access must be enabled for the agent.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the workspace resource role has been granted access to the specified NAS (AgenticFS) access point for subsequent Agent mount configurations.</p>
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
     * <p>Checks whether the workspace has been granted access to the specified AgenticFS access point for subsequent Agent file mount configurations.
     * <a href="https://www.alibabacloud.com/help/en/nas/product-overview/agenticfs-overview">AgenticFS</a> is a storage type of File Storage NAS designed for AI agents. Access points provide mount entries for file spaces.</p>
     * <h3>Query and what to do next</h3>
     * <p>For the <code>server</code> query parameter, specify the access point domain name without the protocol, port, or path. Keep it consistent with the value used when obtaining the authorization link.</p>
     * <table>
     * <thead>
     * <tr>
     * <th><code>authorizationStatus</code></th>
     * <th>What to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>AUTHORIZED</code></td>
     * <td>Authorization is complete. You can continue to configure <code>agenticFsMounts</code> for the agent.</td>
     * </tr>
     * <tr>
     * <td><code>UNAUTHORIZED</code></td>
     * <td>Obtain the link through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a>, complete the authorization, and then query again.</td>
     * </tr>
     * <tr>
     * <td>After authorization is complete, you must still commit the mount configuration in the agent and check the configuration processing result through the agent details. The mount folder must already exist, the access point must be located in the VPC associated with the workspace, and VPC access must be enabled for the agent.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the workspace resource role has been granted access to the specified NAS (AgenticFS) access point for subsequent Agent mount configurations.</p>
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
     * <p>Verifies the OSS mount authorization for a workspace, or checks and updates the authorization status of the default OSS storage for the workspace.</p>
     * <h3>Two query scopes</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Query parameter <code>bucketName</code></th>
     * <th>Behavior</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Bucket name provided</td>
     * <td>Checks the mount authorization of the bucket for the workspace resource role without modifying the default OSS binding.</td>
     * </tr>
     * <tr>
     * <td>Omitted</td>
     * <td>Checks the authorization of the default private OSS storage for the workspace and updates its authorization status.</td>
     * </tr>
     * </tbody></table>
     * <h3>Return statuses</h3>
     * <p><code>AUTHORIZED</code> indicates that authorization is granted, <code>UNAUTHORIZED</code> indicates that authorization is not granted, and <code>NOT_REQUIRED</code> indicates that authorization is not required. The authorization status does not indicate whether a specific mount directory exists or an instance has completed the mount.
     * If the goal is to read from a code package source, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyAgentCodePackageOssRamAuthorization">VerifyAgentCodePackageOssRamAuthorization</a>. Do not mix code package verification with runtime directory mounting.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the OSS mount authorization for a workspace, or checks and updates the authorization status of the default OSS storage for the workspace.</p>
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
     * <p>Verifies the OSS mount authorization for a workspace, or checks and updates the authorization status of the default OSS storage for the workspace.</p>
     * <h3>Two query scopes</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Query parameter <code>bucketName</code></th>
     * <th>Behavior</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Bucket name provided</td>
     * <td>Checks the mount authorization of the bucket for the workspace resource role without modifying the default OSS binding.</td>
     * </tr>
     * <tr>
     * <td>Omitted</td>
     * <td>Checks the authorization of the default private OSS storage for the workspace and updates its authorization status.</td>
     * </tr>
     * </tbody></table>
     * <h3>Return statuses</h3>
     * <p><code>AUTHORIZED</code> indicates that authorization is granted, <code>UNAUTHORIZED</code> indicates that authorization is not granted, and <code>NOT_REQUIRED</code> indicates that authorization is not required. The authorization status does not indicate whether a specific mount directory exists or an instance has completed the mount.
     * If the goal is to read from a code package source, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyAgentCodePackageOssRamAuthorization">VerifyAgentCodePackageOssRamAuthorization</a>. Do not mix code package verification with runtime directory mounting.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the OSS mount authorization for a workspace, or checks and updates the authorization status of the default OSS storage for the workspace.</p>
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
