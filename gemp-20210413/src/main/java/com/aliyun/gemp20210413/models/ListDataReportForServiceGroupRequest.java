// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForServiceGroupRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("serviceGroupName")
    public String serviceGroupName;

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
