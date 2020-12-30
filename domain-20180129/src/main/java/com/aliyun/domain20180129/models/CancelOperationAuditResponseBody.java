// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelOperationAuditResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelOperationAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationAuditResponseBody self = new CancelOperationAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOperationAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
