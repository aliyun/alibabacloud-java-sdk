// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateActionPlanRequest extends TeaModel {
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
    public java.util.List<CreateActionPlanRequestRegions> regions;

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
    public java.util.List<CreateActionPlanRequestResources> resources;

    /**
     * <p>The running-job script. Base64 encoding is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
     */
    @NameInMap("Script")
    public String script;

    public static CreateActionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActionPlanRequest self = new CreateActionPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateActionPlanRequest setActionPlanName(String actionPlanName) {
        this.actionPlanName = actionPlanName;
        return this;
    }
    public String getActionPlanName() {
        return this.actionPlanName;
    }

    public CreateActionPlanRequest setAllocationSpec(String allocationSpec) {
        this.allocationSpec = allocationSpec;
        return this;
    }
    public String getAllocationSpec() {
        return this.allocationSpec;
    }

    public CreateActionPlanRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateActionPlanRequest setDesiredCapacity(Double desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Double getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public CreateActionPlanRequest setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public CreateActionPlanRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateActionPlanRequest setPrologScript(String prologScript) {
        this.prologScript = prologScript;
        return this;
    }
    public String getPrologScript() {
        return this.prologScript;
    }

    public CreateActionPlanRequest setRegions(java.util.List<CreateActionPlanRequestRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<CreateActionPlanRequestRegions> getRegions() {
        return this.regions;
    }

    public CreateActionPlanRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateActionPlanRequest setResources(java.util.List<CreateActionPlanRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateActionPlanRequestResources> getResources() {
        return this.resources;
    }

    public CreateActionPlanRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public static class CreateActionPlanRequestRegions extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of security groups available for the execution plan in the region. You can have 0 to 5 security groups.</p>
         */
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The list of VSwitches available for the execution plan in the region. Supports 0 to 5 VSwitches.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static CreateActionPlanRequestRegions build(java.util.Map<String, ?> map) throws Exception {
            CreateActionPlanRequestRegions self = new CreateActionPlanRequestRegions();
            return TeaModel.build(map, self);
        }

        public CreateActionPlanRequestRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateActionPlanRequestRegions setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateActionPlanRequestRegions setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateActionPlanRequestRegions setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class CreateActionPlanRequestResources extends TeaModel {
        /**
         * <p>The number of CPUs in the running environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Double cores;

        /**
         * <p>The memory size of the running environment. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Double memory;

        public static CreateActionPlanRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateActionPlanRequestResources self = new CreateActionPlanRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateActionPlanRequestResources setCores(Double cores) {
            this.cores = cores;
            return this;
        }
        public Double getCores() {
            return this.cores;
        }

        public CreateActionPlanRequestResources setMemory(Double memory) {
            this.memory = memory;
            return this;
        }
        public Double getMemory() {
            return this.memory;
        }

    }

}
