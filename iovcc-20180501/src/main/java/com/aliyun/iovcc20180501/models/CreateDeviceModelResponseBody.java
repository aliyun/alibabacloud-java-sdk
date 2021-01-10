// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceModelId")
    public Long deviceModelId;

    public static CreateDeviceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceModelResponseBody self = new CreateDeviceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceModelResponseBody setDeviceModelId(Long deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public Long getDeviceModelId() {
        return this.deviceModelId;
    }

}
