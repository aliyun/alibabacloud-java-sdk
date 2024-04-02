// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendVerifyCodeToPhoneRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static SendVerifyCodeToPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeToPhoneRequest self = new SendVerifyCodeToPhoneRequest();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeToPhoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SendVerifyCodeToPhoneRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SendVerifyCodeToPhoneRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
