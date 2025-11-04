// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListWorkflowTasksRequest extends TeaModel {
    /**
     * <p>The end of the time range for filtering tasks by their creation time. Supports querying data from the last 90 days only.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-15T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>A keyword for fuzzy matching against the TaskInput, such as a file name or Media ID. Max length: 32 characters.</p>
     */
    @NameInMap("KeyText")
    public String keyText;

    /**
     * <p>The maximum number of media workflow instances to return. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>****<strong><strong><strong><strong><strong>VRpbWUQARgBIpcBCgkA1bUtaAAAAAAKiQEDhAAAADFTMzg2NTY2NjU2MzM3NjU2NjYyMzkzMTYyMzI2MjYzNjY2</strong></strong></strong></strong></strong></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The start of the time range for filtering tasks by their creation time. Supports querying data from the last 90 days only.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-12T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The ID of the workflow template.<a href="https://ims.console.aliyun.com/settings/workflow/list"></a></p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>b4fb044839815d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    /**
     * <p>The name of the workflow template.</p>
     * 
     * <strong>example:</strong>
     * <p>example-workflow-****</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

    public static ListWorkflowTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTasksRequest self = new ListWorkflowTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTasksRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListWorkflowTasksRequest setKeyText(String keyText) {
        this.keyText = keyText;
        return this;
    }
    public String getKeyText() {
        return this.keyText;
    }

    public ListWorkflowTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowTasksRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListWorkflowTasksRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public ListWorkflowTasksRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
