// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831;

import com.aliyun.tea.*;
import com.aliyun.maasqiservice20260831.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "MaasQIService";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Creative Agent service and prepare the published instance ID and the corresponding instance access key.</li>
     * <li>Creative Agent provides the lite and dedicated editions. The lite edition performs generation or editing based on whether a reference image is provided. The dedicated edition uses a Planner to schedule and execute creative tasks.</li>
     * <li>Use the SDK to complete AccessKey authentication. The instance access key must be placed in the X-QI-Agent-Api-Key header and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: POST /aigc/v1/chat/completions.</li>
     * <li>Specify the instance through X-QI-Instance-Id and execute according to the published configuration of the instance. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>This operation returns incremental events rather than a complete JSON response. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first turn. Save the session ID returned by the server from the qi_session_id field in the SSE body and pass the same value back in subsequent turns. Do not rely on the gateway to pass through custom response headers. Use different IDs for different sessions and send requests in sequence for the same session.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Creative Agent, supporting both the lite and dedicated editions, and returns execution progress and image artifacts via Server-Sent Events (SSE). The lite edition performs text-to-image or image-to-image generation based on whether a reference image is provided. The dedicated edition uses a Planner to schedule and execute generation and editing tasks, supporting multi-turn conversations. Parameters such as the generation count and size are passed through metadata.parameters. For image URLs in the results, refer to artifacts.</p>
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
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Creative Agent service and prepare the published instance ID and the corresponding instance access key.</li>
     * <li>Creative Agent provides the lite and dedicated editions. The lite edition performs generation or editing based on whether a reference image is provided. The dedicated edition uses a Planner to schedule and execute creative tasks.</li>
     * <li>Use the SDK to complete AccessKey authentication. The instance access key must be placed in the X-QI-Agent-Api-Key header and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: POST /aigc/v1/chat/completions.</li>
     * <li>Specify the instance through X-QI-Instance-Id and execute according to the published configuration of the instance. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>This operation returns incremental events rather than a complete JSON response. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first turn. Save the session ID returned by the server from the qi_session_id field in the SSE body and pass the same value back in subsequent turns. Do not rely on the gateway to pass through custom response headers. Use different IDs for different sessions and send requests in sequence for the same session.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Creative Agent, supporting both the lite and dedicated editions, and returns execution progress and image artifacts via Server-Sent Events (SSE). The lite edition performs text-to-image or image-to-image generation based on whether a reference image is provided. The dedicated edition uses a Planner to schedule and execute generation and editing tasks, supporting multi-turn conversations. Parameters such as the generation count and size are passed through metadata.parameters. For image URLs in the results, refer to artifacts.</p>
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The Camera Agent service is activated. The ID of a published CameraStandard instance and the corresponding instance access key are prepared.</li>
     * <li>AccessKey authentication is completed by using SDK or OpenAPI signatures. The instance key is provided in the <code>X-QI-Agent-Api-Key</code> header and cannot replace the AccessKey signature.</li>
     * <li>The <code>Content-Type</code> header is set to <code>application/json</code>. If <code>stream</code> is set to <code>true</code>, SSE is used and the <code>Accept</code> header is set to <code>text/event-stream</code>. Otherwise, a JSON response is returned.</li>
     * </ul>
     * <h3>Call method</h3>
     * <p>Send a <code>POST /camera/v1/chat/completions</code> request. Specify the instance by using the <code>X-QI-Instance-Id</code> header and provide the raw value of the key. Submit one <code>role=user</code> message and one image per request. The recognition scene, model, and thresholds use the published configuration of the instance.</p>
     * <h3>Session management</h3>
     * <p>You can omit the <code>X-QI-Session-Id</code> header in the first request and make sequential calls within the same session. The <code>scene_id</code> parameter is required for person recognition but must be omitted for food recognition. Session management handles execution and idempotency, while the scene ID manages person deduplication. The same scene can be reused across sessions, but calls must be sequential. Create a new session when you switch the published version or recognition scene. For person recognition, create a new scene at the same time.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Camera Agent to recognize food and beverages and detect new persons in scenes. Food recognition returns the locations and counts of targets. Person detection deduplicates against recorded portraits in the scene and returns at most one new person per request. The recognition capabilities are determined by the published configuration of the instance. Both JSON and Server-Sent Events (SSE) responses are supported. All bounding boxes use the pixel coordinates of the original image.</p>
     * 
     * @param request CameraChatCompletionStreamRequest
     * @param headers CameraChatCompletionStreamHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CameraChatCompletionStreamResponse
     */
    public CameraChatCompletionStreamResponse cameraChatCompletionStreamWithOptions(CameraChatCompletionStreamRequest request, CameraChatCompletionStreamHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIAgentApiKey)) {
            realHeaders.put("X-QI-Agent-Api-Key", com.aliyun.teautil.Common.toJSONString(headers.xQIAgentApiKey));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIRequestId)) {
            realHeaders.put("X-QI-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIRequestId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQISessionId)) {
            realHeaders.put("X-QI-Session-Id", com.aliyun.teautil.Common.toJSONString(headers.xQISessionId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIInstanceId)) {
            realHeaders.put("x-QI-Instance-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIInstanceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CameraChatCompletionStream"),
            new TeaPair("version", "2026-08-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/camera/v1/chat/completions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CameraChatCompletionStreamResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The Camera Agent service is activated. The ID of a published CameraStandard instance and the corresponding instance access key are prepared.</li>
     * <li>AccessKey authentication is completed by using SDK or OpenAPI signatures. The instance key is provided in the <code>X-QI-Agent-Api-Key</code> header and cannot replace the AccessKey signature.</li>
     * <li>The <code>Content-Type</code> header is set to <code>application/json</code>. If <code>stream</code> is set to <code>true</code>, SSE is used and the <code>Accept</code> header is set to <code>text/event-stream</code>. Otherwise, a JSON response is returned.</li>
     * </ul>
     * <h3>Call method</h3>
     * <p>Send a <code>POST /camera/v1/chat/completions</code> request. Specify the instance by using the <code>X-QI-Instance-Id</code> header and provide the raw value of the key. Submit one <code>role=user</code> message and one image per request. The recognition scene, model, and thresholds use the published configuration of the instance.</p>
     * <h3>Session management</h3>
     * <p>You can omit the <code>X-QI-Session-Id</code> header in the first request and make sequential calls within the same session. The <code>scene_id</code> parameter is required for person recognition but must be omitted for food recognition. Session management handles execution and idempotency, while the scene ID manages person deduplication. The same scene can be reused across sessions, but calls must be sequential. Create a new session when you switch the published version or recognition scene. For person recognition, create a new scene at the same time.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Camera Agent to recognize food and beverages and detect new persons in scenes. Food recognition returns the locations and counts of targets. Person detection deduplicates against recorded portraits in the scene and returns at most one new person per request. The recognition capabilities are determined by the published configuration of the instance. Both JSON and Server-Sent Events (SSE) responses are supported. All bounding boxes use the pixel coordinates of the original image.</p>
     * 
     * @param request CameraChatCompletionStreamRequest
     * @return CameraChatCompletionStreamResponse
     */
    public CameraChatCompletionStreamResponse cameraChatCompletionStream(CameraChatCompletionStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CameraChatCompletionStreamHeaders headers = new CameraChatCompletionStreamHeaders();
        return this.cameraChatCompletionStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>调试当前租户的 Camera Agent，支持美食或人物识别。省略 config 使用实例草稿，临时配置仅用于本次调用。通过 POP 鉴权，无需 Agent Key。</p>
     * 
     * <b>summary</b> : 
     * <p>调试 Camera Agent</p>
     * 
     * @param request CameraConsoleDebugStreamRequest
     * @param headers CameraConsoleDebugStreamHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CameraConsoleDebugStreamResponse
     */
    public CameraConsoleDebugStreamResponse cameraConsoleDebugStreamWithOptions(CameraConsoleDebugStreamRequest request, CameraConsoleDebugStreamHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIInstanceId)) {
            realHeaders.put("X-QI-Instance-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIInstanceId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIRequestId)) {
            realHeaders.put("X-QI-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIRequestId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xQISessionId)) {
            realHeaders.put("X-QI-Session-Id", com.aliyun.teautil.Common.toJSONString(headers.xQISessionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CameraConsoleDebugStream"),
            new TeaPair("version", "2026-08-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/console/camera/agents/debug"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CameraConsoleDebugStreamResponse());
    }

    /**
     * <b>description</b> :
     * <p>调试当前租户的 Camera Agent，支持美食或人物识别。省略 config 使用实例草稿，临时配置仅用于本次调用。通过 POP 鉴权，无需 Agent Key。</p>
     * 
     * <b>summary</b> : 
     * <p>调试 Camera Agent</p>
     * 
     * @param request CameraConsoleDebugStreamRequest
     * @return CameraConsoleDebugStreamResponse
     */
    public CameraConsoleDebugStreamResponse cameraConsoleDebugStream(CameraConsoleDebugStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CameraConsoleDebugStreamHeaders headers = new CameraConsoleDebugStreamHeaders();
        return this.cameraConsoleDebugStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic retains the section names and order of the previous version. For version differences, see Release notes. This topic is compiled based on the official API reference of the previous version, subsequent call instructions from the service provider, and pre-release call observations. It does not indicate that a full audit of the new version of the service source code or the official gateway has been completed. No new API version number is provided.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Install the official SDK applicable to the target endpoint from the SDK center.</li>
     * <li>Activate the CUA Agent service and prepare the published CUA instance ID and its access key.</li>
     * <li>CUA is only available in Standard Edition.</li>
     * <li>The official POP/OpenAPI endpoint uses the Alibaba Cloud SDK or OpenAPI signature to complete AccessKey authentication. The instance access key is separately placed in <code>X-QI-Agent-Api-Key</code> and cannot replace the AccessKey signature.</li>
     * <li>Set <code>Content-Type: application/json</code> and <code>Accept: text/event-stream</code>. The <code>stream</code> parameter must be set to <code>true</code>.</li>
     * <li>Use the target endpoint confirmed by the service provider. The authentication behavior of the pre-release direct business endpoint cannot be extrapolated to mean that the official endpoint does not require an AK signature.</li>
     * <li>The client must have the capabilities of taking screenshots, fully parsing SSE, executing actions, and returning actual results. Code and commands must be executed in a controlled and authorized environment. Manual confirmation should be added for sensitive operations.</li>
     * </ul>
     * <h2>Call methods</h2>
     * <ul>
     * <li>Method and path: <code>POST /cua/v1/chat/completions</code>.</li>
     * <li><code>X-QI-Instance-Id</code> specifies the instance and is executed according to the published CUA Standard Edition configuration. The <code>model</code> parameter in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE events, not a complete JSON object. Continue reading until the end and check for errors within the stream.</li>
     * <li>CUA returns the complete action after the single-step model decision is completed, rather than outputting token by token. Heartbeats are used to maintain the connection during the waiting phase.</li>
     * <li>The mode is selected through <code>metadata.actionMode</code> in the request body: <code>gui-only</code> or <code>gui+cli</code>. This is a field supplemented by subsequent service instructions, not a model name or request header.</li>
     * <li>Do not use <code>stream:false</code> to replace this API operation. Non-streaming mode may result in no response bytes for a long time before the model finishes, which increases the risk of intermediate link timeouts.</li>
     * </ul>
     * <h2>Session management</h2>
     * <p>In the first round, you can omit or leave <code>X-QI-Session-Id</code> empty, save <code>qi_session_id</code> from the SSE body, and reuse it through the request header with the same name in subsequent rounds. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.
     * <code>X-QI-Request-Id</code> can be generated by the server. We recommend that the client explicitly generate it to facilitate recovery and troubleshooting:</p>
     * <ul>
     * <li>New step: new request ID.</li>
     * <li>Retry the same step: same session, same request ID, and same request body.</li>
     * <li>Calls within the same session must be strictly sequential. Do not send different steps in parallel. Use different sessions for different tasks.</li>
     * <li>Explicitly select <code>actionMode</code> in the first round and keep it consistent in subsequent rounds. If you need to change the mode, create a new session. You cannot switch modes within the same session.</li>
     * <li>If the stream is disconnected before <code>qi_session_id</code> is obtained in the first round, the recovery method must be handled according to the rules confirmed by the service provider. You cannot assume that the request ID can be deduplicated across unknown sessions.</li>
     * <li>Save the session/request ID immediately when the identity event is obtained, but do not treat the identity event as a complete return of the action.</li>
     * <li>Stop continuing after receiving <code>finished</code>. The current documentation does not provide an independent session release API operation. Do not construct additional release requests on your own.</li>
     * </ul>
     * <h2>Rate limit</h2>
     * <p>The current API request rate for the cloud service is not exposed. Do not treat the client concurrency configuration as the concurrency or QPS commitment allowed by the service. You should confirm the capacity, queuing, and quotas with the service provider.
     * Limits provided in subsequent service instructions:</p>
     * <ul>
     * <li>The current request body limit is <strong>8 MB</strong>, including the fully serialized JSON, not just images.</li>
     * <li>Exactly one current screenshot is required for each step. Do not pass multiple images or screenshot history.</li>
     * <li>A keepalive message is sent approximately every <strong>15 seconds</strong> during the waiting period. This interval is not a response latency SLA, and you cannot rely on heartbeats when an HTTP/SSE response has not been established.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Computer Use Agent (CUA) Standard Edition instance, submits a task and the current desktop screenshot, and returns single-step computer operation decisions through Server-Sent Events (SSE). After the client executes the computer_use action, it returns the actual results and continues the call with the session ID and the latest screenshot.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xQIRequestId)) {
            realHeaders.put("X-QI-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xQIRequestId));
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
     * <b>description</b> :
     * <p>This topic retains the section names and order of the previous version. For version differences, see Release notes. This topic is compiled based on the official API reference of the previous version, subsequent call instructions from the service provider, and pre-release call observations. It does not indicate that a full audit of the new version of the service source code or the official gateway has been completed. No new API version number is provided.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Install the official SDK applicable to the target endpoint from the SDK center.</li>
     * <li>Activate the CUA Agent service and prepare the published CUA instance ID and its access key.</li>
     * <li>CUA is only available in Standard Edition.</li>
     * <li>The official POP/OpenAPI endpoint uses the Alibaba Cloud SDK or OpenAPI signature to complete AccessKey authentication. The instance access key is separately placed in <code>X-QI-Agent-Api-Key</code> and cannot replace the AccessKey signature.</li>
     * <li>Set <code>Content-Type: application/json</code> and <code>Accept: text/event-stream</code>. The <code>stream</code> parameter must be set to <code>true</code>.</li>
     * <li>Use the target endpoint confirmed by the service provider. The authentication behavior of the pre-release direct business endpoint cannot be extrapolated to mean that the official endpoint does not require an AK signature.</li>
     * <li>The client must have the capabilities of taking screenshots, fully parsing SSE, executing actions, and returning actual results. Code and commands must be executed in a controlled and authorized environment. Manual confirmation should be added for sensitive operations.</li>
     * </ul>
     * <h2>Call methods</h2>
     * <ul>
     * <li>Method and path: <code>POST /cua/v1/chat/completions</code>.</li>
     * <li><code>X-QI-Instance-Id</code> specifies the instance and is executed according to the published CUA Standard Edition configuration. The <code>model</code> parameter in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE events, not a complete JSON object. Continue reading until the end and check for errors within the stream.</li>
     * <li>CUA returns the complete action after the single-step model decision is completed, rather than outputting token by token. Heartbeats are used to maintain the connection during the waiting phase.</li>
     * <li>The mode is selected through <code>metadata.actionMode</code> in the request body: <code>gui-only</code> or <code>gui+cli</code>. This is a field supplemented by subsequent service instructions, not a model name or request header.</li>
     * <li>Do not use <code>stream:false</code> to replace this API operation. Non-streaming mode may result in no response bytes for a long time before the model finishes, which increases the risk of intermediate link timeouts.</li>
     * </ul>
     * <h2>Session management</h2>
     * <p>In the first round, you can omit or leave <code>X-QI-Session-Id</code> empty, save <code>qi_session_id</code> from the SSE body, and reuse it through the request header with the same name in subsequent rounds. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.
     * <code>X-QI-Request-Id</code> can be generated by the server. We recommend that the client explicitly generate it to facilitate recovery and troubleshooting:</p>
     * <ul>
     * <li>New step: new request ID.</li>
     * <li>Retry the same step: same session, same request ID, and same request body.</li>
     * <li>Calls within the same session must be strictly sequential. Do not send different steps in parallel. Use different sessions for different tasks.</li>
     * <li>Explicitly select <code>actionMode</code> in the first round and keep it consistent in subsequent rounds. If you need to change the mode, create a new session. You cannot switch modes within the same session.</li>
     * <li>If the stream is disconnected before <code>qi_session_id</code> is obtained in the first round, the recovery method must be handled according to the rules confirmed by the service provider. You cannot assume that the request ID can be deduplicated across unknown sessions.</li>
     * <li>Save the session/request ID immediately when the identity event is obtained, but do not treat the identity event as a complete return of the action.</li>
     * <li>Stop continuing after receiving <code>finished</code>. The current documentation does not provide an independent session release API operation. Do not construct additional release requests on your own.</li>
     * </ul>
     * <h2>Rate limit</h2>
     * <p>The current API request rate for the cloud service is not exposed. Do not treat the client concurrency configuration as the concurrency or QPS commitment allowed by the service. You should confirm the capacity, queuing, and quotas with the service provider.
     * Limits provided in subsequent service instructions:</p>
     * <ul>
     * <li>The current request body limit is <strong>8 MB</strong>, including the fully serialized JSON, not just images.</li>
     * <li>Exactly one current screenshot is required for each step. Do not pass multiple images or screenshot history.</li>
     * <li>A keepalive message is sent approximately every <strong>15 seconds</strong> during the waiting period. This interval is not a response latency SLA, and you cannot rely on heartbeats when an HTTP/SSE response has not been established.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Computer Use Agent (CUA) Standard Edition instance, submits a task and the current desktop screenshot, and returns single-step computer operation decisions through Server-Sent Events (SSE). After the client executes the computer_use action, it returns the actual results and continues the call with the session ID and the latest screenshot.</p>
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
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile-Use Agent service and prepare the published Mobile-Use Agent instance ID and its access key.</li>
     * <li>Mobile-Use Agent provides the standard and exclusive editions. Call the API based on the edition of the selected instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: <code>POST /gui/v1/chat/completions</code>.</li>
     * <li>X-QI-Instance-Id specifies the instance and executes based on the published configuration. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events, not a complete JSON object. Continuously read until the stream ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first round. Save the qi_session_id from the SSE body and pass it in the request header with the same name for subsequent calls. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls a published Mobile-Use Agent, which supports both the standard and exclusive editions. Submits the task text and the current screen screenshot, passes the device and application context through metadata, and returns the next mobile UI operation via Server-Sent Events (SSE). The UI operation is executed by the caller. After execution, subsequent calls are made with the session ID and the latest screenshot.</p>
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
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile-Use Agent service and prepare the published Mobile-Use Agent instance ID and its access key.</li>
     * <li>Mobile-Use Agent provides the standard and exclusive editions. Call the API based on the edition of the selected instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: <code>POST /gui/v1/chat/completions</code>.</li>
     * <li>X-QI-Instance-Id specifies the instance and executes based on the published configuration. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events, not a complete JSON object. Continuously read until the stream ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first round. Save the qi_session_id from the SSE body and pass it in the request header with the same name for subsequent calls. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls a published Mobile-Use Agent, which supports both the standard and exclusive editions. Submits the task text and the current screen screenshot, passes the device and application context through metadata, and returns the next mobile UI operation via Server-Sent Events (SSE). The UI operation is executed by the caller. After execution, subsequent calls are made with the session ID and the latest screenshot.</p>
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
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile Planner Agent service and prepare the ID and access key of a published Mobile Planner Agent instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: <code>POST /pa/v1/chat/completions</code>.</li>
     * <li>Use X-QI-Instance-Id to specify the instance and execute it based on the published configuration. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events rather than a complete JSON object. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first turn and save the qi_session_id from the SSE body. Pass it back in the request header with the same name in subsequent turns to continue the session. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Mobile Planner Agent to initiate a conversation or node planning by using OpenAI-compatible Chat Completions messages, and returns text, model-provided thinking content, and structured tool invocations over Server-Sent Events (SSE). Supports multi-turn sessions and image inputs supported by the model. Business tools are executed by the invoker.</p>
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
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile Planner Agent service and prepare the ID and access key of a published Mobile Planner Agent instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: <code>POST /pa/v1/chat/completions</code>.</li>
     * <li>Use X-QI-Instance-Id to specify the instance and execute it based on the published configuration. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events rather than a complete JSON object. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first turn and save the qi_session_id from the SSE body. Pass it back in the request header with the same name in subsequent turns to continue the session. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
     * <b>summary</b> : 
     * <p>Invokes a published Mobile Planner Agent to initiate a conversation or node planning by using OpenAI-compatible Chat Completions messages, and returns text, model-provided thinking content, and structured tool invocations over Server-Sent Events (SSE). Supports multi-turn sessions and image inputs supported by the model. Business tools are executed by the invoker.</p>
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
