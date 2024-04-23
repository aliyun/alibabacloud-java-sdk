// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncTasksRequest extends TeaModel {
    @NameInMap("includePayload")
    public Boolean includePayload;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("prefix")
    public String prefix;

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
