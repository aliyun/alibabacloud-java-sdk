// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUsernameRequest extends TeaModel {
    /**
     * <p>The username of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>username_001</p>
     */
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
