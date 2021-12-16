// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ChangeWorkModeRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkMode")
    public String workMode;

    public static ChangeWorkModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeWorkModeRequest self = new ChangeWorkModeRequest();
        return TeaModel.build(map, self);
    }

    public ChangeWorkModeRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ChangeWorkModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeWorkModeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ChangeWorkModeRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
