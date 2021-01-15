// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceFormResponseBody extends TeaModel {
    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeviceFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceFormResponseBody self = new CreateDeviceFormResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceFormResponseBody setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public CreateDeviceFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
