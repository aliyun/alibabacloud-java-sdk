// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("NewUserPrincipalName")
    public String newUserPrincipalName;

    @NameInMap("NewDisplayName")
    public String newDisplayName;

    @NameInMap("NewMobilePhone")
    public String newMobilePhone;

    @NameInMap("NewEmail")
    public String newEmail;

    @NameInMap("NewComments")
    public String newComments;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserRequest setNewUserPrincipalName(String newUserPrincipalName) {
        this.newUserPrincipalName = newUserPrincipalName;
        return this;
    }
    public String getNewUserPrincipalName() {
        return this.newUserPrincipalName;
    }

    public UpdateUserRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateUserRequest setNewMobilePhone(String newMobilePhone) {
        this.newMobilePhone = newMobilePhone;
        return this;
    }
    public String getNewMobilePhone() {
        return this.newMobilePhone;
    }

    public UpdateUserRequest setNewEmail(String newEmail) {
        this.newEmail = newEmail;
        return this;
    }
    public String getNewEmail() {
        return this.newEmail;
    }

    public UpdateUserRequest setNewComments(String newComments) {
        this.newComments = newComments;
        return this;
    }
    public String getNewComments() {
        return this.newComments;
    }

}
