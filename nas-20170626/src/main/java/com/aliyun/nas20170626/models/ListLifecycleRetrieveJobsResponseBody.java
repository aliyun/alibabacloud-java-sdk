// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListLifecycleRetrieveJobsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("LifecycleRetrieveJobs")
    public java.util.List<ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs> lifecycleRetrieveJobs;

    public static ListLifecycleRetrieveJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLifecycleRetrieveJobsResponseBody self = new ListLifecycleRetrieveJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLifecycleRetrieveJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListLifecycleRetrieveJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLifecycleRetrieveJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLifecycleRetrieveJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLifecycleRetrieveJobsResponseBody setLifecycleRetrieveJobs(java.util.List<ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs> lifecycleRetrieveJobs) {
        this.lifecycleRetrieveJobs = lifecycleRetrieveJobs;
        return this;
    }
    public java.util.List<ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs> getLifecycleRetrieveJobs() {
        return this.lifecycleRetrieveJobs;
    }

    public static class ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs extends TeaModel {
        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("Status")
        public String status;

        @NameInMap("DiscoveredFileCount")
        public Long discoveredFileCount;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        @NameInMap("RetrievedFileCount")
        public Long retrievedFileCount;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("CreateTime")
        public String createTime;

        public static ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs build(java.util.Map<String, ?> map) throws Exception {
            ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs self = new ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs();
            return TeaModel.build(map, self);
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setDiscoveredFileCount(Long discoveredFileCount) {
            this.discoveredFileCount = discoveredFileCount;
            return this;
        }
        public Long getDiscoveredFileCount() {
            return this.discoveredFileCount;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setRetrievedFileCount(Long retrievedFileCount) {
            this.retrievedFileCount = retrievedFileCount;
            return this;
        }
        public Long getRetrievedFileCount() {
            return this.retrievedFileCount;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
