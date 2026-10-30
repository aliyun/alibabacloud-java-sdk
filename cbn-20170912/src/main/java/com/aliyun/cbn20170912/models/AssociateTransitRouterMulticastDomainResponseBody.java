// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F88AC12C-943B-50E9-A344-4F8820BB07A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateTransitRouterMulticastDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterMulticastDomainResponseBody self = new AssociateTransitRouterMulticastDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterMulticastDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
