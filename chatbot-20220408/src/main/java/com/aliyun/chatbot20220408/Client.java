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
     * <b>summary</b> : 
     * <p>申请流式网关AccessToken</p>
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
     * <b>summary</b> : 
     * <p>申请流式网关AccessToken</p>
     * 
     * @param request ApplyForStreamAccessTokenRequest
     * @return ApplyForStreamAccessTokenResponse
     */
    public ApplyForStreamAccessTokenResponse applyForStreamAccessToken(ApplyForStreamAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyForStreamAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话-联想API</p>
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
     * <b>summary</b> : 
     * <p>会话-联想API</p>
     * 
     * @param request AssociateRequest
     * @return AssociateResponse
     */
    public AssociateResponse associate(AssociateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取欢迎语</p>
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sandBox)) {
            body.put("SandBox", request.sandBox);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorParam)) {
            body.put("VendorParam", request.vendorParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>summary</b> : 
     * <p>获取欢迎语</p>
     * 
     * @param request BeginSessionRequest
     * @return BeginSessionResponse
     */
    public BeginSessionResponse beginSession(BeginSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beginSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消对应对话</p>
     * 
     * @param request CancelChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelChatResponse
     */
    public CancelChatResponse cancelChatWithOptions(CancelChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            body.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answer)) {
            body.put("Answer", request.answer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelChat"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消对应对话</p>
     * 
     * @param request CancelChatRequest
     * @return CancelChatResponse
     */
    public CancelChatResponse cancelChat(CancelChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消机器人发布</p>
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
     * <b>summary</b> : 
     * <p>取消机器人发布</p>
     * 
     * @param request CancelInstancePublishTaskRequest
     * @return CancelInstancePublishTaskResponse
     */
    public CancelInstancePublishTaskResponse cancelInstancePublishTask(CancelInstancePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelInstancePublishTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消发布任务</p>
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
     * <b>summary</b> : 
     * <p>取消发布任务</p>
     * 
     * @param request CancelPublishTaskRequest
     * @return CancelPublishTaskResponse
     */
    public CancelPublishTaskResponse cancelPublishTask(CancelPublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPublishTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话API</p>
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
     * <b>summary</b> : 
     * <p>会话API</p>
     * 
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>继续机器人发布</p>
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
     * <b>summary</b> : 
     * <p>继续机器人发布</p>
     * 
     * @param request ContinueInstancePublishTaskRequest
     * @return ContinueInstancePublishTaskResponse
     */
    public ContinueInstancePublishTaskResponse continueInstancePublishTask(ContinueInstancePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueInstancePublishTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增类目</p>
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
     * <b>summary</b> : 
     * <p>新增类目</p>
     * 
     * @param request CreateCategoryRequest
     * @return CreateCategoryResponse
     */
    public CreateCategoryResponse createCategory(CreateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建FAQ关联问</p>
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
     * <b>summary</b> : 
     * <p>新建FAQ关联问</p>
     * 
     * @param request CreateConnQuestionRequest
     * @return CreateConnQuestionResponse
     */
    public CreateConnQuestionResponse createConnQuestion(CreateConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体-创建</p>
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
     * <b>summary</b> : 
     * <p>实体-创建</p>
     * 
     * @param request CreateDSEntityRequest
     * @return CreateDSEntityResponse
     */
    public CreateDSEntityResponse createDSEntity(CreateDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDSEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体成员-创建</p>
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
     * <b>summary</b> : 
     * <p>实体成员-创建</p>
     * 
     * @param request CreateDSEntityValueRequest
     * @return CreateDSEntityValueResponse
     */
    public CreateDSEntityValueResponse createDSEntityValue(CreateDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDSEntityValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文档</p>
     * 
     * @param tmpReq CreateDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocResponse
     */
    public CreateDocResponse createDocWithOptions(CreateDocRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDocShrinkRequest request = new CreateDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.docMetadata)) {
            request.docMetadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.docMetadata, "DocMetadata", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.docMetadataShrink)) {
            query.put("DocMetadata", request.docMetadataShrink);
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
     * <b>summary</b> : 
     * <p>创建文档</p>
     * 
     * @param request CreateDocRequest
     * @return CreateDocResponse
     */
    public CreateDocResponse createDoc(CreateDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建FAQ</p>
     * 
     * @param tmpReq CreateFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFaqResponse
     */
    public CreateFaqResponse createFaqWithOptions(CreateFaqRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFaqShrinkRequest request = new CreateFaqShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIdList)) {
            request.tagIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIdList, "TagIdList", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdListShrink)) {
            body.put("TagIdList", request.tagIdListShrink);
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
     * <b>summary</b> : 
     * <p>新建FAQ</p>
     * 
     * @param request CreateFaqRequest
     * @return CreateFaqResponse
     */
    public CreateFaqResponse createFaq(CreateFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFaqWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人-创建</p>
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
     * <b>summary</b> : 
     * <p>机器人-创建</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建机器人发布任务</p>
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
     * <b>summary</b> : 
     * <p>创建机器人发布任务</p>
     * 
     * @param request CreateInstancePublishTaskRequest
     * @return CreateInstancePublishTaskResponse
     */
    public CreateInstancePublishTaskResponse createInstancePublishTask(CreateInstancePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstancePublishTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-创建</p>
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
     * <b>summary</b> : 
     * <p>意图-创建</p>
     * 
     * @param request CreateIntentRequest
     * @return CreateIntentResponse
     */
    public CreateIntentResponse createIntent(CreateIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-LGF-创建</p>
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
     * <b>summary</b> : 
     * <p>意图-LGF-创建</p>
     * 
     * @param request CreateLgfRequest
     * @return CreateLgfResponse
     */
    public CreateLgfResponse createLgf(CreateLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视角-创建</p>
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
     * <b>summary</b> : 
     * <p>视角-创建</p>
     * 
     * @param request CreatePerspectiveRequest
     * @return CreatePerspectiveResponse
     */
    public CreatePerspectiveResponse createPerspective(CreatePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPerspectiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建发布任务</p>
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
     * <b>summary</b> : 
     * <p>创建发布任务</p>
     * 
     * @param request CreatePublishTaskRequest
     * @return CreatePublishTaskResponse
     */
    public CreatePublishTaskResponse createPublishTask(CreatePublishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublishTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建FAQ相似问</p>
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
     * <b>summary</b> : 
     * <p>新建FAQ相似问</p>
     * 
     * @param request CreateSimQuestionRequest
     * @return CreateSimQuestionResponse
     */
    public CreateSimQuestionResponse createSimQuestion(CreateSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建FAQ答案</p>
     * 
     * @param tmpReq CreateSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSolutionResponse
     */
    public CreateSolutionResponse createSolutionWithOptions(CreateSolutionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSolutionShrinkRequest request = new CreateSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIdList)) {
            request.tagIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIdList, "TagIdList", "json");
        }

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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagIdListShrink)) {
            body.put("TagIdList", request.tagIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>summary</b> : 
     * <p>新建FAQ答案</p>
     * 
     * @param request CreateSolutionRequest
     * @return CreateSolutionResponse
     */
    public CreateSolutionResponse createSolution(CreateSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSolutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签创建</p>
     * 
     * @param request CreateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResponse
     */
    public CreateTagResponse createTagWithOptions(CreateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            body.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签创建</p>
     * 
     * @param request CreateTagRequest
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签组创建</p>
     * 
     * @param request CreateTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagGroupResponse
     */
    public CreateTagGroupResponse createTagGroupWithOptions(CreateTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTagGroup"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签组创建</p>
     * 
     * @param request CreateTagGroupRequest
     * @return CreateTagGroupResponse
     */
    public CreateTagGroupResponse createTagGroup(CreateTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-话术-创建</p>
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
     * <b>summary</b> : 
     * <p>意图-话术-创建</p>
     * 
     * @param request CreateUserSayRequest
     * @return CreateUserSayResponse
     */
    public CreateUserSayResponse createUserSay(CreateUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserSayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除类目</p>
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
     * <b>summary</b> : 
     * <p>删除类目</p>
     * 
     * @param request DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除FAQ关联问</p>
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
     * <b>summary</b> : 
     * <p>删除FAQ关联问</p>
     * 
     * @param request DeleteConnQuestionRequest
     * @return DeleteConnQuestionResponse
     */
    public DeleteConnQuestionResponse deleteConnQuestion(DeleteConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体-删除</p>
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
     * <b>summary</b> : 
     * <p>实体-删除</p>
     * 
     * @param request DeleteDSEntityRequest
     * @return DeleteDSEntityResponse
     */
    public DeleteDSEntityResponse deleteDSEntity(DeleteDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDSEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体成员-删除</p>
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
     * <b>summary</b> : 
     * <p>实体成员-删除</p>
     * 
     * @param request DeleteDSEntityValueRequest
     * @return DeleteDSEntityValueResponse
     */
    public DeleteDSEntityValueResponse deleteDSEntityValue(DeleteDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDSEntityValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档删除</p>
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
     * <b>summary</b> : 
     * <p>文档删除</p>
     * 
     * @param request DeleteDocRequest
     * @return DeleteDocResponse
     */
    public DeleteDocResponse deleteDoc(DeleteDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除FAQ，如果是已发布的知识，删除之后，变成已删除未发布，需要发布才能真正删除</p>
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
     * <b>summary</b> : 
     * <p>删除FAQ，如果是已发布的知识，删除之后，变成已删除未发布，需要发布才能真正删除</p>
     * 
     * @param request DeleteFaqRequest
     * @return DeleteFaqResponse
     */
    public DeleteFaqResponse deleteFaq(DeleteFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaqWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人-删除</p>
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
     * <b>summary</b> : 
     * <p>机器人-删除</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-删除</p>
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
     * <b>summary</b> : 
     * <p>意图-删除</p>
     * 
     * @param request DeleteIntentRequest
     * @return DeleteIntentResponse
     */
    public DeleteIntentResponse deleteIntent(DeleteIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-LGF-删除</p>
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
     * <b>summary</b> : 
     * <p>意图-LGF-删除</p>
     * 
     * @param request DeleteLgfRequest
     * @return DeleteLgfResponse
     */
    public DeleteLgfResponse deleteLgf(DeleteLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视角-删除</p>
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
     * <b>summary</b> : 
     * <p>视角-删除</p>
     * 
     * @param request DeletePerspectiveRequest
     * @return DeletePerspectiveResponse
     */
    public DeletePerspectiveResponse deletePerspective(DeletePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePerspectiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除FAQ相似问</p>
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
     * <b>summary</b> : 
     * <p>删除FAQ相似问</p>
     * 
     * @param request DeleteSimQuestionRequest
     * @return DeleteSimQuestionResponse
     */
    public DeleteSimQuestionResponse deleteSimQuestion(DeleteSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSimQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除FAQ答案</p>
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
     * <b>summary</b> : 
     * <p>删除FAQ答案</p>
     * 
     * @param request DeleteSolutionRequest
     * @return DeleteSolutionResponse
     */
    public DeleteSolutionResponse deleteSolution(DeleteSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSolutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签删除</p>
     * 
     * @param request DeleteTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTag"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签删除</p>
     * 
     * @param request DeleteTagRequest
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签组删除</p>
     * 
     * @param request DeleteTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagGroupResponse
     */
    public DeleteTagGroupResponse deleteTagGroupWithOptions(DeleteTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTagGroup"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签组删除</p>
     * 
     * @param request DeleteTagGroupRequest
     * @return DeleteTagGroupResponse
     */
    public DeleteTagGroupResponse deleteTagGroup(DeleteTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-用户话术-删除</p>
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
     * <b>summary</b> : 
     * <p>意图-用户话术-删除</p>
     * 
     * @param request DeleteUserSayRequest
     * @return DeleteUserSayResponse
     */
    public DeleteUserSayResponse deleteUserSay(DeleteUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserSayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看单个类目信息</p>
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
     * <b>summary</b> : 
     * <p>查看单个类目信息</p>
     * 
     * @param request DescribeCategoryRequest
     * @return DescribeCategoryResponse
     */
    public DescribeCategoryResponse describeCategory(DescribeCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体-详情</p>
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
     * <b>summary</b> : 
     * <p>实体-详情</p>
     * 
     * @param request DescribeDSEntityRequest
     * @return DescribeDSEntityResponse
     */
    public DescribeDSEntityResponse describeDSEntity(DescribeDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDSEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档详情</p>
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
     * <b>summary</b> : 
     * <p>文档详情</p>
     * 
     * @param request DescribeDocRequest
     * @return DescribeDocResponse
     */
    public DescribeDocResponse describeDoc(DescribeDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>知识详情</p>
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
     * <b>summary</b> : 
     * <p>知识详情</p>
     * 
     * @param request DescribeFaqRequest
     * @return DescribeFaqResponse
     */
    public DescribeFaqResponse describeFaq(DescribeFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaqWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人-详情</p>
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
     * <b>summary</b> : 
     * <p>机器人-详情</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-详情</p>
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
     * <b>summary</b> : 
     * <p>意图-详情</p>
     * 
     * @param request DescribeIntentRequest
     * @return DescribeIntentResponse
     */
    public DescribeIntentResponse describeIntent(DescribeIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视角-详情</p>
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
     * <b>summary</b> : 
     * <p>视角-详情</p>
     * 
     * @param request DescribePerspectiveRequest
     * @return DescribePerspectiveResponse
     */
    public DescribePerspectiveResponse describePerspective(DescribePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePerspectiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签详情</p>
     * 
     * @param request DescribeTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagResponse
     */
    public DescribeTagResponse describeTagWithOptions(DescribeTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTag"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签详情</p>
     * 
     * @param request DescribeTagRequest
     * @return DescribeTagResponse
     */
    public DescribeTagResponse describeTag(DescribeTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签组详情</p>
     * 
     * @param request DescribeTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagGroupResponse
     */
    public DescribeTagGroupResponse describeTagGroupWithOptions(DescribeTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagGroup"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签组详情</p>
     * 
     * @param request DescribeTagGroupRequest
     * @return DescribeTagGroupResponse
     */
    public DescribeTagGroupResponse describeTagGroup(DescribeTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>问答点赞、点踩API</p>
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
     * <b>summary</b> : 
     * <p>问答点赞、点踩API</p>
     * 
     * @param request FeedbackRequest
     * @return FeedbackResponse
     */
    public FeedbackResponse feedback(FeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.feedbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成用户免登Token</p>
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foreignId)) {
            body.put("ForeignId", request.foreignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nick)) {
            body.put("Nick", request.nick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            body.put("Telephone", request.telephone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>summary</b> : 
     * <p>生成用户免登Token</p>
     * 
     * @param request GenerateUserAccessTokenRequest
     * @return GenerateUserAccessTokenResponse
     */
    public GenerateUserAccessTokenResponse generateUserAccessToken(GenerateUserAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUserAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取业务空间信息</p>
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
     * <b>summary</b> : 
     * <p>获取业务空间信息</p>
     * 
     * @param request GetAgentInfoRequest
     * @return GetAgentInfoResponse
     */
    public GetAgentInfoResponse getAgentInfo(GetAgentInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步函数执行结果接口</p>
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
     * <b>summary</b> : 
     * <p>获取异步函数执行结果接口</p>
     * 
     * @param request GetAsyncResultRequest
     * @return GetAsyncResultResponse
     */
    public GetAsyncResultResponse getAsyncResult(GetAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机器人接待人次和对话轮次</p>
     * 
     * @param request GetBotSessionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBotSessionDataResponse
     */
    public GetBotSessionDataResponse getBotSessionDataWithOptions(GetBotSessionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "GetBotSessionData"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBotSessionDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机器人接待人次和对话轮次</p>
     * 
     * @param request GetBotSessionDataRequest
     * @return GetBotSessionDataResponse
     */
    public GetBotSessionDataResponse getBotSessionData(GetBotSessionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBotSessionDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机器人发布进度</p>
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
     * <b>summary</b> : 
     * <p>查询机器人发布进度</p>
     * 
     * @param request GetInstancePublishTaskStateRequest
     * @return GetInstancePublishTaskStateResponse
     */
    public GetInstancePublishTaskStateResponse getInstancePublishTaskState(GetInstancePublishTaskStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstancePublishTaskStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询发布进度</p>
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
     * <b>summary</b> : 
     * <p>查询发布进度</p>
     * 
     * @param request GetPublishTaskStateRequest
     * @return GetPublishTaskStateResponse
     */
    public GetPublishTaskStateResponse getPublishTaskState(GetPublishTaskStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublishTaskStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>初始化im连接信息</p>
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessToken)) {
            body.put("UserAccessToken", request.userAccessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>summary</b> : 
     * <p>初始化im连接信息</p>
     * 
     * @param request InitIMConnectRequest
     * @return InitIMConnectResponse
     */
    public InitIMConnectResponse initIMConnect(InitIMConnectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initIMConnectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人-绑定类目</p>
     * 
     * @param request LinkInstanceCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LinkInstanceCategoryResponse
     */
    public LinkInstanceCategoryResponse linkInstanceCategoryWithOptions(LinkInstanceCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abilityType)) {
            query.put("AbilityType", request.abilityType);
        }

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
     * <b>summary</b> : 
     * <p>机器人-绑定类目</p>
     * 
     * @param request LinkInstanceCategoryRequest
     * @return LinkInstanceCategoryResponse
     */
    public LinkInstanceCategoryResponse linkInstanceCategory(LinkInstanceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.linkInstanceCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取业务空间列表</p>
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
     * <b>summary</b> : 
     * <p>获取业务空间列表</p>
     * 
     * @param request ListAgentRequest
     * @return ListAgentResponse
     */
    public ListAgentResponse listAgent(ListAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>类目列表</p>
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
     * <b>summary</b> : 
     * <p>类目列表</p>
     * 
     * @param request ListCategoryRequest
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategory(ListCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询FAQ关联问列表</p>
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
     * <b>summary</b> : 
     * <p>查询FAQ关联问列表</p>
     * 
     * @param request ListConnQuestionRequest
     * @return ListConnQuestionResponse
     */
    public ListConnQuestionResponse listConnQuestion(ListConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体-列表</p>
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
     * <b>summary</b> : 
     * <p>实体-列表</p>
     * 
     * @param request ListDSEntityRequest
     * @return ListDSEntityResponse
     */
    public ListDSEntityResponse listDSEntity(ListDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDSEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体成员-列表</p>
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
     * <b>summary</b> : 
     * <p>实体成员-列表</p>
     * 
     * @param request ListDSEntityValueRequest
     * @return ListDSEntityValueResponse
     */
    public ListDSEntityValueResponse listDSEntityValue(ListDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDSEntityValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人-修改</p>
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
     * <b>summary</b> : 
     * <p>机器人-修改</p>
     * 
     * @param request ListInstanceRequest
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-列表</p>
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
     * <b>summary</b> : 
     * <p>意图-列表</p>
     * 
     * @param request ListIntentRequest
     * @return ListIntentResponse
     */
    public ListIntentResponse listIntent(ListIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-LGF-列表</p>
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
     * <b>summary</b> : 
     * <p>意图-LGF-列表</p>
     * 
     * @param request ListLgfRequest
     * @return ListLgfResponse
     */
    public ListLgfResponse listLgf(ListLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取业务空间下可集成的SaaS信息列表</p>
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
     * <b>summary</b> : 
     * <p>获取业务空间下可集成的SaaS信息列表</p>
     * 
     * @param request ListSaasInfoRequest
     * @return ListSaasInfoResponse
     */
    public ListSaasInfoResponse listSaasInfo(ListSaasInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSaasInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取业务空间下可集成的权限组信息</p>
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
     * <b>summary</b> : 
     * <p>获取业务空间下可集成的权限组信息</p>
     * 
     * @param request ListSaasPermissionGroupInfosRequest
     * @return ListSaasPermissionGroupInfosResponse
     */
    public ListSaasPermissionGroupInfosResponse listSaasPermissionGroupInfos(ListSaasPermissionGroupInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSaasPermissionGroupInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>FAQ相似问列表</p>
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
     * <b>summary</b> : 
     * <p>FAQ相似问列表</p>
     * 
     * @param request ListSimQuestionRequest
     * @return ListSimQuestionResponse
     */
    public ListSimQuestionResponse listSimQuestion(ListSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSimQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>FAQ答案列表</p>
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
     * <b>summary</b> : 
     * <p>FAQ答案列表</p>
     * 
     * @param request ListSolutionRequest
     * @return ListSolutionResponse
     */
    public ListSolutionResponse listSolution(ListSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSolutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签查询</p>
     * 
     * @param request ListTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResponse
     */
    public ListTagResponse listTagWithOptions(ListTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            body.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTag"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签查询</p>
     * 
     * @param request ListTagRequest
     * @return ListTagResponse
     */
    public ListTagResponse listTag(ListTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签组查询</p>
     * 
     * @param request ListTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagGroupResponse
     */
    public ListTagGroupResponse listTagGroupWithOptions(ListTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagGroup"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签组查询</p>
     * 
     * @param request ListTagGroupRequest
     * @return ListTagGroupResponse
     */
    public ListTagGroupResponse listTagGroup(ListTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tongyi对话明细查询接口</p>
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
     * <b>summary</b> : 
     * <p>Tongyi对话明细查询接口</p>
     * 
     * @param request ListTongyiChatHistorysRequest
     * @return ListTongyiChatHistorysResponse
     */
    public ListTongyiChatHistorysResponse listTongyiChatHistorys(ListTongyiChatHistorysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTongyiChatHistorysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询通义晓蜜的单个会话对话记录</p>
     * 
     * @param request ListTongyiConversationLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTongyiConversationLogsResponse
     */
    public ListTongyiConversationLogsResponse listTongyiConversationLogsWithOptions(ListTongyiConversationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotInstanceId)) {
            query.put("RobotInstanceId", request.robotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTongyiConversationLogs"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTongyiConversationLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询通义晓蜜的单个会话对话记录</p>
     * 
     * @param request ListTongyiConversationLogsRequest
     * @return ListTongyiConversationLogsResponse
     */
    public ListTongyiConversationLogsResponse listTongyiConversationLogs(ListTongyiConversationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTongyiConversationLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>话术-列表</p>
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
     * <b>summary</b> : 
     * <p>话术-列表</p>
     * 
     * @param request ListUserSayRequest
     * @return ListUserSayResponse
     */
    public ListUserSayResponse listUserSay(ListUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserSayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>统一NLU接口</p>
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
     * <b>summary</b> : 
     * <p>统一NLU接口</p>
     * 
     * @param request NluRequest
     * @return NluResponse
     */
    public NluResponse nlu(NluRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.nluWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视角-列表</p>
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
     * <b>summary</b> : 
     * <p>视角-列表</p>
     * 
     * @param request QueryPerspectivesRequest
     * @return QueryPerspectivesResponse
     */
    public QueryPerspectivesResponse queryPerspectives(QueryPerspectivesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPerspectivesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档重试</p>
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
     * <b>summary</b> : 
     * <p>文档重试</p>
     * 
     * @param request RetryDocRequest
     * @return RetryDocResponse
     */
    public RetryDocResponse retryDoc(RetryDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryDocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档搜索</p>
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
     * <b>summary</b> : 
     * <p>文档搜索</p>
     * 
     * @param request SearchDocRequest
     * @return SearchDocResponse
     */
    public SearchDocResponse searchDoc(SearchDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchDocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>知识搜索</p>
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
     * <b>summary</b> : 
     * <p>知识搜索</p>
     * 
     * @param request SearchFaqRequest
     * @return SearchFaqResponse
     */
    public SearchFaqResponse searchFaq(SearchFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchFaqWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>大模型问答调试信息</p>
     * 
     * @param request TongyiChatDebugInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TongyiChatDebugInfoResponse
     */
    public TongyiChatDebugInfoResponse tongyiChatDebugInfoWithOptions(TongyiChatDebugInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TongyiChatDebugInfo"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TongyiChatDebugInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>大模型问答调试信息</p>
     * 
     * @param request TongyiChatDebugInfoRequest
     * @return TongyiChatDebugInfoResponse
     */
    public TongyiChatDebugInfoResponse tongyiChatDebugInfo(TongyiChatDebugInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tongyiChatDebugInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑类目</p>
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
     * <b>summary</b> : 
     * <p>编辑类目</p>
     * 
     * @param request UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新FAQ关联问</p>
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
     * <b>summary</b> : 
     * <p>更新FAQ关联问</p>
     * 
     * @param request UpdateConnQuestionRequest
     * @return UpdateConnQuestionResponse
     */
    public UpdateConnQuestionResponse updateConnQuestion(UpdateConnQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体-更新</p>
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
     * <b>summary</b> : 
     * <p>实体-更新</p>
     * 
     * @param request UpdateDSEntityRequest
     * @return UpdateDSEntityResponse
     */
    public UpdateDSEntityResponse updateDSEntity(UpdateDSEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDSEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实体成员-更新</p>
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
     * <b>summary</b> : 
     * <p>实体成员-更新</p>
     * 
     * @param request UpdateDSEntityValueRequest
     * @return UpdateDSEntityValueResponse
     */
    public UpdateDSEntityValueResponse updateDSEntityValue(UpdateDSEntityValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDSEntityValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档变更</p>
     * 
     * @param tmpReq UpdateDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDocResponse
     */
    public UpdateDocResponse updateDocWithOptions(UpdateDocRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDocShrinkRequest request = new UpdateDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.docMetadata)) {
            request.docMetadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.docMetadata, "DocMetadata", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.docMetadataShrink)) {
            query.put("DocMetadata", request.docMetadataShrink);
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
     * <b>summary</b> : 
     * <p>文档变更</p>
     * 
     * @param request UpdateDocRequest
     * @return UpdateDocResponse
     */
    public UpdateDocResponse updateDoc(UpdateDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新FAQ</p>
     * 
     * @param tmpReq UpdateFaqRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFaqResponse
     */
    public UpdateFaqResponse updateFaqWithOptions(UpdateFaqRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFaqShrinkRequest request = new UpdateFaqShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIdList)) {
            request.tagIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIdList, "TagIdList", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdListShrink)) {
            body.put("TagIdList", request.tagIdListShrink);
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
     * <b>summary</b> : 
     * <p>更新FAQ</p>
     * 
     * @param request UpdateFaqRequest
     * @return UpdateFaqResponse
     */
    public UpdateFaqResponse updateFaq(UpdateFaqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaqWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人-修改</p>
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
     * <b>summary</b> : 
     * <p>机器人-修改</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-更新</p>
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
     * <b>summary</b> : 
     * <p>意图-更新</p>
     * 
     * @param request UpdateIntentRequest
     * @return UpdateIntentResponse
     */
    public UpdateIntentResponse updateIntent(UpdateIntentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIntentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-LGF-更新</p>
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
     * <b>summary</b> : 
     * <p>意图-LGF-更新</p>
     * 
     * @param request UpdateLgfRequest
     * @return UpdateLgfResponse
     */
    public UpdateLgfResponse updateLgf(UpdateLgfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLgfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视角-修改</p>
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
     * <b>summary</b> : 
     * <p>视角-修改</p>
     * 
     * @param request UpdatePerspectiveRequest
     * @return UpdatePerspectiveResponse
     */
    public UpdatePerspectiveResponse updatePerspective(UpdatePerspectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePerspectiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新FAQ相似问</p>
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
     * <b>summary</b> : 
     * <p>更新FAQ相似问</p>
     * 
     * @param request UpdateSimQuestionRequest
     * @return UpdateSimQuestionResponse
     */
    public UpdateSimQuestionResponse updateSimQuestion(UpdateSimQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSimQuestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新FAQ答案</p>
     * 
     * @param tmpReq UpdateSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSolutionResponse
     */
    public UpdateSolutionResponse updateSolutionWithOptions(UpdateSolutionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSolutionShrinkRequest request = new UpdateSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagIdList)) {
            request.tagIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagIdList, "TagIdList", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdListShrink)) {
            body.put("TagIdList", request.tagIdListShrink);
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
     * <b>summary</b> : 
     * <p>更新FAQ答案</p>
     * 
     * @param request UpdateSolutionRequest
     * @return UpdateSolutionResponse
     */
    public UpdateSolutionResponse updateSolution(UpdateSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSolutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签编辑</p>
     * 
     * @param request UpdateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTagResponse
     */
    public UpdateTagResponse updateTagWithOptions(UpdateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            body.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTag"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签编辑</p>
     * 
     * @param request UpdateTagRequest
     * @return UpdateTagResponse
     */
    public UpdateTagResponse updateTag(UpdateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签组编辑</p>
     * 
     * @param request UpdateTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTagGroupResponse
     */
    public UpdateTagGroupResponse updateTagGroupWithOptions(UpdateTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTagGroup"),
            new TeaPair("version", "2022-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTagGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签组编辑</p>
     * 
     * @param request UpdateTagGroupRequest
     * @return UpdateTagGroupResponse
     */
    public UpdateTagGroupResponse updateTagGroup(UpdateTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图-话术-更新</p>
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
     * <b>summary</b> : 
     * <p>意图-话术-更新</p>
     * 
     * @param request UpdateUserSayRequest
     * @return UpdateUserSayResponse
     */
    public UpdateUserSayResponse updateUserSay(UpdateUserSayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserSayWithOptions(request, runtime);
    }
}
