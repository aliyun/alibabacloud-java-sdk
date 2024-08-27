// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForServiceGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-09-30</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>A服务组</p>
     */
    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    /**
     * <strong>example:</strong>
     * <p>2021-09-09</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ListDataReportForServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataReportForServiceGroupRequest self = new ListDataReportForServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDataReportForServiceGroupRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListDataReportForServiceGroupRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataReportForServiceGroupRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataReportForServiceGroupRequest setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
        return this;
    }
    public String getServiceGroupName() {
        return this.serviceGroupName;
    }

    public ListDataReportForServiceGroupRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
