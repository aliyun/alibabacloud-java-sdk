// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDedicatedHostClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClusterAttributeResponse self = new ModifyDedicatedHostClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClusterAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
