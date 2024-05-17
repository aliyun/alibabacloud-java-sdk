// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisassociateTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateTransitRouterMulticastDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateTransitRouterMulticastDomainResponseBody self = new DisassociateTransitRouterMulticastDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateTransitRouterMulticastDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
