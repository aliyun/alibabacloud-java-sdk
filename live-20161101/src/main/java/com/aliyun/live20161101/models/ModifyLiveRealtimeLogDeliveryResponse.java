// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveRealtimeLogDeliveryResponse self = new ModifyLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveRealtimeLogDeliveryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
