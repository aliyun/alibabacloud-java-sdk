// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class EmailVerifiedRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
