// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class Entity extends TeaModel {
    @NameInMap("EntityContent")
    public java.util.Map<String, ?> entityContent;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    @NameInMap("TenantId")
    public Long tenantId;

    public static Entity build(java.util.Map<String, ?> map) throws Exception {
        Entity self = new Entity();
        return TeaModel.build(map, self);
    }

    public Entity setEntityContent(java.util.Map<String, ?> entityContent) {
        this.entityContent = entityContent;
        return this;
    }
    public java.util.Map<String, ?> getEntityContent() {
        return this.entityContent;
    }

    public Entity setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public Entity setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
