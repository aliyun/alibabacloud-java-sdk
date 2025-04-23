// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    @NameInMap("job")
    public GetJobResponseBodyJob job;

    /**
     * <strong>example:</strong>
     * <p>1435C78A-AED9-53D6-B7A6-E2661D29B1FA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setJob(GetJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobResponseBodyJobAssertCheckDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("comparison")
        public String comparison;

        @NameInMap("expectedValue")
        public String expectedValue;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isPass")
        public Boolean isPass;

        /**
         * <strong>example:</strong>
         * <p>result</p>
         */
        @NameInMap("type")
        public String type;

        public static GetJobResponseBodyJobAssertCheckDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobAssertCheckDetail self = new GetJobResponseBodyJobAssertCheckDetail();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobAssertCheckDetail setComparison(String comparison) {
            this.comparison = comparison;
            return this;
        }
        public String getComparison() {
            return this.comparison;
        }

        public GetJobResponseBodyJobAssertCheckDetail setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

        public GetJobResponseBodyJobAssertCheckDetail setIsPass(Boolean isPass) {
            this.isPass = isPass;
            return this;
        }
        public Boolean getIsPass() {
            return this.isPass;
        }

        public GetJobResponseBodyJobAssertCheckDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobResponseBodyJobConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
         * <strong>example:</strong>
         * <p>fales</p>
         */
        @NameInMap("isDestroy")
        public Boolean isDestroy;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("resourcesChanged")
        public String resourcesChanged;

        @NameInMap("subCommand")
        public String subCommand;

        public static GetJobResponseBodyJobConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobConfig self = new GetJobResponseBodyJobConfig();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobConfig setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetJobResponseBodyJobConfig setIsDestroy(Boolean isDestroy) {
            this.isDestroy = isDestroy;
            return this;
        }
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        public GetJobResponseBodyJobConfig setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetJobResponseBodyJobConfig setResourcesChanged(String resourcesChanged) {
            this.resourcesChanged = resourcesChanged;
            return this;
        }
        public String getResourcesChanged() {
            return this.resourcesChanged;
        }

        public GetJobResponseBodyJobConfig setSubCommand(String subCommand) {
            this.subCommand = subCommand;
            return this;
        }
        public String getSubCommand() {
            return this.subCommand;
        }

    }

    public static class GetJobResponseBodyJob extends TeaModel {
        @NameInMap("assertCheckDetail")
        public java.util.List<GetJobResponseBodyJobAssertCheckDetail> assertCheckDetail;

        @NameInMap("config")
        public GetJobResponseBodyJobConfig config;

        /**
         * <strong>example:</strong>
         * <p>2022-08-31T03:38:40Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("downloadUrl")
        public java.util.Map<String, ?> downloadUrl;

        @NameInMap("elapsedTime")
        public Long elapsedTime;

        @NameInMap("executeType")
        public String executeType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isPassAssertCheck")
        public Boolean isPassAssertCheck;

        /**
         * <strong>example:</strong>
         * <p>job-518855d9a058cfff0dc933e6b5767</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("output")
        public String output;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        @NameInMap("runtimeType")
        public String runtimeType;

        /**
         * <strong>example:</strong>
         * <p>Errored</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("statusDetail")
        public java.util.Map<String, JobStatusDetailValue> statusDetail;

        /**
         * <strong>example:</strong>
         * <p>task-3b6cb9fa4751a1b9b5f22cbcf4e</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskType")
        public String taskType;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        public static GetJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJob self = new GetJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJob setAssertCheckDetail(java.util.List<GetJobResponseBodyJobAssertCheckDetail> assertCheckDetail) {
            this.assertCheckDetail = assertCheckDetail;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobAssertCheckDetail> getAssertCheckDetail() {
            return this.assertCheckDetail;
        }

        public GetJobResponseBodyJob setConfig(GetJobResponseBodyJobConfig config) {
            this.config = config;
            return this;
        }
        public GetJobResponseBodyJobConfig getConfig() {
            return this.config;
        }

        public GetJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobResponseBodyJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobResponseBodyJob setDownloadUrl(java.util.Map<String, ?> downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public java.util.Map<String, ?> getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetJobResponseBodyJob setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public GetJobResponseBodyJob setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public GetJobResponseBodyJob setIsPassAssertCheck(Boolean isPassAssertCheck) {
            this.isPassAssertCheck = isPassAssertCheck;
            return this;
        }
        public Boolean getIsPassAssertCheck() {
            return this.isPassAssertCheck;
        }

        public GetJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobResponseBodyJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetJobResponseBodyJob setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetJobResponseBodyJob setRuntimeType(String runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }
        public String getRuntimeType() {
            return this.runtimeType;
        }

        public GetJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyJob setStatusDetail(java.util.Map<String, JobStatusDetailValue> statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public java.util.Map<String, JobStatusDetailValue> getStatusDetail() {
            return this.statusDetail;
        }

        public GetJobResponseBodyJob setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetJobResponseBodyJob setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetJobResponseBodyJob setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

    }

}
