// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetVerificationInfoRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("MobilePhone")
    public String mobilePhone;

    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("VerifyType")
    public String verifyType;

    public static SetVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVerificationInfoRequest self = new SetVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetVerificationInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SetVerificationInfoRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public SetVerificationInfoRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public SetVerificationInfoRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
