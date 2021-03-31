// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyNetworkInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkInterfaceAttributeResponse self = new ModifyNetworkInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkInterfaceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
