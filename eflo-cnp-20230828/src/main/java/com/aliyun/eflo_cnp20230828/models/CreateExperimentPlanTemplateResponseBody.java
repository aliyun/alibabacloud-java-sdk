// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public CreateExperimentPlanTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static CreateExperimentPlanTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanTemplateResponseBody self = new CreateExperimentPlanTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateExperimentPlanTemplateResponseBody setData(CreateExperimentPlanTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateExperimentPlanTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateExperimentPlanTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExperimentPlanTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>cudaVersion</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("CudaVersion")
        public String cudaVersion;

        /**
         * <p>GpuDriverVersion</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemoryPerWorker")
        public Integer memoryPerWorker;

        /**
         * <p>NCCLVersion</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("NCCLVersion")
        public String NCCLVersion;

        /**
         * <p>PyTorchVersion</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PyTorchVersion")
        public String pyTorchVersion;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams self = new CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam extends TeaModel {
        @NameInMap("EnvParams")
        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams envParams;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PipelineOrder")
        public Integer pipelineOrder;

        /**
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        @NameInMap("Scene")
        public String scene;

        @NameInMap("SettingParams")
        public java.util.Map<String, String> settingParams;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam self = new CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setEnvParams(CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParamEnvParams getEnvParams() {
            return this.envParams;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

    public static class CreateExperimentPlanTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-11-19T02:01:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>12312312312312</p>
         */
        @NameInMap("CreatorUid")
        public Long creatorUid;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDelete")
        public Integer isDelete;

        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("PrivacyLevel")
        public String privacyLevel;

        @NameInMap("TemplateDescription")
        public String templateDescription;

        /**
         * <strong>example:</strong>
         * <p>17615126</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplatePipelineParam")
        public java.util.List<CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> templatePipelineParam;

        /**
         * <strong>example:</strong>
         * <p>2023-10-16T01:58Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        public static CreateExperimentPlanTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanTemplateResponseBodyData self = new CreateExperimentPlanTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateExperimentPlanTemplateResponseBodyData setCreatorUid(Long creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public Long getCreatorUid() {
            return this.creatorUid;
        }

        public CreateExperimentPlanTemplateResponseBodyData setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public CreateExperimentPlanTemplateResponseBodyData setPrivacyLevel(String privacyLevel) {
            this.privacyLevel = privacyLevel;
            return this;
        }
        public String getPrivacyLevel() {
            return this.privacyLevel;
        }

        public CreateExperimentPlanTemplateResponseBodyData setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public CreateExperimentPlanTemplateResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CreateExperimentPlanTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateExperimentPlanTemplateResponseBodyData setTemplatePipelineParam(java.util.List<CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> templatePipelineParam) {
            this.templatePipelineParam = templatePipelineParam;
            return this;
        }
        public java.util.List<CreateExperimentPlanTemplateResponseBodyDataTemplatePipelineParam> getTemplatePipelineParam() {
            return this.templatePipelineParam;
        }

        public CreateExperimentPlanTemplateResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateExperimentPlanTemplateResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
