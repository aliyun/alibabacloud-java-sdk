// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TraceIDs")
    public java.util.List<String> traceIDs;

    public static GetMultipleTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceRequest self = new GetMultipleTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetMultipleTraceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetMultipleTraceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMultipleTraceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetMultipleTraceRequest setTraceIDs(java.util.List<String> traceIDs) {
        this.traceIDs = traceIDs;
        return this;
    }
    public java.util.List<String> getTraceIDs() {
        return this.traceIDs;
    }

}
