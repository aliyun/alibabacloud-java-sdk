// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigDateRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceId")
    public String deviceId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDeviceConfigDateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigDateRequest self = new GetDeviceConfigDateRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigDateRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceConfigDateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
