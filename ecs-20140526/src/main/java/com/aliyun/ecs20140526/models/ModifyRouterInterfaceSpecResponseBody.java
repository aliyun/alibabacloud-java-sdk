// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecResponseBody extends TeaModel {
    @NameInMap("Spec")
    public String spec;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRouterInterfaceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecResponseBody self = new ModifyRouterInterfaceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceSpecResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ModifyRouterInterfaceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
