// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class RemoveIpAddressesFromEgressProxyIpPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>017E7009-8930-5511-BAE6-BFFDFA21A48A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveIpAddressesFromEgressProxyIpPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpAddressesFromEgressProxyIpPoolResponseBody self = new RemoveIpAddressesFromEgressProxyIpPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveIpAddressesFromEgressProxyIpPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
