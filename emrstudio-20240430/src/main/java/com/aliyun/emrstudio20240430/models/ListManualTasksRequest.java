// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListManualTasksRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("searchVal")
    public String searchVal;

    @NameInMap("taskType")
    public String taskType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListManualTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManualTasksRequest self = new ListManualTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListManualTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListManualTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListManualTasksRequest setSearchVal(String searchVal) {
        this.searchVal = searchVal;
        return this;
    }
    public String getSearchVal() {
        return this.searchVal;
    }

    public ListManualTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListManualTasksRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
