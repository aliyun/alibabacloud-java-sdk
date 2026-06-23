// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    /**
     * <p>注释。</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>创建时间（毫秒级时间戳）。</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>ID，可参考<a href="https://help.aliyun.com/document_detail/2880092.html">元数据实体相关概念说明</a>。</p>
     * <p>格式为<code>${EntityType}:${实例ID或转义后的URL}:${数据目录名称}:${数据库名称}:${模式名称}</code>，对于不存在的层级置空。</p>
     * <blockquote>
     * <p>对于MaxCompute类型，此处的实例ID即为主账号ID，数据库名称即为MaxCompute项目名称。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-schema:123456XXX::test_project:default
     * holo-schema:h-abc123xxx::test_db:test_schema</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>更新时间（毫秒级时间戳）。</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>名称。</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>父层级元数据实体ID，父层级实体类型取值参考ListCrawlerTypes接口。</p>
     * <p>格式为<code>${EntityType}:${实例ID或转义后的URL}:${数据目录名称}:${数据库名称}</code>，对于不存在的层级置空。</p>
     * <blockquote>
     * <p>对于MaxCompute类型，此处的实例ID即为主账号ID，数据库名称即为MaxCompute项目名称。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-project:123456XXX::test_project
     * holo-database:h-abc123xxx::test_db</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>类型。</p>
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
