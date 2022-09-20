// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class BatchCheckSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchCheckSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckSessionResponseBody self = new BatchCheckSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCheckSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
