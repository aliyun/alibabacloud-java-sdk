// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("IntentDefinition")
    public String intentDefinitionShrink;

    public static CreateIntentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentShrinkRequest self = new CreateIntentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateIntentShrinkRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public CreateIntentShrinkRequest setIntentDefinitionShrink(String intentDefinitionShrink) {
        this.intentDefinitionShrink = intentDefinitionShrink;
        return this;
    }
    public String getIntentDefinitionShrink() {
        return this.intentDefinitionShrink;
    }

}
