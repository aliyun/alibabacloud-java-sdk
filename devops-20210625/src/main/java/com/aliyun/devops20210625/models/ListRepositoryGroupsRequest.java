// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryGroupsRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("includePersonal")
    public Boolean includePersonal;

    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("page")
    public Long page;

    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    @NameInMap("search")
    public String search;

    @NameInMap("sort")
    public String sort;

    public static ListRepositoryGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryGroupsRequest self = new ListRepositoryGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryGroupsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryGroupsRequest setIncludePersonal(Boolean includePersonal) {
        this.includePersonal = includePersonal;
        return this;
    }
    public Boolean getIncludePersonal() {
        return this.includePersonal;
    }

    public ListRepositoryGroupsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListRepositoryGroupsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryGroupsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoryGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryGroupsRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ListRepositoryGroupsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListRepositoryGroupsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
