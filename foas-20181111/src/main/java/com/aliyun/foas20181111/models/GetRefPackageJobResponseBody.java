// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetRefPackageJobResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public GetRefPackageJobResponseBodyJobs jobs;

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

    public static GetRefPackageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRefPackageJobResponseBody self = new GetRefPackageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRefPackageJobResponseBody setJobs(GetRefPackageJobResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public GetRefPackageJobResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public GetRefPackageJobResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetRefPackageJobResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRefPackageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRefPackageJobResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetRefPackageJobResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class GetRefPackageJobResponseBodyJobsJob extends TeaModel {
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

        public static GetRefPackageJobResponseBodyJobsJob build(java.util.Map<String, ?> map) throws Exception {
            GetRefPackageJobResponseBodyJobsJob self = new GetRefPackageJobResponseBodyJobsJob();
            return TeaModel.build(map, self);
        }

        public GetRefPackageJobResponseBodyJobsJob setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetRefPackageJobResponseBodyJobsJob setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetRefPackageJobResponseBodyJobsJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetRefPackageJobResponseBodyJobsJob setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRefPackageJobResponseBodyJobsJob setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetRefPackageJobResponseBodyJobsJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRefPackageJobResponseBodyJobsJob setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetRefPackageJobResponseBodyJobsJob setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public GetRefPackageJobResponseBodyJobsJob setIsCommitted(Boolean isCommitted) {
            this.isCommitted = isCommitted;
            return this;
        }
        public Boolean getIsCommitted() {
            return this.isCommitted;
        }

        public GetRefPackageJobResponseBodyJobsJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetRefPackageJobResponseBodyJobsJob setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetRefPackageJobResponseBodyJobsJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetRefPackageJobResponseBodyJobsJob setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetRefPackageJobResponseBodyJobsJob setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetRefPackageJobResponseBodyJobsJob setPackages(String packages) {
            this.packages = packages;
            return this;
        }
        public String getPackages() {
            return this.packages;
        }

        public GetRefPackageJobResponseBodyJobsJob setPlanJson(String planJson) {
            this.planJson = planJson;
            return this;
        }
        public String getPlanJson() {
            return this.planJson;
        }

        public GetRefPackageJobResponseBodyJobsJob setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetRefPackageJobResponseBodyJobsJob setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public GetRefPackageJobResponseBodyJobsJob setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class GetRefPackageJobResponseBodyJobs extends TeaModel {
        @NameInMap("Job")
        public java.util.List<GetRefPackageJobResponseBodyJobsJob> job;

        public static GetRefPackageJobResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            GetRefPackageJobResponseBodyJobs self = new GetRefPackageJobResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public GetRefPackageJobResponseBodyJobs setJob(java.util.List<GetRefPackageJobResponseBodyJobsJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<GetRefPackageJobResponseBodyJobsJob> getJob() {
            return this.job;
        }

    }

}
