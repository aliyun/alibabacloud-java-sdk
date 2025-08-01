// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DisableLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLiveRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLiveRealtimeLogDeliveryResponseBody self = new DisableLiveRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLiveRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
