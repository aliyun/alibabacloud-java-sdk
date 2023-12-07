// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ApplyForStreamAccessTokenRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    public static ApplyForStreamAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyForStreamAccessTokenRequest self = new ApplyForStreamAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyForStreamAccessTokenRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
