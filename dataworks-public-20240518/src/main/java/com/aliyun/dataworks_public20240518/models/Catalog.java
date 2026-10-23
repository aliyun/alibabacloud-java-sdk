// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>Default catalog</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time. The value is a millisecond-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1725330777000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the data catalog entity. Currently, the DLF and StarRocks types are supported. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts of metadata entities</a>.</p>
     * <ul>
     * <li><p>For the DLF type, the format is <code>dlf-catalog::catalog_id</code>.</p>
     * </li>
     * <li><p>For the StarRocks type, the format is <code>starrocks-catalog:(instance_id|encoded_jdbc_url):catalog_name</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Where:<br><code>catalog_id</code>: The DLF catalog ID.<br><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered by using a connection string.<br><code>catalog_name</code>: the name of the StarRocks catalog.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dlf-catalog::catalog1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The modification time. The value is a millisecond-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1725330777000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>catalog1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the parent entity.</p>
     * <ul>
     * <li><p>For the DLF type, the format of <code>ParentMetaEntityId</code> is <code>dlf</code>.</p>
     * </li>
     * <li><p>For the StarRocks type, the format of <code>ParentMetaEntityId</code> is <code>starrocks:(instance_id|encoded_jdbc_url)</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Where:<br><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered by using a connection string.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dlf</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The catalog type. The valid values depend on the metadata collector type.</p>
     * 
     * <strong>example:</strong>
     * <p>HIVE</p>
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
