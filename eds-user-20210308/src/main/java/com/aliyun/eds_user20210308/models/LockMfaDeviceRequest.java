// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockMfaDeviceRequest extends TeaModel {
    /**
     * <p>The address of the AD office network.</p>
     * 
     * <strong>example:</strong>
     * <p>upower.vip</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The serial number of the bound virtual MFA device. The user must first complete the MFA binding in the client authentication flow. You can call <a href="~~DescribeMfaDevices~~">DescribeMfaDevices</a> to query the serial number of the bound device.</p>
     * 
     * <strong>example:</strong>
     * <p>dc856334-446b-4035-bfbc-18af261e****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static LockMfaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        LockMfaDeviceRequest self = new LockMfaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public LockMfaDeviceRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public LockMfaDeviceRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public LockMfaDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
