// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetBatchResponseBody extends TeaModel {
    @NameInMap("Batch")
    public DataIngestion batch;

    @NameInMap("RequestId")
    public String requestId;

    public static GetBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchResponseBody self = new GetBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchResponseBody setBatch(DataIngestion batch) {
        this.batch = batch;
        return this;
    }
    public DataIngestion getBatch() {
        return this.batch;
    }

    public GetBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
