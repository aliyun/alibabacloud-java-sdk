// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateUserSayShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserSayDefinition")
    public String userSayDefinitionShrink;

    public static CreateUserSayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSayShrinkRequest self = new CreateUserSayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserSayShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateUserSayShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserSayShrinkRequest setUserSayDefinitionShrink(String userSayDefinitionShrink) {
        this.userSayDefinitionShrink = userSayDefinitionShrink;
        return this;
    }
    public String getUserSayDefinitionShrink() {
        return this.userSayDefinitionShrink;
    }

}
