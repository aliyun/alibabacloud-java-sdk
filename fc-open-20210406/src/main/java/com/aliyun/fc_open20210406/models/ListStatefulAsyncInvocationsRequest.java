// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsRequest extends TeaModel {
    /**
     * <p>You can search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     */
    @NameInMap("includePayload")
    public Boolean includePayload;

    /**
     * <p>Alibaba Cloud provides SDKs for multiple programming languages to help you integrate Alibaba Cloud services by using APIs. We recommend that you use an SDK to call API operations. This frees you from manual signature verification.</p>
     */
    @NameInMap("invocationIdPrefix")
    public String invocationIdPrefix;

    /**
     * <p>The list of events that trigger the asynchronous task.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The ID of the instance that is used to run the asynchronous task.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The number of retries after the asynchronous task fails.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>StatefulAsyncInvocation: asynchronous task. Asynchronous tasks allow you to manage the states on the basis of common asynchronous invocations, which is more suitable for task scenarios.</p>
     */
    @NameInMap("sortOrderByTime")
    public String sortOrderByTime;

    /**
     * <p>The structure of the asynchronous task.</p>
     */
    @NameInMap("startedTimeBegin")
    public Long startedTimeBegin;

    /**
     * <p>The latest version of Function Compute API.</p>
     */
    @NameInMap("startedTimeEnd")
    public Long startedTimeEnd;

    /**
     * <p>The request ID of the asynchronous task.</p>
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
