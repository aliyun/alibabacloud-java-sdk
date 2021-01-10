// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EnableLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLiveRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLiveRealtimeLogDeliveryResponseBody self = new EnableLiveRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLiveRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
