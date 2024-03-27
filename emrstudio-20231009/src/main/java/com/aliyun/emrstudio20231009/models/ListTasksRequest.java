// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    @NameInMap("maxResults")
    public String maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("searchVal")
    public String searchVal;

    @NameInMap("taskType")
    public String taskType;

    @NameInMap("workflowId")
    public String workflowId;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksRequest setSearchVal(String searchVal) {
        this.searchVal = searchVal;
        return this;
    }
    public String getSearchVal() {
        return this.searchVal;
    }

    public ListTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListTasksRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public ListTasksRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
