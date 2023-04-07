// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDevicesRequest extends TeaModel {
    /**
     * <p>The type of the device.</p>
     * <br>
     * <p>*   1: the hardware client device</p>
     * <p>*   2: the software client device</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The list of universally unique identifiers (UUIDs) of devices.</p>
     */
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

    /**
     * <p>Specifies whether to forcefully delete the device.</p>
     * <br>
     * <p>*   1: forcefully deletes the device.</p>
     * <p>*   0: does not forcefully delete the device. (You cannot delete a device to which a user is bound.)</p>
     */
    @NameInMap("Force")
    public Integer force;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesRequest self = new DeleteDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public DeleteDevicesRequest setDeviceIds(java.util.List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public java.util.List<String> getDeviceIds() {
        return this.deviceIds;
    }

    public DeleteDevicesRequest setForce(Integer force) {
        this.force = force;
        return this;
    }
    public Integer getForce() {
        return this.force;
    }

    public DeleteDevicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
