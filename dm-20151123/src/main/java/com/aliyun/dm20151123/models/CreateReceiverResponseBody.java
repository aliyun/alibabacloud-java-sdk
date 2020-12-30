// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateReceiverResponseBody extends TeaModel {
    @NameInMap("ReceiverId")
    public String receiverId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateReceiverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReceiverResponseBody self = new CreateReceiverResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReceiverResponseBody setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public CreateReceiverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
