// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycleBinJobsResponseBody extends TeaModel {
    /**
     * <p>The information about the jobs of the recycle bin.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListRecycleBinJobsResponseBodyJobs> jobs;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of jobs returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of jobs.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRecycleBinJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecycleBinJobsResponseBody self = new ListRecycleBinJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecycleBinJobsResponseBody setJobs(java.util.List<ListRecycleBinJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListRecycleBinJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListRecycleBinJobsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRecycleBinJobsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRecycleBinJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecycleBinJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecycleBinJobsResponseBodyJobs extends TeaModel {
        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>A valid value is returned only if you set the Status parameter to Fail or PartialSuccess.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * <br>
         * <p>A valid value is returned only if you set the Status parameter to Fail or PartialSuccess.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the file or directory in the job.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file or directory that is associated with the job.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The job ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The progress of the job.</p>
         * <br>
         * <p>Valid values: 1 to 100.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   Running: The job is running.</p>
         * <p>*   Defragmenting: The job is defragmenting data.</p>
         * <p>*   PartialSuccess: The job is partially completed.</p>
         * <p>*   Success: The job is completed.</p>
         * <p>*   Fail: The job failed.</p>
         * <p>*   Cancelled: The job is canceled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the job. Valid values:</p>
         * <br>
         * <p>*   Restore: a file restoration job</p>
         * <p>*   Delete: a file deletion job</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRecycleBinJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListRecycleBinJobsResponseBodyJobs self = new ListRecycleBinJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListRecycleBinJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecycleBinJobsResponseBodyJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListRecycleBinJobsResponseBodyJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListRecycleBinJobsResponseBodyJobs setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListRecycleBinJobsResponseBodyJobs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRecycleBinJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecycleBinJobsResponseBodyJobs setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListRecycleBinJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRecycleBinJobsResponseBodyJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
