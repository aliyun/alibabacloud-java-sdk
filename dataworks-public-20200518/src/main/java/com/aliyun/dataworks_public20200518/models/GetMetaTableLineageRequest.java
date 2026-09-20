// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageRequest extends TeaModel {
    /**
     * <p>The ID of the EMR cluster. This parameter is required for EMR scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The data source type. Valid values: odps and emr.</p>
     * 
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The direction of the lineage. Valid values:</p>
     * <ul>
     * <li>up: upstream.</li>
     * <li>down: downstream.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The pagination logic.</p>
     * <p>If HasNext is set to true and NextPrimaryKey is not empty in the last response, set this parameter to the value of NextPrimaryKey in the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>next_primary_key</p>
     */
    @NameInMap("NextPrimaryKey")
    public String nextPrimaryKey;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.engine_name.table_name</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
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
