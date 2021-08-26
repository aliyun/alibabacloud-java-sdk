// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static BatchIndexFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaResponseBody self = new BatchIndexFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
