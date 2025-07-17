// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MetaCategoryTableEntity extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("DatabaseSearchName")
    public String databaseSearchName;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public Integer instanceId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

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
