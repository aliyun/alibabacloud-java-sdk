// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1722073854000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The catalog ID. Currently, only the DLF and StarRocks types are supported. For details, see <a href="https://help.aliyun.com/document_detail/2880092.html">description of concepts related to metadata entities.</a></p>
     * <ul>
     * <li>For the DLF type, the format is <code>dlf-catalog::catalog_id</code>.</li>
     * <li>For the starrocks type, the format is <code>starrocks-catalog:(instance_id|encoded_jdbc_url):catalog_name</code>.</li>
     * </ul>
     * <blockquote>
     * <p>\
     * <code>catalog_id</code>: The the DLF catalog ID.\
     * <code>instance_id</code>: The instance ID, required if the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, required if the data source is registered using a connection string.\
     * <code>catalog_name</code>: The StarRocks catalog name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dlf-catalog:123456XXX:test_catalog
     * starrocks-catalog:c-abc123xxx:default_catalog</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The modification time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1722073854000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The catalog name.</p>
     * 
     * <strong>example:</strong>
     * <p>default_catalog</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parent entity ID.</p>
     * <ul>
     * <li>For the DLF type, the format of <code>ParentMetaEntityId</code> is <code>dlf</code>.</li>
     * <li>For the StarRocks type, the format of <code>ParentMetaEntityId</code> is <code>starrocks:(instance_id|encoded_jdbc_url)</code>.</li>
     * </ul>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, required if the data source is registered via a connection string.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dlf
     * starrocks:c-abc123xxx</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The catalog type. The value of this parameter varies based on the type of the metadata crawler.</p>
     * 
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
