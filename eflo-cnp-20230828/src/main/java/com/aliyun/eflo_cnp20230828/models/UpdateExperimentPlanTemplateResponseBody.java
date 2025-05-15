// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanTemplateResponseBody extends TeaModel {
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
    public UpdateExperimentPlanTemplateResponseBodyData data;

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

    public static UpdateExperimentPlanTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanTemplateResponseBody self = new UpdateExperimentPlanTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateExperimentPlanTemplateResponseBody setData(UpdateExperimentPlanTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateExperimentPlanTemplateResponseBodyData getData() {
        return this.data;
    }

    public UpdateExperimentPlanTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentPlanTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes extends TeaModel {
        /**
         * <p>Node Name</p>
         * 
         * <strong>example:</strong>
         * <p>honeypot</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Requested CPU</p>
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
         * <p>Requested Memory</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>Total Memory</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        public static UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes self = new UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setRequestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setRequestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setRequestMemory(Integer requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setTotalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setTotalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
            return this;
        }
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

    }

    public static class UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams extends TeaModel {
        /**
         * <p>CPU Allocation</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>CUDA Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("CudaVersion")
        public String cudaVersion;

        /**
         * <p>Extend Param</p>
         */
        @NameInMap("ExtendParam")
        public java.util.Map<String, String> extendParam;

        /**
         * <p>GPU Driver Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>GPU Allocation</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Memory (GB) Allocation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemoryPerWorker")
        public Integer memoryPerWorker;

        /**
         * <p>NCCL Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("NCCLVersion")
        public String NCCLVersion;

        /**
         * <p>PyTorch Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PyTorchVersion")
        public String pyTorchVersion;

        /**
         * <p>Specified Nodes</p>
         */
        @NameInMap("ResourceNodes")
        public java.util.List<UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes> resourceNodes;

        /**
         * <p>Shared Memory (GB) Allocation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <p>Number of Nodes</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams self = new UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setExtendParam(java.util.Map<String, String> extendParam) {
            this.extendParam = extendParam;
            return this;
        }
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setResourceNodes(java.util.List<UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParamsResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam extends TeaModel {
        /**
         * <p>Configured Environment Parameters</p>
         */
        @NameInMap("EnvParams")
        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams envParams;

        /**
         * <p>Node sequence number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PipelineOrder")
        public Integer pipelineOrder;

        /**
         * <p>Usage Scenario, e.g., &quot;baseline&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Configured Workload Parameters</p>
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

        public static UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam self = new UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setEnvParams(UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams getEnvParams() {
            return this.envParams;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

    public static class UpdateExperimentPlanTemplateResponseBodyData extends TeaModel {
        /**
         * <p>Create Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22 10:18:10</p>
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
         * <p>Whether it is deleted</p>
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
         * <p>Template code</p>
         * 
         * <strong>example:</strong>
         * <p>472840184</p>
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
         * <p>17815441</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>Template Name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Template Pipeline</p>
         */
        @NameInMap("TemplatePipelineParam")
        public java.util.List<UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> templatePipelineParam;

        /**
         * <p>Update Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-07 02:08:54</p>
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

        public static UpdateExperimentPlanTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentPlanTemplateResponseBodyData self = new UpdateExperimentPlanTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentPlanTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setCreatorUid(Long creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public Long getCreatorUid() {
            return this.creatorUid;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setPrivacyLevel(String privacyLevel) {
            this.privacyLevel = privacyLevel;
            return this;
        }
        public String getPrivacyLevel() {
            return this.privacyLevel;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setTemplateCode(Long templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public Long getTemplateCode() {
            return this.templateCode;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setTemplatePipelineParam(java.util.List<UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> templatePipelineParam) {
            this.templatePipelineParam = templatePipelineParam;
            return this;
        }
        public java.util.List<UpdateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> getTemplatePipelineParam() {
            return this.templatePipelineParam;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateExperimentPlanTemplateResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
