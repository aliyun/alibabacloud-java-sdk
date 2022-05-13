// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyEntitlementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEntitlementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEntitlementResponseBody self = new ModifyEntitlementResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEntitlementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
