// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteLedgerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLedgerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLedgerResponseBody self = new DeleteLedgerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLedgerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
