// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DisableDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceRequest self = new DisableDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DisableDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DisableDeviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
