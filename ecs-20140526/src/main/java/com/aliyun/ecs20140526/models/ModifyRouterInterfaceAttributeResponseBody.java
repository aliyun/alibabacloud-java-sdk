// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRouterInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceAttributeResponseBody self = new ModifyRouterInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
