// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceResourceRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDeviceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResourceRequest self = new DeleteDeviceResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceResourceRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public DeleteDeviceResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
