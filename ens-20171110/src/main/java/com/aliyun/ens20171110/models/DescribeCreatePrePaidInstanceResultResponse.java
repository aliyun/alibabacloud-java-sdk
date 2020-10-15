// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCreatePrePaidInstanceResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceCreateResult")
    @Validation(required = true)
    public DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult instanceCreateResult;

    public static DescribeCreatePrePaidInstanceResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatePrePaidInstanceResultResponse self = new DescribeCreatePrePaidInstanceResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreatePrePaidInstanceResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreatePrePaidInstanceResultResponse setInstanceCreateResult(DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult instanceCreateResult) {
        this.instanceCreateResult = instanceCreateResult;
        return this;
    }
    public DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult getInstanceCreateResult() {
        return this.instanceCreateResult;
    }

    public static class DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult extends TeaModel {
        @NameInMap("InstanceCreateStatus")
        @Validation(required = true)
        public String instanceCreateStatus;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult self = new DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult();
            return TeaModel.build(map, self);
        }

        public DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult setInstanceCreateStatus(String instanceCreateStatus) {
            this.instanceCreateStatus = instanceCreateStatus;
            return this;
        }
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
        }

        public DescribeCreatePrePaidInstanceResultResponseInstanceCreateResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
