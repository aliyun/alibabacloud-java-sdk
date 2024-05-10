// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteUserSayRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserSayId")
    public Long userSayId;

    public static DeleteUserSayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserSayRequest self = new DeleteUserSayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserSayRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteUserSayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteUserSayRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DeleteUserSayRequest setUserSayId(Long userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public Long getUserSayId() {
        return this.userSayId;
    }

}
