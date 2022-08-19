// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByPhoneNumberRequest extends TeaModel {
    @NameInMap("phoneNumber")
    public String phoneNumber;

    public static GetUserIdByPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByPhoneNumberRequest self = new GetUserIdByPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByPhoneNumberRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
