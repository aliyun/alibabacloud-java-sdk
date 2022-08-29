// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetUserDetailRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static GetUserDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailRequest self = new GetUserDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
