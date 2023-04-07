// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDevicesRequest extends TeaModel {
    /**
     * <p>The type of the Alibaba Cloud Workspace client that runs on the device.</p>
     * <br>
     * <p>*   1: the hardware client</p>
     * <p>*   2: the software client</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The list of devices.</p>
     */
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDevicesRequest self = new AddDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddDevicesRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public AddDevicesRequest setDeviceIds(java.util.List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public java.util.List<String> getDeviceIds() {
        return this.deviceIds;
    }

    public AddDevicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
