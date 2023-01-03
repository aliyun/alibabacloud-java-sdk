// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    // The end of the time range to query. Unit: milliseconds.
    // 
    // > If the ID of the trace is 30 characters in length, this parameter is optional. Otherwise, this parameter is required.
    @NameInMap("EndTime")
    public Long endTime;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The beginning of the time range to query. Unit: milliseconds.
    // 
    // > If the ID of the trace is 30 characters in length, this parameter is optional. Otherwise, this parameter is required.
    @NameInMap("StartTime")
    public Long startTime;

    // The ID of the trace. You can log on to the ARMS console and obtain the trace ID on the **Trace Query** page or **Interface Snapshot** tab.
    @NameInMap("TraceID")
    public String traceID;

    public static GetTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceRequest self = new GetTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetTraceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTraceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetTraceRequest setTraceID(String traceID) {
        this.traceID = traceID;
        return this;
    }
    public String getTraceID() {
        return this.traceID;
    }

}
