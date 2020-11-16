// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveRealTimeLogDeliveryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateLiveRealTimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRealTimeLogDeliveryResponse self = new CreateLiveRealTimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveRealTimeLogDeliveryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
