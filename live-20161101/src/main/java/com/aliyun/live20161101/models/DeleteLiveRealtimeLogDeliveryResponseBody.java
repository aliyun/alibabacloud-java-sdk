// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRealtimeLogDeliveryResponseBody self = new DeleteLiveRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
