// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignIpv6AddressesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassignIpv6AddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassignIpv6AddressesResponseBody self = new UnassignIpv6AddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassignIpv6AddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
