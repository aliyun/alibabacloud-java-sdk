// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartTerminalSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SessionId")
    public String sessionId;

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
