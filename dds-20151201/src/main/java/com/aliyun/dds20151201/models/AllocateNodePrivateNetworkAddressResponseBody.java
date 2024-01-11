// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class AllocateNodePrivateNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateNodePrivateNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateNodePrivateNetworkAddressResponseBody self = new AllocateNodePrivateNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateNodePrivateNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
