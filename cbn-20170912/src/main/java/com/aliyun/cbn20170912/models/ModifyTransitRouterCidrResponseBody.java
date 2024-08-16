// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCidrResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
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
