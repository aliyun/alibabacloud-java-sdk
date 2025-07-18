// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpLoginConfig extends TeaModel {
    @NameInMap("MobileLoginType")
    public String mobileLoginType;

    @NameInMap("MobileMfaTypes")
    public String mobileMfaTypes;

    @NameInMap("PcLoginType")
    public String pcLoginType;

    @NameInMap("PcMfaTypes")
    public String pcMfaTypes;

    @NameInMap("TotpCorpVerifyAesKey")
    public String totpCorpVerifyAesKey;

    @NameInMap("TotpCorpVerifyToken")
    public String totpCorpVerifyToken;

    @NameInMap("TotpCorpVerifyUrl")
    public String totpCorpVerifyUrl;

    public static IdpLoginConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpLoginConfig self = new IdpLoginConfig();
        return TeaModel.build(map, self);
    }

    public IdpLoginConfig setMobileLoginType(String mobileLoginType) {
        this.mobileLoginType = mobileLoginType;
        return this;
    }
    public String getMobileLoginType() {
        return this.mobileLoginType;
    }

    public IdpLoginConfig setMobileMfaTypes(String mobileMfaTypes) {
        this.mobileMfaTypes = mobileMfaTypes;
        return this;
    }
    public String getMobileMfaTypes() {
        return this.mobileMfaTypes;
    }

    public IdpLoginConfig setPcLoginType(String pcLoginType) {
        this.pcLoginType = pcLoginType;
        return this;
    }
    public String getPcLoginType() {
        return this.pcLoginType;
    }

    public IdpLoginConfig setPcMfaTypes(String pcMfaTypes) {
        this.pcMfaTypes = pcMfaTypes;
        return this;
    }
    public String getPcMfaTypes() {
        return this.pcMfaTypes;
    }

    public IdpLoginConfig setTotpCorpVerifyAesKey(String totpCorpVerifyAesKey) {
        this.totpCorpVerifyAesKey = totpCorpVerifyAesKey;
        return this;
    }
    public String getTotpCorpVerifyAesKey() {
        return this.totpCorpVerifyAesKey;
    }

    public IdpLoginConfig setTotpCorpVerifyToken(String totpCorpVerifyToken) {
        this.totpCorpVerifyToken = totpCorpVerifyToken;
        return this;
    }
    public String getTotpCorpVerifyToken() {
        return this.totpCorpVerifyToken;
    }

    public IdpLoginConfig setTotpCorpVerifyUrl(String totpCorpVerifyUrl) {
        this.totpCorpVerifyUrl = totpCorpVerifyUrl;
        return this;
    }
    public String getTotpCorpVerifyUrl() {
        return this.totpCorpVerifyUrl;
    }

}
