// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUsernameRequest extends TeaModel {
    @NameInMap("username")
    public String username;

    public static GetUserIdByUsernameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUsernameRequest self = new GetUserIdByUsernameRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUsernameRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
