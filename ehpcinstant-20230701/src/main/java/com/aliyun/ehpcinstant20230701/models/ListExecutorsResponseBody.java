// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsResponseBody extends TeaModel {
    @NameInMap("Executors")
    public java.util.List<ListExecutorsResponseBodyExecutors> executors;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
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
     * <p>40</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListExecutorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorsResponseBody self = new ListExecutorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutorsResponseBody setExecutors(java.util.List<ListExecutorsResponseBodyExecutors> executors) {
        this.executors = executors;
        return this;
    }
    public java.util.List<ListExecutorsResponseBodyExecutors> getExecutors() {
        return this.executors;
    }

    public ListExecutorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExecutorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutorsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListExecutorsResponseBodyExecutorsResourceDisks extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("Type")
        public String type;

        public static ListExecutorsResponseBodyExecutorsResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsResponseBodyExecutorsResourceDisks self = new ListExecutorsResponseBodyExecutorsResourceDisks();
            return TeaModel.build(map, self);
        }

        public ListExecutorsResponseBodyExecutorsResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListExecutorsResponseBodyExecutorsResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListExecutorsResponseBodyExecutorsResource extends TeaModel {
        @NameInMap("Cores")
        public Float cores;

        @NameInMap("Disks")
        public java.util.List<ListExecutorsResponseBodyExecutorsResourceDisks> disks;

        @NameInMap("Memory")
        public Float memory;

        public static ListExecutorsResponseBodyExecutorsResource build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsResponseBodyExecutorsResource self = new ListExecutorsResponseBodyExecutorsResource();
            return TeaModel.build(map, self);
        }

        public ListExecutorsResponseBodyExecutorsResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public ListExecutorsResponseBodyExecutorsResource setDisks(java.util.List<ListExecutorsResponseBodyExecutorsResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<ListExecutorsResponseBodyExecutorsResourceDisks> getDisks() {
            return this.disks;
        }

        public ListExecutorsResponseBodyExecutorsResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class ListExecutorsResponseBodyExecutorsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListExecutorsResponseBodyExecutorsTags build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsResponseBodyExecutorsTags self = new ListExecutorsResponseBodyExecutorsTags();
            return TeaModel.build(map, self);
        }

        public ListExecutorsResponseBodyExecutorsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListExecutorsResponseBodyExecutorsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListExecutorsResponseBodyExecutors extends TeaModel {
        @NameInMap("AppName")
        public String appName;

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

        /**
         * <strong>example:</strong>
         * <p>job-xxxx-task0-1</p>
         */
        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ExpirationTime")
        public String expirationTime;

        @NameInMap("ExternalIpAddress")
        public java.util.List<String> externalIpAddress;

        @NameInMap("HostName")
        public java.util.List<String> hostName;

        @NameInMap("Image")
        public String image;

        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        /**
         * <strong>example:</strong>
         * <p>job-hy1nggvyukuvkr******</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Resource")
        public ListExecutorsResponseBodyExecutorsResource resource;

        @NameInMap("ResourceType")
        public String resourceType;

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
         * <p>Succeeded to release executor resource</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("Tags")
        public java.util.List<ListExecutorsResponseBodyExecutorsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>task0</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListExecutorsResponseBodyExecutors build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsResponseBodyExecutors self = new ListExecutorsResponseBodyExecutors();
            return TeaModel.build(map, self);
        }

        public ListExecutorsResponseBodyExecutors setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListExecutorsResponseBodyExecutors setArrayIndex(Integer arrayIndex) {
            this.arrayIndex = arrayIndex;
            return this;
        }
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        public ListExecutorsResponseBodyExecutors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExecutorsResponseBodyExecutors setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListExecutorsResponseBodyExecutors setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ListExecutorsResponseBodyExecutors setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListExecutorsResponseBodyExecutors setExternalIpAddress(java.util.List<String> externalIpAddress) {
            this.externalIpAddress = externalIpAddress;
            return this;
        }
        public java.util.List<String> getExternalIpAddress() {
            return this.externalIpAddress;
        }

        public ListExecutorsResponseBodyExecutors setHostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }
        public java.util.List<String> getHostName() {
            return this.hostName;
        }

        public ListExecutorsResponseBodyExecutors setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListExecutorsResponseBodyExecutors setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public ListExecutorsResponseBodyExecutors setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListExecutorsResponseBodyExecutors setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListExecutorsResponseBodyExecutors setResource(ListExecutorsResponseBodyExecutorsResource resource) {
            this.resource = resource;
            return this;
        }
        public ListExecutorsResponseBodyExecutorsResource getResource() {
            return this.resource;
        }

        public ListExecutorsResponseBodyExecutors setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListExecutorsResponseBodyExecutors setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListExecutorsResponseBodyExecutors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutorsResponseBodyExecutors setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListExecutorsResponseBodyExecutors setTags(java.util.List<ListExecutorsResponseBodyExecutorsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListExecutorsResponseBodyExecutorsTags> getTags() {
            return this.tags;
        }

        public ListExecutorsResponseBodyExecutors setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListExecutorsResponseBodyExecutors setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

        public ListExecutorsResponseBodyExecutors setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
