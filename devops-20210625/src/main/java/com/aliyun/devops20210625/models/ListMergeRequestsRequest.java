// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestsRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("authorIds")
    public String authorIds;

    @NameInMap("filter")
    public String filter;

    @NameInMap("groupIds")
    public String groupIds;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("page")
    public Long page;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projectIds")
    public String projectIds;

    @NameInMap("reviewerIds")
    public String reviewerIds;

    @NameInMap("search")
    public String search;

    @NameInMap("sort")
    public String sort;

    @NameInMap("state")
    public String state;

    public static ListMergeRequestsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestsRequest self = new ListMergeRequestsRequest();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListMergeRequestsRequest setAuthorIds(String authorIds) {
        this.authorIds = authorIds;
        return this;
    }
    public String getAuthorIds() {
        return this.authorIds;
    }

    public ListMergeRequestsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListMergeRequestsRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public ListMergeRequestsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMergeRequestsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListMergeRequestsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListMergeRequestsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMergeRequestsRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

    public ListMergeRequestsRequest setReviewerIds(String reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }
    public String getReviewerIds() {
        return this.reviewerIds;
    }

    public ListMergeRequestsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListMergeRequestsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListMergeRequestsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
