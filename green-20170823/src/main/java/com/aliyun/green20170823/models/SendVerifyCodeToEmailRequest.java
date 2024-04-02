// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendVerifyCodeToEmailRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static SendVerifyCodeToEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeToEmailRequest self = new SendVerifyCodeToEmailRequest();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeToEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SendVerifyCodeToEmailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SendVerifyCodeToEmailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
