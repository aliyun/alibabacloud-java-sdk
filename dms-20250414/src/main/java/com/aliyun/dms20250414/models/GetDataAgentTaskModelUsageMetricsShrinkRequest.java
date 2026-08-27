// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageMetricsShrinkRequest extends TeaModel {
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

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("PayLevel")
    public String payLevel;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDataAgentTaskModelUsageMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageMetricsShrinkRequest self = new GetDataAgentTaskModelUsageMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageMetricsShrinkRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public GetDataAgentTaskModelUsageMetricsShrinkRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public GetDataAgentTaskModelUsageMetricsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDataAgentTaskModelUsageMetricsShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public GetDataAgentTaskModelUsageMetricsShrinkRequest setPayLevel(String payLevel) {
        this.payLevel = payLevel;
        return this;
    }
    public String getPayLevel() {
        return this.payLevel;
    }

    public GetDataAgentTaskModelUsageMetricsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
