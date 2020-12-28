// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TablePartitionColumnStatisticsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    // DatabaseName of this catalog, required
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PartitionNames")
    public java.util.List<String> partitionNames;

    // TableName of this catalog, required
    @NameInMap("TableName")
    public String tableName;

    public static TablePartitionColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        TablePartitionColumnStatisticsRequest self = new TablePartitionColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public TablePartitionColumnStatisticsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public TablePartitionColumnStatisticsRequest setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    public TablePartitionColumnStatisticsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TablePartitionColumnStatisticsRequest setPartitionNames(java.util.List<String> partitionNames) {
        this.partitionNames = partitionNames;
        return this;
    }
    public java.util.List<String> getPartitionNames() {
        return this.partitionNames;
    }

    public TablePartitionColumnStatisticsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
