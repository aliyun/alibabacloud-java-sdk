// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScansRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter or set it to an empty string for the first page. For subsequent pages, pass the nextToken value from the previous response without any modification. If the nextToken value in the response is empty, the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>running: Running.</li>
     * <li>completed: Completed.</li>
     * <li>failed: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The task name.</p>
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
