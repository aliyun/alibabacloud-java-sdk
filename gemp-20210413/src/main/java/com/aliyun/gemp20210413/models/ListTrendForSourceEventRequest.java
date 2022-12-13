// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListTrendForSourceEventRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("timeUnit")
    public Long timeUnit;

    public static ListTrendForSourceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrendForSourceEventRequest self = new ListTrendForSourceEventRequest();
        return TeaModel.build(map, self);
    }

    public ListTrendForSourceEventRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTrendForSourceEventRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListTrendForSourceEventRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListTrendForSourceEventRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrendForSourceEventRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTrendForSourceEventRequest setTimeUnit(Long timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public Long getTimeUnit() {
        return this.timeUnit;
    }

}
