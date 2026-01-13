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
     * <p>The type of the resource.</p>
     * <ul>
     * <li>Standard</li>
     * <li>Dedicated: You must enable a whitelist for use.</li>
     * <li>Economic: You must enable a whitelist for use.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("AllocationSpec")
    public String allocationSpec;

    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>ci-vm-rYfypJKwlN9Y</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The expected scale of resources for the execution plan. If the ResourceType parameter is set to VcpuCapacity, the execution plan is expected to have 10000 vCPUs.</p>
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
     * <p>The computing power level. This value is valid only when the resource type is Economic. The following disk categories are supported:</p>
     * <ul>
     * <li>General</li>
     * <li>Performance</li>
     * </ul>
     * <p>Default value: General</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The pre-processing script. Base64 encoding is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
     */
    @NameInMap("PrologScript")
    public String prologScript;

    /**
     * <p>The list of resource configurations in the region where the execution plan runs.</p>
     */
    @NameInMap("Regions")
    public String regionsShrink;

    /**
     * <p>Target resource type: the capacity of vCPUs or the number of execution nodes. Valid values:</p>
     * <ul>
     * <li>VCpuCapacity</li>
     * <li>ExecutorCapacity</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VCpuCapacity</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of resource configurations of the execution plan runtime environment. You can configure 1 to 10 resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Resources")
    public String resourcesShrink;

    /**
     * <p>The running-job script. Base64 encoding is required.</p>
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
