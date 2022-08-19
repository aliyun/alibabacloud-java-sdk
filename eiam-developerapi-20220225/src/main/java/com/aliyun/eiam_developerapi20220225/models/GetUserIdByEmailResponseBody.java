// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByEmailResponseBody extends TeaModel {
    @NameInMap("userId")
    public String userId;

    public static GetUserIdByEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByEmailResponseBody self = new GetUserIdByEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserIdByEmailResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
