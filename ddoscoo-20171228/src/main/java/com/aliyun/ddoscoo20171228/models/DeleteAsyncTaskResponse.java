// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteAsyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsyncTaskResponse self = new DeleteAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAsyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
