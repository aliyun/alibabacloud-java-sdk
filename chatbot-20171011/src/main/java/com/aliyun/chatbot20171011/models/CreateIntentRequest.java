// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("IntentDefinition")
    public IntentCreateDTO intentDefinition;

    public static CreateIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentRequest self = new CreateIntentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateIntentRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public CreateIntentRequest setIntentDefinition(IntentCreateDTO intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public IntentCreateDTO getIntentDefinition() {
        return this.intentDefinition;
    }

}
