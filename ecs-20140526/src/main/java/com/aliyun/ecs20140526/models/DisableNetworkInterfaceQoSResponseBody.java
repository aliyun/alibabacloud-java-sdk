// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableNetworkInterfaceQoSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>745CEC9F-0DD7-4451-9FE7-8B752F39****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableNetworkInterfaceQoSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableNetworkInterfaceQoSResponseBody self = new DisableNetworkInterfaceQoSResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableNetworkInterfaceQoSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
