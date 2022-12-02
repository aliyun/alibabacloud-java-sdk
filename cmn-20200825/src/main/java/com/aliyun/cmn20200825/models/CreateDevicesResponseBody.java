// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDevicesResponseBody extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicesResponseBody self = new CreateDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDevicesResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
