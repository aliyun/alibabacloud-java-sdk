// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionNamesRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // NextPageToken
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // PageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PartialPartValues")
    public java.util.List<String> partialPartValues;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static ListPartitionNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionNamesRequest self = new ListPartitionNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionNamesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPartitionNamesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListPartitionNamesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionNamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionNamesRequest setPartialPartValues(java.util.List<String> partialPartValues) {
        this.partialPartValues = partialPartValues;
        return this;
    }
    public java.util.List<String> getPartialPartValues() {
        return this.partialPartValues;
    }

    public ListPartitionNamesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
