// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteQueueResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>92385FD2-624A-48C9-8FB5-753F2AFA***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueueResponseBody self = new DeleteQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
