// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The queried resource groups.</p>
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

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlanRules extends TeaModel {
        @NameInMap("EndCronExpression")
        public String endCronExpression;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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

        /**
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

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigWorkerGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <strong>example:</strong>
         * <p>g01</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>large</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
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
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("AppConfig")
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigAppConfig appConfig;

        @NameInMap("Category")
        public String category;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="http://ray-cluster-address.example.com">http://ray-cluster-address.example.com</a></p>
         */
        @NameInMap("RayClusterAddress")
        public String rayClusterAddress;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ray-dashboard-address.example.com">http://ray-dashboard-address.example.com</a></p>
         */
        @NameInMap("RayDashboardAddress")
        public String rayDashboardAddress;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ray-grafana-address.example.com">http://ray-grafana-address.example.com</a></p>
         */
        @NameInMap("RayGrafanaAddress")
        public String rayGrafanaAddress;

        @NameInMap("StorageMounts")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts> storageMounts;

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

        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig setStorageMounts(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts> storageMounts) {
            this.storageMounts = storageMounts;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRayConfigStorageMounts> getStorageMounts() {
            return this.storageMounts;
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
         * <p>The time when the resource group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-29T03:34:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The minimum amount of elastic computing resources.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ElasticMinComputeResource")
        public String elasticMinComputeResource;

        /**
         * <p>Indicates whether the preemptible instance feature is enabled for the resource group. After the preemptible instance feature is enabled, you are charged for resources at a lower unit price but the resources are probably released. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * <p>The True value is returned only for job resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnableSpot")
        public String enableSpot;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineParams")
        public java.util.Map<String, ?> engineParams;

        @NameInMap("GpuElasticPlan")
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuElasticPlan gpuElasticPlan;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
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
         * <p> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Job</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The Resource Access Management (RAM) user that is associated with the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>testb,testc</p>
         */
        @NameInMap("GroupUsers")
        public String groupUsers;

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
         * 
         * <strong>example:</strong>
         * <p>512ACU</p>
         */
        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        @NameInMap("MaxGpuQuantity")
        public Integer maxGpuQuantity;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Message")
        public String message;

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
         * 
         * <strong>example:</strong>
         * <p>0ACU</p>
         */
        @NameInMap("MinComputeResource")
        public String minComputeResource;

        @NameInMap("MinGpuQuantity")
        public Integer minGpuQuantity;

        @NameInMap("RayConfig")
        public DescribeDBResourceGroupResponseBodyGroupsInfoRayConfig rayConfig;

        /**
         * <p>The job resubmission rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

        @NameInMap("SpecName")
        public String specName;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li><strong>creating</strong>: The resource group is being created.</li>
         * <li><strong>ok</strong>: The resource group is created.</li>
         * <li><strong>pendingdelete</strong>: The resource group is pending to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TargetResourceGroupName")
        public String targetResourceGroupName;

        /**
         * <p>The time when the resource group was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
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

        public DescribeDBResourceGroupResponseBodyGroupsInfo setAutoStopInterval(String autoStopInterval) {
            this.autoStopInterval = autoStopInterval;
            return this;
        }
        public String getAutoStopInterval() {
            return this.autoStopInterval;
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
