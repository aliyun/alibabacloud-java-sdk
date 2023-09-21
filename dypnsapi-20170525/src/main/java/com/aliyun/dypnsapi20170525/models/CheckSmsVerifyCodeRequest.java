// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CheckSmsVerifyCodeRequest extends TeaModel {
    @NameInMap("CaseAuthPolicy")
    public Long caseAuthPolicy;

    @NameInMap("CountryCode")
    public String countryCode;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SchemeName")
    public String schemeName;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static CheckSmsVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsVerifyCodeRequest self = new CheckSmsVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public CheckSmsVerifyCodeRequest setCaseAuthPolicy(Long caseAuthPolicy) {
        this.caseAuthPolicy = caseAuthPolicy;
        return this;
    }
    public Long getCaseAuthPolicy() {
        return this.caseAuthPolicy;
    }

    public CheckSmsVerifyCodeRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CheckSmsVerifyCodeRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public CheckSmsVerifyCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckSmsVerifyCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CheckSmsVerifyCodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckSmsVerifyCodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckSmsVerifyCodeRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public CheckSmsVerifyCodeRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
