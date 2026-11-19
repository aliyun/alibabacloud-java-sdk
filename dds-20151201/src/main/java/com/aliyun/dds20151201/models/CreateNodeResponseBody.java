// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeResponseBody extends TeaModel {
    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1b234bf7a4****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20951063702****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D48FB19-20CA-4725-A870-3D8F5CE6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeResponseBody self = new CreateNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateNodeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
