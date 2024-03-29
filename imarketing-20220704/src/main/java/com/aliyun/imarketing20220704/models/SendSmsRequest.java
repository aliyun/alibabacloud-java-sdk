// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class SendSmsRequest extends TeaModel {
    @NameInMap("NowStamp")
    public Long nowStamp;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("SignKey")
    public String signKey;

    public static SendSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsRequest self = new SendSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsRequest setNowStamp(Long nowStamp) {
        this.nowStamp = nowStamp;
        return this;
    }
    public Long getNowStamp() {
        return this.nowStamp;
    }

    public SendSmsRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendSmsRequest setSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }
    public String getSignKey() {
        return this.signKey;
    }

}
