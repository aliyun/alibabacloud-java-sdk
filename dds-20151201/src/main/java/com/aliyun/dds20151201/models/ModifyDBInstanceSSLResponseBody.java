// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6D806B11-078F-4154-BF9F-844F56D08964</p>
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
