// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    /**
     * <p>The namespace of the database category. By default, the Uid of the primary account is entered.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The regular expression used to match the database name. If all matches are specified, this parameter is specified. \*</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("NamePattern")
    public String namePattern;

    /**
     * <p>The paging token, which is returned by the result. For example, you can specify &quot;&quot; for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>2cb472ec1bf84f8d92f9c4baa0d21c19aa!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
