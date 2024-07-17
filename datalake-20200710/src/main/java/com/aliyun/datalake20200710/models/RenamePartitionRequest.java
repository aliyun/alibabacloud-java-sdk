// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RenamePartitionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PartitionInput")
    public PartitionInput partitionInput;

    @NameInMap("PartitionValues")
    public java.util.List<String> partitionValues;

    /**
     * <strong>example:</strong>
     * <p>test_table_20200715162543389</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static RenamePartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        RenamePartitionRequest self = new RenamePartitionRequest();
        return TeaModel.build(map, self);
    }

    public RenamePartitionRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public RenamePartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public RenamePartitionRequest setPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
        return this;
    }
    public PartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    public RenamePartitionRequest setPartitionValues(java.util.List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }
    public java.util.List<String> getPartitionValues() {
        return this.partitionValues;
    }

    public RenamePartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
