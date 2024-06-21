// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <blockquote>
     * <p>If the ID of the trace is 30 characters in length, this parameter is optional. Otherwise, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1623827603000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * <blockquote>
     * <p>If the ID of the trace is 30 characters in length, this parameter is optional. Otherwise, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1623827602000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The trace ID. You can log on to the ARMS console and obtain the trace ID on the <strong>Trace Query</strong> page or <strong>Interface Snapshot</strong> tab.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac14001a15954493811405707d****</p>
     */
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
