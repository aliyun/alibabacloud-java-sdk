// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class ListTaskInstancesRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("executionStatus")
    public String executionStatus;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("searchVal")
    public String searchVal;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("workflowInstanceId")
    public String workflowInstanceId;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesRequest self = new ListTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTaskInstancesRequest setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public ListTaskInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTaskInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskInstancesRequest setSearchVal(String searchVal) {
        this.searchVal = searchVal;
        return this;
    }
    public String getSearchVal() {
        return this.searchVal;
    }

    public ListTaskInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTaskInstancesRequest setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public ListTaskInstancesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
