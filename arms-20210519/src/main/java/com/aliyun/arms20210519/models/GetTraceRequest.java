// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    @NameInMap("TraceID")
    public String traceID;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static GetTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceRequest self = new GetTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceRequest setTraceID(String traceID) {
        this.traceID = traceID;
        return this;
    }
    public String getTraceID() {
        return this.traceID;
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

    public GetTraceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
