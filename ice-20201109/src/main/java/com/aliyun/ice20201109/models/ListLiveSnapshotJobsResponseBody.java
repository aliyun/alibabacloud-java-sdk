// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotJobsResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("JobList")
    public java.util.List<ListLiveSnapshotJobsResponseBodyJobList> jobList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sorting order of the jobs by creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The bucket of the output endpoint. If the storage type is set to oss, the OSS bucket is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>testbucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The output endpoint. If the storage type is set to oss, the Object Storage Service (OSS) domain name is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The storage type. The value can only be oss.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
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
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T02:48:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the job.</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The output information.</p>
         */
        @NameInMap("SnapshotOutput")
        public ListLiveSnapshotJobsResponseBodyJobListSnapshotOutput snapshotOutput;

        /**
         * <p>The state of the job.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>init: The job is not started.</li>
         * <li>paused: The job is paused.</li>
         * <li>started: The job is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>started</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The interval between two adjacent snapshots. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
