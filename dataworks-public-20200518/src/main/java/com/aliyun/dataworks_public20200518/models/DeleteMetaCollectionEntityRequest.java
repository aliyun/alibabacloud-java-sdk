// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionEntityRequest extends TeaModel {
    @NameInMap("CollectionQualifiedName")
    public String collectionQualifiedName;

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
