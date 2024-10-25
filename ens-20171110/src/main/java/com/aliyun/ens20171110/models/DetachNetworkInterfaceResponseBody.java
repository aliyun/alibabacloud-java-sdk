// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE1B8ECF-9507-4C78-B197-5DE9FED344AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkInterfaceResponseBody self = new DetachNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
