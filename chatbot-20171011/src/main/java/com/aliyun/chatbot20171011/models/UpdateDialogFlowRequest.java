// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogFlowRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("ModuleDefinition")
    public UpdateDialogFlowRequestModuleDefinition moduleDefinition;

    public static UpdateDialogFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogFlowRequest self = new UpdateDialogFlowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDialogFlowRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDialogFlowRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public UpdateDialogFlowRequest setModuleDefinition(UpdateDialogFlowRequestModuleDefinition moduleDefinition) {
        this.moduleDefinition = moduleDefinition;
        return this;
    }
    public UpdateDialogFlowRequestModuleDefinition getModuleDefinition() {
        return this.moduleDefinition;
    }

    public static class UpdateDialogFlowRequestModuleDefinition extends TeaModel {
        @NameInMap("GlobalVars")
        public java.util.Map<String, ?> globalVars;

        @NameInMap("ModuleDefinition")
        public PaasProcessData moduleDefinition;

        public static UpdateDialogFlowRequestModuleDefinition build(java.util.Map<String, ?> map) throws Exception {
            UpdateDialogFlowRequestModuleDefinition self = new UpdateDialogFlowRequestModuleDefinition();
            return TeaModel.build(map, self);
        }

        public UpdateDialogFlowRequestModuleDefinition setGlobalVars(java.util.Map<String, ?> globalVars) {
            this.globalVars = globalVars;
            return this;
        }
        public java.util.Map<String, ?> getGlobalVars() {
            return this.globalVars;
        }

        public UpdateDialogFlowRequestModuleDefinition setModuleDefinition(PaasProcessData moduleDefinition) {
            this.moduleDefinition = moduleDefinition;
            return this;
        }
        public PaasProcessData getModuleDefinition() {
            return this.moduleDefinition;
        }

    }

}
