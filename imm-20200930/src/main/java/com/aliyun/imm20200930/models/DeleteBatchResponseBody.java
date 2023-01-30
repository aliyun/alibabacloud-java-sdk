// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchResponseBody self = new DeleteBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
