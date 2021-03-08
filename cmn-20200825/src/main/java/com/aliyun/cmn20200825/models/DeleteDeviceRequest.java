// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceId")
    public String deviceId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceRequest self = new DeleteDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DeleteDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
