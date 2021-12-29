// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class EnableDeviceGroupRequest extends TeaModel {
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static EnableDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDeviceGroupRequest self = new EnableDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public EnableDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
