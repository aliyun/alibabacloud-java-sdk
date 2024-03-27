// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class ListManualTaskInstancesRequest extends TeaModel {
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

    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListManualTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManualTaskInstancesRequest self = new ListManualTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListManualTaskInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListManualTaskInstancesRequest setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public ListManualTaskInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListManualTaskInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListManualTaskInstancesRequest setSearchVal(String searchVal) {
        this.searchVal = searchVal;
        return this;
    }
    public String getSearchVal() {
        return this.searchVal;
    }

    public ListManualTaskInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListManualTaskInstancesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
