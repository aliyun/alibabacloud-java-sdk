// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleaseNodePrivateNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseNodePrivateNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseNodePrivateNetworkAddressResponseBody self = new ReleaseNodePrivateNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseNodePrivateNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
