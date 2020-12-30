// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateResourceQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceQueueResponseBody self = new CreateResourceQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
