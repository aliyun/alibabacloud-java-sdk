// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifySmsCodeRequest extends TeaModel {
    /**
     * <p>The phone number, which is used to receive SMS verification codes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1321111****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The SMS verification code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("SmsCode")
    public String smsCode;

    /**
     * <p>The text message verification code. After you successfully call the corresponding API operation to send the SMS verification code, the end users receive the SMS verification code. SmsToken is returned by the SDK for SMS verification for you to verify the text message verification code. For an Android client, sendVerifyCode is called to send the verification code. For an iOS client, sendVerifyCodeWithTimeout is called to send the verification code. For more information, see <a href="https://help.aliyun.com/document_detail/400434.html">Overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sddsbvdbvjd****</p>
     */
    @NameInMap("SmsToken")
    public String smsToken;

    public static VerifySmsCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySmsCodeRequest self = new VerifySmsCodeRequest();
        return TeaModel.build(map, self);
    }

    public VerifySmsCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public VerifySmsCodeRequest setSmsCode(String smsCode) {
        this.smsCode = smsCode;
        return this;
    }
    public String getSmsCode() {
        return this.smsCode;
    }

    public VerifySmsCodeRequest setSmsToken(String smsToken) {
        this.smsToken = smsToken;
        return this;
    }
    public String getSmsToken() {
        return this.smsToken;
    }

}
