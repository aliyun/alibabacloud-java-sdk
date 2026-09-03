// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class LockVirtualMFADeviceRequest extends TeaModel {
    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The serial number of the virtual MFA device, which is also its unique identifier. You can call <a href="~~DescribeVirtualMFADevices~~">DescribeVirtualMFADevices</a> to query the serial number of the virtual MFA device bound to an AD account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a25f297f-f2e1-4a44-bbf1-5f48a6e5****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static LockVirtualMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        LockVirtualMFADeviceRequest self = new LockVirtualMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public LockVirtualMFADeviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LockVirtualMFADeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
