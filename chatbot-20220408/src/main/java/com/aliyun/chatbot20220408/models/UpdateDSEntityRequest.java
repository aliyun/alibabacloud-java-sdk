// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not set, the default business space is accessed. You can obtain the key value from the business management page of the main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The entity ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The entity name. Only Chinese characters, uppercase and lowercase letters, digits, and underscores are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EntityName</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The entity type. Valid values: synonyms (synonym) and regex (regular expression).</p>
     * 
     * <strong>example:</strong>
     * <p>synonyms</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The chatbot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateDSEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityRequest self = new UpdateDSEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDSEntityRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public UpdateDSEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public UpdateDSEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateDSEntityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
