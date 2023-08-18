// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class BindQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindQueueResponseBody self = new BindQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public BindQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
