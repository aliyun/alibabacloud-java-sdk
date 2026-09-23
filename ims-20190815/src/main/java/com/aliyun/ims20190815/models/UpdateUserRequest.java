// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The new comments.</p>
     * <p>The comments must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a cloud computing engineer.</p>
     */
    @NameInMap("NewComments")
    public String newComments;

    /**
     * <p>The new display name of the Resource Access Management (RAM) user.</p>
     * <p>The name must be 1 to 24 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>The new email address of the Resource Access Management (RAM) user.</p>
     * <blockquote>
     * <p>This parameter is applicable only to China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
     */
    @NameInMap("NewEmail")
    public String newEmail;

    /**
     * <p>The new mobile phone number of the Resource Access Management (RAM) user.</p>
     * <p>Format: area code-phone number.</p>
     * <blockquote>
     * <p>This parameter is applicable only to China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86-1868888****</p>
     */
    @NameInMap("NewMobilePhone")
    public String newMobilePhone;

    /**
     * <p>The new logon name of the Resource Access Management (RAM) user.</p>
     * <p>The format is <code>&lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code>, where <code>&lt;username&gt;</code> is the RAM username and <code>&lt;AccountAlias&gt;.onaliyun.com</code> is the default domain name.</p>
     * <p>The <code>UserPrincipalName</code> must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The <code>&lt;username&gt;</code> must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:new@example.onaliyun.com">new@example.onaliyun.com</a></p>
     */
    @NameInMap("NewUserPrincipalName")
    public String newUserPrincipalName;

    /**
     * <p>The ID of the specified Resource Access Management (RAM) user.</p>
     * <blockquote>
     * <p>You must specify either the <code>UserPrincipalName</code> or <code>UserId</code> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20732900249392****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The logon name of the specified Resource Access Management (RAM) user.</p>
     * <blockquote>
     * <p>You must specify either the <code>UserPrincipalName</code> or <code>UserId</code> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setNewComments(String newComments) {
        this.newComments = newComments;
        return this;
    }
    public String getNewComments() {
        return this.newComments;
    }

    public UpdateUserRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateUserRequest setNewEmail(String newEmail) {
        this.newEmail = newEmail;
        return this;
    }
    public String getNewEmail() {
        return this.newEmail;
    }

    public UpdateUserRequest setNewMobilePhone(String newMobilePhone) {
        this.newMobilePhone = newMobilePhone;
        return this;
    }
    public String getNewMobilePhone() {
        return this.newMobilePhone;
    }

    public UpdateUserRequest setNewUserPrincipalName(String newUserPrincipalName) {
        this.newUserPrincipalName = newUserPrincipalName;
        return this;
    }
    public String getNewUserPrincipalName() {
        return this.newUserPrincipalName;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
