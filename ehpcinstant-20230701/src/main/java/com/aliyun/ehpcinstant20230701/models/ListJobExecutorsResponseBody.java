// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobExecutorsResponseBody extends TeaModel {
    @NameInMap("ExecutorStatus")
    public ListJobExecutorsResponseBodyExecutorStatus executorStatus;

    @NameInMap("Executors")
    public java.util.List<ListJobExecutorsResponseBodyExecutors> executors;

    /**
     * <strong>example:</strong>
     * <p>job-xxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task0</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListJobExecutorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutorsResponseBody self = new ListJobExecutorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobExecutorsResponseBody setExecutorStatus(ListJobExecutorsResponseBodyExecutorStatus executorStatus) {
        this.executorStatus = executorStatus;
        return this;
    }
    public ListJobExecutorsResponseBodyExecutorStatus getExecutorStatus() {
        return this.executorStatus;
    }

    public ListJobExecutorsResponseBody setExecutors(java.util.List<ListJobExecutorsResponseBodyExecutors> executors) {
        this.executors = executors;
        return this;
    }
    public java.util.List<ListJobExecutorsResponseBodyExecutors> getExecutors() {
        return this.executors;
    }

    public ListJobExecutorsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListJobExecutorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobExecutorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobExecutorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobExecutorsResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListJobExecutorsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobExecutorsResponseBodyExecutorStatus extends TeaModel {
        @NameInMap("Deleted")
        public Integer deleted;

        @NameInMap("Exception")
        public Integer exception;

        @NameInMap("Failed")
        public Integer failed;

        @NameInMap("Initing")
        public Integer initing;

        @NameInMap("Pending")
        public Integer pending;

        @NameInMap("Running")
        public Integer running;

        @NameInMap("Succeeded")
        public Integer succeeded;

        public static ListJobExecutorsResponseBodyExecutorStatus build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutorsResponseBodyExecutorStatus self = new ListJobExecutorsResponseBodyExecutorStatus();
            return TeaModel.build(map, self);
        }

        public ListJobExecutorsResponseBodyExecutorStatus setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public ListJobExecutorsResponseBodyExecutorStatus setException(Integer exception) {
            this.exception = exception;
            return this;
        }
        public Integer getException() {
            return this.exception;
        }

        public ListJobExecutorsResponseBodyExecutorStatus setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public ListJobExecutorsResponseBodyExecutorStatus setIniting(Integer initing) {
            this.initing = initing;
            return this;
        }
        public Integer getIniting() {
            return this.initing;
        }

        public ListJobExecutorsResponseBodyExecutorStatus setPending(Integer pending) {
            this.pending = pending;
            return this;
        }
        public Integer getPending() {
            return this.pending;
        }

        public ListJobExecutorsResponseBodyExecutorStatus setRunning(Integer running) {
            this.running = running;
            return this;
        }
        public Integer getRunning() {
            return this.running;
        }

        public ListJobExecutorsResponseBodyExecutorStatus setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Integer getSucceeded() {
            return this.succeeded;
        }

    }

    public static class ListJobExecutorsResponseBodyExecutorsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListJobExecutorsResponseBodyExecutorsTags build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutorsResponseBodyExecutorsTags self = new ListJobExecutorsResponseBodyExecutorsTags();
            return TeaModel.build(map, self);
        }

        public ListJobExecutorsResponseBodyExecutorsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListJobExecutorsResponseBodyExecutorsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListJobExecutorsResponseBodyExecutors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArrayIndex")
        public Integer arrayIndex;

        /**
         * <strong>example:</strong>
         * <p>2024-02-20 10:04:10</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-02-20 10:04:18</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ExpirationTime")
        public String expirationTime;

        @NameInMap("ExternalIpAddress")
        public java.util.List<String> externalIpAddress;

        @NameInMap("HostName")
        public java.util.List<String> hostName;

        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Creating executor</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("Tags")
        public java.util.List<ListJobExecutorsResponseBodyExecutorsTags> tags;

        public static ListJobExecutorsResponseBodyExecutors build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutorsResponseBodyExecutors self = new ListJobExecutorsResponseBodyExecutors();
            return TeaModel.build(map, self);
        }

        public ListJobExecutorsResponseBodyExecutors setArrayIndex(Integer arrayIndex) {
            this.arrayIndex = arrayIndex;
            return this;
        }
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        public ListJobExecutorsResponseBodyExecutors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobExecutorsResponseBodyExecutors setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListJobExecutorsResponseBodyExecutors setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ListJobExecutorsResponseBodyExecutors setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListJobExecutorsResponseBodyExecutors setExternalIpAddress(java.util.List<String> externalIpAddress) {
            this.externalIpAddress = externalIpAddress;
            return this;
        }
        public java.util.List<String> getExternalIpAddress() {
            return this.externalIpAddress;
        }

        public ListJobExecutorsResponseBodyExecutors setHostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }
        public java.util.List<String> getHostName() {
            return this.hostName;
        }

        public ListJobExecutorsResponseBodyExecutors setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public ListJobExecutorsResponseBodyExecutors setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobExecutorsResponseBodyExecutors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobExecutorsResponseBodyExecutors setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListJobExecutorsResponseBodyExecutors setTags(java.util.List<ListJobExecutorsResponseBodyExecutorsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListJobExecutorsResponseBodyExecutorsTags> getTags() {
            return this.tags;
        }

    }

}
