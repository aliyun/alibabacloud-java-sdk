// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class EnableDeviceRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    public static EnableDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDeviceRequest self = new EnableDeviceRequest();
        return TeaModel.build(map, self);
    }

    public EnableDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
