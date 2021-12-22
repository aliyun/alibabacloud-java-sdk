// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetDeviceInstanceRequest extends TeaModel {
    // A short description of struct
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ResetDeviceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceInstanceRequest self = new ResetDeviceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResetDeviceInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ResetDeviceInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ResetDeviceInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
