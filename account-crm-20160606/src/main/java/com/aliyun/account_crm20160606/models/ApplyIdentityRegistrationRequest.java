// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ApplyIdentityRegistrationRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("CustomerId")
    public String customerId;

    @NameInMap("DocBackPic")
    public String docBackPic;

    @NameInMap("DocFrontPic")
    public String docFrontPic;

    @NameInMap("DocNum")
    public String docNum;

    @NameInMap("DocType")
    public String docType;

    @NameInMap("Email")
    public String email;

    @NameInMap("FullName")
    public String fullName;

    @NameInMap("RegisteredAddress")
    public String registeredAddress;

    @NameInMap("RegisteredCountry")
    public String registeredCountry;

    @NameInMap("RegisteredNum")
    public String registeredNum;

    @NameInMap("Tel")
    public String tel;

    public static ApplyIdentityRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIdentityRegistrationRequest self = new ApplyIdentityRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIdentityRegistrationRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public ApplyIdentityRegistrationRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ApplyIdentityRegistrationRequest setDocBackPic(String docBackPic) {
        this.docBackPic = docBackPic;
        return this;
    }
    public String getDocBackPic() {
        return this.docBackPic;
    }

    public ApplyIdentityRegistrationRequest setDocFrontPic(String docFrontPic) {
        this.docFrontPic = docFrontPic;
        return this;
    }
    public String getDocFrontPic() {
        return this.docFrontPic;
    }

    public ApplyIdentityRegistrationRequest setDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }
    public String getDocNum() {
        return this.docNum;
    }

    public ApplyIdentityRegistrationRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ApplyIdentityRegistrationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ApplyIdentityRegistrationRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public ApplyIdentityRegistrationRequest setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
        return this;
    }
    public String getRegisteredAddress() {
        return this.registeredAddress;
    }

    public ApplyIdentityRegistrationRequest setRegisteredCountry(String registeredCountry) {
        this.registeredCountry = registeredCountry;
        return this;
    }
    public String getRegisteredCountry() {
        return this.registeredCountry;
    }

    public ApplyIdentityRegistrationRequest setRegisteredNum(String registeredNum) {
        this.registeredNum = registeredNum;
        return this;
    }
    public String getRegisteredNum() {
        return this.registeredNum;
    }

    public ApplyIdentityRegistrationRequest setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

}
