// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408;

import com.aliyun.tea.*;
import com.aliyun.chatbot20220408.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("chatbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 申请流式网关AccessToken
     *
     * @param request ApplyForStreamAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyForStreamAccessTokenResponse
     */
    public ApplyForStreamAccessTokenResponse applyForStreamAccessTokenWithOptions(ApplyForStreamAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyForStreamAccessToken"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyForStreamAccessTokenResponse());
    }

    /**
     * @summary 申请流式网关AccessToken
     *
     * @param request ApplyForStreamAccessTokenRequest
     * @return ApplyForStreamAccessTokenResponse
     */
    public ApplyForStreamAccessTokenResponse applyForStreamAccessToken(ApplyForStreamAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyForStreamAccessTokenWithOptions(request, runtime);
    }

    /**
     * @summary 会话-联想API
     *
     * @param tmpReq AssociateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateResponse
     */
    public AssociateResponse associateWithOptions(AssociateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AssociateShrinkRequest request = new AssociateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.perspective)) {
            request.perspectiveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.perspective, "Perspective", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveShrink)) {
            query.put("Perspective", request.perspectiveShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommendNum)) {
            query.put("RecommendNum", request.recommendNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Associate"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateResponse());
    }

    /**
     * @summary 会话-联想API
     *
     * @param request AssociateRequest
     * @return AssociateResponse
     */
    public AssociateResponse associate(AssociateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateWithOptions(request, runtime);
    }

    /**
     * @summary 获取欢迎语
     *
     * @param request BeginSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BeginSessionResponse
     */
    public BeginSessionResponse beginSessionWithOptions(BeginSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BeginSession"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BeginSessionResponse());
    }

    /**
     * @summary 获取欢迎语
     *
     * @param request BeginSessionRequest
     * @return BeginSessionResponse
     */
    public BeginSessionResponse beginSession(BeginSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beginSessionWithOptions(request, runtime);
    }

    /**
     * @summary 取消机器人发布
     *
     * @param request CancelInstancePublishTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelInstancePublishTaskResponse
     */
    public CancelInstancePublishTaskResponse cancelInstancePublishTaskWithOptions(CancelInstancePublishTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelInstancePublishTask"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelInstancePublishTaskResponse());
    }

    /**
     * @summary 取消机器人发布
     *
     * @param request CancelInstancePublishTaskRequest
     * @return CancelInstancePublishTaskResponse
     */
    public CancelInstancePublishTaskResponse cancelInstancePublishTask(CancelInstancePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelInstancePublishTaskWithOptions(request, runtime);
    }

    /**
     * @summary 取消发布任务
     *
     * @param request CancelPublishTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPublishTaskResponse
     */
    public CancelPublishTaskResponse cancelPublishTaskWithOptions(CancelPublishTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPublishTask"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPublishTaskResponse());
    }

    /**
     * @summary 取消发布任务
     *
     * @param request CancelPublishTaskRequest
     * @return CancelPublishTaskResponse
     */
    public CancelPublishTaskResponse cancelPublishTask(CancelPublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPublishTaskWithOptions(request, runtime);
    }

    /**
     * @summary 会话API
     *
     * @param tmpReq ChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChatShrinkRequest request = new ChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.perspective)) {
            request.perspectiveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.perspective, "Perspective", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentName)) {
            query.put("IntentName", request.intentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveShrink)) {
            query.put("Perspective", request.perspectiveShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sandBox)) {
            query.put("SandBox", request.sandBox);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            query.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderNick)) {
            query.put("SenderNick", request.senderNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorParam)) {
            query.put("VendorParam", request.vendorParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatResponse());
    }

    /**
     * @summary 会话API
     *
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatWithOptions(request, runtime);
    }

    /**
     * @summary 继续机器人发布
     *
     * @param request ContinueInstancePublishTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinueInstancePublishTaskResponse
     */
    public ContinueInstancePublishTaskResponse continueInstancePublishTaskWithOptions(ContinueInstancePublishTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueInstancePublishTask"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinueInstancePublishTaskResponse());
    }

    /**
     * @summary 继续机器人发布
     *
     * @param request ContinueInstancePublishTaskRequest
     * @return ContinueInstancePublishTaskResponse
     */
    public ContinueInstancePublishTaskResponse continueInstancePublishTask(ContinueInstancePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueInstancePublishTaskWithOptions(request, runtime);
    }

    /**
     * @summary 新增类目
     *
     * @param request CreateCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCategoryResponse
     */
    public CreateCategoryResponse createCategoryWithOptions(CreateCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            body.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeType)) {
            body.put("KnowledgeType", request.knowledgeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            body.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCategory"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCategoryResponse());
    }

    /**
     * @summary 新增类目
     *
     * @param request CreateCategoryRequest
     * @return CreateCategoryResponse
     */
    public CreateCategoryResponse createCategory(CreateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 新建FAQ关联问
     *
     * @param request CreateConnQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConnQuestionResponse
     */
    public CreateConnQuestionResponse createConnQuestionWithOptions(CreateConnQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connQuestionId)) {
            body.put("ConnQuestionId", request.connQuestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConnQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConnQuestionResponse());
    }

    /**
     * @summary 新建FAQ关联问
     *
     * @param request CreateConnQuestionRequest
     * @return CreateConnQuestionResponse
     */
    public CreateConnQuestionResponse createConnQuestion(CreateConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 实体-创建
     *
     * @param request CreateDSEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDSEntityResponse
     */
    public CreateDSEntityResponse createDSEntityWithOptions(CreateDSEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            query.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDSEntity"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDSEntityResponse());
    }

    /**
     * @summary 实体-创建
     *
     * @param request CreateDSEntityRequest
     * @return CreateDSEntityResponse
     */
    public CreateDSEntityResponse createDSEntity(CreateDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDSEntityWithOptions(request, runtime);
    }

    /**
     * @summary 实体成员-创建
     *
     * @param tmpReq CreateDSEntityValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDSEntityValueResponse
     */
    public CreateDSEntityValueResponse createDSEntityValueWithOptions(CreateDSEntityValueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDSEntityValueShrinkRequest request = new CreateDSEntityValueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.synonyms)) {
            request.synonymsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.synonyms, "Synonyms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synonymsShrink)) {
            body.put("Synonyms", request.synonymsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDSEntityValue"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDSEntityValueResponse());
    }

    /**
     * @summary 实体成员-创建
     *
     * @param request CreateDSEntityValueRequest
     * @return CreateDSEntityValueResponse
     */
    public CreateDSEntityValueResponse createDSEntityValue(CreateDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDSEntityValueWithOptions(request, runtime);
    }

    /**
     * @summary 创建文档
     *
     * @param tmpReq CreateDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocResponse
     */
    public CreateDocResponse createDocWithOptions(CreateDocRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDocShrinkRequest request = new CreateDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIds)) {
            request.tagIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIds, "TagIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            query.put("Meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdsShrink)) {
            query.put("TagIds", request.tagIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDoc"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDocResponse());
    }

    /**
     * @summary 创建文档
     *
     * @param request CreateDocRequest
     * @return CreateDocResponse
     */
    public CreateDocResponse createDoc(CreateDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocWithOptions(request, runtime);
    }

    /**
     * @summary 新建FAQ
     *
     * @param request CreateFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFaqResponse
     */
    public CreateFaqResponse createFaqWithOptions(CreateFaqRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionContent)) {
            body.put("SolutionContent", request.solutionContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionType)) {
            body.put("SolutionType", request.solutionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFaq"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFaqResponse());
    }

    /**
     * @summary 新建FAQ
     *
     * @param request CreateFaqRequest
     * @return CreateFaqResponse
     */
    public CreateFaqResponse createFaq(CreateFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFaqWithOptions(request, runtime);
    }

    /**
     * @summary 机器人-创建
     *
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.introduction)) {
            query.put("Introduction", request.introduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageCode)) {
            query.put("LanguageCode", request.languageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotType)) {
            query.put("RobotType", request.robotType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * @summary 机器人-创建
     *
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 创建机器人发布任务
     *
     * @param request CreateInstancePublishTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstancePublishTaskResponse
     */
    public CreateInstancePublishTaskResponse createInstancePublishTaskWithOptions(CreateInstancePublishTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstancePublishTask"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstancePublishTaskResponse());
    }

    /**
     * @summary 创建机器人发布任务
     *
     * @param request CreateInstancePublishTaskRequest
     * @return CreateInstancePublishTaskResponse
     */
    public CreateInstancePublishTaskResponse createInstancePublishTask(CreateInstancePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstancePublishTaskWithOptions(request, runtime);
    }

    /**
     * @summary 意图-创建
     *
     * @param tmpReq CreateIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntentResponse
     */
    public CreateIntentResponse createIntentWithOptions(CreateIntentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIntentShrinkRequest request = new CreateIntentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.intentDefinition)) {
            request.intentDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.intentDefinition, "IntentDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentDefinitionShrink)) {
            query.put("IntentDefinition", request.intentDefinitionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntent"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntentResponse());
    }

    /**
     * @summary 意图-创建
     *
     * @param request CreateIntentRequest
     * @return CreateIntentResponse
     */
    public CreateIntentResponse createIntent(CreateIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIntentWithOptions(request, runtime);
    }

    /**
     * @summary 意图-LGF-创建
     *
     * @param tmpReq CreateLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLgfResponse
     */
    public CreateLgfResponse createLgfWithOptions(CreateLgfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLgfShrinkRequest request = new CreateLgfShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lgfDefinition)) {
            request.lgfDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lgfDefinition, "LgfDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfDefinitionShrink)) {
            query.put("LgfDefinition", request.lgfDefinitionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLgf"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLgfResponse());
    }

    /**
     * @summary 意图-LGF-创建
     *
     * @param request CreateLgfRequest
     * @return CreateLgfResponse
     */
    public CreateLgfResponse createLgf(CreateLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLgfWithOptions(request, runtime);
    }

    /**
     * @summary 视角-创建
     *
     * @param request CreatePerspectiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePerspectiveResponse
     */
    public CreatePerspectiveResponse createPerspectiveWithOptions(CreatePerspectiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePerspective"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePerspectiveResponse());
    }

    /**
     * @summary 视角-创建
     *
     * @param request CreatePerspectiveRequest
     * @return CreatePerspectiveResponse
     */
    public CreatePerspectiveResponse createPerspective(CreatePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPerspectiveWithOptions(request, runtime);
    }

    /**
     * @summary 创建发布任务
     *
     * @param tmpReq CreatePublishTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublishTaskResponse
     */
    public CreatePublishTaskResponse createPublishTaskWithOptions(CreatePublishTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePublishTaskShrinkRequest request = new CreatePublishTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIdList)) {
            request.dataIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIdList, "DataIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIdListShrink)) {
            query.put("DataIdList", request.dataIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublishTask"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublishTaskResponse());
    }

    /**
     * @summary 创建发布任务
     *
     * @param request CreatePublishTaskRequest
     * @return CreatePublishTaskResponse
     */
    public CreatePublishTaskResponse createPublishTask(CreatePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublishTaskWithOptions(request, runtime);
    }

    /**
     * @summary 新建FAQ相似问
     *
     * @param request CreateSimQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSimQuestionResponse
     */
    public CreateSimQuestionResponse createSimQuestionWithOptions(CreateSimQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimQuestionResponse());
    }

    /**
     * @summary 新建FAQ相似问
     *
     * @param request CreateSimQuestionRequest
     * @return CreateSimQuestionResponse
     */
    public CreateSimQuestionResponse createSimQuestion(CreateSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 新建FAQ答案
     *
     * @param request CreateSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSolutionResponse
     */
    public CreateSolutionResponse createSolutionWithOptions(CreateSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveCodes)) {
            query.put("PerspectiveCodes", request.perspectiveCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSolution"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSolutionResponse());
    }

    /**
     * @summary 新建FAQ答案
     *
     * @param request CreateSolutionRequest
     * @return CreateSolutionResponse
     */
    public CreateSolutionResponse createSolution(CreateSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSolutionWithOptions(request, runtime);
    }

    /**
     * @summary 意图-话术-创建
     *
     * @param tmpReq CreateUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserSayResponse
     */
    public CreateUserSayResponse createUserSayWithOptions(CreateUserSayRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserSayShrinkRequest request = new CreateUserSayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userSayDefinition)) {
            request.userSayDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userSayDefinition, "UserSayDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayDefinitionShrink)) {
            query.put("UserSayDefinition", request.userSayDefinitionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserSay"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserSayResponse());
    }

    /**
     * @summary 意图-话术-创建
     *
     * @param request CreateUserSayRequest
     * @return CreateUserSayResponse
     */
    public CreateUserSayResponse createUserSay(CreateUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserSayWithOptions(request, runtime);
    }

    /**
     * @summary 删除类目
     *
     * @param request DeleteCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCategory"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCategoryResponse());
    }

    /**
     * @summary 删除类目
     *
     * @param request DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 删除FAQ关联问
     *
     * @param request DeleteConnQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnQuestionResponse
     */
    public DeleteConnQuestionResponse deleteConnQuestionWithOptions(DeleteConnQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outlineId)) {
            body.put("OutlineId", request.outlineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnQuestionResponse());
    }

    /**
     * @summary 删除FAQ关联问
     *
     * @param request DeleteConnQuestionRequest
     * @return DeleteConnQuestionResponse
     */
    public DeleteConnQuestionResponse deleteConnQuestion(DeleteConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 实体-删除
     *
     * @param request DeleteDSEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDSEntityResponse
     */
    public DeleteDSEntityResponse deleteDSEntityWithOptions(DeleteDSEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDSEntity"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDSEntityResponse());
    }

    /**
     * @summary 实体-删除
     *
     * @param request DeleteDSEntityRequest
     * @return DeleteDSEntityResponse
     */
    public DeleteDSEntityResponse deleteDSEntity(DeleteDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDSEntityWithOptions(request, runtime);
    }

    /**
     * @summary 实体成员-删除
     *
     * @param request DeleteDSEntityValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDSEntityValueResponse
     */
    public DeleteDSEntityValueResponse deleteDSEntityValueWithOptions(DeleteDSEntityValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityValueId)) {
            query.put("EntityValueId", request.entityValueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDSEntityValue"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDSEntityValueResponse());
    }

    /**
     * @summary 实体成员-删除
     *
     * @param request DeleteDSEntityValueRequest
     * @return DeleteDSEntityValueResponse
     */
    public DeleteDSEntityValueResponse deleteDSEntityValue(DeleteDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDSEntityValueWithOptions(request, runtime);
    }

    /**
     * @summary 文档删除
     *
     * @param request DeleteDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocResponse
     */
    public DeleteDocResponse deleteDocWithOptions(DeleteDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDoc"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocResponse());
    }

    /**
     * @summary 文档删除
     *
     * @param request DeleteDocRequest
     * @return DeleteDocResponse
     */
    public DeleteDocResponse deleteDoc(DeleteDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocWithOptions(request, runtime);
    }

    /**
     * @summary 删除FAQ，如果是已发布的知识，删除之后，变成已删除未发布，需要发布才能真正删除
     *
     * @param request DeleteFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaqResponse
     */
    public DeleteFaqResponse deleteFaqWithOptions(DeleteFaqRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaq"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaqResponse());
    }

    /**
     * @summary 删除FAQ，如果是已发布的知识，删除之后，变成已删除未发布，需要发布才能真正删除
     *
     * @param request DeleteFaqRequest
     * @return DeleteFaqResponse
     */
    public DeleteFaqResponse deleteFaq(DeleteFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaqWithOptions(request, runtime);
    }

    /**
     * @summary 机器人-删除
     *
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * @summary 机器人-删除
     *
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 意图-删除
     *
     * @param request DeleteIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIntentResponse
     */
    public DeleteIntentResponse deleteIntentWithOptions(DeleteIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIntent"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIntentResponse());
    }

    /**
     * @summary 意图-删除
     *
     * @param request DeleteIntentRequest
     * @return DeleteIntentResponse
     */
    public DeleteIntentResponse deleteIntent(DeleteIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIntentWithOptions(request, runtime);
    }

    /**
     * @summary 意图-LGF-删除
     *
     * @param request DeleteLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLgfResponse
     */
    public DeleteLgfResponse deleteLgfWithOptions(DeleteLgfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfId)) {
            query.put("LgfId", request.lgfId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLgf"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLgfResponse());
    }

    /**
     * @summary 意图-LGF-删除
     *
     * @param request DeleteLgfRequest
     * @return DeleteLgfResponse
     */
    public DeleteLgfResponse deleteLgf(DeleteLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLgfWithOptions(request, runtime);
    }

    /**
     * @summary 视角-删除
     *
     * @param request DeletePerspectiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePerspectiveResponse
     */
    public DeletePerspectiveResponse deletePerspectiveWithOptions(DeletePerspectiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveId)) {
            query.put("PerspectiveId", request.perspectiveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePerspective"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePerspectiveResponse());
    }

    /**
     * @summary 视角-删除
     *
     * @param request DeletePerspectiveRequest
     * @return DeletePerspectiveResponse
     */
    public DeletePerspectiveResponse deletePerspective(DeletePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePerspectiveWithOptions(request, runtime);
    }

    /**
     * @summary 删除FAQ相似问
     *
     * @param request DeleteSimQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSimQuestionResponse
     */
    public DeleteSimQuestionResponse deleteSimQuestionWithOptions(DeleteSimQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.simQuestionId)) {
            body.put("SimQuestionId", request.simQuestionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSimQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSimQuestionResponse());
    }

    /**
     * @summary 删除FAQ相似问
     *
     * @param request DeleteSimQuestionRequest
     * @return DeleteSimQuestionResponse
     */
    public DeleteSimQuestionResponse deleteSimQuestion(DeleteSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSimQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 删除FAQ答案
     *
     * @param request DeleteSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSolutionResponse
     */
    public DeleteSolutionResponse deleteSolutionWithOptions(DeleteSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSolution"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSolutionResponse());
    }

    /**
     * @summary 删除FAQ答案
     *
     * @param request DeleteSolutionRequest
     * @return DeleteSolutionResponse
     */
    public DeleteSolutionResponse deleteSolution(DeleteSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSolutionWithOptions(request, runtime);
    }

    /**
     * @summary 意图-用户话术-删除
     *
     * @param request DeleteUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserSayResponse
     */
    public DeleteUserSayResponse deleteUserSayWithOptions(DeleteUserSayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayId)) {
            query.put("UserSayId", request.userSayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserSay"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserSayResponse());
    }

    /**
     * @summary 意图-用户话术-删除
     *
     * @param request DeleteUserSayRequest
     * @return DeleteUserSayResponse
     */
    public DeleteUserSayResponse deleteUserSay(DeleteUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserSayWithOptions(request, runtime);
    }

    /**
     * @summary 查看单个类目信息
     *
     * @param request DescribeCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCategoryResponse
     */
    public DescribeCategoryResponse describeCategoryWithOptions(DescribeCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCategory"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCategoryResponse());
    }

    /**
     * @summary 查看单个类目信息
     *
     * @param request DescribeCategoryRequest
     * @return DescribeCategoryResponse
     */
    public DescribeCategoryResponse describeCategory(DescribeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 实体-详情
     *
     * @param request DescribeDSEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDSEntityResponse
     */
    public DescribeDSEntityResponse describeDSEntityWithOptions(DescribeDSEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDSEntity"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDSEntityResponse());
    }

    /**
     * @summary 实体-详情
     *
     * @param request DescribeDSEntityRequest
     * @return DescribeDSEntityResponse
     */
    public DescribeDSEntityResponse describeDSEntity(DescribeDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDSEntityWithOptions(request, runtime);
    }

    /**
     * @summary 文档详情
     *
     * @param request DescribeDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocResponse
     */
    public DescribeDocResponse describeDocWithOptions(DescribeDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDetail)) {
            query.put("ShowDetail", request.showDetail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDoc"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocResponse());
    }

    /**
     * @summary 文档详情
     *
     * @param request DescribeDocRequest
     * @return DescribeDocResponse
     */
    public DescribeDocResponse describeDoc(DescribeDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocWithOptions(request, runtime);
    }

    /**
     * @summary 知识详情
     *
     * @param request DescribeFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaqResponse
     */
    public DescribeFaqResponse describeFaqWithOptions(DescribeFaqRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaq"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaqResponse());
    }

    /**
     * @summary 知识详情
     *
     * @param request DescribeFaqRequest
     * @return DescribeFaqResponse
     */
    public DescribeFaqResponse describeFaq(DescribeFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaqWithOptions(request, runtime);
    }

    /**
     * @summary 机器人-详情
     *
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * @summary 机器人-详情
     *
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 意图-详情
     *
     * @param request DescribeIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIntentResponse
     */
    public DescribeIntentResponse describeIntentWithOptions(DescribeIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            body.put("IntentId", request.intentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIntent"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIntentResponse());
    }

    /**
     * @summary 意图-详情
     *
     * @param request DescribeIntentRequest
     * @return DescribeIntentResponse
     */
    public DescribeIntentResponse describeIntent(DescribeIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntentWithOptions(request, runtime);
    }

    /**
     * @summary 视角-详情
     *
     * @param request DescribePerspectiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePerspectiveResponse
     */
    public DescribePerspectiveResponse describePerspectiveWithOptions(DescribePerspectiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveId)) {
            query.put("PerspectiveId", request.perspectiveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePerspective"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePerspectiveResponse());
    }

    /**
     * @summary 视角-详情
     *
     * @param request DescribePerspectiveRequest
     * @return DescribePerspectiveResponse
     */
    public DescribePerspectiveResponse describePerspective(DescribePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePerspectiveWithOptions(request, runtime);
    }

    /**
     * @summary 问答点赞、点踩API
     *
     * @param request FeedbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FeedbackResponse
     */
    public FeedbackResponse feedbackWithOptions(FeedbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedbackContent)) {
            query.put("FeedbackContent", request.feedbackContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Feedback"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackResponse());
    }

    /**
     * @summary 问答点赞、点踩API
     *
     * @param request FeedbackRequest
     * @return FeedbackResponse
     */
    public FeedbackResponse feedback(FeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.feedbackWithOptions(request, runtime);
    }

    /**
     * @summary 生成用户免登Token
     *
     * @param request GenerateUserAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUserAccessTokenResponse
     */
    public GenerateUserAccessTokenResponse generateUserAccessTokenWithOptions(GenerateUserAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foreignId)) {
            query.put("ForeignId", request.foreignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nick)) {
            query.put("Nick", request.nick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUserAccessToken"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUserAccessTokenResponse());
    }

    /**
     * @summary 生成用户免登Token
     *
     * @param request GenerateUserAccessTokenRequest
     * @return GenerateUserAccessTokenResponse
     */
    public GenerateUserAccessTokenResponse generateUserAccessToken(GenerateUserAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUserAccessTokenWithOptions(request, runtime);
    }

    /**
     * @summary 获取业务空间信息
     *
     * @param request GetAgentInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentInfoResponse
     */
    public GetAgentInfoResponse getAgentInfoWithOptions(GetAgentInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentInfo"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentInfoResponse());
    }

    /**
     * @summary 获取业务空间信息
     *
     * @param request GetAgentInfoRequest
     * @return GetAgentInfoResponse
     */
    public GetAgentInfoResponse getAgentInfo(GetAgentInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentInfoWithOptions(request, runtime);
    }

    /**
     * @summary 获取异步函数执行结果接口
     *
     * @param request GetAsyncResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncResultResponse
     */
    public GetAsyncResultResponse getAsyncResultWithOptions(GetAsyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncResult"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncResultResponse());
    }

    /**
     * @summary 获取异步函数执行结果接口
     *
     * @param request GetAsyncResultRequest
     * @return GetAsyncResultResponse
     */
    public GetAsyncResultResponse getAsyncResult(GetAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncResultWithOptions(request, runtime);
    }

    /**
     * @summary 查询机器人发布进度
     *
     * @param request GetInstancePublishTaskStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstancePublishTaskStateResponse
     */
    public GetInstancePublishTaskStateResponse getInstancePublishTaskStateWithOptions(GetInstancePublishTaskStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstancePublishTaskState"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstancePublishTaskStateResponse());
    }

    /**
     * @summary 查询机器人发布进度
     *
     * @param request GetInstancePublishTaskStateRequest
     * @return GetInstancePublishTaskStateResponse
     */
    public GetInstancePublishTaskStateResponse getInstancePublishTaskState(GetInstancePublishTaskStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstancePublishTaskStateWithOptions(request, runtime);
    }

    /**
     * @summary 查询发布进度
     *
     * @param request GetPublishTaskStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublishTaskStateResponse
     */
    public GetPublishTaskStateResponse getPublishTaskStateWithOptions(GetPublishTaskStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublishTaskState"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublishTaskStateResponse());
    }

    /**
     * @summary 查询发布进度
     *
     * @param request GetPublishTaskStateRequest
     * @return GetPublishTaskStateResponse
     */
    public GetPublishTaskStateResponse getPublishTaskState(GetPublishTaskStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublishTaskStateWithOptions(request, runtime);
    }

    /**
     * @summary 初始化im连接信息
     *
     * @param request InitIMConnectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitIMConnectResponse
     */
    public InitIMConnectResponse initIMConnectWithOptions(InitIMConnectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessToken)) {
            query.put("UserAccessToken", request.userAccessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitIMConnect"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitIMConnectResponse());
    }

    /**
     * @summary 初始化im连接信息
     *
     * @param request InitIMConnectRequest
     * @return InitIMConnectResponse
     */
    public InitIMConnectResponse initIMConnect(InitIMConnectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initIMConnectWithOptions(request, runtime);
    }

    /**
     * @summary 机器人-绑定类目
     *
     * @param request LinkInstanceCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LinkInstanceCategoryResponse
     */
    public LinkInstanceCategoryResponse linkInstanceCategoryWithOptions(LinkInstanceCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryIds)) {
            body.put("CategoryIds", request.categoryIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LinkInstanceCategory"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LinkInstanceCategoryResponse());
    }

    /**
     * @summary 机器人-绑定类目
     *
     * @param request LinkInstanceCategoryRequest
     * @return LinkInstanceCategoryResponse
     */
    public LinkInstanceCategoryResponse linkInstanceCategory(LinkInstanceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.linkInstanceCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 获取业务空间列表
     *
     * @param request ListAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentResponse
     */
    public ListAgentResponse listAgentWithOptions(ListAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsCodes)) {
            query.put("GoodsCodes", request.goodsCodes);
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
            new TeaPair("action", "ListAgent"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentResponse());
    }

    /**
     * @summary 获取业务空间列表
     *
     * @param request ListAgentRequest
     * @return ListAgentResponse
     */
    public ListAgentResponse listAgent(ListAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentWithOptions(request, runtime);
    }

    /**
     * @summary 类目列表
     *
     * @param request ListCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategoryWithOptions(ListCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeType)) {
            body.put("KnowledgeType", request.knowledgeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            body.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategory"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoryResponse());
    }

    /**
     * @summary 类目列表
     *
     * @param request ListCategoryRequest
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategory(ListCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 查询FAQ关联问列表
     *
     * @param request ListConnQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnQuestionResponse
     */
    public ListConnQuestionResponse listConnQuestionWithOptions(ListConnQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnQuestionResponse());
    }

    /**
     * @summary 查询FAQ关联问列表
     *
     * @param request ListConnQuestionRequest
     * @return ListConnQuestionResponse
     */
    public ListConnQuestionResponse listConnQuestion(ListConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 实体-列表
     *
     * @param request ListDSEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDSEntityResponse
     */
    public ListDSEntityResponse listDSEntityWithOptions(ListDSEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
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
            new TeaPair("action", "ListDSEntity"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDSEntityResponse());
    }

    /**
     * @summary 实体-列表
     *
     * @param request ListDSEntityRequest
     * @return ListDSEntityResponse
     */
    public ListDSEntityResponse listDSEntity(ListDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDSEntityWithOptions(request, runtime);
    }

    /**
     * @summary 实体成员-列表
     *
     * @param request ListDSEntityValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDSEntityValueResponse
     */
    public ListDSEntityValueResponse listDSEntityValueWithOptions(ListDSEntityValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityValueId)) {
            body.put("EntityValueId", request.entityValueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDSEntityValue"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDSEntityValueResponse());
    }

    /**
     * @summary 实体成员-列表
     *
     * @param request ListDSEntityValueRequest
     * @return ListDSEntityValueResponse
     */
    public ListDSEntityValueResponse listDSEntityValue(ListDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDSEntityValueWithOptions(request, runtime);
    }

    /**
     * @summary 机器人-修改
     *
     * @param request ListInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotType)) {
            query.put("RobotType", request.robotType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    /**
     * @summary 机器人-修改
     *
     * @param request ListInstanceRequest
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 意图-列表
     *
     * @param request ListIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntentResponse
     */
    public ListIntentResponse listIntentWithOptions(ListIntentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentName)) {
            query.put("IntentName", request.intentName);
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
            new TeaPair("action", "ListIntent"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntentResponse());
    }

    /**
     * @summary 意图-列表
     *
     * @param request ListIntentRequest
     * @return ListIntentResponse
     */
    public ListIntentResponse listIntent(ListIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntentWithOptions(request, runtime);
    }

    /**
     * @summary 意图-LGF-列表
     *
     * @param request ListLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLgfResponse
     */
    public ListLgfResponse listLgfWithOptions(ListLgfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfText)) {
            query.put("LgfText", request.lgfText);
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
            new TeaPair("action", "ListLgf"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLgfResponse());
    }

    /**
     * @summary 意图-LGF-列表
     *
     * @param request ListLgfRequest
     * @return ListLgfResponse
     */
    public ListLgfResponse listLgf(ListLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLgfWithOptions(request, runtime);
    }

    /**
     * @summary 获取业务空间下可集成的SaaS信息列表
     *
     * @param request ListSaasInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSaasInfoResponse
     */
    public ListSaasInfoResponse listSaasInfoWithOptions(ListSaasInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saasGroupCodes)) {
            query.put("SaasGroupCodes", request.saasGroupCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saasName)) {
            query.put("SaasName", request.saasName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSaasInfo"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSaasInfoResponse());
    }

    /**
     * @summary 获取业务空间下可集成的SaaS信息列表
     *
     * @param request ListSaasInfoRequest
     * @return ListSaasInfoResponse
     */
    public ListSaasInfoResponse listSaasInfo(ListSaasInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSaasInfoWithOptions(request, runtime);
    }

    /**
     * @summary 获取业务空间下可集成的权限组信息
     *
     * @param request ListSaasPermissionGroupInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSaasPermissionGroupInfosResponse
     */
    public ListSaasPermissionGroupInfosResponse listSaasPermissionGroupInfosWithOptions(ListSaasPermissionGroupInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSaasPermissionGroupInfos"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSaasPermissionGroupInfosResponse());
    }

    /**
     * @summary 获取业务空间下可集成的权限组信息
     *
     * @param request ListSaasPermissionGroupInfosRequest
     * @return ListSaasPermissionGroupInfosResponse
     */
    public ListSaasPermissionGroupInfosResponse listSaasPermissionGroupInfos(ListSaasPermissionGroupInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSaasPermissionGroupInfosWithOptions(request, runtime);
    }

    /**
     * @summary FAQ相似问列表
     *
     * @param request ListSimQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSimQuestionResponse
     */
    public ListSimQuestionResponse listSimQuestionWithOptions(ListSimQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSimQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSimQuestionResponse());
    }

    /**
     * @summary FAQ相似问列表
     *
     * @param request ListSimQuestionRequest
     * @return ListSimQuestionResponse
     */
    public ListSimQuestionResponse listSimQuestion(ListSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSimQuestionWithOptions(request, runtime);
    }

    /**
     * @summary FAQ答案列表
     *
     * @param request ListSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSolutionResponse
     */
    public ListSolutionResponse listSolutionWithOptions(ListSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSolution"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSolutionResponse());
    }

    /**
     * @summary FAQ答案列表
     *
     * @param request ListSolutionRequest
     * @return ListSolutionResponse
     */
    public ListSolutionResponse listSolution(ListSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSolutionWithOptions(request, runtime);
    }

    /**
     * @summary Tongyi对话明细查询接口
     *
     * @param request ListTongyiChatHistorysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTongyiChatHistorysResponse
     */
    public ListTongyiChatHistorysResponse listTongyiChatHistorysWithOptions(ListTongyiChatHistorysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotInstanceId)) {
            query.put("RobotInstanceId", request.robotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTongyiChatHistorys"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTongyiChatHistorysResponse());
    }

    /**
     * @summary Tongyi对话明细查询接口
     *
     * @param request ListTongyiChatHistorysRequest
     * @return ListTongyiChatHistorysResponse
     */
    public ListTongyiChatHistorysResponse listTongyiChatHistorys(ListTongyiChatHistorysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTongyiChatHistorysWithOptions(request, runtime);
    }

    /**
     * @summary 话术-列表
     *
     * @param request ListUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserSayResponse
     */
    public ListUserSayResponse listUserSayWithOptions(ListUserSayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
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
            new TeaPair("action", "ListUserSay"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserSayResponse());
    }

    /**
     * @summary 话术-列表
     *
     * @param request ListUserSayRequest
     * @return ListUserSayResponse
     */
    public ListUserSayResponse listUserSay(ListUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserSayWithOptions(request, runtime);
    }

    /**
     * @summary 统一NLU接口
     *
     * @param request NluRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NluResponse
     */
    public NluResponse nluWithOptions(NluRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Nlu"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NluResponse());
    }

    /**
     * @summary 统一NLU接口
     *
     * @param request NluRequest
     * @return NluResponse
     */
    public NluResponse nlu(NluRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.nluWithOptions(request, runtime);
    }

    /**
     * @summary 视角-列表
     *
     * @param request QueryPerspectivesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPerspectivesResponse
     */
    public QueryPerspectivesResponse queryPerspectivesWithOptions(QueryPerspectivesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPerspectives"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPerspectivesResponse());
    }

    /**
     * @summary 视角-列表
     *
     * @param request QueryPerspectivesRequest
     * @return QueryPerspectivesResponse
     */
    public QueryPerspectivesResponse queryPerspectives(QueryPerspectivesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPerspectivesWithOptions(request, runtime);
    }

    /**
     * @summary 文档重试
     *
     * @param request RetryDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryDocResponse
     */
    public RetryDocResponse retryDocWithOptions(RetryDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryDoc"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryDocResponse());
    }

    /**
     * @summary 文档重试
     *
     * @param request RetryDocRequest
     * @return RetryDocResponse
     */
    public RetryDocResponse retryDoc(RetryDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryDocWithOptions(request, runtime);
    }

    /**
     * @summary 文档搜索
     *
     * @param tmpReq SearchDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchDocResponse
     */
    public SearchDocResponse searchDocWithOptions(SearchDocRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchDocShrinkRequest request = new SearchDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryIds)) {
            request.categoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryIds, "CategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIds)) {
            request.tagIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIds, "TagIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryIdsShrink)) {
            query.put("CategoryIds", request.categoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeBegin)) {
            query.put("CreateTimeBegin", request.createTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserName)) {
            query.put("CreateUserName", request.createUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeBegin)) {
            query.put("EndTimeBegin", request.endTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeEnd)) {
            query.put("EndTimeEnd", request.endTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTimeBegin)) {
            query.put("ModifyTimeBegin", request.modifyTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTimeEnd)) {
            query.put("ModifyTimeEnd", request.modifyTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyUserName)) {
            query.put("ModifyUserName", request.modifyUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processStatus)) {
            query.put("ProcessStatus", request.processStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchScope)) {
            query.put("SearchScope", request.searchScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeBegin)) {
            query.put("StartTimeBegin", request.startTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeEnd)) {
            query.put("StartTimeEnd", request.startTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdsShrink)) {
            query.put("TagIds", request.tagIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchDoc"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchDocResponse());
    }

    /**
     * @summary 文档搜索
     *
     * @param request SearchDocRequest
     * @return SearchDocResponse
     */
    public SearchDocResponse searchDoc(SearchDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchDocWithOptions(request, runtime);
    }

    /**
     * @summary 知识搜索
     *
     * @param tmpReq SearchFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFaqResponse
     */
    public SearchFaqResponse searchFaqWithOptions(SearchFaqRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchFaqShrinkRequest request = new SearchFaqShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryIds)) {
            request.categoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryIds, "CategoryIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryIdsShrink)) {
            body.put("CategoryIds", request.categoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeBegin)) {
            body.put("CreateTimeBegin", request.createTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserName)) {
            body.put("CreateUserName", request.createUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeBegin)) {
            body.put("EndTimeBegin", request.endTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeEnd)) {
            body.put("EndTimeEnd", request.endTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTimeBegin)) {
            body.put("ModifyTimeBegin", request.modifyTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTimeEnd)) {
            body.put("ModifyTimeEnd", request.modifyTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyUserName)) {
            body.put("ModifyUserName", request.modifyUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchScope)) {
            body.put("SearchScope", request.searchScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeBegin)) {
            body.put("StartTimeBegin", request.startTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeEnd)) {
            body.put("StartTimeEnd", request.startTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFaq"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFaqResponse());
    }

    /**
     * @summary 知识搜索
     *
     * @param request SearchFaqRequest
     * @return SearchFaqResponse
     */
    public SearchFaqResponse searchFaq(SearchFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchFaqWithOptions(request, runtime);
    }

    /**
     * @summary 编辑类目
     *
     * @param request UpdateCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCategoryResponse
     */
    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            body.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCategory"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCategoryResponse());
    }

    /**
     * @summary 编辑类目
     *
     * @param request UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 更新FAQ关联问
     *
     * @param request UpdateConnQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnQuestionResponse
     */
    public UpdateConnQuestionResponse updateConnQuestionWithOptions(UpdateConnQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connQuestionId)) {
            body.put("ConnQuestionId", request.connQuestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outlineId)) {
            body.put("OutlineId", request.outlineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnQuestionResponse());
    }

    /**
     * @summary 更新FAQ关联问
     *
     * @param request UpdateConnQuestionRequest
     * @return UpdateConnQuestionResponse
     */
    public UpdateConnQuestionResponse updateConnQuestion(UpdateConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 实体-更新
     *
     * @param request UpdateDSEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDSEntityResponse
     */
    public UpdateDSEntityResponse updateDSEntityWithOptions(UpdateDSEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            query.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDSEntity"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDSEntityResponse());
    }

    /**
     * @summary 实体-更新
     *
     * @param request UpdateDSEntityRequest
     * @return UpdateDSEntityResponse
     */
    public UpdateDSEntityResponse updateDSEntity(UpdateDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDSEntityWithOptions(request, runtime);
    }

    /**
     * @summary 实体成员-更新
     *
     * @param tmpReq UpdateDSEntityValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDSEntityValueResponse
     */
    public UpdateDSEntityValueResponse updateDSEntityValueWithOptions(UpdateDSEntityValueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDSEntityValueShrinkRequest request = new UpdateDSEntityValueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.synonyms)) {
            request.synonymsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.synonyms, "Synonyms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityValueId)) {
            query.put("EntityValueId", request.entityValueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synonymsShrink)) {
            body.put("Synonyms", request.synonymsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDSEntityValue"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDSEntityValueResponse());
    }

    /**
     * @summary 实体成员-更新
     *
     * @param request UpdateDSEntityValueRequest
     * @return UpdateDSEntityValueResponse
     */
    public UpdateDSEntityValueResponse updateDSEntityValue(UpdateDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDSEntityValueWithOptions(request, runtime);
    }

    /**
     * @summary 文档变更
     *
     * @param tmpReq UpdateDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDocResponse
     */
    public UpdateDocResponse updateDocWithOptions(UpdateDocRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDocShrinkRequest request = new UpdateDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIds)) {
            request.tagIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIds, "TagIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            query.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            query.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            query.put("Meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdsShrink)) {
            query.put("TagIds", request.tagIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDoc"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDocResponse());
    }

    /**
     * @summary 文档变更
     *
     * @param request UpdateDocRequest
     * @return UpdateDocResponse
     */
    public UpdateDocResponse updateDoc(UpdateDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDocWithOptions(request, runtime);
    }

    /**
     * @summary 更新FAQ
     *
     * @param request UpdateFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFaqResponse
     */
    public UpdateFaqResponse updateFaqWithOptions(UpdateFaqRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("KnowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFaq"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFaqResponse());
    }

    /**
     * @summary 更新FAQ
     *
     * @param request UpdateFaqRequest
     * @return UpdateFaqResponse
     */
    public UpdateFaqResponse updateFaq(UpdateFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaqWithOptions(request, runtime);
    }

    /**
     * @summary 机器人-修改
     *
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.introduction)) {
            query.put("Introduction", request.introduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * @summary 机器人-修改
     *
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 意图-更新
     *
     * @param tmpReq UpdateIntentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIntentResponse
     */
    public UpdateIntentResponse updateIntentWithOptions(UpdateIntentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIntentShrinkRequest request = new UpdateIntentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.intentDefinition)) {
            request.intentDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.intentDefinition, "IntentDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentDefinitionShrink)) {
            query.put("IntentDefinition", request.intentDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentId)) {
            query.put("IntentId", request.intentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIntent"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIntentResponse());
    }

    /**
     * @summary 意图-更新
     *
     * @param request UpdateIntentRequest
     * @return UpdateIntentResponse
     */
    public UpdateIntentResponse updateIntent(UpdateIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIntentWithOptions(request, runtime);
    }

    /**
     * @summary 意图-LGF-更新
     *
     * @param tmpReq UpdateLgfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLgfResponse
     */
    public UpdateLgfResponse updateLgfWithOptions(UpdateLgfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLgfShrinkRequest request = new UpdateLgfShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lgfDefinition)) {
            request.lgfDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lgfDefinition, "LgfDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfDefinitionShrink)) {
            query.put("LgfDefinition", request.lgfDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lgfId)) {
            query.put("LgfId", request.lgfId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLgf"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLgfResponse());
    }

    /**
     * @summary 意图-LGF-更新
     *
     * @param request UpdateLgfRequest
     * @return UpdateLgfResponse
     */
    public UpdateLgfResponse updateLgf(UpdateLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLgfWithOptions(request, runtime);
    }

    /**
     * @summary 视角-修改
     *
     * @param request UpdatePerspectiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePerspectiveResponse
     */
    public UpdatePerspectiveResponse updatePerspectiveWithOptions(UpdatePerspectiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveId)) {
            query.put("PerspectiveId", request.perspectiveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePerspective"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePerspectiveResponse());
    }

    /**
     * @summary 视角-修改
     *
     * @param request UpdatePerspectiveRequest
     * @return UpdatePerspectiveResponse
     */
    public UpdatePerspectiveResponse updatePerspective(UpdatePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePerspectiveWithOptions(request, runtime);
    }

    /**
     * @summary 更新FAQ相似问
     *
     * @param request UpdateSimQuestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSimQuestionResponse
     */
    public UpdateSimQuestionResponse updateSimQuestionWithOptions(UpdateSimQuestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.simQuestionId)) {
            body.put("SimQuestionId", request.simQuestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSimQuestion"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSimQuestionResponse());
    }

    /**
     * @summary 更新FAQ相似问
     *
     * @param request UpdateSimQuestionRequest
     * @return UpdateSimQuestionResponse
     */
    public UpdateSimQuestionResponse updateSimQuestion(UpdateSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSimQuestionWithOptions(request, runtime);
    }

    /**
     * @summary 更新FAQ答案
     *
     * @param request UpdateSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSolutionResponse
     */
    public UpdateSolutionResponse updateSolutionWithOptions(UpdateSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perspectiveCodes)) {
            body.put("PerspectiveCodes", request.perspectiveCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSolution"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSolutionResponse());
    }

    /**
     * @summary 更新FAQ答案
     *
     * @param request UpdateSolutionRequest
     * @return UpdateSolutionResponse
     */
    public UpdateSolutionResponse updateSolution(UpdateSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSolutionWithOptions(request, runtime);
    }

    /**
     * @summary 意图-话术-更新
     *
     * @param tmpReq UpdateUserSayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserSayResponse
     */
    public UpdateUserSayResponse updateUserSayWithOptions(UpdateUserSayRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserSayShrinkRequest request = new UpdateUserSayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userSayDefinition)) {
            request.userSayDefinitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userSayDefinition, "UserSayDefinition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayDefinitionShrink)) {
            query.put("UserSayDefinition", request.userSayDefinitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSayId)) {
            query.put("UserSayId", request.userSayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserSay"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserSayResponse());
    }

    /**
     * @summary 意图-话术-更新
     *
     * @param request UpdateUserSayRequest
     * @return UpdateUserSayResponse
     */
    public UpdateUserSayResponse updateUserSay(UpdateUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserSayWithOptions(request, runtime);
    }
}
