// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class BindMFADeviceRequest extends TeaModel {
    /**
     * <p>The first verification code.</p>
     * <br>
     * <p>>  You can call the [CreateVirtualMFADevice](~~186179~~) operation to create an MFA device and generate a key (value of `Base32StringSeed`). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.</p>
     */
    @NameInMap("AuthenticationCode1")
    public String authenticationCode1;

    /**
     * <p>The second verification code.</p>
     * <br>
     * <p>>  You can call the [CreateVirtualMFADevice](~~186179~~) operation to create an MFA device and generate a key (value of `Base32StringSeed`). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.</p>
     */
    @NameInMap("AuthenticationCode2")
    public String authenticationCode2;

    /**
     * <p>The serial number of the MFA device.</p>
     * <br>
     * <p>>  You can call the [CreateVirtualMFADevice](~~186179~~) operation to obtain the serial number of the MFA device.</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static BindMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMFADeviceRequest self = new BindMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindMFADeviceRequest setAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
        return this;
    }
    public String getAuthenticationCode1() {
        return this.authenticationCode1;
    }

    public BindMFADeviceRequest setAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
        return this;
    }
    public String getAuthenticationCode2() {
        return this.authenticationCode2;
    }

    public BindMFADeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public BindMFADeviceRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
