// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelOrderRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelOrderRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequestResponseBody self = new CancelOrderRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
