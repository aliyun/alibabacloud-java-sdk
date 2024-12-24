// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionColumnStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The list of fields in the data table.</p>
     */
    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    /**
     * <p>The name of a database.</p>
     * 
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The list of partition names of the data table.</p>
     */
    @NameInMap("PartitionNames")
    public java.util.List<String> partitionNames;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static BatchGetPartitionColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionColumnStatisticsRequest self = new BatchGetPartitionColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionColumnStatisticsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchGetPartitionColumnStatisticsRequest setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    public BatchGetPartitionColumnStatisticsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchGetPartitionColumnStatisticsRequest setPartitionNames(java.util.List<String> partitionNames) {
        this.partitionNames = partitionNames;
        return this;
    }
    public java.util.List<String> getPartitionNames() {
        return this.partitionNames;
    }

    public BatchGetPartitionColumnStatisticsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
