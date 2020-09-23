// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaPartitionRequest extends TeaModel {
    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("Partition")
    @Validation(required = true)
    public String partition;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    public static CheckMetaPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaPartitionRequest self = new CheckMetaPartitionRequest();
        return TeaModel.build(map, self);
    }

    public CheckMetaPartitionRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public CheckMetaPartitionRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public CheckMetaPartitionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CheckMetaPartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CheckMetaPartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CheckMetaPartitionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
