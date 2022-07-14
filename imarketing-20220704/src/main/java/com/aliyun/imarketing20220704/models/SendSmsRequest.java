// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class SendSmsRequest extends TeaModel {
    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    public static SendSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsRequest self = new SendSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
