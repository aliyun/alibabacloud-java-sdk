// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListTrendForSourceEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2020-10-10 23:59:59</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("instanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>INCIDENT</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2020-10-10 00:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
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
