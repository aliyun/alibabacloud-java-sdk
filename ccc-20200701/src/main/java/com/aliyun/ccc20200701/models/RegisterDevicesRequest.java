// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RegisterDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("UserIdListJson")
    public String userIdListJson;

    public static RegisterDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDevicesRequest self = new RegisterDevicesRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RegisterDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RegisterDevicesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RegisterDevicesRequest setUserIdListJson(String userIdListJson) {
        this.userIdListJson = userIdListJson;
        return this;
    }
    public String getUserIdListJson() {
        return this.userIdListJson;
    }

}
