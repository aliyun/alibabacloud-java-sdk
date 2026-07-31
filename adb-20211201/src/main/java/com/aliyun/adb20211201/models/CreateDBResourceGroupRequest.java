// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupRequest extends TeaModel {
    @NameInMap("AtmConfig")
    public CreateDBResourceGroupRequestAtmConfig atmConfig;

    /**
     * <p>The automatic stop interval. Unit: minutes (m).</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("AutoStopInterval")
    public String autoStopInterval;

    /**
     * <p>The classification of the resource group. Valid values:</p>
     * <ul>
     * <li>SQL</li>
     * <li>SparkSQL</li>
     * <li>MultiCluster</li>
     * <li>AI</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("Classification")
    public String classification;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClusterSizeResource")
    public String clusterSizeResource;

    /**
     * <p>The ID of the Dedicated Edition, Basic Edition, or Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the spot instance feature for the resource group. After the spot instance feature is enabled, the unit price of resources is reduced, but the resources may be released. Only Job resource groups support this feature. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: enables the spot instance feature.</li>
     * <li><strong>False</strong>: disables the spot instance feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableSpot")
    public Boolean enableSpot;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
     * <li><strong>SparkWarehouse</strong>: the SparkWarehouse engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SparkWarehouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;spark.adb.version\&quot;:\&quot;3.5\&quot;}</p>
     */
    @NameInMap("EngineParams")
    public java.util.Map<String, ?> engineParams;

    /**
     * <p>The GPU time-sharing elastic plan.</p>
     */
    @NameInMap("GpuElasticPlan")
    public CreateDBResourceGroupRequestGpuElasticPlan gpuElasticPlan;

    /**
     * <p>The name of the resource group.</p>
     * <ul>
     * <li>The name can be up to 255 characters in length.</li>
     * <li>The name must start with a digit, an uppercase letter, or a lowercase letter.</li>
     * <li>The name can contain digits, uppercase letters, lowercase letters, hyphens (-), and underscores (_).</li>
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
     * <li><strong>Job</strong><blockquote>
     * <p>For more information about Data Lakehouse Edition resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource group overview (Data Lakehouse Edition)</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Job</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("MaxClusterCount")
    public Integer maxClusterCount;

    /**
     * <p>The maximum amount of reserved computing resources. Unit: ACUs.</p>
     * <ul>
     * <li>If the resource group type is Interactive, the maximum reserved computing resources is the current unallocated resources of the cluster, in increments of 16 ACUs.</li>
     * <li>If the resource group type is Job, the maximum reserved computing resources is the current unallocated resources of the cluster, in increments of 8 ACUs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>48ACU</p>
     */
    @NameInMap("MaxComputeResource")
    public String maxComputeResource;

    /**
     * <p>The maximum number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxGpuQuantity")
    public Integer maxGpuQuantity;

    /**
     * <p>A reserved parameter (not applicable).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("MinClusterCount")
    public Integer minClusterCount;

    /**
     * <p>The minimum amount of reserved computing resources. Unit: ACUs.</p>
     * <ul>
     * <li>If the resource group type is Interactive, the minimum reserved computing resources is 16 ACUs.</li>
     * <li>If the resource group type is Job, the minimum reserved computing resources is 0 ACUs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0ACU</p>
     */
    @NameInMap("MinComputeResource")
    public String minComputeResource;

    /**
     * <p>The minimum number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinGpuQuantity")
    public Integer minGpuQuantity;

    /**
     * <p>The Ray configuration.</p>
     * <blockquote>
     * <p>This parameter is required when the resource group is an AI resource group and the corresponding engine is RayCluster.</p>
     * </blockquote>
     */
    @NameInMap("RayConfig")
    public CreateDBResourceGroupRequestRayConfig rayConfig;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the region IDs of AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The job routing rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateDBResourceGroupRequestRules> rules;

    /**
     * <p>The scaling policy of the resource group. Valid values:</p>
     * <ul>
     * <li>AutoScaling: enables the AutoScaling automatic scaling policy.</li>
     * <li>Disable: disables automatic scaling.</li>
     * <li>MultiCluster: enables the MultiCluster automatic scaling policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoScaling</p>
     */
    @NameInMap("ScalePolicy")
    public String scalePolicy;

    /**
     * <p>The specification name.</p>
     * 
     * <strong>example:</strong>
     * <p>ADB.MLLarge.2</p>
     */
    @NameInMap("SpecName")
    public String specName;

    /**
     * <p>The name of the destination resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TargetResourceGroupName")
    public String targetResourceGroupName;

    public static CreateDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourceGroupRequest self = new CreateDBResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBResourceGroupRequest setAtmConfig(CreateDBResourceGroupRequestAtmConfig atmConfig) {
        this.atmConfig = atmConfig;
        return this;
    }
    public CreateDBResourceGroupRequestAtmConfig getAtmConfig() {
        return this.atmConfig;
    }

    public CreateDBResourceGroupRequest setAutoStopInterval(String autoStopInterval) {
        this.autoStopInterval = autoStopInterval;
        return this;
    }
    public String getAutoStopInterval() {
        return this.autoStopInterval;
    }

    public CreateDBResourceGroupRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
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

    public CreateDBResourceGroupRequest setGpuElasticPlan(CreateDBResourceGroupRequestGpuElasticPlan gpuElasticPlan) {
        this.gpuElasticPlan = gpuElasticPlan;
        return this;
    }
    public CreateDBResourceGroupRequestGpuElasticPlan getGpuElasticPlan() {
        return this.gpuElasticPlan;
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

    public CreateDBResourceGroupRequest setScalePolicy(String scalePolicy) {
        this.scalePolicy = scalePolicy;
        return this;
    }
    public String getScalePolicy() {
        return this.scalePolicy;
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

    public static class CreateDBResourceGroupRequestAtmConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AuthNodeNum")
        public Integer authNodeNum;

        /**
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("AuthNodeSpec")
        public String authNodeSpec;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InsertNodeNum")
        public Integer insertNodeNum;

        /**
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("InsertNodeSpec")
        public String insertNodeSpec;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SelectNodeCacheSize")
        public Integer selectNodeCacheSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SelectNodeNum")
        public Integer selectNodeNum;

        /**
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("SelectNodeSpec")
        public String selectNodeSpec;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StorageNodeDiskSize")
        public Integer storageNodeDiskSize;

        /**
         * <strong>example:</strong>
         * <p>essd_pl1</p>
         */
        @NameInMap("StorageNodeDiskType")
        public String storageNodeDiskType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageNodeNum")
        public Integer storageNodeNum;

        /**
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("StorageNodeSpec")
        public String storageNodeSpec;

        public static CreateDBResourceGroupRequestAtmConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResourceGroupRequestAtmConfig self = new CreateDBResourceGroupRequestAtmConfig();
            return TeaModel.build(map, self);
        }

        public CreateDBResourceGroupRequestAtmConfig setAuthNodeNum(Integer authNodeNum) {
            this.authNodeNum = authNodeNum;
            return this;
        }
        public Integer getAuthNodeNum() {
            return this.authNodeNum;
        }

        public CreateDBResourceGroupRequestAtmConfig setAuthNodeSpec(String authNodeSpec) {
            this.authNodeSpec = authNodeSpec;
            return this;
        }
        public String getAuthNodeSpec() {
            return this.authNodeSpec;
        }

        public CreateDBResourceGroupRequestAtmConfig setInsertNodeNum(Integer insertNodeNum) {
            this.insertNodeNum = insertNodeNum;
            return this;
        }
        public Integer getInsertNodeNum() {
            return this.insertNodeNum;
        }

        public CreateDBResourceGroupRequestAtmConfig setInsertNodeSpec(String insertNodeSpec) {
            this.insertNodeSpec = insertNodeSpec;
            return this;
        }
        public String getInsertNodeSpec() {
            return this.insertNodeSpec;
        }

        public CreateDBResourceGroupRequestAtmConfig setSelectNodeCacheSize(Integer selectNodeCacheSize) {
            this.selectNodeCacheSize = selectNodeCacheSize;
            return this;
        }
        public Integer getSelectNodeCacheSize() {
            return this.selectNodeCacheSize;
        }

        public CreateDBResourceGroupRequestAtmConfig setSelectNodeNum(Integer selectNodeNum) {
            this.selectNodeNum = selectNodeNum;
            return this;
        }
        public Integer getSelectNodeNum() {
            return this.selectNodeNum;
        }

        public CreateDBResourceGroupRequestAtmConfig setSelectNodeSpec(String selectNodeSpec) {
            this.selectNodeSpec = selectNodeSpec;
            return this;
        }
        public String getSelectNodeSpec() {
            return this.selectNodeSpec;
        }

        public CreateDBResourceGroupRequestAtmConfig setStorageNodeDiskSize(Integer storageNodeDiskSize) {
            this.storageNodeDiskSize = storageNodeDiskSize;
            return this;
        }
        public Integer getStorageNodeDiskSize() {
            return this.storageNodeDiskSize;
        }

        public CreateDBResourceGroupRequestAtmConfig setStorageNodeDiskType(String storageNodeDiskType) {
            this.storageNodeDiskType = storageNodeDiskType;
            return this;
        }
        public String getStorageNodeDiskType() {
            return this.storageNodeDiskType;
        }

        public CreateDBResourceGroupRequestAtmConfig setStorageNodeNum(Integer storageNodeNum) {
            this.storageNodeNum = storageNodeNum;
            return this;
        }
        public Integer getStorageNodeNum() {
            return this.storageNodeNum;
        }

        public CreateDBResourceGroupRequestAtmConfig setStorageNodeSpec(String storageNodeSpec) {
            this.storageNodeSpec = storageNodeSpec;
            return this;
        }
        public String getStorageNodeSpec() {
            return this.storageNodeSpec;
        }

    }

    public static class CreateDBResourceGroupRequestGpuElasticPlanRules extends TeaModel {
        /**
         * <p>The end time as a cron expression. The interval must be at least 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 3 * * ?</p>
         */
        @NameInMap("EndCronExpression")
        public String endCronExpression;

        /**
         * <p>The start time as a cron expression. The interval must be at least 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("StartCronExpression")
        public String startCronExpression;

        public static CreateDBResourceGroupRequestGpuElasticPlanRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResourceGroupRequestGpuElasticPlanRules self = new CreateDBResourceGroupRequestGpuElasticPlanRules();
            return TeaModel.build(map, self);
        }

        public CreateDBResourceGroupRequestGpuElasticPlanRules setEndCronExpression(String endCronExpression) {
            this.endCronExpression = endCronExpression;
            return this;
        }
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        public CreateDBResourceGroupRequestGpuElasticPlanRules setStartCronExpression(String startCronExpression) {
            this.startCronExpression = startCronExpression;
            return this;
        }
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

    }

    public static class CreateDBResourceGroupRequestGpuElasticPlan extends TeaModel {
        /**
         * <p>Specifies whether to enable the elastic plan immediately after creation. Valid values:</p>
         * <ul>
         * <li>true: enables the elastic plan immediately.</li>
         * <li>false: does not enable the elastic plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<CreateDBResourceGroupRequestGpuElasticPlanRules> rules;

        public static CreateDBResourceGroupRequestGpuElasticPlan build(java.util.Map<String, ?> map) throws Exception {
            CreateDBResourceGroupRequestGpuElasticPlan self = new CreateDBResourceGroupRequestGpuElasticPlan();
            return TeaModel.build(map, self);
        }

        public CreateDBResourceGroupRequestGpuElasticPlan setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateDBResourceGroupRequestGpuElasticPlan setRules(java.util.List<CreateDBResourceGroupRequestGpuElasticPlanRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateDBResourceGroupRequestGpuElasticPlanRules> getRules() {
            return this.rules;
        }

    }

    public static class CreateDBResourceGroupRequestRayConfigWorkerGroups extends TeaModel {
        /**
         * <p>The allocation unit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <p>The name of the worker group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The maximum number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        /**
         * <p>The minimum number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        /**
         * <p>The disk size of the worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <p>The node specifications of the worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <p>The resource type of the worker node.</p>
         * 
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
         * <p>The Ray cluster type. Valid values:</p>
         * <ul>
         * <li>BASIC: basic type, non-high-availability</li>
         * <li>HIGH_AVAILABILITY: high-availability type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to enable user ENI connectivity.</p>
         */
        @NameInMap("EnableUserEni")
        public Boolean enableUserEni;

        /**
         * <p>The allocation unit of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HeadAllocateUnit")
        public String headAllocateUnit;

        /**
         * <p>The disk size of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("HeadDiskCapacity")
        public String headDiskCapacity;

        /**
         * <p>The node specifications of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("HeadSpec")
        public String headSpec;

        /**
         * <p>The resource type of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("HeadSpecType")
        public String headSpecType;

        @NameInMap("UserDefinedRequirements")
        public String userDefinedRequirements;

        /**
         * <p>The list of Ray worker group configurations.</p>
         */
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

        public CreateDBResourceGroupRequestRayConfig setEnableUserEni(Boolean enableUserEni) {
            this.enableUserEni = enableUserEni;
            return this;
        }
        public Boolean getEnableUserEni() {
            return this.enableUserEni;
        }

        public CreateDBResourceGroupRequestRayConfig setHeadAllocateUnit(String headAllocateUnit) {
            this.headAllocateUnit = headAllocateUnit;
            return this;
        }
        public String getHeadAllocateUnit() {
            return this.headAllocateUnit;
        }

        public CreateDBResourceGroupRequestRayConfig setHeadDiskCapacity(String headDiskCapacity) {
            this.headDiskCapacity = headDiskCapacity;
            return this;
        }
        public String getHeadDiskCapacity() {
            return this.headDiskCapacity;
        }

        public CreateDBResourceGroupRequestRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public CreateDBResourceGroupRequestRayConfig setHeadSpecType(String headSpecType) {
            this.headSpecType = headSpecType;
            return this;
        }
        public String getHeadSpecType() {
            return this.headSpecType;
        }

        public CreateDBResourceGroupRequestRayConfig setUserDefinedRequirements(String userDefinedRequirements) {
            this.userDefinedRequirements = userDefinedRequirements;
            return this;
        }
        public String getUserDefinedRequirements() {
            return this.userDefinedRequirements;
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
         * <li>The name must start with a digit, an uppercase letter, or a lowercase letter.</li>
         * <li>The name can contain digits, uppercase letters, lowercase letters, hyphens (-), and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The query execution time threshold. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The name of the destination resource group.</p>
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
