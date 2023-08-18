// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueResponseBody self = new UpdateQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
