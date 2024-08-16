// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>94E19C6F-206F-5223-9A63-64B85851BC04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the multicast domain.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-mcast-domain-40cwj0rgzgdtam****</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    public static CreateTransitRouterMulticastDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterMulticastDomainResponseBody self = new CreateTransitRouterMulticastDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterMulticastDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterMulticastDomainResponseBody setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

}
