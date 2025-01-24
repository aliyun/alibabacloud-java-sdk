// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114;

import com.aliyun.tea.*;
import com.aliyun.aimath20241114.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aimath", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>聊天消息API</p>
     * 
     * @param request ChatMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatMessageResponse
     */
    public ChatMessageResponse chatMessageWithOptions(ChatMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatMessage"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ChatMessageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ChatMessageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>聊天消息API</p>
     * 
     * @param request ChatMessageRequest
     * @return ChatMessageResponse
     */
    public ChatMessageResponse chatMessage(ChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建试题相应的对话。</p>
     * 
     * @param request CreateConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConversationResponse
     */
    public CreateConversationResponse createConversationWithOptions(CreateConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exerciseAnalysis)) {
            body.put("ExerciseAnalysis", request.exerciseAnalysis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exerciseAnswer)) {
            body.put("ExerciseAnswer", request.exerciseAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exerciseContent)) {
            body.put("ExerciseContent", request.exerciseContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exerciseType)) {
            body.put("ExerciseType", request.exerciseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerBizId)) {
            body.put("OuterBizId", request.outerBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConversation"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConversationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateConversationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建试题相应的对话。</p>
     * 
     * @param request CreateConversationRequest
     * @return CreateConversationResponse
     */
    public CreateConversationResponse createConversation(CreateConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建关联的对话，输入试题code即可开启对话</p>
     * 
     * @param request CreateRelatedConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRelatedConversationResponse
     */
    public CreateRelatedConversationResponse createRelatedConversationWithOptions(CreateRelatedConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exerciseCode)) {
            body.put("ExerciseCode", request.exerciseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerBizId)) {
            body.put("OuterBizId", request.outerBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRelatedConversation"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRelatedConversationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateRelatedConversationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建关联的对话，输入试题code即可开启对话</p>
     * 
     * @param request CreateRelatedConversationRequest
     * @return CreateRelatedConversationResponse
     */
    public CreateRelatedConversationResponse createRelatedConversation(CreateRelatedConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRelatedConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成解题分析</p>
     * 
     * @param request GenAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenAnalysisResponse
     */
    public GenAnalysisResponse genAnalysisWithOptions(GenAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exerciseContent)) {
            body.put("ExerciseContent", request.exerciseContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenAnalysis"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenAnalysisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenAnalysisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>生成解题分析</p>
     * 
     * @param request GenAnalysisRequest
     * @return GenAnalysisResponse
     */
    public GenAnalysisResponse genAnalysis(GenAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.genAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成数学解题步骤</p>
     * 
     * @param request GenStepRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenStepResponse
     */
    public GenStepResponse genStepWithOptions(GenStepRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exerciseCode)) {
            body.put("ExerciseCode", request.exerciseCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenStep"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenStepResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenStepResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>生成数学解题步骤</p>
     * 
     * @param request GenStepRequest
     * @return GenStepResponse
     */
    public GenStepResponse genStep(GenStepRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.genStepWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>全局确认修订完成</p>
     * 
     * @param request GlobalConfirmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalConfirmResponse
     */
    public GlobalConfirmResponse globalConfirmWithOptions(GlobalConfirmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exerciseCode)) {
            body.put("ExerciseCode", request.exerciseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GlobalConfirm"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalConfirmResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GlobalConfirmResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>全局确认修订完成</p>
     * 
     * @param request GlobalConfirmRequest
     * @return GlobalConfirmResponse
     */
    public GlobalConfirmResponse globalConfirm(GlobalConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.globalConfirmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修订解题分析</p>
     * 
     * @param request UpdateAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAnalysisResponse
     */
    public UpdateAnalysisResponse updateAnalysisWithOptions(UpdateAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentCode)) {
            body.put("ContentCode", request.contentCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exerciseCode)) {
            body.put("ExerciseCode", request.exerciseCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAnalysis"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAnalysisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAnalysisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修订解题分析</p>
     * 
     * @param request UpdateAnalysisRequest
     * @return UpdateAnalysisResponse
     */
    public UpdateAnalysisResponse updateAnalysis(UpdateAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修订解题步骤</p>
     * 
     * @param request UpdateStepRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStepResponse
     */
    public UpdateStepResponse updateStepWithOptions(UpdateStepRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentCode)) {
            body.put("ContentCode", request.contentCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exerciseCode)) {
            body.put("ExerciseCode", request.exerciseCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStep"),
            new TeaPair("version", "2024-11-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStepResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateStepResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修订解题步骤</p>
     * 
     * @param request UpdateStepRequest
     * @return UpdateStepResponse
     */
    public UpdateStepResponse updateStep(UpdateStepRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStepWithOptions(request, runtime);
    }
}
