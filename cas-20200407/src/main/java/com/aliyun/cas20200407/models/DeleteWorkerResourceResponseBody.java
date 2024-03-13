// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWorkerResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWorkerResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkerResourceResponseBody self = new DeleteWorkerResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkerResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
