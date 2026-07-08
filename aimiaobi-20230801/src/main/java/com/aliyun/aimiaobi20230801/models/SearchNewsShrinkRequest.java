// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchNewsShrinkRequest extends TeaModel {
    /**
     * <p>The unique ID of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/3027170.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Specifies whether to filter out results with empty content.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterNotNull")
    public Boolean filterNotNull;

    /**
     * <p>Specifies whether to include the full text of the article.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeContent")
    public Boolean includeContent;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of records to return on each page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search query.</p>
     * 
     * <strong>example:</strong>
     * <p>检索Query</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>A list of search sources.</p>
     */
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
