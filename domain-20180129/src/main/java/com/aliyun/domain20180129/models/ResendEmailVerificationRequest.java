// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ResendEmailVerificationRequest extends TeaModel {
    /**
     * <p>Mailboxes for which to resend the verification email. Separate multiple mailboxes with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test1@aliyun.com">test1@aliyun.com</a>,<a href="mailto:test2@aliyun.com">test2@aliyun.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address. You can set it to 127.0.0.1.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ResendEmailVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailVerificationRequest self = new ResendEmailVerificationRequest();
        return TeaModel.build(map, self);
    }

    public ResendEmailVerificationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ResendEmailVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResendEmailVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
