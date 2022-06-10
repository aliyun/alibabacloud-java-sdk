// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 实体ID
    @NameInMap("EntityId")
    public Long entityId;

    // 实体名称，仅支持中文、大小写字母、数字、下划线
    @NameInMap("EntityName")
    public String entityName;

    // 实体类型：详见:,EntityTypeEnum[synonyms(同义词),regex(正则)]
    @NameInMap("EntityType")
    public String entityType;

    // 机器人ID
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
