// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceId")
    public String deviceId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceRequest self = new GetDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
