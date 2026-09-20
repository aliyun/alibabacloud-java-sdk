// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionRequest extends TeaModel {
    /**
     * <p>The collection type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALBUM</p>
     */
    @NameInMap("CollectionType")
    public String collectionType;

    /**
     * <p>The comment for the collection.</p>
     * <p>Length limit: 1 to 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The collection name.</p>
     * <p>Length limit: 1 to 32 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>collection_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique identifier of the parent collection.</p>
     * 
     * <strong>example:</strong>
     * <p>album.333508</p>
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
