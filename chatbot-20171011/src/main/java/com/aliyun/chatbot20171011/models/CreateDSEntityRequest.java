// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateDSEntityRequest extends TeaModel {
    // 实体名称，仅支持中文、大小写字母、数字、下划线
    @NameInMap("EntityName")
    public String entityName;

    // 实体类型：详见:,EntityTypeEnum[synonyms(同义词),regex(正则)]
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDSEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityRequest self = new CreateDSEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public CreateDSEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateDSEntityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
