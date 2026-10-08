// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitEmailVerificationRequest extends TeaModel {
    /**
     * <p>The mailbox that requires verification. Separate multiple mailboxes with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default Value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to resend the verification email if it already exists. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Resend the verification email.</li>
     * <li><strong>false</strong>: Do not resend the verification email.</li>
     * </ul>
     * <p>Default Value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SendIfExist")
    public Boolean sendIfExist;

    /**
     * <p>The user IP address. You can set it to 127.0.0.1.</p>
     * 
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
