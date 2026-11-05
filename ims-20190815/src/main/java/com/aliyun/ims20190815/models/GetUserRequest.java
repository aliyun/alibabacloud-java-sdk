// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the Resource Access Management (RAM) user.</p>
     * <blockquote>
     * <p>You must specify exactly one of the following parameters: <code>UserPrincipalName</code>, <code>UserId</code>, and <code>UserAccessKeyId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The ID of the Resource Access Management (RAM) user.</p>
     * <blockquote>
     * <p>You must specify exactly one of the following parameters: <code>UserPrincipalName</code>, <code>UserId</code>, and <code>UserAccessKeyId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The logon Resource Access Management (RAM) user.</p>
     * <p>The format is <code>&lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code>, where <code>&lt;username&gt;</code> is the Resource Access Management (RAM) user and <code>&lt;AccountAlias&gt;.onaliyun.com</code> is the default domain name. </p>
     * <p>The <code>UserPrincipalName</code> must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The <code>&lt;username&gt;</code> must be 1 to 64 characters in length.</p>
     * <blockquote>
     * <p>You must specify exactly one of the following parameters: <code>UserPrincipalName</code>, <code>UserId</code>, and <code>UserAccessKeyId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
