// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("InstanceStatuses")
    public DescribeInstanceStatusResponseBodyInstanceStatuses instanceStatuses;

    public static DescribeInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponseBody self = new DescribeInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeInstanceStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceStatusResponseBody setInstanceStatuses(DescribeInstanceStatusResponseBodyInstanceStatuses instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }
    public DescribeInstanceStatusResponseBodyInstanceStatuses getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public static class DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus self = new DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceStatusResponseBodyInstanceStatusesInstanceStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
