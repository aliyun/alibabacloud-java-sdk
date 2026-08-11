// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppTraceDetailRequest extends TeaModel {
    /**
     * <p>The AI application ID that identifies a specific AI application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02 16:08:38</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 16:08:38</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The trace ID used to track and correlate a specific request chain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetAiAppTraceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppTraceDetailRequest self = new GetAiAppTraceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAiAppTraceDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppTraceDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAiAppTraceDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAiAppTraceDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetAiAppTraceDetailRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
