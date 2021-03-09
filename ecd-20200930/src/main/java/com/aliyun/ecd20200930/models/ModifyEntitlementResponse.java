// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyEntitlementResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyEntitlementResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEntitlementResponse self = new ModifyEntitlementResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEntitlementResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
