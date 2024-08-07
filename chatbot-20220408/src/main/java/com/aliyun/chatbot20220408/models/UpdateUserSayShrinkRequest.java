// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateUserSayShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserSayDefinition")
    public String userSayDefinitionShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34512323</p>
     */
    @NameInMap("UserSayId")
    public Long userSayId;

    public static UpdateUserSayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSayShrinkRequest self = new UpdateUserSayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserSayShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateUserSayShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateUserSayShrinkRequest setUserSayDefinitionShrink(String userSayDefinitionShrink) {
        this.userSayDefinitionShrink = userSayDefinitionShrink;
        return this;
    }
    public String getUserSayDefinitionShrink() {
        return this.userSayDefinitionShrink;
    }

    public UpdateUserSayShrinkRequest setUserSayId(Long userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public Long getUserSayId() {
        return this.userSayId;
    }

}
