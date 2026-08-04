// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    @NameInMap("LoginEmail")
    public String loginEmail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("NationCode")
    public String nationCode;

    @NameInMap("Own")
    public String own;

    @NameInMap("RealParentPk")
    public String realParentPk;

    @NameInMap("SecurityMobile")
    public String securityMobile;

    @NameInMap("ShowNickName")
    public String showNickName;

    @NameInMap("SiteNick")
    public String siteNick;

    @NameInMap("srcAccountInfo")
    public String srcAccountInfo;

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

    public CreateAgAccountRequest setRealParentPk(String realParentPk) {
        this.realParentPk = realParentPk;
        return this;
    }
    public String getRealParentPk() {
        return this.realParentPk;
    }

    public CreateAgAccountRequest setSecurityMobile(String securityMobile) {
        this.securityMobile = securityMobile;
        return this;
    }
    public String getSecurityMobile() {
        return this.securityMobile;
    }

    public CreateAgAccountRequest setShowNickName(String showNickName) {
        this.showNickName = showNickName;
        return this;
    }
    public String getShowNickName() {
        return this.showNickName;
    }

    public CreateAgAccountRequest setSiteNick(String siteNick) {
        this.siteNick = siteNick;
        return this;
    }
    public String getSiteNick() {
        return this.siteNick;
    }

    public CreateAgAccountRequest setSrcAccountInfo(String srcAccountInfo) {
        this.srcAccountInfo = srcAccountInfo;
        return this;
    }
    public String getSrcAccountInfo() {
        return this.srcAccountInfo;
    }

}
