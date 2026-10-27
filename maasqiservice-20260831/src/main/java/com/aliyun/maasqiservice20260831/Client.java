// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831;

import com.aliyun.tea.*;
import com.aliyun.maasqiservice20260831.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Creative Agent service and prepare the published instance ID and the corresponding instance access key.</li>
     * <li>Creative Agent provides Lite and Dedicated editions. The Lite edition generates or edits images based on whether a reference image is provided. The Dedicated edition uses a Planner to plan and execute creative tasks.</li>
     * <li>Complete AccessKey authentication by using the SDK. The instance access key is placed in X-QI-Agent-Api-Key and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>How to call</h3>
     * <ul>
     * <li>Method and path: <code>POST /aigc/v1/chat/completions</code>.</li>
     * <li>Specify the instance by using <code>X-QI-Instance-Id</code>. The request is executed based on the published configuration of the specified instance. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>This operation returns incremental events instead of a complete JSON response. Continue reading until the stream ends and check for in-stream errors.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit <code>X-QI-Session-Id</code> for the first turn. Save the session identifier returned by the server from the <code>qi_session_id</code> field in the SSE body, and pass the same value back in subsequent turns. Do not rely on the gateway to pass through custom response headers. Use different identifiers for different sessions and send requests sequentially within the same session.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls a published Creative Agent with support for Lite and Dedicated editions, and returns execution progress and image artifacts by using Server-Sent Events (SSE). The Lite edition performs text-to-image or image-to-image generation depending on whether a reference image is provided. The Dedicated edition uses a Planner to plan and execute generation and editing tasks with multi-turn conversation support. Pass generation count, dimensions, and other parameters through metadata.parameters. Image URLs are included in the artifacts of the result.</p>
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Creative Agent service and prepare the published instance ID and the corresponding instance access key.</li>
     * <li>Creative Agent provides Lite and Dedicated editions. The Lite edition generates or edits images based on whether a reference image is provided. The Dedicated edition uses a Planner to plan and execute creative tasks.</li>
     * <li>Complete AccessKey authentication by using the SDK. The instance access key is placed in X-QI-Agent-Api-Key and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>How to call</h3>
     * <ul>
     * <li>Method and path: <code>POST /aigc/v1/chat/completions</code>.</li>
     * <li>Specify the instance by using <code>X-QI-Instance-Id</code>. The request is executed based on the published configuration of the specified instance. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>This operation returns incremental events instead of a complete JSON response. Continue reading until the stream ends and check for in-stream errors.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit <code>X-QI-Session-Id</code> for the first turn. Save the session identifier returned by the server from the <code>qi_session_id</code> field in the SSE body, and pass the same value back in subsequent turns. Do not rely on the gateway to pass through custom response headers. Use different identifiers for different sessions and send requests sequentially within the same session.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls a published Creative Agent with support for Lite and Dedicated editions, and returns execution progress and image artifacts by using Server-Sent Events (SSE). The Lite edition performs text-to-image or image-to-image generation depending on whether a reference image is provided. The Dedicated edition uses a Planner to plan and execute generation and editing tasks with multi-turn conversation support. Pass generation count, dimensions, and other parameters through metadata.parameters. Image URLs are included in the artifacts of the result.</p>
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
     * <p>调用已发布 CUAStandard 实例，根据任务和桌面截图生成电脑操作单步决策，以 SSE 返回 computer_use 工具调用</p>
     * 
     * @param request CuaChatCompletionStreamRequest
     * @param headers CuaChatCompletionStreamHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CuaChatCompletionStreamResponse
     */
    public CuaChatCompletionStreamResponse cuaChatCompletionStreamWithOptions(CuaChatCompletionStreamRequest request, CuaChatCompletionStreamHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("tools", request.tools);
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
            new TeaPair("action", "CuaChatCompletionStream"),
            new TeaPair("version", "2026-08-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cua/v1/chat/completions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CuaChatCompletionStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用已发布 CUAStandard 实例，根据任务和桌面截图生成电脑操作单步决策，以 SSE 返回 computer_use 工具调用</p>
     * 
     * @param request CuaChatCompletionStreamRequest
     * @return CuaChatCompletionStreamResponse
     */
    public CuaChatCompletionStreamResponse cuaChatCompletionStream(CuaChatCompletionStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CuaChatCompletionStreamHeaders headers = new CuaChatCompletionStreamHeaders();
        return this.cuaChatCompletionStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Mobile-Use Agent service and prepare the ID and access key of a published Mobile-Use Agent instance.</li>
     * <li>Mobile-Use Agent provides the Standard Edition and Dedicated Edition. Call the API based on the edition of the selected instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: POST /gui/v1/chat/completions.</li>
     * <li>Use X-QI-Instance-Id to specify the instance and execute based on the published configurations. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events rather than a complete JSON object. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first round. Save the qi_session_id from the SSE body and pass it in the request header with the same name for subsequent calls. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls a published Mobile-Use Agent instance, which supports the Standard Edition and Dedicated Edition. Submits the task text and the current screen screenshot, passes the device and application context through metadata, and returns the next mobile UI operation by using Server-Sent Events (SSE). The caller executes the UI operation and then continues to call the API with the session ID and the latest screenshot.</p>
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Mobile-Use Agent service and prepare the ID and access key of a published Mobile-Use Agent instance.</li>
     * <li>Mobile-Use Agent provides the Standard Edition and Dedicated Edition. Call the API based on the edition of the selected instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: POST /gui/v1/chat/completions.</li>
     * <li>Use X-QI-Instance-Id to specify the instance and execute based on the published configurations. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events rather than a complete JSON object. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first round. Save the qi_session_id from the SSE body and pass it in the request header with the same name for subsequent calls. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls a published Mobile-Use Agent instance, which supports the Standard Edition and Dedicated Edition. Submits the task text and the current screen screenshot, passes the device and application context through metadata, and returns the next mobile UI operation by using Server-Sent Events (SSE). The caller executes the UI operation and then continues to call the API with the session ID and the latest screenshot.</p>
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile Planner Agent service and prepare the published Mobile Planner Agent instance ID and its access key.</li>
     * <li>Use the SDK to complete AccessKey authentication. The instance access key is placed in X-QI-Agent-Api-Key and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>How to call</h3>
     * <ul>
     * <li>Method and path: <code>POST /pa/v1/chat/completions</code>.</li>
     * <li>X-QI-Instance-Id specifies the instance and executes based on the published configuration. The model field in the request body is a compatibility placeholder and cannot switch models.</li>
     * <li>The response consists of SSE incremental events, not a single complete JSON object. Continue reading until the stream ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id for the first turn. Save qi_session_id from the SSE body and pass it back through the request header of the same name in subsequent turns. Call sequentially within the same session. Use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is based on the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Mobile Planner Agent using OpenAI-Compatible Chat Completions messages to initiate a conversation or node planning, and returns text, model-provided reasoning content, and structured tool calling via SSE. Supports multi-turn sessions and model-supported image input. Business tools are executed by the caller.</p>
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile Planner Agent service and prepare the published Mobile Planner Agent instance ID and its access key.</li>
     * <li>Use the SDK to complete AccessKey authentication. The instance access key is placed in X-QI-Agent-Api-Key and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>How to call</h3>
     * <ul>
     * <li>Method and path: <code>POST /pa/v1/chat/completions</code>.</li>
     * <li>X-QI-Instance-Id specifies the instance and executes based on the published configuration. The model field in the request body is a compatibility placeholder and cannot switch models.</li>
     * <li>The response consists of SSE incremental events, not a single complete JSON object. Continue reading until the stream ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id for the first turn. Save qi_session_id from the SSE body and pass it back through the request header of the same name in subsequent turns. Call sequentially within the same session. Use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is based on the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Mobile Planner Agent using OpenAI-Compatible Chat Completions messages to initiate a conversation or node planning, and returns text, model-provided reasoning content, and structured tool calling via SSE. Supports multi-turn sessions and model-supported image input. Business tools are executed by the caller.</p>
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
