// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTableVersionsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // NextPageToken
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // max result of this query
    @NameInMap("PageSize")
    public Integer pageSize;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static ListTableVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableVersionsRequest self = new ListTableVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTableVersionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListTableVersionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListTableVersionsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTableVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTableVersionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
