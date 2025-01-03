// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentPlanResponseBody extends TeaModel {
    /**
     * <p>Access denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public GetExperimentPlanResponseBodyData data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>6DBAC169-93D1-5DCD-8109-30FB623B3197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count of the query</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetExperimentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentPlanResponseBody self = new GetExperimentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentPlanResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetExperimentPlanResponseBody setData(GetExperimentPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExperimentPlanResponseBodyData getData() {
        return this.data;
    }

    public GetExperimentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentPlanResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes extends TeaModel {
        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>ods_galaxy_gateway_tickets</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Requested CPU</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("RequestCPU")
        public Integer requestCPU;

        /**
         * <p>Requested GPU</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RequestGPU")
        public Integer requestGPU;

        /**
         * <p>Memory of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("RequestMemory")
        public Integer requestMemory;

        /**
         * <p>Total CPU</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("TotalCPU")
        public Integer totalCPU;

        /**
         * <p>Total GPU</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalGPU")
        public Integer totalGPU;

        /**
         * <p>Total memory</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        public static GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes self = new GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setRequestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setRequestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setRequestMemory(Integer requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setTotalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setTotalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
            return this;
        }
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

    }

    public static class GetExperimentPlanResponseBodyDataPlanPipelineEnvParams extends TeaModel {
        /**
         * <p>CPU allocation</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>CUDA version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("CudaVersion")
        public String cudaVersion;

        /**
         * <p>Additional parameters</p>
         */
        @NameInMap("ExtendParam")
        public java.util.Map<String, String> extendParam;

        /**
         * <p>GPU driver version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>Number of GPUs allocated</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Memory GB allocation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemoryPerWorker")
        public Integer memoryPerWorker;

        /**
         * <p>NCCL version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("NCCLVersion")
        public String NCCLVersion;

        /**
         * <p>PyTorch version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PyTorchVersion")
        public String pyTorchVersion;

        /**
         * <p>Specified nodes</p>
         */
        @NameInMap("ResourceNodes")
        public java.util.List<GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes> resourceNodes;

        /**
         * <p>Shared memory GB allocation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <p>Number of nodes</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static GetExperimentPlanResponseBodyDataPlanPipelineEnvParams build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanResponseBodyDataPlanPipelineEnvParams self = new GetExperimentPlanResponseBodyDataPlanPipelineEnvParams();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setExtendParam(java.util.Map<String, String> extendParam) {
            this.extendParam = extendParam;
            return this;
        }
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setResourceNodes(java.util.List<GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<GetExperimentPlanResponseBodyDataPlanPipelineEnvParamsResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class GetExperimentPlanResponseBodyDataPlanPipeline extends TeaModel {
        /**
         * <p>Configured environment parameters</p>
         */
        @NameInMap("EnvParams")
        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams envParams;

        /**
         * <p>Node order number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PipelineOrder")
        public Integer pipelineOrder;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>Resource name</p>
         * 
         * <strong>example:</strong>
         * <p>PPU</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>Usage scenario, e.g., &quot;baseline&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Configured workload parameters</p>
         */
        @NameInMap("SettingParams")
        public java.util.Map<String, String> settingParams;

        /**
         * <p>Workload ID</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <p>Workload name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static GetExperimentPlanResponseBodyDataPlanPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanResponseBodyDataPlanPipeline self = new GetExperimentPlanResponseBodyDataPlanPipeline();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setEnvParams(GetExperimentPlanResponseBodyDataPlanPipelineEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public GetExperimentPlanResponseBodyDataPlanPipelineEnvParams getEnvParams() {
            return this.envParams;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public GetExperimentPlanResponseBodyDataPlanPipeline setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

    public static class GetExperimentPlanResponseBodyData extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-07 02:08:54</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        @NameInMap("PlanId")
        public Long planId;

        /**
         * <p>Test plan pipeline</p>
         */
        @NameInMap("PlanPipeline")
        public java.util.List<GetExperimentPlanResponseBodyDataPlanPipeline> planPipeline;

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvmpzi7lmxhq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Associated resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>260860230684</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>Associated test plan template ID</p>
         * 
         * <strong>example:</strong>
         * <p>2162</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>Associated test plan template name</p>
         * 
         * <strong>example:</strong>
         * <p>MM</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-07 02:08:54</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetExperimentPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanResponseBodyData self = new GetExperimentPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetExperimentPlanResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetExperimentPlanResponseBodyData setPlanPipeline(java.util.List<GetExperimentPlanResponseBodyDataPlanPipeline> planPipeline) {
            this.planPipeline = planPipeline;
            return this;
        }
        public java.util.List<GetExperimentPlanResponseBodyDataPlanPipeline> getPlanPipeline() {
            return this.planPipeline;
        }

        public GetExperimentPlanResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetExperimentPlanResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GetExperimentPlanResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetExperimentPlanResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetExperimentPlanResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
