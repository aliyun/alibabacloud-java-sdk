// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class Collection extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>album</p>
     */
    @NameInMap("CollectionType")
    public String collectionType;

    /**
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>1668600147617</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Level")
    public Integer level;

    /**
     * <strong>example:</strong>
     * <p>collectionName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1234444</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>owner</p>
     */
    @NameInMap("OwnerName")
    public String ownerName;

    /**
     * <strong>example:</strong>
     * <p>album.12334</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <strong>example:</strong>
     * <p>1668600148617</p>
     */
    @NameInMap("UpdateTime")
    public Long updateTime;

    public static Collection build(java.util.Map<String, ?> map) throws Exception {
        Collection self = new Collection();
        return TeaModel.build(map, self);
    }

    public Collection setCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    public String getCollectionType() {
        return this.collectionType;
    }

    public Collection setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Collection setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Collection setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public Collection setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Collection setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Collection setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public Collection setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public Collection setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
