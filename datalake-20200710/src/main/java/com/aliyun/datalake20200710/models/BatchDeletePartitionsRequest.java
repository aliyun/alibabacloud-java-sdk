// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeletePartitionsRequest extends TeaModel {
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

    @NameInMap("PartitionValueList")
    public java.util.List<BatchDeletePartitionsRequestPartitionValueList> partitionValueList;

    /**
     * <strong>example:</strong>
     * <p>test_table_20201225</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static BatchDeletePartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePartitionsRequest self = new BatchDeletePartitionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeletePartitionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchDeletePartitionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchDeletePartitionsRequest setIfExists(Boolean ifExists) {
        this.ifExists = ifExists;
        return this;
    }
    public Boolean getIfExists() {
        return this.ifExists;
    }

    public BatchDeletePartitionsRequest setPartitionValueList(java.util.List<BatchDeletePartitionsRequestPartitionValueList> partitionValueList) {
        this.partitionValueList = partitionValueList;
        return this;
    }
    public java.util.List<BatchDeletePartitionsRequestPartitionValueList> getPartitionValueList() {
        return this.partitionValueList;
    }

    public BatchDeletePartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class BatchDeletePartitionsRequestPartitionValueList extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static BatchDeletePartitionsRequestPartitionValueList build(java.util.Map<String, ?> map) throws Exception {
            BatchDeletePartitionsRequestPartitionValueList self = new BatchDeletePartitionsRequestPartitionValueList();
            return TeaModel.build(map, self);
        }

        public BatchDeletePartitionsRequestPartitionValueList setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
