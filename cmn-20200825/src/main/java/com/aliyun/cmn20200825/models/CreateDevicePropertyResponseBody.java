// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDevicePropertyResponseBody extends TeaModel {
    @NameInMap("DevicePropertyId")
    public String devicePropertyId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePropertyResponseBody self = new CreateDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDevicePropertyResponseBody setDevicePropertyId(String devicePropertyId) {
        this.devicePropertyId = devicePropertyId;
        return this;
    }
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    public CreateDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
