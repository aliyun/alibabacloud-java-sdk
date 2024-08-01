// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleasePublicNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D6AFE36-1AF5-4DE4-A954-672159D4CC69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePublicNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicNetworkAddressResponseBody self = new ReleasePublicNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePublicNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
