// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RemoveWirelessCloudConnectorFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveWirelessCloudConnectorFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveWirelessCloudConnectorFromGroupResponseBody self = new RemoveWirelessCloudConnectorFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveWirelessCloudConnectorFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
