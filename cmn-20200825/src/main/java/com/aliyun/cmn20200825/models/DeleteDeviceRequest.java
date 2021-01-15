// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceId")
    public String deviceId;

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

}
