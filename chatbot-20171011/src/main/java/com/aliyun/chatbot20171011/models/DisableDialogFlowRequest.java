// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableDialogFlowRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    public static DisableDialogFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDialogFlowRequest self = new DisableDialogFlowRequest();
        return TeaModel.build(map, self);
    }

    public DisableDialogFlowRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DisableDialogFlowRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
