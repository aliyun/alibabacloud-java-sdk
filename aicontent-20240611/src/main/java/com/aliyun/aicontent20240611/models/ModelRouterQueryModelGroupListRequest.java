// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupListRequest extends TeaModel {
    /**
     * <p>The keyword for fuzzy match by group name.</p>
     * 
     * <strong>example:</strong>
     * <p>Professional</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>An unused parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The group type filter. Valid values: system, manual, and all. Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelRouterQueryModelGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupListRequest self = new ModelRouterQueryModelGroupListRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ModelRouterQueryModelGroupListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryModelGroupListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryModelGroupListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterQueryModelGroupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModelRouterQueryModelGroupListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
