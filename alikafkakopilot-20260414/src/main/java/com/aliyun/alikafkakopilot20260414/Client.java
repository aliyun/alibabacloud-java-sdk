// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414;

import com.aliyun.tea.*;
import com.aliyun.alikafkakopilot20260414.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alikafkakopilot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>智能体 stream chat</p>
     * 
     * @param request KopilotChatStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KopilotChatStreamResponse
     */
    public KopilotChatStreamResponse kopilotChatStreamWithOptions(KopilotChatStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KopilotChatStream"),
            new TeaPair("version", "2026-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KopilotChatStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能体 stream chat</p>
     * 
     * @param request KopilotChatStreamRequest
     * @return KopilotChatStreamResponse
     */
    public KopilotChatStreamResponse kopilotChatStream(KopilotChatStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kopilotChatStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>评价</p>
     * 
     * @param request KopilotFeedbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KopilotFeedbackResponse
     */
    public KopilotFeedbackResponse kopilotFeedbackWithOptions(KopilotFeedbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.turnId)) {
            query.put("TurnId", request.turnId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KopilotFeedback"),
            new TeaPair("version", "2026-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KopilotFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>评价</p>
     * 
     * @param request KopilotFeedbackRequest
     * @return KopilotFeedbackResponse
     */
    public KopilotFeedbackResponse kopilotFeedback(KopilotFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kopilotFeedbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>历史会话</p>
     * 
     * @param request KopilotListConversationChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KopilotListConversationChatMessagesResponse
     */
    public KopilotListConversationChatMessagesResponse kopilotListConversationChatMessagesWithOptions(KopilotListConversationChatMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beforeTurnId)) {
            query.put("BeforeTurnId", request.beforeTurnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KopilotListConversationChatMessages"),
            new TeaPair("version", "2026-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KopilotListConversationChatMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>历史会话</p>
     * 
     * @param request KopilotListConversationChatMessagesRequest
     * @return KopilotListConversationChatMessagesResponse
     */
    public KopilotListConversationChatMessagesResponse kopilotListConversationChatMessages(KopilotListConversationChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kopilotListConversationChatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能体</p>
     * 
     * @param request KopilotListConversationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KopilotListConversationsResponse
     */
    public KopilotListConversationsResponse kopilotListConversationsWithOptions(KopilotListConversationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KopilotListConversations"),
            new TeaPair("version", "2026-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KopilotListConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能体</p>
     * 
     * @param request KopilotListConversationsRequest
     * @return KopilotListConversationsResponse
     */
    public KopilotListConversationsResponse kopilotListConversations(KopilotListConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kopilotListConversationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>状态</p>
     * 
     * @param request KopilotQueryStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KopilotQueryStatusResponse
     */
    public KopilotQueryStatusResponse kopilotQueryStatusWithOptions(KopilotQueryStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KopilotQueryStatus"),
            new TeaPair("version", "2026-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KopilotQueryStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>状态</p>
     * 
     * @param request KopilotQueryStatusRequest
     * @return KopilotQueryStatusResponse
     */
    public KopilotQueryStatusResponse kopilotQueryStatus(KopilotQueryStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kopilotQueryStatusWithOptions(request, runtime);
    }
}
