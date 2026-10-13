// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityValueShrinkRequest extends TeaModel {
    /**
     * <p>The key of the workspace. If this parameter is not specified, the default workspace is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The entity value or regular expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BookType</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The entity ID. This parameter can be left empty when you modify an entity member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

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
     * <p>The synonym list.</p>
     */
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
