// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RunInstancesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the ECP instances.</p>
     */
    @NameInMap("InstanceIds")
    public RunInstancesResponseBodyInstanceIds instanceIds;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The price of the ECP resource.</p>
     */
    @NameInMap("TradePrice")
    public Float tradePrice;

    public static RunInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesResponseBody self = new RunInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunInstancesResponseBody setInstanceIds(RunInstancesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public RunInstancesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public RunInstancesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RunInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunInstancesResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static class RunInstancesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static RunInstancesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesResponseBodyInstanceIds self = new RunInstancesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public RunInstancesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
