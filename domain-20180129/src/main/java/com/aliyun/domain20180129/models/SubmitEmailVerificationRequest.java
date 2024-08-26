// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitEmailVerificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SendIfExist")
    public Boolean sendIfExist;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SubmitEmailVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEmailVerificationRequest self = new SubmitEmailVerificationRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEmailVerificationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SubmitEmailVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SubmitEmailVerificationRequest setSendIfExist(Boolean sendIfExist) {
        this.sendIfExist = sendIfExist;
        return this;
    }
    public Boolean getSendIfExist() {
        return this.sendIfExist;
    }

    public SubmitEmailVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
