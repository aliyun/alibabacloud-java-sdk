// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CloseSessionRequest extends TeaModel {
    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>i207023871669364793713</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Session token</p>
     * 
     * <strong>example:</strong>
     * <p>03f53c719015a9ad4f4f55d66cac2dac161b18e8065ca75a3220b89de389c980</p>
     */
    @NameInMap("SessionToken")
    public String sessionToken;

    public static CloseSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseSessionRequest self = new CloseSessionRequest();
        return TeaModel.build(map, self);
    }

    public CloseSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CloseSessionRequest setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }
    public String getSessionToken() {
        return this.sessionToken;
    }

}
