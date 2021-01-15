// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDevicePropertyRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DevicePropertyId")
    public String devicePropertyId;

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

}
