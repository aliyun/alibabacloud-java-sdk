// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public OrderQueryStatusResponseBodyResult result;

    public static OrderQueryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryStatusResponseBody self = new OrderQueryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderQueryStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OrderQueryStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderQueryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderQueryStatusResponseBody setResult(OrderQueryStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public OrderQueryStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class OrderQueryStatusResponseBodyResult extends TeaModel {
        @NameInMap("OrderStatus")
        public String orderStatus;

        public static OrderQueryStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryStatusResponseBodyResult self = new OrderQueryStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public OrderQueryStatusResponseBodyResult setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

    }

}
