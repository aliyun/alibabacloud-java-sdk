// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteAsyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsyncTaskResponseBody self = new DeleteAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
