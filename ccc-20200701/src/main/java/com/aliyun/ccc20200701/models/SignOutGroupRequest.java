// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignOutGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static SignOutGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SignOutGroupRequest self = new SignOutGroupRequest();
        return TeaModel.build(map, self);
    }

    public SignOutGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SignOutGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SignOutGroupRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
