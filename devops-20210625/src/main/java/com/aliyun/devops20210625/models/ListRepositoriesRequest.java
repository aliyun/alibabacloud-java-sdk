// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoriesRequest extends TeaModel {
    // accessToken
    @NameInMap("accessToken")
    public String accessToken;

    // 是否列出归档项目
    @NameInMap("archived")
    public Boolean archived;

    // 排序字段
    @NameInMap("orderBy")
    public String orderBy;

    // 企业ID
    @NameInMap("organizationId")
    public String organizationId;

    // 页码
    @NameInMap("page")
    public Long page;

    // 每页大小
    @NameInMap("perPage")
    public Long perPage;

    // 搜索关键字
    @NameInMap("search")
    public String search;

    // 排序方式 (desc: 降序, asc: 升序)
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
