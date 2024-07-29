// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public CreateOrderResponseBodyInstanceIds instanceIds;

    /**
     * <strong>example:</strong>
     * <p>202********0117</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>4ca591b5-bc30-4fa7-aeaa-c4d0ec5d24ed</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setInstanceIds(CreateOrderResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public CreateOrderResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public CreateOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrderResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static CreateOrderResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyInstanceIds self = new CreateOrderResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
