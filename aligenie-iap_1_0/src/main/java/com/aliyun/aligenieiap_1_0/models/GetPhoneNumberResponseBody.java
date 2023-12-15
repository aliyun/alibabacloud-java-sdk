// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberResponseBody extends TeaModel {
    @NameInMap("phoneNumber")
    public String phoneNumber;

    public static GetPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberResponseBody self = new GetPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberResponseBody setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
