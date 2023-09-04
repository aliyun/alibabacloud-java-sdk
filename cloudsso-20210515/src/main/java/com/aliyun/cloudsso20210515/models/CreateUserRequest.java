// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The description of the user.</p>
     * <br>
     * <p>The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The display name of the user.</p>
     * <br>
     * <p>The name can be up to 256 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the user. The email address must be unique within the directory.</p>
     * <br>
     * <p>The email address can be up to 128 characters in length.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The first name of the user.</p>
     * <br>
     * <p>The name can be up to 64 characters in length.</p>
     */
    @NameInMap("FirstName")
    public String firstName;

    /**
     * <p>The last name of the user.</p>
     * <br>
     * <p>The name can be up to 64 characters in length.</p>
     */
    @NameInMap("LastName")
    public String lastName;

    /**
     * <p>The status of the user. Valid values:</p>
     * <br>
     * <p>*   Enabled: The logon of the user is enabled. This is the default value.</p>
     * <p>*   Disabled: The logon of the user is disabled.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the user. The name must be unique within the directory. The name cannot be changed.</p>
     * <br>
     * <p>The name can contain numbers, letters, and the following special characters: `@_-.`</p>
     * <br>
     * <p>The name can be up to 64 characters in length.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public CreateUserRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getLastName() {
        return this.lastName;
    }

    public CreateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
