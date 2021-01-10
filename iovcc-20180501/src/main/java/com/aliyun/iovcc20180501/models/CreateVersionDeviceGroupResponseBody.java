// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static CreateVersionDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionDeviceGroupResponseBody self = new CreateVersionDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVersionDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVersionDeviceGroupResponseBody setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
