// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeEapDeviceResourceAllocationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DeviceCount")
    public Integer deviceCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEapDeviceResourceAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEapDeviceResourceAllocationRequest self = new DescribeEapDeviceResourceAllocationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEapDeviceResourceAllocationRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeEapDeviceResourceAllocationRequest setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

    public DescribeEapDeviceResourceAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
