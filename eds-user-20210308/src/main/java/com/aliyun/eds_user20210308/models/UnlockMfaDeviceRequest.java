// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockMfaDeviceRequest extends TeaModel {
    /**
     * <p>The serial number of the virtual MFA device, which is a unique identifier.</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static UnlockMfaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockMfaDeviceRequest self = new UnlockMfaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnlockMfaDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
