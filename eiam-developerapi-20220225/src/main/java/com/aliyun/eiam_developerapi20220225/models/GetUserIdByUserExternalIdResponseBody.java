// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUserExternalIdResponseBody extends TeaModel {
    /**
     * <p>The account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetUserIdByUserExternalIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUserExternalIdResponseBody self = new GetUserIdByUserExternalIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUserExternalIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
