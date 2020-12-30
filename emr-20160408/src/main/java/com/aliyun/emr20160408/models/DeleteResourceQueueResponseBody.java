// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteResourceQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceQueueResponseBody self = new DeleteResourceQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
