// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Unbound</p>
     */
    @NameInMap("DeviceAction")
    public String deviceAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceTags")
    public java.util.List<String> deviceTags;

    public static UpdateUserDevicesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDevicesStatusRequest self = new UpdateUserDevicesStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserDevicesStatusRequest setDeviceAction(String deviceAction) {
        this.deviceAction = deviceAction;
        return this;
    }
    public String getDeviceAction() {
        return this.deviceAction;
    }

    public UpdateUserDevicesStatusRequest setDeviceTags(java.util.List<String> deviceTags) {
        this.deviceTags = deviceTags;
        return this;
    }
    public java.util.List<String> getDeviceTags() {
        return this.deviceTags;
    }

}
