// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByPhoneNumberResponseBody extends TeaModel {
    @NameInMap("userId")
    public String userId;

    public static GetUserIdByPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByPhoneNumberResponseBody self = new GetUserIdByPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserIdByPhoneNumberResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
