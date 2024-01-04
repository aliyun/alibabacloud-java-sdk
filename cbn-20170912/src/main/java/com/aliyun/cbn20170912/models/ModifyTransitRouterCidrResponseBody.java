// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCidrResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTransitRouterCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCidrResponseBody self = new ModifyTransitRouterCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
