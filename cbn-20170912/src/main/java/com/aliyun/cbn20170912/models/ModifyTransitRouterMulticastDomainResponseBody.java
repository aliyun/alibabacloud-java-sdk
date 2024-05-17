// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTransitRouterMulticastDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterMulticastDomainResponseBody self = new ModifyTransitRouterMulticastDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterMulticastDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
