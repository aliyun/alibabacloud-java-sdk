// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoriesRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Archive")
    public Boolean archive;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("Sort")
    public String sort;

    public static ListRepositoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesRequest self = new ListRepositoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoriesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoriesRequest setArchive(Boolean archive) {
        this.archive = archive;
        return this;
    }
    public Boolean getArchive() {
        return this.archive;
    }

    public ListRepositoriesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListRepositoriesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoriesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoriesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoriesRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListRepositoriesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
