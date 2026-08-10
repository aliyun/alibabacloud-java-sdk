// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageRequest extends TeaModel {
    /**
     * <p>The start time of the query time range. The value is a UNIX timestamp in seconds. The recommended interval length is no longer than one month.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The current Data Management unit.</p>
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
    public Long endTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDataAgentTaskModelUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageRequest self = new GetDataAgentTaskModelUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDataAgentTaskModelUsageRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public GetDataAgentTaskModelUsageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDataAgentTaskModelUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
