// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsAgentRequest extends TeaModel {
    /**
     * <p>The request body in JSON-RPC 2.0 format.</p>
     * <p>Common request parameters (all at the top level of the request body, not inside params):</p>
     * <ul>
     * <li>jsonrpc: String. Required. The JSON-RPC version. Fixed value: 2.0. Example: 2.0.</li>
     * <li>method: String. Required. The method to call. For valid values, see the method list below. Example: session/prompt.</li>
     * <li>id: String. Optional. The request ID specified by the caller. This value is passed through in the response. Example: 1774339902987004.</li>
     * <li>params: Object. Optional. The parameters for the specified method. For examples, refer to the supplementary description.</li>
     * <li>sessionCode: String. Optional. The session ID for exact match queries in session/list. Example: 49b82154-ac20-4f27-a6ec-eb5f4cfc5304.</li>
     * <li>pageNum: Integer. Optional. The page number for session/list. Default value is handled by the server. Example: 1.</li>
     * <li>pageSize: Integer. Optional. The number of entries per page for session/list. Default value is handled by the server. Example: 10.</li>
     * </ul>
     * <p>Valid values of method:</p>
     * <ul>
     * <li>session/new: Creates a session. Returns JSON.</li>
     * <li>session/list: Queries the session list or a specified session. Returns JSON.</li>
     * <li>session/prompt: Sends a message. Returns SSE.</li>
     * <li>session/load: Resumes from a breakpoint. Used only when _meta.isReload=true. Returns SSE.</li>
     * <li>session/cancel: Cancels in-progress tasks in a session. Returns JSON.</li>
     * <li>session/delete: Deletes a session. Returns JSON.</li>
     * <li>session/hitlRespond: Submits a HITL user response. Returns JSON.</li>
     * </ul>
     * <p>Response modes: session/prompt and session/load return an SSE event stream with Content-Type text/event-stream. Each event is in the format data: {JSON}. Other methods return a standard JSON response with Content-Type application/json.</p>
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
