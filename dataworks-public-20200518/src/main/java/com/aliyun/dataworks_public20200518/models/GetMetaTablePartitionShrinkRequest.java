// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionShrinkRequest extends TeaModel {
    /**
     * <p>The name of the metatable in the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [GetMetaDBTableList](https://help.aliyun.com/document_detail/173916.html) operation to query the name of the metatable.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The field that is used to sort partitions in the metatable. Valid values: name and modify_time.</p>
     * <br>
     * <p>By default, partitions in the metatable are sorted based on their creation time.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The GUID of the metatable.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The order in which partitions in the metatable are sorted. Valid values: asc and desc. Default value: desc.</p>
     */
    @NameInMap("SortCriterion")
    public String sortCriterionShrink;

    /**
     * <p>The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [ListMetaDB](https://help.aliyun.com/document_detail/185662.html) operation to query the name of the metadatabase.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The logic for sorting partitions in the metatable.</p>
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
