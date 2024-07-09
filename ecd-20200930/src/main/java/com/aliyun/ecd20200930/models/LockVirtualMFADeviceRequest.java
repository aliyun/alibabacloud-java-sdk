// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class LockVirtualMFADeviceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The serial number of the virtual MFA device, which is a unique identifier.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/206210.html">DescribeVirtualMFADevices</a> operation to query the serial number of the virtual MFA device bound to AD users.</p>
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
