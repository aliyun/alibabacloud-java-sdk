// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLiveRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveRealtimeLogDeliveryResponseBody self = new ModifyLiveRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
