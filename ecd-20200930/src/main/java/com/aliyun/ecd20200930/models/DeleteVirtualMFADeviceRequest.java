// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    public static DeleteVirtualMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualMFADeviceRequest self = new DeleteVirtualMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualMFADeviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVirtualMFADeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
