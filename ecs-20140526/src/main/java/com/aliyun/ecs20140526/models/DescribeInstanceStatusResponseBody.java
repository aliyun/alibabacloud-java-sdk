// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The status information of the instances.</p>
     */
    @NameInMap("InstanceStatuses")
    public DescribeInstanceStatusResponseBodyInstanceStatuses instanceStatuses;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     */
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
        /**
         * <p>The ID of instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>* Pending: The instance is being created.</p>
         * <p>* Running: The instance is running.</p>
         * <p>* Starting: The instance is being started.</p>
         * <p>* Stopping: The instance is being stopped.</p>
         * <p>* Stopped: The instance is stopped.</p>
         */
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
