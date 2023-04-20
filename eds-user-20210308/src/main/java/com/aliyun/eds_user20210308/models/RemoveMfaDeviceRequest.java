// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveMfaDeviceRequest extends TeaModel {
    /**
     * <p>The serial number of the virtual MFA device, which is a unique identifier.</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static RemoveMfaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMfaDeviceRequest self = new RemoveMfaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMfaDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
