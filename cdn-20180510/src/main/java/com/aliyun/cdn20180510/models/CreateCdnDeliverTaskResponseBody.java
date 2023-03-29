// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskResponseBody extends TeaModel {
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

    public static CreateCdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnDeliverTaskResponseBody self = new CreateCdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdnDeliverTaskResponseBody setDeliverId(String deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public String getDeliverId() {
        return this.deliverId;
    }

    public CreateCdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
