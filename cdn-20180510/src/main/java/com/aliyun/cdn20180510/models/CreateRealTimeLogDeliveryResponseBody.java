// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateRealTimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRealTimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRealTimeLogDeliveryResponseBody self = new CreateRealTimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRealTimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
