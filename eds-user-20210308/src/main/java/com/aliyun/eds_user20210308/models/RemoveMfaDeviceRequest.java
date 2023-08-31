// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveMfaDeviceRequest extends TeaModel {
    @NameInMap("AdDomain")
    public String adDomain;

    @NameInMap("SerialNumber")
    public String serialNumber;

    public static RemoveMfaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMfaDeviceRequest self = new RemoveMfaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMfaDeviceRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public RemoveMfaDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
