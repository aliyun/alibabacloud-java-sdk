// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateMyBaseResponseBody extends TeaModel {
    @NameInMap("OrderList")
    public CreateMyBaseResponseBodyOrderList orderList;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMyBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMyBaseResponseBody self = new CreateMyBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMyBaseResponseBody setOrderList(CreateMyBaseResponseBodyOrderList orderList) {
        this.orderList = orderList;
        return this;
    }
    public CreateMyBaseResponseBodyOrderList getOrderList() {
        return this.orderList;
    }

    public CreateMyBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMyBaseResponseBodyOrderListOrderList extends TeaModel {
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("ECSInstanceIds")
        public String ECSInstanceIds;

        @NameInMap("OrderId")
        public String orderId;

        public static CreateMyBaseResponseBodyOrderListOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateMyBaseResponseBodyOrderListOrderList self = new CreateMyBaseResponseBodyOrderListOrderList();
            return TeaModel.build(map, self);
        }

        public CreateMyBaseResponseBodyOrderListOrderList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public CreateMyBaseResponseBodyOrderListOrderList setECSInstanceIds(String ECSInstanceIds) {
            this.ECSInstanceIds = ECSInstanceIds;
            return this;
        }
        public String getECSInstanceIds() {
            return this.ECSInstanceIds;
        }

        public CreateMyBaseResponseBodyOrderListOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class CreateMyBaseResponseBodyOrderList extends TeaModel {
        @NameInMap("OrderList")
        public java.util.List<CreateMyBaseResponseBodyOrderListOrderList> orderList;

        public static CreateMyBaseResponseBodyOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateMyBaseResponseBodyOrderList self = new CreateMyBaseResponseBodyOrderList();
            return TeaModel.build(map, self);
        }

        public CreateMyBaseResponseBodyOrderList setOrderList(java.util.List<CreateMyBaseResponseBodyOrderListOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<CreateMyBaseResponseBodyOrderListOrderList> getOrderList() {
            return this.orderList;
        }

    }

}
