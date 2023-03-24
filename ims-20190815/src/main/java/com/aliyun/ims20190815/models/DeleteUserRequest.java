// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    /**
     * <p>The ID of the RAM user.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: `UserPrincipalName` and `UserId`.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The logon name of the RAM user.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: `UserPrincipalName` and `UserId`.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteUserRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
