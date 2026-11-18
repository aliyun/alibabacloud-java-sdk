// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701;

import com.aliyun.tea.*;
import com.aliyun.ada20260701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Ada";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ada", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>If <code>Params._meta.promptId</code> is provided, only that turn is canceled. If omitted, the current execution of the session is canceled. To avoid affecting other turns, use the actual <code>promptId</code> obtained from the response stream instead of the request <code>Id</code>. A cancellation receipt does not mean the turn has ended, nor does it revoke external operations that have already occurred. After calling this operation, continue reading the original response stream or resume reading through <code>LoadAgentSession</code> to confirm the desired state of the target turn. Disconnecting the stream connection cannot replace a cancellation request.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a session execution or cancels a specified turn.</p>
     * 
     * @param tmpReq CancelAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAgentSessionResponse
     */
    public CancelAgentSessionResponse cancelAgentSessionWithOptions(CancelAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelAgentSessionShrinkRequest request = new CancelAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>If <code>Params._meta.promptId</code> is provided, only that turn is canceled. If omitted, the current execution of the session is canceled. To avoid affecting other turns, use the actual <code>promptId</code> obtained from the response stream instead of the request <code>Id</code>. A cancellation receipt does not mean the turn has ended, nor does it revoke external operations that have already occurred. After calling this operation, continue reading the original response stream or resume reading through <code>LoadAgentSession</code> to confirm the desired state of the target turn. Disconnecting the stream connection cannot replace a cancellation request.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a session execution or cancels a specified turn.</p>
     * 
     * @param request CancelAgentSessionRequest
     * @return CancelAgentSessionResponse
     */
    public CancelAgentSessionResponse cancelAgentSession(CancelAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Name is the unique identifier of the agent within the current tenant. It can contain only letters, digits, underscores, and hyphens, and must be 1 to 128 characters in length. It cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an agent.</p>
     * 
     * @param request CreateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBases)) {
            body.put("KnowledgeBases", request.knowledgeBases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skills)) {
            body.put("Skills", request.skills);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemPrompt)) {
            body.put("SystemPrompt", request.systemPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("Tools", request.tools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Name is the unique identifier of the agent within the current tenant. It can contain only letters, digits, underscores, and hyphens, and must be 1 to 128 characters in length. It cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an agent.</p>
     * 
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, obtain the name of an agent accessible to the current identity. After the session is created, save <code>JsonRpcResponse.result.sessionId</code> and use it as <code>Params.sessionId</code> for subsequent operations such as <code>PromptAgentSession</code> and <code>LoadAgentSession</code>.
     * You can set the approval mode during creation. If omitted, the mode defaults to <code>default</code>. The availability of <code>yolo</code> depends on the target agent. If it is not supported, an error is returned. This mode does not change the caller\&quot;s permissions or replace business Q&amp;A. To retry the same creation request, reuse the same <code>clientToken</code> and the same business parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a text session for a specified agent and obtains the session ID required for subsequent calls.</p>
     * 
     * @param tmpReq CreateAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentSessionResponse
     */
    public CreateAgentSessionResponse createAgentSessionWithOptions(CreateAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentSessionShrinkRequest request = new CreateAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, obtain the name of an agent accessible to the current identity. After the session is created, save <code>JsonRpcResponse.result.sessionId</code> and use it as <code>Params.sessionId</code> for subsequent operations such as <code>PromptAgentSession</code> and <code>LoadAgentSession</code>.
     * You can set the approval mode during creation. If omitted, the mode defaults to <code>default</code>. The availability of <code>yolo</code> depends on the target agent. If it is not supported, an error is returned. This mode does not change the caller\&quot;s permissions or replace business Q&amp;A. To retry the same creation request, reuse the same <code>clientToken</code> and the same business parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a text session for a specified agent and obtains the session ID required for subsequent calls.</p>
     * 
     * @param request CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     */
    public CreateAgentSessionResponse createAgentSession(CreateAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creation rules:<ul>
     * <li><code>Name</code> must be unique within the current tenant and cannot be the same as an official skill.</li>
     * <li><code>Description</code> and <code>Metadata</code> are required. <code>Metadata</code> must contain one and only one valid content source. Different sources cannot be mixed.</li>
     * <li>After the skill is created, you can modify it by calling <code>UpdateSkill</code>.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li><code>skillMd</code>: Directly enter the Markdown body. No YAML front matter is required. Use <code>Name</code> and <code>Description</code> for the name and description.</li>
     * <li><code>transitId</code>: Upload and confirm a ZIP file through Transit. The call sequence is as follows:<ol>
     * <li>Call <code>CreateTransitUploadPolicy</code> and pass in <code>FileShowName</code> to obtain <code>TransitId</code>, <code>FilePath</code>, and <code>PolicyInfo</code>.</li>
     * <li>Use <code>PolicyInfo</code> and <code>FilePath</code> to upload the ZIP file to Object Storage Service (OSS).</li>
     * <li>Call <code>ConfirmTransitUpload</code> and pass in <code>TransitId</code>. Proceed with creation only if <code>Confirmed=true</code> is returned.</li>
     * <li>Call <code>CreateSkill</code> and pass the confirmed <code>TransitId</code> in <code>Metadata.transitId</code>.</li>
     * </ol>
     * </li>
     * <li><code>bundleUrl</code>: Pass in a public HTTPS ZIP direct link. The platform downloads the file and saves it as an artifact. The original URL is not saved or echoed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a skill.</p>
     * 
     * @param request CreateSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillResponse
     */
    public CreateSkillResponse createSkillWithOptions(CreateSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("Metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkill"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creation rules:<ul>
     * <li><code>Name</code> must be unique within the current tenant and cannot be the same as an official skill.</li>
     * <li><code>Description</code> and <code>Metadata</code> are required. <code>Metadata</code> must contain one and only one valid content source. Different sources cannot be mixed.</li>
     * <li>After the skill is created, you can modify it by calling <code>UpdateSkill</code>.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li><code>skillMd</code>: Directly enter the Markdown body. No YAML front matter is required. Use <code>Name</code> and <code>Description</code> for the name and description.</li>
     * <li><code>transitId</code>: Upload and confirm a ZIP file through Transit. The call sequence is as follows:<ol>
     * <li>Call <code>CreateTransitUploadPolicy</code> and pass in <code>FileShowName</code> to obtain <code>TransitId</code>, <code>FilePath</code>, and <code>PolicyInfo</code>.</li>
     * <li>Use <code>PolicyInfo</code> and <code>FilePath</code> to upload the ZIP file to Object Storage Service (OSS).</li>
     * <li>Call <code>ConfirmTransitUpload</code> and pass in <code>TransitId</code>. Proceed with creation only if <code>Confirmed=true</code> is returned.</li>
     * <li>Call <code>CreateSkill</code> and pass the confirmed <code>TransitId</code> in <code>Metadata.transitId</code>.</li>
     * </ol>
     * </li>
     * <li><code>bundleUrl</code>: Pass in a public HTTPS ZIP direct link. The platform downloads the file and saves it as an artifact. The original URL is not saved or echoed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a skill.</p>
     * 
     * @param request CreateSkillRequest
     * @return CreateSkillResponse
     */
    public CreateSkillResponse createSkill(CreateSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The Network parameter can be set to public or internal to generate a public network or same-region internal network upload address, respectively. The default value is public.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li>PolicyInfo contains short-term upload authorization information and is only used for the current file upload. Do not log, permanently store, or forward it to other users.</li>
     * <li>ExpireMs specifies the validity period of the upload policy and the transit record in milliseconds, not an absolute timestamp. The default and maximum values are both 604800000 (7 days), and the minimum value is 1000 (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>You can call GetTransitMeta to read ExpireAt and obtain the expiration time of the transit record. Confirming the upload and querying the record do not extend its validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates credentials for direct file upload. Callers can use the returned upload policy to upload files directly to object storage.</p>
     * 
     * @param request CreateTransitUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitUploadPolicyResponse
     */
    public CreateTransitUploadPolicyResponse createTransitUploadPolicyWithOptions(CreateTransitUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireMs)) {
            body.put("ExpireMs", request.expireMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileShowName)) {
            body.put("FileShowName", request.fileShowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathPrefix)) {
            body.put("PathPrefix", request.pathPrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitUploadPolicy"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitUploadPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The Network parameter can be set to public or internal to generate a public network or same-region internal network upload address, respectively. The default value is public.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li>PolicyInfo contains short-term upload authorization information and is only used for the current file upload. Do not log, permanently store, or forward it to other users.</li>
     * <li>ExpireMs specifies the validity period of the upload policy and the transit record in milliseconds, not an absolute timestamp. The default and maximum values are both 604800000 (7 days), and the minimum value is 1000 (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>You can call GetTransitMeta to read ExpireAt and obtain the expiration time of the transit record. Confirming the upload and querying the record do not extend its validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates credentials for direct file upload. Callers can use the returned upload policy to upload files directly to object storage.</p>
     * 
     * @param request CreateTransitUploadPolicyRequest
     * @return CreateTransitUploadPolicyResponse
     */
    public CreateTransitUploadPolicyResponse createTransitUploadPolicy(CreateTransitUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitUploadPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creators can delete the agents they created.</li>
     * <li>After deletion, the agent can no longer be queried, updated, or run.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified agent.</p>
     * 
     * @param request DeleteAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creators can delete the agents they created.</li>
     * <li>After deletion, the agent can no longer be queried, updated, or run.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified agent.</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A session cannot be directly deleted while it is being executed or waiting for interaction. You must first call <code>CancelAgentSession</code> and continue reading the original response stream, or resume reading through <code>LoadAgentSession</code>. Delete the session only after confirming that the target turn has ended.
     * A successful deletion indicates that the session deletion operation is complete, but it does not mean that external operations that have already occurred are rolled back. Deleting a session does not delete the associated agent or assistant.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an idle session that is no longer needed.</p>
     * 
     * @param tmpReq DeleteAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentSessionResponse
     */
    public DeleteAgentSessionResponse deleteAgentSessionWithOptions(DeleteAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAgentSessionShrinkRequest request = new DeleteAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>A session cannot be directly deleted while it is being executed or waiting for interaction. You must first call <code>CancelAgentSession</code> and continue reading the original response stream, or resume reading through <code>LoadAgentSession</code>. Delete the session only after confirming that the target turn has ended.
     * A successful deletion indicates that the session deletion operation is complete, but it does not mean that external operations that have already occurred are rolled back. Deleting a session does not delete the associated agent or assistant.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an idle session that is no longer needed.</p>
     * 
     * @param request DeleteAgentSessionRequest
     * @return DeleteAgentSessionResponse
     */
    public DeleteAgentSessionResponse deleteAgentSession(DeleteAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion permissions:<ul>
     * <li>You can delete only custom skills that you have permission to modify.</li>
     * <li>You must be the creator of the skill or the root account of the tenant that has permission to manage the tenant-level skill. Official skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>This operation performs a soft delete. After the skill is deleted, the <code>GetSkill</code> and <code>ListSkills</code> operations no longer return the skill, and you can create a new skill with the same name.</li>
     * <li>Recovery is not supported. You cannot delete a skill multiple times or delete a non-existent skill.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Soft-deletes a skill that the current caller has permission to modify.</p>
     * 
     * @param request DeleteSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkillWithOptions(DeleteSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkill"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion permissions:<ul>
     * <li>You can delete only custom skills that you have permission to modify.</li>
     * <li>You must be the creator of the skill or the root account of the tenant that has permission to manage the tenant-level skill. Official skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>This operation performs a soft delete. After the skill is deleted, the <code>GetSkill</code> and <code>ListSkills</code> operations no longer return the skill, and you can create a new skill with the same name.</li>
     * <li>Recovery is not supported. You cannot delete a skill multiple times or delete a non-existent skill.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Soft-deletes a skill that the current caller has permission to modify.</p>
     * 
     * @param request DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkill(DeleteSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can retrieve agents created by yourself, agents visible within the current tenant, and official agents provided by the platform.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries agents visible to the current identity by name.</p>
     * 
     * @param request GetAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can retrieve agents created by yourself, agents visible within the current tenant, and official agents provided by the platform.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries agents visible to the current identity by name.</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For <code>Params.sessionId</code>, use the session ID returned by <code>CreateAgentSession</code> or <code>ListAgentSessions</code>. The business result is located in <code>JsonRpcResponse.result</code>, which is of type <code>any</code>. The fields within the object retain their actual casing.
     * This operation provides a session summary and does not return the complete message history, pending interactions, or the final state of real-time turns. For history and disconnection recovery, use <code>LoadAgentSession</code>. For approvals and Q&amp;A, read from the streaming notifications of <code>PromptAgentSession</code> or <code>LoadAgentSession</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries session details such as the title, associated agent, and core timestamps based on the session ID.</p>
     * 
     * @param tmpReq GetAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSessionResponse
     */
    public GetAgentSessionResponse getAgentSessionWithOptions(GetAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentSessionShrinkRequest request = new GetAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            query.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For <code>Params.sessionId</code>, use the session ID returned by <code>CreateAgentSession</code> or <code>ListAgentSessions</code>. The business result is located in <code>JsonRpcResponse.result</code>, which is of type <code>any</code>. The fields within the object retain their actual casing.
     * This operation provides a session summary and does not return the complete message history, pending interactions, or the final state of real-time turns. For history and disconnection recovery, use <code>LoadAgentSession</code>. For approvals and Q&amp;A, read from the streaming notifications of <code>PromptAgentSession</code> or <code>LoadAgentSession</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries session details such as the title, associated agent, and core timestamps based on the session ID.</p>
     * 
     * @param request GetAgentSessionRequest
     * @return GetAgentSessionResponse
     */
    public GetAgentSessionResponse getAgentSession(GetAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use the <code>sessionId</code> returned by CreateAgentSession to query the configurations. This operation does not send messages or replay session history.</li>
     * <li>Read the current model from <code>JsonRpcResponse.result.modelId</code>. To modify it, call SetAgentSessionModel.</li>
     * <li>The thinking level is an optional advanced configuration. The supported levels and current values are subject to the actual response of this operation, which may vary across different agents, models, and sessions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the model and thinking level configurations currently used by the session.</p>
     * 
     * @param tmpReq GetAgentSessionModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentSessionModelResponse
     */
    public GetAgentSessionModelResponse getAgentSessionModelWithOptions(GetAgentSessionModelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentSessionModelShrinkRequest request = new GetAgentSessionModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            query.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentSessionModel"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentSessionModelResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use the <code>sessionId</code> returned by CreateAgentSession to query the configurations. This operation does not send messages or replay session history.</li>
     * <li>Read the current model from <code>JsonRpcResponse.result.modelId</code>. To modify it, call SetAgentSessionModel.</li>
     * <li>The thinking level is an optional advanced configuration. The supported levels and current values are subject to the actual response of this operation, which may vary across different agents, models, and sessions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the model and thinking level configurations currently used by the session.</p>
     * 
     * @param request GetAgentSessionModelRequest
     * @return GetAgentSessionModelResponse
     */
    public GetAgentSessionModelResponse getAgentSessionModel(GetAgentSessionModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentSessionModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query target:<ul>
     * <li>Queries by <code>Name</code>. Querying by <code>SkillId</code> is not supported.</li>
     * <li>Prioritizes returning skills with the same name that are visible to the caller under the current tenant. If no visible records are found, it queries official skills with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the skill has an accessible artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the artifact does not exist, access is denied, or URL generation fails, the skill query still succeeds, but the download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not saved and will not be echoed back through this API.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the skills visible to the current caller by name.</p>
     * 
     * @param request GetSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkillWithOptions(GetSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkill"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query target:<ul>
     * <li>Queries by <code>Name</code>. Querying by <code>SkillId</code> is not supported.</li>
     * <li>Prioritizes returning skills with the same name that are visible to the caller under the current tenant. If no visible records are found, it queries official skills with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the skill has an accessible artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the artifact does not exist, access is denied, or URL generation fails, the skill query still succeeds, but the download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not saved and will not be echoed back through this API.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the skills visible to the current caller by name.</p>
     * 
     * @param request GetSkillRequest
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkill(GetSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least one of TransitId and FilePath. If both are provided, TransitId takes precedence.</li>
     * <li>Use the TransitId returned by CreateTransitUploadPolicy. TransitId is a temporary capability identifier in the file upload process. Do not forward it to unrelated users.</li>
     * <li>FilePath is the opaque object path returned by CreateTransitUploadPolicy. Callers must use it as is. Do not parse, modify, or concatenate it.</li>
     * <li>When you query by FilePath, an error is returned if the record does not exist or is inaccessible to the current caller.</li>
     * <li>ExpireMs specifies the validity period of the download URL in milliseconds. The default value is 900000, which indicates 15 minutes. The validity period is rounded down to the nearest second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>ExpireAt is the expiration time of the transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming the upload do not extend the validity period of the record.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a transit file, such as the upload status, file size, and expiration time, and retrieves a temporary download URL on demand.</p>
     * 
     * @param request GetTransitMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTransitMetaResponse
     */
    public GetTransitMetaResponse getTransitMetaWithOptions(GetTransitMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireMs)) {
            query.put("ExpireMs", request.expireMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitId)) {
            query.put("TransitId", request.transitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTransitMeta"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTransitMetaResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least one of TransitId and FilePath. If both are provided, TransitId takes precedence.</li>
     * <li>Use the TransitId returned by CreateTransitUploadPolicy. TransitId is a temporary capability identifier in the file upload process. Do not forward it to unrelated users.</li>
     * <li>FilePath is the opaque object path returned by CreateTransitUploadPolicy. Callers must use it as is. Do not parse, modify, or concatenate it.</li>
     * <li>When you query by FilePath, an error is returned if the record does not exist or is inaccessible to the current caller.</li>
     * <li>ExpireMs specifies the validity period of the download URL in milliseconds. The default value is 900000, which indicates 15 minutes. The validity period is rounded down to the nearest second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>ExpireAt is the expiration time of the transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming the upload do not extend the validity period of the record.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a transit file, such as the upload status, file size, and expiration time, and retrieves a temporary download URL on demand.</p>
     * 
     * @param request GetTransitMetaRequest
     * @return GetTransitMetaResponse
     */
    public GetTransitMetaResponse getTransitMeta(GetTransitMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTransitMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the global workflow configurations for a tenant and a region. The content is sensitive information. In addition to the permissions required for this operation, the ada:DownloadFile permission is also required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the global workflow configurations.</p>
     * 
     * @param request GetWorkflowGlobalEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowGlobalEnvResponse
     */
    public GetWorkflowGlobalEnvResponse getWorkflowGlobalEnvWithOptions(GetWorkflowGlobalEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowGlobalEnv"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowGlobalEnvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the global workflow configurations for a tenant and a region. The content is sensitive information. In addition to the permissions required for this operation, the ada:DownloadFile permission is also required.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the global workflow configurations.</p>
     * 
     * @param request GetWorkflowGlobalEnvRequest
     * @return GetWorkflowGlobalEnvResponse
     */
    public GetWorkflowGlobalEnvResponse getWorkflowGlobalEnv(GetWorkflowGlobalEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowGlobalEnvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can filter sessions by agent name. Omit Params.NextToken on the first page. When querying subsequent pages, keep the filter conditions and page size unchanged, and pass the JsonRpcResponse.Result.NextToken returned from the previous page as is to Params.NextToken. Pagination ends when the token is not returned or is empty.
     * The list returns session summaries such as session ID, title, and time, but does not provide the final state of turn execution. After selecting a session, you can use GetAgentSession to query details or LoadAgentSession to load history.
     * Params in the request, and JsonRpcResponse and Result in the response are explicit objects. The pagination field MaxResults is of type integer<int32>, and NextToken is of type string. SessionList retains the any type. For session summary fields, see the supplementary description.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the session summary by paging for the caller to select or resume existing sessions.</p>
     * 
     * @param tmpReq ListAgentSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentSessionsResponse
     */
    public ListAgentSessionsResponse listAgentSessionsWithOptions(ListAgentSessionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAgentSessionsShrinkRequest request = new ListAgentSessionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentSessions"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can filter sessions by agent name. Omit Params.NextToken on the first page. When querying subsequent pages, keep the filter conditions and page size unchanged, and pass the JsonRpcResponse.Result.NextToken returned from the previous page as is to Params.NextToken. Pagination ends when the token is not returned or is empty.
     * The list returns session summaries such as session ID, title, and time, but does not provide the final state of turn execution. After selecting a session, you can use GetAgentSession to query details or LoadAgentSession to load history.
     * Params in the request, and JsonRpcResponse and Result in the response are explicit objects. The pagination field MaxResults is of type integer<int32>, and NextToken is of type string. SessionList retains the any type. For session summary fields, see the supplementary description.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the session summary by paging for the caller to select or resume existing sessions.</p>
     * 
     * @param request ListAgentSessionsRequest
     * @return ListAgentSessionsResponse
     */
    public ListAgentSessionsResponse listAgentSessions(ListAgentSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentSessionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, the API returns the official agents provided by the platform and the tenant agents visible to the current identity.</li>
     * <li>If Scope is set to SYSTEM, only official agents are queried. If Scope is set to CUSTOM, only custom agents are queried.</li>
     * <li>Supports both cursor-based pagination and page number-based pagination. When using cursor-based pagination, pass the NextToken value exactly as returned in the next request, and keep the calling identity, filter conditions, and MaxResults unchanged.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the agents visible to the current identity by using paging.</p>
     * 
     * @param request ListAgentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgentsWithOptions(ListAgentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            query.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.q)) {
            query.put("Q", request.q);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requiredRuntime)) {
            query.put("RequiredRuntime", request.requiredRuntime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgents"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, the API returns the official agents provided by the platform and the tenant agents visible to the current identity.</li>
     * <li>If Scope is set to SYSTEM, only official agents are queried. If Scope is set to CUSTOM, only custom agents are queried.</li>
     * <li>Supports both cursor-based pagination and page number-based pagination. When using cursor-based pagination, pass the NextToken value exactly as returned in the next request, and keep the calling identity, filter conditions, and MaxResults unchanged.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the agents visible to the current identity by using paging.</p>
     * 
     * @param request ListAgentsRequest
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For text sessions, pass <code>ModelType=text</code> and use <code>MaxResults</code> and <code>NextToken</code> for paging. Obtain the model identifier from <code>Models[].Id</code> and pass it as <code>Params.modelId</code> to SetAgentSessionModel.</li>
     * <li>Visibility in the model catalog does not mean the target session supports the model. After setting the model, refer to the return value of SetAgentSessionModel or the query result of GetAgentSessionModel.</li>
     * <li><code>ThinkingLevels</code> and <code>ThinkingLevel</code> are used for optional thinking level configurations and do not affect the integration flow for selecting a model only.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the text models visible to the current caller for selection when setting a session model.</p>
     * 
     * @param request ListModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelsResponse
     */
    public ListModelsResponse listModelsWithOptions(ListModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("action", "ListModels"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For text sessions, pass <code>ModelType=text</code> and use <code>MaxResults</code> and <code>NextToken</code> for paging. Obtain the model identifier from <code>Models[].Id</code> and pass it as <code>Params.modelId</code> to SetAgentSessionModel.</li>
     * <li>Visibility in the model catalog does not mean the target session supports the model. After setting the model, refer to the return value of SetAgentSessionModel or the query result of GetAgentSessionModel.</li>
     * <li><code>ThinkingLevels</code> and <code>ThinkingLevel</code> are used for optional thinking level configurations and do not affect the integration flow for selecting a model only.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the text models visible to the current caller for selection when setting a session model.</p>
     * 
     * @param request ListModelsRequest
     * @return ListModelsResponse
     */
    public ListModelsResponse listModels(ListModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query and filter: <ul>
     * <li><code>Scope=SYSTEM</code> queries only official skills, and <code>Scope=CUSTOM</code> queries only custom skills. If omitted, both are queried.</li>
     * <li>Custom skills with <code>user</code> visibility are visible only to the creator, while skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>Supports filtering by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code>. <code>Q</code> performs a fuzzy match on the skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>Cursor-based pagination uses <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token from the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you modify the query conditions, you must restart the query from the first page.</li>
     * <li>Page number-based pagination uses <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly passed, cursor-based pagination takes precedence. If <code>NextToken</code> is passed, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Returned content: <ul>
     * <li>This operation returns only skill summaries and does not generate bundle download URLs. To obtain a download URL, call <code>GetSkill</code> and specify <code>Network</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for skills visible to the current invoker.</p>
     * 
     * @param request ListSkillsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkillsWithOptions(ListSkillsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            query.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.q)) {
            query.put("Q", request.q);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkills"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query and filter: <ul>
     * <li><code>Scope=SYSTEM</code> queries only official skills, and <code>Scope=CUSTOM</code> queries only custom skills. If omitted, both are queried.</li>
     * <li>Custom skills with <code>user</code> visibility are visible only to the creator, while skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>Supports filtering by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code>. <code>Q</code> performs a fuzzy match on the skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>Cursor-based pagination uses <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token from the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you modify the query conditions, you must restart the query from the first page.</li>
     * <li>Page number-based pagination uses <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly passed, cursor-based pagination takes precedence. If <code>NextToken</code> is passed, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Returned content: <ul>
     * <li>This operation returns only skill summaries and does not generate bundle download URLs. To obtain a download URL, call <code>GetSkill</code> and specify <code>Network</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for skills visible to the current invoker.</p>
     * 
     * @param request ListSkillsRequest
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkills(ListSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A standard load requires only the session ID. It returns the configuration, history, and output to be continuously received. The response is SSE, not a standard JSON message list.</li>
     * <li>When resuming from a stream interruption, pass back the actually received cursor, event epoch, and turn ID. History and incremental data may be returned simultaneously. Existing pages should be rebuilt or deduplicated based on the confirmed cursor. Do not directly append all returned data.</li>
     * <li>During the load process, you may receive pending approvals or questions again. Use the interaction notification that is still valid for this session to call ReplyAgentSession.</li>
     * <li>For an idle session, <code>stopReason=end_turn</code> may only indicate the end of the current load. It cannot be used to determine the success of a previously interrupted turn. You must associate it with the actual desired state of the target turn. If it cannot be determined, keep the result for verification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Loads session history, receives subsequent output, or resumes Server-Sent Events (SSE) from a saved read position.</p>
     * 
     * @param tmpReq LoadAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoadAgentSessionResponse
     */
    public LoadAgentSessionResponse loadAgentSessionWithOptions(LoadAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        LoadAgentSessionShrinkRequest request = new LoadAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoadAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoadAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A standard load requires only the session ID. It returns the configuration, history, and output to be continuously received. The response is SSE, not a standard JSON message list.</li>
     * <li>When resuming from a stream interruption, pass back the actually received cursor, event epoch, and turn ID. History and incremental data may be returned simultaneously. Existing pages should be rebuilt or deduplicated based on the confirmed cursor. Do not directly append all returned data.</li>
     * <li>During the load process, you may receive pending approvals or questions again. Use the interaction notification that is still valid for this session to call ReplyAgentSession.</li>
     * <li>For an idle session, <code>stopReason=end_turn</code> may only indicate the end of the current load. It cannot be used to determine the success of a previously interrupted turn. You must associate it with the actual desired state of the target turn. If it cannot be determined, keep the result for verification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Loads session history, receives subsequent output, or resumes Server-Sent Events (SSE) from a saved read position.</p>
     * 
     * @param request LoadAgentSessionRequest
     * @return LoadAgentSessionResponse
     */
    public LoadAgentSessionResponse loadAgentSession(LoadAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loadAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the session ID returned by CreateAgentSession to Params.sessionId and place the user text in Params.prompt.</li>
     * <li>When an execution or pending interaction is already in progress, the default call path rejects new prompts. After receiving an approval or Q&amp;A notification, submit your choice or answer through ReplyAgentSession before continuing to read the original stream.</li>
     * <li>A connection interruption does not cancel the execution. If the result is unknown, call LoadAgentSession to resume reading. Submitting duplicate prompts may generate new messages, and duplicate Id values are not deduplicated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends text to an existing session and continuously receives agent output over Server-Sent Events (SSE).</p>
     * 
     * @param tmpReq PromptAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PromptAgentSessionResponse
     */
    public PromptAgentSessionResponse promptAgentSessionWithOptions(PromptAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PromptAgentSessionShrinkRequest request = new PromptAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PromptAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PromptAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the session ID returned by CreateAgentSession to Params.sessionId and place the user text in Params.prompt.</li>
     * <li>When an execution or pending interaction is already in progress, the default call path rejects new prompts. After receiving an approval or Q&amp;A notification, submit your choice or answer through ReplyAgentSession before continuing to read the original stream.</li>
     * <li>A connection interruption does not cancel the execution. If the result is unknown, call LoadAgentSession to resume reading. Submitting duplicate prompts may generate new messages, and duplicate Id values are not deduplicated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends text to an existing session and continuously receives agent output over Server-Sent Events (SSE).</p>
     * 
     * @param request PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    public PromptAgentSessionResponse promptAgentSession(PromptAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.promptAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Read <code>data.sessionId</code>, <code>data.requestId</code>, and <code>data.options</code> from the <code>permission_request</code> notification of PromptAgentSession or LoadAgentSession. This operation uses the interaction ID, not the tool invocation ID or the server-side RequestId.</li>
     * <li>When selecting an action, use the <code>optionId</code> actually provided in the notification. For Q&amp;A scenarios, you must also write the question key and answer text into <code>answers</code>. Do not pass this field for regular tool approvals.</li>
     * <li><code>accepted=true</code> only indicates that the reply has been accepted. Subsequent output is still read through Prompt/Load. <code>false</code> indicates that the reply is not adopted this time. You should reload the current interaction and not automatically change to approve other requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits the approval choice or question answer for the current pending interaction.</p>
     * 
     * @param tmpReq ReplyAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplyAgentSessionResponse
     */
    public ReplyAgentSessionResponse replyAgentSessionWithOptions(ReplyAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReplyAgentSessionShrinkRequest request = new ReplyAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplyAgentSession"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplyAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Read <code>data.sessionId</code>, <code>data.requestId</code>, and <code>data.options</code> from the <code>permission_request</code> notification of PromptAgentSession or LoadAgentSession. This operation uses the interaction ID, not the tool invocation ID or the server-side RequestId.</li>
     * <li>When selecting an action, use the <code>optionId</code> actually provided in the notification. For Q&amp;A scenarios, you must also write the question key and answer text into <code>answers</code>. Do not pass this field for regular tool approvals.</li>
     * <li><code>accepted=true</code> only indicates that the reply has been accepted. Subsequent output is still read through Prompt/Load. <code>false</code> indicates that the reply is not adopted this time. You should reload the current interaction and not automatically change to approve other requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits the approval choice or question answer for the current pending interaction.</p>
     * 
     * @param request ReplyAgentSessionRequest
     * @return ReplyAgentSessionResponse
     */
    public ReplyAgentSessionResponse replyAgentSession(ReplyAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replyAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Saves or queries the global workflow configuration by tenant and region. The content is sensitive information.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves the global workflow configuration.</p>
     * 
     * @param request SaveWorkflowGlobalEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveWorkflowGlobalEnvResponse
     */
    public SaveWorkflowGlobalEnvResponse saveWorkflowGlobalEnvWithOptions(SaveWorkflowGlobalEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveWorkflowGlobalEnv"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveWorkflowGlobalEnvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Saves or queries the global workflow configuration by tenant and region. The content is sensitive information.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves the global workflow configuration.</p>
     * 
     * @param request SaveWorkflowGlobalEnvRequest
     * @return SaveWorkflowGlobalEnvResponse
     */
    public SaveWorkflowGlobalEnvResponse saveWorkflowGlobalEnv(SaveWorkflowGlobalEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWorkflowGlobalEnvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the <code>sessionId</code> returned by CreateAgentSession and the <code>Models[].Id</code> returned by ListModels as <code>Params.sessionId</code> and <code>Params.modelId</code>, respectively. The visibility of a model in the model catalog does not mean that the target session supports the model. The final validation is performed by the target session.</li>
     * <li><code>modelId</code> is required. When you only modify the model, you can omit <code>thinkingLevel</code>. For more information about how to configure the thinking level, see the supplementary description of request parameters.</li>
     * <li>This operation only modifies the target session and does not modify the global default model of the agent or account. The session may deny configuration modifications during execution, and switching during runtime is not guaranteed to be supported.</li>
     * <li>The model and thinking level settings are applied step by step. If the call fails, the model may have already been changed, and an overall rollback is not guaranteed. You should call GetAgentSessionModel to query the current configuration before deciding on subsequent operations. After a successful call, you can read the actual effective values from the returned result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the model used by a session and optionally configures the thinking level.</p>
     * 
     * @param tmpReq SetAgentSessionModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAgentSessionModelResponse
     */
    public SetAgentSessionModelResponse setAgentSessionModelWithOptions(SetAgentSessionModelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetAgentSessionModelShrinkRequest request = new SetAgentSessionModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAgentSessionModel"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAgentSessionModelResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the <code>sessionId</code> returned by CreateAgentSession and the <code>Models[].Id</code> returned by ListModels as <code>Params.sessionId</code> and <code>Params.modelId</code>, respectively. The visibility of a model in the model catalog does not mean that the target session supports the model. The final validation is performed by the target session.</li>
     * <li><code>modelId</code> is required. When you only modify the model, you can omit <code>thinkingLevel</code>. For more information about how to configure the thinking level, see the supplementary description of request parameters.</li>
     * <li>This operation only modifies the target session and does not modify the global default model of the agent or account. The session may deny configuration modifications during execution, and switching during runtime is not guaranteed to be supported.</li>
     * <li>The model and thinking level settings are applied step by step. If the call fails, the model may have already been changed, and an overall rollback is not guaranteed. You should call GetAgentSessionModel to query the current configuration before deciding on subsequent operations. After a successful call, you can read the actual effective values from the returned result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the model used by a session and optionally configures the thinking level.</p>
     * 
     * @param request SetAgentSessionModelRequest
     * @return SetAgentSessionModelResponse
     */
    public SetAgentSessionModelResponse setAgentSessionModel(SetAgentSessionModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAgentSessionModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>Name</code> is used only to locate the agent and cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not passed, the original value is retained. If a non-empty array is passed, it replaces the original value entirely. If an empty array is passed, the corresponding binding is removed. Other optional fields retain their original values if not passed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of an agent.</p>
     * 
     * @param request UpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedVersion)) {
            body.put("ExpectedVersion", request.expectedVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBases)) {
            body.put("KnowledgeBases", request.knowledgeBases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skills)) {
            body.put("Skills", request.skills);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemPrompt)) {
            body.put("SystemPrompt", request.systemPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("Tools", request.tools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>Name</code> is used only to locate the agent and cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not passed, the original value is retained. If a non-empty array is passed, it replaces the original value entirely. If an empty array is passed, the corresponding binding is removed. Other optional fields retain their original values if not passed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of an agent.</p>
     * 
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Update rules:<ul>
     * <li><code>Name</code> is used only to locate the skill and cannot be modified.</li>
     * <li>The caller must be the creator of the skill or the root account of the tenant that has permissions to manage the tenant-level skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li>If <code>Description</code> and <code>Visibility</code> are omitted, their original values are retained. Passing <code>null</code> is treated as omission and cannot be used to clear the original values.</li>
     * <li><code>Metadata</code> is replaced as a whole, not merged incrementally. If <code>Metadata</code> is omitted, the original content is retained. If it is passed, old fields not included in the new object are deleted.</li>
     * <li>When modifying only <code>Description</code> or <code>Visibility</code>, do not pass <code>Metadata</code> or an empty object <code>{}</code>. An empty object replaces the original metadata with an empty object.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li>When replacing the body or bundle, you must choose one and only one of <code>skillMd</code>, <code>transitId</code>, or <code>bundleUrl</code>.</li>
     * <li>For the field formats of the three sources, the Transit upload confirmation process, and the <code>bundleUrl</code> restrictions, refer to CreateSkill. Pass the selected source in <code>UpdateSkill.Metadata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a skill.</p>
     * 
     * @param request UpdateSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillResponse
     */
    public UpdateSkillResponse updateSkillWithOptions(UpdateSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedVersion)) {
            body.put("ExpectedVersion", request.expectedVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("Metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkill"),
            new TeaPair("version", "2026-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Update rules:<ul>
     * <li><code>Name</code> is used only to locate the skill and cannot be modified.</li>
     * <li>The caller must be the creator of the skill or the root account of the tenant that has permissions to manage the tenant-level skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li>If <code>Description</code> and <code>Visibility</code> are omitted, their original values are retained. Passing <code>null</code> is treated as omission and cannot be used to clear the original values.</li>
     * <li><code>Metadata</code> is replaced as a whole, not merged incrementally. If <code>Metadata</code> is omitted, the original content is retained. If it is passed, old fields not included in the new object are deleted.</li>
     * <li>When modifying only <code>Description</code> or <code>Visibility</code>, do not pass <code>Metadata</code> or an empty object <code>{}</code>. An empty object replaces the original metadata with an empty object.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li>When replacing the body or bundle, you must choose one and only one of <code>skillMd</code>, <code>transitId</code>, or <code>bundleUrl</code>.</li>
     * <li>For the field formats of the three sources, the Transit upload confirmation process, and the <code>bundleUrl</code> restrictions, refer to CreateSkill. Pass the selected source in <code>UpdateSkill.Metadata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a skill.</p>
     * 
     * @param request UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    public UpdateSkillResponse updateSkill(UpdateSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillWithOptions(request, runtime);
    }
}
