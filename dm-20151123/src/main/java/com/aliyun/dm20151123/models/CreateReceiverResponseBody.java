// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateReceiverResponseBody extends TeaModel {
    /**
     * <p>Receiver list ID</p>
     * 
     * <strong>example:</strong>
     * <p>7312e09b8fffc5c7b2e2fbf5b6dc2073</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
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
