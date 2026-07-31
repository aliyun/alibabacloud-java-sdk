// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupRequest extends TeaModel {
    @NameInMap("AtmConfig")
    public ModifyDBResourceGroupRequestAtmConfig atmConfig;

    /**
     * <p>The idle duration after which the resource group is automatically stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("AutoStopInterval")
    public String autoStopInterval;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ClusterSizeResource")
    public String clusterSizeResource;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Data Lakehouse Edition, Enterprise Edition, or Basic Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the spot instance feature for the resource group. This feature provides resources at a lower unit price, but they can be reclaimed at any time. Only <code>Job</code> resource groups support this feature. Valid values:</p>
     * <ul>
     * <li><p><strong>True</strong>: enables the spot instance feature.</p>
     * </li>
     * <li><p><strong>False</strong>: disables the spot instance feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableSpot")
    public Boolean enableSpot;

    /**
     * <p>The engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;spark.adb.version\&quot;:\&quot;3.5\&quot;}</p>
     */
    @NameInMap("EngineParams")
    public java.util.Map<String, ?> engineParams;

    /**
     * <p>The time-based scaling plan for GPUs.</p>
     */
    @NameInMap("GpuElasticPlan")
    public ModifyDBResourceGroupRequestGpuElasticPlan gpuElasticPlan;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the resource group name for a specific cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li><p><strong>Interactive</strong></p>
     * </li>
     * <li><p><strong>Job</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about resource groups in Data Lakehouse Edition clusters, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Interactive</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("MaxClusterCount")
    public Integer maxClusterCount;

    /**
     * <p>The maximum amount of reserved computing resources. The value cannot exceed the unallocated computing resources of the cluster.</p>
     * <ul>
     * <li><p>If the resource group type is <code>Interactive</code>, the value is specified in increments of 16 ACU.</p>
     * </li>
     * <li><p>If the resource group type is <code>Job</code>, the value is specified in increments of 8 ACU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>48ACU</p>
     */
    @NameInMap("MaxComputeResource")
    public String maxComputeResource;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("MaxGpuQuantity")
    public Integer maxGpuQuantity;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("MinClusterCount")
    public Integer minClusterCount;

    /**
     * <p>The minimum amount of reserved computing resources.</p>
     * <ul>
     * <li><p>If the resource group type is <code>Interactive</code>, the minimum amount of reserved computing resources is 16 ACU.</p>
     * </li>
     * <li><p>If the resource group type is <code>Job</code>, the minimum amount of reserved computing resources is 0 ACU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0ACU</p>
     */
    @NameInMap("MinComputeResource")
    public String minComputeResource;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("MinGpuQuantity")
    public Integer minGpuQuantity;

    /**
     * <p>The Ray configuration. This parameter is required if the resource group is an AI group and uses a Ray cluster as its engine.</p>
     */
    @NameInMap("RayConfig")
    public ModifyDBResourceGroupRequestRayConfig rayConfig;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The job submission rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ModifyDBResourceGroupRequestRules> rules;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("SpecName")
    public String specName;

    /**
     * <p>The desired state of the resource group. Specify <strong>starting</strong> to start the resource group or <strong>stopping</strong> to stop it.</p>
     * 
     * <strong>example:</strong>
     * <p>starting</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter. Not applicable.</p>
     */
    @NameInMap("TargetResourceGroupName")
    public String targetResourceGroupName;

    public static ModifyDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupRequest self = new ModifyDBResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourceGroupRequest setAtmConfig(ModifyDBResourceGroupRequestAtmConfig atmConfig) {
        this.atmConfig = atmConfig;
        return this;
    }
    public ModifyDBResourceGroupRequestAtmConfig getAtmConfig() {
        return this.atmConfig;
    }

    public ModifyDBResourceGroupRequest setAutoStopInterval(String autoStopInterval) {
        this.autoStopInterval = autoStopInterval;
        return this;
    }
    public String getAutoStopInterval() {
        return this.autoStopInterval;
    }

    public ModifyDBResourceGroupRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public ModifyDBResourceGroupRequest setClusterSizeResource(String clusterSizeResource) {
        this.clusterSizeResource = clusterSizeResource;
        return this;
    }
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    public ModifyDBResourceGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBResourceGroupRequest setEnableSpot(Boolean enableSpot) {
        this.enableSpot = enableSpot;
        return this;
    }
    public Boolean getEnableSpot() {
        return this.enableSpot;
    }

    public ModifyDBResourceGroupRequest setEngineParams(java.util.Map<String, ?> engineParams) {
        this.engineParams = engineParams;
        return this;
    }
    public java.util.Map<String, ?> getEngineParams() {
        return this.engineParams;
    }

    public ModifyDBResourceGroupRequest setGpuElasticPlan(ModifyDBResourceGroupRequestGpuElasticPlan gpuElasticPlan) {
        this.gpuElasticPlan = gpuElasticPlan;
        return this;
    }
    public ModifyDBResourceGroupRequestGpuElasticPlan getGpuElasticPlan() {
        return this.gpuElasticPlan;
    }

    public ModifyDBResourceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDBResourceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ModifyDBResourceGroupRequest setMaxClusterCount(Integer maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public ModifyDBResourceGroupRequest setMaxComputeResource(String maxComputeResource) {
        this.maxComputeResource = maxComputeResource;
        return this;
    }
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    public ModifyDBResourceGroupRequest setMaxGpuQuantity(Integer maxGpuQuantity) {
        this.maxGpuQuantity = maxGpuQuantity;
        return this;
    }
    public Integer getMaxGpuQuantity() {
        return this.maxGpuQuantity;
    }

    public ModifyDBResourceGroupRequest setMinClusterCount(Integer minClusterCount) {
        this.minClusterCount = minClusterCount;
        return this;
    }
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    public ModifyDBResourceGroupRequest setMinComputeResource(String minComputeResource) {
        this.minComputeResource = minComputeResource;
        return this;
    }
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public ModifyDBResourceGroupRequest setMinGpuQuantity(Integer minGpuQuantity) {
        this.minGpuQuantity = minGpuQuantity;
        return this;
    }
    public Integer getMinGpuQuantity() {
        return this.minGpuQuantity;
    }

    public ModifyDBResourceGroupRequest setRayConfig(ModifyDBResourceGroupRequestRayConfig rayConfig) {
        this.rayConfig = rayConfig;
        return this;
    }
    public ModifyDBResourceGroupRequestRayConfig getRayConfig() {
        return this.rayConfig;
    }

    public ModifyDBResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBResourceGroupRequest setRules(java.util.List<ModifyDBResourceGroupRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ModifyDBResourceGroupRequestRules> getRules() {
        return this.rules;
    }

    public ModifyDBResourceGroupRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public ModifyDBResourceGroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyDBResourceGroupRequest setTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }
    public String getTargetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    public static class ModifyDBResourceGroupRequestAtmConfig extends TeaModel {
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

        public static ModifyDBResourceGroupRequestAtmConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestAtmConfig self = new ModifyDBResourceGroupRequestAtmConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestAtmConfig setAuthNodeNum(Integer authNodeNum) {
            this.authNodeNum = authNodeNum;
            return this;
        }
        public Integer getAuthNodeNum() {
            return this.authNodeNum;
        }

        public ModifyDBResourceGroupRequestAtmConfig setAuthNodeSpec(String authNodeSpec) {
            this.authNodeSpec = authNodeSpec;
            return this;
        }
        public String getAuthNodeSpec() {
            return this.authNodeSpec;
        }

        public ModifyDBResourceGroupRequestAtmConfig setInsertNodeNum(Integer insertNodeNum) {
            this.insertNodeNum = insertNodeNum;
            return this;
        }
        public Integer getInsertNodeNum() {
            return this.insertNodeNum;
        }

        public ModifyDBResourceGroupRequestAtmConfig setInsertNodeSpec(String insertNodeSpec) {
            this.insertNodeSpec = insertNodeSpec;
            return this;
        }
        public String getInsertNodeSpec() {
            return this.insertNodeSpec;
        }

        public ModifyDBResourceGroupRequestAtmConfig setSelectNodeCacheSize(Integer selectNodeCacheSize) {
            this.selectNodeCacheSize = selectNodeCacheSize;
            return this;
        }
        public Integer getSelectNodeCacheSize() {
            return this.selectNodeCacheSize;
        }

        public ModifyDBResourceGroupRequestAtmConfig setSelectNodeNum(Integer selectNodeNum) {
            this.selectNodeNum = selectNodeNum;
            return this;
        }
        public Integer getSelectNodeNum() {
            return this.selectNodeNum;
        }

        public ModifyDBResourceGroupRequestAtmConfig setSelectNodeSpec(String selectNodeSpec) {
            this.selectNodeSpec = selectNodeSpec;
            return this;
        }
        public String getSelectNodeSpec() {
            return this.selectNodeSpec;
        }

        public ModifyDBResourceGroupRequestAtmConfig setStorageNodeDiskSize(Integer storageNodeDiskSize) {
            this.storageNodeDiskSize = storageNodeDiskSize;
            return this;
        }
        public Integer getStorageNodeDiskSize() {
            return this.storageNodeDiskSize;
        }

        public ModifyDBResourceGroupRequestAtmConfig setStorageNodeDiskType(String storageNodeDiskType) {
            this.storageNodeDiskType = storageNodeDiskType;
            return this;
        }
        public String getStorageNodeDiskType() {
            return this.storageNodeDiskType;
        }

        public ModifyDBResourceGroupRequestAtmConfig setStorageNodeNum(Integer storageNodeNum) {
            this.storageNodeNum = storageNodeNum;
            return this;
        }
        public Integer getStorageNodeNum() {
            return this.storageNodeNum;
        }

        public ModifyDBResourceGroupRequestAtmConfig setStorageNodeSpec(String storageNodeSpec) {
            this.storageNodeSpec = storageNodeSpec;
            return this;
        }
        public String getStorageNodeSpec() {
            return this.storageNodeSpec;
        }

    }

    public static class ModifyDBResourceGroupRequestGpuElasticPlanRules extends TeaModel {
        /**
         * <p>The end time of the scaling window, specified as a cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 3 * * ?</p>
         */
        @NameInMap("EndCronExpression")
        public String endCronExpression;

        /**
         * <p>The start time of the scaling window, specified as a cron expression. The duration between the start and end times must be at least one hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("StartCronExpression")
        public String startCronExpression;

        public static ModifyDBResourceGroupRequestGpuElasticPlanRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestGpuElasticPlanRules self = new ModifyDBResourceGroupRequestGpuElasticPlanRules();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestGpuElasticPlanRules setEndCronExpression(String endCronExpression) {
            this.endCronExpression = endCronExpression;
            return this;
        }
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        public ModifyDBResourceGroupRequestGpuElasticPlanRules setStartCronExpression(String startCronExpression) {
            this.startCronExpression = startCronExpression;
            return this;
        }
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

    }

    public static class ModifyDBResourceGroupRequestGpuElasticPlan extends TeaModel {
        /**
         * <p>Specifies whether to enable the scaling plan immediately upon creation.
         * Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The plan is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The plan is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>A list of rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ModifyDBResourceGroupRequestGpuElasticPlanRules> rules;

        public static ModifyDBResourceGroupRequestGpuElasticPlan build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestGpuElasticPlan self = new ModifyDBResourceGroupRequestGpuElasticPlan();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestGpuElasticPlan setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyDBResourceGroupRequestGpuElasticPlan setRules(java.util.List<ModifyDBResourceGroupRequestGpuElasticPlanRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ModifyDBResourceGroupRequestGpuElasticPlanRules> getRules() {
            return this.rules;
        }

    }

    public static class ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector extends TeaModel {
        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>lab2.10.0-ray2.43.0</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The inference engine.</p>
         * 
         * <strong>example:</strong>
         * <p>vLLM</p>
         */
        @NameInMap("InferenceEngine")
        public String inferenceEngine;

        /**
         * <p>The large language model (LLM).</p>
         * 
         * <strong>example:</strong>
         * <p>Deepseek-R1</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        public static ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector self = new ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector setInferenceEngine(String inferenceEngine) {
            this.inferenceEngine = inferenceEngine;
            return this;
        }
        public String getInferenceEngine() {
            return this.inferenceEngine;
        }

        public ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

    }

    public static class ModifyDBResourceGroupRequestRayConfigAppConfig extends TeaModel {
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>app01</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>IsaacLab</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The image configuration.</p>
         */
        @NameInMap("ImageSelector")
        public ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector imageSelector;

        public static ModifyDBResourceGroupRequestRayConfigAppConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestRayConfigAppConfig self = new ModifyDBResourceGroupRequestRayConfigAppConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestRayConfigAppConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ModifyDBResourceGroupRequestRayConfigAppConfig setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ModifyDBResourceGroupRequestRayConfigAppConfig setImageSelector(ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector imageSelector) {
            this.imageSelector = imageSelector;
            return this;
        }
        public ModifyDBResourceGroupRequestRayConfigAppConfigImageSelector getImageSelector() {
            return this.imageSelector;
        }

    }

    public static class ModifyDBResourceGroupRequestRayConfigStorageMounts extends TeaModel {
        /**
         * <p>The mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data01</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The storage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StorageId")
        public Long storageId;

        public static ModifyDBResourceGroupRequestRayConfigStorageMounts build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestRayConfigStorageMounts self = new ModifyDBResourceGroupRequestRayConfigStorageMounts();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestRayConfigStorageMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ModifyDBResourceGroupRequestRayConfigStorageMounts setStorageId(Long storageId) {
            this.storageId = storageId;
            return this;
        }
        public Long getStorageId() {
            return this.storageId;
        }

    }

    public static class ModifyDBResourceGroupRequestRayConfigWorkerGroups extends TeaModel {
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
         * <p>The maximum number of worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        /**
         * <p>The minimum number of worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        /**
         * <p>The disk size of a worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <p>The specifications of a worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <p>The resource type of a worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("WorkerSpecType")
        public String workerSpecType;

        public static ModifyDBResourceGroupRequestRayConfigWorkerGroups build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestRayConfigWorkerGroups self = new ModifyDBResourceGroupRequestRayConfigWorkerGroups();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setMaxWorkerQuantity(Integer maxWorkerQuantity) {
            this.maxWorkerQuantity = maxWorkerQuantity;
            return this;
        }
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setMinWorkerQuantity(Integer minWorkerQuantity) {
            this.minWorkerQuantity = minWorkerQuantity;
            return this;
        }
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setWorkerDiskCapacity(String workerDiskCapacity) {
            this.workerDiskCapacity = workerDiskCapacity;
            return this;
        }
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public ModifyDBResourceGroupRequestRayConfigWorkerGroups setWorkerSpecType(String workerSpecType) {
            this.workerSpecType = workerSpecType;
            return this;
        }
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

    }

    public static class ModifyDBResourceGroupRequestRayConfig extends TeaModel {
        /**
         * <p>The Ray application configuration.</p>
         */
        @NameInMap("AppConfig")
        public ModifyDBResourceGroupRequestRayConfigAppConfig appConfig;

        /**
         * <p>The type of the Ray cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>BASIC</strong>: A basic, non-high-availability cluster.</p>
         * </li>
         * <li><p><strong>HIGH_AVAILABILITY</strong>: A high-availability cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to enable the ENI.</p>
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
         * <p>The specifications of the head node.</p>
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

        /**
         * <p>A list of storage mounts.</p>
         */
        @NameInMap("StorageMounts")
        public java.util.List<ModifyDBResourceGroupRequestRayConfigStorageMounts> storageMounts;

        @NameInMap("UserDefinedRequirements")
        public String userDefinedRequirements;

        /**
         * <p>A list of configurations for Ray worker groups.</p>
         */
        @NameInMap("WorkerGroups")
        public java.util.List<ModifyDBResourceGroupRequestRayConfigWorkerGroups> workerGroups;

        public static ModifyDBResourceGroupRequestRayConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestRayConfig self = new ModifyDBResourceGroupRequestRayConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestRayConfig setAppConfig(ModifyDBResourceGroupRequestRayConfigAppConfig appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public ModifyDBResourceGroupRequestRayConfigAppConfig getAppConfig() {
            return this.appConfig;
        }

        public ModifyDBResourceGroupRequestRayConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyDBResourceGroupRequestRayConfig setEnableUserEni(Boolean enableUserEni) {
            this.enableUserEni = enableUserEni;
            return this;
        }
        public Boolean getEnableUserEni() {
            return this.enableUserEni;
        }

        public ModifyDBResourceGroupRequestRayConfig setHeadAllocateUnit(String headAllocateUnit) {
            this.headAllocateUnit = headAllocateUnit;
            return this;
        }
        public String getHeadAllocateUnit() {
            return this.headAllocateUnit;
        }

        public ModifyDBResourceGroupRequestRayConfig setHeadDiskCapacity(String headDiskCapacity) {
            this.headDiskCapacity = headDiskCapacity;
            return this;
        }
        public String getHeadDiskCapacity() {
            return this.headDiskCapacity;
        }

        public ModifyDBResourceGroupRequestRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public ModifyDBResourceGroupRequestRayConfig setHeadSpecType(String headSpecType) {
            this.headSpecType = headSpecType;
            return this;
        }
        public String getHeadSpecType() {
            return this.headSpecType;
        }

        public ModifyDBResourceGroupRequestRayConfig setStorageMounts(java.util.List<ModifyDBResourceGroupRequestRayConfigStorageMounts> storageMounts) {
            this.storageMounts = storageMounts;
            return this;
        }
        public java.util.List<ModifyDBResourceGroupRequestRayConfigStorageMounts> getStorageMounts() {
            return this.storageMounts;
        }

        public ModifyDBResourceGroupRequestRayConfig setUserDefinedRequirements(String userDefinedRequirements) {
            this.userDefinedRequirements = userDefinedRequirements;
            return this;
        }
        public String getUserDefinedRequirements() {
            return this.userDefinedRequirements;
        }

        public ModifyDBResourceGroupRequestRayConfig setWorkerGroups(java.util.List<ModifyDBResourceGroupRequestRayConfigWorkerGroups> workerGroups) {
            this.workerGroups = workerGroups;
            return this;
        }
        public java.util.List<ModifyDBResourceGroupRequestRayConfigWorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

    }

    public static class ModifyDBResourceGroupRequestRules extends TeaModel {
        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The query execution time threshold, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The name of the target resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static ModifyDBResourceGroupRequestRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBResourceGroupRequestRules self = new ModifyDBResourceGroupRequestRules();
            return TeaModel.build(map, self);
        }

        public ModifyDBResourceGroupRequestRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyDBResourceGroupRequestRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public ModifyDBResourceGroupRequestRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

}
