// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Database extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time (millisecond-level timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>ID</p>
     * 
     * <strong>example:</strong>
     * <p>holo-database:h-xxxx::test_db</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The storage location URI.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test_db</p>
     */
    @NameInMap("LocationUri")
    public String locationUri;

    /**
     * <p>The update time (millisecond-level timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parent metadata entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>holo:h-xxxx</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    public static Database build(java.util.Map<String, ?> map) throws Exception {
        Database self = new Database();
        return TeaModel.build(map, self);
    }

    public Database setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Database setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Database setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Database setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public Database setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Database setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Database setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

}
