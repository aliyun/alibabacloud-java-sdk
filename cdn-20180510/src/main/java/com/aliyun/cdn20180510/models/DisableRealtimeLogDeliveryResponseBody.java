// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DisableRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableRealtimeLogDeliveryResponseBody self = new DisableRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
