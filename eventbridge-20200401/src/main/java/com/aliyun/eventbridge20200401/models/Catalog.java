// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <p>The comment or description of the data catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>Test data catalog</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The connection name associated with a mounted catalog. This parameter has a value only when Provider is set to MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, or Iceberg.</p>
     * 
     * <strong>example:</strong>
     * <p>my_connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The unique identifier name of the data catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended properties (JSON object). For the Elasticsearch type, this includes information such as IndexPattern.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IndexPattern&quot;:&quot;my-index-*&quot;}</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The data source provider. EventHouse indicates built-in storage. MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, and Iceberg indicate externally mounted sources.</p>
     * 
     * <strong>example:</strong>
     * <p>EventHouse</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The type of the data catalog, such as RELATIONAL.</p>
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
