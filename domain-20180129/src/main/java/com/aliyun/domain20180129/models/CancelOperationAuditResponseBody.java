// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelOperationAuditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9KFCF6F8-243C-40EC-8035-4B12KKFD7D90</p>
     */
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
