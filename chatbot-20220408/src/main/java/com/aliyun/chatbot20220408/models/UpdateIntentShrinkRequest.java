// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateIntentShrinkRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 意图定义结构体
    @NameInMap("IntentDefinition")
    public String intentDefinitionShrink;

    // 意图ID
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
