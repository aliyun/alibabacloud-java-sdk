// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyEmailRequest extends TeaModel {
    /**
     * <p>Language of the error message returned by the API. Valid values:</p>
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
     * <p>Token code included in the email verification link.</p>
     * <p>After the verification email is sent successfully, you can log on to the mailbox to be verified and view the token code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0b32247496409441e9e179ea7c2e0****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>User IP address. You can set it to 127.0.0.1.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static VerifyEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyEmailRequest self = new VerifyEmailRequest();
        return TeaModel.build(map, self);
    }

    public VerifyEmailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public VerifyEmailRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public VerifyEmailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
