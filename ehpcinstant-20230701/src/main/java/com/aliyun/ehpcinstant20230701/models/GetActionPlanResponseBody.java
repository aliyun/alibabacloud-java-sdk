// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetActionPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-hz036ubmx2qmw93k****</p>
     */
    @NameInMap("ActionPlanId")
    public String actionPlanId;

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
     * <p>The time when the execution plan was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-10 18:28:05</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The expected scale of resources for the execution plan. If the ResourceType parameter is set to VcpuCapacity, the execution plan is expected to have 10000 vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DesiredCapacity")
    public Float desiredCapacity;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("IntervalMinutes")
    public Integer intervalMinutes;

    /**
     * <p>The computing power level.</p>
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
    public java.util.List<GetActionPlanResponseBodyRegions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>The list of resource configurations of the execution plan runtime environment.</p>
     */
    @NameInMap("Resources")
    public java.util.List<GetActionPlanResponseBodyResources> resources;

    /**
     * <p>The status of the execution plan. The possible values are as follows:</p>
     * <ul>
     * <li>Active Instant tasks are dynamically managed only when the execution plan is in the Active state.</li>
     * <li>Inactive Instant tasks are no longer managed by execution plans in the Inactive state.</li>
     * <li>Deleting You cannot modify the parameters of an execution plan in this state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The size of the resources currently managed by the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCapacity")
    public Float totalCapacity;

    /**
     * <p>The time when the execution plan was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-10 18:28:05</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetActionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActionPlanResponseBody self = new GetActionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActionPlanResponseBody setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
        return this;
    }
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    public GetActionPlanResponseBody setActionPlanName(String actionPlanName) {
        this.actionPlanName = actionPlanName;
        return this;
    }
    public String getActionPlanName() {
        return this.actionPlanName;
    }

    public GetActionPlanResponseBody setAllocationSpec(String allocationSpec) {
        this.allocationSpec = allocationSpec;
        return this;
    }
    public String getAllocationSpec() {
        return this.allocationSpec;
    }

    public GetActionPlanResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetActionPlanResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetActionPlanResponseBody setDesiredCapacity(Float desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Float getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public GetActionPlanResponseBody setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public GetActionPlanResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetActionPlanResponseBody setPrologScript(String prologScript) {
        this.prologScript = prologScript;
        return this;
    }
    public String getPrologScript() {
        return this.prologScript;
    }

    public GetActionPlanResponseBody setRegions(java.util.List<GetActionPlanResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<GetActionPlanResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public GetActionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetActionPlanResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetActionPlanResponseBody setResources(java.util.List<GetActionPlanResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<GetActionPlanResponseBodyResources> getResources() {
        return this.resources;
    }

    public GetActionPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetActionPlanResponseBody setTotalCapacity(Float totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }
    public Float getTotalCapacity() {
        return this.totalCapacity;
    }

    public GetActionPlanResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetActionPlanResponseBodyRegions extends TeaModel {
        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of security groups available for the execution plan in the region.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The list of VSwitches available for the execution plan in the region.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static GetActionPlanResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            GetActionPlanResponseBodyRegions self = new GetActionPlanResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public GetActionPlanResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetActionPlanResponseBodyRegions setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public GetActionPlanResponseBodyRegions setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class GetActionPlanResponseBodyResources extends TeaModel {
        /**
         * <p>The number of CPUs in the running environment.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Cores")
        public Float cores;

        /**
         * <p>The memory size of the running environment. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Memory")
        public Float memory;

        public static GetActionPlanResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            GetActionPlanResponseBodyResources self = new GetActionPlanResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public GetActionPlanResponseBodyResources setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public GetActionPlanResponseBodyResources setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

}
