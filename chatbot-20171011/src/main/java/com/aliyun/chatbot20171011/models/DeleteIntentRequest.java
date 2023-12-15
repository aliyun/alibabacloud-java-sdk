// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteIntentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("IntentId")
    public Long intentId;

    public static DeleteIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntentRequest self = new DeleteIntentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteIntentRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

}
