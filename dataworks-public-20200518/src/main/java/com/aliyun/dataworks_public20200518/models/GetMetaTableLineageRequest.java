// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("NextPrimaryKey")
    public String nextPrimaryKey;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTableLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableLineageRequest self = new GetMetaTableLineageRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableLineageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTableLineageRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTableLineageRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTableLineageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetMetaTableLineageRequest setNextPrimaryKey(String nextPrimaryKey) {
        this.nextPrimaryKey = nextPrimaryKey;
        return this;
    }
    public String getNextPrimaryKey() {
        return this.nextPrimaryKey;
    }

    public GetMetaTableLineageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTableLineageRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableLineageRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
