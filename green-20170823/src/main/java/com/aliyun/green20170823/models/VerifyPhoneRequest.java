// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyPhoneRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static VerifyPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneRequest self = new VerifyPhoneRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public VerifyPhoneRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public VerifyPhoneRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public VerifyPhoneRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
