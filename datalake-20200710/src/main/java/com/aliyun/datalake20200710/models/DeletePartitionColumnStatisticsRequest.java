// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionColumnStatisticsRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PartitionNames")
    public java.util.List<String> partitionNames;

    @NameInMap("TableName")
    public String tableName;

    public static DeletePartitionColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionColumnStatisticsRequest self = new DeletePartitionColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePartitionColumnStatisticsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeletePartitionColumnStatisticsRequest setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    public DeletePartitionColumnStatisticsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DeletePartitionColumnStatisticsRequest setPartitionNames(java.util.List<String> partitionNames) {
        this.partitionNames = partitionNames;
        return this;
    }
    public java.util.List<String> getPartitionNames() {
        return this.partitionNames;
    }

    public DeletePartitionColumnStatisticsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
