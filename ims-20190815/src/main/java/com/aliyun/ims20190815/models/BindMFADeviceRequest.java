// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class BindMFADeviceRequest extends TeaModel {
    @NameInMap("AuthenticationCode1")
    public String authenticationCode1;

    @NameInMap("AuthenticationCode2")
    public String authenticationCode2;

    @NameInMap("SerialNumber")
    public String serialNumber;

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
