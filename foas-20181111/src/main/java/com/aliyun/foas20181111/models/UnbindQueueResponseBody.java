// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UnbindQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindQueueResponseBody self = new UnbindQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
