// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheTasksResponseBody extends TeaModel {
    @NameInMap("IspFlushCacheTasks")
    public java.util.List<DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks> ispFlushCacheTasks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeIspFlushCacheTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheTasksResponseBody self = new DescribeIspFlushCacheTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheTasksResponseBody setIspFlushCacheTasks(java.util.List<DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks> ispFlushCacheTasks) {
        this.ispFlushCacheTasks = ispFlushCacheTasks;
        return this;
    }
    public java.util.List<DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks> getIspFlushCacheTasks() {
        return this.ispFlushCacheTasks;
    }

    public DescribeIspFlushCacheTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIspFlushCacheTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIspFlushCacheTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIspFlushCacheTasksResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeIspFlushCacheTasksResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks self = new DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks();
            return TeaModel.build(map, self);
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeIspFlushCacheTasksResponseBodyIspFlushCacheTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
