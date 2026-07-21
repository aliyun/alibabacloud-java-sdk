// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelListRequest extends TeaModel {
    /**
     * <p>The field to use for grouping the results.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>The keyword for a fuzzy search on model information.</p>
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
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>Specifies whether to include the total count of matching models in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The pagination token for retrieving the next page of results. If this parameter is not specified, the first page is retrieved. To retrieve a subsequent page, set this to the <code>nextToken</code> value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The field to use for sorting the results.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort order. Valid values include <code>ASC</code> for ascending order and <code>DESC</code> for descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number to retrieve. Pages are numbered starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of models to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The model status to use as a filter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static ModelRouterQueryModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelListRequest self = new ModelRouterQueryModelListRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelListRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ModelRouterQueryModelListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ModelRouterQueryModelListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryModelListRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelRouterQueryModelListRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ModelRouterQueryModelListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryModelListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ModelRouterQueryModelListRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ModelRouterQueryModelListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterQueryModelListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModelRouterQueryModelListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
