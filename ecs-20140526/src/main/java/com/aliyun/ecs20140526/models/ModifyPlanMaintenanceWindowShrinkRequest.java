// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPlanMaintenanceWindowShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pw-bp1au1w8v8a1yer65g5k</p>
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
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    @NameInMap("TargetResource")
    public String targetResourceShrink;

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
