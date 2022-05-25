// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    // 账户ID
    @NameInMap("userId")
    public String userId;

    public static CreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponseBody self = new CreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
