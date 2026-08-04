// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesStatusRequest extends TeaModel {
    /**
     * <p>The action to perform on the endpoint device status. Valid values:</p>
     * <ul>
     * <li><p><strong>Locked</strong>: Lock the device.</p>
     * </li>
     * <li><p><strong>Lost</strong>: Report the device as lost.</p>
     * </li>
     * <li><p><strong>Unbound</strong>: Detach the device. You can detach only offline or long-term offline devices.</p>
     * </li>
     * <li><p><strong>Unlocked</strong>: Unlock the device. You can unlock only locked devices.</p>
     * </li>
     * <li><p><strong>Found</strong>: Mark the device as found. You can mark only lost devices as found.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Unbound</p>
     */
    @NameInMap("DeviceAction")
    public String deviceAction;

    /**
     * <p>A list of endpoint device IDs.</p>
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
