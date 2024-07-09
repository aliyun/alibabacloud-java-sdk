// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDevicesRequest extends TeaModel {
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
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
