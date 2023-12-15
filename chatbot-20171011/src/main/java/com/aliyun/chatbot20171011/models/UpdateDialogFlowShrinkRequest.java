// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogFlowShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("ModuleDefinition")
    public String moduleDefinitionShrink;

    public static UpdateDialogFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogFlowShrinkRequest self = new UpdateDialogFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDialogFlowShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDialogFlowShrinkRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public UpdateDialogFlowShrinkRequest setModuleDefinitionShrink(String moduleDefinitionShrink) {
        this.moduleDefinitionShrink = moduleDefinitionShrink;
        return this;
    }
    public String getModuleDefinitionShrink() {
        return this.moduleDefinitionShrink;
    }

}
