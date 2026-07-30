// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateVirtualBridgeResponseBody extends TeaModel {
    /**
     * <p>The virtual bridge ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-sjfaijfish***</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>93AD30C1-16B8-5C54-AD23-A51FF53F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVirtualBridgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBridgeResponseBody self = new CreateVirtualBridgeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBridgeResponseBody setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public CreateVirtualBridgeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateVirtualBridgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
