// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ConnectAssistDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConnectAssistDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConnectAssistDeviceResponseBody self = new ConnectAssistDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConnectAssistDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
