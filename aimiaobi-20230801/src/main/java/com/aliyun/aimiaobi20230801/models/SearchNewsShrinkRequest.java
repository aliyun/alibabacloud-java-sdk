// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchNewsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("FilterNotNull")
    public Boolean filterNotNull;

    @NameInMap("IncludeContent")
    public Boolean includeContent;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("SearchSources")
    public String searchSourcesShrink;

    public static SearchNewsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchNewsShrinkRequest self = new SearchNewsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchNewsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchNewsShrinkRequest setFilterNotNull(Boolean filterNotNull) {
        this.filterNotNull = filterNotNull;
        return this;
    }
    public Boolean getFilterNotNull() {
        return this.filterNotNull;
    }

    public SearchNewsShrinkRequest setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
        return this;
    }
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    public SearchNewsShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public SearchNewsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchNewsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchNewsShrinkRequest setSearchSourcesShrink(String searchSourcesShrink) {
        this.searchSourcesShrink = searchSourcesShrink;
        return this;
    }
    public String getSearchSourcesShrink() {
        return this.searchSourcesShrink;
    }

}
