// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    @NameInMap("job")
    public GetJobResponseBodyJob job;

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

    public static class GetJobResponseBodyJobConfig extends TeaModel {
        @NameInMap("autoApply")
        public Boolean autoApply;

        @NameInMap("isDestroy")
        public Boolean isDestroy;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("resourcesChanged")
        public String resourcesChanged;

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

    }

    public static class GetJobResponseBodyJob extends TeaModel {
        @NameInMap("config")
        public GetJobResponseBodyJobConfig config;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("jobId")
        public String jobId;

        @NameInMap("output")
        public String output;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        @NameInMap("runtimeType")
        public String runtimeType;

        @NameInMap("status")
        public String status;

        @NameInMap("statusDetail")
        public java.util.Map<String, JobStatusDetailValue> statusDetail;

        @NameInMap("taskId")
        public String taskId;

        public static GetJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJob self = new GetJobResponseBodyJob();
            return TeaModel.build(map, self);
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

    }

}
