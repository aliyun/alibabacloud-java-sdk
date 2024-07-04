// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartDeviceInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplications operation. For more information, see the API documentation of ListApplications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f829265e-2f6f-4088-a4be-c1fb95ab45f9</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5slvdwcxf6ch81nl4r7p04j5q</p>
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
