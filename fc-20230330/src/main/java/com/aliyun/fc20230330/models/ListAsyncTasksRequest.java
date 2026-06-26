// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the input parameters of the asynchronous task.</p>
     * <ul>
     * <li><p>true: If this parameter is set to true, the <code>invocationPayload</code> field is returned.</p>
     * </li>
     * <li><p>false: If this parameter is set to false, the <code>invocationPayload</code> field is not returned.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The <code>invocationPayload</code> field specifies the input parameters of the function for the asynchronous task.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includePayload")
    public Boolean includePayload;

    /**
     * <p>The number of asynchronous tasks to return. The default value is 20. The value must be in the range of [1, 100].</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token to return more results. You do not need to provide this parameter for the first query. Obtain the token for a subsequent query from the response to the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The prefix of the asynchronous task ID. The system returns a list of asynchronous tasks that match the prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>job-</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The version or alias of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The sorting order of the returned asynchronous tasks.</p>
     * <ul>
     * <li><p>asc: ascending order</p>
     * </li>
     * <li><p>desc: descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrderByTime")
    public String sortOrderByTime;

    /**
     * <p>The start of the time range when the asynchronous task was started.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("startedTimeBegin")
    public Long startedTimeBegin;

    /**
     * <p>The end of the time range when the asynchronous task was started.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("startedTimeEnd")
    public Long startedTimeEnd;

    /**
     * <p>The execution status of the asynchronous task.</p>
     * <ul>
     * <li><p>Enqueued: The asynchronous message is enqueued and waits for processing.</p>
     * </li>
     * <li><p>Dequeued: The asynchronous message is dequeued and waits to be triggered.</p>
     * </li>
     * <li><p>Running: The invocation is in progress.</p>
     * </li>
     * <li><p>Succeeded: The invocation succeeded.</p>
     * </li>
     * <li><p>Failed: The invocation failed.</p>
     * </li>
     * <li><p>Stopped: The invocation was stopped.</p>
     * </li>
     * <li><p>Stopping: The invocation is being stopped.</p>
     * </li>
     * <li><p>Expired: The task was discarded because its configured maximum queuing duration was exceeded. The task was not executed.</p>
     * </li>
     * <li><p>Invalid: The execution is invalid because the function was deleted or for other reasons. The task was not executed.</p>
     * </li>
     * <li><p>Retrying: The asynchronous invocation is being retried because of an execution error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static ListAsyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksRequest self = new ListAsyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksRequest setIncludePayload(Boolean includePayload) {
        this.includePayload = includePayload;
        return this;
    }
    public Boolean getIncludePayload() {
        return this.includePayload;
    }

    public ListAsyncTasksRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAsyncTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAsyncTasksRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListAsyncTasksRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListAsyncTasksRequest setSortOrderByTime(String sortOrderByTime) {
        this.sortOrderByTime = sortOrderByTime;
        return this;
    }
    public String getSortOrderByTime() {
        return this.sortOrderByTime;
    }

    public ListAsyncTasksRequest setStartedTimeBegin(Long startedTimeBegin) {
        this.startedTimeBegin = startedTimeBegin;
        return this;
    }
    public Long getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    public ListAsyncTasksRequest setStartedTimeEnd(Long startedTimeEnd) {
        this.startedTimeEnd = startedTimeEnd;
        return this;
    }
    public Long getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    public ListAsyncTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
