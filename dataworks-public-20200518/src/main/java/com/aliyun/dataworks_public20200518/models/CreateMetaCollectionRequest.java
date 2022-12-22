// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionRequest extends TeaModel {
    @NameInMap("CollectionType")
    public String collectionType;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentQualifiedName")
    public String parentQualifiedName;

    public static CreateMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCollectionRequest self = new CreateMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaCollectionRequest setCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    public String getCollectionType() {
        return this.collectionType;
    }

    public CreateMetaCollectionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateMetaCollectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetaCollectionRequest setParentQualifiedName(String parentQualifiedName) {
        this.parentQualifiedName = parentQualifiedName;
        return this;
    }
    public String getParentQualifiedName() {
        return this.parentQualifiedName;
    }

}
