// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchAcrossCatalogRequest extends TeaModel {
    @NameInMap("CatalogIds")
    public java.util.List<String> catalogIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>tags:tag1 or comment:^iso and name=aliyun and (createTime &gt; &quot;20211111&quot; and createTime &lt; &quot;20211117&quot;) and has category</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("SearchTypes")
    public java.util.List<String> searchTypes;

    @NameInMap("SortCriteria")
    public java.util.List<SortCriterion> sortCriteria;

    public static SearchAcrossCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAcrossCatalogRequest self = new SearchAcrossCatalogRequest();
        return TeaModel.build(map, self);
    }

    public SearchAcrossCatalogRequest setCatalogIds(java.util.List<String> catalogIds) {
        this.catalogIds = catalogIds;
        return this;
    }
    public java.util.List<String> getCatalogIds() {
        return this.catalogIds;
    }

    public SearchAcrossCatalogRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchAcrossCatalogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchAcrossCatalogRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public SearchAcrossCatalogRequest setSearchTypes(java.util.List<String> searchTypes) {
        this.searchTypes = searchTypes;
        return this;
    }
    public java.util.List<String> getSearchTypes() {
        return this.searchTypes;
    }

    public SearchAcrossCatalogRequest setSortCriteria(java.util.List<SortCriterion> sortCriteria) {
        this.sortCriteria = sortCriteria;
        return this;
    }
    public java.util.List<SortCriterion> getSortCriteria() {
        return this.sortCriteria;
    }

}
