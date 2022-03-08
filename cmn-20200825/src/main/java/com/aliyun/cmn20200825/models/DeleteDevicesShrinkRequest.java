// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDevicesShrinkRequest extends TeaModel {
    // 实例 ID列表。
    @NameInMap("DeviceIds")
    public String deviceIdsShrink;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesShrinkRequest self = new DeleteDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesShrinkRequest setDeviceIdsShrink(String deviceIdsShrink) {
        this.deviceIdsShrink = deviceIdsShrink;
        return this;
    }
    public String getDeviceIdsShrink() {
        return this.deviceIdsShrink;
    }

    public DeleteDevicesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
