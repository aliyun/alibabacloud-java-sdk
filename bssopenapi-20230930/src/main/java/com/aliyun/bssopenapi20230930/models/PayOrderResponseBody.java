// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class PayOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>260591304500425</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayStatus")
    public Long payStatus;

    /**
     * <strong>example:</strong>
     * <p>201437655683478597</p>
     */
    @NameInMap("PayerId")
    public Long payerId;

    /**
     * <strong>example:</strong>
     * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PayOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PayOrderResponseBody self = new PayOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public PayOrderResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public PayOrderResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public PayOrderResponseBody setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public Long getPayStatus() {
        return this.payStatus;
    }

    public PayOrderResponseBody setPayerId(Long payerId) {
        this.payerId = payerId;
        return this;
    }
    public Long getPayerId() {
        return this.payerId;
    }

    public PayOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
