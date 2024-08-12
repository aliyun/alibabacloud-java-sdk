// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class TransferVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7084CDB5-308F-5D0B-8F9B-5F7D83E09738</p>
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
