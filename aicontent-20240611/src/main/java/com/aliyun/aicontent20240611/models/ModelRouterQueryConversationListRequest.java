// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryConversationListRequest extends TeaModel {
    /**
     * <p>The grouping field.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>A keyword to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether to return the total count of items. Set to <code>true</code> to return the total count.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The pagination token for the next page of results. To retrieve the first page, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort order. Valid values are <code>ASC</code> (ascending) and <code>DESC</code> (descending).</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of items to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters the results by status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static ModelRouterQueryConversationListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryConversationListRequest self = new ModelRouterQueryConversationListRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryConversationListRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ModelRouterQueryConversationListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ModelRouterQueryConversationListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryConversationListRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ModelRouterQueryConversationListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryConversationListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ModelRouterQueryConversationListRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ModelRouterQueryConversationListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterQueryConversationListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModelRouterQueryConversationListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
