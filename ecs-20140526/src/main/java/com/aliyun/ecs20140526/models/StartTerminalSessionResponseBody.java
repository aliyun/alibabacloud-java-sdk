// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartTerminalSessionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB5173B0-8E80-564E-AAD1-3135412*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>d86c2df2-d19c-4bd8-b817-a19ef123****</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>s-hz023od0x9****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The URL of the WebSocket session that is used to connect to the instance. The URL includes the session ID (<code>SessionId</code>) and the authentication token (<code>SecurityToken</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>wss://cn-hangzhou.axt.aliyuncs.com/session?sessionId=s-hz023od0x9****&amp;token=d86c2df2-d19c-4bd8-b817-a19ef123****</p>
     */
    @NameInMap("WebSocketUrl")
    public String webSocketUrl;

    public static StartTerminalSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTerminalSessionResponseBody self = new StartTerminalSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTerminalSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTerminalSessionResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public StartTerminalSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StartTerminalSessionResponseBody setWebSocketUrl(String webSocketUrl) {
        this.webSocketUrl = webSocketUrl;
        return this;
    }
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

}
