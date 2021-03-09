// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnlockVirtualMFADeviceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SerialNumber")
    @Validation(required = true)
    public String serialNumber;

    public static UnlockVirtualMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockVirtualMFADeviceRequest self = new UnlockVirtualMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnlockVirtualMFADeviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnlockVirtualMFADeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
