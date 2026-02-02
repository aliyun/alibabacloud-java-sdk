// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePlanMaintenanceWindowShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetResource")
    public String targetResourceShrink;

    /**
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
