// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCreatePrePaidInstanceResultResponseBody extends TeaModel {
    /**
     * <p>Returned results of creating an instance.</p>
     */
    @NameInMap("InstanceCreateResult")
    public DescribeCreatePrePaidInstanceResultResponseBodyInstanceCreateResult instanceCreateResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
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
        /**
         * <p>The status of the instance creation.</p>
         * <ul>
         * <li>Accepted</li>
         * <li>Creating</li>
         * <li>Failed</li>
         * <li>Successed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successed</p>
         */
        @NameInMap("InstanceCreateStatus")
        public String instanceCreateStatus;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-6ecpqvkicnchxccozrpxxxx</p>
         */
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
