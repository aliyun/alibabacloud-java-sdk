// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteQueueResponseBody extends TeaModel {
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
