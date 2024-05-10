// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class InitIMConnectRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("From")
    public String from;

    @NameInMap("UserAccessToken")
    public String userAccessToken;

    public static InitIMConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIMConnectRequest self = new InitIMConnectRequest();
        return TeaModel.build(map, self);
    }

    public InitIMConnectRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public InitIMConnectRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public InitIMConnectRequest setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken;
        return this;
    }
    public String getUserAccessToken() {
        return this.userAccessToken;
    }

}
