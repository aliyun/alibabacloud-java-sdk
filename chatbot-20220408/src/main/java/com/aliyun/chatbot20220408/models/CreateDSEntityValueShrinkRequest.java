// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityValueShrinkRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Content")
    public String content;

    // 实体ID，修改实体成员时可为空
    @NameInMap("EntityId")
    public Long entityId;

    // 机器人ID
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
