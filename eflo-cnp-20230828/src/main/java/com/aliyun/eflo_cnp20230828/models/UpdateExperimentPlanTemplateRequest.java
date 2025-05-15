// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanTemplateRequest extends TeaModel {
    /**
     * <p>Template code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>349623</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>Template pipeline</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplatePipeline")
    public java.util.List<UpdateExperimentPlanTemplateRequestTemplatePipeline> templatePipeline;

    public static UpdateExperimentPlanTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanTemplateRequest self = new UpdateExperimentPlanTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateExperimentPlanTemplateRequest setTemplatePipeline(java.util.List<UpdateExperimentPlanTemplateRequestTemplatePipeline> templatePipeline) {
        this.templatePipeline = templatePipeline;
        return this;
    }
    public java.util.List<UpdateExperimentPlanTemplateRequestTemplatePipeline> getTemplatePipeline() {
        return this.templatePipeline;
    }

    public static class UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams extends TeaModel {
        /**
         * <p>CPU allocation count</p>
         * <p>This parameter is required.</p>
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
         * <p>GPU driver version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>GPU allocation count</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Memory GB allocation count</p>
         * <p>This parameter is required.</p>
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
         * <p>Shared memory GB allocation count</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <p>Number of nodes</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams self = new UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class UpdateExperimentPlanTemplateRequestTemplatePipeline extends TeaModel {
        /**
         * <p>Configured environment parameters</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("EnvParams")
        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams envParams;

        /**
         * <p>Node order number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PipelineOrder")
        public Integer pipelineOrder;

        /**
         * <p>Usage scenario, e.g., &quot;baseline&quot;</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <p>Workload name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static UpdateExperimentPlanTemplateRequestTemplatePipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentPlanTemplateRequestTemplatePipeline self = new UpdateExperimentPlanTemplateRequestTemplatePipeline();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipeline setEnvParams(UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public UpdateExperimentPlanTemplateRequestTemplatePipelineEnvParams getEnvParams() {
            return this.envParams;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipeline setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipeline setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipeline setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipeline setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public UpdateExperimentPlanTemplateRequestTemplatePipeline setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

}
