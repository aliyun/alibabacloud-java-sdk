// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityValueShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Synonyms")
    public String synonymsShrink;

    public static CreateDSEntityValueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityValueShrinkRequest self = new CreateDSEntityValueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityValueShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateDSEntityValueShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDSEntityValueShrinkRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public CreateDSEntityValueShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDSEntityValueShrinkRequest setSynonymsShrink(String synonymsShrink) {
        this.synonymsShrink = synonymsShrink;
        return this;
    }
    public String getSynonymsShrink() {
        return this.synonymsShrink;
    }

}
