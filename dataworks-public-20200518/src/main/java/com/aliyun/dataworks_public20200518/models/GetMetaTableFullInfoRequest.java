// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoRequest extends TeaModel {
    /**
     * <p>The ID of the EMR cluster. This parameter is required only when the data source type is EMR.</p>
     * <p>You can log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C-010A704DA760****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The data source type. Currently, only EMR is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the database. This parameter is required only when the data source type is EMR.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/185662.html">ListMetaDB</a> operation to obtain the database name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The page number for pagination.</p>
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
     * <p>The globally unique identifier (GUID) of the table. You can call <a href="https://help.aliyun.com/document_detail/173916.html">GetMetaDBTableList</a> to obtain the GUID of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.engine_name.table_name</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the EMR table. This parameter is required only when the data source type is EMR.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/173916.html">GetMetaDBTableList</a> operation to obtain the table name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTableFullInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoRequest self = new GetMetaTableFullInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableFullInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTableFullInfoRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTableFullInfoRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTableFullInfoRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetMetaTableFullInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTableFullInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableFullInfoRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
