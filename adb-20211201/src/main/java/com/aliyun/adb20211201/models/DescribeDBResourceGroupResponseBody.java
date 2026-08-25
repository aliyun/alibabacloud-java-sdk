// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The list of resource group information.</p>
     */
    @NameInMap("GroupsInfo")
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A94B6C02-7BD4-5D67-9776-3AC8317E8DD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponseBody setGroupsInfo(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo) {
        this.groupsInfo = groupsInfo;
        return this;
    }
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    public DescribeDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig extends TeaModel {
        /**
         * <p>The number of authentication nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AuthNodeNum")
        public String authNodeNum;

        /**
         * <p>The authentication node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("AuthNodeSpec")
        public String authNodeSpec;

        /**
         * <p>The number of write nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InsertNodeNum")
        public String insertNodeNum;

        /**
         * <p>The write node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("InsertNodeSpec")
        public String insertNodeSpec;

        /**
         * <p>The cache size of query nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SelectNodeCacheSize")
        public String selectNodeCacheSize;

        /**
         * <p>The number of query nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SelectNodeNum")
        public String selectNodeNum;

        /**
         * <p>The query node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("SelectNodeSpec")
        public String selectNodeSpec;

        /**
         * <p>The disk size of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageNodeDiskSize")
        public String storageNodeDiskSize;

        /**
         * <p>The disk type of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>essd_pl1</p>
         */
        @NameInMap("StorageNodeDiskType")
        public String storageNodeDiskType;

        /**
         * <p>The number of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageNodeNum")
        public String storageNodeNum;

        /**
         * <p>The storage node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        @NameInMap("StorageNodeSpec")
        public String storageNodeSpec;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig self = new DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setAuthNodeNum(String authNodeNum) {
            this.authNodeNum = authNodeNum;
            return this;
        }
        public String getAuthNodeNum() {
            return this.authNodeNum;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setAuthNodeSpec(String authNodeSpec) {
            this.authNodeSpec = authNodeSpec;
            return this;
        }
        public String getAuthNodeSpec() {
            return this.authNodeSpec;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setInsertNodeNum(String insertNodeNum) {
            this.insertNodeNum = insertNodeNum;
            return this;
        }
        public String getInsertNodeNum() {
            return this.insertNodeNum;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setInsertNodeSpec(String insertNodeSpec) {
            this.insertNodeSpec = insertNodeSpec;
            return this;
        }
        public String getInsertNodeSpec() {
            return this.insertNodeSpec;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setSelectNodeCacheSize(String selectNodeCacheSize) {
            this.selectNodeCacheSize = selectNodeCacheSize;
            return this;
        }
        public String getSelectNodeCacheSize() {
            return this.selectNodeCacheSize;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setSelectNodeNum(String selectNodeNum) {
            this.selectNodeNum = selectNodeNum;
            return this;
        }
        public String getSelectNodeNum() {
            return this.selectNodeNum;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setSelectNodeSpec(String selectNodeSpec) {
            this.selectNodeSpec = selectNodeSpec;
            return this;
        }
        public String getSelectNodeSpec() {
            return this.selectNodeSpec;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setStorageNodeDiskSize(String storageNodeDiskSize) {
            this.storageNodeDiskSize = storageNodeDiskSize;
            return this;
        }
        public String getStorageNodeDiskSize() {
            return this.storageNodeDiskSize;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setStorageNodeDiskType(String storageNodeDiskType) {
            this.storageNodeDiskType = storageNodeDiskType;
            return this;
        }
        public String getStorageNodeDiskType() {
            return this.storageNodeDiskType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setStorageNodeNum(String storageNodeNum) {
            this.storageNodeNum = storageNodeNum;
            return this;
        }
        public String getStorageNodeNum() {
            return this.storageNodeNum;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig setStorageNodeSpec(String storageNodeSpec) {
            this.storageNodeSpec = storageNodeSpec;
            return this;
        }
        public String getStorageNodeSpec() {
            return this.storageNodeSpec;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules extends TeaModel {
        /**
         * <p>The end time in Cron expression format. The interval must be at least 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 3 * * ?</p>
         */
        @NameInMap("EndCronExpression")
        public String endCronExpression;

        /**
         * <p>The start time in Cron expression format. The interval must be at least 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("StartCronExpression")
        public String startCronExpression;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules self = new DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules setEndCronExpression(String endCronExpression) {
            this.endCronExpression = endCronExpression;
            return this;
        }
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules setStartCronExpression(String startCronExpression) {
            this.startCronExpression = startCronExpression;
            return this;
        }
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan extends TeaModel {
        /**
         * <p>Indicates whether the plan is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules> rules;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan self = new DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan setRules(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector extends TeaModel {
        /**
         * <p>The image.</p>
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
         * <p>The LLM model.</p>
         * 
         * <strong>example:</strong>
         * <p>Deepseek-R1</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector self = new DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector setInferenceEngine(String inferenceEngine) {
            this.inferenceEngine = inferenceEngine;
            return this;
        }
        public String getInferenceEngine() {
            return this.inferenceEngine;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig extends TeaModel {
        /**
         * <p>The Ray application name.</p>
         * 
         * <strong>example:</strong>
         * <p>app01</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The Ray application type.</p>
         * 
         * <strong>example:</strong>
         * <p>IsaacLab</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The image configuration.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ImageSelector")
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector imageSelector;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig self = new DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig setImageSelector(DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector imageSelector) {
            this.imageSelector = imageSelector;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfigImageSelector getImageSelector() {
            return this.imageSelector;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts extends TeaModel {
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

        @NameInMap("StorageName")
        public String storageName;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts self = new DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts setStorageId(Long storageId) {
            this.storageId = storageId;
            return this;
        }
        public Long getStorageId() {
            return this.storageId;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts setStorageName(String storageName) {
            this.storageName = storageName;
            return this;
        }
        public String getStorageName() {
            return this.storageName;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups extends TeaModel {
        /**
         * <p>The allocation unit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <p>The Ray worker group name.</p>
         * 
         * <strong>example:</strong>
         * <p>g01</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The maximum number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The disk capacity per worker.</p>
         * 
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <p>The worker specification name.</p>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <p>The Ray worker resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("WorkerSpecType")
        public String workerSpecType;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups self = new DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setMaxWorkerQuantity(Integer maxWorkerQuantity) {
            this.maxWorkerQuantity = maxWorkerQuantity;
            return this;
        }
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setMinWorkerQuantity(Integer minWorkerQuantity) {
            this.minWorkerQuantity = minWorkerQuantity;
            return this;
        }
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setWorkerDiskCapacity(String workerDiskCapacity) {
            this.workerDiskCapacity = workerDiskCapacity;
            return this;
        }
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups setWorkerSpecType(String workerSpecType) {
            this.workerSpecType = workerSpecType;
            return this;
        }
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig extends TeaModel {
        /**
         * <p>The Ray application configuration.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("AppConfig")
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig appConfig;

        /**
         * <p>The Ray cluster type. Valid values:</p>
         * <ul>
         * <li><p>BASIC: basic type, non-high-availability</p>
         * </li>
         * <li><p>HIGH_AVAILABILITY: high-availability type</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Indicates whether ENI is enabled.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
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
         * <p>The disk capacity of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>100Gi</p>
         */
        @NameInMap("HeadDiskCapacity")
        public String headDiskCapacity;

        /**
         * <p>The node specifications of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB.MLLarge.2</p>
         */
        @NameInMap("HeadSpec")
        public String headSpec;

        /**
         * <p>The resource type of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("HeadSpecType")
        public String headSpecType;

        /**
         * <p>The Ray cluster address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ray-cluster-address.example.com">http://ray-cluster-address.example.com</a></p>
         */
        @NameInMap("RayClusterAddress")
        public String rayClusterAddress;

        /**
         * <p>The Ray Dashboard address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ray-dashboard-address.example.com">http://ray-dashboard-address.example.com</a></p>
         */
        @NameInMap("RayDashboardAddress")
        public String rayDashboardAddress;

        /**
         * <p>The Ray Grafana address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ray-grafana-address.example.com">http://ray-grafana-address.example.com</a></p>
         */
        @NameInMap("RayGrafanaAddress")
        public String rayGrafanaAddress;

        /**
         * <p>The Ray Serve public address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4:8100</p>
         */
        @NameInMap("RayServePublicAddress")
        public String rayServePublicAddress;

        /**
         * <p>The list of storage mounts.</p>
         */
        @NameInMap("StorageMounts")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts> storageMounts;

        @NameInMap("UserDefinedRequirements")
        public String userDefinedRequirements;

        /**
         * <p>The list of Ray worker groups.</p>
         */
        @NameInMap("WorkerGroups")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups> workerGroups;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig self = new DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setAppConfig(DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig getAppConfig() {
            return this.appConfig;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setEnableUserEni(Boolean enableUserEni) {
            this.enableUserEni = enableUserEni;
            return this;
        }
        public Boolean getEnableUserEni() {
            return this.enableUserEni;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setHeadAllocateUnit(String headAllocateUnit) {
            this.headAllocateUnit = headAllocateUnit;
            return this;
        }
        public String getHeadAllocateUnit() {
            return this.headAllocateUnit;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setHeadDiskCapacity(String headDiskCapacity) {
            this.headDiskCapacity = headDiskCapacity;
            return this;
        }
        public String getHeadDiskCapacity() {
            return this.headDiskCapacity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setHeadSpecType(String headSpecType) {
            this.headSpecType = headSpecType;
            return this;
        }
        public String getHeadSpecType() {
            return this.headSpecType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setRayClusterAddress(String rayClusterAddress) {
            this.rayClusterAddress = rayClusterAddress;
            return this;
        }
        public String getRayClusterAddress() {
            return this.rayClusterAddress;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setRayDashboardAddress(String rayDashboardAddress) {
            this.rayDashboardAddress = rayDashboardAddress;
            return this;
        }
        public String getRayDashboardAddress() {
            return this.rayDashboardAddress;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setRayGrafanaAddress(String rayGrafanaAddress) {
            this.rayGrafanaAddress = rayGrafanaAddress;
            return this;
        }
        public String getRayGrafanaAddress() {
            return this.rayGrafanaAddress;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setRayServePublicAddress(String rayServePublicAddress) {
            this.rayServePublicAddress = rayServePublicAddress;
            return this;
        }
        public String getRayServePublicAddress() {
            return this.rayServePublicAddress;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setStorageMounts(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts> storageMounts) {
            this.storageMounts = storageMounts;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts> getStorageMounts() {
            return this.storageMounts;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setUserDefinedRequirements(String userDefinedRequirements) {
            this.userDefinedRequirements = userDefinedRequirements;
            return this;
        }
        public String getUserDefinedRequirements() {
            return this.userDefinedRequirements;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setWorkerGroups(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups> workerGroups) {
            this.workerGroups = workerGroups;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRules extends TeaModel {
        /**
         * <p>The resource group name.</p>
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

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRules self = new DescribeDBResourceGroupResponseBodyGroupsInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfo extends TeaModel {
        /**
         * <p>The PromQL resource group configuration.</p>
         */
        @NameInMap("AtmConfig")
        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig atmConfig;

        /**
         * <p>The automatic stop interval, in the format of a number followed by m (minutes). The value ranges from 0m or 5m to 10080m. A value of 0m indicates that automatic stop is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0m</p>
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
         * <p>A reserved parameter. Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("ClusterMode")
        public String clusterMode;

        /**
         * <p>A reserved parameter. Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("ClusterSizeResource")
        public String clusterSizeResource;

        /**
         * <p>The time when the resource group was created, in UTC. Format: <i>yyyy-MM-ddTHH:mm:ssZ</i>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-29T03:34:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The minimum elastic computing resources, in ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ElasticMinComputeResource")
        public String elasticMinComputeResource;

        /**
         * <p>Indicates whether the spot instance feature is enabled for the resource group. When the spot instance feature is enabled, the unit price of resources is reduced, but instances may be released. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: The spot instance feature is enabled.</li>
         * <li><strong>False</strong>: The spot instance feature is disabled.</li>
         * </ul>
         * <p>Only Job-type resource groups can be set to True.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnableSpot")
        public String enableSpot;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine parameters.</p>
         */
        @NameInMap("EngineParams")
        public java.util.Map<String, ?> engineParams;

        /**
         * <p>The GPU time-sharing elastic plan.</p>
         */
        @NameInMap("GpuElasticPlan")
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan gpuElasticPlan;

        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The resource group type. Valid values:</p>
         * <ul>
         * <li><strong>Interactive</strong></li>
         * <li><strong>Job</strong><blockquote>
         * <p>For more information about resource groups in Data Lakehouse Edition, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource group introduction (Data Lakehouse Edition)</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Job</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The Resource Access Management (RAM) users attached to the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>testb,testc</p>
         */
        @NameInMap("GroupUsers")
        public String groupUsers;

        /**
         * <p>A reserved parameter. Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("MaxClusterCount")
        public Integer maxClusterCount;

        /**
         * <p>The maximum reserved computing resources, in ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>512ACU</p>
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
         * <p>The job routing rule message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>A reserved parameter. Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("MinClusterCount")
        public Integer minClusterCount;

        /**
         * <p>The minimum reserved computing resources, in ACUs.</p>
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
         * <p>The Ray configuration information.</p>
         */
        @NameInMap("RayConfig")
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig rayConfig;

        /**
         * <p>The job routing rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules;

        /**
         * <p>A reserved parameter. Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

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
         * <p>The resource group status. Valid values:</p>
         * <ul>
         * <li><strong>creating</strong>: being created</li>
         * <li><strong>ok</strong>: created</li>
         * <li><strong>pendingdelete</strong>: pending deletion</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the target resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TargetResourceGroupName")
        public String targetResourceGroupName;

        /**
         * <p>The time when the resource group was last updated, in UTC. Format: <i>yyyy-MM-ddTHH:mm:ssZ</i>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T03:34:30Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDBResourceGroupResponseBodyGroupsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfo self = new DescribeDBResourceGroupResponseBodyGroupsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setAtmConfig(DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig atmConfig) {
            this.atmConfig = atmConfig;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoAtmConfig getAtmConfig() {
            return this.atmConfig;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setAutoStopInterval(String autoStopInterval) {
            this.autoStopInterval = autoStopInterval;
            return this;
        }
        public String getAutoStopInterval() {
            return this.autoStopInterval;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public String getClusterMode() {
            return this.clusterMode;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClusterSizeResource(String clusterSizeResource) {
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setElasticMinComputeResource(String elasticMinComputeResource) {
            this.elasticMinComputeResource = elasticMinComputeResource;
            return this;
        }
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEnableSpot(String enableSpot) {
            this.enableSpot = enableSpot;
            return this;
        }
        public String getEnableSpot() {
            return this.enableSpot;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEngineParams(java.util.Map<String, ?> engineParams) {
            this.engineParams = engineParams;
            return this;
        }
        public java.util.Map<String, ?> getEngineParams() {
            return this.engineParams;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGpuElasticPlan(DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan gpuElasticPlan) {
            this.gpuElasticPlan = gpuElasticPlan;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan getGpuElasticPlan() {
            return this.gpuElasticPlan;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupUsers(String groupUsers) {
            this.groupUsers = groupUsers;
            return this;
        }
        public String getGroupUsers() {
            return this.groupUsers;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxClusterCount(Integer maxClusterCount) {
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxGpuQuantity(Integer maxGpuQuantity) {
            this.maxGpuQuantity = maxGpuQuantity;
            return this;
        }
        public Integer getMaxGpuQuantity() {
            return this.maxGpuQuantity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinClusterCount(Integer minClusterCount) {
            this.minClusterCount = minClusterCount;
            return this;
        }
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinGpuQuantity(Integer minGpuQuantity) {
            this.minGpuQuantity = minGpuQuantity;
            return this;
        }
        public Integer getMinGpuQuantity() {
            return this.minGpuQuantity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRayConfig(DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig rayConfig) {
            this.rayConfig = rayConfig;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig getRayConfig() {
            return this.rayConfig;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRules(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> getRules() {
            return this.rules;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRunningClusterCount(Integer runningClusterCount) {
            this.runningClusterCount = runningClusterCount;
            return this;
        }
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setScalePolicy(String scalePolicy) {
            this.scalePolicy = scalePolicy;
            return this;
        }
        public String getScalePolicy() {
            return this.scalePolicy;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setTargetResourceGroupName(String targetResourceGroupName) {
            this.targetResourceGroupName = targetResourceGroupName;
            return this;
        }
        public String getTargetResourceGroupName() {
            return this.targetResourceGroupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
