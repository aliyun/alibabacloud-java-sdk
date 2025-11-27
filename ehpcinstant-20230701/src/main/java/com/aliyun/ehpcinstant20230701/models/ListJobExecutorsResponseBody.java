// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobExecutorsResponseBody extends TeaModel {
    /**
     * <p>Executor status statistics.</p>
     */
    @NameInMap("ExecutorStatus")
    public ListJobExecutorsResponseBodyExecutorStatus executorStatus;

    /**
     * <p>The executor list.</p>
     */
    @NameInMap("Executors")
    public java.util.List<ListJobExecutorsResponseBodyExecutors> executors;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job-xxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

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
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>task0</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The total number of list entries.</p>
     * 
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
        /**
         * <p>The number of executers in the Deleted state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Deleted")
        public Integer deleted;

        /**
         * <p>The number of executers in the abnormal state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Exception")
        public Integer exception;

        /**
         * <p>The number of executers in the Failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <p>The number of executers in the initialized state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Initing")
        public Integer initing;

        /**
         * <p>The number of executers in the queued state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pending")
        public Integer pending;

        @NameInMap("Restarting")
        public Integer restarting;

        /**
         * <p>The number of executers in the running state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Running")
        public Integer running;

        /**
         * <p>The number of executoresin the Successful state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Succeeded")
        public Integer succeeded;

        @NameInMap("Suspended")
        public Integer suspended;

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

        public ListJobExecutorsResponseBodyExecutorStatus setRestarting(Integer restarting) {
            this.restarting = restarting;
            return this;
        }
        public Integer getRestarting() {
            return this.restarting;
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

        public ListJobExecutorsResponseBodyExecutorStatus setSuspended(Integer suspended) {
            this.suspended = suspended;
            return this;
        }
        public Integer getSuspended() {
            return this.suspended;
        }

    }

    public static class ListJobExecutorsResponseBodyExecutorsTags extends TeaModel {
        /**
         * <p>The key of the executor tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the executor tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        /**
         * <p>The executor index number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArrayIndex")
        public Integer arrayIndex;

        @NameInMap("BlockDuration")
        public Integer blockDuration;

        /**
         * <p>The time when the storage resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-20 10:04:10</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-20 10:04:18</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The executor ID. The format is JobId-TaskName-ArrayIndex.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx-Task0-1</p>
         */
        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The list of public IP addresses of the nodes.</p>
         */
        @NameInMap("ExternalIpAddress")
        public java.util.List<String> externalIpAddress;

        /**
         * <p>An array of node hostnames.</p>
         */
        @NameInMap("HostName")
        public java.util.List<String> hostName;

        /**
         * <p>The list of node IP addresses.</p>
         */
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        @NameInMap("Preemptible")
        public Boolean preemptible;

        /**
         * <p>The create time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-20 10:04:13</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the executor. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Initing</li>
         * <li>Succeed</li>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>Unknown</li>
         * <li>Exception</li>
         * <li>Retrying</li>
         * <li>Expired</li>
         * <li>Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the status reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating executor</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The list of executor tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListJobExecutorsResponseBodyExecutorsTags> tags;

        public static ListJobExecutorsResponseBodyExecutors build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutorsResponseBodyExecutors self = new ListJobExecutorsResponseBodyExecutors();
            return TeaModel.build(map, self);
        }

        public ListJobExecutorsResponseBodyExecutors setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public ListJobExecutorsResponseBodyExecutors setArrayIndex(Integer arrayIndex) {
            this.arrayIndex = arrayIndex;
            return this;
        }
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        public ListJobExecutorsResponseBodyExecutors setBlockDuration(Integer blockDuration) {
            this.blockDuration = blockDuration;
            return this;
        }
        public Integer getBlockDuration() {
            return this.blockDuration;
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

        public ListJobExecutorsResponseBodyExecutors setPreemptible(Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Boolean getPreemptible() {
            return this.preemptible;
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
