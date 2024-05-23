// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartDeviceInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplications operation. For more information, see the API documentation of ListApplications.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
