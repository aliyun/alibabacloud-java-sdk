// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentPlanTemplateResponseBody extends TeaModel {
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
    public GetExperimentPlanTemplateResponseBodyData data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetExperimentPlanTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentPlanTemplateResponseBody self = new GetExperimentPlanTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentPlanTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetExperimentPlanTemplateResponseBody setData(GetExperimentPlanTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExperimentPlanTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetExperimentPlanTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentPlanTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes extends TeaModel {
        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>exclusive_coud</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>当前请求的cpu</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RequestCPU")
        public Integer requestCPU;

        /**
         * <p>Requested GPU</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RequestGPU")
        public Integer requestGPU;

        /**
         * <p>Requested memory</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("RequestMemory")
        public Integer requestMemory;

        /**
         * <p>Total CPU</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCPU")
        public Integer totalCPU;

        /**
         * <p>Total GPU</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalGPU")
        public Integer totalGPU;

        /**
         * <p>Total memory</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        public static GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes self = new GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setRequestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setRequestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setRequestMemory(Integer requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setTotalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setTotalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
            return this;
        }
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

    }

    public static class GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams extends TeaModel {
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
         * <p>GPU allocation</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Allocated memory in GB</p>
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
        public java.util.List<GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes> resourceNodes;

        /**
         * <p>Shared memory in GB</p>
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

        public static GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams self = new GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setExtendParam(java.util.Map<String, String> extendParam) {
            this.extendParam = extendParam;
            return this;
        }
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setResourceNodes(java.util.List<GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam extends TeaModel {
        /**
         * <p>Configured environment parameters</p>
         */
        @NameInMap("EnvParams")
        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams envParams;

        /**
         * <p>Node sequence number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PipelineOrder")
        public Integer pipelineOrder;

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
         * <p>13</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <p>Workload Name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam self = new GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setEnvParams(GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams getEnvParams() {
            return this.envParams;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

    public static class GetExperimentPlanTemplateResponseBodyData extends TeaModel {
        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-29 02:16:35</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Primary account UID</p>
         * 
         * <strong>example:</strong>
         * <p>12312312312312</p>
         */
        @NameInMap("CreatorUid")
        public Long creatorUid;

        /**
         * <p>Whether deleted</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDelete")
        public Integer isDelete;

        /**
         * <p>Privacy Level</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("PrivacyLevel")
        public String privacyLevel;

        /**
         * <p>Template Code</p>
         * 
         * <strong>example:</strong>
         * <p>464086216</p>
         */
        @NameInMap("TemplateCode")
        public Long templateCode;

        /**
         * <p>Template Description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateDescription")
        public String templateDescription;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>17615126</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>Template Name</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Template Pipeline</p>
         */
        @NameInMap("TemplatePipelineParam")
        public java.util.List<GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> templatePipelineParam;

        /**
         * <p>Update Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22 10:18:10</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Version ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        public static GetExperimentPlanTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentPlanTemplateResponseBodyData self = new GetExperimentPlanTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExperimentPlanTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetExperimentPlanTemplateResponseBodyData setCreatorUid(Long creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public Long getCreatorUid() {
            return this.creatorUid;
        }

        public GetExperimentPlanTemplateResponseBodyData setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public GetExperimentPlanTemplateResponseBodyData setPrivacyLevel(String privacyLevel) {
            this.privacyLevel = privacyLevel;
            return this;
        }
        public String getPrivacyLevel() {
            return this.privacyLevel;
        }

        public GetExperimentPlanTemplateResponseBodyData setTemplateCode(Long templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public Long getTemplateCode() {
            return this.templateCode;
        }

        public GetExperimentPlanTemplateResponseBodyData setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public GetExperimentPlanTemplateResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetExperimentPlanTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetExperimentPlanTemplateResponseBodyData setTemplatePipelineParam(java.util.List<GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> templatePipelineParam) {
            this.templatePipelineParam = templatePipelineParam;
            return this;
        }
        public java.util.List<GetExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> getTemplatePipelineParam() {
            return this.templatePipelineParam;
        }

        public GetExperimentPlanTemplateResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetExperimentPlanTemplateResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
