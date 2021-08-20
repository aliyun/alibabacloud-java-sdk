// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListMergeRequestsRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("GroupIdList")
    public String groupIdList;

    @NameInMap("ProjectIdList")
    public String projectIdList;

    @NameInMap("AuthorCodeupIdList")
    public String authorCodeupIdList;

    @NameInMap("AuthorIdList")
    public String authorIdList;

    @NameInMap("AssigneeCodeupIdList")
    public String assigneeCodeupIdList;

    @NameInMap("AssigneeIdList")
    public String assigneeIdList;

    @NameInMap("SubscriberCodeupIdList")
    public String subscriberCodeupIdList;

    @NameInMap("State")
    public String state;

    @NameInMap("Search")
    public String search;

    @NameInMap("Order")
    public String order;

    @NameInMap("AfterDate")
    public String afterDate;

    @NameInMap("BeforeDate")
    public String beforeDate;

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

    public ListMergeRequestsRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public String getGroupIdList() {
        return this.groupIdList;
    }

    public ListMergeRequestsRequest setProjectIdList(String projectIdList) {
        this.projectIdList = projectIdList;
        return this;
    }
    public String getProjectIdList() {
        return this.projectIdList;
    }

    public ListMergeRequestsRequest setAuthorCodeupIdList(String authorCodeupIdList) {
        this.authorCodeupIdList = authorCodeupIdList;
        return this;
    }
    public String getAuthorCodeupIdList() {
        return this.authorCodeupIdList;
    }

    public ListMergeRequestsRequest setAuthorIdList(String authorIdList) {
        this.authorIdList = authorIdList;
        return this;
    }
    public String getAuthorIdList() {
        return this.authorIdList;
    }

    public ListMergeRequestsRequest setAssigneeCodeupIdList(String assigneeCodeupIdList) {
        this.assigneeCodeupIdList = assigneeCodeupIdList;
        return this;
    }
    public String getAssigneeCodeupIdList() {
        return this.assigneeCodeupIdList;
    }

    public ListMergeRequestsRequest setAssigneeIdList(String assigneeIdList) {
        this.assigneeIdList = assigneeIdList;
        return this;
    }
    public String getAssigneeIdList() {
        return this.assigneeIdList;
    }

    public ListMergeRequestsRequest setSubscriberCodeupIdList(String subscriberCodeupIdList) {
        this.subscriberCodeupIdList = subscriberCodeupIdList;
        return this;
    }
    public String getSubscriberCodeupIdList() {
        return this.subscriberCodeupIdList;
    }

    public ListMergeRequestsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListMergeRequestsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListMergeRequestsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMergeRequestsRequest setAfterDate(String afterDate) {
        this.afterDate = afterDate;
        return this;
    }
    public String getAfterDate() {
        return this.afterDate;
    }

    public ListMergeRequestsRequest setBeforeDate(String beforeDate) {
        this.beforeDate = beforeDate;
        return this;
    }
    public String getBeforeDate() {
        return this.beforeDate;
    }

}
