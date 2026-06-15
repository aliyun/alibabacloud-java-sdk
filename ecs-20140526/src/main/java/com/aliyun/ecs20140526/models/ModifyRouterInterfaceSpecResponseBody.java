// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The new specification of the router interface.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ModifyRouterInterfaceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecResponseBody self = new ModifyRouterInterfaceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRouterInterfaceSpecResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
