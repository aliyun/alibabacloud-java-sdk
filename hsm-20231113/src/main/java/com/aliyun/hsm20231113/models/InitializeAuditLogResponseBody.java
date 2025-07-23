// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class InitializeAuditLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FE969D9-E1C7-5274-BE7D-8C3534587605</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeAuditLogResponseBody self = new InitializeAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
