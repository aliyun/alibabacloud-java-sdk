// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("AutoStopInterval")
    public String autoStopInterval;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("ClusterSizeResource")
    public String clusterSizeResource;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the spot instance feature for the resource group. After you enable the spot instance feature, you are charged for resources at a lower unit price but the resources are probably released. You can enable the spot instance feature only for job resource groups. Valid values:</p>
     * <ul>
     * <li><strong>True</strong></li>
     * <li><strong>False</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableSpot")
    public Boolean enableSpot;

    /**
     * <strong>example:</strong>
     * <p>SparkWarehouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;spark.adb.version\&quot;:\&quot;3.5\&quot;}</p>
     */
    @NameInMap("EngineParams")
    public java.util.Map<String, ?> engineParams;

    /**
     * <p>The name of the resource group.</p>
     * <ul>
     * <li>The name can be up to 255 characters in length.</li>
     * <li>The name must start with a letter or a digit.</li>
     * <li>The name can contain letters, digits, hyphens (<em>), and underscores (</em>).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li><strong>Interactive</strong></li>
     * <li><strong>Job</strong></li>
     * </ul>
     * <blockquote>
     * <p> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource group overview</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Job</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("MaxClusterCount")
    public Integer maxClusterCount;

    /**
     * <p>The maximum reserved computing resources.</p>
     * <ul>
     * <li>If GroupType is set to Interactive, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 16ACU.</li>
     * <li>If GroupType is set to Job, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 8ACU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>48ACU</p>
     */
    @NameInMap("MaxComputeResource")
    public String maxComputeResource;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("MaxGpuQuantity")
    public Integer maxGpuQuantity;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("MinClusterCount")
    public Integer minClusterCount;

    /**
     * <p>The minimum reserved computing resources.</p>
     * <ul>
     * <li>When GroupType is set to Interactive, set this parameter to 16ACU.</li>
     * <li>When GroupType is set to Job, set this parameter to 0ACU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0ACU</p>
     */
    @NameInMap("MinComputeResource")
    public String minComputeResource;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("MinGpuQuantity")
    public Integer minGpuQuantity;

    @NameInMap("RayConfig")
    public CreateDBResourceGroupRequestRayConfig rayConfig;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The job resubmission rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateDBResourceGroupRequestRules> rules;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("SpecName")
    public String specName;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("TargetResourceGroupName")
    public String targetResourceGroupName;

    public static CreateDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourceGroupRequest self = new CreateDBResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBResourceGroupRequest setAutoStopInterval(String autoStopInterval) {
        this.autoStopInterval = autoStopInterval;
        return this;
    }
    public String getAutoStopInterval() {
        return this.autoStopInterval;
    }

    public CreateDBResourceGroupRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public CreateDBResourceGroupRequest setClusterSizeResource(String clusterSizeResource) {
        this.clusterSizeResource = clusterSizeResource;
        return this;
    }
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    public CreateDBResourceGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBResourceGroupRequest setEnableSpot(Boolean enableSpot) {
        this.enableSpot = enableSpot;
        return this;
    }
    public Boolean getEnableSpot() {
        return this.enableSpot;
    }

    public CreateDBResourceGroupRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBResourceGroupRequest setEngineParams(java.util.Map<String, ?> engineParams) {
        this.engineParams = engineParams;
        return this;
    }
    public java.util.Map<String, ?> getEngineParams() {
        return this.engineParams;
    }

    public CreateDBResourceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDBResourceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateDBResourceGroupRequest setMaxClusterCount(Integer maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public CreateDBResourceGroupRequest setMaxComputeResource(String maxComputeResource) {
        this.maxComputeResource = maxComputeResource;
        return this;
    }
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    public CreateDBResourceGroupRequest setMaxGpuQuantity(Integer maxGpuQuantity) {
        this.maxGpuQuantity = maxGpuQuantity;
        return this;
    }
    public Integer getMaxGpuQuantity() {
        return this.maxGpuQuantity;
    }

    public CreateDBResourceGroupRequest setMinClusterCount(Integer minClusterCount) {
        this.minClusterCount = minClusterCount;
        return this;
    }
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    public CreateDBResourceGroupRequest setMinComputeResource(String minComputeResource) {
        this.minComputeResource = minComputeResource;
        return this;
    }
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public CreateDBResourceGroupRequest setMinGpuQuantity(Integer minGpuQuantity) {
        this.minGpuQuantity = minGpuQuantity;
        return this;
    }
    public Integer getMinGpuQuantity() {
        return this.minGpuQuantity;
    }

    public CreateDBResourceGroupRequest setRayConfig(CreateDBResourceGroupRequestRayConfig rayConfig) {
        this.rayConfig = rayConfig;
        return this;
    }
    public CreateDBResourceGroupRequestRayConfig getRayConfig() {
        return this.rayConfig;
    }

    public CreateDBResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBResourceGroupRequest setRules(java.util.List<CreateDBResourceGroupRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateDBResourceGroupRequestRules> getRules() {
        return this.rules;
    }

    public CreateDBResourceGroupRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateDBResourceGroupRequest setTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }
    public String getTargetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    public static class CreateDBResourceGroupRequestRayConfigWorkerGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        /**
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("WorkerSpecType")
        public String workerSpecType;

        public static CreateDBResourceGroupRequestRayConfigWorkerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResourceGroupRequestRayConfigWorkerGroups self = new CreateDBResourceGroupRequestRayConfigWorkerGroups();
            return TeaModel.build(map, self);
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setMaxWorkerQuantity(Integer maxWorkerQuantity) {
            this.maxWorkerQuantity = maxWorkerQuantity;
            return this;
        }
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setMinWorkerQuantity(Integer minWorkerQuantity) {
            this.minWorkerQuantity = minWorkerQuantity;
            return this;
        }
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setWorkerDiskCapacity(String workerDiskCapacity) {
            this.workerDiskCapacity = workerDiskCapacity;
            return this;
        }
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public CreateDBResourceGroupRequestRayConfigWorkerGroups setWorkerSpecType(String workerSpecType) {
            this.workerSpecType = workerSpecType;
            return this;
        }
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

    }

    public static class CreateDBResourceGroupRequestRayConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("HeadSpec")
        public String headSpec;

        @NameInMap("WorkerGroups")
        public java.util.List<CreateDBResourceGroupRequestRayConfigWorkerGroups> workerGroups;

        public static CreateDBResourceGroupRequestRayConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResourceGroupRequestRayConfig self = new CreateDBResourceGroupRequestRayConfig();
            return TeaModel.build(map, self);
        }

        public CreateDBResourceGroupRequestRayConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateDBResourceGroupRequestRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public CreateDBResourceGroupRequestRayConfig setWorkerGroups(java.util.List<CreateDBResourceGroupRequestRayConfigWorkerGroups> workerGroups) {
            this.workerGroups = workerGroups;
            return this;
        }
        public java.util.List<CreateDBResourceGroupRequestRayConfigWorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

    }

    public static class CreateDBResourceGroupRequestRules extends TeaModel {
        /**
         * <p>The name of the resource group.</p>
         * <ul>
         * <li>The name can be up to 255 characters in length.</li>
         * <li>The name must start with a letter or digit.</li>
         * <li>The name can contain letters, digits, hyphens (-), and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The execution duration of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The name of the resource group to which you want to resubmit the query job.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static CreateDBResourceGroupRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResourceGroupRequestRules self = new CreateDBResourceGroupRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateDBResourceGroupRequestRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateDBResourceGroupRequestRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public CreateDBResourceGroupRequestRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

}
