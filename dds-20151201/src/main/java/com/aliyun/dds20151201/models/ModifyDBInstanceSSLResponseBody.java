// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLResponseBody extends TeaModel {
    // The ID of the request.
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
