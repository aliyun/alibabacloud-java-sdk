// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealtimeLogDeliveryResponseBody self = new DeleteRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
