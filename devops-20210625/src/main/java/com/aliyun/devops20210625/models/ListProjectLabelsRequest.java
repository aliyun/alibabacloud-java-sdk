// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectLabelsRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("page")
    public Integer page;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    @NameInMap("search")
    public String search;

    @NameInMap("sort")
    public String sort;

    @NameInMap("withCounts")
    public Boolean withCounts;

    public static ListProjectLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectLabelsRequest self = new ListProjectLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectLabelsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListProjectLabelsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListProjectLabelsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListProjectLabelsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListProjectLabelsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProjectLabelsRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public ListProjectLabelsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListProjectLabelsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListProjectLabelsRequest setWithCounts(Boolean withCounts) {
        this.withCounts = withCounts;
        return this;
    }
    public Boolean getWithCounts() {
        return this.withCounts;
    }

}
