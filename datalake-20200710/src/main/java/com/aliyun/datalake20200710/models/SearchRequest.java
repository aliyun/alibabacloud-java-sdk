// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("SortCriteria")
    public java.util.List<SortCriterion> sortCriteria;

    public static SearchRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRequest self = new SearchRequest();
        return TeaModel.build(map, self);
    }

    public SearchRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public SearchRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public SearchRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchRequest setSortCriteria(java.util.List<SortCriterion> sortCriteria) {
        this.sortCriteria = sortCriteria;
        return this;
    }
    public java.util.List<SortCriterion> getSortCriteria() {
        return this.sortCriteria;
    }

}
