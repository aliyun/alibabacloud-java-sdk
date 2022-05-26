// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class RegisterInternalAccountForBucRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Email")
    public String email;

    @NameInMap("IsEmailConfirmed")
    public Boolean isEmailConfirmed;

    @NameInMap("IsMobileConfirmed")
    public Boolean isMobileConfirmed;

    @NameInMap("IsMobileLogin")
    public Boolean isMobileLogin;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("NationalityCode")
    public String nationalityCode;

    @NameInMap("PlainPassword")
    public String plainPassword;

    @NameInMap("PreferredLanguage")
    public String preferredLanguage;

    @NameInMap("accountTypeCode")
    public String accountTypeCode;

    public static RegisterInternalAccountForBucRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterInternalAccountForBucRequest self = new RegisterInternalAccountForBucRequest();
        return TeaModel.build(map, self);
    }

    public RegisterInternalAccountForBucRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public RegisterInternalAccountForBucRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public RegisterInternalAccountForBucRequest setIsEmailConfirmed(Boolean isEmailConfirmed) {
        this.isEmailConfirmed = isEmailConfirmed;
        return this;
    }
    public Boolean getIsEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    public RegisterInternalAccountForBucRequest setIsMobileConfirmed(Boolean isMobileConfirmed) {
        this.isMobileConfirmed = isMobileConfirmed;
        return this;
    }
    public Boolean getIsMobileConfirmed() {
        return this.isMobileConfirmed;
    }

    public RegisterInternalAccountForBucRequest setIsMobileLogin(Boolean isMobileLogin) {
        this.isMobileLogin = isMobileLogin;
        return this;
    }
    public Boolean getIsMobileLogin() {
        return this.isMobileLogin;
    }

    public RegisterInternalAccountForBucRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public RegisterInternalAccountForBucRequest setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
        return this;
    }
    public String getNationalityCode() {
        return this.nationalityCode;
    }

    public RegisterInternalAccountForBucRequest setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
        return this;
    }
    public String getPlainPassword() {
        return this.plainPassword;
    }

    public RegisterInternalAccountForBucRequest setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }
    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public RegisterInternalAccountForBucRequest setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
        return this;
    }
    public String getAccountTypeCode() {
        return this.accountTypeCode;
    }

}
