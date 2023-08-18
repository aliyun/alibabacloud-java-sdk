// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public ListJobResponseBodyJobs jobs;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponseBody self = new ListJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobResponseBody setJobs(ListJobResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public ListJobResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListJobResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListJobResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListJobResponseBodyJobsJob extends TeaModel {
        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("FolderId")
        public Long folderId;

        @NameInMap("IsCommitted")
        public Boolean isCommitted;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Packages")
        public String packages;

        @NameInMap("PlanJson")
        public String planJson;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("QueueName")
        public String queueName;

        public static ListJobResponseBodyJobsJob build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobsJob self = new ListJobResponseBodyJobsJob();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobsJob setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListJobResponseBodyJobsJob setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListJobResponseBodyJobsJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListJobResponseBodyJobsJob setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListJobResponseBodyJobsJob setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListJobResponseBodyJobsJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobResponseBodyJobsJob setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListJobResponseBodyJobsJob setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public ListJobResponseBodyJobsJob setIsCommitted(Boolean isCommitted) {
            this.isCommitted = isCommitted;
            return this;
        }
        public Boolean getIsCommitted() {
            return this.isCommitted;
        }

        public ListJobResponseBodyJobsJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobResponseBodyJobsJob setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobResponseBodyJobsJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobResponseBodyJobsJob setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListJobResponseBodyJobsJob setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListJobResponseBodyJobsJob setPackages(String packages) {
            this.packages = packages;
            return this;
        }
        public String getPackages() {
            return this.packages;
        }

        public ListJobResponseBodyJobsJob setPlanJson(String planJson) {
            this.planJson = planJson;
            return this;
        }
        public String getPlanJson() {
            return this.planJson;
        }

        public ListJobResponseBodyJobsJob setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListJobResponseBodyJobsJob setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListJobResponseBodyJobsJob setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class ListJobResponseBodyJobs extends TeaModel {
        @NameInMap("Job")
        public java.util.List<ListJobResponseBodyJobsJob> job;

        public static ListJobResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobs self = new ListJobResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobs setJob(java.util.List<ListJobResponseBodyJobsJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobsJob> getJob() {
            return this.job;
        }

    }

}
