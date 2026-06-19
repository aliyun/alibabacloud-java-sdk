// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePlanMaintenanceWindowShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the O&amp;M window.</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("MinMaintenanceInterval")
    public Integer minMaintenanceInterval;

    /**
     * <p>The name of the O&amp;M window. You can specify a custom name. The name can be up to 200 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WIndowName</p>
     */
    @NameInMap("PlanWindowName")
    public String planWindowName;

    /**
     * <p>The region ID. You can call DescribeRegions to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The O&amp;M operations supported by the O&amp;M window.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    /**
     * <p>The resources on which the O&amp;M window takes effect.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetResource")
    public String targetResourceShrink;

    /**
     * <p>The recurring cycle of the O&amp;M window.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimePeriod")
    public String timePeriodShrink;

    public static CreatePlanMaintenanceWindowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanMaintenanceWindowShrinkRequest self = new CreatePlanMaintenanceWindowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlanMaintenanceWindowShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreatePlanMaintenanceWindowShrinkRequest setMinMaintenanceInterval(Integer minMaintenanceInterval) {
        this.minMaintenanceInterval = minMaintenanceInterval;
        return this;
    }
    public Integer getMinMaintenanceInterval() {
        return this.minMaintenanceInterval;
    }

    public CreatePlanMaintenanceWindowShrinkRequest setPlanWindowName(String planWindowName) {
        this.planWindowName = planWindowName;
        return this;
    }
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    public CreatePlanMaintenanceWindowShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePlanMaintenanceWindowShrinkRequest setSupportMaintenanceAction(String supportMaintenanceAction) {
        this.supportMaintenanceAction = supportMaintenanceAction;
        return this;
    }
    public String getSupportMaintenanceAction() {
        return this.supportMaintenanceAction;
    }

    public CreatePlanMaintenanceWindowShrinkRequest setTargetResourceShrink(String targetResourceShrink) {
        this.targetResourceShrink = targetResourceShrink;
        return this;
    }
    public String getTargetResourceShrink() {
        return this.targetResourceShrink;
    }

    public CreatePlanMaintenanceWindowShrinkRequest setTimePeriodShrink(String timePeriodShrink) {
        this.timePeriodShrink = timePeriodShrink;
        return this;
    }
    public String getTimePeriodShrink() {
        return this.timePeriodShrink;
    }

}
