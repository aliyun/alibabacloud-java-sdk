// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class LockVirtualMFADeviceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SerialNumber")
    @Validation(required = true)
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
