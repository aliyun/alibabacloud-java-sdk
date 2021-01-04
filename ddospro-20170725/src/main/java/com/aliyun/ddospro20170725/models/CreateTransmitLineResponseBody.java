// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateTransmitLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTransmitLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransmitLineResponseBody self = new CreateTransmitLineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransmitLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
