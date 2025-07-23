// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigAuditLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>42B118FB-16A6-56FB-B877-D58637EEC6AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigAuditLogResponseBody self = new ConfigAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
