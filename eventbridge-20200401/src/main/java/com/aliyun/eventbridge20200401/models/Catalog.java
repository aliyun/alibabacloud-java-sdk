// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <p>The comment or description of the data catalog</p>
     * 
     * <strong>example:</strong>
     * <p>测试数据目录</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The connection name associated with a mounted-type Catalog. Only has a value when Provider is MySQL/PostgreSQL/Elasticsearch</p>
     * 
     * <strong>example:</strong>
     * <p>my_connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The unique identifier name of the data catalog</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Extended properties (JSON object). The Elasticsearch type contains information such as IndexPattern</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IndexPattern&quot;:&quot;my-index-*&quot;}</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The data source provider. EventHouse is the built-in storage; MySQL/PostgreSQL/Elasticsearch are externally mounted</p>
     * 
     * <strong>example:</strong>
     * <p>EventHouse</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The type of the data catalog, such as RELATIONAL</p>
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
