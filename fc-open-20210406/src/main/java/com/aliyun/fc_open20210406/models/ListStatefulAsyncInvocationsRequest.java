// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsRequest extends TeaModel {
    /**
     * <ul>
     * <li>Specifies whether to return the invocationPayload parameter in the response. <strong>true</strong>: returns the <code>invocationPayload</code> parameter in the response.``</li>
     * <li><strong>false</strong>: does not return the <code>invocationPayload</code> parameter in the response.``</li>
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
     * <p>The name prefix of the asynchronous tasks. This parameter is used to limit the names of the returned asynchronous tasks. For example, if you set the <code>invocationidPrefix</code> parameter to <code>job</code>, the names of the returned invocations must start with <code>job</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abcxxx</p>
     */
    @NameInMap("invocationIdPrefix")
    public String invocationIdPrefix;

    /**
     * <p>The maximum number of asynchronous tasks to be returned. The default value is 20. Valid values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token required to obtain more results. You do not need to specify this parameter in the first call. If a NextToken value is returned by a previous call, more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0****be03f84eb48b699f0a4883</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The version or alias of the service to which the asynchronous task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The method that you want to use to sort the returned asynchronous tasks.</p>
     * <ul>
     * <li><strong>asc</strong>: the ascending order</li>
     * <li><strong>desc</strong>: the descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sortOrderByTime")
    public String sortOrderByTime;

    /**
     * <p>The start time of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("startedTimeBegin")
    public Long startedTimeBegin;

    /**
     * <p>The end time of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("startedTimeEnd")
    public Long startedTimeEnd;

    /**
     * <p>The state of the asynchronous task.</p>
     * <ul>
     * <li><strong>Enqueued</strong>: The asynchronous task is enqueued and is waiting to be executed.</li>
     * <li><strong>Succeeded</strong>: The invocation succeeded.</li>
     * <li><strong>Failed</strong>: The invocation failed.</li>
     * <li><strong>Running</strong>: The invocation is being executed.</li>
     * <li><strong>Stopped</strong>: The invocation was terminated.</li>
     * <li><strong>Stopping</strong>: The invocation is being terminated.</li>
     * <li><strong>Invalid</strong>: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.</li>
     * <li><strong>Expired</strong>: The maximum validity period of messages is specified for the asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period of messages elapsed.</li>
     * <li><strong>Retrying</strong>: The asynchronous task is being retried due to an execution error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static ListStatefulAsyncInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationsRequest self = new ListStatefulAsyncInvocationsRequest();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationsRequest setIncludePayload(Boolean includePayload) {
        this.includePayload = includePayload;
        return this;
    }
    public Boolean getIncludePayload() {
        return this.includePayload;
    }

    public ListStatefulAsyncInvocationsRequest setInvocationIdPrefix(String invocationIdPrefix) {
        this.invocationIdPrefix = invocationIdPrefix;
        return this;
    }
    public String getInvocationIdPrefix() {
        return this.invocationIdPrefix;
    }

    public ListStatefulAsyncInvocationsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListStatefulAsyncInvocationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStatefulAsyncInvocationsRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListStatefulAsyncInvocationsRequest setSortOrderByTime(String sortOrderByTime) {
        this.sortOrderByTime = sortOrderByTime;
        return this;
    }
    public String getSortOrderByTime() {
        return this.sortOrderByTime;
    }

    public ListStatefulAsyncInvocationsRequest setStartedTimeBegin(Long startedTimeBegin) {
        this.startedTimeBegin = startedTimeBegin;
        return this;
    }
    public Long getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    public ListStatefulAsyncInvocationsRequest setStartedTimeEnd(Long startedTimeEnd) {
        this.startedTimeEnd = startedTimeEnd;
        return this;
    }
    public Long getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    public ListStatefulAsyncInvocationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
