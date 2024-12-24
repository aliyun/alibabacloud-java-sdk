// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdatePartitionsRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The name of a database.</p>
     * 
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The list of partition input information.</p>
     */
    @NameInMap("PartitionInputs")
    public java.util.List<PartitionInput> partitionInputs;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static BatchUpdatePartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdatePartitionsRequest self = new BatchUpdatePartitionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdatePartitionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchUpdatePartitionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchUpdatePartitionsRequest setPartitionInputs(java.util.List<PartitionInput> partitionInputs) {
        this.partitionInputs = partitionInputs;
        return this;
    }
    public java.util.List<PartitionInput> getPartitionInputs() {
        return this.partitionInputs;
    }

    public BatchUpdatePartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
