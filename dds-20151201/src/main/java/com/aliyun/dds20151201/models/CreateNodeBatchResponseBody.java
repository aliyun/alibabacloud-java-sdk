// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeBatchResponseBody extends TeaModel {
    /**
     * <p>The ID of the added mongos or shard node.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp18f7d6b6a7****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>50179021707****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>55D41A94-1ACE-55E8-8BC7-67D622E7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNodeBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeBatchResponseBody self = new CreateNodeBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeBatchResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateNodeBatchResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateNodeBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
