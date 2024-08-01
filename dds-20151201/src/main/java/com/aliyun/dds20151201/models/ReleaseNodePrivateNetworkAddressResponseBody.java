// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleaseNodePrivateNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0FDDC511-7252-4A4A-ADDA-5CB1BF63873D</p>
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
