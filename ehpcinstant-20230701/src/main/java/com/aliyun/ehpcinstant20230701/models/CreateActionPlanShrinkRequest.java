// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateActionPlanShrinkRequest extends TeaModel {
    /**
     * <p>The name of the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>TestActionPlan</p>
     */
    @NameInMap("ActionPlanName")
    public String actionPlanName;

    /**
     * <p>The resource type.</p>
     * <ul>
     * <li><p>Standard: Standard.</p>
     * </li>
     * <li><p>Dedicated: Dedicated. This type is available only to users in the whitelist.</p>
     * </li>
     * <li><p>Economic: Economy. This type is available only to users in the whitelist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("AllocationSpec")
    public String allocationSpec;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ci-vm-rYfypJKwlN9Y</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The desired size of the resource for the execution plan. For example, if you set ResourceType to VcpuCapacity, this parameter specifies the number of vCPUs that you want to maintain for the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DesiredCapacity")
    public Double desiredCapacity;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("IntervalMinutes")
    public Integer intervalMinutes;

    /**
     * <p>The computing power level. This parameter is valid only when you set AllocationSpec to Economic. The following types are supported:</p>
     * <ul>
     * <li><p>General: General-purpose.</p>
     * </li>
     * <li><p>Performance: Compute-optimized.</p>
     * </li>
     * </ul>
     * <p>Default value: General</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The pre-execution script. The script must be Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
     */
    @NameInMap("PrologScript")
    public String prologScript;

    /**
     * <p>A list of regional resource configurations for the runtime environment of the execution plan.</p>
     */
    @NameInMap("Regions")
    public String regionsShrink;

    /**
     * <p>The type of resource for the execution target. The value can be the vCPU capacity or the number of executor nodes. Valid values:</p>
     * <ul>
     * <li><p>VCpuCapacity: vCPU capacity</p>
     * </li>
     * <li><p>ExecutorCapacity: number of executor nodes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VCpuCapacity</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of resource configurations for the runtime environment of the execution plan. You can specify 1 to 10 resource configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Resources")
    public String resourcesShrink;

    /**
     * <p>The script to run the job. The script must be Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
     */
    @NameInMap("Script")
    public String script;

    public static CreateActionPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActionPlanShrinkRequest self = new CreateActionPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateActionPlanShrinkRequest setActionPlanName(String actionPlanName) {
        this.actionPlanName = actionPlanName;
        return this;
    }
    public String getActionPlanName() {
        return this.actionPlanName;
    }

    public CreateActionPlanShrinkRequest setAllocationSpec(String allocationSpec) {
        this.allocationSpec = allocationSpec;
        return this;
    }
    public String getAllocationSpec() {
        return this.allocationSpec;
    }

    public CreateActionPlanShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateActionPlanShrinkRequest setDesiredCapacity(Double desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Double getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public CreateActionPlanShrinkRequest setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public CreateActionPlanShrinkRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateActionPlanShrinkRequest setPrologScript(String prologScript) {
        this.prologScript = prologScript;
        return this;
    }
    public String getPrologScript() {
        return this.prologScript;
    }

    public CreateActionPlanShrinkRequest setRegionsShrink(String regionsShrink) {
        this.regionsShrink = regionsShrink;
        return this;
    }
    public String getRegionsShrink() {
        return this.regionsShrink;
    }

    public CreateActionPlanShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateActionPlanShrinkRequest setResourcesShrink(String resourcesShrink) {
        this.resourcesShrink = resourcesShrink;
        return this;
    }
    public String getResourcesShrink() {
        return this.resourcesShrink;
    }

    public CreateActionPlanShrinkRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
