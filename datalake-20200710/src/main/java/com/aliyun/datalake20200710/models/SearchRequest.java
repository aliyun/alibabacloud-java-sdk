// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchRequest extends TeaModel {
    // catalogid
    @NameInMap("CatalogId")
    public String catalogId;

    // 当前查询的页号
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 当前查询的页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 搜索问题
    @NameInMap("SearchText")
    public String searchText;

    // 排序结构
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

    public SearchRequest setSortCriteria(java.util.List<SortCriterion> sortCriteria) {
        this.sortCriteria = sortCriteria;
        return this;
    }
    public java.util.List<SortCriterion> getSortCriteria() {
        return this.sortCriteria;
    }

}
