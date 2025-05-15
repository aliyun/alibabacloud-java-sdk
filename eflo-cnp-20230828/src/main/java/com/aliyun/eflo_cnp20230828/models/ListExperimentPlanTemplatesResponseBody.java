// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlanTemplatesResponseBody extends TeaModel {
    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public java.util.List<ListExperimentPlanTemplatesResponseBodyData> data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AAE4AFED-7AE6-52FA-80B6-448E63760552</p>
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

    public static ListExperimentPlanTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlanTemplatesResponseBody self = new ListExperimentPlanTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlanTemplatesResponseBody setData(java.util.List<ListExperimentPlanTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListExperimentPlanTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListExperimentPlanTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentPlanTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams extends TeaModel {
        /**
         * <p>CPU allocation</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>Cuda Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("CudaVersion")
        public String cudaVersion;

        /**
         * <p>The version of the GPU driver.</p>
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
         * <p>Allocated shared memory in GB</p>
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

        public static ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams self = new ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams();
            return TeaModel.build(map, self);
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam extends TeaModel {
        /**
         * <p>Configured environment parameters</p>
         */
        @NameInMap("EnvParams")
        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams envParams;

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
         * <p>Workload name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam self = new ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam();
            return TeaModel.build(map, self);
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam setEnvParams(ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParamEnvParams getEnvParams() {
            return this.envParams;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

    public static class ListExperimentPlanTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>Creation time</p>
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
         * <p>178154411231232</p>
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
         * <p>Privacy level</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("PrivacyLevel")
        public String privacyLevel;

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>475315534</p>
         */
        @NameInMap("TemplateCode")
        public Long templateCode;

        /**
         * <p>Template description</p>
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
         * <p>Template name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Template pipeline</p>
         */
        @NameInMap("TemplatePipelineParam")
        public java.util.List<ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam> templatePipelineParam;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-29 02:16:35</p>
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

        public static ListExperimentPlanTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentPlanTemplatesResponseBodyData self = new ListExperimentPlanTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExperimentPlanTemplatesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExperimentPlanTemplatesResponseBodyData setCreatorUid(Long creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public Long getCreatorUid() {
            return this.creatorUid;
        }

        public ListExperimentPlanTemplatesResponseBodyData setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public ListExperimentPlanTemplatesResponseBodyData setPrivacyLevel(String privacyLevel) {
            this.privacyLevel = privacyLevel;
            return this;
        }
        public String getPrivacyLevel() {
            return this.privacyLevel;
        }

        public ListExperimentPlanTemplatesResponseBodyData setTemplateCode(Long templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public Long getTemplateCode() {
            return this.templateCode;
        }

        public ListExperimentPlanTemplatesResponseBodyData setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public ListExperimentPlanTemplatesResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListExperimentPlanTemplatesResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListExperimentPlanTemplatesResponseBodyData setTemplatePipelineParam(java.util.List<ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam> templatePipelineParam) {
            this.templatePipelineParam = templatePipelineParam;
            return this;
        }
        public java.util.List<ListExperimentPlanTemplatesResponseBodyDataTemplatePipelineParam> getTemplatePipelineParam() {
            return this.templatePipelineParam;
        }

        public ListExperimentPlanTemplatesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListExperimentPlanTemplatesResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
