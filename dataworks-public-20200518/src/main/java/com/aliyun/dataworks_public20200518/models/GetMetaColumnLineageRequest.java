// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageRequest extends TeaModel {
    /**
     * <p>The ID of the EMR cluster. This parameter is required for EMR scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The unique identifier of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.engine_name.table_name.column_name</p>
     */
    @NameInMap("ColumnGuid")
    public String columnGuid;

    /**
     * <p>The name of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>odps</li>
     * <li>emr</li>
     * </ul>
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
     * <p>The direction of the field lineage. Valid values:</p>
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
     * <p>The page number. Used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
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
