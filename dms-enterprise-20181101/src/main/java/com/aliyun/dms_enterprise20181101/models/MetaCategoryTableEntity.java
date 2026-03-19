// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MetaCategoryTableEntity extends TeaModel {
    /**
     * <p>For PostgreSQL-compatible databases, specify the database name.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FC-1D123DF554A45AAB</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The name that is used to search for the database.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@yyy.zzz">xxx@yyy.zzz</a></p>
     */
    @NameInMap("DatabaseSearchName")
    public String databaseSearchName;

    /**
     * <p>The database ID. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the ID of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the ID of a logical database.</p>
     * <blockquote>
     * <p>The value of DatabaseId is that of DbId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>The type of the database. Valid values include but are not limited to:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>DRDS</strong></li>
     * <li><strong>OceanBase</strong></li>
     * <li><strong>Mongo</strong></li>
     * <li><strong>Redis</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>ga_platform_alb</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>174****</p>
     */
    @NameInMap("InstanceId")
    public Integer instanceId;

    /**
     * <p>Database name (for PostgreSQL-compatible databases, specify the schema name). You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to query the name of the database.</p>
     * <blockquote>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the SchemaName of a physical database or call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the SchemaName of a logical database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_schema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The schema name of the table, which is required only for SQL Server instances.</p>
     * 
     * <strong>example:</strong>
     * <p>dbo</p>
     */
    @NameInMap("TableSchemaName")
    public String tableSchemaName;

    public static MetaCategoryTableEntity build(java.util.Map<String, ?> map) throws Exception {
        MetaCategoryTableEntity self = new MetaCategoryTableEntity();
        return TeaModel.build(map, self);
    }

    public MetaCategoryTableEntity setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public MetaCategoryTableEntity setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public MetaCategoryTableEntity setDatabaseSearchName(String databaseSearchName) {
        this.databaseSearchName = databaseSearchName;
        return this;
    }
    public String getDatabaseSearchName() {
        return this.databaseSearchName;
    }

    public MetaCategoryTableEntity setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public MetaCategoryTableEntity setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public MetaCategoryTableEntity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MetaCategoryTableEntity setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Integer getInstanceId() {
        return this.instanceId;
    }

    public MetaCategoryTableEntity setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public MetaCategoryTableEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public MetaCategoryTableEntity setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

}
