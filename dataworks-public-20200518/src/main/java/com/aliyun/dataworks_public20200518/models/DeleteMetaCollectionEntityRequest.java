// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionEntityRequest extends TeaModel {
    /**
     * <p>The unique identifier of the collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>album.12345</p>
     */
    @NameInMap("CollectionQualifiedName")
    public String collectionQualifiedName;

    /**
     * <p>The unique identifier of the entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute.projectA.tableB</p>
     */
    @NameInMap("EntityQualifiedName")
    public String entityQualifiedName;

    public static DeleteMetaCollectionEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionEntityRequest self = new DeleteMetaCollectionEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionEntityRequest setCollectionQualifiedName(String collectionQualifiedName) {
        this.collectionQualifiedName = collectionQualifiedName;
        return this;
    }
    public String getCollectionQualifiedName() {
        return this.collectionQualifiedName;
    }

    public DeleteMetaCollectionEntityRequest setEntityQualifiedName(String entityQualifiedName) {
        this.entityQualifiedName = entityQualifiedName;
        return this;
    }
    public String getEntityQualifiedName() {
        return this.entityQualifiedName;
    }

}
