// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListUserActiveRunsRequest extends TeaModel {
    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    // 任务名字
    @NameInMap("Name")
    public String name;

    // 状态
    @NameInMap("Status")
    public String status;

    // 提交ID
    @NameInMap("SubmissionId")
    public String submissionId;

    // 搜索ID
    @NameInMap("Search")
    public String search;

    // 标签选择
    @NameInMap("LabelSelector")
    public String labelSelector;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("IsReversed")
    public Boolean isReversed;

    public static ListUserActiveRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserActiveRunsRequest self = new ListUserActiveRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserActiveRunsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ListUserActiveRunsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserActiveRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserActiveRunsRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public ListUserActiveRunsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListUserActiveRunsRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListUserActiveRunsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListUserActiveRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserActiveRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserActiveRunsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListUserActiveRunsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

}
