// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteUserSayRequest extends TeaModel {
    /**
     * <p>The key of the business space. If omitted, the default business space is used. You can obtain the key from the Business Management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The instance ID of the bot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>343df2sdf23</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the intent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5564564546</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>The ID of the user say.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4562121234</p>
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
