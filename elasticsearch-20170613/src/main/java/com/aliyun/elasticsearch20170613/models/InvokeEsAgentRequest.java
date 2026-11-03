// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsAgentRequest extends TeaModel {
    /**
     * <p>The request body in JSON-RPC 2.0 format.</p>
     * <p>Unified request parameters (all located at the top level of the request body, not inside params):</p>
     * <ul>
     * <li>jsonrpc: String, required. The JSON-RPC version, fixed to 2.0. Example: 2.0.</li>
     * <li>method: String, required. The method to call. For valid values, see the method list below. Example: session/prompt.</li>
     * <li>id: String, optional. The request ID of the caller, which is passed through in the response. Example: 1774339902987004.</li>
     * <li>params: Object, optional. The parameters corresponding to the method. For examples, see the supplementary instructions.</li>
     * <li>sessionCode: String, optional. The exact query by session ID for session/list. Example: 49b82154-ac20-4f27-a6ec-eb5f4cfc5304.</li>
     * <li>pageNum: Integer, optional. The page number for session/list. The default value is processed by the server. Example: 1.</li>
     * <li>pageSize: Integer, optional. The number of entries per page for session/list. The default value is processed by the server. Example: 10.</li>
     * </ul>
     * <p>Valid values for method:</p>
     * <ul>
     * <li>session/new: Creates a session and returns JSON.</li>
     * <li>session/list: Queries the session list or a specific session and returns JSON.</li>
     * <li>session/prompt: Sends a message and returns SSE.</li>
     * <li>session/load: Resumes a connection from a breakpoint. Used only when _meta.isReload=true. Returns SSE.</li>
     * <li>session/cancel: Cancels a running task under the session and returns JSON.</li>
     * <li>session/delete: Deletes a session and returns JSON.</li>
     * <li>session/hitlRespond: Submits a HITL user response and returns JSON.</li>
     * </ul>
     * <p>Response modes: session/prompt and session/load return an SSE event stream with the Content-Type of text/event-stream. The format of each event is data: {JSON}. Other methods return a standard JSON response with the Content-Type of application/json.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;jsonrpc&quot;: &quot;2.0&quot;,
     *   &quot;id&quot;: 5,
     *   &quot;method&quot;: &quot;session/list&quot;,
     *   &quot;params&quot;: {},
     *   &quot;pageNum&quot;: 1,
     *   &quot;pageSize&quot;: 10
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static InvokeEsAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeEsAgentRequest self = new InvokeEsAgentRequest();
        return TeaModel.build(map, self);
    }

    public InvokeEsAgentRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
