// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCallerReportRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("StopTime")
    public Long stopTime;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetHistoricalCallerReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalCallerReportRequest self = new GetHistoricalCallerReportRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoricalCallerReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHistoricalCallerReportRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public GetHistoricalCallerReportRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

    public GetHistoricalCallerReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
