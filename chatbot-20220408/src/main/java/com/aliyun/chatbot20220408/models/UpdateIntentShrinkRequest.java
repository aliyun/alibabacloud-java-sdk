// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateIntentShrinkRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The chatbot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The intent definition struct.</p>
     */
    @NameInMap("IntentDefinition")
    public String intentDefinitionShrink;

    /**
     * <p>The intent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234234234534</p>
     */
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

    public UpdateIntentShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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
