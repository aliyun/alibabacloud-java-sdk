// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsRequest extends TeaModel {
    /**
     * <p>- **true**: returns the invocationPayload parameter in the response. </p>
     * <p>- **false**: does not return the invocationPayload parameter in the response. </p>
     * <br>
     * <p>> The `invocationPayload` parameter indicates the input parameters of an asynchronous task.</p>
     */
    @NameInMap("includePayload")
    public Boolean includePayload;

    /**
     * <p>The name prefix of the asynchronous invocation. The names of returned resources must contain the prefix. For example, if invocationidPrefix is set to job, the names of returned resources must start with job.</p>
     */
    @NameInMap("invocationIdPrefix")
    public String invocationIdPrefix;

    /**
     * <p>The maximum number of asynchronous invocations to return. Valid values: [1, 100]. Default value: 50.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token used to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The version or alias of the service to which the asynchronous task belongs.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The order in which the returned asynchronous invocations are sorted. Valid values:</p>
     * <br>
     * <p>- **asc**: in ascending order </p>
     * <p>- **desc**: in descending order</p>
     */
    @NameInMap("sortOrderByTime")
    public String sortOrderByTime;

    /**
     * <p>The start time of the asynchronous task.</p>
     */
    @NameInMap("startedTimeBegin")
    public Long startedTimeBegin;

    /**
     * <p>The end time of the asynchronous task.</p>
     */
    @NameInMap("startedTimeEnd")
    public Long startedTimeEnd;

    /**
     * <p>The status of the asynchronous task. </p>
     * <br>
     * <p>- **Enqueued**: The asynchronous invocation is enqueued and is waiting to be executed. </p>
     * <p>- **Succeeded**: The invocation is successful. </p>
     * <p>- **Failed**: The invocation fails. </p>
     * <p>- **Running**: The invocation is being executed. </p>
     * <p>- **Stopped**: The invocation is terminated. </p>
     * <p>- **Stopping**: The invocation is being terminated. </p>
     * <p>- **Invalid**: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted. </p>
     * <p>- **Expired**: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period of messages expires. </p>
     * <p>- **Retrying**: The asynchronous invocation is being retried due to an execution error.</p>
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
