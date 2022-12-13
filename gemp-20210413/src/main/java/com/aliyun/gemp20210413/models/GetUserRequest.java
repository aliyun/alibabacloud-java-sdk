// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("userId")
    public Long userId;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
