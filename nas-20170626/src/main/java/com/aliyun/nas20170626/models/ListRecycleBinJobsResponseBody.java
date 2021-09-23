// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycleBinJobsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Jobs")
    public java.util.List<ListRecycleBinJobsResponseBodyJobs> jobs;

    public static ListRecycleBinJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecycleBinJobsResponseBody self = new ListRecycleBinJobsResponseBody();
        return TeaModel.build(map, self);
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

    public ListRecycleBinJobsResponseBody setJobs(java.util.List<ListRecycleBinJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListRecycleBinJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public static class ListRecycleBinJobsResponseBodyJobs extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Type")
        public String type;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Status")
        public String status;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static ListRecycleBinJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListRecycleBinJobsResponseBodyJobs self = new ListRecycleBinJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListRecycleBinJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecycleBinJobsResponseBodyJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRecycleBinJobsResponseBodyJobs setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListRecycleBinJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRecycleBinJobsResponseBodyJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListRecycleBinJobsResponseBodyJobs setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListRecycleBinJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecycleBinJobsResponseBodyJobs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRecycleBinJobsResponseBodyJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

}
