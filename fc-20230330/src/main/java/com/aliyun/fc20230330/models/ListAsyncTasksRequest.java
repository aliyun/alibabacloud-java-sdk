// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether to return input parameters of the asynchronous tasks. Valid values:</p>
     * <ul>
     * <li>true: returns the <code>invocationPayload</code> parameter in the response.</li>
     * <li>false: does not return the <code>invocationPayload</code> parameter in the response.</li>
     * </ul>
     * <blockquote>
     * <p> The <code>invocationPayload</code> parameter indicates the input parameters of an asynchronous task.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includePayload")
    public Boolean includePayload;

    /**
     * <p>The number of asynchronous tasks to return. Valid values: [1,100]. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID prefix of asynchronous tasks. If this parameter is specified, a list of asynchronous tasks whose IDs match the prefix is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>job-</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The function version or alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The order in which the returned asynchronous tasks are sorted.</p>
     * <ul>
     * <li>asc: in ascending order.</li>
     * <li>desc: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrderByTime")
    public String sortOrderByTime;

    /**
     * <p>The start time of the period in which the asynchronous tasks are launched.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("startedTimeBegin")
    public Long startedTimeBegin;

    /**
     * <p>The end time of the period in which the asynchronous tasks are launched.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("startedTimeEnd")
    public Long startedTimeEnd;

    /**
     * <p>The state of asynchronous tasks. The following items list the states of an asynchronous task:</p>
     * <ul>
     * <li>Enqueued: The asynchronous invocation is enqueued and is waiting to be executed.</li>
     * <li>Succeeded: The invocation is successful.</li>
     * <li>Failed: The invocation fails.</li>
     * <li>Running: The invocation is being executed.</li>
     * <li>Stopped: The invocation is terminated.</li>
     * <li>Stopping: The invocation is being terminated.</li>
     * <li>Invalid: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.</li>
     * <li>Expired: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period has elapsed.</li>
     * <li>Retrying: The asynchronous invocation is being retried due to an execution error.</li>
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
