// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static CreateDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskResponse self = new CreateDiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiskResponse setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateDiskResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
