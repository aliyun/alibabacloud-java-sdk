// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAuditLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogConfigResponseBody self = new ModifyAuditLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
