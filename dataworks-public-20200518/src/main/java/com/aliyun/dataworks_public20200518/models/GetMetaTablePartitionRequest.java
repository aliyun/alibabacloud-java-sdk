// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortCriterion")
    public GetMetaTablePartitionRequestSortCriterion sortCriterion;

    @NameInMap("TableGuid")
    public String tableGuid;

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
        @NameInMap("Order")
        public String order;

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
