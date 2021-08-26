// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteDatasetResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetResponseBody self = new DeleteDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
