// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreatePartitionsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // IfNotExists
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    // NeedResult
    @NameInMap("NeedResult")
    public Boolean needResult;

    // PartitionInputs
    @NameInMap("PartitionInputs")
    public java.util.List<PartitionInput> partitionInputs;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static BatchCreatePartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreatePartitionsRequest self = new BatchCreatePartitionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreatePartitionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchCreatePartitionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchCreatePartitionsRequest setIfNotExists(Boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
        return this;
    }
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public BatchCreatePartitionsRequest setNeedResult(Boolean needResult) {
        this.needResult = needResult;
        return this;
    }
    public Boolean getNeedResult() {
        return this.needResult;
    }

    public BatchCreatePartitionsRequest setPartitionInputs(java.util.List<PartitionInput> partitionInputs) {
        this.partitionInputs = partitionInputs;
        return this;
    }
    public java.util.List<PartitionInput> getPartitionInputs() {
        return this.partitionInputs;
    }

    public BatchCreatePartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
