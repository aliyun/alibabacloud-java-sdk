// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponseBody extends TeaModel {
    // The status information of the instances.
    @NameInMap("InstanceStatuses")
    public DescribeInstanceStatusResponseBodyInstanceStatuses instanceStatuses;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of instances.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponseBody self = new DescribeInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusResponseBody setInstanceStatuses(DescribeInstanceStatusResponseBodyInstanceStatuses instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }
    public DescribeInstanceStatusResponseBodyInstanceStatuses getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public DescribeInstanceStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus extends TeaModel {
        // The ID of instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The state of the instance. Valid values:
        // 
        // * Pending: The instance is being created.
        // * Running: The instance is running.
        // * Starting: The instance is being started.
        // * Stopping: The instance is being stopped.
        // * Stopped: The instance is stopped.
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus self = new DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstanceStatusResponseBodyInstanceStatuses extends TeaModel {
        @NameInMap("InstanceStatus")
        public java.util.List<DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus> instanceStatus;

        public static DescribeInstanceStatusResponseBodyInstanceStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatusResponseBodyInstanceStatuses self = new DescribeInstanceStatusResponseBodyInstanceStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatusResponseBodyInstanceStatuses setInstanceStatus(java.util.List<DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus> instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public java.util.List<DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus> getInstanceStatus() {
            return this.instanceStatus;
        }

    }

}
