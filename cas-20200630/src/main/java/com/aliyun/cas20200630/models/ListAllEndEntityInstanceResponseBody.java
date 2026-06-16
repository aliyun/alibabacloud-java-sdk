// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListAllEndEntityInstanceResponseBody extends TeaModel {
    /**
     * <p>The page number of the instance list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("List")
    public java.util.List<java.util.Map<String, ?>> list;

    /**
     * <p>The maximum number of entries returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that you can use to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>443C05A8-6C16-52B5-BB97-5D8798F7A49A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of entries displayed on each page of a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAllEndEntityInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllEndEntityInstanceResponseBody self = new ListAllEndEntityInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllEndEntityInstanceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAllEndEntityInstanceResponseBody setList(java.util.List<java.util.Map<String, ?>> list) {
        this.list = list;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getList() {
        return this.list;
    }

    public ListAllEndEntityInstanceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAllEndEntityInstanceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAllEndEntityInstanceResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListAllEndEntityInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllEndEntityInstanceResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListAllEndEntityInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
