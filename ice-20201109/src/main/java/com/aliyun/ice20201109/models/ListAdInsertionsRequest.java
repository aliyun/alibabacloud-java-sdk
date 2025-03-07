// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAdInsertionsRequest extends TeaModel {
    /**
     * <p>The configuration name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ad</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to retrieve in a subsequent request. If this parameter is used, the pagination parameters become invalid. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used in the next request to retrieve a new page of results. If this parameter is used, the pagination parameters become invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>*<em><strong><strong>8EqYpQbZ6Eh7+Zz8DxVYoQ</strong></strong></em></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sorting order of the configurations by creation time. asc: ascending. desc: descending.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListAdInsertionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdInsertionsRequest self = new ListAdInsertionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAdInsertionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAdInsertionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAdInsertionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAdInsertionsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListAdInsertionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAdInsertionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
