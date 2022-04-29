// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderCreateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public OrderCreateResponseBodyResult result;

    public static OrderCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderCreateResponseBody self = new OrderCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OrderCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderCreateResponseBody setResult(OrderCreateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public OrderCreateResponseBodyResult getResult() {
        return this.result;
    }

    public static class OrderCreateResponseBodyResult extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        public static OrderCreateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            OrderCreateResponseBodyResult self = new OrderCreateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public OrderCreateResponseBodyResult setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
