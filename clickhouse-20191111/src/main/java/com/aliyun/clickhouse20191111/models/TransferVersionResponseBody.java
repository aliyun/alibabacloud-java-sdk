// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class TransferVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransferVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferVersionResponseBody self = new TransferVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
