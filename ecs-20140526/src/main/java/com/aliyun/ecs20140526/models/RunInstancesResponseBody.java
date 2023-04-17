// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunInstancesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the instances (`InstanceIdSet`).</p>
     */
    @NameInMap("InstanceIdSets")
    public RunInstancesResponseBodyInstanceIdSets instanceIdSets;

    /**
     * <p>The ID of the order. This parameter is returned only when `InstanceChargeType` is set to PrePaid.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transaction price.</p>
     */
    @NameInMap("TradePrice")
    public Float tradePrice;

    public static RunInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesResponseBody self = new RunInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunInstancesResponseBody setInstanceIdSets(RunInstancesResponseBodyInstanceIdSets instanceIdSets) {
        this.instanceIdSets = instanceIdSets;
        return this;
    }
    public RunInstancesResponseBodyInstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
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

    public static class RunInstancesResponseBodyInstanceIdSets extends TeaModel {
        @NameInMap("InstanceIdSet")
        public java.util.List<String> instanceIdSet;

        public static RunInstancesResponseBodyInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesResponseBodyInstanceIdSets self = new RunInstancesResponseBodyInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public RunInstancesResponseBodyInstanceIdSets setInstanceIdSet(java.util.List<String> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<String> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
