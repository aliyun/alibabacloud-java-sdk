// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppTraceDetailRequest extends TeaModel {
    /**
     * <p>The ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
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
     * <p>The start time of the query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 16:08:38</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The trace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d3b7c9e2f1a4b8c9d0e1f2a3b4c5d6e</p>
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
