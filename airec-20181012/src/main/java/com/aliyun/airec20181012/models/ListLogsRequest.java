// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListLogsRequest extends TeaModel {
    @NameInMap("QueryParams")
    public String queryParams;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    public static ListLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogsRequest self = new ListLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogsRequest setQueryParams(String queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public String getQueryParams() {
        return this.queryParams;
    }

    public ListLogsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ListLogsRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListLogsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
