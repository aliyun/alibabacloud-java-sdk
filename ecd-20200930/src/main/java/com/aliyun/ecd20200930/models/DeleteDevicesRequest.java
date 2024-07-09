// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDevicesRequest extends TeaModel {
    /**
     * <p>The type of the client.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: hardware client.</li>
     * <li>2: software client.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The IDs of the devices. You can specify up to 200 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

    /**
     * <p>Specifies whether to forcefully delete the device if the device is bound to a user.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: do not forcefully delete the device.</li>
     * <li>1: forcefully delete the device.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Force")
    public Integer force;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
