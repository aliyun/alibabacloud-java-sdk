// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListFunctionNamesRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("FunctionNamePattern")
    public String functionNamePattern;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListFunctionNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionNamesRequest self = new ListFunctionNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionNamesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListFunctionNamesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListFunctionNamesRequest setFunctionNamePattern(String functionNamePattern) {
        this.functionNamePattern = functionNamePattern;
        return this;
    }
    public String getFunctionNamePattern() {
        return this.functionNamePattern;
    }

    public ListFunctionNamesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListFunctionNamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
