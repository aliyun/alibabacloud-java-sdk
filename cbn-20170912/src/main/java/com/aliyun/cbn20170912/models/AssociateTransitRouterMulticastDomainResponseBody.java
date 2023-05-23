// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterMulticastDomainResponseBody extends TeaModel {
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
