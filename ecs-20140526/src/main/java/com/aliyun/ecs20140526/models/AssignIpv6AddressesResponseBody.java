// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssignIpv6AddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesResponseBody self = new AssignIpv6AddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignIpv6AddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
