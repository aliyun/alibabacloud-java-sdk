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
    public java.util.List<CreateActionPlanRequestRegions> regions;

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
    public java.util.List<CreateActionPlanRequestResources> resources;

    /**
     * <p>The script to run the job. The script must be Base64-encoded.</p>
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
         * <p>A list of security groups that are available for the execution plan in the region. You can specify 0 to 5 security groups.</p>
         */
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        /**
         * <p>A list of security group IDs. You can call the <a href="https://api.aliyun.com/document/Ecs/2014-05-26/DescribeSecurityGroups">DescribeSecurityGroups</a> operation to query information about available security groups.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>A list of vSwitches that are available for the execution plan in the region. You can specify 0 to 5 vSwitches.</p>
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
         * <p>The number of vCPUs for the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Double cores;

        /**
         * <p>The memory size of the runtime environment. Unit: GiB.</p>
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
