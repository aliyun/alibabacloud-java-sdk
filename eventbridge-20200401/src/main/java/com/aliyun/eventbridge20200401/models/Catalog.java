// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <p>数据目录的备注描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>测试数据目录</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>挂载类型 Catalog 关联的连接名称。仅 Provider 为 MySQL/PostgreSQL/Elasticsearch 时有值</p>
     * 
     * <strong>example:</strong>
     * <p>my_connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>数据目录的唯一标识名称</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>扩展属性（JSON 对象）。Elasticsearch 类型包含 IndexPattern 等信息</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IndexPattern&quot;:&quot;my-index-*&quot;}</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>数据源提供方。EventHouse 为内置存储，MySQL/PostgreSQL/Elasticsearch 为外部挂载</p>
     * 
     * <strong>example:</strong>
     * <p>EventHouse</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>数据目录类型，如 RELATIONAL</p>
     * 
     * <strong>example:</strong>
     * <p>RELATIONAL</p>
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

    public Catalog setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public Catalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Catalog setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public Catalog setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Catalog setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
