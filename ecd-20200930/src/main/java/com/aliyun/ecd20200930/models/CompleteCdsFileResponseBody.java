// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CompleteCdsFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05C2791F-41A7-5E7C-B5E4-1401FD0E****</p>
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
