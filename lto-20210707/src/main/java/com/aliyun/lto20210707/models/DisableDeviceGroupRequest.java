// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DisableDeviceGroupRequest extends TeaModel {
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static DisableDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceGroupRequest self = new DisableDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DisableDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
