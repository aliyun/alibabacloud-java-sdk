// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDedicatedHostAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoRenewAttributeResponse self = new ModifyDedicatedHostAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
