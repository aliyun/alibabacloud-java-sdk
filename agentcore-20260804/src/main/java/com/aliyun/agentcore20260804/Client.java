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
     * <b>summary</b> : 
     * <p>批量删除模型</p>
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
     * <p>批量删除模型</p>
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
     * <h2>Operation description</h2>
     * <p>Uploads Skill ZIP packages in bulk through OSS and returns the processing result of each Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads Skill ZIP packages in bulk through OSS and returns the processing result of each Skill.</p>
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
     * <h2>Operation description</h2>
     * <p>Uploads Skill ZIP packages in bulk through OSS and returns the processing result of each Skill.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads Skill ZIP packages in bulk through OSS and returns the processing result of each Skill.</p>
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
     * <p>Creates an IM channel for a specified agent and binds a publicly accessible ServiceEndpoint.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM channel for a specified agent and binds a publicly accessible ServiceEndpoint.</p>
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
     * <p>Creates an IM channel for a specified agent and binds a publicly accessible ServiceEndpoint.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM channel for a specified agent and binds a publicly accessible ServiceEndpoint.</p>
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
     * <h2>Operation description</h2>
     * <p>Creates an AgentSpec in the specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentSpec in the specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
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
     * <h2>Operation description</h2>
     * <p>Creates an AgentSpec in the specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AgentSpec in the specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
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
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist, and there must not be a draft currently being edited.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist, and there must not be a draft currently being edited.</p>
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
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist, and there must not be a draft currently being edited.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist, and there must not be a draft currently being edited.</p>
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
     * <b>summary</b> : 
     * <p>创建凭证</p>
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
     * <b>summary</b> : 
     * <p>创建凭证</p>
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
     * <p>Creates a Bootstrap Token and CMS configuration required for connecting a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Bootstrap Token and CMS configuration required for connecting a specified external agent.</p>
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
     * <p>Creates a Bootstrap Token and CMS configuration required for connecting a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Bootstrap Token and CMS configuration required for connecting a specified external agent.</p>
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
     * <b>summary</b> : 
     * <p>Binds an external identity provider to a specified workspace for single sign-on and organization member synchronization. Each workspace can be bound to at most one external identity provider. The binding is an asynchronous operation. After the API returns, you can track the progress by querying the status through GetIdentityProvider.</p>
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
     * <b>summary</b> : 
     * <p>Binds an external identity provider to a specified workspace for single sign-on and organization member synchronization. Each workspace can be bound to at most one external identity provider. The binding is an asynchronous operation. After the API returns, you can track the progress by querying the status through GetIdentityProvider.</p>
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
     * <b>summary</b> : 
     * <p>Creates a model configuration under a specified model connection in a workspace.</p>
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
     * <p>Creates a model configuration under a specified model connection in a workspace.</p>
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
     * <p>创建模型连接</p>
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
     * <p>创建模型连接</p>
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
     * <p>创建团队</p>
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
     * <p>创建团队</p>
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
     * <p>创建用户</p>
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
     * <p>创建用户</p>
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
     * <h2>Operation description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
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
     * <h2>Operation description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
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
     * <p>调试模型</p>
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
     * <p>调试模型</p>
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
     * <h2>Request description</h2>
     * <p>Deletes a specified AgentSpec along with all its versions and metadata. This operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified AgentSpec along with all its versions and metadata. This operation is irreversible.</p>
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
     * <h2>Request description</h2>
     * <p>Deletes a specified AgentSpec along with all its versions and metadata. This operation is irreversible.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified AgentSpec along with all its versions and metadata. This operation is irreversible.</p>
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
     * <b>summary</b> : 
     * <p>删除凭证</p>
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
     * <b>summary</b> : 
     * <p>删除凭证</p>
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
     * <b>summary</b> : 
     * <p>Unbinds the external identity provider from a specified workspace and cleans up users synchronized by that identity provider. The unbinding is an asynchronous operation. After the API returns, you can track the progress by querying the status through GetIdentityProvider.</p>
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
     * <b>summary</b> : 
     * <p>Unbinds the external identity provider from a specified workspace and cleans up users synchronized by that identity provider. The unbinding is an asynchronous operation. After the API returns, you can track the progress by querying the status through GetIdentityProvider.</p>
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
     * <p>Deletes a specified MCP service. The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
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
     * <h2>Request description</h2>
     * <p>Deletes a specified MCP service. The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
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
     * <b>summary</b> : 
     * <p>删除模型</p>
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
     * <p>删除模型</p>
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
     * <p>删除模型连接</p>
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
     * <p>删除模型连接</p>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <p>删除团队</p>
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
     * <p>删除团队</p>
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
     * <p>删除用户</p>
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
     * <p>删除用户</p>
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
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. When you repeatedly delete a workspace that is in the <code>Deleting</code> or <code>Deleted</code> state, the server handles the request with idempotence semantics.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes the control plane record of a specified workspace. The server completes the state transition from Deleting to Deleted within the same transaction. When you repeatedly delete a workspace that is in the Deleting or Deleted state, the server handles the request with idempotence semantics.</p>
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
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. When you repeatedly delete a workspace that is in the <code>Deleting</code> or <code>Deleted</code> state, the server handles the request with idempotence semantics.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Deletes the control plane record of a specified workspace. The server completes the state transition from Deleting to Deleted within the same transaction. When you repeatedly delete a workspace that is in the Deleting or Deleted state, the server handles the request with idempotence semantics.</p>
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
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified AgentSpec, which is used to download the AgentSpec ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a pre-signed OSS download URL for a specified AgentSpec ZIP package.</p>
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
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified AgentSpec, which is used to download the AgentSpec ZIP package.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a pre-signed OSS download URL for a specified AgentSpec ZIP package.</p>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
     * <p>Skips the regular review process and forcibly publishes the specified Skill version.</p>
     * 
     * <b>summary</b> : 
     * <p>Skips the regular review process and forcibly publishes the specified Skill version.</p>
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
     * <h2>Request description</h2>
     * <p>Skips the regular review process and forcibly publishes the specified Skill version.</p>
     * 
     * <b>summary</b> : 
     * <p>Skips the regular review process and forcibly publishes the specified Skill version.</p>
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
     * <h2>Operation description</h2>
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
     * <h2>Operation description</h2>
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
     * <h2>Operation description</h2>
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing an AgentSpec ZIP package. After the upload is complete, call the AgentSpec OSS upload operation to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing an AgentSpec ZIP package. After the upload is complete, call the AgentSpec OSS upload operation to complete the import.</p>
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
     * <h2>Operation description</h2>
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing an AgentSpec ZIP package. After the upload is complete, call the AgentSpec OSS upload operation to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing an AgentSpec ZIP package. After the upload is complete, call the AgentSpec OSS upload operation to complete the import.</p>
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
     * <h2>Operation description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including manifest content, resource files, and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete content of a specified AgentSpec version, including manifest content, resource files, and metadata.</p>
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
     * <h2>Operation description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including manifest content, resource files, and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete content of a specified AgentSpec version, including manifest content, resource files, and metadata.</p>
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
     * <b>summary</b> : 
     * <p>查询凭证</p>
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
     * <b>summary</b> : 
     * <p>查询凭证</p>
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
     * <p>Queries the available network types for a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available network types for a specified external agent.</p>
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
     * <p>Queries the available network types for a specified external agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available network types for a specified external agent.</p>
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
     * <b>summary</b> : 
     * <p>Queries the binding details of an external identity provider for a specified workspace, including the binding status, application configuration, and callback URLs that need to be configured on the identity provider side. Application secret configurations are not returned.</p>
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
     * <b>summary</b> : 
     * <p>Queries the binding details of an external identity provider for a specified workspace, including the binding status, application configuration, and callback URLs that need to be configured on the identity provider side. Application secret configurations are not returned.</p>
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
     * <p>Queries the details of a specified MCP service, including its address, type, status, authentication configuration, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP service, including its address, type, status, authentication configuration, and protocol.</p>
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
     * <p>Queries the details of a specified MCP service, including its address, type, status, authentication configuration, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP service, including its address, type, status, authentication configuration, and protocol.</p>
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
     * <p>查询模型连接</p>
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
     * <p>查询模型连接</p>
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
     * <p>Queries the currently active API Key for a specified service endpoint. The call succeeds only when the service endpoint has API_KEY authentication enabled and the gateway consumer and credentials are ready. The service reads the API Key from the gateway in real time. AgentCore does not persist the plaintext. Keep the returned API Key secure and avoid logging it or exposing it in public configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the currently active API Key and its invocation method for a specified service endpoint within a workspace.</p>
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
     * <p>Queries the currently active API Key for a specified service endpoint. The call succeeds only when the service endpoint has API_KEY authentication enabled and the gateway consumer and credentials are ready. The service reads the API Key from the gateway in real time. AgentCore does not persist the plaintext. Keep the returned API Key secure and avoid logging it or exposing it in public configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the currently active API Key and its invocation method for a specified service endpoint within a workspace.</p>
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
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing a Skill ZIP package. After the upload is complete, call the Skill OSS upload operation to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing a Skill ZIP package. After the upload is complete, call the Skill OSS upload operation to complete the import.</p>
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
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing a Skill ZIP package. After the upload is complete, call the Skill OSS upload operation to complete the import.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing a Skill ZIP package. After the upload is complete, call the Skill OSS upload operation to complete the import.</p>
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
     * <p>查询团队</p>
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
     * <p>查询团队</p>
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
     * <p>查询用户</p>
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
     * <p>查询用户</p>
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
     * <h2>Operation description\nQueries workspace details by workspace ID, including lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policy.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries workspace details by workspace ID, including lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policy.</p>
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
     * <h2>Operation description\nQueries workspace details by workspace ID, including lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policy.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries workspace details by workspace ID, including lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policy.</p>
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
     * <h2>Operation description\nInstalls a plugin for a specified AgentCore workspace. Currently supports the <code>collaboration</code> plugin. Plugin configuration is passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify VPC and public network access policies. The installation process is executed asynchronously. When you repeatedly call this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status with idempotent semantics if the configuration is the same. If the configuration is different, the operation returns an operation conflict error.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Installs a plugin for a specified AgentCore workspace. Currently supports the collaboration plugin. The installation process is executed asynchronously.</p>
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
     * <h2>Operation description\nInstalls a plugin for a specified AgentCore workspace. Currently supports the <code>collaboration</code> plugin. Plugin configuration is passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify VPC and public network access policies. The installation process is executed asynchronously. When you repeatedly call this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status with idempotent semantics if the configuration is the same. If the configuration is different, the operation returns an operation conflict error.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Installs a plugin for a specified AgentCore workspace. Currently supports the collaboration plugin. The installation process is executed asynchronously.</p>
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
     * <p>Queries the IM channel list of a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IM channel list of a specified agent.</p>
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
     * <p>Queries the IM channel list of a specified agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IM channel list of a specified agent.</p>
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
     * <p>Queries AgentSpec resources in a specified workspace by using paging, supporting name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries AgentSpec resources in a specified workspace by using paging, supporting name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
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
     * <p>Queries AgentSpec resources in a specified workspace by using paging, supporting name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries AgentSpec resources in a specified workspace by using paging, supporting name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
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
     * <p>Queries the list of teams to which specified agents belong. Specify the agent IDs through agentIds to retrieve the membership information between each agent and its teams, including the team ID, team name, and the role that the agent assumes in the team.</p>
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
     * <p>Queries the list of teams to which specified agents belong. Specify the agent IDs through agentIds to retrieve the membership information between each agent and its teams, including the team ID, team name, and the role that the agent assumes in the team.</p>
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
     * <b>summary</b> : 
     * <p>查询凭证列表</p>
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
     * <b>summary</b> : 
     * <p>查询凭证列表</p>
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
     * <b>summary</b> : 
     * <p>Queries the external identity provider bound to a specified workspace. Each workspace can be bound to at most one external identity provider, so the response returns at most one record. Application secret configurations are not returned.</p>
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
     * <b>summary</b> : 
     * <p>Queries the external identity provider bound to a specified workspace. Each workspace can be bound to at most one external identity provider, so the response returns at most one record. Application secret configurations are not returned.</p>
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
     * <b>summary</b> : 
     * <p>查询模型连接列表</p>
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
     * <b>summary</b> : 
     * <p>查询模型连接列表</p>
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
     * <p>查询预定义模型供应商目录</p>
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
     * <p>查询预定义模型供应商目录</p>
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
     * <p>Queries the models and their capability information for a specified provider in the AgentCore built-in model catalog.</p>
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
     * <p>Queries the models and their capability information for a specified provider in the AgentCore built-in model catalog.</p>
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
     * <h2>Request description\nQueries service endpoints in a specified workspace by using paging. Filter results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries service endpoints in a specified workspace by using paging. Supports filtering by target type, agent, collaboration component, and status.</p>
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
     * <h2>Request description\nQueries service endpoints in a specified workspace by using paging. Filter results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries service endpoints in a specified workspace by using paging. Supports filtering by target type, agent, collaboration component, and status.</p>
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
     * <h2>Operation description</h2>
     * <p>Performs a paged query of Skills in a specified workspace, and returns basic Skill information, version status, and paging details.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of Skills in a specified workspace, and returns basic Skill information, version status, and paging details.</p>
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
     * <p>Performs a paged query of Skills in a specified workspace, and returns basic Skill information, version status, and paging details.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of Skills in a specified workspace, and returns basic Skill information, version status, and paging details.</p>
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
     * <p>查询团队列表</p>
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
     * <p>查询团队列表</p>
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
     * <p>查询用户列表</p>
     * 
     * @param request ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(String workspaceId, ListUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <p>查询用户列表</p>
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
     * <h2>Request description\nQueries workspaces under the current tenant with paging. The list does not return soft-deleted records with a status of <code>Deleted</code> by default. Results are stably sorted by creation order on the server side. Use <code>nextToken</code> to retrieve the next page, <code>skip</code> to skip a specified number of workspaces, <code>maxResults</code> to specify the maximum number of records per page, and <code>nameLike</code> to filter workspaces by name using fuzzy match. If <code>maxResults</code> is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries workspaces under the current tenant with paging. The list does not return soft-deleted records with a status of Deleted by default. Results are stably sorted by creation order on the server side.</p>
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
     * <h2>Request description\nQueries workspaces under the current tenant with paging. The list does not return soft-deleted records with a status of <code>Deleted</code> by default. Results are stably sorted by creation order on the server side. Use <code>nextToken</code> to retrieve the next page, <code>skip</code> to skip a specified number of workspaces, <code>maxResults</code> to specify the maximum number of records per page, and <code>nameLike</code> to filter workspaces by name using fuzzy match. If <code>maxResults</code> is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * <b>summary</b> : 
     * <p>Queries workspaces under the current tenant with paging. The list does not return soft-deleted records with a status of Deleted by default. Results are stably sorted by creation order on the server side.</p>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <h2>Operation description</h2>
     * <p>Publishes a specified Skill version to change its state to published.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified Skill version to change its state to published.</p>
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
     * <p>Publishes a specified Skill version to change its state to published.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a specified Skill version to change its state to published.</p>
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
     * <h2>Operation description</h2>
     * <p>Converts a specified Skill version back into an editable draft for further modifications.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a specified Skill version back into an editable draft for further modifications.</p>
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
     * <h2>Operation description</h2>
     * <p>Converts a specified Skill version back into an editable draft for further modifications.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a specified Skill version back into an editable draft for further modifications.</p>
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
     * <p>重置用户密码</p>
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
     * <p>重置用户密码</p>
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
     * <h2>Operation description</h2>
     * <p>Submits a specified AgentSpec draft version for review. If no release pipeline is configured, the version is published directly to online status.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified AgentSpec draft version for review. If no release pipeline is configured, the version is published directly to online status.</p>
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
     * <h2>Operation description</h2>
     * <p>Submits a specified AgentSpec draft version for review. If no release pipeline is configured, the version is published directly to online status.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified AgentSpec draft version for review. If no release pipeline is configured, the version is published directly to online status.</p>
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
     * <p>Updates the ServiceEndpoint binding, enabled/disabled status, or channel behavior configuration of an IM channel. At least one updatable field must be provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the ServiceEndpoint binding, enabled/disabled status, or channel behavior configuration of an IM channel. At least one updatable field must be provided.</p>
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
     * <p>Updates the ServiceEndpoint binding, enabled/disabled status, or channel behavior configuration of an IM channel. At least one updatable field must be provided.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the ServiceEndpoint binding, enabled/disabled status, or channel behavior configuration of an IM channel. At least one updatable field must be provided.</p>
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
     * <p>Performs a full update of the channel credential for a specified IM channel of an agent. Secrets are not returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a full update of the channel credential for a specified IM channel of an agent. Secrets are not returned in the response.</p>
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
     * <p>Performs a full update of the channel credential for a specified IM channel of an agent. Secrets are not returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a full update of the channel credential for a specified IM channel of an agent. Secrets are not returned in the response.</p>
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
     * <b>summary</b> : 
     * <p>更新凭证</p>
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
     * <b>summary</b> : 
     * <p>更新凭证</p>
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
     * <b>summary</b> : 
     * <p>Updates the login switch, member synchronization switch, or application configuration of a specified external identity provider in a workspace. Unspecified properties remain unchanged. The update is an asynchronous operation. After the API returns, you can call GetIdentityProvider to query the status and track progress.</p>
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
     * <b>summary</b> : 
     * <p>Updates the login switch, member synchronization switch, or application configuration of a specified external identity provider in a workspace. Unspecified properties remain unchanged. The update is an asynchronous operation. After the API returns, you can call GetIdentityProvider to query the status and track progress.</p>
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
     * <b>summary</b> : 
     * <p>Updates the description of a specified model. Other model configurations cannot be modified through this operation.</p>
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
     * <b>summary</b> : 
     * <p>Updates the description of a specified model. Other model configurations cannot be modified through this operation.</p>
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
     * <p>Updates the mutable configuration of a specified model connection and resubmits the publish task. The protocol cannot be modified after the model connection is created.</p>
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
     * <p>Updates the mutable configuration of a specified model connection and resubmits the publish task. The protocol cannot be modified after the model connection is created.</p>
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
     * <h2>Operation description</h2>
     * <p>Updates the business tags of a specified Skill. Other attributes that are not included in the request remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags of a specified Skill. Other attributes that are not included in the request remain unchanged.</p>
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
     * <h2>Operation description</h2>
     * <p>Updates the business tags of a specified Skill. Other attributes that are not included in the request remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the business tags of a specified Skill. Other attributes that are not included in the request remain unchanged.</p>
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
     * <h2>Request description</h2>
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
     * <h2>Request description</h2>
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
     * <p>更新团队</p>
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
     * <p>更新团队</p>
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
     * <p>更新用户</p>
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
     * <p>更新用户</p>
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
     * <h2>Operation description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> status can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this operation. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must also provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or network configuration of a workspace. Only workspaces in the Initialized status can be updated. Status, TenantId, and RegionId are maintained by the server and cannot be modified through this operation.</p>
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
     * <h2>Operation description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> status can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this operation. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must also provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or network configuration of a workspace. Only workspaces in the Initialized status can be updated. Status, TenantId, and RegionId are maintained by the server and cannot be modified through this operation.</p>
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
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses it, and imports the AgentSpec into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses it, and imports the AgentSpec into the current workspace.</p>
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
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses it, and imports the AgentSpec into the current workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses it, and imports the AgentSpec into the current workspace.</p>
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
}
