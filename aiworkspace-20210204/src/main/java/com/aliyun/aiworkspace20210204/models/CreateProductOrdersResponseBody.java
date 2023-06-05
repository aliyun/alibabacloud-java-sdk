// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersResponseBody extends TeaModel {
    @NameInMap("BuyProductRequestId")
    public String buyProductRequestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateProductOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductOrdersResponseBody self = new CreateProductOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductOrdersResponseBody setBuyProductRequestId(String buyProductRequestId) {
        this.buyProductRequestId = buyProductRequestId;
        return this;
    }
    public String getBuyProductRequestId() {
        return this.buyProductRequestId;
    }

    public CreateProductOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateProductOrdersResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateProductOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
