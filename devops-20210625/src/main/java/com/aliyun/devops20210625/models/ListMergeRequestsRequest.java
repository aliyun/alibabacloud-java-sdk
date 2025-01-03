// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("authorIds")
    public String authorIds;

    @NameInMap("createdAfter")
    public String createdAfter;

    @NameInMap("createdBefore")
    public String createdBefore;

    /**
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <strong>example:</strong>
     * <p>889910, 889911</p>
     */
    @NameInMap("groupIds")
    public String groupIds;

    @NameInMap("labelIds")
    public String labelIds;

    /**
     * <strong>example:</strong>
     * <p>updated_at</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>2308912, 2308913</p>
     */
    @NameInMap("projectIds")
    public String projectIds;

    /**
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("reviewerIds")
    public String reviewerIds;

    /**
     * <strong>example:</strong>
     * <p>test-search</p>
     */
    @NameInMap("search")
    public String search;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>opened</p>
     */
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

    public ListMergeRequestsRequest setCreatedAfter(String createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }
    public String getCreatedAfter() {
        return this.createdAfter;
    }

    public ListMergeRequestsRequest setCreatedBefore(String createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }
    public String getCreatedBefore() {
        return this.createdBefore;
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

    public ListMergeRequestsRequest setLabelIds(String labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public String getLabelIds() {
        return this.labelIds;
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
