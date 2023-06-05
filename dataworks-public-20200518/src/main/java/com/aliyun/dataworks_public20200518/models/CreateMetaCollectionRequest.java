// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CollectionType")
    public String collectionType;

    /**
     * <p>The unique identifier of the parent collection.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The comment of the collection.</p>
     * <br>
     * <p>The comment must be 1 to 64 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the collection.</p>
     */
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
