// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifySmsCodeRequest extends TeaModel {
    @NameInMap("SmsCode")
    public String smsCode;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("SmsToken")
    public String smsToken;

    public static VerifySmsCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySmsCodeRequest self = new VerifySmsCodeRequest();
        return TeaModel.build(map, self);
    }

    public VerifySmsCodeRequest setSmsCode(String smsCode) {
        this.smsCode = smsCode;
        return this;
    }
    public String getSmsCode() {
        return this.smsCode;
    }

    public VerifySmsCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public VerifySmsCodeRequest setSmsToken(String smsToken) {
        this.smsToken = smsToken;
        return this;
    }
    public String getSmsToken() {
        return this.smsToken;
    }

}
