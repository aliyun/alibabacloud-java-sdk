// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    public java.util.List<ListLiveSnapshotJobsResponseBodyJobList> jobList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLiveSnapshotJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotJobsResponseBody self = new ListLiveSnapshotJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotJobsResponseBody setJobList(java.util.List<ListLiveSnapshotJobsResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<ListLiveSnapshotJobsResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public ListLiveSnapshotJobsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveSnapshotJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveSnapshotJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveSnapshotJobsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveSnapshotJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("StorageType")
        public String storageType;

        public static ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput build(java.util.Map<String, ?> map) throws Exception {
            ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput self = new ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput();
            return TeaModel.build(map, self);
        }

        public ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class ListLiveSnapshotJobsResponseBodyJobList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("SnapshotOutput")
        public ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput snapshotOutput;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        public static ListLiveSnapshotJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveSnapshotJobsResponseBodyJobList self = new ListLiveSnapshotJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListLiveSnapshotJobsResponseBodyJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setSnapshotOutput(ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput snapshotOutput) {
            this.snapshotOutput = snapshotOutput;
            return this;
        }
        public ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput getSnapshotOutput() {
            return this.snapshotOutput;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListLiveSnapshotJobsResponseBodyJobList setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

    }

}
