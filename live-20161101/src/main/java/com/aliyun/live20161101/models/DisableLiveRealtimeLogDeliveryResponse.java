// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DisableLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLiveRealtimeLogDeliveryResponse self = new DisableLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DisableLiveRealtimeLogDeliveryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
