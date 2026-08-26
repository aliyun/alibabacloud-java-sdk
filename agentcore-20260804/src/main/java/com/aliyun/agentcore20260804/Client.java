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
            new TeaPair("method", "PATCH"),
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
            new TeaPair("method", "PATCH"),
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
     * <p>更新模型连接</p>
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
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新模型连接</p>
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
}
