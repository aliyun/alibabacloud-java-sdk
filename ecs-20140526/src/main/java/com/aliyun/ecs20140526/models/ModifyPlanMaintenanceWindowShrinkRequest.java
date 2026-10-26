// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPlanMaintenanceWindowShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the window. Leave this parameter empty if no modification is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The minimum time interval between the publish time and the scheduled time to execute scheduled O&amp;M events for the same instance. Valid values: 1 to 48. Unit: hours.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("MinMaintenanceInterval")
    public Integer minMaintenanceInterval;

    /**
     * <p>The ID of the O&amp;M window to be modified. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pw-bp1au1w8v8a1yer65g5k</p>
     */
    @NameInMap("PlanWindowId")
    public String planWindowId;

    /**
     * <p>The name of the O&amp;M window. Leave this parameter empty if no modification is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WIndowName</p>
     */
    @NameInMap("PlanWindowName")
    public String planWindowName;

    /**
     * <p>The region ID. This parameter is required for Alibaba Cloud SDK routing. However, specifying any region ID for this operation makes no difference. The O&amp;M window applies to all ECS instances across the network that meet the resource filtering conditions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The supported O&amp;M actions. Leave this parameter empty if no modification is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    /**
     * <p>The resources to which the O&amp;M window applies. Leave this parameter empty if no modification is required.</p>
     */
    @NameInMap("TargetResource")
    public String targetResourceShrink;

    /**
     * <p>The recurrence cycle of the window. Leave this parameter empty if no modification is required.</p>
     */
    @NameInMap("TimePeriod")
    public String timePeriodShrink;

    public static ModifyPlanMaintenanceWindowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlanMaintenanceWindowShrinkRequest self = new ModifyPlanMaintenanceWindowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setMinMaintenanceInterval(Integer minMaintenanceInterval) {
        this.minMaintenanceInterval = minMaintenanceInterval;
        return this;
    }
    public Integer getMinMaintenanceInterval() {
        return this.minMaintenanceInterval;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setPlanWindowId(String planWindowId) {
        this.planWindowId = planWindowId;
        return this;
    }
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setPlanWindowName(String planWindowName) {
        this.planWindowName = planWindowName;
        return this;
    }
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setSupportMaintenanceAction(String supportMaintenanceAction) {
        this.supportMaintenanceAction = supportMaintenanceAction;
        return this;
    }
    public String getSupportMaintenanceAction() {
        return this.supportMaintenanceAction;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setTargetResourceShrink(String targetResourceShrink) {
        this.targetResourceShrink = targetResourceShrink;
        return this;
    }
    public String getTargetResourceShrink() {
        return this.targetResourceShrink;
    }

    public ModifyPlanMaintenanceWindowShrinkRequest setTimePeriodShrink(String timePeriodShrink) {
        this.timePeriodShrink = timePeriodShrink;
        return this;
    }
    public String getTimePeriodShrink() {
        return this.timePeriodShrink;
    }

}
