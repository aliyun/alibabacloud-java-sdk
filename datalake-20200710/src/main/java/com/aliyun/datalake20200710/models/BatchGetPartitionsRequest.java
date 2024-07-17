// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionsRequest extends TeaModel {
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
    @NameInMap("IsShareSd")
    public Boolean isShareSd;

    @NameInMap("PartitionValueList")
    public java.util.List<BatchGetPartitionsRequestPartitionValueList> partitionValueList;

    /**
     * <strong>example:</strong>
     * <p>test_table_20200715162543389</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static BatchGetPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionsRequest self = new BatchGetPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchGetPartitionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchGetPartitionsRequest setIsShareSd(Boolean isShareSd) {
        this.isShareSd = isShareSd;
        return this;
    }
    public Boolean getIsShareSd() {
        return this.isShareSd;
    }

    public BatchGetPartitionsRequest setPartitionValueList(java.util.List<BatchGetPartitionsRequestPartitionValueList> partitionValueList) {
        this.partitionValueList = partitionValueList;
        return this;
    }
    public java.util.List<BatchGetPartitionsRequestPartitionValueList> getPartitionValueList() {
        return this.partitionValueList;
    }

    public BatchGetPartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class BatchGetPartitionsRequestPartitionValueList extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static BatchGetPartitionsRequestPartitionValueList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetPartitionsRequestPartitionValueList self = new BatchGetPartitionsRequestPartitionValueList();
            return TeaModel.build(map, self);
        }

        public BatchGetPartitionsRequestPartitionValueList setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
