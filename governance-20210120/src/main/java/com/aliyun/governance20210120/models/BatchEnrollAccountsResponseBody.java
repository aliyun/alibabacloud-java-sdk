// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class BatchEnrollAccountsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16B208DD-86BD-5E7D-AC93-FFD44B6FBDF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchEnrollAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEnrollAccountsResponseBody self = new BatchEnrollAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchEnrollAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
