// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateKnowledgeShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Knowledge")
    public String knowledgeShrink;

    public static CreateKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeShrinkRequest self = new CreateKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateKnowledgeShrinkRequest setKnowledgeShrink(String knowledgeShrink) {
        this.knowledgeShrink = knowledgeShrink;
        return this;
    }
    public String getKnowledgeShrink() {
        return this.knowledgeShrink;
    }

}
