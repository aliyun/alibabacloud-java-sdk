// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartDeviceInstanceRequest extends TeaModel {
    // App ID
    @NameInMap("AppId")
    public String appId;

    // Instance ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static RestartDeviceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDeviceInstanceRequest self = new RestartDeviceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDeviceInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartDeviceInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
