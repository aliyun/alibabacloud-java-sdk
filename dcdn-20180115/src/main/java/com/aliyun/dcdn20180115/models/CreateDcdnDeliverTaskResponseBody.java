// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the tracking task.</p>
     */
    @NameInMap("DeliverId")
    public String deliverId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDeliverTaskResponseBody self = new CreateDcdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDeliverTaskResponseBody setDeliverId(String deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public String getDeliverId() {
        return this.deliverId;
    }

    public CreateDcdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
