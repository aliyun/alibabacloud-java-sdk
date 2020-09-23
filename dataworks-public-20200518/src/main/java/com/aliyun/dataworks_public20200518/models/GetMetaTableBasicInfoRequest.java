// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoRequest extends TeaModel {
    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    public static GetMetaTableBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoRequest self = new GetMetaTableBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableBasicInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableBasicInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTableBasicInfoRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTableBasicInfoRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetMetaTableBasicInfoRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
