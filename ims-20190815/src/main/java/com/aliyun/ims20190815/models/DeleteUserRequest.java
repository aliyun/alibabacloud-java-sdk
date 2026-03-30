// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    /**
     * <p>The ID of the RAM user.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The logon name of the RAM user.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
