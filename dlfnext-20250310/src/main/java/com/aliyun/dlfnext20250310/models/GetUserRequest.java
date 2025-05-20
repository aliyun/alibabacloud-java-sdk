// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:user/user_name</p>
     */
    @NameInMap("userPrincipal")
    public String userPrincipal;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setUserPrincipal(String userPrincipal) {
        this.userPrincipal = userPrincipal;
        return this;
    }
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

}
