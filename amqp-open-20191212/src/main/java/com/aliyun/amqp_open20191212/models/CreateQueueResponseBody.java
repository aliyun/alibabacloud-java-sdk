// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateQueueResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueResponseBody self = new CreateQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
