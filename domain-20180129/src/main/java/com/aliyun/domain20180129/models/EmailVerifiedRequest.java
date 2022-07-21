// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class EmailVerifiedRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static EmailVerifiedRequest build(java.util.Map<String, ?> map) throws Exception {
        EmailVerifiedRequest self = new EmailVerifiedRequest();
        return TeaModel.build(map, self);
    }

    public EmailVerifiedRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public EmailVerifiedRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public EmailVerifiedRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
