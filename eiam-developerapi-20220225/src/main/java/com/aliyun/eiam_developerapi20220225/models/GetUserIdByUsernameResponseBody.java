// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUsernameResponseBody extends TeaModel {
    @NameInMap("userId")
    public String userId;

    public static GetUserIdByUsernameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUsernameResponseBody self = new GetUserIdByUsernameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUsernameResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
