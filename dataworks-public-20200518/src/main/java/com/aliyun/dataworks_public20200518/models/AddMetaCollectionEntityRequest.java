// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddMetaCollectionEntityRequest extends TeaModel {
    /**
     * <p>The unique identifier of the collection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CollectionQualifiedName")
    public String collectionQualifiedName;

    /**
     * <p>The unique identifier of the entity.</p>
     * <br>
     * <p>Example: maxcompute-table.projectA.tableA.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityQualifiedName")
    public String entityQualifiedName;

    /**
     * <p>The remarks on the entity. Example: latest product table.</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static AddMetaCollectionEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMetaCollectionEntityRequest self = new AddMetaCollectionEntityRequest();
        return TeaModel.build(map, self);
    }

    public AddMetaCollectionEntityRequest setCollectionQualifiedName(String collectionQualifiedName) {
        this.collectionQualifiedName = collectionQualifiedName;
        return this;
    }
    public String getCollectionQualifiedName() {
        return this.collectionQualifiedName;
    }

    public AddMetaCollectionEntityRequest setEntityQualifiedName(String entityQualifiedName) {
        this.entityQualifiedName = entityQualifiedName;
        return this;
    }
    public String getEntityQualifiedName() {
        return this.entityQualifiedName;
    }

    public AddMetaCollectionEntityRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
