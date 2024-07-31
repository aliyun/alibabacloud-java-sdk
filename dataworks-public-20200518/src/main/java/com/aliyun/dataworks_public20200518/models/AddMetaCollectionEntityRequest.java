// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddMetaCollectionEntityRequest extends TeaModel {
    /**
     * <p>The unique identifier of the collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>album.2222</p>
     */
    @NameInMap("CollectionQualifiedName")
    public String collectionQualifiedName;

    /**
     * <p>The unique identifier of the entity. Example: maxcompute-table.projectA.tableA.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.projectA.tableB</p>
     */
    @NameInMap("EntityQualifiedName")
    public String entityQualifiedName;

    /**
     * <p>The remarks of the entity. Example: latest product table.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a remark</p>
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
