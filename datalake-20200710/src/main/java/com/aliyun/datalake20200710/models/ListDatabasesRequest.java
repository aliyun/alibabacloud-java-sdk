// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("NamePattern")
    public String namePattern;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesRequest self = new ListDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListDatabasesRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }
    public String getNamePattern() {
        return this.namePattern;
    }

    public ListDatabasesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDatabasesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
