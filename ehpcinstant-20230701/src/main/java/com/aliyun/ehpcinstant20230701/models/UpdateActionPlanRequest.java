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
     * <p>The expected resource scale of the execution plan. If ResourceType is set to VcpuCapacity, this field indicates that the execution plan expects to maintain 10,000 vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DesiredCapacity")
    public Float desiredCapacity;

    /**
     * <p>Specifies whether to enable the execution plan. Valid values:</p>
     * <ul>
     * <li><p>true: Enables the execution plan.</p>
     * </li>
     * <li><p>false: Disables the execution plan.</p>
     * <blockquote>
     * <p>Notice: After the execution plan is disabled, already created Instant jobs are no longer automatically managed by the execution plan.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>The scheduling interval of the execution plan. Unit: minutes. Valid values: 10 to 10080. Default value: 60.</p>
     * 
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
