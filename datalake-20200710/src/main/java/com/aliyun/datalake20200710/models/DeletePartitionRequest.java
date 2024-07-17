// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IfExists")
    public Boolean ifExists;

    @NameInMap("PartitionValues")
    public java.util.List<String> partitionValues;

    /**
     * <strong>example:</strong>
     * <p>test_table_20201225</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DeletePartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionRequest self = new DeletePartitionRequest();
        return TeaModel.build(map, self);
    }

    public DeletePartitionRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeletePartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DeletePartitionRequest setIfExists(Boolean ifExists) {
        this.ifExists = ifExists;
        return this;
    }
    public Boolean getIfExists() {
        return this.ifExists;
    }

    public DeletePartitionRequest setPartitionValues(java.util.List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }
    public java.util.List<String> getPartitionValues() {
        return this.partitionValues;
    }

    public DeletePartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
