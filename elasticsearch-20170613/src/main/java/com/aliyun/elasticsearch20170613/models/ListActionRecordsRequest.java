// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListActionRecordsRequest extends TeaModel {
    @NameInMap("actionNames")
    public String actionNames;

    @NameInMap("body")
    public String body;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("filter")
    public String filter;

    @NameInMap("page")
    public Integer page;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("size")
    public Integer size;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("userId")
    public String userId;

    public static ListActionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionRecordsRequest self = new ListActionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListActionRecordsRequest setActionNames(String actionNames) {
        this.actionNames = actionNames;
        return this;
    }
    public String getActionNames() {
        return this.actionNames;
    }

    public ListActionRecordsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListActionRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListActionRecordsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListActionRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListActionRecordsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionRecordsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListActionRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListActionRecordsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
