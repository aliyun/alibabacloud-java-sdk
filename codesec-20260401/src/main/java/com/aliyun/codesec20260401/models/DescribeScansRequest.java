// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScansRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. To query the first page, leave this parameter empty or do not specify it. To query subsequent pages, pass the nextToken value returned in the previous response. If the nextToken value in the response is empty, the last page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The query string. You can perform a fuzzy match by project name or prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li>running: The task is running.</li>
     * <li>completed: The task is completed.</li>
     * <li>failed: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static DescribeScansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScansRequest self = new DescribeScansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScansRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeScansRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScansRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeScansRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeScansRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
