// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyUserEntitlementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserEntitlementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserEntitlementResponseBody self = new ModifyUserEntitlementResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserEntitlementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
