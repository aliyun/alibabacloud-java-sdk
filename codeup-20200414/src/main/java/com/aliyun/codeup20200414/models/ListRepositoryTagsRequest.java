// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryTagsRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Search")
    public String search;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("ShowSignature")
    public Boolean showSignature;

    public static ListRepositoryTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTagsRequest self = new ListRepositoryTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTagsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryTagsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListRepositoryTagsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryTagsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoryTagsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryTagsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListRepositoryTagsRequest setShowSignature(Boolean showSignature) {
        this.showSignature = showSignature;
        return this;
    }
    public Boolean getShowSignature() {
        return this.showSignature;
    }

}
