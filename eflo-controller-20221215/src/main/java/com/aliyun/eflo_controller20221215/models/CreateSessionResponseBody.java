// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateSessionResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>节点  ID。</p>
     * 
     * <strong>example:</strong>
     * <p>2A59143F1</p>
     */
    @NameInMap("ServerSn")
    public String serverSn;

    /**
     * <p>Session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i207023871669364793713</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Session token.</p>
     * 
     * <strong>example:</strong>
     * <p>03f53c719015a9ad4f4f55d66cac2dac161b18e8065ca75a3220b89de389c980</p>
     */
    @NameInMap("SessionToken")
    public String sessionToken;

    /**
     * <p>WebSocket address</p>
     * 
     * <strong>example:</strong>
     * <p>ws://x.x.x.x:xx/calypso_web_console</p>
     */
    @NameInMap("WssEndpoint")
    public String wssEndpoint;

    public static CreateSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionResponseBody self = new CreateSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSessionResponseBody setServerSn(String serverSn) {
        this.serverSn = serverSn;
        return this;
    }
    public String getServerSn() {
        return this.serverSn;
    }

    public CreateSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateSessionResponseBody setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }
    public String getSessionToken() {
        return this.sessionToken;
    }

    public CreateSessionResponseBody setWssEndpoint(String wssEndpoint) {
        this.wssEndpoint = wssEndpoint;
        return this;
    }
    public String getWssEndpoint() {
        return this.wssEndpoint;
    }

}
