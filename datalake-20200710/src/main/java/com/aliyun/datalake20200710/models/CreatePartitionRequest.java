// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreatePartitionRequest extends TeaModel {
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
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResult")
    public Boolean needResult;

    @NameInMap("PartitionInput")
    public PartitionInput partitionInput;

    /**
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static CreatePartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePartitionRequest self = new CreatePartitionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePartitionRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public CreatePartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreatePartitionRequest setIfNotExists(Boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
        return this;
    }
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public CreatePartitionRequest setNeedResult(Boolean needResult) {
        this.needResult = needResult;
        return this;
    }
    public Boolean getNeedResult() {
        return this.needResult;
    }

    public CreatePartitionRequest setPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
        return this;
    }
    public PartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    public CreatePartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
