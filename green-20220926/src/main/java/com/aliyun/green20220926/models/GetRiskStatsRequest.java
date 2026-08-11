// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetRiskStatsRequest extends TeaModel {
    /**
     * <p>The classification.</p>
     * 
     * <strong>example:</strong>
     * <p>guard-scene</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02 00:00:00</p>
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
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RealTime</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetRiskStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatsRequest self = new GetRiskStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskStatsRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public GetRiskStatsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRiskStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRiskStatsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetRiskStatsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
