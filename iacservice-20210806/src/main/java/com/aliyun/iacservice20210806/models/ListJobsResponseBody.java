// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The list of job information.</p>
     */
    @NameInMap("jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results returned per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>882304F9-6DB1-5593-A719-33473D082B9C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
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
        /**
         * <p>Indicates whether the job is a destroy job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDestroy")
        public Boolean isDestroy;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>moduleDescription</p>
         */
        @NameInMap("moduleDescription")
        public String moduleDescription;

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <p>The resource change content.</p>
         * 
         * <strong>example:</strong>
         * <p>+0 ~0 -0</p>
         */
        @NameInMap("resourcesChanged")
        public String resourcesChanged;

        /**
         * <p>The operation command.</p>
         * 
         * <strong>example:</strong>
         * <p>destroy</p>
         */
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

        public ListJobsResponseBodyJobsConfig setModuleDescription(String moduleDescription) {
            this.moduleDescription = moduleDescription;
            return this;
        }
        public String getModuleDescription() {
            return this.moduleDescription;
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
        /**
         * <p>The job configuration.</p>
         */
        @NameInMap("config")
        public ListJobsResponseBodyJobsConfig config;

        /**
         * <p>The time when the job was created, in UTC in the ISO 8601 format of YYYY-MM-DDTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-05T02:13:43Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>plan</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <p>The execution type. Valid values:</p>
         * <ul>
         * <li>Manual: Manual execution (default).</li>
         * <li>Auto: Automatic execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("executeType")
        public String executeType;

        /**
         * <p>Indicates whether the assertion check passed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isPassAssertCheck")
        public Boolean isPassAssertCheck;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-433aff9e4dca57b147c</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Pending: The initial status after the job is created.</li>
         * <li>PlanQueued: After the job is created, if no workflow is available, the job is queued.</li>
         * <li>Planning: The resource job is in the Plan execution phase.</li>
         * <li>ConfigProactiveInProgress: Compliance pre-check is in progress. The account must have the compliance pre-check feature enabled.</li>
         * <li>ConfigProactiveSuccess: Compliance pre-check succeeded. The account must have the compliance pre-check feature enabled.</li>
         * <li>Planned: The resource job has completed Plan execution.</li>
         * <li>PlannedAndFinished: After Plan execution is completed, no diff is found. This is a final status.</li>
         * <li>Confirmed: The resource job is waiting for confirmation after Plan execution is completed.</li>
         * <li>ApplyQueued: During job execution, if no workflow is available, the job is queued.</li>
         * <li>Applying: The resource job is in the Apply execution phase.</li>
         * <li>Applied: The resource job has completed Apply execution. This is a final status.</li>
         * <li>Errored: The job execution encountered an error. This is a final status.</li>
         * <li>Canceled: The job execution was canceled. This is a final status.</li>
         * <li>Discarded: The plan of the resource job was discarded. This is a final status.</li>
         * <li>ConfigProactiveFailure: Compliance pre-check failed. The account must have the compliance pre-check feature enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Errored</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status details.</p>
         */
        @NameInMap("statusDetail")
        public java.util.Map<String, JobsStatusDetailValue> statusDetail;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-518876866c2c3efb</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The Terraform provider version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.240.0</p>
         */
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
