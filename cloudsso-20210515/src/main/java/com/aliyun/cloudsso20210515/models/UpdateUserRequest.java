// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("NewDisplayName")
    public String newDisplayName;

    @NameInMap("NewEmail")
    public String newEmail;

    @NameInMap("NewFirstName")
    public String newFirstName;

    @NameInMap("NewLastName")
    public String newLastName;

    @NameInMap("UserId")
    public String userId;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateUserRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
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

    public UpdateUserRequest setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
        return this;
    }
    public String getNewFirstName() {
        return this.newFirstName;
    }

    public UpdateUserRequest setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }
    public String getNewLastName() {
        return this.newLastName;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
