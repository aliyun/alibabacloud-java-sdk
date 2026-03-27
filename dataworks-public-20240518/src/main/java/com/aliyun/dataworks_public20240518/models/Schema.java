// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The schema ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities.</a>.</p>
     * <p>The format is <code>${EntityType}:${Instance ID or escaped URL}:${Catalog name}:${Database name}</code>. Use empty strings as placeholders for levels that do not exist.</p>
     * <blockquote>
     * <p> For the MaxCompute type, the instance ID level is represented by an empty string. The database name is the name of the MaxCompute project, which has enabled the schema feature.</p>
     * </blockquote>
     * <p>Examples of common ID formats</p>
     * <p><code>maxcompute-project:::project_name</code> (For MaxCompute projects schema enabled)</p>
     * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The Hologres instance ID\
     * . <code>database_name</code>: The database name\
     * . <code>project_name</code>: The MaxCompute project name\
     * . <code>schema_name</code>: The schema name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-schema:123456XXX::test_project:default
     * holo-schema:h-abc123xxx::test_db:test_schema</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The modification time. The value is a UNIX timestamp. Unit: milliseconds.</p>
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
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The format: <code>${EntityType}:${Instance ID or escaped URL}:${Catalog name}:${Database name}</code>. Use empty strings as placeholders for levels that do not exist.</p>
     * <blockquote>
     * <p> For the MaxCompute type, the instance ID level is represented by an empty string. The database name is the name of the MaxCompute project with schema enabled.</p>
     * </blockquote>
     * <p>Examples of common ParentMetaEntityId formats</p>
     * <p><code>maxcompute-project:::project_name</code> (For MaxCompute projects with schema enabled)</p>
     * <p><code>holo-database:instance_id::database_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The Hologres instance ID\
     * . <code>database_name</code>: The database name\
     * . <code>project_name</code>: The MaxCompute project name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-project:123456XXX::test_project
     * holo-database:h-abc123xxx::test_db</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("Type")
    public String type;

    public static Schema build(java.util.Map<String, ?> map) throws Exception {
        Schema self = new Schema();
        return TeaModel.build(map, self);
    }

    public Schema setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Schema setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Schema setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Schema setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Schema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Schema setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public Schema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
