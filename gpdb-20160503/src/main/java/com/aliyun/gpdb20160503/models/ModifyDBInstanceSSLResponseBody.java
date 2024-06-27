// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD6EA90-EECB-4C12-9F26-0B6DB58710EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLResponseBody self = new ModifyDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
