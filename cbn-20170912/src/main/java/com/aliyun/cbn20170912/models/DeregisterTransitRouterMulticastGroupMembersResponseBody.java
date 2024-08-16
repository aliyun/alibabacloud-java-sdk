// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupMembersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>61D0A553-5E4E-53B5-9DA3-01CBA076A286</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeregisterTransitRouterMulticastGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTransitRouterMulticastGroupMembersResponseBody self = new DeregisterTransitRouterMulticastGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterTransitRouterMulticastGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
