// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetInstanceModelResponseBody extends TeaModel {
    /**
     * <p>The AI node instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hologram_aicombo_public_cn-77xxx</p>
     */
    @NameInMap("aiInstanceId")
    public String aiInstanceId;

    /**
     * <p>Indicates whether auto-renewal is enabled for the resource.</p>
     * <ul>
     * <li>true: Auto-renewal is enabled. The resource is automatically renewed upon expiration.</li>
     * <li>false: Auto-renewal is not enabled. The resource stops being available upon expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>hologram_aipostpay_public_cn</p>
     */
    @NameInMap("commodityCode")
    public String commodityCode;

    /**
     * <p>The total CPU of the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The total CPU used by the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("cpuUsed")
    public Long cpuUsed;

    /**
     * <p>The expiration time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-28T07:44:27.535Z</p>
     */
    @NameInMap("expirationTime")
    public String expirationTime;

    /**
     * <p>The total GPU of the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("gpu")
    public Long gpu;

    /**
     * <p>The total GPU memory of the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("gpuMemory")
    public Long gpuMemory;

    /**
     * <p>The total GPU memory used by the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("gpuMemoryUsed")
    public Long gpuMemoryUsed;

    /**
     * <p>The total GPU used by the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("gpuUsed")
    public Long gpuUsed;

    /**
     * <p>The total memory of the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("memory")
    public Long memory;

    /**
     * <p>The total memory used by the node. This parameter applies only to Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("memoryUsed")
    public Long memoryUsed;

    /**
     * <p>The list of model services.</p>
     */
    @NameInMap("modelServiceList")
    public java.util.List<GetInstanceModelResponseBodyModelServiceList> modelServiceList;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nodeCount")
    public Long nodeCount;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>middle</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The node status.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceReady</p>
     */
    @NameInMap("status")
    public String status;

    public static GetInstanceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceModelResponseBody self = new GetInstanceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceModelResponseBody setAiInstanceId(String aiInstanceId) {
        this.aiInstanceId = aiInstanceId;
        return this;
    }
    public String getAiInstanceId() {
        return this.aiInstanceId;
    }

    public GetInstanceModelResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public GetInstanceModelResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetInstanceModelResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetInstanceModelResponseBody setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public GetInstanceModelResponseBody setCpuUsed(Long cpuUsed) {
        this.cpuUsed = cpuUsed;
        return this;
    }
    public Long getCpuUsed() {
        return this.cpuUsed;
    }

    public GetInstanceModelResponseBody setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public String getExpirationTime() {
        return this.expirationTime;
    }

    public GetInstanceModelResponseBody setGpu(Long gpu) {
        this.gpu = gpu;
        return this;
    }
    public Long getGpu() {
        return this.gpu;
    }

    public GetInstanceModelResponseBody setGpuMemory(Long gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Long getGpuMemory() {
        return this.gpuMemory;
    }

    public GetInstanceModelResponseBody setGpuMemoryUsed(Long gpuMemoryUsed) {
        this.gpuMemoryUsed = gpuMemoryUsed;
        return this;
    }
    public Long getGpuMemoryUsed() {
        return this.gpuMemoryUsed;
    }

    public GetInstanceModelResponseBody setGpuUsed(Long gpuUsed) {
        this.gpuUsed = gpuUsed;
        return this;
    }
    public Long getGpuUsed() {
        return this.gpuUsed;
    }

    public GetInstanceModelResponseBody setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public GetInstanceModelResponseBody setMemoryUsed(Long memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public Long getMemoryUsed() {
        return this.memoryUsed;
    }

    public GetInstanceModelResponseBody setModelServiceList(java.util.List<GetInstanceModelResponseBodyModelServiceList> modelServiceList) {
        this.modelServiceList = modelServiceList;
        return this;
    }
    public java.util.List<GetInstanceModelResponseBodyModelServiceList> getModelServiceList() {
        return this.modelServiceList;
    }

    public GetInstanceModelResponseBody setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

    public GetInstanceModelResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceModelResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetInstanceModelResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetInstanceModelResponseBodyModelServiceList extends TeaModel {
        /**
         * <p>The Bailian API key (display only, cannot be used directly).</p>
         * 
         * <strong>example:</strong>
         * <p>sk-42f6c8xxxxxb</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The CPU consumed by this model service. This parameter applies only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("cpu")
        public Long cpu;

        /**
         * <p>The GPU consumed by this model service. This parameter applies only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("gpu")
        public Long gpu;

        /**
         * <p>The GPU memory consumed by this model service. This parameter applies only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("gpuMemory")
        public Long gpuMemory;

        /**
         * <p>The region where the AI node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("instanceRegion")
        public String instanceRegion;

        /**
         * <p>The memory consumed by this model service. This parameter applies only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("memory")
        public Long memory;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The custom name of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>my_model</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model parameters. This parameter applies only to Bailian models.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;timeout&quot;:600,&quot;max_retries&quot;:10,&quot;max_retry_delay&quot;:8,&quot;initial_retry_delay&quot;:0.5}</p>
         */
        @NameInMap("modelParams")
        public String modelParams;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The underlying model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The number of service replicas. This parameter applies only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("serviceCount")
        public Long serviceCount;

        /**
         * <p>The deployment region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("serviceDeployRegion")
        public String serviceDeployRegion;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("supportApiKeyAccess")
        public Boolean supportApiKeyAccess;

        /**
         * <p>The model purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>embedding</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.1</p>
         */
        @NameInMap("version")
        public String version;

        public static GetInstanceModelResponseBodyModelServiceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceModelResponseBodyModelServiceList self = new GetInstanceModelResponseBodyModelServiceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceModelResponseBodyModelServiceList setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetInstanceModelResponseBodyModelServiceList setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public GetInstanceModelResponseBodyModelServiceList setGpu(Long gpu) {
            this.gpu = gpu;
            return this;
        }
        public Long getGpu() {
            return this.gpu;
        }

        public GetInstanceModelResponseBodyModelServiceList setGpuMemory(Long gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        public GetInstanceModelResponseBodyModelServiceList setInstanceRegion(String instanceRegion) {
            this.instanceRegion = instanceRegion;
            return this;
        }
        public String getInstanceRegion() {
            return this.instanceRegion;
        }

        public GetInstanceModelResponseBodyModelServiceList setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public GetInstanceModelResponseBodyModelServiceList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetInstanceModelResponseBodyModelServiceList setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetInstanceModelResponseBodyModelServiceList setModelParams(String modelParams) {
            this.modelParams = modelParams;
            return this;
        }
        public String getModelParams() {
            return this.modelParams;
        }

        public GetInstanceModelResponseBodyModelServiceList setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetInstanceModelResponseBodyModelServiceList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetInstanceModelResponseBodyModelServiceList setServiceCount(Long serviceCount) {
            this.serviceCount = serviceCount;
            return this;
        }
        public Long getServiceCount() {
            return this.serviceCount;
        }

        public GetInstanceModelResponseBodyModelServiceList setServiceDeployRegion(String serviceDeployRegion) {
            this.serviceDeployRegion = serviceDeployRegion;
            return this;
        }
        public String getServiceDeployRegion() {
            return this.serviceDeployRegion;
        }

        public GetInstanceModelResponseBodyModelServiceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceModelResponseBodyModelServiceList setSupportApiKeyAccess(Boolean supportApiKeyAccess) {
            this.supportApiKeyAccess = supportApiKeyAccess;
            return this;
        }
        public Boolean getSupportApiKeyAccess() {
            return this.supportApiKeyAccess;
        }

        public GetInstanceModelResponseBodyModelServiceList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetInstanceModelResponseBodyModelServiceList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
