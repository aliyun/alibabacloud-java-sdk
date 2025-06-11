// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The description of the user.</p>
     * <p>The description can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a user.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The display name of the user.</p>
     * <p>The display name can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the user. The email address must be unique within the directory.</p>
     * <p>The email address can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The first name of the user.</p>
     * <p>The first name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("FirstName")
    public String firstName;

    /**
     * <p>The last name of the user.</p>
     * <p>The last name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Lee</p>
     */
    @NameInMap("LastName")
    public String lastName;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li>Enabled (default)</li>
     * <li>Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<CreateUserRequestTags> tags;

    /**
     * <p>The username of the user. The username must be unique within the directory. and cannot be changed.</p>
     * <p>The username can contain digits, letters, and the following special characters: <code>@_-.</code></p>
     * <p>The username can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
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

    public CreateUserRequest setTags(java.util.List<CreateUserRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateUserRequestTags> getTags() {
        return this.tags;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class CreateUserRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateUserRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateUserRequestTags self = new CreateUserRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateUserRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateUserRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
