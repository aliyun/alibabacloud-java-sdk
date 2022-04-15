// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupMembersResponseBody extends TeaModel {
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
