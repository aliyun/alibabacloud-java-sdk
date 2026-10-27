// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterEventsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return for a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set the value to the next_token value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The ID of the task to query.</p>
     * 
     * <strong>example:</strong>
     * <p>T-6823f946ffadbb0106****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static DescribeClusterEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterEventsRequest self = new DescribeClusterEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeClusterEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeClusterEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterEventsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
