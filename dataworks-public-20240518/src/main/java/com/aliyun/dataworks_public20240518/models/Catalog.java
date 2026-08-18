// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>1722073854000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>dlf-catalog:123456XXX:test_catalog
     * starrocks-catalog:c-abc123xxx:default_catalog</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1722073854000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <strong>example:</strong>
     * <p>default_catalog</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>dlf
     * starrocks:c-abc123xxx</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <strong>example:</strong>
     * <p>Internal</p>
     */
    @NameInMap("Type")
    public String type;

    public static Catalog build(java.util.Map<String, ?> map) throws Exception {
        Catalog self = new Catalog();
        return TeaModel.build(map, self);
    }

    public Catalog setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Catalog setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Catalog setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Catalog setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Catalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Catalog setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public Catalog setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
