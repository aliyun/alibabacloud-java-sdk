// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EnableLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnableLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLiveRealtimeLogDeliveryResponse self = new EnableLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public EnableLiveRealtimeLogDeliveryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
