// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListLifecycleRetrieveJobsResponseBody extends TeaModel {
    /**
     * <p>The details about the data retrieval tasks.</p>
     */
    @NameInMap("LifecycleRetrieveJobs")
    public java.util.List<ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs> lifecycleRetrieveJobs;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data retrieval tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLifecycleRetrieveJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLifecycleRetrieveJobsResponseBody self = new ListLifecycleRetrieveJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLifecycleRetrieveJobsResponseBody setLifecycleRetrieveJobs(java.util.List<ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs> lifecycleRetrieveJobs) {
        this.lifecycleRetrieveJobs = lifecycleRetrieveJobs;
        return this;
    }
    public java.util.List<ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs> getLifecycleRetrieveJobs() {
        return this.lifecycleRetrieveJobs;
    }

    public ListLifecycleRetrieveJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLifecycleRetrieveJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLifecycleRetrieveJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLifecycleRetrieveJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-30T10:08:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The total number of files that are read in the data retrieval task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DiscoveredFileCount")
        public Long discoveredFileCount;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The ID of the data retrieval task.</p>
         * 
         * <strong>example:</strong>
         * <p>lrj-nfstest-ia-160****853-hshvw</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The execution path of the data retrieval task.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The total number of files that are retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("RetrievedFileCount")
        public Long retrievedFileCount;

        /**
         * <p>The status of the data retrieval task. Valid values:</p>
         * <ul>
         * <li>active: The task is running.</li>
         * <li>canceled: The task is canceled.</li>
         * <li>completed: The task is completed.</li>
         * <li>failed: The task has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class.</p>
         * <ul>
         * <li>InfrequentAccess: the IA storage class.</li>
         * <li>Archive: the Archive storage class.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The time when the task was updated.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-30T11:08:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs build(java.util.Map<String, ?> map) throws Exception {
            ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs self = new ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs();
            return TeaModel.build(map, self);
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setDiscoveredFileCount(Long discoveredFileCount) {
            this.discoveredFileCount = discoveredFileCount;
            return this;
        }
        public Long getDiscoveredFileCount() {
            return this.discoveredFileCount;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
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

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListLifecycleRetrieveJobsResponseBodyLifecycleRetrieveJobs setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
