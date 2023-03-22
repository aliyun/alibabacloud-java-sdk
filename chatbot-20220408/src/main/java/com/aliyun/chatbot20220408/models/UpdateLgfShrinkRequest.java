// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateLgfShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LgfDefinition")
    public String lgfDefinitionShrink;

    /**
     * <p>LGF ID</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    public static UpdateLgfShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLgfShrinkRequest self = new UpdateLgfShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLgfShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateLgfShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLgfShrinkRequest setLgfDefinitionShrink(String lgfDefinitionShrink) {
        this.lgfDefinitionShrink = lgfDefinitionShrink;
        return this;
    }
    public String getLgfDefinitionShrink() {
        return this.lgfDefinitionShrink;
    }

    public UpdateLgfShrinkRequest setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

}
