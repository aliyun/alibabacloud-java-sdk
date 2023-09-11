// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the RAM user.</p>
     * <br>
     * <p>> You must specify only one of the following parameters: `UserPrincipalName`, `UserId`, and `UserAccessKeyId`.</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The ID of the RAM user.</p>
     * <br>
     * <p>> You must specify only one of the following parameters: `UserPrincipalName`, `UserId`, and `UserAccessKeyId`.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The logon name of the RAM user.</p>
     * <br>
     * <p>The name is in the format of `<username>@<AccountAlias>.onaliyun.com`. `<username>` indicates the name of the RAM user. `<AccountAlias>.onaliyun.com` indicates the default domain name.</p>
     * <br>
     * <p>The value of `UserPrincipalName` must be `1 to 128` characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (\_). The value of `<username>` must be `1 to 64` characters in length.</p>
     * <br>
     * <p>> You must specify only one of the following parameters: `UserPrincipalName`, `UserId`, and `UserAccessKeyId`.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
