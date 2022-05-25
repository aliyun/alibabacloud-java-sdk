// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByExternalIdResponseBody extends TeaModel {
    // 账户ID
    @NameInMap("userId")
    public String userId;

    public static GetUserIdByExternalIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByExternalIdResponseBody self = new GetUserIdByExternalIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserIdByExternalIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
