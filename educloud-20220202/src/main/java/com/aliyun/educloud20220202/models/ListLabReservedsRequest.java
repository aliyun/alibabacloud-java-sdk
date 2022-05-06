// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabReservedsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("LabName")
    public String labName;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListLabReservedsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabReservedsRequest self = new ListLabReservedsRequest();
        return TeaModel.build(map, self);
    }

    public ListLabReservedsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListLabReservedsRequest setLabName(String labName) {
        this.labName = labName;
        return this;
    }
    public String getLabName() {
        return this.labName;
    }

    public ListLabReservedsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListLabReservedsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLabReservedsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
