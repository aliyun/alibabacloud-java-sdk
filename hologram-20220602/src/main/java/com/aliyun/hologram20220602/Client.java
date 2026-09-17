// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220602;

import com.aliyun.tea.*;
import com.aliyun.hologram20220602.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hologram", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于创建一个新的 Agent 会话。</li>
     * <li>通过 <code>_meta.agent.agentName</code> 指定绑定的 Agent 名称，这是必填项。</li>
     * <li>可以通过 <code>_meta.config.sessionSource</code> 透传会话来源标识，便于后续按来源检索。</li>
     * <li>支持通过 <code>_meta.config.sessionTags[].sessionTagCode</code> 传入会话标签。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于创建一个新的Agent会话并返回会话ID。</p>
     * 
     * @param tmpReq CreateAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentSessionResponse
     */
    public CreateAgentSessionResponse createAgentSessionWithOptions(CreateAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentSessionShrinkRequest request = new CreateAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentSession"),
            new TeaPair("version", "2022-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于创建一个新的 Agent 会话。</li>
     * <li>通过 <code>_meta.agent.agentName</code> 指定绑定的 Agent 名称，这是必填项。</li>
     * <li>可以通过 <code>_meta.config.sessionSource</code> 透传会话来源标识，便于后续按来源检索。</li>
     * <li>支持通过 <code>_meta.config.sessionTags[].sessionTagCode</code> 传入会话标签。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于创建一个新的Agent会话并返回会话ID。</p>
     * 
     * @param request CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     */
    public CreateAgentSessionResponse createAgentSession(CreateAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于向指定的会话 ID 发送用户的 Prompt，并以 SSE（Server-Sent Events）流式方式接收来自 Agent 的响应。</li>
     * <li>响应可能包括消息分片、思考过程、工具调用状态更新等信息。</li>
     * <li>如果指定的会话不存在，将通过 SSE 错误帧返回 400 错误。</li>
     * <li><code>stopReason</code>字段指示了 Agent 停止本轮对话的原因。</li>
     * <li>可选地提供额外元信息<code>Meta</code>来传递更多上下文给服务端。</li>
     * <li>返回的内容符合开源协议 Agent Client Protocol (ACP) 的规范。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>向指定会话发送用户Prompt，并以SSE方式流式接收Agent响应。</p>
     * 
     * @param tmpReq PromptAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PromptAgentSessionResponse
     */
    public PromptAgentSessionResponse promptAgentSessionWithOptions(PromptAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PromptAgentSessionShrinkRequest request = new PromptAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerContext)) {
            body.put("Caller-Context", request.callerContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("Jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PromptAgentSession"),
            new TeaPair("version", "2022-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PromptAgentSessionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于向指定的会话 ID 发送用户的 Prompt，并以 SSE（Server-Sent Events）流式方式接收来自 Agent 的响应。</li>
     * <li>响应可能包括消息分片、思考过程、工具调用状态更新等信息。</li>
     * <li>如果指定的会话不存在，将通过 SSE 错误帧返回 400 错误。</li>
     * <li><code>stopReason</code>字段指示了 Agent 停止本轮对话的原因。</li>
     * <li>可选地提供额外元信息<code>Meta</code>来传递更多上下文给服务端。</li>
     * <li>返回的内容符合开源协议 Agent Client Protocol (ACP) 的规范。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>向指定会话发送用户Prompt，并以SSE方式流式接收Agent响应。</p>
     * 
     * @param request PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    public PromptAgentSessionResponse promptAgentSession(PromptAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.promptAgentSessionWithOptions(request, runtime);
    }
}
