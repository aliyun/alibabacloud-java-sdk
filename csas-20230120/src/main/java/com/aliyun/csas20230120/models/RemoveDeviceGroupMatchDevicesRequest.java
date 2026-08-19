// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveDeviceGroupMatchDevicesRequest extends TeaModel {
    /**
     * <p>The collection of terminal device IDs to be removed. At least one ID must be specified, and duplicate values are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DevTags")
    public java.util.List<String> devTags;

    /**
     * <p>The device label ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device-group-5191cf830a5e****</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static RemoveDeviceGroupMatchDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDeviceGroupMatchDevicesRequest self = new RemoveDeviceGroupMatchDevicesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDeviceGroupMatchDevicesRequest setDevTags(java.util.List<String> devTags) {
        this.devTags = devTags;
        return this;
    }
    public java.util.List<String> getDevTags() {
        return this.devTags;
    }

    public RemoveDeviceGroupMatchDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
