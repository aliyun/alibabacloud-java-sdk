// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("resourcesChanged")
        public String resourcesChanged;

        public static ListJobsResponseBodyJobsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsConfig self = new ListJobsResponseBodyJobsConfig();
            return TeaModel.build(map, self);
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

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("config")
        public ListJobsResponseBodyJobsConfig config;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("jobId")
        public String jobId;

        @NameInMap("status")
        public String status;

        @NameInMap("statusDetail")
        public java.util.Map<String, JobsStatusDetailValue> statusDetail;

        @NameInMap("taskId")
        public String taskId;

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

    }

}
