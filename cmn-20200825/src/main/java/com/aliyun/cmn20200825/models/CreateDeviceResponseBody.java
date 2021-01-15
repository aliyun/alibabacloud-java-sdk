// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("DeviceId")
    public String deviceId;

    public static CreateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponseBody self = new CreateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
