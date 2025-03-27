// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadJobsResponseBody extends TeaModel {
    /**
     * <p>The list of the prefetch tasks.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListScheduledPreloadJobsResponseBodyJobs> jobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>15685865xxx14622</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-01T08:53:13Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The domain names to be prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>testurl.com</p>
         */
        @NameInMap("Domains")
        public String domains;

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid domain:test.com</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("ExecutionCount")
        public Integer executionCount;

        /**
         * <p>The URL of the OSS object that stores a list of URLs that failed the conditional check for prefetching.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
         */
        @NameInMap("FailedFileOss")
        public String failedFileOss;

        /**
         * <p>The ID of the URL list file, which can be used during downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3b48621bccf3fe29e1a7</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The ID of the prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3af3621bccf3fe29e1a4</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The method to submit the URLs to be prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("InsertWay")
        public String insertWay;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>190007158391808</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The number of submitted prefetch tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskSubmitted")
        public Integer taskSubmitted;

        /**
         * <p>The task type. Valid values: refresh and preload.</p>
         * 
         * <strong>example:</strong>
         * <p>preload</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UrlCount")
        public Integer urlCount;

        /**
         * <p>The number of submitted URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public ListScheduledPreloadJobsResponseBodyJobs setExecutionCount(Integer executionCount) {
            this.executionCount = executionCount;
            return this;
        }
        public Integer getExecutionCount() {
            return this.executionCount;
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
