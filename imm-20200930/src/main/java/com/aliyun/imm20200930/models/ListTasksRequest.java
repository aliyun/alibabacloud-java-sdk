// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The task end time range. You can specify this parameter to filter tasks that end within the specified range.</p>
     */
    @NameInMap("EndTimeRange")
    public TimeRange endTimeRange;

    /**
     * <p>The maximum number of results to return. Valid value range: (0, 100]. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token.</p>
     * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter. The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
     * <blockquote>
     * <p> Leave this parameter empty in your first call to the operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>asc: in ascending order. This is the default value.</li>
     * <li>desc: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Specifies whether to return request parameters in the initial request to create the task. Default value: False.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("RequestDefinition")
    public Boolean requestDefinition;

    /**
     * <p>The field used to sort the results by. Valid values:</p>
     * <ul>
     * <li>TaskId: sorts the results by task ID. This is the default sort field.</li>
     * <li>StartTime: sorts the results by task start time.</li>
     * <li>StartTime: sorts the results by task end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TaskId</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The task start time range. You can specify this parameter to filter tasks that start within the specified range.</p>
     */
    @NameInMap("StartTimeRange")
    public TimeRange startTimeRange;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Running: The task is running.</li>
     * <li>Succeeded: The task is successful.</li>
     * <li>Failed: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The custom tags of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>test=val1</p>
     */
    @NameInMap("TagSelector")
    public String tagSelector;

    /**
     * <p>The task types.</p>
     */
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
