// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>882304F9-6DB1-5593-A719-33473D082B9C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setJobs(java.util.List<ListJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobsResponseBodyJobsConfig extends TeaModel {
        @NameInMap("isDestroy")
        public Boolean isDestroy;

        /**
         * <strong>example:</strong>
         * <p>v4</p>
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

        public static ListJobsResponseBodyJobsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsConfig self = new ListJobsResponseBodyJobsConfig();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsConfig setIsDestroy(Boolean isDestroy) {
            this.isDestroy = isDestroy;
            return this;
        }
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        public ListJobsResponseBodyJobsConfig setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListJobsResponseBodyJobsConfig setResourcesChanged(String resourcesChanged) {
            this.resourcesChanged = resourcesChanged;
            return this;
        }
        public String getResourcesChanged() {
            return this.resourcesChanged;
        }

        public ListJobsResponseBodyJobsConfig setSubCommand(String subCommand) {
            this.subCommand = subCommand;
            return this;
        }
        public String getSubCommand() {
            return this.subCommand;
        }

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("config")
        public ListJobsResponseBodyJobsConfig config;

        /**
         * <strong>example:</strong>
         * <p>2022-07-05T02:13:43Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("description")
        public String description;

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
         * <p>job-433aead756057fff9e4dca57b147c</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>Errored</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("statusDetail")
        public java.util.Map<String, JobsStatusDetailValue> statusDetail;

        /**
         * <strong>example:</strong>
         * <p>task-518855d9a058c1176866c2c3efb</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setConfig(ListJobsResponseBodyJobsConfig config) {
            this.config = config;
            return this;
        }
        public ListJobsResponseBodyJobsConfig getConfig() {
            return this.config;
        }

        public ListJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobsResponseBodyJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobsResponseBodyJobs setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public ListJobsResponseBodyJobs setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public ListJobsResponseBodyJobs setIsPassAssertCheck(Boolean isPassAssertCheck) {
            this.isPassAssertCheck = isPassAssertCheck;
            return this;
        }
        public Boolean getIsPassAssertCheck() {
            return this.isPassAssertCheck;
        }

        public ListJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyJobs setStatusDetail(java.util.Map<String, JobsStatusDetailValue> statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public java.util.Map<String, JobsStatusDetailValue> getStatusDetail() {
            return this.statusDetail;
        }

        public ListJobsResponseBodyJobs setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListJobsResponseBodyJobs setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

    }

}
