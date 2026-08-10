// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageMetricsRequest extends TeaModel {
    /**
     * <p>The start time of the query time range. The value is a UNIX timestamp in seconds. The recommended interval length is no longer than one month.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The end time of the query time range. The value is a UNIX timestamp in seconds. The recommended interval length is no longer than one month.</p>
     * 
     * <strong>example:</strong>
     * <p>1735747200</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDataAgentTaskModelUsageMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageMetricsRequest self = new GetDataAgentTaskModelUsageMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageMetricsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public GetDataAgentTaskModelUsageMetricsRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public GetDataAgentTaskModelUsageMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDataAgentTaskModelUsageMetricsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
