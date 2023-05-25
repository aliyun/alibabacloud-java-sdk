// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskResponseBody extends TeaModel {
    /**
     * <p>The cloud disk ID.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The order ID.</p>
     * <br>
     * <p>> The order ID is returned only when you create a subscription disk.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskResponseBody self = new CreateDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskResponseBody setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateDiskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
