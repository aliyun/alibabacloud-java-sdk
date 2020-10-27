// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoReleaseTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDedicatedHostAutoReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoReleaseTimeResponse self = new ModifyDedicatedHostAutoReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
