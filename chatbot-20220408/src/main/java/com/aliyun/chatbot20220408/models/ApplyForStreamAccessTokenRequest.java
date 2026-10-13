// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ApplyForStreamAccessTokenRequest extends TeaModel {
    /**
     * <p>The key of the business space. If this parameter is not set, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
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
