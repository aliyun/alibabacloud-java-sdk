// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockMfaDeviceRequest extends TeaModel {
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static LockMfaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        LockMfaDeviceRequest self = new LockMfaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public LockMfaDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
