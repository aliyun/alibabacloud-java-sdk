// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionColumnStatisticsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The list of field names.</p>
     */
    @NameInMap("ColumnNames")
    public String columnNamesShrink;

    /**
     * <p>The name of a database.</p>
     * 
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The list of partition names.</p>
     */
    @NameInMap("PartitionNames")
    public String partitionNamesShrink;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DeletePartitionColumnStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionColumnStatisticsShrinkRequest self = new DeletePartitionColumnStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePartitionColumnStatisticsShrinkRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setColumnNamesShrink(String columnNamesShrink) {
        this.columnNamesShrink = columnNamesShrink;
        return this;
    }
    public String getColumnNamesShrink() {
        return this.columnNamesShrink;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setPartitionNamesShrink(String partitionNamesShrink) {
        this.partitionNamesShrink = partitionNamesShrink;
        return this;
    }
    public String getPartitionNamesShrink() {
        return this.partitionNamesShrink;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
