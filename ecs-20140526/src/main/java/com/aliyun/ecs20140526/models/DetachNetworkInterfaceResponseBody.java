// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceResponseBody extends TeaModel {
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
