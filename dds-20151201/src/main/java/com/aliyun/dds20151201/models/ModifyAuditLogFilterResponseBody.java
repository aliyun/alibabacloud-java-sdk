// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditLogFilterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAuditLogFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogFilterResponseBody self = new ModifyAuditLogFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
