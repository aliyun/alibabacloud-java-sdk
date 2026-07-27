// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the EMR cluster. Required only if <strong>DataSourceType</strong> is <strong>EMR</strong>.</p>
     * <p>Log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The data source type. Valid values: ODPS and EMR.</p>
     * 
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the database. Required only if <strong>DataSourceType</strong> is <strong>EMR</strong>.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2780105.html">ListMetaDB</a> operation to query the database name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The partition sorting logic.</p>
     */
    @NameInMap("SortCriterion")
    public String sortCriterionShrink;

    /**
     * <p>The unique identifier of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.engine_name.table_name</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the EMR table. Required only if <strong>DataSourceType</strong> is <strong>EMR</strong>.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2780086.html">GetMetaDBTableList</a> operation to query the table name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTablePartitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionShrinkRequest self = new GetMetaTablePartitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTablePartitionShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTablePartitionShrinkRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTablePartitionShrinkRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTablePartitionShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMetaTablePartitionShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTablePartitionShrinkRequest setSortCriterionShrink(String sortCriterionShrink) {
        this.sortCriterionShrink = sortCriterionShrink;
        return this;
    }
    public String getSortCriterionShrink() {
        return this.sortCriterionShrink;
    }

    public GetMetaTablePartitionShrinkRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTablePartitionShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
