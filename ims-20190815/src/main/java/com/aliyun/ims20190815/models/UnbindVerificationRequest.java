// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindVerificationRequest extends TeaModel {
    /**
     * <p>The email address.</p>
     * <blockquote>
     * <p> If you set <code>VerifyType</code> to <code>email</code>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile phone number.</p>
     * <blockquote>
     * <p> If you set <code>VerifyType</code> to <code>sms</code>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86-13900001234</p>
     */
    @NameInMap("MobilePhone")
    public String mobilePhone;

    /**
     * <p>The logon name of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    /**
     * <p>The multi-factor authentication (MFA) method. Valid values:</p>
     * <ul>
     * <li>sms: mobile phone.</li>
     * <li>email: email.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static UnbindVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindVerificationRequest self = new UnbindVerificationRequest();
        return TeaModel.build(map, self);
    }

    public UnbindVerificationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UnbindVerificationRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public UnbindVerificationRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public UnbindVerificationRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
