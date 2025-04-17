// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersResponseBody extends TeaModel {
    /**
     * <p>The ID of the product purchase request.</p>
     * 
     * <strong>example:</strong>
     * <p>3ed6a882-0d85-4dd8-ad36-cd8d74ab9fdb</p>
     */
    @NameInMap("BuyProductRequestId")
    public String buyProductRequestId;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The purchase order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>210292536260646</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ksdjf-jksd-*****slkdjf</p>
     */
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
