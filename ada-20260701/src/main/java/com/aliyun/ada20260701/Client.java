// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701;

import com.aliyun.tea.*;
import com.aliyun.ada20260701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * <ul>
     * <li><code>Name</code> is the unique identifier of the Agent within the current tenant. It can contain only letters, digits, underscores, and hyphens, and must be 1 to 128 characters in length. The name cannot be modified after creation.</li>
     * <li>Each Agent can be associated with only one knowledge base.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Agent.</p>
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
     * <li><code>Name</code> is the unique identifier of the Agent within the current tenant. It can contain only letters, digits, underscores, and hyphens, and must be 1 to 128 characters in length. The name cannot be modified after creation.</li>
     * <li>Each Agent can be associated with only one knowledge base.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Agent.</p>
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
     * <ul>
     * <li>Creation rules:<ul>
     * <li><code>Name</code> must be unique within the current tenant and cannot share a name with an official Skill.</li>
     * <li><code>Description</code> and <code>Metadata</code> are required. <code>Metadata</code> must contain exactly one valid content source. Different sources cannot be mixed.</li>
     * <li>After the Skill is created, you can modify it by calling <code>UpdateSkill</code>.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li><code>skillMd</code>: Directly provide the Markdown body without a YAML header. Specify the name and description by using <code>Name</code> and <code>Description</code>.</li>
     * <li><code>transitId</code>: Upload and confirm a ZIP file through Transit. Call the operations in the following order:<ol>
     * <li>Call <code>CreateTransitUploadPolicy</code> with <code>FileShowName</code> to obtain <code>TransitId</code>, <code>FilePath</code>, and <code>PolicyInfo</code>.</li>
     * <li>Upload the ZIP file to object storage by using <code>PolicyInfo</code> and <code>FilePath</code>.</li>
     * <li>Call <code>ConfirmTransitUpload</code> with <code>TransitId</code>. Proceed with creation only when the response returns <code>Confirmed=true</code>.</li>
     * <li>Call <code>CreateSkill</code> and pass the confirmed <code>TransitId</code> in <code>Metadata.transitId</code>.</li>
     * </ol>
     * </li>
     * <li><code>bundleUrl</code>: Provide a public HTTPS direct link to a ZIP file. The platform downloads the file and saves it as an Artifact. The original URL is not persisted or returned in responses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Skill.</p>
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
     * <li><code>Name</code> must be unique within the current tenant and cannot share a name with an official Skill.</li>
     * <li><code>Description</code> and <code>Metadata</code> are required. <code>Metadata</code> must contain exactly one valid content source. Different sources cannot be mixed.</li>
     * <li>After the Skill is created, you can modify it by calling <code>UpdateSkill</code>.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li><code>skillMd</code>: Directly provide the Markdown body without a YAML header. Specify the name and description by using <code>Name</code> and <code>Description</code>.</li>
     * <li><code>transitId</code>: Upload and confirm a ZIP file through Transit. Call the operations in the following order:<ol>
     * <li>Call <code>CreateTransitUploadPolicy</code> with <code>FileShowName</code> to obtain <code>TransitId</code>, <code>FilePath</code>, and <code>PolicyInfo</code>.</li>
     * <li>Upload the ZIP file to object storage by using <code>PolicyInfo</code> and <code>FilePath</code>.</li>
     * <li>Call <code>ConfirmTransitUpload</code> with <code>TransitId</code>. Proceed with creation only when the response returns <code>Confirmed=true</code>.</li>
     * <li>Call <code>CreateSkill</code> and pass the confirmed <code>TransitId</code> in <code>Metadata.transitId</code>.</li>
     * </ol>
     * </li>
     * <li><code>bundleUrl</code>: Provide a public HTTPS direct link to a ZIP file. The platform downloads the file and saves it as an Artifact. The original URL is not persisted or returned in responses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Skill.</p>
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
     * <li><code>Network</code> can be set to <code>public</code> or <code>internal</code> to generate a public or same-region internal upload address. Default value: <code>public</code>.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li><code>PolicyInfo</code> contains short-term upload authorization information intended only for the current file upload. Do not log it, persist it long-term, or forward it to other users.</li>
     * <li><code>ExpireMs</code> controls the validity period of the upload policy and the Transit record, in milliseconds. It is not an absolute timestamp. The default and maximum value is <code>604800000</code> (7 days), and the minimum value is <code>1000</code> (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>Call <code>GetTransitMeta</code> and read <code>ExpireAt</code> to obtain the expiration time of the Transit record. Confirming the upload or querying the record does not extend the validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a credential for direct file upload. The caller can use the returned upload policy to upload a file directly to object storage.</p>
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
     * <li><code>Network</code> can be set to <code>public</code> or <code>internal</code> to generate a public or same-region internal upload address. Default value: <code>public</code>.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li><code>PolicyInfo</code> contains short-term upload authorization information intended only for the current file upload. Do not log it, persist it long-term, or forward it to other users.</li>
     * <li><code>ExpireMs</code> controls the validity period of the upload policy and the Transit record, in milliseconds. It is not an absolute timestamp. The default and maximum value is <code>604800000</code> (7 days), and the minimum value is <code>1000</code> (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>Call <code>GetTransitMeta</code> and read <code>ExpireAt</code> to obtain the expiration time of the Transit record. Confirming the upload or querying the record does not extend the validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a credential for direct file upload. The caller can use the returned upload policy to upload a file directly to object storage.</p>
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
     * <li>Creators can delete Agents that they created.</li>
     * <li>After deletion, the Agent can no longer be queried, updated, or run.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified Agent.</p>
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
     * <li>Creators can delete Agents that they created.</li>
     * <li>After deletion, the Agent can no longer be queried, updated, or run.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified Agent.</p>
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
     * <ul>
     * <li>Deletion permissions:<ul>
     * <li>You can only delete custom Skills that the current caller has permission to modify.</li>
     * <li>The caller must be the Skill creator or the tenant root account that has permission to manage the tenant-level Skill. Official Skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>Deletion uses soft delete. After successful deletion, <code>GetSkill</code> and <code>ListSkills</code> no longer return the Skill, and you can create a new Skill with the same name.</li>
     * <li>Recovery is not supported. You cannot delete a Skill that has already been deleted or does not exist.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Soft-deletes a Skill that the current caller has permission to modify.</p>
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
     * <li>You can only delete custom Skills that the current caller has permission to modify.</li>
     * <li>The caller must be the Skill creator or the tenant root account that has permission to manage the tenant-level Skill. Official Skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>Deletion uses soft delete. After successful deletion, <code>GetSkill</code> and <code>ListSkills</code> no longer return the Skill, and you can create a new Skill with the same name.</li>
     * <li>Recovery is not supported. You cannot delete a Skill that has already been deleted or does not exist.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Soft-deletes a Skill that the current caller has permission to modify.</p>
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
     * <li>You can retrieve agents that you created, agents visible within the current tenant, and official agents provided by the platform.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an agent visible to the current identity by name.</p>
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
     * <li>You can retrieve agents that you created, agents visible within the current tenant, and official agents provided by the platform.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an agent visible to the current identity by name.</p>
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
     * <ul>
     * <li>Query target:<ul>
     * <li>Queries by <code>Name</code>. Querying by <code>SkillId</code> is not supported.</li>
     * <li>Returns the Skill with the matching name that is visible to the current caller under the current tenant first. If no visible record exists, queries the official Skill with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current Skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the Skill has an accessible Artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the Artifact does not exist, is inaccessible, or the URL generation fails, the Skill query still succeeds, but download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not stored and is not returned by this operation.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a Skill by name that is visible to the current caller.</p>
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
     * <li>Returns the Skill with the matching name that is visible to the current caller under the current tenant first. If no visible record exists, queries the official Skill with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current Skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the Skill has an accessible Artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the Artifact does not exist, is inaccessible, or the URL generation fails, the Skill query still succeeds, but download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not stored and is not returned by this operation.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a Skill by name that is visible to the current caller.</p>
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
     * <li>Specify at least one of <code>TransitId</code> and <code>FilePath</code>. If both are specified, <code>TransitId</code> takes precedence.</li>
     * <li>Use the <code>TransitId</code> returned by <code>CreateTransitUploadPolicy</code> to query the file. <code>TransitId</code> is a temporary capability identifier used during the file upload process. Do not share it with unauthorized users.</li>
     * <li><code>FilePath</code> is an opaque object path returned by <code>CreateTransitUploadPolicy</code>. Use it as-is. Do not parse, modify, or construct it manually.</li>
     * <li>When you query by <code>FilePath</code>, an error is returned if the record does not exist or is not accessible to the caller.</li>
     * <li><code>ExpireMs</code> specifies the validity period of the download URL in milliseconds. Default value: <code>900000</code> (15 minutes). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds is rounded down to 1 second.</li>
     * <li><code>ExpireAt</code> is the expiration time of the Transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming the upload do not extend the record validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a Transit file, including the upload status, file size, and expiration time, and optionally generates a temporary download URL.</p>
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
     * <li>Specify at least one of <code>TransitId</code> and <code>FilePath</code>. If both are specified, <code>TransitId</code> takes precedence.</li>
     * <li>Use the <code>TransitId</code> returned by <code>CreateTransitUploadPolicy</code> to query the file. <code>TransitId</code> is a temporary capability identifier used during the file upload process. Do not share it with unauthorized users.</li>
     * <li><code>FilePath</code> is an opaque object path returned by <code>CreateTransitUploadPolicy</code>. Use it as-is. Do not parse, modify, or construct it manually.</li>
     * <li>When you query by <code>FilePath</code>, an error is returned if the record does not exist or is not accessible to the caller.</li>
     * <li><code>ExpireMs</code> specifies the validity period of the download URL in milliseconds. Default value: <code>900000</code> (15 minutes). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds is rounded down to 1 second.</li>
     * <li><code>ExpireAt</code> is the expiration time of the Transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming the upload do not extend the record validity period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a Transit file, including the upload status, file size, and expiration time, and optionally generates a temporary download URL.</p>
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
     * <ul>
     * <li>By default, returns official platform agents and tenant agents visible to the current identity.</li>
     * <li>Set <code>Scope=SYSTEM</code> to query only official agents, or <code>Scope=CUSTOM</code> to query only custom agents.</li>
     * <li>Both cursor-based pagination and page number-based pagination are supported. When using cursor-based pagination, pass the <code>NextToken</code> value from the previous response to the next request, and keep the caller identity, filter conditions, and <code>MaxResults</code> unchanged.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries agents visible to the current identity by paging.</p>
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
     * <li>By default, returns official platform agents and tenant agents visible to the current identity.</li>
     * <li>Set <code>Scope=SYSTEM</code> to query only official agents, or <code>Scope=CUSTOM</code> to query only custom agents.</li>
     * <li>Both cursor-based pagination and page number-based pagination are supported. When using cursor-based pagination, pass the <code>NextToken</code> value from the previous response to the next request, and keep the caller identity, filter conditions, and <code>MaxResults</code> unchanged.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries agents visible to the current identity by paging.</p>
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
     * <li>Query and filtering: <ul>
     * <li>Set <code>Scope=SYSTEM</code> to query only official Skills, or <code>Scope=CUSTOM</code> to query only custom Skills. If omitted, both official and custom Skills are queried.</li>
     * <li>Custom Skills with <code>user</code> visibility are visible only to the creator. Skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>Filtering by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code> is supported. <code>Q</code> performs a fuzzy match on the Skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>For cursor-based pagination, use <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token returned in the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you change the query conditions, start over from the first page.</li>
     * <li>For page-number-based pagination, use <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly specified, cursor-based pagination takes precedence. If <code>NextToken</code> is specified, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Response content: <ul>
     * <li>This operation returns only Skill summaries and does not generate Bundle download URLs. To obtain download URLs, call <code>GetSkill</code> and specify <code>Network</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries Skills visible to the current caller by paging.</p>
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
     * <li>Query and filtering: <ul>
     * <li>Set <code>Scope=SYSTEM</code> to query only official Skills, or <code>Scope=CUSTOM</code> to query only custom Skills. If omitted, both official and custom Skills are queried.</li>
     * <li>Custom Skills with <code>user</code> visibility are visible only to the creator. Skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>Filtering by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code> is supported. <code>Q</code> performs a fuzzy match on the Skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>For cursor-based pagination, use <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token returned in the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you change the query conditions, start over from the first page.</li>
     * <li>For page-number-based pagination, use <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly specified, cursor-based pagination takes precedence. If <code>NextToken</code> is specified, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Response content: <ul>
     * <li>This operation returns only Skill summaries and does not generate Bundle download URLs. To obtain download URLs, call <code>GetSkill</code> and specify <code>Network</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries Skills visible to the current caller by paging.</p>
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
     * <li><code>Name</code> is used only to locate the Agent and cannot be modified after creation.</li>
     * <li>Each Agent can be bindded to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not specified, the existing value is retained. A non-empty array replaces the entire value. An empty array removes the corresponding binddings. Other optional fields retain their existing values if not specified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of an Agent.</p>
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
     * <li><code>Name</code> is used only to locate the Agent and cannot be modified after creation.</li>
     * <li>Each Agent can be bindded to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not specified, the existing value is retained. A non-empty array replaces the entire value. An empty array removes the corresponding binddings. Other optional fields retain their existing values if not specified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of an Agent.</p>
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
     * <li><code>Name</code> is used only to locate the Skill and cannot be modified.</li>
     * <li>The caller must be the Skill creator or the tenant root account that has permissions to manage the tenant-level Skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li><code>Description</code> and <code>Visibility</code> retain their original values when omitted. Passing <code>null</code> is treated the same as omitting the field and cannot be used to clear the original value.</li>
     * <li><code>Metadata</code> is replaced as a whole, not merged incrementally. Omitting <code>Metadata</code> preserves the original content. When provided, any old fields not included in the new object are deleted.</li>
     * <li>When modifying only <code>Description</code> or <code>Visibility</code>, do not pass <code>Metadata</code> or an empty object <code>{}</code>. An empty object replaces the entire original Metadata with an empty value.</li>
     * </ul>
     * </li>
     * <li>Content source:<ul>
     * <li>When replacing the body or bundle, specify exactly one of <code>skillMd</code>, <code>transitId</code>, or <code>bundleUrl</code>.</li>
     * <li>For field formats, the Transit upload confirmation process, and <code>bundleUrl</code> restrictions of the three sources, refer to CreateSkill. Pass the selected source in <code>UpdateSkill.Metadata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a Skill.</p>
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
     * <li><code>Name</code> is used only to locate the Skill and cannot be modified.</li>
     * <li>The caller must be the Skill creator or the tenant root account that has permissions to manage the tenant-level Skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li><code>Description</code> and <code>Visibility</code> retain their original values when omitted. Passing <code>null</code> is treated the same as omitting the field and cannot be used to clear the original value.</li>
     * <li><code>Metadata</code> is replaced as a whole, not merged incrementally. Omitting <code>Metadata</code> preserves the original content. When provided, any old fields not included in the new object are deleted.</li>
     * <li>When modifying only <code>Description</code> or <code>Visibility</code>, do not pass <code>Metadata</code> or an empty object <code>{}</code>. An empty object replaces the entire original Metadata with an empty value.</li>
     * </ul>
     * </li>
     * <li>Content source:<ul>
     * <li>When replacing the body or bundle, specify exactly one of <code>skillMd</code>, <code>transitId</code>, or <code>bundleUrl</code>.</li>
     * <li>For field formats, the Transit upload confirmation process, and <code>bundleUrl</code> restrictions of the three sources, refer to CreateSkill. Pass the selected source in <code>UpdateSkill.Metadata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a Skill.</p>
     * 
     * @param request UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    public UpdateSkillResponse updateSkill(UpdateSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillWithOptions(request, runtime);
    }
}
