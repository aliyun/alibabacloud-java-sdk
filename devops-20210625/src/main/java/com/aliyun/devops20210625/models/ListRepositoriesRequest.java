// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoriesRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("archived")
    public Boolean archived;

    @NameInMap("minAccessLevel")
    public Integer minAccessLevel;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("page")
    public Long page;

    @NameInMap("perPage")
    public Long perPage;

    @NameInMap("search")
    public String search;

    @NameInMap("sort")
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

    public ListRepositoriesRequest setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
    public Boolean getArchived() {
        return this.archived;
    }

    public ListRepositoriesRequest setMinAccessLevel(Integer minAccessLevel) {
        this.minAccessLevel = minAccessLevel;
        return this;
    }
    public Integer getMinAccessLevel() {
        return this.minAccessLevel;
    }

    public ListRepositoriesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
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

    public ListRepositoriesRequest setPerPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
    public Long getPerPage() {
        return this.perPage;
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
