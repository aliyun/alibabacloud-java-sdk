// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateRealTimeLogDeliveryResponseBody extends TeaModel {
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
