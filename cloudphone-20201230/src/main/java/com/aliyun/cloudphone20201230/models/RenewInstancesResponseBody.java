// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RenewInstancesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the instances that are renewed.</p>
     */
    @NameInMap("InstanceIds")
    public RenewInstancesResponseBodyInstanceIds instanceIds;

    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewInstancesResponseBody self = new RenewInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewInstancesResponseBody setInstanceIds(RenewInstancesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public RenewInstancesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public RenewInstancesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RenewInstancesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static RenewInstancesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            RenewInstancesResponseBodyInstanceIds self = new RenewInstancesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public RenewInstancesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
