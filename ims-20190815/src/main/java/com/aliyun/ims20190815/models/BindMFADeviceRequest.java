// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class BindMFADeviceRequest extends TeaModel {
    /**
     * <p>The first verification code.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/186179.html">CreateVirtualMFADevice</a> operation to create an MFA device and generate a key (value of <code>Base32StringSeed</code>). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AuthenticationCode1")
    public String authenticationCode1;

    /**
     * <p>The second verification code.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/186179.html">CreateVirtualMFADevice</a> operation to create an MFA device and generate a key (value of <code>Base32StringSeed</code>). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>654321</p>
     */
    @NameInMap("AuthenticationCode2")
    public String authenticationCode2;

    /**
     * <p>The serial number of the MFA device.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/186179.html">CreateVirtualMFADevice</a> operation to obtain the serial number of the MFA device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::177242285274****:mfa/device001</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The logon name of the RAM user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
