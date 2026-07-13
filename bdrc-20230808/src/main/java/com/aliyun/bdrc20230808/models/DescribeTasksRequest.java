// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTasksRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. The valid range is 10 to 500. If this parameter is omitted or its value is less than 10, a default value of 10 is used. Values greater than 500 are treated as 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. To retrieve the next page of results, set this parameter to the <code>NextToken</code> value from the response of the previous API call. For more information, see the API description above.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies the status of tasks to query. If this parameter is omitted, the API returns tasks in all states. Valid values: <code>CREATED</code>, <code>RUNNING</code>, <code>COMPLETE</code>, <code>FAILED</code>, <code>EXPIRED</code>, and <code>CANCELED</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <strong>example:</strong>
     * <p>UPDATE_RESOURCES</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksRequest self = new DescribeTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
