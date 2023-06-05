// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaTableRequest extends TeaModel {
    /**
     * <p>The name of the EMR table.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The name of the EMR database.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>Indicates whether the table exists.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static CheckMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaTableRequest self = new CheckMetaTableRequest();
        return TeaModel.build(map, self);
    }

    public CheckMetaTableRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CheckMetaTableRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckMetaTableRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CheckMetaTableRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public CheckMetaTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
