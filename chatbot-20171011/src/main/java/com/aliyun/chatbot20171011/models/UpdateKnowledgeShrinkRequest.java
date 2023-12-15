// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Knowledge")
    public String knowledgeShrink;

    public static UpdateKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeShrinkRequest self = new UpdateKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateKnowledgeShrinkRequest setKnowledgeShrink(String knowledgeShrink) {
        this.knowledgeShrink = knowledgeShrink;
        return this;
    }
    public String getKnowledgeShrink() {
        return this.knowledgeShrink;
    }

}
