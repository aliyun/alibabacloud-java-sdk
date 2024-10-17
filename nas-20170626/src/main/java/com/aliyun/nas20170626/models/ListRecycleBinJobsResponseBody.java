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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of jobs returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E15E394-38A6-457A-A62A-D9797C9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021-05-30T10:08:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned.</p>
         * <p>A valid value is returned only if you set the Status parameter to Fail or PartialSuccess.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidFileId.NotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * <p>A valid value is returned only if you set the Status parameter to Fail or PartialSuccess.</p>
         * 
         * <strong>example:</strong>
         * <p>The Target File or Directory does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the file or directory in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>04***08</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file or directory that is associated with the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8C****C54</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The progress of the job.</p>
         * <p>Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li>Running: The job is running.</li>
         * <li>Defragmenting: The job is defragmenting data.</li>
         * <li>PartialSuccess: The job is partially completed.</li>
         * <li>Success: The job is completed.</li>
         * <li>Fail: The job failed.</li>
         * <li>Cancelled: The job is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the job. Valid values:</p>
         * <ul>
         * <li>Restore: a file restoration job</li>
         * <li>Delete: a file deletion job</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Restore</p>
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
