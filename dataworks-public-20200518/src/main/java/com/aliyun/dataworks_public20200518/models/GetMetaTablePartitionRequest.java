// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionRequest extends TeaModel {
    /**
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [ListMetaDB](~~185662~~) operation to query the name of the metadatabase.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The logic for sorting partitions in the metatable.</p>
     */
    @NameInMap("SortCriterion")
    public GetMetaTablePartitionRequestSortCriterion sortCriterion;

    /**
     * <p>The GUID of the metatable.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the metatable in the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [GetMetaDBTableList](~~173916~~) operation to query the name of the metatable.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTablePartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionRequest self = new GetMetaTablePartitionRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTablePartitionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTablePartitionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTablePartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTablePartitionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMetaTablePartitionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTablePartitionRequest setSortCriterion(GetMetaTablePartitionRequestSortCriterion sortCriterion) {
        this.sortCriterion = sortCriterion;
        return this;
    }
    public GetMetaTablePartitionRequestSortCriterion getSortCriterion() {
        return this.sortCriterion;
    }

    public GetMetaTablePartitionRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTablePartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class GetMetaTablePartitionRequestSortCriterion extends TeaModel {
        /**
         * <p>The order in which partitions in the metatable are sorted. Valid values: asc and desc. Default value: desc.</p>
         */
        @NameInMap("Order")
        public String order;

        /**
         * <p>The field that is used to sort partitions in the metatable. Valid values: name and modify_time.</p>
         * <br>
         * <p>By default, partitions in the metatable are sorted based on their creation time.</p>
         */
        @NameInMap("SortField")
        public String sortField;

        public static GetMetaTablePartitionRequestSortCriterion build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionRequestSortCriterion self = new GetMetaTablePartitionRequestSortCriterion();
            return TeaModel.build(map, self);
        }

        public GetMetaTablePartitionRequestSortCriterion setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public GetMetaTablePartitionRequestSortCriterion setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

}
