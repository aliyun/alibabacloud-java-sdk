// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831;

import com.aliyun.tea.*;
import com.aliyun.maasqiservice20260831.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("maasqiservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>以 SSE 流式调用已发布 AIGC Agent；支持 AIGCLite 文生图/图生图与 AIGCStandard Planner，兼容 OpenAI Chat Completions。</p>
     * 
     * @param request AigcChatCompletionStreamRequest
     * @param headers AigcChatCompletionStreamHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AigcChatCompletionStreamResponse
     */
    public AigcChatCompletionStreamResponse aigcChatCompletionStreamWithOptions(AigcChatCompletionStreamRequest request, AigcChatCompletionStreamHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamOptions)) {
            body.put("streamOptions", request.streamOptions);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIAgentApiKey)) {
            realHeaders.put("X-QI-Agent-Api-Key", com.aliyun.teautil.Common.toJSONString(headers.xQIAgentApiKey));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIInstanceId)) {
            realHeaders.put("X-QI-Instance-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIInstanceId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQISessionId)) {
            realHeaders.put("X-QI-Session-Id", com.aliyun.teautil.Common.toJSONString(headers.xQISessionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AigcChatCompletionStream"),
            new TeaPair("version", "2026-08-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aigc/v1/chat/completions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AigcChatCompletionStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>以 SSE 流式调用已发布 AIGC Agent；支持 AIGCLite 文生图/图生图与 AIGCStandard Planner，兼容 OpenAI Chat Completions。</p>
     * 
     * @param request AigcChatCompletionStreamRequest
     * @return AigcChatCompletionStreamResponse
     */
    public AigcChatCompletionStreamResponse aigcChatCompletionStream(AigcChatCompletionStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AigcChatCompletionStreamHeaders headers = new AigcChatCompletionStreamHeaders();
        return this.aigcChatCompletionStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>以 SSE 流式调用已发布 GUI Agent；兼容 OpenAI Chat Completions，输入屏幕截图与任务文本，返回下一步 GUI 操作。</p>
     * 
     * @param request GuiChatCompletionStreamRequest
     * @param headers GuiChatCompletionStreamHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GuiChatCompletionStreamResponse
     */
    public GuiChatCompletionStreamResponse guiChatCompletionStreamWithOptions(GuiChatCompletionStreamRequest request, GuiChatCompletionStreamHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedTokenIds)) {
            body.put("allowedTokenIds", request.allowedTokenIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.badWords)) {
            body.put("badWords", request.badWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatTemplateKwargs)) {
            body.put("chatTemplateKwargs", request.chatTemplateKwargs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequencyPenalty)) {
            body.put("frequencyPenalty", request.frequencyPenalty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreEos)) {
            body.put("ignoreEos", request.ignoreEos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeReasoning)) {
            body.put("includeReasoning", request.includeReasoning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logprobs)) {
            body.put("logprobs", request.logprobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCompletionTokens)) {
            body.put("maxCompletionTokens", request.maxCompletionTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTokens)) {
            body.put("maxTokens", request.maxTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minP)) {
            body.put("minP", request.minP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTokens)) {
            body.put("minTokens", request.minTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mmProcessorKwargs)) {
            body.put("mmProcessorKwargs", request.mmProcessorKwargs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.n)) {
            body.put("n", request.n);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelToolCalls)) {
            body.put("parallelToolCalls", request.parallelToolCalls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.presencePenalty)) {
            body.put("presencePenalty", request.presencePenalty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptLogprobs)) {
            body.put("promptLogprobs", request.promptLogprobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasoningEffort)) {
            body.put("reasoningEffort", request.reasoningEffort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repetitionPenalty)) {
            body.put("repetitionPenalty", request.repetitionPenalty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseFormat)) {
            body.put("responseFormat", request.responseFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seed)) {
            body.put("seed", request.seed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipSpecialTokens)) {
            body.put("skipSpecialTokens", request.skipSpecialTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            body.put("stop", request.stop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTokenIds)) {
            body.put("stopTokenIds", request.stopTokenIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamOptions)) {
            body.put("streamOptions", request.streamOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structuredOutputs)) {
            body.put("structuredOutputs", request.structuredOutputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temperature)) {
            body.put("temperature", request.temperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLogprobs)) {
            body.put("topLogprobs", request.topLogprobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topP)) {
            body.put("topP", request.topP);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIAgentApiKey)) {
            realHeaders.put("X-QI-Agent-Api-Key", com.aliyun.teautil.Common.toJSONString(headers.xQIAgentApiKey));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIInstanceId)) {
            realHeaders.put("X-QI-Instance-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIInstanceId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQISessionId)) {
            realHeaders.put("X-QI-Session-Id", com.aliyun.teautil.Common.toJSONString(headers.xQISessionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GuiChatCompletionStream"),
            new TeaPair("version", "2026-08-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gui/v1/chat/completions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GuiChatCompletionStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>以 SSE 流式调用已发布 GUI Agent；兼容 OpenAI Chat Completions，输入屏幕截图与任务文本，返回下一步 GUI 操作。</p>
     * 
     * @param request GuiChatCompletionStreamRequest
     * @return GuiChatCompletionStreamResponse
     */
    public GuiChatCompletionStreamResponse guiChatCompletionStream(GuiChatCompletionStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GuiChatCompletionStreamHeaders headers = new GuiChatCompletionStreamHeaders();
        return this.guiChatCompletionStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>以 SSE 流式调用已发布 PA Agent；兼容 OpenAI Chat Completions，支持多轮消息、工具调用、多模态输入与思考内容。</p>
     * 
     * @param request PaChatCompletionStreamRequest
     * @param headers PaChatCompletionStreamHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PaChatCompletionStreamResponse
     */
    public PaChatCompletionStreamResponse paChatCompletionStreamWithOptions(PaChatCompletionStreamRequest request, PaChatCompletionStreamHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedTokenIds)) {
            body.put("allowedTokenIds", request.allowedTokenIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.badWords)) {
            body.put("badWords", request.badWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatTemplateKwargs)) {
            body.put("chatTemplateKwargs", request.chatTemplateKwargs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequencyPenalty)) {
            body.put("frequencyPenalty", request.frequencyPenalty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreEos)) {
            body.put("ignoreEos", request.ignoreEos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeReasoning)) {
            body.put("includeReasoning", request.includeReasoning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logprobs)) {
            body.put("logprobs", request.logprobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCompletionTokens)) {
            body.put("maxCompletionTokens", request.maxCompletionTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTokens)) {
            body.put("maxTokens", request.maxTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minP)) {
            body.put("minP", request.minP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTokens)) {
            body.put("minTokens", request.minTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mmProcessorKwargs)) {
            body.put("mmProcessorKwargs", request.mmProcessorKwargs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.n)) {
            body.put("n", request.n);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelToolCalls)) {
            body.put("parallelToolCalls", request.parallelToolCalls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.presencePenalty)) {
            body.put("presencePenalty", request.presencePenalty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptLogprobs)) {
            body.put("promptLogprobs", request.promptLogprobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasoningEffort)) {
            body.put("reasoningEffort", request.reasoningEffort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repetitionPenalty)) {
            body.put("repetitionPenalty", request.repetitionPenalty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseFormat)) {
            body.put("responseFormat", request.responseFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seed)) {
            body.put("seed", request.seed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipSpecialTokens)) {
            body.put("skipSpecialTokens", request.skipSpecialTokens);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            body.put("stop", request.stop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTokenIds)) {
            body.put("stopTokenIds", request.stopTokenIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamOptions)) {
            body.put("streamOptions", request.streamOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structuredOutputs)) {
            body.put("structuredOutputs", request.structuredOutputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temperature)) {
            body.put("temperature", request.temperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolChoice)) {
            body.put("toolChoice", request.toolChoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("tools", request.tools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLogprobs)) {
            body.put("topLogprobs", request.topLogprobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topP)) {
            body.put("topP", request.topP);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIAgentApiKey)) {
            realHeaders.put("X-QI-Agent-Api-Key", com.aliyun.teautil.Common.toJSONString(headers.xQIAgentApiKey));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIInstanceId)) {
            realHeaders.put("X-QI-Instance-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIInstanceId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQISessionId)) {
            realHeaders.put("X-QI-Session-Id", com.aliyun.teautil.Common.toJSONString(headers.xQISessionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PaChatCompletionStream"),
            new TeaPair("version", "2026-08-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pa/v1/chat/completions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PaChatCompletionStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>以 SSE 流式调用已发布 PA Agent；兼容 OpenAI Chat Completions，支持多轮消息、工具调用、多模态输入与思考内容。</p>
     * 
     * @param request PaChatCompletionStreamRequest
     * @return PaChatCompletionStreamResponse
     */
    public PaChatCompletionStreamResponse paChatCompletionStream(PaChatCompletionStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PaChatCompletionStreamHeaders headers = new PaChatCompletionStreamHeaders();
        return this.paChatCompletionStreamWithOptions(request, headers, runtime);
    }
}
