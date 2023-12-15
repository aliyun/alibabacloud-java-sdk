// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateIntentShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("IntentDefinition")
    public String intentDefinitionShrink;

    @NameInMap("IntentId")
    public Long intentId;

    public static UpdateIntentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntentShrinkRequest self = new UpdateIntentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntentShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateIntentShrinkRequest setIntentDefinitionShrink(String intentDefinitionShrink) {
        this.intentDefinitionShrink = intentDefinitionShrink;
        return this;
    }
    public String getIntentDefinitionShrink() {
        return this.intentDefinitionShrink;
    }

    public UpdateIntentShrinkRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

}
