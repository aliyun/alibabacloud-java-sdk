// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeleteTransmitLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransmitLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransmitLineResponseBody self = new DeleteTransmitLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransmitLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
