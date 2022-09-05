// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class VerifySmsCodeRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("NowStamp")
    public Long nowStamp;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("SignKey")
    public String signKey;

    public static VerifySmsCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySmsCodeRequest self = new VerifySmsCodeRequest();
        return TeaModel.build(map, self);
    }

    public VerifySmsCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifySmsCodeRequest setNowStamp(Long nowStamp) {
        this.nowStamp = nowStamp;
        return this;
    }
    public Long getNowStamp() {
        return this.nowStamp;
    }

    public VerifySmsCodeRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public VerifySmsCodeRequest setSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }
    public String getSignKey() {
        return this.signKey;
    }

}
