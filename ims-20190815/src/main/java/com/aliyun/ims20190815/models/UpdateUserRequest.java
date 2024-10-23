// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The new description of the RAM user.</p>
     * <p>The description must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a cloud computing engineer.</p>
     */
    @NameInMap("NewComments")
    public String newComments;

    /**
     * <p>The new display name of the RAM user.</p>
     * <p>The name must be 1 to 24 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>The new email address of the RAM user.</p>
     * <blockquote>
     * <p>This parameter is valid only on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
     */
    @NameInMap("NewEmail")
    public String newEmail;

    /**
     * <p>The new mobile phone number of the RAM user.</p>
     * <p>Format: \<Country code>-\<Mobile phone number>.</p>
     * <blockquote>
     * <p>This parameter is valid only on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86-1868888****</p>
     */
    @NameInMap("NewMobilePhone")
    public String newMobilePhone;

    /**
     * <p>The new logon name of the RAM user.</p>
     * <p>The name is in the format of <code>&lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code>. <code>&lt;username&gt;</code> indicates the name of the RAM user. <code>&lt;AccountAlias&gt;.onaliyun.com</code> indicates the default domain name.</p>
     * <p>The value of <code>UserPrincipalName</code> must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The value of <code>&lt;username&gt;</code> must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:new@example.onaliyun.com">new@example.onaliyun.com</a></p>
     */
    @NameInMap("NewUserPrincipalName")
    public String newUserPrincipalName;

    /**
     * <p>The ID of the RAM user.</p>
     * <blockquote>
     * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
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
     * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
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
