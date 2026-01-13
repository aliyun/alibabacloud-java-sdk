// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateActionPlanRequest extends TeaModel {
    /**
     * <p>The ID of the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-hz036ubmx2qmw93k****</p>
     */
    @NameInMap("ActionPlanId")
    public String actionPlanId;

    /**
     * <p>The expected scale of resources for the execution plan. If the ResourceType parameter is set to VcpuCapacity, the execution plan is expected to have 10000 vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DesiredCapacity")
    public Float desiredCapacity;

    /**
     * <p>Whether to enable the execution plan. Valid values:</p>
     * <ul>
     * <li><p>true: enables the execution plan.</p>
     * </li>
     * <li><p>false: The execution plan is disabled.</p>
     * <p>**</p>
     * <p><strong>Note:</strong> After an execution plan is disabled, the created Instant jobs are not automatically managed by the execution plan.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("IntervalMinutes")
    public Integer intervalMinutes;

    public static UpdateActionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateActionPlanRequest self = new UpdateActionPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateActionPlanRequest setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
        return this;
    }
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    public UpdateActionPlanRequest setDesiredCapacity(Float desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Float getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public UpdateActionPlanRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public UpdateActionPlanRequest setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

}
