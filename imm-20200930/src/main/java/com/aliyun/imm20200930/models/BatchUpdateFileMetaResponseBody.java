// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static BatchUpdateFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaResponseBody self = new BatchUpdateFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
