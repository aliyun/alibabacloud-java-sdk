// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceResponseBody extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponseBody self = new CreateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
