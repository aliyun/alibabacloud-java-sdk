// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>The custom filter. This is a JSON string. Supported fields include integer field intField1 and string fields strField1 and strField2. Each field supports only one matching type. Filters on different fields are combined with an AND relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13},&quot;strField2&quot;:[&quot;cd&quot;,&quot;de&quot;],&quot;strField1&quot;:&quot;abc&quot;}</p>
     */
    @NameInMap("CustomFilters")
    public String customFilters;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2d3bf1e35a1e42b5ab338d701efa****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The filter condition. &lt;props=&quot;china&quot;&gt;For syntax rules, see <a href="https://help.aliyun.com/document_detail/2584256.html">Media asset search protocol</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Title = \&quot;China\&quot; and utcCreate = [\&quot;1693367158561\&quot;,\&quot;1693367158562\&quot;]</p>
     */
    @NameInMap("Match")
    public String match;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pagination token. This is a 32-character field. You do not need to set this parameter for the first search request. When the search request matches data, the server returns this parameter value to record the current position of the search data. Record the returned parameter value and set this parameter in the next search request according to the following requirements or suggestions: This parameter must be set when you need to traverse all data that matches the search conditions. When the PageNo parameter value exceeds 200, set this parameter to optimize search performance. You can only page forward, and the maximum paging distance is 1000 media assets.</p>
     * 
     * <strong>example:</strong>
     * <p>F8C4F642184DBDA5D93907A70AAE****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    /**
     * <p>The sort fields and sort orders, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>utcCreate:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static SearchMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaRequest self = new SearchMediaRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaRequest setCustomFilters(String customFilters) {
        this.customFilters = customFilters;
        return this;
    }
    public String getCustomFilters() {
        return this.customFilters;
    }

    public SearchMediaRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SearchMediaRequest setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public SearchMediaRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaRequest setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public SearchMediaRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public SearchMediaRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
