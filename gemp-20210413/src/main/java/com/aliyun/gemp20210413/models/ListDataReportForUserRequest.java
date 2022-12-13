// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForUserRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("startTime")
    public String startTime;

    public static ListDataReportForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataReportForUserRequest self = new ListDataReportForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListDataReportForUserRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListDataReportForUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataReportForUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataReportForUserRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
