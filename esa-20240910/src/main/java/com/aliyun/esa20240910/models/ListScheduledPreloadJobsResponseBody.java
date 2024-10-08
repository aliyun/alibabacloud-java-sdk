// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListScheduledPreloadJobsResponseBodyJobs> jobs;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListScheduledPreloadJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadJobsResponseBody self = new ListScheduledPreloadJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadJobsResponseBody setJobs(java.util.List<ListScheduledPreloadJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListScheduledPreloadJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListScheduledPreloadJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledPreloadJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListScheduledPreloadJobsResponseBodyJobs extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Domains")
        public String domains;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("FailedFileOss")
        public String failedFileOss;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Id")
        public String id;

        @NameInMap("InsertWay")
        public String insertWay;

        @NameInMap("Name")
        public String name;

        @NameInMap("SiteId")
        public Long siteId;

        @NameInMap("TaskSubmitted")
        public Integer taskSubmitted;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("UrlCount")
        public Integer urlCount;

        @NameInMap("UrlSubmitted")
        public Integer urlSubmitted;

        public static ListScheduledPreloadJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListScheduledPreloadJobsResponseBodyJobs self = new ListScheduledPreloadJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListScheduledPreloadJobsResponseBodyJobs setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setDomains(String domains) {
            this.domains = domains;
            return this;
        }
        public String getDomains() {
            return this.domains;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setFailedFileOss(String failedFileOss) {
            this.failedFileOss = failedFileOss;
            return this;
        }
        public String getFailedFileOss() {
            return this.failedFileOss;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setInsertWay(String insertWay) {
            this.insertWay = insertWay;
            return this;
        }
        public String getInsertWay() {
            return this.insertWay;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setTaskSubmitted(Integer taskSubmitted) {
            this.taskSubmitted = taskSubmitted;
            return this;
        }
        public Integer getTaskSubmitted() {
            return this.taskSubmitted;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setUrlCount(Integer urlCount) {
            this.urlCount = urlCount;
            return this;
        }
        public Integer getUrlCount() {
            return this.urlCount;
        }

        public ListScheduledPreloadJobsResponseBodyJobs setUrlSubmitted(Integer urlSubmitted) {
            this.urlSubmitted = urlSubmitted;
            return this;
        }
        public Integer getUrlSubmitted() {
            return this.urlSubmitted;
        }

    }

}
