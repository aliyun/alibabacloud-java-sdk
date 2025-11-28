// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DisableDeviceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceGroupRequest self = new DisableDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DisableDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public DisableDeviceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
