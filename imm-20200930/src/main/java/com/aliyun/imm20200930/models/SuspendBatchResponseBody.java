// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SuspendBatchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EC564A9A-BA5C-4499-A087-D9B9E76E*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SuspendBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendBatchResponseBody self = new SuspendBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
