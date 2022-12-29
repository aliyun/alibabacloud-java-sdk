// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeBatchResponseBody extends TeaModel {
    // The ID of the added mongos or shard node.
    @NameInMap("NodeId")
    public String nodeId;

    // The ID of the order.
    @NameInMap("OrderId")
    public String orderId;

    // The ID of the request.
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
