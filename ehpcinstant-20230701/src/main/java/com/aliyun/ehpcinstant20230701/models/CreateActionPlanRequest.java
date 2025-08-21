// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateActionPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TestActionPlan</p>
     */
    @NameInMap("ActionPlanName")
    public String actionPlanName;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("AllocationSpec")
    public String allocationSpec;

    /**
     * <strong>example:</strong>
     * <p>ci-vm-rYfypJKwlN9Y</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DesiredCapacity")
    public Double desiredCapacity;

    /**
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <strong>example:</strong>
     * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
     */
    @NameInMap("PrologScript")
    public String prologScript;

    @NameInMap("Regions")
    public java.util.List<CreateActionPlanRequestRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>VCpuCapacity</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Resources")
    public java.util.List<CreateActionPlanRequestResources> resources;

    /**
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
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Double cores;

        /**
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
