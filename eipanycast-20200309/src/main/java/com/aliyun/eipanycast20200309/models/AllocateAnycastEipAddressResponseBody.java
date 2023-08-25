// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AllocateAnycastEipAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

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

    public static AllocateAnycastEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateAnycastEipAddressResponseBody self = new AllocateAnycastEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateAnycastEipAddressResponseBody setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public AllocateAnycastEipAddressResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AllocateAnycastEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
