// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsByFilterRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // Filter
    @NameInMap("Filter")
    public String filter;

    // IsShareSd
    @NameInMap("IsShareSd")
    public Boolean isShareSd;

    // NextPageToken
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // PageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static ListPartitionsByFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByFilterRequest self = new ListPartitionsByFilterRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByFilterRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPartitionsByFilterRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListPartitionsByFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListPartitionsByFilterRequest setIsShareSd(Boolean isShareSd) {
        this.isShareSd = isShareSd;
        return this;
    }
    public Boolean getIsShareSd() {
        return this.isShareSd;
    }

    public ListPartitionsByFilterRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionsByFilterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionsByFilterRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
