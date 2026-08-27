// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageShrinkRequest extends TeaModel {
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

    public static GetDataAgentTaskModelUsageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageShrinkRequest self = new GetDataAgentTaskModelUsageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDataAgentTaskModelUsageShrinkRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public GetDataAgentTaskModelUsageShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDataAgentTaskModelUsageShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public GetDataAgentTaskModelUsageShrinkRequest setPayLevel(String payLevel) {
        this.payLevel = payLevel;
        return this;
    }
    public String getPayLevel() {
        return this.payLevel;
    }

    public GetDataAgentTaskModelUsageShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
