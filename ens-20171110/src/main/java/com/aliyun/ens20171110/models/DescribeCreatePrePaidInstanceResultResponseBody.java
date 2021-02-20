// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCreatePrePaidInstanceResultResponseBody extends TeaModel {
    @NameInMap("InstanceCreateResult")
    public DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult instanceCreateResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCreatePrePaidInstanceResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatePrePaidInstanceResultResponseBody self = new DescribeCreatePrePaidInstanceResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreatePrePaidInstanceResultResponseBody setInstanceCreateResult(DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult instanceCreateResult) {
        this.instanceCreateResult = instanceCreateResult;
        return this;
    }
    public DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult getInstanceCreateResult() {
        return this.instanceCreateResult;
    }

    public DescribeCreatePrePaidInstanceResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult extends TeaModel {
        @NameInMap("InstanceCreateStatus")
        public String instanceCreateStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult self = new DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult();
            return TeaModel.build(map, self);
        }

        public DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult setInstanceCreateStatus(String instanceCreateStatus) {
            this.instanceCreateStatus = instanceCreateStatus;
            return this;
        }
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
        }

        public DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
