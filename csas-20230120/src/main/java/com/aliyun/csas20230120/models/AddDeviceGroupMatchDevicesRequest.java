// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceGroupMatchDevicesRequest extends TeaModel {
    /**
     * <p>The IDs of the terminal devices to add. You must specify at least one ID, and the IDs must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DevTags")
    public java.util.List<String> devTags;

    /**
     * <p>The ID of the device tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device-group-5191cf830a5e****</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static AddDeviceGroupMatchDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceGroupMatchDevicesRequest self = new AddDeviceGroupMatchDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceGroupMatchDevicesRequest setDevTags(java.util.List<String> devTags) {
        this.devTags = devTags;
        return this;
    }
    public java.util.List<String> getDevTags() {
        return this.devTags;
    }

    public AddDeviceGroupMatchDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
