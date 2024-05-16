// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageRequest extends TeaModel {
    /**
     * <p>The name of the metatable.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The ID of the E-MapReduce (EMR) cluster. Set this parameter only when you query data in an EMR compute engine instance.</p>
     */
    @NameInMap("NextPrimaryKey")
    public String nextPrimaryKey;

    /**
     * <p>The name of the metadatabase.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The logic of paging. Set this parameter based on the value of the response parameter NextPrimaryKey when the value of the response parameter HasNext is true in the last query.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The HTTP status code.</p>
     */
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
