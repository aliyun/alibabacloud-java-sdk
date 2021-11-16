// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ColumnGuid")
    public String columnGuid;

    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TableName")
    public String tableName;

    public static GetMetaColumnLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaColumnLineageRequest self = new GetMetaColumnLineageRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaColumnLineageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaColumnLineageRequest setColumnGuid(String columnGuid) {
        this.columnGuid = columnGuid;
        return this;
    }
    public String getColumnGuid() {
        return this.columnGuid;
    }

    public GetMetaColumnLineageRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public GetMetaColumnLineageRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaColumnLineageRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaColumnLineageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetMetaColumnLineageRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetMetaColumnLineageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaColumnLineageRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
