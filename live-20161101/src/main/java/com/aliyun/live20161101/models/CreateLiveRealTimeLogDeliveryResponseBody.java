// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveRealTimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveRealTimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRealTimeLogDeliveryResponseBody self = new CreateLiveRealTimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveRealTimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
