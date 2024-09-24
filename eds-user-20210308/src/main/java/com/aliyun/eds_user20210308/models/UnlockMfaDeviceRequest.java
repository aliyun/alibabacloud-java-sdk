// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockMfaDeviceRequest extends TeaModel {
    /**
     * <p>The domain of the Active Directory (AD) workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>welab.co.id</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <p>The serial number of the virtual MFA device. The serial number is unique for each device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc856334-446b-4035-bfbc-18af261e****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static UnlockMfaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockMfaDeviceRequest self = new UnlockMfaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnlockMfaDeviceRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public UnlockMfaDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
