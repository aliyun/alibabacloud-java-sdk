// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the replication pair.</p>
     * 
     * <strong>example:</strong>
     * <p>pair-cn-dsa****</p>
     */
    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairResponseBody self = new CreateDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDiskReplicaPairResponseBody setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public CreateDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
