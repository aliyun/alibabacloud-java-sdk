// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

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

}
