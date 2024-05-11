// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    @NameInMap("EndTimeRange")
    public TimeRange endTimeRange;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestDefinition")
    public Boolean requestDefinition;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("StartTimeRange")
    public TimeRange startTimeRange;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagSelector")
    public String tagSelector;

    @NameInMap("TaskTypes")
    public java.util.List<String> taskTypes;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setEndTimeRange(TimeRange endTimeRange) {
        this.endTimeRange = endTimeRange;
        return this;
    }
    public TimeRange getEndTimeRange() {
        return this.endTimeRange;
    }

    public ListTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTasksRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListTasksRequest setRequestDefinition(Boolean requestDefinition) {
        this.requestDefinition = requestDefinition;
        return this;
    }
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    public ListTasksRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListTasksRequest setStartTimeRange(TimeRange startTimeRange) {
        this.startTimeRange = startTimeRange;
        return this;
    }
    public TimeRange getStartTimeRange() {
        return this.startTimeRange;
    }

    public ListTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksRequest setTagSelector(String tagSelector) {
        this.tagSelector = tagSelector;
        return this;
    }
    public String getTagSelector() {
        return this.tagSelector;
    }

    public ListTasksRequest setTaskTypes(java.util.List<String> taskTypes) {
        this.taskTypes = taskTypes;
        return this;
    }
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

}
