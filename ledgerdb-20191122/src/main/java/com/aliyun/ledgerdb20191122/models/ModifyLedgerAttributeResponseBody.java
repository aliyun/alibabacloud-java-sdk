// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyLedgerAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLedgerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLedgerAttributeResponseBody self = new ModifyLedgerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLedgerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
