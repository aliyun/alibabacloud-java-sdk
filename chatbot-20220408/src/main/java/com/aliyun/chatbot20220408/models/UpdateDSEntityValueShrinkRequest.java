// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityValueShrinkRequest extends TeaModel {
    /**
     * <p>The key for the business space. If you omit this parameter, the default business space is used. You can find this key on the Business Management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The new content for the entity value. For an entity type of <code>synonyms</code>, this is the normalized value. For an entity type of <code>regex</code>, this is the regular expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>书本类型</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The entity ID. You can leave this parameter empty when modifying an entity value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223423423</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The ID of the entity value to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2342377423</p>
     */
    @NameInMap("EntityValueId")
    public Long entityValueId;

    /**
     * <p>The bot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The synonym list for the normalized value.</p>
     */
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
