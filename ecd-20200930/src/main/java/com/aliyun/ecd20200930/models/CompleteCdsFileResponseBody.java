// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CompleteCdsFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CompleteCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteCdsFileResponseBody self = new CompleteCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
