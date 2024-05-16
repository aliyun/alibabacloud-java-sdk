// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaPartitionRequest extends TeaModel {
    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Indicates whether the partition exists.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The name of the database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Partition")
    public String partition;

    /**
     * <p>The ID of the E-MapReduce (EMR) cluster.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static CheckMetaPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaPartitionRequest self = new CheckMetaPartitionRequest();
        return TeaModel.build(map, self);
    }

    public CheckMetaPartitionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CheckMetaPartitionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckMetaPartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CheckMetaPartitionRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public CheckMetaPartitionRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public CheckMetaPartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
