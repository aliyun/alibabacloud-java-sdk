// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchSetLiveDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetLiveDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetLiveDomainConfigsResponseBody self = new BatchSetLiveDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetLiveDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
