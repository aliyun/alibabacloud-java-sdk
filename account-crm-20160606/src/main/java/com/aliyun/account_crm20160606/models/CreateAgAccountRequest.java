// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    @NameInMap("LoginEmail")
    public String loginEmail;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("NationCode")
    public String nationCode;

    @NameInMap("Own")
    public String own;

    @NameInMap("SecurityMobile")
    public String securityMobile;

    public static CreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountRequest self = new CreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountRequest setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
        return this;
    }
    public String getLoginEmail() {
        return this.loginEmail;
    }

    public CreateAgAccountRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public CreateAgAccountRequest setNationCode(String nationCode) {
        this.nationCode = nationCode;
        return this;
    }
    public String getNationCode() {
        return this.nationCode;
    }

    public CreateAgAccountRequest setOwn(String own) {
        this.own = own;
        return this;
    }
    public String getOwn() {
        return this.own;
    }

    public CreateAgAccountRequest setSecurityMobile(String securityMobile) {
        this.securityMobile = securityMobile;
        return this;
    }
    public String getSecurityMobile() {
        return this.securityMobile;
    }

}
