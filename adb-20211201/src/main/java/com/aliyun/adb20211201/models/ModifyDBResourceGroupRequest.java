// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupRequest extends TeaModel {
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
     * <p>amv-bp1r053byu48p****</p>
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
     * <p>true</p>
     */
    @NameInMap("EnableSpot")
    public Boolean enableSpot;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;spark.adb.version\&quot;:\&quot;3.5\&quot;}</p>
     */
    @NameInMap("EngineParams")
    public java.util.Map<String, ?> engineParams;

    @NameInMap("GpuElasticPlan")
    public ModifyDBResourceGroupRequestGpuElasticPlan gpuElasticPlan;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the name of a resource group in a cluster.</p>
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
     * <li><strong>Interactive</strong></li>
     * <li><strong>Job</strong></li>
     * </ul>
     * <blockquote>
     * <p>For information about resource groups of Data Lakehouse Edition, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Interactive</p>
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
     * <p>The maximum amount of reserved computing resources.</p>
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
     * <p>The minimum amount of reserved computing resources.</p>
     * <ul>
     * <li>If the GroupType parameter is set to Interactive, set the value to 16ACU.</li>
     * <li>If GroupType is set to Job, set the value to 0ACU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0ACU</p>
     */
    @NameInMap("MinComputeResource")
    public String minComputeResource;

    @NameInMap("MinGpuQuantity")
    public Integer minGpuQuantity;

    @NameInMap("RayConfig")
    public ModifyDBResourceGroupRequestRayConfig rayConfig;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
    public java.util.List<ModifyDBResourceGroupRequestRules> rules;

    @NameInMap("SpecName")
    public String specName;

    /**
     * <strong>example:</strong>
     * <p>starting</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("TargetResourceGroupName")
    public String targetResourceGroupName;

    public static ModifyDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupRequest self = new ModifyDBResourceGroupRequest();
        return TeaModel.build(map, self);
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

    public static class ModifyDBResourceGroupRequestGpuElasticPlanRules extends TeaModel {
        @NameInMap("EndCronExpression")
        public String endCronExpression;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
         * <strong>example:</strong>
         * <p>lab2.10.0-ray2.43.0</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>vLLM</p>
         */
        @NameInMap("InferenceEngine")
        public String inferenceEngine;

        /**
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
         * <strong>example:</strong>
         * <p>app01</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>IsaacLab</p>
         */
        @NameInMap("AppType")
        public String appType;

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
         * <strong>example:</strong>
         * <p>/mnt/data01</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
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
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        @NameInMap("WorkerSpecName")
        public String workerSpecName;

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
        @NameInMap("AppConfig")
        public ModifyDBResourceGroupRequestRayConfigAppConfig appConfig;

        @NameInMap("Category")
        public String category;

        @NameInMap("EnableUserEni")
        public Boolean enableUserEni;

        @NameInMap("HeadAllocateUnit")
        public String headAllocateUnit;

        @NameInMap("HeadDiskCapacity")
        public String headDiskCapacity;

        @NameInMap("HeadSpec")
        public String headSpec;

        @NameInMap("HeadSpecType")
        public String headSpecType;

        @NameInMap("StorageMounts")
        public java.util.List<ModifyDBResourceGroupRequestRayConfigStorageMounts> storageMounts;

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
         * <p>The execution duration of the query. Unit: milliseconds.</p>
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
