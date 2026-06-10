// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class InitIMConnectRequest extends TeaModel {
    /**
     * <p>The key for the business space. Omit this parameter to use the default business space. You can get the key from the business management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The identifier for the connection source. You can obtain this value from the channel console.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The access token for user authentication.</p>
     */
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
