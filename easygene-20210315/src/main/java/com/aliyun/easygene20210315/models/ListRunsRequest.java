// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListRunsRequest extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用版本
    @NameInMap("AppRevision")
    public String appRevision;

    // 实体名称
    @NameInMap("EntityName")
    public String entityName;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 是否返回所有任务条数
    @NameInMap("GetTotal")
    public Boolean getTotal;

    // 是否逆序
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 标签选择
    @NameInMap("LabelSelector")
    public String labelSelector;

    // 最大返回个数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 查询起始位置
    @NameInMap("NextToken")
    public String nextToken;

    // 排序依据
    @NameInMap("OrderBy")
    public String orderBy;

    // 搜索ID
    @NameInMap("Search")
    public String search;

    // 状态
    @NameInMap("Status")
    public String status;

    // 提交ID
    @NameInMap("SubmissionId")
    public String submissionId;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static ListRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRunsRequest self = new ListRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListRunsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListRunsRequest setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public ListRunsRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public ListRunsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListRunsRequest setGetTotal(Boolean getTotal) {
        this.getTotal = getTotal;
        return this;
    }
    public Boolean getGetTotal() {
        return this.getTotal;
    }

    public ListRunsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListRunsRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRunsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListRunsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListRunsRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public ListRunsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
