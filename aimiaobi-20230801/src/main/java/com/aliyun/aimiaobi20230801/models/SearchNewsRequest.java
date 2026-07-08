// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchNewsRequest extends TeaModel {
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
    public java.util.List<String> searchSources;

    public static SearchNewsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchNewsRequest self = new SearchNewsRequest();
        return TeaModel.build(map, self);
    }

    public SearchNewsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchNewsRequest setFilterNotNull(Boolean filterNotNull) {
        this.filterNotNull = filterNotNull;
        return this;
    }
    public Boolean getFilterNotNull() {
        return this.filterNotNull;
    }

    public SearchNewsRequest setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
        return this;
    }
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    public SearchNewsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public SearchNewsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchNewsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchNewsRequest setSearchSources(java.util.List<String> searchSources) {
        this.searchSources = searchSources;
        return this;
    }
    public java.util.List<String> getSearchSources() {
        return this.searchSources;
    }

}
