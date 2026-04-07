// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class Entity extends TeaModel {
    /**
     * <p>The properties of the entity, including:</p>
     * <ul>
     * <li><strong>entityType</strong>: The type of the entity. Examples: maxcompute-table and emr-table.</li>
     * <li><strong>name</strong>: the name of the entity.</li>
     * <li><strong>projectName</strong>: the name of the MaxCompute project.</li>
     * </ul>
     */
    @NameInMap("EntityContent")
    public java.util.Map<String, ?> entityContent;

    /**
     * <p>The unique identifier of the entity. Example: maxcompute-table.projectA.tableB.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute_table.563f0357118d05ef145d6bddf2966cc23e86ca8f2f013f915e565afdf09f7a23</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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
