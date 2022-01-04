// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // IsShareSd
    @NameInMap("IsShareSd")
    public Boolean isShareSd;

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

    public static ListPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsRequest self = new ListPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPartitionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListPartitionsRequest setIsShareSd(Boolean isShareSd) {
        this.isShareSd = isShareSd;
        return this;
    }
    public Boolean getIsShareSd() {
        return this.isShareSd;
    }

    public ListPartitionsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionsRequest setPartialPartValues(java.util.List<String> partialPartValues) {
        this.partialPartValues = partialPartValues;
        return this;
    }
    public java.util.List<String> getPartialPartValues() {
        return this.partialPartValues;
    }

    public ListPartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
