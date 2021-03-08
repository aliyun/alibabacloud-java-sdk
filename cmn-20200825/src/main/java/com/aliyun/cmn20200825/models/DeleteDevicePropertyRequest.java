// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDevicePropertyRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DevicePropertyId")
    public String devicePropertyId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicePropertyRequest self = new DeleteDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicePropertyRequest setDevicePropertyId(String devicePropertyId) {
        this.devicePropertyId = devicePropertyId;
        return this;
    }
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    public DeleteDevicePropertyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
