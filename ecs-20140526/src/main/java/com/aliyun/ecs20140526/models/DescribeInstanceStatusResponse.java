// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("InstanceStatuses")
    @Validation(required = true)
    public DescribeInstanceStatusResponseInstanceStatuses instanceStatuses;

    public static DescribeInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponse self = new DescribeInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceStatusResponseInstanceStatusesInstanceStatus extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeInstanceStatusResponseInstanceStatusesInstanceStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatusResponseInstanceStatusesInstanceStatus self = new DescribeInstanceStatusResponseInstanceStatusesInstanceStatus();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceStatusResponseInstanceStatuses extends TeaModel {
        @NameInMap("InstanceStatus")
        @Validation(required = true)
        public java.util.List<DescribeInstanceStatusResponseInstanceStatusesInstanceStatus> instanceStatus;

        public static DescribeInstanceStatusResponseInstanceStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatusResponseInstanceStatuses self = new DescribeInstanceStatusResponseInstanceStatuses();
            return TeaModel.build(map, self);
        }

    }

}
