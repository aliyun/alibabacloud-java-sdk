// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderParams")
    public OrderParams orderParams;

    @NameInMap("RelatedOrderItemSets")
    public RelatedOrderItemSets relatedOrderItemSets;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TradePrice")
    public Float tradePrice;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateOrderResponseBody setOrderParams(OrderParams orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public OrderParams getOrderParams() {
        return this.orderParams;
    }

    public CreateOrderResponseBody setRelatedOrderItemSets(RelatedOrderItemSets relatedOrderItemSets) {
        this.relatedOrderItemSets = relatedOrderItemSets;
        return this;
    }
    public RelatedOrderItemSets getRelatedOrderItemSets() {
        return this.relatedOrderItemSets;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateOrderResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static class OrderParams extends TeaModel {
        @NameInMap("OrderParam")
        public java.util.List<String> orderParam;

        public static OrderParams build(java.util.Map<String, ?> map) throws Exception {
            OrderParams self = new OrderParams();
            return TeaModel.build(map, self);
        }

        public OrderParams setOrderParam(java.util.List<String> orderParam) {
            this.orderParam = orderParam;
            return this;
        }
        public java.util.List<String> getOrderParam() {
            return this.orderParam;
        }

    }

    public static class InstanceIdSet extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static InstanceIdSet build(java.util.Map<String, ?> map) throws Exception {
            InstanceIdSet self = new InstanceIdSet();
            return TeaModel.build(map, self);
        }

        public InstanceIdSet setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class RelatedOrderIds extends TeaModel {
        @NameInMap("RelatedOrderId")
        public java.util.List<String> relatedOrderId;

        public static RelatedOrderIds build(java.util.Map<String, ?> map) throws Exception {
            RelatedOrderIds self = new RelatedOrderIds();
            return TeaModel.build(map, self);
        }

        public RelatedOrderIds setRelatedOrderId(java.util.List<String> relatedOrderId) {
            this.relatedOrderId = relatedOrderId;
            return this;
        }
        public java.util.List<String> getRelatedOrderId() {
            return this.relatedOrderId;
        }

    }

    public static class RelatedOrderItemSet extends TeaModel {
        @NameInMap("InstanceIdSet")
        public InstanceIdSet instanceIdSet;

        @NameInMap("RelatedOrderIds")
        public RelatedOrderIds relatedOrderIds;

        public static RelatedOrderItemSet build(java.util.Map<String, ?> map) throws Exception {
            RelatedOrderItemSet self = new RelatedOrderItemSet();
            return TeaModel.build(map, self);
        }

        public RelatedOrderItemSet setInstanceIdSet(InstanceIdSet instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public InstanceIdSet getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public RelatedOrderItemSet setRelatedOrderIds(RelatedOrderIds relatedOrderIds) {
            this.relatedOrderIds = relatedOrderIds;
            return this;
        }
        public RelatedOrderIds getRelatedOrderIds() {
            return this.relatedOrderIds;
        }

    }

    public static class RelatedOrderItemSets extends TeaModel {
        @NameInMap("RelatedOrderItemSet")
        public java.util.List<RelatedOrderItemSet> relatedOrderItemSet;

        public static RelatedOrderItemSets build(java.util.Map<String, ?> map) throws Exception {
            RelatedOrderItemSets self = new RelatedOrderItemSets();
            return TeaModel.build(map, self);
        }

        public RelatedOrderItemSets setRelatedOrderItemSet(java.util.List<RelatedOrderItemSet> relatedOrderItemSet) {
            this.relatedOrderItemSet = relatedOrderItemSet;
            return this;
        }
        public java.util.List<RelatedOrderItemSet> getRelatedOrderItemSet() {
            return this.relatedOrderItemSet;
        }

    }

}
