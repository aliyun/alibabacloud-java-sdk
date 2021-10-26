// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsRequest extends TeaModel {
    @NameInMap("includePayload")
    public Boolean includePayload;

    @NameInMap("invocationIdPrefix")
    public String invocationIdPrefix;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("sortOrderByTime")
    public String sortOrderByTime;

    @NameInMap("startedTimeBegin")
    public Long startedTimeBegin;

    @NameInMap("startedTimeEnd")
    public Long startedTimeEnd;

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
