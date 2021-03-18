// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoRenewAttributeResponseBody self = new ModifyDedicatedHostAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
