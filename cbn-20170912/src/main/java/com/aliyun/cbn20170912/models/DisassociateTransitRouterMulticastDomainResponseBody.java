// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisassociateTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6F6B3FF0-45D1-5416-B189-C45A42A0222B</p>
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
