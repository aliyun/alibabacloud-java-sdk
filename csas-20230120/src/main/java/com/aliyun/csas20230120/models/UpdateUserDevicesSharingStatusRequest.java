// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesSharingStatusRequest extends TeaModel {
    /**
     * <p>Collection of device IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceTags")
    public java.util.List<String> deviceTags;

    /**
     * <p>Indicates whether device sharing is enabled. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable sharing.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable sharing.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharingStatus")
    public Boolean sharingStatus;

    public static UpdateUserDevicesSharingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDevicesSharingStatusRequest self = new UpdateUserDevicesSharingStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserDevicesSharingStatusRequest setDeviceTags(java.util.List<String> deviceTags) {
        this.deviceTags = deviceTags;
        return this;
    }
    public java.util.List<String> getDeviceTags() {
        return this.deviceTags;
    }

    public UpdateUserDevicesSharingStatusRequest setSharingStatus(Boolean sharingStatus) {
        this.sharingStatus = sharingStatus;
        return this;
    }
    public Boolean getSharingStatus() {
        return this.sharingStatus;
    }

}
