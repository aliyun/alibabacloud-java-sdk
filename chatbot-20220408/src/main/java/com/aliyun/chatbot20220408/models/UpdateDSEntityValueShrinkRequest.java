// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityValueShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Content")
    public String content;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("EntityValueId")
    public Long entityValueId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Synonyms")
    public String synonymsShrink;

    public static UpdateDSEntityValueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityValueShrinkRequest self = new UpdateDSEntityValueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityValueShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDSEntityValueShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDSEntityValueShrinkRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public UpdateDSEntityValueShrinkRequest setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public UpdateDSEntityValueShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDSEntityValueShrinkRequest setSynonymsShrink(String synonymsShrink) {
        this.synonymsShrink = synonymsShrink;
        return this;
    }
    public String getSynonymsShrink() {
        return this.synonymsShrink;
    }

}
