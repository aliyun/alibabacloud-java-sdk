// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePlanMaintenanceWindowsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>pw-bp1jarob1aup7yvlrdt6</p>
     */
    @NameInMap("PlanWindowId")
    public String planWindowId;

    @NameInMap("PlanWindowName")
    public String planWindowName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-d85g5yocioezmdrll</p>
     */
    @NameInMap("TargetResourceGroupId")
    public String targetResourceGroupId;

    @NameInMap("TargetResourceTags")
    public String targetResourceTagsShrink;

    public static DescribePlanMaintenanceWindowsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanMaintenanceWindowsShrinkRequest self = new DescribePlanMaintenanceWindowsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setPlanWindowId(String planWindowId) {
        this.planWindowId = planWindowId;
        return this;
    }
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setPlanWindowName(String planWindowName) {
        this.planWindowName = planWindowName;
        return this;
    }
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    public DescribePlanMaintenanceWindowsShrinkRequest setTargetResourceTagsShrink(String targetResourceTagsShrink) {
        this.targetResourceTagsShrink = targetResourceTagsShrink;
        return this;
    }
    public String getTargetResourceTagsShrink() {
        return this.targetResourceTagsShrink;
    }

}
