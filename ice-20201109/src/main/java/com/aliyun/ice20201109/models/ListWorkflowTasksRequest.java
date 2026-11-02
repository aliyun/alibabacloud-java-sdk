// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListWorkflowTasksRequest extends TeaModel {
    /**
     * <p>The end time for the task creation time filter. Only the last 90 days are supported. Specify the time in ISO 8601 format in UTC (ending with Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-15T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>The file name or media asset ID. This parameter supports fuzzy match for TaskInput and has a maximum length of 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>7aa4cc4459ada8ef35f7</strong></strong></strong>
     * or
     * <strong>TestVideo</strong>*.flv</p>
     */
    @NameInMap("KeyText")
    public String keyText;

    /**
     * <p>The maximum number of media workflow task instances to return. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page in a continuous paging query. This parameter is not returned for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>****<strong><strong><strong><strong><strong>VRpbWUQARgBIpcBCgkA1bUtaAAAAAAKiQEDhAAAADFTMzg2NTY2NjU2MzM3NjU2NjYyMzkzMTYyMzI2MjYzNjY2</strong></strong></strong></strong></strong></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The start time for the task creation time filter. Only the last 90 days are supported. Specify the time in ISO 8601 format in UTC (ending with Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-12T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The ID of the workflow template. You can view the template ID in the <a href="https://ims.console.aliyun.com/settings/workflow/list">Intelligent Media Services console</a> by choosing Configuration Management &gt; Workflow Templates.</p>
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
